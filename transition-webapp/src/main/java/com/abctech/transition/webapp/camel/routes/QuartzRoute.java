package com.abctech.transition.webapp.camel.routes;

import com.abctech.transition.core.enumeration.TransitionRouter;
import com.abctech.transition.webapp.camel.ArchiveFileComponent;
import com.abctech.transition.webapp.camel.IdenticalQueueDeleteComponent;
import com.abctech.transition.webapp.camel.MediaDeleteComponent;
import com.abctech.transition.webapp.camel.MissingMediaHandler;
import org.apache.camel.LoggingLevel;

public class QuartzRoute extends ARouteSupport {

    private static final String TRIGGER_REPEAT_COUNT_MINUS_1 = "&trigger.repeatCount=-1";

    @Override
    public void configure() {

        // Scheduler for NOVASOL
       /*from("quartz://downloadNovasolFile?fireNow=false&cron=0 20 10 * * ?" + TRIGGER_REPEAT_COUNT_MINUS_1).routeId(TransitionRouter.NOVALSOL_DOWNLOAD.toTextValue())
                .log("=================Start Download Novasol File=================")
                .setHeader(HeaderName.CLIENT_NAME,simple(CustomerFormat.NOVASOL.toTextValue()))
                .bean(NovasolDowloadComponent.class); */


        //update .archive component to 6 hours
        from("quartz://clearFTPFolder?trigger.repeatInterval=6h" + TRIGGER_REPEAT_COUNT_MINUS_1)
                .bean(ArchiveFileComponent.class, "clearFTPFolder")
                .routeId(TransitionRouter.ARCHIVE_FILE.toTextValue());

        from("quartz://clearReceiptFile?cron=0 0 6 * * ?")
                .bean(ArchiveFileComponent.class, "clearReceiptFile")
                .routeId(TransitionRouter.ARCHIVE_RECEIPT_FILE.toTextValue());

        //Router for MissingMediaHandler
        //this bean will consume message from QueueName.MEDIA_MISSING
        //if timeout send to MEDIA_COPY queue otherwise send to to MEDIA_HANDLER queue
        from("quartz://MissingMediaHandlerTimer?fireNow=false&trigger.repeatInterval=" + getTransitionProperties().getMissingMediaTimerInMillis() + TRIGGER_REPEAT_COUNT_MINUS_1)
                //.log(LoggingLevel.DEBUG, "running missing mediahandler.")
        		.bean(MissingMediaHandler.class, "consumeMissingMediaQueue")
                .routeId(TransitionRouter.MEDIA_MISSING.toTextValue());

        //Router for MediaDeleteComponent
        //this bean will consume message from QueueName.MEDIA_MISSING
        //if timeout send to MEDIA_COPY queue otherwise send to to MEDIA_HANDLER queue
        String deleteMediaTimer = getTransitionProperties().getDeleteMediaTimerInHours() + "h";
        //For demo
        //String deleteMediaTimer = "5s";
        from("quartz://MediaDeleteComponentTimer?fireNow=false&trigger.repeatInterval=" + deleteMediaTimer + TRIGGER_REPEAT_COUNT_MINUS_1)
                .log(LoggingLevel.DEBUG, "running MediaDeleteComponentTimer.")
                .bean(MediaDeleteComponent.class, "deleteMediaFile")
                .routeId(TransitionRouter.DELETE_MEDIA.toTextValue());

        String identicalDeleteTimer = getTransitionProperties().getDeleteIdenticalQueueTimerInHours() + "h";
        //for demo
        //identicalDeleteTimer = "20000";
        from("quartz://IndenticalDeleteComponentTimer?trigger.repeatInterval=" + identicalDeleteTimer + TRIGGER_REPEAT_COUNT_MINUS_1)
                .log(LoggingLevel.DEBUG, "running IndenticalDeleteComponentTimer.")
                .bean(IdenticalQueueDeleteComponent.class, "clearIdenticalQueue")
                .routeId(TransitionRouter.IDENTICAL_QUEUE_DELETE.toTextValue());
    }

}
