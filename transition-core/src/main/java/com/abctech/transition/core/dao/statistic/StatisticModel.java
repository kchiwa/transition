package com.abctech.transition.core.dao.statistic;

/**
 * @author Pun (pun@abctech-thailand.com)
 * @since 2011-06-08
 */
public class StatisticModel {
    private int totalFileHandled;
    private int totalAdHandled;
    private int totalMediaHandled;
    private double totalAvgAdPerDay;
    private String urlTotalPieChart;
    private String urlSevenDayLineGraph;
    private String urlFourWeekLineGraph;
    private String urlThreeMonthLineGraph;
    private String urlSixMonthLineGraph;
    private int totalErrorAd;

    public int getTotalFileHandled() {
        return totalFileHandled;
    }

    public void setTotalFileHandled(int totalFileHandled) {
        this.totalFileHandled = totalFileHandled;
    }

    public int getTotalAdHandled() {
        return totalAdHandled;
    }

    public int getTotalErrorAd() {
        return totalErrorAd;
    }

    public void setTotalErrorAd(int totalErrorAd) {
        this.totalErrorAd = totalErrorAd;
    }

    public void setTotalAdHandled(int totalAdHandled) {
        this.totalAdHandled = totalAdHandled;
    }

    public int getTotalMediaHandled() {
        return totalMediaHandled;
    }

    public void setTotalMediaHandled(int totalMediaHandled) {
        this.totalMediaHandled = totalMediaHandled;
    }

    public String getUrlTotalPieChart() {
        return urlTotalPieChart;
    }

    public void setUrlTotalPieChart(String urlTotalPieChart) {
        this.urlTotalPieChart = urlTotalPieChart;
    }

    public String getUrlSevenDayLineGraph() {
        return urlSevenDayLineGraph;
    }

    public void setUrlSevenDayLineGraph(String urlSevenDayLineGraph) {
        this.urlSevenDayLineGraph = urlSevenDayLineGraph;
    }

    public double getTotalAvgAdPerDay() {
        return totalAvgAdPerDay;
    }

    public void setTotalAvgAdPerDay(double totalAvgAdPerDay) {
        this.totalAvgAdPerDay = totalAvgAdPerDay;
    }

    public String getUrlFourWeekLineGraph() {
        return urlFourWeekLineGraph;
    }

    public void setUrlFourWeekLineGraph(String urlFourWeekLineGraph) {
        this.urlFourWeekLineGraph = urlFourWeekLineGraph;
    }

    public String getUrlThreeMonthLineGraph() {
        return urlThreeMonthLineGraph;
    }

    public void setUrlThreeMonthLineGraph(String urlThreeMonthLineGraph) {
        this.urlThreeMonthLineGraph = urlThreeMonthLineGraph;
    }

    public String getUrlSixMonthLineGraph() {
        return urlSixMonthLineGraph;
    }

    public void setUrlSixMonthLineGraph(String urlSixMonthLineGraph) {
        this.urlSixMonthLineGraph = urlSixMonthLineGraph;
    }
}
