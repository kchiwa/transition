package com.abctech.transition.core.dao.mediastate;

import com.abctech.transition.core.dao.DAOLogging;
import com.abctech.transition.core.dao.adstate.AdStateDAO;
import com.abctech.transition.core.enumeration.MediaStateContentType;
import com.abctech.transition.core.enumeration.MediaStatus;
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
public class MediaStateDAO {

	private static final Logger log = LoggerFactory.getLogger(MediaStateDAO.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private AdStateDAO adStateDAO;

    @Autowired
	private MemcachedTransactionManager memcachedTransactionManager;

	public MediaStateModel save(MediaStateModel mediaStateModel) {
		DAOLogging logging = DAOLogging.start();
		MediaStateModel mediaState = null;
		if (mediaStateModel.getId()==null) {
			mediaState = add(mediaStateModel);
		}
		else {
			mediaState = update(mediaStateModel);
		}
		memcachedTransactionManager.delete(MediaStateModel.class.getName()+"#"+mediaState.getId());
		log.debug(logging.finish("save(" + mediaStateModel.getId() + ")", "DB", 1));
		return mediaState;
	}
	
	private MediaStateModel add(final MediaStateModel mediaStateModel) {
		Long result = null;
		KeyHolder keyHolder = new GeneratedKeyHolder();
		jdbcTemplate.update(new MyPreparedStatementCreator(mediaStateModel), keyHolder);
		result = keyHolder.getKey().longValue();
		mediaStateModel.setId(result);
		return mediaStateModel;
	}

	public boolean deleteById(Long id) {
		DAOLogging logging = DAOLogging.start();
		String sql = "DELETE FROM mediastate  WHERE id = ?";
		int result = jdbcTemplate.update(sql, id);
		if (result == 1) {
			memcachedTransactionManager.delete(MediaStateModel.class.getName()+"#"+id);
			log.debug(logging.finish("delete(" + id + ")", "DB", result));
			return true;
		}
		return false;
	}


	private MediaStateModel update(MediaStateModel mediaStateModel) {

		String sql = "UPDATE mediastate SET adstate_id = ? ,contenttype = ?, sequencenum = ?, title = ?, md5hash = ?, status = ?, prodref = ?, extref = ? , lastmodified = ?, infomessage = ? WHERE id = ? ";
		jdbcTemplate.update(sql,
				mediaStateModel.getAdStateModel().getId(),
				mediaStateModel.getContentType().toNumberValue(),
				mediaStateModel.getSequenceNum(),
				mediaStateModel.getTitle(),
				mediaStateModel.getMd5hash(),
				mediaStateModel.getMediaStatus().toNumberValue(),
				mediaStateModel.getProdref(),
				mediaStateModel.getExtref(),
				mediaStateModel.getLastModified().getMillis(),
				mediaStateModel.getInfoMessage(),
				mediaStateModel.getId()
		);
		return mediaStateModel;
	}

	public MediaStateModel findById(Long id) {
		DAOLogging logging = DAOLogging.start();
		MediaStateModel mediaState = (MediaStateModel) memcachedTransactionManager.get(MediaStateModel.class.getName()+"#"+id);
		if (mediaState==null) { 
			String sql = "SELECT id, adstate_id, contenttype, sequencenum, title, md5hash, status, prodref, extref, lastmodified, infomessage FROM  mediastate  WHERE id = ?";
			RowMapper<MediaStateModel> mapper = new MediaStateModelRowMapper();
			mediaState = jdbcTemplate.queryForObject(sql, mapper, id);
			if (mediaState!=null) {
				memcachedTransactionManager.set(MediaStateModel.class.getName()+"#"+id, mediaState);
				log.debug(logging.finish("findById(" + id + ")", "DB", 1));
			}
		}
		else {
			log.debug(logging.finish("findById(" + id + ")", "CACHE", 1));
		}
		return mediaState;
	}

	public List<Long> getMediaStateIdsByClientRefClientId(String clientRef, int clientId) {
		DAOLogging logging = DAOLogging.start();
		String sql = "SELECT mediastate.id  FROM mediastate,adstate WHERE mediastate.adstate_id = adstate.id";
		sql += " and adstate.zclientid = ? and adstate.adexternalref = ? ";
		List<Long>ids = jdbcTemplate.queryForList(sql, Long.class, clientId, clientRef);
		log.debug(logging.finish("getMediaStateIdsByClientRefClientId(" + clientRef + "," + clientId + ")", "DB", ids.size()));
		return ids;
	}

	public List<Long> getMediaStateByAdStateId(Long adstateID) {
		DAOLogging logging = DAOLogging.start();
		String sql = "SELECT id FROM  mediastate WHERE adstate_id = ? order by sequencenum ASC";
		List<Long>ids = jdbcTemplate.queryForList(sql, Long.class, adstateID);
		log.debug(logging.finish("getMediaStateByAdStateId(" + adstateID + ")", "DB", ids.size()));
		return ids;
	}


	public List<Long> getMediaMediaStateIdByClientId(int clientId) {
		DAOLogging logging = DAOLogging.start();
		String sql = "SELECT mediastate.id FROM mediastate, adstate WHERE adstate.zclientid=? AND adstate.id=mediastate.adstate_id ORDER by mediastate.sequencenum ASC";
		List<Long>ids = jdbcTemplate.queryForList(sql, Long.class, clientId);
		log.debug(logging.finish("getMediaMediaStateIdByClientId(" + clientId + ")", "DB", ids.size()));
		return ids;
	}

	private static class MyPreparedStatementCreator implements PreparedStatementCreator {

		private final MediaStateModel mediaStateModel;

		public MyPreparedStatementCreator(MediaStateModel mediaStateModel) {
			this.mediaStateModel = mediaStateModel;
		}

		public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {

			PreparedStatement ps = connection.prepareStatement("INSERT INTO mediastate ( adstate_id, contenttype, sequencenum, title, md5hash, status, prodref, extref, lastmodified, infomessage) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
			int parameterIndex = 1;
			if (mediaStateModel != null) {
				log.debug("MediaStateDAO.toString() ::: " + mediaStateModel.toString());
				if (mediaStateModel.getAdStateModel() == null || mediaStateModel.getAdStateModel().getId() == null) {
					log.error("Error: AdStateModel can not be NULL!");
					return null;
				} else {
					ps.setLong(parameterIndex++, mediaStateModel.getAdStateModel().getId());
					ps.setInt(parameterIndex++, mediaStateModel.getContentType().toNumberValue());
					ps.setLong(parameterIndex++, mediaStateModel.getSequenceNum());
					ps.setString(parameterIndex++, mediaStateModel.getTitle());
					ps.setString(parameterIndex++, mediaStateModel.getMd5hash());
					ps.setInt(parameterIndex++, mediaStateModel.getMediaStatus().toNumberValue());
					ps.setString(parameterIndex++, mediaStateModel.getProdref());
					ps.setString(parameterIndex++, mediaStateModel.getExtref());
					ps.setLong(parameterIndex++, mediaStateModel.getLastModified().getMillis());
					ps.setString(parameterIndex++, mediaStateModel.getInfoMessage());
				}
			} else {
				log.error("Error: MediaStateModel can not be NULL!");
				return null;
			}
			return ps;
		}
	}

	private class MediaStateModelRowMapper implements RowMapper<MediaStateModel> {

		public MediaStateModel mapRow(ResultSet rs, int rowNum) throws SQLException {
			MediaStateModel mediaStateModel = new MediaStateModel();
			mediaStateModel.setId(rs.getLong("id"));
			mediaStateModel.setAdStateModel(adStateDAO.findById(rs.getLong("adstate_id")));
			mediaStateModel.setContentType(MediaStateContentType.fromNumberValue(rs.getInt("contenttype")));
			mediaStateModel.setSequenceNum(rs.getInt("sequencenum"));
			mediaStateModel.setTitle(rs.getString("title"));
			mediaStateModel.setMd5hash(rs.getString("md5hash"));
			mediaStateModel.setMediaStatus(MediaStatus.fromNumberValue(rs.getInt("status")));
			mediaStateModel.setProdref(rs.getString("prodref"));
			mediaStateModel.setExtref(rs.getString("extref"));
			mediaStateModel.setLastModified(new DateTime(rs.getLong("lastmodified")));
			mediaStateModel.setInfoMessage(rs.getString("infomessage"));
			return mediaStateModel;
		}
	}

}
