package com.abctech.transition.core.dao.partnermap;

import com.abctech.transition.core.dao.DAOLogging;
import com.abctech.transition.core.dao.partnerlogin.PartnerLoginDAO;
import com.abctech.transition.core.memcached.MemcachedTransactionManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
public class PartnerMapDAO {
    private static final Logger log = LoggerFactory.getLogger(PartnerMapDAO.class);

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private PartnerLoginDAO partnerLoginDAO;

    @Autowired
	private MemcachedTransactionManager memcachedTransactionManager;

    public PartnerMapModel save(PartnerMapModel partnerMapModel) {
        DAOLogging logging = DAOLogging.start();
        PartnerMapModel result;
        if (partnerMapModel.getId() == null) {
            result = add(partnerMapModel);
        } else {
            result = update(partnerMapModel);
        }
        memcachedTransactionManager.delete(PartnerMapModel.class.getName() + "#" + partnerMapModel.getId());
        log.debug(logging.finish("save(" + partnerMapModel.getId() + ")", "DB", 1));
        return result;
    }

    public PartnerMapModel add(final PartnerMapModel partnerMapModel) {
        Long result = null;
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(new MyPreparedStatementCreator(partnerMapModel), keyHolder);
        result = keyHolder.getKey().longValue();
        partnerMapModel.setId(result);
        return partnerMapModel;
    }

    public PartnerMapModel update(PartnerMapModel partnerMapModel) {
        String sql = "UPDATE  partnermap SET partnerlogin_id = ?, identifier = ?, zclientid = ?, description =?, partnermappassword = ? WHERE id = ?";
        jdbcTemplate.update(sql,
                partnerMapModel.getPartnerLoginModel().getId(),
                partnerMapModel.getIdentifier(),
                partnerMapModel.getzClientId(),
                partnerMapModel.getDescription(),
                partnerMapModel.getPartnerMapPassword(),
                partnerMapModel.getId()
        );
        return partnerMapModel;
    }


    /**
     * @return true when having success deleting element with given id.
     */
    public boolean deleteById(Long id) {
        String sql = "DELETE FROM partnermap  WHERE id = ?";
        int result = jdbcTemplate.update(sql, id);
        if (result == 1) {
            memcachedTransactionManager.delete(PartnerMapModel.class.getName() + "#" + id);
        }
        return result == 1; // expecting to delete only one element
    }


    public PartnerMapModel findById(Long id) {
        DAOLogging logging = DAOLogging.start();
        PartnerMapModel partnerMapModel = (PartnerMapModel) memcachedTransactionManager.get(PartnerMapModel.class.getName()+"#"+id);
        if (partnerMapModel == null) {
            String sql = "SELECT id, partnerlogin_id, identifier, zclientid, description, partnermappassword FROM  partnermap  WHERE id = ?";
            RowMapper<PartnerMapModel> mapper = new PartnerMapModelRowMapper();
            partnerMapModel = (PartnerMapModel) jdbcTemplate.queryForObject(sql, mapper, id);
            // load to cache.
			if (partnerMapModel != null) {
				memcachedTransactionManager.set(PartnerMapModel.class.getName()+"#"+id,partnerMapModel);
				log.debug(logging.finish("findById(" + id + ")", "DB", 1));
			}
        }else {
			log.debug(logging.finish("findByid(" + id + ")", "CACHE", 1));
		}
        return partnerMapModel;
    }

    public List<Long> findByPartnerLoginId(Long findByPartnerLoginId) {
        DAOLogging logging = DAOLogging.start();
        String sql = "SELECT id FROM partnermap WHERE partnerlogin_id = ?";
        List<Long> result = jdbcTemplate.queryForList(sql, Long.class, findByPartnerLoginId);
        log.debug(logging.finish("findByPartnerLoginId(" + findByPartnerLoginId + ")", "DB", 1));
        return result;
    }

    public Long findByIdentifier(String identifier) {
        DAOLogging logging = DAOLogging.start();
        String sql = "SELECT id FROM partnermap WHERE identifier = ?";
        Long result = jdbcTemplate.queryForLong(sql, identifier);
        log.debug(logging.finish("findByIdentifier(" + identifier + ")", "DB", 1));
        return result;
    }

    private class PartnerMapModelRowMapper implements RowMapper<PartnerMapModel> {
        public PartnerMapModel mapRow(ResultSet rs, int rowNum) throws SQLException {
            PartnerMapModel partnerMapModel = new PartnerMapModel();
            partnerMapModel.setId(rs.getLong("id"));
            partnerMapModel.setPartnerLoginModel(partnerLoginDAO.findById(rs.getLong("partnerlogin_id")));
            partnerMapModel.setIdentifier(rs.getString("identifier"));
            partnerMapModel.setzClientId(rs.getInt("zclientid"));
            partnerMapModel.setDescription(rs.getString("description"));
            partnerMapModel.setPartnerMapPassword(rs.getString("partnermappassword"));
            return partnerMapModel;
        }
    }

    private static class MyPreparedStatementCreator implements PreparedStatementCreator {
        private final PartnerMapModel partnerMapModel;

        public MyPreparedStatementCreator(PartnerMapModel partnerMapModel) {
            this.partnerMapModel = partnerMapModel;
        }

        public PreparedStatement createPreparedStatement(Connection connection)
                throws SQLException {
            PreparedStatement ps = connection.prepareStatement("INSERT INTO partnermap (partnerlogin_id, identifier, zclientid, description, partnermappassword  ) VALUES ( ?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            int parameterIndex = 1;
            ps.setLong(parameterIndex++, partnerMapModel.getPartnerLoginModel().getId());
            ps.setString(parameterIndex++, partnerMapModel.getIdentifier());
            ps.setInt(parameterIndex++, partnerMapModel.getzClientId());
            ps.setString(parameterIndex++, partnerMapModel.getDescription());
            ps.setString(parameterIndex++, partnerMapModel.getPartnerMapPassword());
            return ps;
        }
    }


}
