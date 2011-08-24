<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="template/admin_header.jsp" %>

<script language="JavaScript">
function checkAll(field)
{
for (i = 0; i < field.length; i++)
	field[i].checked = true ;
}

function uncheckAll(field)
{
for (i = 0; i < field.length; i++)
	field[i].checked = false ;
}
</script>
        <%@ include file="template/admin_main_nav.jsp" %>
        <hr/>
        <div class="span-24 last" id="header">
           <h3 class="grey">File Lookup</h3><hr />
        </div>

        <div class="span-5 colborder" id="sidebar">

                  <div class="searchTitle">Search</div>

                  <div id="searchFile">
                     <form:form method="POST" action="./admin_filemain.html" commandName="searchMessage">
                      <div class="span-2 margintopsearch"><label for="searchFormat" class="searchField">Format</label></div>
                      <div class="span-3 last">
                        <form:select path="searchFormat" id="searchFormat" name="searchFormat" class="width100 grey">
                              <form:option value="show_all">show all</form:option>
                              <c:forEach items="${customerFormatList}" var="customerFormat">
                                 <form:option value="${customerFormat}">${customerFormat}</form:option>
                              </c:forEach>
                        </form:select>
                      </div>

                      <div class="span-2 margintopsearch"><label for="searchClientName" class="searchField">Client Name</label></div>
                      <div class="span-3 last"><form:input path="searchClientName" class="search" name="searchClientName" id="searchClientName" /></div>

                      <div class="span-2 margintopsearch"><label for="searchFileName" class="searchField">File Name</label></div>
                      <div class="span-3 last"><form:input path="searchFileName"  class="search" name="searchFileName" id="searchFileName" /></div>


                      <div class="span-2 margintopsearch"><label for="searchStatus" class="searchField">Status</label></div>
                      <div class="span-3 last">
                        <form:select path="searchStatus" id="searchStatus" name="searchStatus" class="width100 grey">
                              <form:option value="show_all">show all</form:option>
                              <c:forEach items="${fileStatusList}" var="fileStatus">
                                 <form:option value="${fileStatus}">${fileStatus}</form:option>
                              </c:forEach>
                        </form:select>
                      </div>



                   <div class="span-2 margintopsearch"><label for="searchFileName" class="searchField">From Date</label></div>
                   <div class="span-3 last"><form:input path="searchFromDate"  name="searchFromDate"  id="searchFromDate" class="search" /></div>

                   <div class="span-2 margintopsearch"><label for="searchFileName" class="searchField">To Date</label></div>
                   <div class="span-3 last"><form:input path="searchToDate"  name="searchToDate" id="searchToDate"  class="search" /></div>
                   <div class="span-2 margintopsearch"></div>
                   <div class="span-3 last quiet">yyyy-mm-dd</div>


                      <div class="span-5 prepend-2 last"><button type="submit" class="button">search</button></div>
                      <form:hidden id="requestPage" path="requestPage" value="1"/>


                  </form:form>
                  </div>

                  <div class="span-5 last">
                      <a href="./admin_admain.html">Go to Advertisement Lookup</a>
                  </div>
              <div id="error" class="span-5 last">
                <c:if test="${!empty searchError}">
                    <div class="error">${searchError}</div>
                </c:if>
              </div>
        </div>

        <div class="span-18 last grey" id="content">

            <div id="reimporterror">${errorMessage}</div>

            <div id="reimportsuccess">${successMessage}</div>

            <c:choose>
            <c:when test="${!empty FileStateDataModelList}">
                <form name="myform" action="./admin_filemain.html" method="post" onsubmit="return confirm('Delete selected record(s)?');">
                <div id="buttons" class="span-18 clearfix last">
                    <div><button type="button" class="button" onClick="checkAll(document.myform.filestateID);">select all</button></div>
                    <div><button type="button" class="button" onClick="uncheckAll(document.myform.filestateID);">clear all</button></div>
                    <div><button type="submit" class="button">delete</button></div>
                    <div class="margintop13"> Found ${totalRow} record(s)</div>
                </div>
                <div id="table" class="span-18 last">
                <table summary="File List table"  border="0" cellspacing="0" cellpadding="0">
                  <thead>
                  <tr>
                    <th class="span-1">&nbsp;</th>
                    <th class="span-3">Client Name</th>
                    <th class="span-2">Format</th>
                    <th class="span-3">File Name</th>
                    <th class="span-4">Last Modified</th>
                    <th class="span-1">Status</th>
                    <th class="span-3">Message</th>
                    <th class="span-1 last">&nbsp;</th>
                  </tr>
                  </thead>
                  <tbody>
                      <c:forEach items="${FileStateDataModelList}" var="FileStateDataModel">

                          <tr>
                            <td><input type="checkbox" name="filestateID" value="${FileStateDataModel.id}"></td>
                            <td>${FileStateDataModel.clientName}</td>
                            <td>${FileStateDataModel.customerFormat}</td>
                            <td>${FileStateDataModel.fileName}
                                <c:if test="${FileStateDataModel.fileSize != ''}">
                                     (${FileStateDataModel.fileSize})
                                </c:if>
                            </td>
                            <td>${FileStateDataModel.createdTime}</td>
                            <td>
                                <c:choose>
                                    <c:when test="${FileStateDataModel.status=='OK'}">
                                        <span class="ok">OK</span>
                                    </c:when>
                                    <c:when test="${FileStateDataModel.status=='MISSING MEDIA'}">
                                        <span class="warning">MEDIA</span>
                                    </c:when>
                                    <c:when test="${FileStateDataModel.status=='ERROR'}">
                                        <span class="err">ERROR</span>
                                    </c:when>
                                    <c:when test="${FileStateDataModel.status=='CLOSED'}">
                                        <span class="quiet">CLOSED</span>
                                    </c:when>
                                    <c:otherwise>
                                        <span class="ok">${AdStateDataModel.status}</span>
                                    </c:otherwise>
                                </c:choose>
                            </td>
                            <c:choose>
                                <c:when test="${FileStateDataModel.status=='MISSING MEDIA'}">
                                    <td>Media missing</td>
                                </c:when>
                                <c:otherwise>
                                    <td>${FileStateDataModel.errorMessage}</td>
                                </c:otherwise>
                            </c:choose>
                            <td>
                                 <a href="./admin_fileinfo.html?fileID=${FileStateDataModel.id}"><img src="<c:url value="/image/info_icon.gif"/>" border="0" alt="More information"/></a>
                            </td>
                          </tr>
                      </c:forEach>
                  </tbody>
                </table>
                </div>
                <div id="buttons" class="span-18 clearfix last">
                    <div><button type="button" class="button" onClick="checkAll(document.myform.filestateID);">select all</button></div>
                    <div><button type="button" class="button" onClick="uncheckAll(document.myform.filestateID);">clear all</button></div>
                    <div><button type="submit" class="button">delete</button></div>
                    <div class="margintop13"> Found ${totalRow} record(s)</div>
                </div>
                <input type="hidden" name="requestPage" value="1">
                <input type="hidden" name="searchFormat" value="${SearchMessage.searchFormat}"/>
                <input type="hidden" name="searchClientName" value="${SearchMessage.searchClientName}"/>
                <input type="hidden" name="searchFileName" value="${SearchMessage.searchFileName}"/>
                <input type="hidden" name="searchStatus" value="${SearchMessage.searchStatus}"/>
                <input type="hidden" name="searchFromDate" value="${SearchMessage.searchFromDate}"/>
                <input type="hidden" name="searchToDate" value="${SearchMessage.searchToDate}"/>
                </form>
                <div id="page" class="span-18 last grey">
                    <form method="POST" action="./admin_filemain.html">
                        <div class="span-4 margintoppaging">
                            Show page <input type="text" class="paging" name="requestPage" value="${SearchMessage.requestPage}"> / ${totalPage}
                        </div>
                        <div class="span-14 pull-1 last">
                             <button type="submit" class="button">update</button>
                        </div>
                        <input type="hidden" name="searchFormat" value="${SearchMessage.searchFormat}"/>
                        <input type="hidden" name="searchClientName" value="${SearchMessage.searchClientName}"/>
                        <input type="hidden" name="searchFileName" value="${SearchMessage.searchFileName}"/>
                        <input type="hidden" name="searchStatus" value="${SearchMessage.searchStatus}"/>
                        <input type="hidden" name="searchFromDate" value="${SearchMessage.searchFromDate}"/>
                        <input type="hidden" name="searchToDate" value="${SearchMessage.searchToDate}"/>
                    </form>
                </div>
                <div class="span-18 clearfix last grey">
                    <c:if test="${SearchMessage.requestPage != SearchMessage.prevPage}">
                        <div>
                            <form method="POST" action="./admin_filemain.html">
                                <button type="submit" class="button">previous page</button>
                                <input type="hidden" name="requestPage" value="${SearchMessage.prevPage}"/>
                                <input type="hidden" name="searchFormat" value="${SearchMessage.searchFormat}"/>
                                <input type="hidden" name="searchClientName" value="${SearchMessage.searchClientName}"/>
                                <input type="hidden" name="searchFileName" value="${SearchMessage.searchFileName}"/>
                                <input type="hidden" name="searchStatus" value="${SearchMessage.searchStatus}"/>
                                <input type="hidden" name="searchFromDate" value="${SearchMessage.searchFromDate}"/>
                                <input type="hidden" name="searchToDate" value="${SearchMessage.searchToDate}"/>
                            </form>
                        </div>
                    </c:if>
                    <c:if test="${SearchMessage.requestPage != SearchMessage.nextPage}">
                        <div>
                            <form method="POST" action="./admin_filemain.html">
                                <button type="submit" class="button">next page</button>
                                <input type="hidden" name="requestPage" value="${SearchMessage.nextPage}"/>
                                <input type="hidden" name="searchFormat" value="${SearchMessage.searchFormat}"/>
                                <input type="hidden" name="searchClientName" value="${SearchMessage.searchClientName}"/>
                                <input type="hidden" name="searchFileName" value="${SearchMessage.searchFileName}"/>
                                <input type="hidden" name="searchStatus" value="${SearchMessage.searchStatus}"/>
                                <input type="hidden" name="searchFromDate" value="${SearchMessage.searchFromDate}"/>
                                <input type="hidden" name="searchToDate" value="${SearchMessage.searchToDate}"/>
                            </form>
                        </div>
                    </c:if>
                </div>


            </c:when>
            <c:otherwise>
                <div class="span-18 prepend-7 last grey"><blockquote>No result to display</blockquote></div>
            </c:otherwise>
            </c:choose>

        </div>

<%@ include file="template/admin_footer.jsp" %>