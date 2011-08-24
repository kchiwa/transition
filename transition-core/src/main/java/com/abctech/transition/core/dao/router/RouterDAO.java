package com.abctech.transition.core.dao.router;


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
public class RouterDAO {

    // private static final Logger log = LoggerFactory.getLogger(RouterDAO.class);

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * @param routerModel non-null value to save
     */
    public RouterModel save(RouterModel routerModel) {
        RouterModel result = null;
        if (routerModel.getId() == null) {
            result = add(routerModel);
        } else {
            result = update(routerModel);
        }
        return result;
    }

    private RouterModel add(final RouterModel routerModel) {
        Long result = null;
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(new FtpStatusStatementCreator(routerModel), keyHolder);
        result = keyHolder.getKey().longValue();
        routerModel.setId(result);
        return routerModel;
    }


    private RouterModel update(RouterModel routerModel1) {
        String sql = "UPDATE ftprouterstatus SET customerformat = ?, active = ?  WHERE id = ?";
        jdbcTemplate.update(sql,
                routerModel1.getCustomerFormat(),
                (routerModel1.getActive())? 1 : 0,
                routerModel1.getId()
        );
        return routerModel1;
    }

    public boolean deleteById(long id) {
        String sql = "DELETE FROM ftprouterstatus  WHERE id = ?";
        int result = jdbcTemplate.update(sql, id);
        if (result == 1) {
            return true;
        }
        return false;
    }

    public RouterModel findByFormat(String format) {
        String sql = "SELECT id, customerformat, active FROM  ftprouterstatus WHERE customerformat = ?";
        RowMapper<RouterModel> mapper = new RouterModelRowMapper();
        return jdbcTemplate.queryForObject(sql, mapper, format);
    }

    public RouterModel findById(long id) {
        String sql = "SELECT id, customerformat, active FROM  ftprouterstatus WHERE id = ?";
        RowMapper<RouterModel> mapper = new RouterModelRowMapper();
        return jdbcTemplate.queryForObject(sql, mapper, id);
    }

    public List<RouterModel> findAll() {
        String sql = "SELECT id,customerformat,active FROM ftprouterstatus ";
        RowMapper<RouterModel> mapper = new RouterModelRowMapper();
        return jdbcTemplate.query(sql, mapper);
    }

    private static class RouterModelRowMapper implements RowMapper<RouterModel> {
        public RouterModel mapRow(ResultSet rs, int rowNum) throws SQLException {
            RouterModel routerModel = new RouterModel();
            routerModel.setId(rs.getLong("id"));
            routerModel.setCustomerFormat(rs.getString("customerformat"));
            routerModel.setActive( ( rs.getInt("active") == 1 )? true : false);
            return routerModel;
        }
    }

    private static class FtpStatusStatementCreator implements PreparedStatementCreator {
        private final RouterModel routerModel;

        public FtpStatusStatementCreator(RouterModel routerModel) {
            this.routerModel = routerModel;
        }

        public PreparedStatement createPreparedStatement(Connection connection)
                throws SQLException {

            PreparedStatement ps = connection.prepareStatement("INSERT INTO ftprouterstatus (customerformat, active) VALUES ( ?, ?)", Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, routerModel.getCustomerFormat());
            ps.setInt(2, (routerModel.getActive()) ? 1 : 0);
            return ps;
        }
    }

}
