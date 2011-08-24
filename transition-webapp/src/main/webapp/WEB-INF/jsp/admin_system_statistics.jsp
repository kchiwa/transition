<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="template/admin_header.jsp" %>

        <%@ include file="template/admin_main_nav.jsp" %>
        <hr/>
        <div class="span-24 last" id="header">
           <h3 class="greyMore">Statistics</h3><hr />
        </div>

        <div class="span-24 last grey" id="statistics">

        <div class="span-6 statHeader last "><div class="prepend-05">Transition</div></div>

        <div class="span-6 colborder" id="sidebar">

                  <div id="sidebar_link" class="span-5 last">

                  </div>

                  <div class="searchTitle">Filter</div>

                  <div id="searchFile">
                     <form:form method="POST" action="./filter_statistic.html" commandName="statisticFilterForm">

                      <div class="span-2 margintopsearch"><label for="customerFormat" class="searchField">Format</label></div>
                      <div class="span-3 last">
                        <form:select path="customerFormat" id="customerFormat" name="customerFormat" class="width100 grey">
                              <form:option value="show_all">show all</form:option>
                              <c:forEach items="${customerFormatList}" var="customerFormat">
                                 <form:option value="${customerFormat}">${customerFormat}</form:option>
                              </c:forEach>
                        </form:select>
                      </div>

                      <div class="span-2 margintopsearch"><label for="clientName" class="searchField">Client Name</label></div>
                      <div class="span-3 last"><form:input path="clientName" class="search" name="clientName" id="clientName" /></div>

                      <form:hidden id="requestPage" name="requestPage" path="requestPage" value="1"/>
                      <div class="span-5 prepend-2 last"><button type="submit" class="button">search</button></div>
                  </form:form>
                  </div>

              <div id="error" class="span-5 last">
                <c:if test="${!empty searchError}">
                    <div class="error">${searchError}</div>
                </c:if>
              </div>
        </div>

        <div class="span-8 statHeader last "><div class="prepend-05">&nbsp;</div></div>
        <div class="span-8 statHeader last "><div class="prepend-05">&nbsp;</div></div>
        <div class="span-8 statHeader last "><div class="prepend-05">&nbsp;</div></div>

        <div class="span-6 greyMore">
           <div class="prepend-05">
                <div class="statUnderline"><strong>FILE HANDLED</strong></div>
                <div class="statNumber">${statistics.totalFileHandled}</div>
           </div>
        </div>
        <div class="span-6 greyMore">
           <div class="prepend-05">
                <div class="statUnderline"><strong>ADVERTISEMENT HANDLED</strong></div>
                <div class="statNumber">${statistics.totalAdHandled}</div>
           </div>
        </div>
        <div class="span-6 greyMore">
           <div class="prepend-05">
                <div class="statUnderline"><strong>MEDIA HANDLED</strong></div>
                <div class="statNumber">${statistics.totalMediaHandled}</div>
           </div>
        </div>
        <div class="span-6 greyMore last ">
           <div class="prepend-05">
                <div class="statUnderline"><strong>TOTAL</strong></div>
                <div class="statNumber">${statistics.totalFileHandled + statistics.totalAdHandled + statistics.totalMediaHandled}</div>
           </div>
        </div>

        <div class="span-6 greyMore ">
           <div class="prepend-05">
                <div class="statUnderline"><strong>AVG ADVERTISEMENT PER DAY</strong></div>
                <div class="statNumber2">${statistics.totalAvgAdPerDay}</div>
           </div>
        </div>

        <div class="span-6 greyMore">
           <div class="prepend-05">
                <div class="statUnderline"><strong>ADVERTISEMENT ERROR</strong></div>
                <div class="statNumber2">${statistics.totalErrorAd}</div>
           </div>
        </div>

        <div class="span-12 greyMore last">
           <div class="prepend-05">
                <div class="statUnderline"><strong>TOTAL AD DISTRIBUTION</strong></div>
                <div class="statNumber"><img src="${statistics.urlTotalPieChart}"></div>
           </div>
        </div>

        <div class="span-24 greyMore last">
           <div class="prepend-05">
                <div class="statUnderline"><strong>Historical Statistic (7 days)</strong></div>
                <div class="statNumber margintop13 textCenter"><img src="${statistics.urlSevenDayLineGraph}"></div>
           </div>
        </div>

        <div class="span-24 greyMore last">
           <div class="prepend-05">
                <div class="statUnderline"><strong>Historical Statistic (4 Weeks)</strong></div>
                <div class="statNumber margintop13 textCenter"><img src="${statistics.urlFourWeekLineGraph}"></div>
           </div>
        </div>

        <div class="span-24 greyMore last">
           <div class="prepend-05">
                <div class="statUnderline"><strong>Historical Statistic (3 Months)</strong></div>
                <div class="statNumber margintop13 textCenter"><img src="${statistics.urlThreeMonthLineGraph}"></div>
           </div>
        </div>

        <div class="span-24 greyMore last">
           <div class="prepend-05">
                <div class="statUnderline"><strong>Historical Statistic (6 Months)</strong></div>
                <div class="statNumber margintop13 textCenter"><img src="${statistics.urlSixMonthLineGraph}"></div>
           </div>
        </div>




        </div>

<%@ include file="template/admin_footer.jsp" %>