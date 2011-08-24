package com.abctech.transition.core.dao.valuemap;

import com.abctech.transition.core.enumeration.CustomerFormat;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.*;
import java.util.List;

@Service
public class ValueMapDAO {
   // private static final Logger log = LoggerFactory.getLogger(ValueMapDAO.class);
    private JdbcTemplate jdbcTemplate;


    @Autowired
    @Qualifier("importStateDataSource")
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
        /*
        try {
            String cs1 = "SET character_set_results=utf8";
            String cs2 = "SET character_set_client = utf8";
            String cs3 = "SET character_set_connection = utf8";
            this.jdbcTemplate.execute("SET NAMES UTF8");
             this.jdbcTemplate.execute(cs1);
             this.jdbcTemplate.execute(cs2);
             this.jdbcTemplate.execute(cs3);
        }catch (DataAccessException ex) {
          log.debug("HSQL not require to set names utf8");
        }
        */
    }

    public ValueMapModel add(final ValueMapModel valueMapModel) {
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(new MyPreparedStatementCreator(valueMapModel), keyHolder);
        Long result = keyHolder.getKey().longValue();
        valueMapModel.setId(result);
        return valueMapModel;
    }

    public ValueMapModel update(ValueMapModel valueMapModel1) {
        String sql = "UPDATE valuemap SET format = ? ,field = ?, lookup = ?, zettvalue = ?, categoryid = ?, updatedtime = ? WHERE id = ? ";
        jdbcTemplate.update(sql,
                valueMapModel1.getFormat(),
                valueMapModel1.getField(),
                valueMapModel1.getLookup(),
                valueMapModel1.getZettValue(),
                valueMapModel1.getCategoryId(),
                valueMapModel1.getUpdatedtime().getMillis(),
                valueMapModel1.getId()
        );
        return valueMapModel1;
    }


    public boolean deleteById(int id) {
        String sql = "DELETE FROM valuemap  WHERE id = ?";
        int result = jdbcTemplate.update(sql, id);
        return result == 1;
    }

    private static class MyPreparedStatementCreator implements PreparedStatementCreator {
        private final com.abctech.transition.core.dao.valuemap.ValueMapModel valueMapModel;

        public MyPreparedStatementCreator(com.abctech.transition.core.dao.valuemap.ValueMapModel valueMapModel) {
            this.valueMapModel = valueMapModel;
        }

        public PreparedStatement createPreparedStatement(Connection connection)
                throws SQLException {
            PreparedStatement ps = connection.prepareStatement("INSERT INTO valuemap ( format, field, lookup, zettvalue, categoryid, updatedtime) VALUES (?, ?, ?, ?,?, ?)", Statement.RETURN_GENERATED_KEYS);
            int parameterIndex = 1;
            ps.setString(parameterIndex++, valueMapModel.getFormat());
            ps.setString(parameterIndex++, valueMapModel.getField());
            ps.setString(parameterIndex++, valueMapModel.getLookup());
            ps.setString(parameterIndex++, valueMapModel.getZettValue());
            if (valueMapModel.getCategoryId() != null) {
                ps.setInt(parameterIndex++, valueMapModel.getCategoryId());
            } else {
                ps.setNull(parameterIndex++, java.sql.Types.INTEGER);
            }
            ps.setLong(parameterIndex++, valueMapModel.getUpdatedtime().getMillis());
            return ps;
        }
    }

    public List<ValueMapModel> load() {
        String sql = "SELECT id, format, field, lookup, zettvalue, categoryid, updatedtime FROM  valuemap ";
        RowMapper<ValueMapModel> mapper = new ValueMapModelRowMapper();
        return jdbcTemplate.query(sql, mapper);
    }

    public ValueMapModel findById(int id) {
        String sql = "SELECT id, format, field, lookup, zettvalue, categoryid, updatedtime FROM  valuemap Where id = ?";
        RowMapper<ValueMapModel> mapper = new ValueMapModelRowMapper();
        return jdbcTemplate.queryForObject(sql, mapper, id);
    }

    private static class ValueMapModelRowMapper implements RowMapper<ValueMapModel> {
        public ValueMapModel mapRow(ResultSet rs, int rowNum) throws SQLException {
            ValueMapModel valueMapModel = new ValueMapModel();
            valueMapModel.setId(rs.getLong("id"));
            valueMapModel.setFormat(rs.getString("format"));
            valueMapModel.setField(rs.getString("field"));
            valueMapModel.setLookup(rs.getString("lookup"));
            valueMapModel.setZettValue(rs.getString("zettvalue"));
            valueMapModel.setCategoryId(rs.getInt("categoryid"));
            valueMapModel.setUpdatedtime(new DateTime(rs.getLong("updatedtime")));
            return valueMapModel;
        }
    }

    public long countByFormat(CustomerFormat customerFormat){
        String sql = "SELECT COUNT(id) FROM valuemap WHERE format = ?";
        return jdbcTemplate.queryForLong(sql, customerFormat.toTextValue());
    }

    public String getLastUpdated() {
        String sql = "SELECT MAX(updatedtime) as lastupdated FROM valuemap";
        long lastupdated = jdbcTemplate.queryForLong(sql);
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");
        return new DateTime(lastupdated).toString(formatter);
    }

}
