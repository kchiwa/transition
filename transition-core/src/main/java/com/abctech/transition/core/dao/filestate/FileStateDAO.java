package com.abctech.transition.core.dao.filestate;


import com.abctech.transition.core.dao.DAOLogging;
import com.abctech.transition.core.dao.errorlog.ErrorLogDAO;
import com.abctech.transition.core.dao.errorlog.ErrorLogModel;
import com.abctech.transition.core.enumeration.FileStateStatus;
import com.abctech.transition.core.enumeration.FileType;
import com.abctech.transition.core.memcached.MemcachedTransactionManager;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Service;

import java.sql.*;
import java.util.List;

@Service
public class FileStateDAO {
	
	private static final Logger log = LoggerFactory.getLogger(FileStateDAO.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private ErrorLogDAO errorLogDAO;

    @Autowired
	private MemcachedTransactionManager memcachedTransactionManager;

	public FileStateModel save(FileStateModel fileStateModel) {
		DAOLogging logging = DAOLogging.start();
		FileStateModel result =  null;
		if (fileStateModel.getId()==null) {
			result = add(fileStateModel);
		}
		else {
			result = update(fileStateModel);
		}
		memcachedTransactionManager.delete(FileStateModel.class.getName()+"#"+fileStateModel.getId());
		log.debug(logging.finish("save(" + fileStateModel.getId() + ")", "DB", 1));
		return result;
	}
	
	private FileStateModel add(final FileStateModel fileStateModel) {
		Long result = null;
		if (fileStateModel.getErrorLogModel()!=null) {
			errorLogDAO.save(fileStateModel.getErrorLogModel());
		}
		KeyHolder keyHolder = new GeneratedKeyHolder();
		jdbcTemplate.update(new MyPreparedStatementCreator(fileStateModel), keyHolder);
		result = keyHolder.getKey().longValue();
		fileStateModel.setId(result);
		return fileStateModel;
	}

	/**
	 * @return true when having success deleting element with given id.
	 */
	public boolean deleteById(Long id) {
		DAOLogging logging = DAOLogging.start();
		String sql = "DELETE FROM filestate  WHERE id = ?";
		int result = jdbcTemplate.update(sql, id);
		log.debug(logging.finish("deleteById(" + id + ")", "DB", 1));
		if (result==1) {
            memcachedTransactionManager.delete(FileStateModel.class.getName()+"#"+ id);
            return true;
		}
		return false;
	}

	private FileStateModel update(FileStateModel fileStateModel) {
		Long errorId = null;
		if (fileStateModel.getErrorLogModel()!=null) {
			errorLogDAO.save(fileStateModel.getErrorLogModel());
			errorId = fileStateModel.getErrorLogModel().getId();
		}
        Long parentId = null;
        if(fileStateModel.getParentFileState() != null) {
            parentId = fileStateModel.getParentFileState().getId();
        }
        String filePath = "";
        if (fileStateModel.getFilePath() != null) {
            filePath = fileStateModel.getFilePath();
        }
        Integer fileType = FileType.NO_DEFINE.toNumberValue();
         if (fileStateModel.getFileType() != null) {
                 fileType = fileStateModel.getFileType().toNumberValue();
            }
		String sql = "UPDATE filestate SET clientname = ?, customerformat = ?, createdtime = ?, filename = ?, status = ?, errorlog_id = ?, parent_id = ?, filetype = ?, filepath = ?  WHERE id = ?";
		jdbcTemplate.update(sql,
				fileStateModel.getClientName(),
				fileStateModel.getCustomerFormat(),
				fileStateModel.getCreatedTime().getMillis(),
				fileStateModel.getFileName(),
				fileStateModel.getFileStateStatus().toNumberValue(),
				errorId,
                parentId,
                fileType,
                filePath,
				fileStateModel.getId()
		);
		return fileStateModel;
	}

	public FileStateModel findById(Long id) {
		DAOLogging logging = DAOLogging.start();
		FileStateModel fileStateModel = (FileStateModel) memcachedTransactionManager.get(FileStateModel.class.getName()+"#"+ id);
		if (fileStateModel == null) {
			String sql = "SELECT id, clientname, customerformat, createdtime, filename,filesize , status ,errorlog_id, parent_id, filetype, filepath  FROM  filestate  WHERE id = ?";
			RowMapper<FileStateModel> mapper = new FileStateModelRowMapper();
			fileStateModel = jdbcTemplate.queryForObject(sql, mapper, id);
			if (fileStateModel!=null) {
				memcachedTransactionManager.set(FileStateModel.class.getName()+"#"+id,fileStateModel);
			}
			log.debug(logging.finish("findById(" + id + ")", "DB", 1));
		}
		else {
			log.debug(logging.finish("findById(" + id + ")", "CACHE", 1));
		}
			
		return fileStateModel;
	}

	public List<Long> findByClientName(String clientName) {
		DAOLogging logging = DAOLogging.start();
		String sql = "SELECT id FROM  filestate WHERE clientname = ?";
		List<Long>ids = jdbcTemplate.queryForList(sql, Long.class, clientName);
		log.debug(logging.finish("findByClientName(" + clientName + ")", "DB", ids.size()));
		return ids;
	}

	public List<Long> findByCustomerFormat(String customerFormat) {
		DAOLogging logging = DAOLogging.start();
		String sql = "SELECT id FROM  filestate WHERE customerformat = ? ";
		List<Long>ids = jdbcTemplate.queryForList(sql, Long.class, customerFormat);
		log.debug(logging.finish("findByCustomerFormat(" + customerFormat + ")", "DB", ids.size()));
		return ids;
	}

	private class FileStateModelRowMapper implements RowMapper<FileStateModel> {
		public FileStateModel mapRow(ResultSet rs, int rowNum) throws SQLException {
			FileStateModel fileStateModel = new FileStateModel();
			fileStateModel.setId(rs.getLong("id"));
			fileStateModel.setClientName(rs.getString("clientname"));
			fileStateModel.setCustomerFormat(rs.getString("customerformat"));
			fileStateModel.setCreatedTime(new DateTime(rs.getLong("createdtime")));
			fileStateModel.setFileName(rs.getString("filename"));
            fileStateModel.setFileSize(rs.getLong("filesize"));
			fileStateModel.setFileStateStatus(FileStateStatus.fromNumberValue(rs.getInt("status")));
			Long errorLogId = rs.getLong("errorlog_id");
			if (errorLogId>0) {
				ErrorLogModel errorLogModel = errorLogDAO.findById(errorLogId);
				fileStateModel.setErrorLogModel(errorLogModel);
			}
			else {
				fileStateModel.setErrorLogModel(null);
			}
            Long parentId = rs.getLong("parent_id");
            if (parentId > 0)
            {
                FileStateModel fileState = findById(parentId);
                fileStateModel.setParentFileState(fileState);
            }else {
                fileStateModel.setParentFileState(null);
            }
             fileStateModel.setFileType(FileType.fromNumberValue(rs.getInt("filetype")));
             fileStateModel.setFilePath(rs.getString("filepath"));
			return fileStateModel;
		}
	}

	public Long findLastCreatedTimeByCustomerFormat(String customerFormat) {
		DAOLogging logging = DAOLogging.start();
		String sql = "SELECT id FROM  filestate WHERE customerformat = ? ORDER BY createdtime DESC LIMIT 1 OFFSET 0";
		Long id = jdbcTemplate.queryForLong(sql,customerFormat);
		log.debug(logging.finish("findLastCreatedTime(" + customerFormat + ")", "DB", 1));
		return id;
	}

    public List<FileStateModel> findByCondition(String condition) {
        String sql = " SELECT id, clientname, customerformat, createdtime, filename," +
                "filesize , status ,errorlog_id, parent_id, filetype, filepath  " +
                " FROM  filestate ";
        if(condition != null && !"".equals(condition)) {
            sql = sql + condition;
        }
        RowMapper<FileStateModel> mapper = new FileStateModelRowMapper();
        return jdbcTemplate.query(sql, mapper);
    }

    public int countRowByCondition(String condition) {
        String sql = " SELECT COUNT(id) FROM filestate ";
        if(condition != null && !"".equals(condition)) {
            sql = sql + condition;
        }
        return jdbcTemplate.queryForInt(sql);
    }

	private static class MyPreparedStatementCreator implements PreparedStatementCreator {
		private final FileStateModel fileStateModel;

		public MyPreparedStatementCreator(FileStateModel fileStateModel) {
			this.fileStateModel = fileStateModel;
		}

		public PreparedStatement createPreparedStatement(Connection connection)
		throws SQLException {

			PreparedStatement ps = connection.prepareStatement("INSERT INTO filestate ( clientname, customerformat, createdtime, filename,filesize, status, errorlog_id, parent_id, filetype, filepath ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
			int parameterIndex = 1;
			ps.setString(parameterIndex++, fileStateModel.getClientName());
			ps.setString(parameterIndex++, fileStateModel.getCustomerFormat());
			ps.setLong(parameterIndex++, fileStateModel.getCreatedTime().getMillis());
			ps.setString(parameterIndex++, fileStateModel.getFileName());
            ps.setDouble(parameterIndex++, fileStateModel.getFileSize());
			ps.setInt(parameterIndex++, fileStateModel.getFileStateStatus().toNumberValue());
			if (fileStateModel.getErrorLogModel() != null ) {
				ps.setLong(parameterIndex++, fileStateModel.getErrorLogModel().getId());
			}else {
				ps.setNull(parameterIndex++, java.sql.Types.BIGINT);
			}
            if (fileStateModel.getParentFileState() != null) {
                ps.setLong(parameterIndex++, fileStateModel.getParentFileState().getId());
            }else {
                ps.setNull(parameterIndex++, java.sql.Types.BIGINT);
            }
            if (fileStateModel.getFileType() != null) {
                 ps.setInt(parameterIndex++, fileStateModel.getFileType().toNumberValue());
            } else {
                 ps.setInt(parameterIndex++, FileType.NO_DEFINE.toNumberValue());
            }
            if (fileStateModel.getFilePath() != null) {
                 ps.setString(parameterIndex++, fileStateModel.getFilePath());
            }else {
                 ps.setString(parameterIndex++, "");
            }
			return ps;
		}
	}

}
