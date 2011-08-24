<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="template/admin_header.jsp" %>

        <%@ include file="template/admin_main_nav.jsp" %>
        <hr/>
        <div class="span-24 last" id="header">
           <h3 class="grey">System Status</h3><hr />
        </div>


        <div class="span-5 colborder" id="sidebar">
              <div id="sidebar_link" class="span-5 last">
                 <br/><br/><br/><br/><br/><br/><br/><br/>
                 <br/><br/><br/><br/><br/><br/><br/><br/>
                 <br/><br/><br/><br/><br/><br/><br/><br/>
                 <br/><br/><br/><br/><br/><br/><br/><br/>
              </div>
        </div>

        <div class="span-18 last grey" id="content">

            <div id="queueStatus" class="span-18 last queueList">
                <div class="span-18 last"><h1 class="systemStatus borderStatus">FILE STATUS</h1></div>
                <c:forEach items="${FileFormatInformationBeanList}" var="FileFormatInformationBean">
                    <div class="span-3 formatName capitalize prepend-1">${FileFormatInformationBean.format}</div>
                    <div class="span-4 formatDetail">${FileFormatInformationBean.createdTime}</div>
                    <div class="span-6 formatDetail">${FileFormatInformationBean.fileName}</div>
                    <div class="span-4 last formatDetail"><span class="${FileFormatInformationBean.css}">${FileFormatInformationBean.lastUpdateNumber} ${FileFormatInformationBean.lastUpdateUnit}<span></div>
                </c:forEach>
            </div>

            <div id="queueStatus" class="span-18 last queueList">
            <br/>
                <div class="span-18 last"><h1 class="systemStatus borderStatus">QUEUE STATUS</h1></div>
                <c:forEach items="${QueueInfoList}" var="queueInfo">
                    <div class="span-12 formatName prepend-1"><a href="queue_list.html?queueName=${queueInfo.fullQueueName}" target="blank">${queueInfo.queueName}</a></div>
                    <div class="span-5 last queueNumber"><span class="${queueInfo.showColor}">${queueInfo.queueCount}<span></div>
                </c:forEach>
            </div>

            <div id="queueStatus" class="span-18 last queueList">
            <br/>
                <div class="span-18 last"><h1 class="systemStatus borderStatus">CAMEL LOCK FILE(s)</h1></div>
                <c:choose>
                  <c:when test="${!empty fileList}">
                     <c:forEach items="${fileList}" var="fileList">
                     <form method="post">
                       <input type="hidden" name="filePath" value="${fileList.fileName}">
                         <div class="span-15 formatName2 prepend-1">${fileList.fileName} <br><span class="warning">${fileList.lifeTime}</span></div>
                         <div class="span-2 last queueNumber"><input type="submit" value="Delete " onclick="return confirm(' Delete ? ');"><span></div>
                     </form>
                     </c:forEach>
                   </c:when>
                   <c:otherwise>
                       No Lock File.
                   </c:otherwise>
                </c:choose>
            </div>

        </div>

<%@ include file="template/admin_footer.jsp" %>