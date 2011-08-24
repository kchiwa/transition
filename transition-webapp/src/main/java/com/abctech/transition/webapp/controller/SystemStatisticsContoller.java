package com.abctech.transition.webapp.controller;

import com.abctech.transition.core.dao.statistic.StatisticModel;
import com.abctech.transition.core.dao.statistic.StatisticWorker;
import com.abctech.transition.core.enumeration.CustomerFormat;
import com.abctech.transition.core.exception.DAOException;
import com.abctech.transition.webapp.form.StatisticFilterForm;
import org.joda.time.Months;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Pun (pun@abctech-thailand.com)
 * @since 2011-06-07
 */

@Controller
public class SystemStatisticsContoller {
    private Logger log = LoggerFactory.getLogger(SystemStatisticsContoller.class);

    private static final String STATISTIC_FILTER_FORM = "statisticFilterForm";
    private static final String FILTER_STATISTIC = "filter_statistic";
    private static final String HTML_EXT = ".html";
    private static final String DEFAULT_REQ_PAGE = "1";
    private static final String CUSTOMER_FORMAT_LIST = "customerFormatList";
    public static final String REDIRECT_ACCESSDENIED_HTML = "redirect:/accessdenied.html";

    @Autowired
    private StatisticWorker statisticWorker;

    @ModelAttribute(STATISTIC_FILTER_FORM)
    public StatisticFilterForm createStatisticFilterForm() {
        return new StatisticFilterForm();
    }

    @RequestMapping("/admin_system_statistics.html")
    public String entryPage(Model model) {
        log.debug("admin_system_statistics.html");

        String clientName = "";
        StatisticModel statModel = new StatisticModel();
        statModel.setTotalFileHandled(statisticWorker.getTotalFileHandle(CustomerFormat.UNSUPPORTED, clientName));
        statModel.setTotalAdHandled(statisticWorker.getTotalAdHandle(CustomerFormat.UNSUPPORTED, clientName));
        statModel.setTotalMediaHandled(statisticWorker.getTotalMediaHandle(CustomerFormat.UNSUPPORTED, clientName));
        statModel.setTotalAvgAdPerDay(statisticWorker.getTotalAverageAdPerDay(CustomerFormat.UNSUPPORTED, clientName));
        statModel.setUrlTotalPieChart(statisticWorker.getTotalDistribution());
        statModel.setUrlSevenDayLineGraph(statisticWorker.getSevenDayHistoricalLineGraph(CustomerFormat.UNSUPPORTED, clientName));
        statModel.setUrlFourWeekLineGraph(statisticWorker.getFourWeekHistoricalLineGraph(CustomerFormat.UNSUPPORTED, clientName));
        statModel.setUrlThreeMonthLineGraph(statisticWorker.getNMonthHistoricalLineGraph(Months.THREE, CustomerFormat.UNSUPPORTED, clientName));
        statModel.setUrlSixMonthLineGraph(statisticWorker.getNMonthHistoricalLineGraph(Months.SIX, CustomerFormat.UNSUPPORTED, clientName));
        statModel.setTotalErrorAd(statisticWorker.getTotalAdError(CustomerFormat.UNSUPPORTED, clientName));
        model.addAttribute(CUSTOMER_FORMAT_LIST, ControllerUtil.getCustomerFormatList());
        model.addAttribute("statistics", statModel);
        return "admin_system_statistics";
    }

    /**
     * Mapping for Filter Statistic page
     *
     * @param model               for attaching queried result and some variables used in frontend
     * @param statisticFilterForm containing search form information
     * @return admin_system_statistics page with search results
     * @throws com.abctech.transition.core.exception.DAOException
     *          when something wrong
     */
    @RequestMapping(value = "/" + FILTER_STATISTIC + HTML_EXT, method = RequestMethod.POST)
    public String adminPartnerLookup(Model model
            , @ModelAttribute(STATISTIC_FILTER_FORM) StatisticFilterForm statisticFilterForm) throws DAOException {

        if (statisticFilterForm.getRequestPage() == null) {
            statisticFilterForm.setRequestPage(DEFAULT_REQ_PAGE);
        }
        String customerFormat = statisticFilterForm.getCustomerFormat();
        String clientName = statisticFilterForm.getClientName();

        StatisticModel statModel = new StatisticModel();
        setStatisticModelWithCustomerFormatAndClientName(statModel, customerFormat, clientName);
        model.addAttribute(CUSTOMER_FORMAT_LIST, ControllerUtil.getCustomerFormatList());
        model.addAttribute("statistics", statModel);

        return "admin_system_statistics";
    }

    /**
     * Set StatisticModel data whit customer format and client name
     *
     * @param  model StatisticModel to full data
     * @param customerFormatStr customer format to show
     * @return clientName client name to show
     *
     */
    private void setStatisticModelWithCustomerFormatAndClientName(StatisticModel model, String customerFormatStr, String clientName) {

        CustomerFormat customerFormat = CustomerFormat.fromTextValue(customerFormatStr);
        if (null == customerFormat) {
            customerFormat = CustomerFormat.UNSUPPORTED;
        }

        model.setTotalFileHandled(statisticWorker.getTotalFileHandle(customerFormat, clientName));
        model.setTotalAdHandled(statisticWorker.getTotalAdHandle(customerFormat, clientName));
        model.setTotalMediaHandled(statisticWorker.getTotalMediaHandle(customerFormat, clientName));
        model.setTotalAvgAdPerDay(statisticWorker.getTotalAverageAdPerDay(customerFormat, clientName));
        model.setUrlTotalPieChart(statisticWorker.getTotalDistribution());
        model.setUrlSevenDayLineGraph(statisticWorker.getSevenDayHistoricalLineGraph(customerFormat, clientName));
        model.setUrlFourWeekLineGraph(statisticWorker.getFourWeekHistoricalLineGraph(customerFormat, clientName));
        model.setUrlThreeMonthLineGraph(statisticWorker.getNMonthHistoricalLineGraph(Months.THREE, customerFormat, clientName));
        model.setUrlSixMonthLineGraph(statisticWorker.getNMonthHistoricalLineGraph(Months.SIX, customerFormat, clientName));
        model.setTotalErrorAd(statisticWorker.getTotalAdError(customerFormat, clientName));
    }
}
