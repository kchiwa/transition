<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="template/admin_header.jsp" %>

        <%@ include file="template/admin_main_nav.jsp" %>
        <hr/>
        <div class="span-24 last" id="header">
           <h3 class="grey">System Check</h3><hr />
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
                <div class="span-18 last"><h1 class="systemStatus borderStatus">System Check</h1></div>


                    <div class="span-12 formatName prepend-1">FTP Path <span class="formatDetail2 quiet small">(${SystemCheckResult.ftpPath})</span></div>
                    <div class="span-5 last queueNumber">
                        <c:choose>
                            <c:when test="${empty SystemCheckResult.ftpPathError}">
                                 <span class="ok">OK</span>
                            </c:when>
                            <c:otherwise>
                                 <span class="err">ERROR</span>
                            </c:otherwise>
                        </c:choose>
                    </div>
                    <c:if test="${!empty SystemCheckResult.ftpPathError}">
                        <div class="span-17 last"><p class="triangle-obtuse top fontSmall">${SystemCheckResult.ftpPathError} !</p></div>
                    </c:if>


                    <div class="span-12 formatName prepend-1">Media Path <span class="formatDetail2 quiet small">(${SystemCheckResult.mediaPath})</span></div>
                    <div class="span-5 last queueNumber">
                        <c:choose>
                            <c:when test="${empty SystemCheckResult.mediaPathError}">
                                 <span class="ok">OK</span>
                            </c:when>
                            <c:otherwise>
                                 <span class="err">ERROR</span>
                            </c:otherwise>
                        </c:choose>
                    </div>
                    <c:if test="${!empty SystemCheckResult.mediaPathError}">
                        <div class="span-17 last"><p class="triangle-obtuse top fontSmall">${SystemCheckResult.mediaPathError} !</p></div>
                    </c:if>


                    <div class="span-12 formatName prepend-1">Production Image Path <span class="formatDetail2">(${SystemCheckResult.productionImagePath})</span></div>
                    <div class="span-5 last queueNumber">
                        <c:choose>
                            <c:when test="${empty SystemCheckResult.productionImagePathError}">
                                 <span class="ok">OK</span>
                            </c:when>
                            <c:otherwise>
                                 <span class="err">ERROR</span>
                            </c:otherwise>
                        </c:choose>
                    </div>
                    <c:if test="${!empty SystemCheckResult.productionImagePathError}">
                        <div class="span-17 last"><p class="triangle-obtuse top fontSmall">${SystemCheckResult.productionImagePathError} !</p></div>
                    </c:if>

                    <div class="span-12 formatName prepend-1">Production File Path <span class="formatDetail2">(${SystemCheckResult.productionFilePath})</span></div>
                    <div class="span-5 last queueNumber">
                        <c:choose>
                            <c:when test="${empty SystemCheckResult.productionFilePathError}">
                                 <span class="ok">OK</span>
                            </c:when>
                            <c:otherwise>
                                 <span class="err">ERROR</span>
                            </c:otherwise>
                        </c:choose>
                    </div>
                    <c:if test="${!empty SystemCheckResult.productionFilePathError}">
                        <div class="span-17 last"><p class="triangle-obtuse top fontSmall">${SystemCheckResult.productionFilePathError} !</p></div>
                    </c:if>

                    <div class="span-12 formatName prepend-1">Database</div>
                    <div class="span-5 last queueNumber">
                        <c:choose>
                            <c:when test="${empty SystemCheckResult.dbError}">
                                 <span class="ok">OK</span>
                            </c:when>
                            <c:otherwise>
                                 <span class="err">ERROR</span>
                            </c:otherwise>
                        </c:choose>
                    </div>
                    <c:if test="${!empty SystemCheckResult.dbError}">
                        <div class="span-17 last"><p class="triangle-obtuse top fontSmall">${SystemCheckResult.dbError} !</p></div>
                    </c:if>


                    <div class="span-12 formatName prepend-1">MemCached</div>
                    <div class="span-5 last queueNumber">
                        <c:choose>
                            <c:when test="${SystemCheckResult.memCachedError == 'Disabled'}">
                                <span class="warning">Disabled</span>
                            </c:when>
                            <c:when test="${empty SystemCheckResult.memCachedError}">
                                 <span class="ok">OK</span>
                            </c:when>
                            <c:otherwise>
                                 <span class="err">ERROR</span>
                            </c:otherwise>
                        </c:choose>
                    </div>
                    <c:if test="${!empty SystemCheckResult.memCachedError}">
                        <c:if test="${SystemCheckResult.memCachedError != 'Disabled'}">
                            <div class="span-17 last"><p class="triangle-obtuse top fontSmall">${SystemCheckResult.memCachedError} !</p></div>
                        </c:if>
                    </c:if>
            </div>
        </div>

<%@ include file="template/admin_footer.jsp" %>