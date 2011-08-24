package com.abctech.transition.webapp.controller;

import com.abctech.transition.webapp.adminPing.SystemCheck;
import com.abctech.transition.webapp.model.SystemCheckModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Pun (pun@abctech-thailand.com)
 * @since 2011-03-23
 */

@Controller
public class SystemCheckController {
    private Logger log = LoggerFactory.getLogger(SystemCheckController.class);
    @Autowired
    private SystemCheck systemCheck;


    /**
     * Main mapping for SystemCheck page. Will call checking methods and returns status to frontend.
     *
     * @param model
     * @return System check results
     */
    @RequestMapping("/admin_system_check.html")
    public String adminSystemCheckMain(Model model) {
        log.debug("adminSystemCheck");
        SystemCheckModel systemCheckModel = new SystemCheckModel();
        StringBuilder sb = new StringBuilder();
        sb.append("\nSystem checking ::\n\n");
        sb.append(systemCheck.testAccessibility(systemCheckModel));
        sb.append(systemCheck.testDB(systemCheckModel));
        sb.append(systemCheck.testMemcached(systemCheckModel));
        model.addAttribute("SystemCheckResult", systemCheckModel);
        log.debug(ControllerUtil.putLogInBlock(sb.toString()));
        return "admin_system_check";
    }
}
