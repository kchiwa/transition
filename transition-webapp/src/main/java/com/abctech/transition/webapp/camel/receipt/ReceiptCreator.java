package com.abctech.transition.webapp.camel.receipt;

import com.abctech.transition.core.TransitionProperties;
import com.abctech.transition.core.dao.adstate.IAdStateManager;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.core.exception.ReceiptCreatorException;
import org.apache.camel.Exchange;
import org.springframework.beans.factory.annotation.Autowired;

  public abstract  class ReceiptCreator {
	// this is reused by the children class and so should be protected
	@Autowired
	protected IAdStateManager adStateManager;

    @Autowired
    private TransitionProperties transitionProperties;

	public String receiptExchangecreator(Exchange exchange) throws DAOException, ReceiptCreatorException {
		String receipt = "receipt" ;
		return receipt ;
	}
}






