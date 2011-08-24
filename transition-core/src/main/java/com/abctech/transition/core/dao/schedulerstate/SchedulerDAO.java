package com.abctech.transition.core.dao.schedulerstate;

import com.abctech.transition.core.TransitionProperties;
import com.abctech.transition.core.exception.DAOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 *
 */

@Service
public class SchedulerDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
	private TransitionProperties transitionProperties;

    public List<HttpFecthSchedulerModel> findAll() {
        String sql = "SELECT id,schedulername, customerformat,clientname,crontrigger, active FROM schedulerstatus ";
        RowMapper<HttpFecthSchedulerModel> mapper = new RSSFecthSchedulerModelRowMapper();

        return jdbcTemplate.query(sql, mapper);
    }

    public List<HttpFecthSchedulerModel> findActiveAll() {
        String sql = "SELECT id,schedulername, customerformat,clientname,crontrigger, active FROM schedulerstatus WHERE active = 1 ";
        RowMapper<HttpFecthSchedulerModel> mapper = new RSSFecthSchedulerModelRowMapper();

        return jdbcTemplate.query(sql, mapper);
    }

    public HttpFecthSchedulerModel findByClientName(String clientName) {

        if (clientName == null || clientName.equals("'")) {
            return new HttpFecthSchedulerModel(); // Just return empty model
        }
        String sql = "SELECT id,schedulername, customerformat,clientname,crontrigger, active " +
                " FROM schedulerstatus " +
                " WHERE clientname = ? ";
        RowMapper<HttpFecthSchedulerModel> mapper = new RSSFecthSchedulerModelRowMapper();

        return jdbcTemplate.queryForObject(sql, mapper, clientName);
    }

    public HttpFecthSchedulerModel findById(long id) {

        String sql = "SELECT id,schedulername, customerformat,clientname,crontrigger, active " +
                " FROM schedulerstatus " +
                " WHERE id = ? ";
        RowMapper<HttpFecthSchedulerModel> mapper = new RSSFecthSchedulerModelRowMapper();

        return jdbcTemplate.queryForObject(sql, mapper, id);
    }

    public HttpFecthSchedulerModel save(HttpFecthSchedulerModel model) throws DAOException {

        if(model == null) {
            throw new DAOException("Can not save NULL model.");
        }
        HttpFecthSchedulerModel result = null;
        if (model.getId() == null) {
            result = add(model);
        } else {
            result = update(model);
        }
        return result;
    }

    public HttpFecthSchedulerModel add(HttpFecthSchedulerModel model) {

        Long result = null;
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(new StatementCreator(model), keyHolder);
        result = keyHolder.getKey().longValue();
        model.setId(result);
        return model;
    }

    private HttpFecthSchedulerModel update(HttpFecthSchedulerModel model) {
        String sql = "UPDATE schedulerstatus SET  clientname = ?,  crontrigger=?, active=? WHERE id = ?";
        jdbcTemplate.update(sql,model.getClientName(),model.getCronTrigger(),model.getActive() ,model.getId());

        return model;
    }

    private static class RSSFecthSchedulerModelRowMapper implements RowMapper<HttpFecthSchedulerModel> {
        public HttpFecthSchedulerModel mapRow(ResultSet rs, int rowNum) throws SQLException {
            HttpFecthSchedulerModel model = new HttpFecthSchedulerModel();
            model.setId(rs.getLong("id"));
            model.setSchedulerName(rs.getString("schedulername"));
            model.setCustomerFormat(rs.getString("customerformat"));
            model.setClientName(rs.getString("clientname"));
            model.setCronTrigger(rs.getString("crontrigger"));
            model.setActive((rs.getInt("active") == 1) ? true : false);

            return model;
        }
    }

    private static class StatementCreator implements PreparedStatementCreator {

        private final HttpFecthSchedulerModel httpFecthSchedulerModel;

        public StatementCreator(HttpFecthSchedulerModel model) {
            this.httpFecthSchedulerModel = model;
        }

        public PreparedStatement createPreparedStatement(Connection connection)
                throws SQLException {

            PreparedStatement ps = connection.prepareStatement("INSERT INTO schedulerstatus (schedulername, customerformat, clientname," +
                    " crontrigger, active) VALUES ( ?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, httpFecthSchedulerModel.getSchedulerName());
            ps.setString(2, httpFecthSchedulerModel.getCustomerFormat());
            ps.setString(3, httpFecthSchedulerModel.getClientName());
            ps.setString(4, httpFecthSchedulerModel.getCronTrigger());
            ps.setInt(5, (httpFecthSchedulerModel.getActive()) ? 1 : 0);

            return ps;
        }
    }
    //FIXME the clientname should not be hardcoded like this.
    public String getFetchURLFromClientName(String clientName) {

        String url = "";
        if("rettbemanning".equalsIgnoreCase(clientName)) {
            return transitionProperties.getRSSFetchRettbemanningURL();
        }

        if("Stavlund AS".equalsIgnoreCase(clientName)) {
            return transitionProperties.getRSSFetchWebmeglerURL();
        }

        if("personalhuset".equalsIgnoreCase(clientName)) {
            return transitionProperties.getRSSFetchWebtempPersonalhusetURL();
        }

        if("people4you".equalsIgnoreCase(clientName)) {
            return transitionProperties.getRSSFetchWebtempPeople4youURL();
        }

        if("sologstrand".equalsIgnoreCase(clientName)) {
            return transitionProperties.getRSSFetchSologstrandURL();
        }

        return url;
    }
}
