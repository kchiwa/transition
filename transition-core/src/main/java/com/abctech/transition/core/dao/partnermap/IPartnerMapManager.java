package com.abctech.transition.core.dao.partnermap;

import com.abctech.transition.core.exception.DAOException;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface IPartnerMapManager {
    public PartnerMapModel save(PartnerMapModel partnerMapModel) throws DAOException;

    public Boolean delete(Long id) throws DAOException;

    public PartnerMapModel findById(Long id) throws DAOException;

    public List<PartnerMapModel> findByPartnerLoginId(Long partnerMapId) throws DAOException;

    public  PartnerMapModel  findByIdentifier(String identifier) throws DAOException;

}
