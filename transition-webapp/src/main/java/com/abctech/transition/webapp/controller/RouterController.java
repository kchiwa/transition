package com.abctech.transition.webapp.controller;

import com.abctech.transition.core.dao.router.IRouterManager;
import com.abctech.transition.core.dao.router.RouterModel;
import com.abctech.transition.core.dao.schedulerstate.HttpFecthSchedulerModel;
import com.abctech.transition.core.dao.schedulerstate.IHttpFecthSchedulerManager;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.webapp.manager.camel.QuartzRouteManager;
import com.abctech.transition.webapp.manager.camel.RouteManager;
import com.abctech.transition.webapp.model.RouterListModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class RouterController {
    private static final String FTP_ROUTE = "FtpRoute";
    private static final String SCHEDULER_fORM = "scheduler_form";
    private Logger log = LoggerFactory.getLogger(RouterController.class);

    @Autowired
    private RouteManager routeManager;

    @Autowired
    private IRouterManager routerManager;

    @Autowired
    private IHttpFecthSchedulerManager httpFecthSchedulerManager;



    @Autowired
    private QuartzRouteManager quartzRouteManager;


    @RequestMapping("/router.html")
    public String routerPage(Model model
            , @RequestParam(value = "routerId", required = false) String routerId
            , @RequestParam(value = "active", required = false) String active
    ) throws DAOException {
        if (routerId != null) {
            model.addAttribute("message", toggleSwitch(Integer.parseInt(routerId), active));
        }
        List<RouterModel> ftpRouterModels = routerManager.findAll();
        List<RouterListModel> routerListModels = routeManager.retrieveRoutersServiceStatus();
        List<HttpFecthSchedulerModel> httpFecthSchedulerModel = httpFecthSchedulerManager.listRSSFecthScheduler();
        model.addAttribute("schedulerList", httpFecthSchedulerModel);
        model.addAttribute("router", ftpRouterModels);
        model.addAttribute("routerList", routerListModels);
        return "router";
    }

    public String toggleSwitch(int id, String active) throws DAOException {
        RouterModel routerModel = routerManager.findById(id);
        String routerName = routerModel.getCustomerFormat();
        String result;
        if (active.equals("true")) {
            routeManager.stopRoute(routerName);
            routerModel.setActive(false);
            log.info("Stoped FTP router : " + routerName + FTP_ROUTE);
            result = "Stoped  : " + routerName + FTP_ROUTE;
        } else {
            routeManager.startRoute(routerName);
            routerModel.setActive(true);
            log.info("Started FTP router : " + routerName + FTP_ROUTE);
            result = "Started : " + routerName + FTP_ROUTE;
        }
        routerManager.save(routerModel);
        return result;
    }

    @RequestMapping("/setscheduler.html")
    public String quartzroutes(@RequestParam(value = "shedulerId", required = false) String id ,
                               @RequestParam(value = "clientname" , required = false)String clientName ,
                               @RequestParam(value = "active" , required = false) String active)
            throws DAOException {

        if (id != null) {
          HttpFecthSchedulerModel httpFecthSchedulerModel = httpFecthSchedulerManager.loadById(Long.parseLong(id)) ;


            if(httpFecthSchedulerModel.getActive() == true){
                httpFecthSchedulerModel.setActive(false);

            } else {
                httpFecthSchedulerModel.setActive(true);
            }

            log.debug("httpFecthSchedulerModel : " +httpFecthSchedulerModel);
            log.debug("getActive : " +httpFecthSchedulerModel.getActive());
            log.debug("id : " +httpFecthSchedulerModel.getId());
            httpFecthSchedulerManager.save(httpFecthSchedulerModel);
            quartzRouteManager.reInitQuartzRoute(clientName);

        }

        return "redirect:router.html";
    }
}









