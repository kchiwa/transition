package com.abctech.transition.webapp.camel.routes;

import com.abctech.transition.core.enumeration.QueueName;
import com.abctech.transition.core.enumeration.TransitionRouter;
import com.abctech.transition.core.names.HeaderName;
import com.abctech.transition.webapp.camel.FailAdHandler;
import com.abctech.transition.webapp.camel.receipt.ReceiptHandlerComponent;
import org.springframework.beans.factory.annotation.Autowired;

public class ErrorAndReceiptRoute extends ARouteSupport {

    @Autowired
    private ReceiptHandlerComponent receiptHandlerComponent;

    @Override
    public void configure() {

        onException(Exception.class)
                .handled(true)
                .log("Got exeception in ErrorAndReceiptRoute")
                .end();

        from(QueueName.PREPARE_PROCESS_ERROR_QUEUE.toTextValue()).routeId(TransitionRouter.PREPARE_ERROR_QUEUE.toTextValue())
                .setHeader(HeaderName.RESULT_UPLOAD, simple("Failed"))
                .multicast().parallelProcessing().to(QueueName.ERROR_QUEUE.toTextValue(), "activemq:queue.copy.delete", QueueName.RECEIPT_QUEUE.toTextValue());
        // FIXME this route should be named activemq:queue.failadhandling, and put into QueueName
        from("activemq:queue.copy.delete").bean(FailAdHandler.class).routeId(TransitionRouter.FAIL_AD_HANDLING.toTextValue());


        from(QueueName.RECEIPT_QUEUE.toTextValue()).routeId(TransitionRouter.RECEIPT.toTextValue())
        .bean(receiptHandlerComponent, "createReceipt")
        .recipientList(header("receipt"))
        .end();

    }

}
