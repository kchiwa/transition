package com.abctech.transition.core.utility;

import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * FIXME CR:2011-08-15
 * APDM has agreeing on not to use author.
 * @author Pun (pun@abctech-thailand.com)
 * @since 2011-07-28
 */
public class TransitionTimer {
    private Logger log = LoggerFactory.getLogger(TransitionTimer.class);
    private String name;
    private DateTime start;
    private DateTime finish;

    public TransitionTimer(String timerName) {
        this.name = timerName;
    }

    public void start() {
        this.setStart(new DateTime());
    }

    public long finish() {
        this.setFinish(new DateTime());
        long timeUsed = (finish.getMillis() - start.getMillis());
        log.info(name + " finished using :: " + timeUsed + " ms");
        return timeUsed;
    }

    private void setStart(DateTime start) {
        this.start = start;
    }

    private void setFinish(DateTime end) {
        this.finish = end;
    }
}
