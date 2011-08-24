package com.abctech.transition.webapp.controller;

import com.abctech.transition.core.memcached.MemcachedTransactionManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemCachedController {
    private Logger log = LoggerFactory.getLogger(MemCachedController.class);

    @Autowired
    private MemcachedTransactionManager memcachedTransactionManager;

    @RequestMapping("/memcached.html")
    public String memcachedAction(Model model
            , @RequestParam(value = "action", required = false) String action
            , @RequestParam(value = "id", required = false) String id
            , @RequestParam(value = "type", required = false) String type) {
        String memCachedStatus = "The MemCached Server is  running.. <br>";
        if (!memcachedTransactionManager.set("status", "check status")) {
            memCachedStatus = "The MemCached Server is not running.. <br>";
            model.addAttribute("memCachedStatus", memCachedStatus);
            return "memcachestatus";
        }

        if (action == null) {
             memCachedStatus += "No Action to Execute...";
             model.addAttribute("memCachedStatus", memCachedStatus);
             return "memcachestatus";
        }

        if (action.equals("status")) {
            log.debug("Action = status " + memCachedStatus);
        } else if (action.equals("flush")) {
            if (memcachedTransactionManager.getClient().flushAll()) {
                memCachedStatus += "Flush MemCached Successfully....";
            }
            log.debug("Action = flush " + memCachedStatus);
        } else if (action.equals("delete")) {
            memCachedStatus += deleteMemCached(type,id);
        }else {
              memCachedStatus += "Invalid Action to Execute...";
        }
        model.addAttribute("memCachedStatus", memCachedStatus);
        return "memcachestatus";
    }

    private String deleteMemCached(String type,String id) {
        String key = null;
        String memCachedStatus;
            if (type.equals("filestate")) {
                key = MemcachedTransactionManager.FILE_STATE;
            }
            if (type.equals("adstate")) {
                key = MemcachedTransactionManager.AD_STATE;
            }
            if (type.equals("mediastate")) {
                key = MemcachedTransactionManager.MEDIA_STATE;
            }
            if (type.equals("valuemap")) {
                key = MemcachedTransactionManager.VALUEMAP;
            }

            if (key != null) {
                key += id;
            }


            if (memcachedTransactionManager.delete(key)) {
                memCachedStatus = "Delete Type= " + type + " and Id = " + id + " from MemCached Successfully....";
            } else {
                memCachedStatus = "Can Not Delete Type= " + type + " and Id = " + id + " from MemCached....";
            }
            log.debug("Action = delete " + memCachedStatus);
        return memCachedStatus;
    }
}
