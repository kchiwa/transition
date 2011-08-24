package com.abctech.transition.core.dao.statistic;

import com.abctech.transition.core.enumeration.CustomerFormat;
import com.googlecode.charts4j.*;
import org.joda.time.*;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Pun (pun@abctech-thailand.com)
 * @since 2011-06-08
 */
@Service
public class StatisticWorker {
	
	// FIXME no need for these declarations.
    private static final String AND_FILESTATE_CUSTOMERFORMAT = "AND filestate.customerformat ='";
    private static final String AND_FILESTATE_CLIENTNAME = " AND filestate.clientName = '";
    private static final String WHERE_FILESTATE_ID_EQ = " WHERE adstate.filestate_id = filestate.id ";
    private static final String DOUBLE_LINE_DOWN = "\n\n";
    private static final String TO_WITH_SPACED = " to ";
    private static final String DOUBLE_COLLON = " :: ";
    private Logger log = LoggerFactory.getLogger(StatisticWorker.class);
    @Autowired
    private JdbcTemplate jdbcTemplate;
    private DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd (HH:mm:ss)");
    private DateTimeFormatter graphFormatter = DateTimeFormat.forPattern("dd/MM/yyyy");
    private DateTimeFormatter onlyMonthFormatter = DateTimeFormat.forPattern("MMM yyyy");


    /**
     * Get a total number of ERROR Ad CustomerFormat, clientName.UNSUPPORTED for all.
     *
     * @param customerFormat format to show
     * @param clientName     to show
     * @return total number of ERROR Ad.
     */
    public int getTotalAdError(CustomerFormat customerFormat, String clientName) {
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT COUNT(id) FROM filestate WHERE status = 2 ");
        if (!customerFormat.equals(CustomerFormat.UNSUPPORTED)) {
            sql.append(" AND customerformat ='").append(customerFormat.toTextValue()).append("'");
        }
        if (!"".equals(clientName) && clientName != null) {
            sql.append(AND_FILESTATE_CLIENTNAME).append(clientName).append("'");
        }

        return jdbcTemplate.queryForInt(sql.toString());
    }


    /**
     * Get a total number of file handled by customerFormat, ClientName. CustomerFormat.UNSUPPORTED for all.
     *
     * @param customerFormat format to show
     * @param clientName     to show
     * @return total number of file handled
     */
    public int getTotalFileHandle(CustomerFormat customerFormat, String clientName) {
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT COUNT(id) FROM filestate ");
        if (!customerFormat.equals(CustomerFormat.UNSUPPORTED)) {
            sql.append(" WHERE customerformat ='").append(customerFormat.toTextValue()).append("'");
            if (!"".equals(clientName) && clientName != null) {
                sql.append(AND_FILESTATE_CLIENTNAME).append(clientName).append("'");
            }
        } else {
            if (!"".equals(clientName) && clientName != null) {
                sql.append(" WHERE filestate.clientName = '").append(clientName).append("'");
            }
        }

        return jdbcTemplate.queryForInt(sql.toString());
    }

    /**
     * Get a total number of ad handled by customerFormat. CustomerFormat.UNSUPPORTED for all.
     *
     * @param customerFormat format to show
     * @return total number of ad handled
     */
    public int getTotalAdHandle(CustomerFormat customerFormat) {
        StringBuilder sql = new StringBuilder();
        if (!customerFormat.equals(CustomerFormat.UNSUPPORTED)) {
            sql.append("SELECT COUNT(adstate.id) FROM filestate, adstate ");
            sql.append(WHERE_FILESTATE_ID_EQ);
            sql.append(AND_FILESTATE_CUSTOMERFORMAT).append(customerFormat.toTextValue()).append("'");
        } else {
            sql.append("SELECT COUNT(id) FROM adstate");
        }
        return jdbcTemplate.queryForInt(sql.toString());
    }

    /**
     * Get a total number of ad handled by customerFormat, ClientName. CustomerFormat.UNSUPPORTED for all.
     *
     * @param customerFormat format to show
     * @param clientName     to show
     * @return total number of ad handled
     */
    public int getTotalAdHandle(CustomerFormat customerFormat, String clientName) {
        StringBuilder sql = new StringBuilder();
        if (!customerFormat.equals(CustomerFormat.UNSUPPORTED)) {
            sql.append("SELECT COUNT(adstate.id) FROM filestate, adstate ");
            sql.append(WHERE_FILESTATE_ID_EQ);
            sql.append(AND_FILESTATE_CUSTOMERFORMAT).append(customerFormat.toTextValue()).append("'");
            if (!"".equals(clientName) && clientName != null) {
                sql.append(AND_FILESTATE_CLIENTNAME).append(clientName).append("'");
            }
        } else {
            //sql.append("SELECT COUNT(id) FROM adstate");
            sql.append("SELECT COUNT(adstate.id) FROM filestate, adstate ");
            sql.append(WHERE_FILESTATE_ID_EQ);
            if (!"".equals(clientName) && clientName != null) {
                sql.append(AND_FILESTATE_CLIENTNAME).append(clientName).append("'");
            }
        }
        return jdbcTemplate.queryForInt(sql.toString());
    }

    /**
     * Get a total number of media handled by customerFormat, ClientName. CustomerFormat.UNSUPPORTED for all.
     *
     * @param customerFormat format to show
     * @param clientName     to show
     * @return total number of media handled
     */
    public int getTotalMediaHandle(CustomerFormat customerFormat, String clientName) {
        StringBuilder sql = new StringBuilder();
        if (!customerFormat.equals(CustomerFormat.UNSUPPORTED)) {
            sql.append("SELECT COUNT(mediastate.id) FROM filestate, adstate, mediastate ");
            sql.append("WHERE mediastate.adstate_id = adstate.id ");
            sql.append("AND adstate.filestate_id = filestate.id ");
            sql.append(AND_FILESTATE_CUSTOMERFORMAT).append(customerFormat.toTextValue()).append("'");
            if (!"".equals(clientName) && clientName != null) {
                sql.append(AND_FILESTATE_CLIENTNAME).append(clientName).append("'");
            }
        } else {
            //sql.append("SELECT COUNT(id) FROM mediastate");
            sql.append("SELECT COUNT(mediastate.id) FROM filestate, adstate, mediastate ");
            sql.append(" WHERE mediastate.adstate_id = adstate.id ");
            sql.append(" AND adstate.filestate_id = filestate.id ");
            if (!"".equals(clientName) && clientName != null) {
                sql.append(AND_FILESTATE_CLIENTNAME).append(clientName).append("'");
            }
        }
        return jdbcTemplate.queryForInt(sql.toString());
    }

    /**
     * Get average number of ad handled per day by customerFormat, clientName. CustomerFormat.UNSUPPORTED for all.
     *
     * @param customerFormat to show
     * @return average number of ad handled per day
     */
    public double getTotalAverageAdPerDay(CustomerFormat customerFormat, String clientName) {
        DecimalFormat df = new DecimalFormat("#.00");
        double avg;
        DateTime mindate = new DateTime(retrieveMinDate(customerFormat, clientName));
        DateTime maxDate = new DateTime(retrieveMaxDate(customerFormat, clientName));
        Days daysBetween = Days.daysBetween(mindate, maxDate);
        if (daysBetween.getDays() == 0) {
            return Double.parseDouble(df.format(getTotalAdHandle(customerFormat, clientName)));
        } else {
            avg = (double) getTotalAdHandle(customerFormat, clientName) / daysBetween.getDays();
            return Double.parseDouble(df.format(avg));
        }

    }

    /**
     * Retrieve minimum date of received ad in the system by customerFormat, ClientName. CustomerFormat.UNSUPPORTED for all.
     *
     * @param customerFormat to show
     * @param clientName     to show
     * @return a minimum date
     */
    public long retrieveMinDate(CustomerFormat customerFormat, String clientName) {
        StringBuilder sqlStr = new StringBuilder();

        if (!customerFormat.equals(CustomerFormat.UNSUPPORTED)) {
            sqlStr.append("SELECT MIN(adstate.createdtime) FROM filestate, adstate ");
            sqlStr.append(WHERE_FILESTATE_ID_EQ);
            sqlStr.append(AND_FILESTATE_CUSTOMERFORMAT).append(customerFormat.toTextValue()).append("'");
        } else {
            sqlStr.append("SELECT MIN(adstate.createdtime) FROM filestate, adstate ");
            sqlStr.append(WHERE_FILESTATE_ID_EQ);
        }

        if (!"".equals(clientName) && clientName != null) {
            sqlStr.append(AND_FILESTATE_CLIENTNAME).append(clientName).append("'");
        }

        return jdbcTemplate.queryForLong(sqlStr.toString());
    }

    /**
     * Retrieve maximum date of received ad in the system by customerFormat, clientName. CustomerFormat.UNSUPPORTED for all.
     *
     * @param customerFormat to show
     * @param clientName     to show
     * @return a maximum date
     */
    public long retrieveMaxDate(CustomerFormat customerFormat, String clientName) {
        StringBuilder sql = new StringBuilder();
        if (!customerFormat.equals(CustomerFormat.UNSUPPORTED)) {
            sql.append("SELECT MAX(adstate.createdtime) FROM filestate, adstate ");
            sql.append(WHERE_FILESTATE_ID_EQ);
            sql.append(AND_FILESTATE_CUSTOMERFORMAT).append(customerFormat.toTextValue()).append("'");
        } else {
            //sql.append("SELECT MAX(createdtime) FROM adstate");
            sql.append("SELECT MAX(adstate.createdtime) FROM filestate, adstate ");
            sql.append(WHERE_FILESTATE_ID_EQ);

        }
        if (!"".equals(clientName) && clientName != null) {
            sql.append(AND_FILESTATE_CLIENTNAME).append(clientName).append("'");
        }
        return jdbcTemplate.queryForLong(sql.toString());
    }

    /**
     * Get a total distribution by customerFormat in a pieChart.
     *
     * @return an image URL for pieChart
     */
    public String getTotalDistribution() {
        List<PieChartDistribution> distributions = retrieveDistribution();
        calculateDistributionPercentage(distributions);
        String pieChartUrl = createPieChart(distributions);
        log.debug(DOUBLE_LINE_DOWN + "PieChartURL " + DOUBLE_COLLON + pieChartUrl + "\n");
        return pieChartUrl;
    }

    /**
     * Get a total distribution by customerFormat in a raw number.
     *
     * @return a list of customerFormat with rae number of ad handled.
     */
    public List<PieChartDistribution> retrieveDistribution() {
        ArrayList<PieChartDistribution> result = new ArrayList<PieChartDistribution>();
        List<String> customerFormatList = jdbcTemplate.queryForList("SELECT DISTINCT(customerformat) FROM filestate", String.class);
        if (customerFormatList != null) {
            for (String customerFormat : customerFormatList) {
                PieChartDistribution distribution = new PieChartDistribution();
                distribution.setFormat(CustomerFormat.fromTextValue(customerFormat));
                distribution.setRawItem(getTotalAdHandle(distribution.getFormat()));
                result.add(distribution);
            }
        }
        return result;
    }

    /**
     * Calculate distribution percentage
     *
     * @param distributions a list of raw number of ad handled by customerFormat
     */
    public void calculateDistributionPercentage(List<PieChartDistribution> distributions) {
        int total = 0;
        for (PieChartDistribution distribution : distributions) {
            total += distribution.getRawItem();
        }
        for (PieChartDistribution distribution : distributions) {
            if (total == 0) {
                distribution.setDistributionPercentage(0);
            } else {
                distribution.setDistributionPercentage(distribution.getRawItem() * 100 / (double) total);
            }

        }
    }

    /**
     * Create a pie chart with a distribution percentage.
     *
     * @param distributions a list of customerFormat with calculated distribution percentage
     * @return a image URL of pie chart
     */
    public String createPieChart(List<PieChartDistribution> distributions) {
        DecimalFormat df = new DecimalFormat("#.0");
        List<Slice> slices = new ArrayList<Slice>();
        for (PieChartDistribution distribution : distributions) {
            if ((int) distribution.getDistributionPercentage() > 0) {
                Slice slice = Slice.newSlice((int) distribution.getDistributionPercentage(), distribution.getFormat().toTextValue() + " " + df.format(distribution.getDistributionPercentage()) + "%");
                slices.add(slice);
            }
        }
        PieChart chart = GCharts.newPieChart(slices);
        chart.setTitle("", Color.BLACK, 18);
        chart.setSize(450, 200);
        return chart.toURLString();
    }

    /**
     * Get a seven day historical line graph of ad handled by the system.
     *
     * @param customerFormat customer format to diaplay
     * @param clientName client name to diaplay
     *
     * @return an image URL of line graph
     */
    public String getSevenDayHistoricalLineGraph(CustomerFormat customerFormat, String clientName) {
        DateMidnight end = new DateTime(System.currentTimeMillis()).toDateMidnight();
        DateMidnight begin = end.minus(Days.SEVEN);
        log.debug(DOUBLE_LINE_DOWN + begin.toString(formatter) + DOUBLE_COLLON + end.toString(formatter) + "\n");
        List<HistoricalLineGraphPlot> historicalLineGraphPlots = new ArrayList<HistoricalLineGraphPlot>();
        for (int i = 1; i <= 7; i++) {
            HistoricalLineGraphPlot plot = new HistoricalLineGraphPlot();
            plot.setBegin(begin.plusDays(i).getMillis());
            plot.setEnd(begin.plusDays(i + 1).getMillis());
            plot.setKey(new DateTime(begin.plusDays(i).getMillis()).toString(graphFormatter));
            log.debug(new DateTime(plot.getBegin()).toString(formatter) + TO_WITH_SPACED + new DateTime(plot.getEnd()).toString(formatter));
            historicalLineGraphPlots.add(plot);
        }
        retrievePlotFromDatabase(historicalLineGraphPlots, customerFormat, clientName);
        return createLineGraph(historicalLineGraphPlots);
    }

    /**
     * Get a four week historical line graph of ad handled by the system.
     *
     * @param customerFormat customer format to display.
     * @param clientName client name to display.
     * @return an image URL of line graph
     */
    public String getFourWeekHistoricalLineGraph(CustomerFormat customerFormat, String clientName) {
        DateMidnight end = new DateTime(System.currentTimeMillis()).toDateMidnight();
        DateMidnight begin = end.minus(Weeks.weeks(4)).withDayOfWeek(1);
        log.debug(DOUBLE_LINE_DOWN + begin.toString(formatter) + DOUBLE_COLLON + end.toString(formatter) + "\n");
        List<HistoricalLineGraphPlot> historicalLineGraphPlots = new ArrayList<HistoricalLineGraphPlot>();
        for (int i = 1; i <= 4; i++) {
            HistoricalLineGraphPlot plot = new HistoricalLineGraphPlot();
            plot.setBegin(begin.plusWeeks(i).getMillis());
            plot.setEnd(begin.plusWeeks(i + 1).getMillis());
            plot.setKey(new DateTime(plot.getBegin()).toString(graphFormatter) + TO_WITH_SPACED + new DateTime(plot.getEnd()).toString(graphFormatter));
            log.debug(new DateTime(plot.getBegin()).toString(formatter) + TO_WITH_SPACED + new DateTime(plot.getEnd()).toString(formatter));
            historicalLineGraphPlots.add(plot);
        }
        retrievePlotFromDatabase(historicalLineGraphPlots, customerFormat, clientName);
        return createLineGraph(historicalLineGraphPlots);
    }

    /**
     * Get a three month historical line graph of ad handled by the system.
     *
     * @param months number of months to see history
     * @param customerFormat customer format to display.
     * @param clientName client name to display.
     * @return an image URL of line graph
     */
    public String getNMonthHistoricalLineGraph(Months months, CustomerFormat customerFormat, String clientName) {
        DateMidnight end = new DateTime(System.currentTimeMillis()).toDateMidnight();
        DateMidnight begin = end.minus(months).withDayOfMonth(1);
        log.debug(DOUBLE_LINE_DOWN + begin.toString(formatter) + DOUBLE_COLLON + end.toString(formatter) + "\n");
        List<HistoricalLineGraphPlot> historicalLineGraphPlots = new ArrayList<HistoricalLineGraphPlot>();
        for (int i = 1; i <= months.getMonths(); i++) {
            HistoricalLineGraphPlot plot = new HistoricalLineGraphPlot();
            plot.setBegin(begin.plusMonths(i).getMillis());
            plot.setEnd(begin.plusMonths(i + 1).getMillis());
            plot.setKey(new DateTime(plot.getBegin()).toString(onlyMonthFormatter));
            log.debug(new DateTime(plot.getBegin()).toString(formatter) + TO_WITH_SPACED + new DateTime(plot.getEnd()).toString(formatter));
            historicalLineGraphPlots.add(plot);
        }
        retrievePlotFromDatabase(historicalLineGraphPlots, customerFormat, clientName);
        return createLineGraph(historicalLineGraphPlots);
    }

     /**
     * Get a raw number of ad handled by a period
     *
     * @param historicalLineGraphPlots with raw number of ad in a period
      * @param customerFormat customer format to display
      * @param clientName client Name to display
      *
     */
    public void retrievePlotFromDatabase(List<HistoricalLineGraphPlot> historicalLineGraphPlots, CustomerFormat customerFormat, String clientName) {
        for (HistoricalLineGraphPlot plot : historicalLineGraphPlots) {
            StringBuilder sql = new StringBuilder();
            sql.append("SELECT COUNT(adstate.id) FROM adstate, filestate WHERE adstate.filestate_id = filestate.id " +
                    "AND modifiedtime BETWEEN ");
            sql.append(plot.getBegin()).append(" AND ").append(plot.getEnd());
            if (!customerFormat.equals(CustomerFormat.UNSUPPORTED)) {
                sql.append(" AND filestate.customerformat = '").append(customerFormat.toTextValue()).append("'");
            }
            if(!"".equals(clientName) && clientName != null) {
                sql.append(" AND filestate.clientname =  '").append(clientName).append("'");
            }
            plot.setValue(jdbcTemplate.queryForInt(sql.toString()));
            log.debug(sql.toString() + DOUBLE_COLLON + plot.getValue());
        }
    }

    /**
     * Create a historical line graph from calculated plot positions
     *
     * @param historicalLineGraphPlots with calculated plot positions
     * @return an image URL for line graph
     */
    public String createLineGraph(List<HistoricalLineGraphPlot> historicalLineGraphPlots) {
        List<Double> plotPosition = new ArrayList<Double>();
        List<String> plotLabel = new ArrayList<String>();
        List<Double> plotScale = new ArrayList<Double>();
        plotPosition.add(0.0); // Default start at 0.0
        calculatePlotPosition(historicalLineGraphPlots);
        for (HistoricalLineGraphPlot plot : historicalLineGraphPlots) {
            log.debug(plot.getKey() + DOUBLE_COLLON + plot.getPlotPosition());
            plotPosition.add(plot.getPlotPosition());
        }
        int pos = 0;
        for (int i = 0; i < historicalLineGraphPlots.size(); i++) {
            plotLabel.add("(" + historicalLineGraphPlots.get(i).getValue() + ") " + historicalLineGraphPlots.get(i).getKey());
            pos += 100 / (double) historicalLineGraphPlots.size();
            plotScale.add((double) pos);
        }
        Plot plot = Plots.newPlot(Data.newData(plotPosition));
        LineChart chart = GCharts.newLineChart(plot);
        chart.setSize(870, 180);
        chart.setGrid(100 / (double) historicalLineGraphPlots.size(), 33.3, 3, 3);
        chart.addXAxisLabels(AxisLabelsFactory.newAxisLabels(plotLabel, plotScale));
        String lineChartUrl = chart.toURLString();
        log.debug("\n\n LineChartURL " + DOUBLE_COLLON + lineChartUrl + "\n");
        return lineChartUrl;
    }

    /**
     * Calculate plot position from raw number id ad
     *
     * @param historicalLineGraphPlots a list of raw number of ad
     */
    public void calculatePlotPosition(List<HistoricalLineGraphPlot> historicalLineGraphPlots) {
        int total = 0;
        for (HistoricalLineGraphPlot plot : historicalLineGraphPlots) {
            total += plot.getValue();
        }

        for (HistoricalLineGraphPlot plot : historicalLineGraphPlots) {
            if (total == 0) {
                plot.setPlotPosition(0);
            } else {
                plot.setPlotPosition(plot.getValue() * 100 / (double) total);
            }
        }
    }

    /**
     * A private class for keeping pie chart information
     */
    private static class PieChartDistribution {
        private CustomerFormat format;
        private int rawItem;
        private double distributionPercentage;

        public CustomerFormat getFormat() {
            return format;
        }

        public void setFormat(CustomerFormat format) {
            this.format = format;
        }

        public int getRawItem() {
            return rawItem;
        }

        public void setRawItem(int rawItem) {
            this.rawItem = rawItem;
        }

        public double getDistributionPercentage() {
            return distributionPercentage;
        }

        public void setDistributionPercentage(double distributionPercentage) {
            this.distributionPercentage = distributionPercentage;
        }
    }

    /**
     * A private class for keeping line graph information
     */
    private static class HistoricalLineGraphPlot {
        private String key;
        private int value;
        private Long begin;
        private Long end;
        private double plotPosition;

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Long getBegin() {
            return begin;
        }

        public void setBegin(Long begin) {
            this.begin = begin;
        }

        public Long getEnd() {
            return end;
        }

        public void setEnd(Long end) {
            this.end = end;
        }

        public double getPlotPosition() {
            return plotPosition;
        }

        public void setPlotPosition(double plotPosition) {
            this.plotPosition = plotPosition;
        }
    }
}
