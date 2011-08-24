<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="template/admin_header.jsp" %>

    <%@ include file="template/admin_main_nav.jsp" %>
        <hr/>
        <div class="span-24 last" id="header">
           <h3 class="grey">Archive File</h3><hr />
        </div>

        <!-- display search criteria -->
        <div class="span-5 colborder" id="sidebar">
            <div class="searchTitle">Search</div>
            <div id="searchFile">
                 <form:form method="POST" action="./admin_archive.html">
                      <div class="span-2 margintopsearch"><label for="searchFormat" class="searchField">Format</label></div>
                      <div class="span-3 last">

                      </div>
                 </form:form>
            </div>
        </div>

        <!-- display list of file in archive folder -->
        <div class="span-18 last grey" id="content">

            <c:choose>
            <c:when test="${!empty fileInformationBeanList}">
                <div id="table" class="span-18 last">
                <table summary="File List table"  border="0" cellspacing="0" cellpadding="0">
                  <thead>
                      <tr>
                        <th class="span-3">Client Name</th>
                        <th class="span-2">Format</th>
                        <th class="span-3">File Name</th>
                        <th class="span-4">Last Modified</th>
                      </tr>
                  </thead>
                  <tbody>
                      <c:forEach items="${fileInformationBeanList}" var="fileInformationBean">
                        <tr>
                            <td>${fileInformationBean.clientName}</td>
                            <td>${fileInformationBean.customerFormat}</td>
                            <td>${fileInformationBean.fileName}
                                <c:if test="${fileInformationBean.fileSize != ''}">
                                     (${fileInformationBean.fileSize})
                                </c:if>
                            </td>
                            <td>${fileInformationBean.createdTime}</td>
                        </tr>
                      </c:forEach>
                  </tbody>
                </table>

            </c:when>
            <c:otherwise>
                <div class="span-18 prepend-7 last grey"><blockquote>No result to display</blockquote></div>
            </c:otherwise>
            </c:choose>

        </div>




<%@ include file="template/admin_footer.jsp" %>