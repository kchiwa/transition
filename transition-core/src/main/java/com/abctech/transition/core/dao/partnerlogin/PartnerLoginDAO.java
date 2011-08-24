package com.abctech.transition.core.dao.partnerlogin;

import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.enumeration.Protocol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.List;

@Component
public class PartnerLoginDAO {
    //private static final Logger log = LoggerFactory.getLogger(PartnerLoginDAO.class);

    @Autowired
    private JdbcTemplate jdbcTemplate;



    public PartnerLoginModel add(final PartnerLoginModel partnerLoginModel) {
        Long result = null;
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(new MyPreparedStatementCreator(partnerLoginModel), keyHolder);
        result = keyHolder.getKey().longValue();
        partnerLoginModel.setId(result);
        return partnerLoginModel;
    }

    public List<PartnerLoginModel> load() {
        String sql = "SELECT id, customerformat, login, protocol, loginpassword , receipt FROM  partnerlogin";
		RowMapper<PartnerLoginModel> mapper = new PartnerLoginModelRowMapper();
		return jdbcTemplate.query(sql, mapper);
    }

    /**
     * @return true when having success deleting element with given id.
     */
    public boolean deleteById(Long id) {
        String sql = "DELETE FROM partnerlogin  WHERE id = ?";
        int result = jdbcTemplate.update(sql, id);
        return result == 1; // expecting to delete only one element
    }


    public PartnerLoginModel findById(Long id) {
        String sql = "SELECT id, login, customerformat, protocol, loginpassword , receipt FROM  partnerlogin  WHERE id = ?";
        RowMapper<PartnerLoginModel> mapper = new PartnerLoginModelRowMapper();
        return jdbcTemplate.queryForObject(sql, mapper, id);
    }

    public Long findByLogin(String login) {
        String sql = "SELECT id FROM  partnerlogin  WHERE login = ?";
        return jdbcTemplate.queryForLong(sql, login);
    }

     public List<Long> findByCustomerFormat(String customerFormat) {
        String sql = "SELECT id FROM  partnerlogin WHERE customerformat = ?";
        return jdbcTemplate.queryForList(sql, Long.class, customerFormat);
    }

     public PartnerLoginModel update(PartnerLoginModel partnerLoginModel) {
         String sql = "UPDATE  partnerlogin SET login = ?, customerformat = ?, protocol = ?, loginpassword = ? , receipt = ?  WHERE id = ?";
         jdbcTemplate.update(sql,
                partnerLoginModel.getLogin(),
                partnerLoginModel.getCustomerFormat(),
                partnerLoginModel.getProtocol().toNumberValue(),
                partnerLoginModel.getLoginPassword(),
                partnerLoginModel.isReceipt(),
                partnerLoginModel.getId()
        );
       return partnerLoginModel;
    }

    public long countByFormat(CustomerFormat customerFormat) {
        String sql = "SELECT COUNT(id) FROM partnerlogin WHERE customerformat = ?";
        return jdbcTemplate.queryForLong(sql, customerFormat.toTextValue());
    }

    private static class PartnerLoginModelRowMapper implements RowMapper<PartnerLoginModel> {
        public PartnerLoginModel mapRow(ResultSet rs, int rowNum) throws SQLException {
            PartnerLoginModel partnerLoginModel = new PartnerLoginModel();
            partnerLoginModel.setId(rs.getLong("id"));
            partnerLoginModel.setLogin(rs.getString("login"));
            partnerLoginModel.setCustomerFormat(rs.getString("customerformat"));
            partnerLoginModel.setProtocol(Protocol.fromNumberValue(rs.getInt("protocol")));
            partnerLoginModel.setLoginPassword(rs.getString("loginpassword"));
            partnerLoginModel.setReceipt(rs.getInt("receipt")==1?true :false);
            return partnerLoginModel;
        }
    }

    private static class MyPreparedStatementCreator implements PreparedStatementCreator {
        private final PartnerLoginModel partnerLoginModel;

        public MyPreparedStatementCreator(PartnerLoginModel partnerLoginModel) {
            this.partnerLoginModel = partnerLoginModel;
        }

        public PreparedStatement createPreparedStatement(Connection connection)
                throws SQLException {
            PreparedStatement ps = connection.prepareStatement("INSERT INTO partnerlogin (login, customerformat, protocol, loginpassword ,receipt ) VALUES ( ?, ?, ?, ?,?)", Statement.RETURN_GENERATED_KEYS);
            int parameterIndex = 1;
            ps.setString(parameterIndex++, partnerLoginModel.getLogin());
            ps.setString(parameterIndex++, partnerLoginModel.getCustomerFormat());
            ps.setLong(parameterIndex++, partnerLoginModel.getProtocol().toNumberValue());
            ps.setString(parameterIndex++, partnerLoginModel.getLoginPassword());
            ps.setInt(parameterIndex++ , partnerLoginModel.isReceipt() ? 1 : 0);
            return ps;
        }
    }

}
