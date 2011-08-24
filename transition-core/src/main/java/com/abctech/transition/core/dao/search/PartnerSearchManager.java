package com.abctech.transition.core.dao.search;

import com.abctech.transition.core.dao.partnerlogin.IPartnerLoginManager;
import com.abctech.transition.core.dao.partnerlogin.PartnerLoginModel;
import com.abctech.transition.core.dao.partnermap.IPartnerMapManager;
import com.abctech.transition.core.dao.partnermap.PartnerMapModel;
import com.abctech.transition.core.enumeration.Protocol;
import com.abctech.transition.core.exception.DAOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Pun (pun@abctech-thailand.com)
 * @since 2011-03-14
 */
@Service
public class PartnerSearchManager {

    private static final Logger log = LoggerFactory.getLogger(PartnerSearchManager.class);
    private static final String AND = " AND ";
    private static final String WHERE = " WHERE ";
    private static final int DEFAULT_REQ_PGE = 1;
    private static final int NO_SIZE_LIMIT = 0;
    private JdbcTemplate jdbcTemplate;

    // TODO CR Erlend 20110501 Remove method - not necessary:
    @Autowired
    @Qualifier("importStateDataSource")
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Autowired
    private IPartnerLoginManager partnerLoginManager;

    @Autowired
    private IPartnerMapManager partnerMapManager;

    /**
     * Retrieve a list of PartnerLoginModel with specific parameters
     *
     * @param requestPage which result page is requested
     * @param pageLimit result size limit
     * @return a list of found PartnerLogin
     * @throws DAOException when something is wrong
     */
    public List<PartnerLoginModel> retrievePartnerLoginList(String customerFormat, String loginName, String protocol, int requestPage, int pageLimit) throws DAOException {
        List<Long> partnerLoginID = retrievePartnerLoginID(customerFormat, loginName, protocol, requestPage, pageLimit);
        List<PartnerLoginModel> partnerLoginModelList = new ArrayList<PartnerLoginModel>();
        for (Long id : partnerLoginID) {
            PartnerLoginModel partnerLoginModel = partnerLoginManager.findById(id);
            partnerLoginModelList.add(partnerLoginModel);
        }
        return partnerLoginModelList;
    }

    public List<PartnerLoginModel> retrieveAllPartnerLoginList() throws DAOException {
        StringBuilder sql = new StringBuilder(" SELECT DISTINCT partnerlogin.id FROM partnerlogin");
        sql.append(" ORDER BY id");
        List<Long> partnerLoginID = jdbcTemplate.queryForList(sql.toString(), Long.class);
        List<PartnerLoginModel> partnerLoginModelList = new ArrayList<PartnerLoginModel>();
        for (Long id : partnerLoginID) {
            PartnerLoginModel partnerLoginModel = partnerLoginManager.findById(id);
            partnerLoginModelList.add(partnerLoginModel);
        }
        return partnerLoginModelList;
    }

    /**
     * Retrieve IDs from partnerlogin table with specific parameters and result size.
     *
     * @param requestPage which result page is requested
     * @param pageLimit result size limit
     * @return records found
     * @throws DAOException when something is wrong
     */
    private List<Long> retrievePartnerLoginID(String customerFormat, String loginName, String protocol, int requestPage, int pageLimit) throws DAOException {
        StringBuilder sql = new StringBuilder(" SELECT DISTINCT partnerlogin.id FROM partnerlogin");
        boolean criteriaSet = false;

        if (customerFormat != null && !customerFormat.equals("show_all") && customerFormat.length() > 0) {
            sql.append(WHERE).append("partnerlogin.customerformat = '").append(customerFormat).append("'");
            criteriaSet = true;
        }

        if (loginName != null && loginName.length() > NO_SIZE_LIMIT) {
            if (criteriaSet) {
                sql.append(AND);
            } else {
                sql.append(WHERE);
            }
            sql.append("partnerlogin.login = '").append(loginName.trim()).append("'");
            criteriaSet = true;
        }

        if (protocol != null && !protocol.equals("show_all") && protocol.length() > 0) {
            if (criteriaSet) {
                sql.append(AND);
            } else {
                sql.append(WHERE);
            }
            sql.append("partnerlogin.protocol = ").append(Protocol.valueOf(protocol).toNumberValue());
        }
        sql.append(" ORDER BY id").append(" ");

        if (pageLimit != NO_SIZE_LIMIT) {
            int startRecord = ((pageLimit * requestPage) - pageLimit);
            sql.append("LIMIT ").append(pageLimit).append(" OFFSET ").append(startRecord);
        }

        log.debug("\n------------------------------------------------------------------------\n" +
                "\t" + sql.toString() + "\n" +
                "------------------------------------------------------------------------\n");

        return jdbcTemplate.queryForList(sql.toString(), Long.class);
    }

    /**
     * Retrieve a list of PartnerMapModel with specific parameters
     * @param requestPage which result page is requested
     * @param pageLimit result size limit
     * @return a list of found PartnerMap
     * @throws DAOException when something is wrong
     */
    public List<PartnerMapModel> retrievePartnerList(String partnerID, String zClientID, String identifier, int requestPage, int pageLimit) throws DAOException {
        List<Long> partnerLoginID = retrievePartnerID(partnerID, zClientID, identifier, requestPage, pageLimit);
        List<PartnerMapModel> partnerModelList = new ArrayList<PartnerMapModel>();
        for (Long id : partnerLoginID) {
            PartnerMapModel partnerMapModel = partnerMapManager.findById(id);
            partnerModelList.add(partnerMapModel);
        }
        return partnerModelList;
    }

    /**
     * Retrieve IDs from partnermap table with specific parameters and result size.
     * @param requestPage which result page is requested
     * @param pageLimit result size limit
     * @return records found
     * @throws DAOException when something is wrong
     */
    private List<Long> retrievePartnerID(String partnerID, String zClientID, String identifier, int requestPage, int pageLimit) throws DAOException {
        StringBuilder sql = new StringBuilder(" SELECT DISTINCT partnermap.id FROM partnermap");
        boolean criteriaSet = false;

        if (partnerID != null && !partnerID.equals("show_all")) {
            sql.append(WHERE).append("partnermap.partnerlogin_id = ").append(partnerID);
            criteriaSet = true;
        }
        if (zClientID != null && zClientID.length() > NO_SIZE_LIMIT) {
            if (criteriaSet) {
                sql.append(AND);
            } else {
                sql.append(WHERE);
            }
            sql.append("partnermap.zclientid = ").append(zClientID.trim());
            criteriaSet = true;
        }
        if (identifier != null && identifier.length() > NO_SIZE_LIMIT) {
            if (criteriaSet) {
                sql.append(AND);
            } else {
                sql.append(WHERE);
            }
            sql.append("partnermap.identifier = '").append(identifier.trim()).append("'");
        }
        sql.append(" ORDER BY id").append(" ");

        if (pageLimit != NO_SIZE_LIMIT) {
            int startRecord = ((pageLimit * requestPage) - pageLimit);
            sql.append("LIMIT ").append(pageLimit).append(" OFFSET ").append(startRecord);
        }

        log.debug("\n------------------------------------------------------------------------\n" +
                "\t" + sql.toString() + "\n" +
                "------------------------------------------------------------------------\n");

        return jdbcTemplate.queryForList(sql.toString(), Long.class);
    }

    /**
     *  Retrieve total records found for specific parameters from partnerlogin table
     *
     * @return total record found
     * @throws DAOException when something wrong
     */
    public int retrievePartnerLoginIDResultSize(String customerFormat, String loginName, String protocol) throws DAOException {
        return retrievePartnerLoginID(customerFormat, loginName, protocol, DEFAULT_REQ_PGE, NO_SIZE_LIMIT).size();
    }

     /**
     *  Retrieve total records found for specific parameters from partnermap table
     * @return total record found
     * @throws DAOException when something wrong
     */
    public int retrievePartnerIDResultSize(String partnerID, String zClientID, String identifier) throws DAOException {
        return retrievePartnerID(partnerID, zClientID, identifier, DEFAULT_REQ_PGE, NO_SIZE_LIMIT).size();
    }
}
