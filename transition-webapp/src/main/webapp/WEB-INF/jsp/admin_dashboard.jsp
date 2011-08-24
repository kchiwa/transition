<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="template/admin_header.jsp" %>

        <%@ include file="template/admin_main_nav.jsp" %>
        <hr/>
        <div class="span-24 last" id="header">
           <h3 class="grey">Dashboard</h3><hr />
        </div>
        ${zettSite}

        <div class="span-5 colborder" id="sidebar">

                  <div id="sidebar_link" class="span-5 last">


                  </div>


                  <div class="systemCheck">
                    <c:if test="${SystemCheck == 'OK'}">
                        System Check : <span class='ok'>OK</span>
                    </c:if>
                    <c:if test="${SystemCheck == 'ERROR'}">
                        System Check : <span class='err'><a href="admin_system_check.html">ERROR</a><span>
                    </c:if>
                  </div>

                  <div class="systemCheck">
                    <c:choose>
                        <c:when test="${ErrorQueueItem == '0'}">
                            Advertisement Error : <span class='ok'>0</span>
                        </c:when>
                        <c:otherwise>
                            Error(s) in queue : <span class='err'><a href="queue_list.html?queueName=${ErrorQueueName}">${ErrorQueueItem}</a></span>
                        </c:otherwise>
                    </c:choose>
                  </div>

                  <div class="systemCheckStatus">
                    <br/>
                    <div><strong>Latest import <span class="small quiet"><a href="admin_system_status.html">(more info)</a></span></strong></div>
                    <c:forEach items="${FileFormatInformationBeanList}" var="FileFormatInformationBean">
                        <div class="capitalize fontSmall2">${FileFormatInformationBean.format} <span class="${FileFormatInformationBean.css}">${FileFormatInformationBean.lastUpdateNumber} ${FileFormatInformationBean.lastUpdateUnit}<span></div>
                    </c:forEach>
                  </div>

                  <div id="searchAd">
                  <br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>

                  </div>


        </div>

        <div class="span-18 last grey" id="dashboard">

        <div class="span-6">
            <div class="dashboardBorder" id="dashboardIcon"><a href="admin_admain.html"><img src="<c:url value="/image/transition_ad_icon.png" />" alt="Advertisement Lookup"/>
                <div class="dashboardText" id="dashboardIcon">Advertisement</div></a>
            </div>
        </div>
        <div class="span-6">
            <div class="dashboardBorder" id="dashboardIcon"><a href="admin_filemain.html"><img src="<c:url value="/image/transition_file_icon.png" />" alt="File Lookup"/>
                <div class="dashboardText" id="dashboardIcon">File</div></a>
            </div>
        </div>
        <div class="span-6 last">
            <div class="dashboardBorder" id="dashboardIcon"><a href="admin_system_statistics.html"><img src="<c:url value="/image/transition_status_icon.png" />" alt="System Status"/>
                <div class="dashboardText" id="dashboardIcon">Statistics</div></a>
            </div>
        </div>

        <div class="span-18 last grey" id="dashboard"><strong>Active Import <span class="small quiet"><a href="router.html">(more info)</a></span> :</strong> ${routerOnline}</div>
        </div>



<%@ include file="template/admin_footer.jsp" %>