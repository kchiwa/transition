package com.abctech.transition.core.dao.partnerlogin;

import com.abctech.transition.core.exception.DAOException;
import org.springframework.stereotype.Component;

import java.util.List;

// should be a service
@Component
public interface IPartnerLoginManager {

    public PartnerLoginModel save(PartnerLoginModel partnerLoginModel) throws DAOException;

    public Boolean delete(Long id) throws DAOException;

    public PartnerLoginModel findById(Long id) throws DAOException;

    public PartnerLoginModel findByLogin(String login) throws DAOException;

    public List<PartnerLoginModel> findByCustomerFormat(String customerFormat) throws DAOException;

}
