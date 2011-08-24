package com.abctech.transition.core.dao.adstate;

import com.abctech.transition.core.dao.DAOLogging;
import com.abctech.transition.core.dao.errorlog.ErrorLogDAO;
import com.abctech.transition.core.dao.filestate.FileStateDAO;
import com.abctech.transition.core.enumeration.AdStateStatus;
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
public class AdStateDAO {
	
	private final Logger log = LoggerFactory.getLogger(AdStateDAO.class);
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private FileStateDAO fileStateDAO;

	@Autowired
	private ErrorLogDAO errorLogDAO;

    @Autowired
	private MemcachedTransactionManager memcachedTransactionManager;

	public AdStateModel save(AdStateModel adState) {
		DAOLogging logging = DAOLogging.start();
		AdStateModel result = null;
		if (adState.getId()==null) {
			result = add(adState);
		}
		else {
			result = update(adState);
		}
		memcachedTransactionManager.delete(AdStateModel.class.getName()+"#"+adState.getId());
		log.debug(logging.finish("save(" + adState.getId() + ")", "DB", 1));
		return result;
	}

	private AdStateModel add(final AdStateModel adState) {
		Long result = null;
		if (adState.getError()!=null) {
			errorLogDAO.save(adState.getError());
		}
		KeyHolder keyHolder = new GeneratedKeyHolder();
		jdbcTemplate.update(new MyPreparedStatementCreator(adState), keyHolder);
		result = keyHolder.getKey().longValue();
		adState.setId(result);
		return adState;
	}

	public boolean deleteById(Long id) {
		DAOLogging logging = DAOLogging.start();
		String sql = "DELETE FROM adstate  WHERE id = ?";
		int result = jdbcTemplate.update(sql, id);
		log.debug(logging.finish("deleteById(" + id + ")", "DB", result));
		if (result == 1) // expecting to delete only one element
		{
			memcachedTransactionManager.delete(AdStateModel.class.getName()+"#"+id);
			return true;
		}
		else {
			return false;
		}
	}

	private AdStateModel update(AdStateModel adState) {
		String sql = "UPDATE  adstate SET filestate_id = ?, zadobjectid = ?, zclientid = ?, shahash = ?, modifiedtime = ?, createdtime = ?, status = ?, adexternalref = ?, errorlog_id = ? WHERE id = ?";

		Long errorLogid = null;
		if (adState.getError() != null ) {
			errorLogDAO.save(adState.getError());
			errorLogid = adState.getError().getId();
		}

		int adStatus = adState.getAdStateStatus().toNumberValue();

		jdbcTemplate.update(sql,
				adState.getFileStateModel().getId(),
				adState.getZadObjectId(),
				adState.getzClientId(),
				adState.getShaHash(),
				new DateTime().getMillis(),
				adState.getCreatedTime().getMillis(),
				adStatus,
				adState.getAdExternalRef(),
				errorLogid,
				adState.getId()
		);
		return adState;
	}

	public AdStateModel findById(Long id) {
		DAOLogging logging = DAOLogging.start();
		AdStateModel adStateModel = (AdStateModel) memcachedTransactionManager.get(AdStateModel.class.getName()+"#"+ id);
		if (adStateModel == null) {
			String sql = "SELECT id, filestate_id, zadobjectid, zclientid, shahash, modifiedtime, createdtime, status, adexternalref, errorlog_id FROM  adstate  WHERE id = ?";
			RowMapper<AdStateModel> mapper = new AdStateModelRowMapper();
			adStateModel = (AdStateModel) jdbcTemplate.queryForObject(sql, mapper, id);
			// load to cache.
			if (adStateModel!=null) {
				memcachedTransactionManager.set(AdStateModel.class.getName()+"#"+id,adStateModel);
				log.debug(logging.finish("findById(" + id + ")", "DB", 1));
			}
		}
		else {
			log.debug(logging.finish("findByid(" + id + ")", "CACHE", 1));
		}
		return adStateModel;
	}

	public Long findByClientRef(int zClient, String externalRef)  {
		DAOLogging logging = DAOLogging.start();
		String sql = "SELECT id FROM adstate WHERE zclientid = ? and adexternalref = ? ";
		Long id = jdbcTemplate.queryForLong(sql,zClient, externalRef);
		log.debug(logging.finish("findByClientRef(" + zClient + "," + externalRef + ")", "DB", 1));
		return id;
	}

	public List<Long> findByFileStateId(Long fileStateId)  {
		DAOLogging logging = DAOLogging.start();
		String sql = "SELECT id FROM adstate WHERE filestate_id = ?  ";
		List<Long>ids = jdbcTemplate.queryForList(sql, Long.class,fileStateId);
		log.debug(logging.finish("findByFileStateId(" + fileStateId + ")", "DB", ids.size()));
		return ids;
	}

    public List<Long> findActiveAdStateByClientId(Integer clientId)  {
		DAOLogging logging = DAOLogging.start();
		StringBuffer sql = new StringBuffer("SELECT id FROM adstate WHERE zclientid = ? AND ");
        sql.append(" ( ");
        sql.append(" status = ").append(AdStateStatus.OK.toNumberValue()).append(" OR ");
        sql.append(" status = ").append(AdStateStatus.QUEUE.toNumberValue()).append(" OR ");
        sql.append(" status = ").append( AdStateStatus.MISSINGMEDIA.toNumberValue());
        sql.append(" ) ");
		List<Long>ids = jdbcTemplate.queryForList(sql.toString(), Long.class,clientId);
		log.debug(logging.finish("findActiveAdStateByClientId(" + clientId + ")", "DB", ids.size()));
		return ids;
	}

	private static class MyPreparedStatementCreator implements PreparedStatementCreator {
		private final AdStateModel adState;

		public MyPreparedStatementCreator(AdStateModel adState) {
			this.adState = adState;
		}

		public PreparedStatement createPreparedStatement(Connection connection)
		throws SQLException {

			PreparedStatement ps = connection.prepareStatement("INSERT INTO adstate (filestate_id, zadobjectid, zclientid, shahash, modifiedtime, createdtime, status, adexternalref, errorlog_id) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
			int parameterIndex = 1;
			ps.setLong(parameterIndex++, adState.getFileStateModel().getId());
			ps.setInt(parameterIndex++, adState.getZadObjectId());
			ps.setInt(parameterIndex++, adState.getzClientId());
			ps.setString(parameterIndex++, adState.getShaHash());
			ps.setLong(parameterIndex++, adState.getModifiedTime().getMillis());
			ps.setLong(parameterIndex++, adState.getCreatedTime().getMillis());
			ps.setInt(parameterIndex++, adState.getAdStateStatus().toNumberValue());
			ps.setString(parameterIndex++, adState.getAdExternalRef());

			if (adState.getError() != null ) {
				ps.setLong(parameterIndex++, adState.getError().getId());
			}
			else {
				ps.setNull(parameterIndex++, java.sql.Types.BIGINT);
			}
			return ps;
		}
	}

	private class AdStateModelRowMapper implements RowMapper<AdStateModel> {
		public AdStateModel mapRow(ResultSet rs, int rowNum) throws SQLException {
			AdStateModel adStateModel = new AdStateModel();
			adStateModel.setId(rs.getLong("id"));
			adStateModel.setFileStateModel(fileStateDAO.findById(rs.getLong("filestate_id")));
			adStateModel.setZadObjectId(rs.getInt("zadobjectid"));
			adStateModel.setzClientId(rs.getInt("zclientid"));
			adStateModel.setShaHash(rs.getString("shahash"));
			adStateModel.setModifiedTime(new DateTime(rs.getLong("modifiedtime")));
			adStateModel.setCreatedTime(new DateTime(rs.getLong("createdtime")));
			adStateModel.setAdStateStatus(AdStateStatus.fromNumberValue(rs.getInt("status")));
			adStateModel.setAdExternalRef(rs.getString("adexternalref"));
			Long errorLogId = rs.getLong("errorlog_id");
			if (errorLogId>0)
			{
				adStateModel.setError(errorLogDAO.findById(rs.getLong("errorlog_id")));
			}
			else {
				adStateModel.setError(null);
			}
			return adStateModel;
		}
	}
}
