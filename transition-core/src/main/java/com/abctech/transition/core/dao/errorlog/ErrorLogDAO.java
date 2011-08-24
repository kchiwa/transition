package com.abctech.transition.core.dao.errorlog;


import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Service;

import java.sql.*;


@Service
public class ErrorLogDAO {

	// private static final Logger log = LoggerFactory.getLogger(ErrorLogDAO.class);
	@Autowired
	private JdbcTemplate jdbcTemplate;


	
	public ErrorLogModel save(ErrorLogModel errorLogModel) {
		ErrorLogModel result = null;
		if (errorLogModel.getId()==null) {
			result = add(errorLogModel);
		}
		else {
			result = update(errorLogModel);
		}
		return result;
	}
	
    private ErrorLogModel add(final ErrorLogModel errorLogModel) {
        Long result = null;
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(new MyPreparedStatementCreator(errorLogModel), keyHolder);
        result = keyHolder.getKey().longValue();
        errorLogModel.setId(result);
        return errorLogModel;
    }

    private ErrorLogModel update(ErrorLogModel errorLogModel) {
           String sql = "UPDATE errorlog SET objectid=?, objecttype= ?, jmsmessageid = ?, errormessage = ?, createdtime = ?  WHERE id = ?";
           jdbcTemplate.update(sql,
        		   errorLogModel.getObjectId(),
        		   errorLogModel.getObjectType().toIntValue(),
                   errorLogModel.getJmsmessageid(),
                   errorLogModel.getErrorMessage(),
                   errorLogModel.getCreatedTime().getMillis(),
                   errorLogModel.getId()
           );
           return errorLogModel;
    }



    public boolean deleteById(Long id) {
        String sql = "DELETE FROM errorlog  WHERE id = ?";
        int result = jdbcTemplate.update(sql, id);
        return result == 1; // expecting to delete only one element
    }


    public ErrorLogModel findById(Long id) {
        String sql = "SELECT id, objectid, objecttype, jmsmessageid, errormessage, createdtime FROM  errorlog  WHERE id = ?";
        RowMapper<ErrorLogModel> mapper = new ErrorLogModelRowMapper();
        return (ErrorLogModel) jdbcTemplate.queryForObject(sql, mapper, id);

    }

    private static class MyPreparedStatementCreator implements PreparedStatementCreator {
        private final com.abctech.transition.core.dao.errorlog.ErrorLogModel errorLogModel;

        public MyPreparedStatementCreator(com.abctech.transition.core.dao.errorlog.ErrorLogModel errorLogModel) {
            this.errorLogModel = errorLogModel;
        }

        public PreparedStatement createPreparedStatement(Connection connection)
                throws SQLException {
            PreparedStatement ps = connection.prepareStatement("INSERT INTO errorlog (objectid, objecttype, jmsmessageid, errormessage, createdtime) VALUES (?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            int parameterIndex = 1;
            if (errorLogModel.getObjectId()!=null) {
            	ps.setLong(parameterIndex++, errorLogModel.getObjectId());
            }
            else {
            	ps.setNull(parameterIndex++, java.sql.Types.BIGINT);
            }
            ps.setInt(parameterIndex++, errorLogModel.getObjectType().toIntValue());
            ps.setString(parameterIndex++, errorLogModel.getJmsmessageid());
            ps.setString(parameterIndex++, errorLogModel.getErrorMessage());
            ps.setLong(parameterIndex, errorLogModel.getCreatedTime().getMillis());
            return ps;
        }
    }

    private static class ErrorLogModelRowMapper implements RowMapper<ErrorLogModel> {
        public ErrorLogModel mapRow(ResultSet rs, int rowNum) throws SQLException {
            ErrorLogModel errorLogModel = new ErrorLogModel();
            errorLogModel.setId(rs.getLong("id"));
            errorLogModel.setJmsmessageid(rs.getString("jmsmessageid"));
            errorLogModel.setErrorMessage(rs.getString("errormessage"));
            errorLogModel.setCreatedTime(new DateTime(rs.getLong("createdtime")));
            errorLogModel.setObjectType(ErrorObjectType.fromValue(rs.getInt("objecttype")));
            errorLogModel.setObjectId(rs.getLong("objectid"));
            return errorLogModel;
        }
    }

}

/*
 - Save/Insert the error record. (No need to update)
- Delete an error record by its id (primary key)
- Delete all record by the clientid and clientRef (Basically means delete all error record belong to an ad)
- Delete all error record by the clientId (means delete all error that the client has generated).
*/