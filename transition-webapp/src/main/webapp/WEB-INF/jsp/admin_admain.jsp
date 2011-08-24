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

function checkSubmit(type)
{
        if(type=='reset') {

            if(confirm('Reset selected record(s)?')==true) {
                document.getElementById("action").value = "reset";
            }
        } else {
            if(confirm('Delete selected record(s)?')==true) {
                document.getElementById("action").value = "delete";
            }
        }
        document.forms["myform"].submit();
}
</script>
        <%@ include file="template/admin_main_nav.jsp" %>
        <hr/>
        <div class="span-24 last" id="header">
           <h3 class="grey">Advertisement Lookup</h3><hr />
        </div>
        ${zettSite}

        <div class="span-5 colborder" id="sidebar">

                  <div id="sidebar_link" class="span-5 last">


                  </div>


                  <div class="searchTitle">Search</div>


                  <div id="searchAd">
                  <form:form method="POST" action="./admin_admain.html" commandName="searchMessage">
                      <div class="span-2 margintopsearch"><label for="searchFormat" class="searchField">Format</label></div>
                      <div class="span-3 last">
                      <form:select path="searchFormat"  id="searchFormat" name="searchFormat" class="width100 grey">
                              <form:option value="show_all">show all</form:option>
                              <c:forEach items="${customerFormatList}" var="customerFormat">
                                 <form:option value="${customerFormat}">${customerFormat}</form:option>
                              </c:forEach>
                        </form:select>
                      </div>


                      <div class="span-2 margintopsearch"><label for="searchClientId" class="searchField">ZClient ID</label></div>
                      <div class="span-3 last"><form:input path="searchClientId" class="search" name="searchClientId" id="searchClientId" /></div>

                      <div class="span-2 margintopsearch"><label for="searchClientRef" class="searchField">Client Ref</label></div>
                      <div class="span-3 last"><form:input type="text" path="searchClientRef" class="search" name="searchClientRef" id="searchClientRef" /></div>

                      <div class="span-2 margintopsearch"><label for="searchZettId" class="searchField">Zett ID</label></div>
                      <div class="span-3 last"><form:input path="searchZettId" class="search" name="searchZettId" id="searchZettId" /></div>

                      <div class="span-2 margintopsearch"><label for="searchStatus" class="searchField">Status</label></div>
                      <div class="span-3 last">
                        <form:select path="searchStatus"  id="searchStatus" name="searchStatus" class="width100 grey">
                              <form:option value="show_all">show all</form:option>
                              <c:forEach items="${adStatusList}" var="adStatus">
                                 <form:option value="${adStatus}">${adStatus}</form:option>
                              </c:forEach>
                        </form:select>
                      </div>

                  <div class="span-2 margintopsearch"><label for="searchFromDate" class="searchField">From Date</label></div>
                  <div class="span-3 last"><form:input path="searchFromDate" name="searchFromDate"  id="searchFromDate" class="search" /></div>

                   <div class="span-2 margintopsearch"><label for="searchToDate" class="searchField">To Date</label></div>
                   <div class="span-3 last"><form:input path="searchToDate"  name="searchToDate" id="searchToDate"  class="search" /></div>
                   <div class="span-2 margintopsearch"></div>
                   <div class="span-3 last quiet">yyyy-mm-dd</div>


                      <div class="span-5 prepend-2 last"><button type="submit" class="button">search</button></div>
                      <form:hidden id="requestPage" path="requestPage" value="1"/>
                  </form:form>
                  </div>

                  <div class="span-5 last">
                       <a href="./admin_filemain.html">Go to File Lookup</a>
                  </div>
              <div id="error" class="span-5 last">
                <c:if test="${!empty searchError}">
                    <div class="error">${searchError}</div>
                </c:if>
              </div>
        </div>

        <div class="span-18 last grey" id="content">

            <div id="reimporterror">${errorMessage}</div>

            <c:choose>
            <c:when test="${!empty AdStateDataModelList}">
               <form name="myform" id="myform" action="./admin_admain.html" method="post">
                    <div id="buttons" class="span-18 clearfix last">
                    <div><button type="button" class="button" onClick="checkAll(document.myform.adstateID);">select all</button></div>
                    <div><button type="button" class="button" onClick="uncheckAll(document.myform.adstateID);">clear all</button></div>
                    <div><button type="submit" class="button" name="delete" onclick="checkSubmit('delete')">delete</button></div>
                    <div><button type="submit" class="button" name="reset" onclick="checkSubmit('reset')">hash reset</button></div>
                    <div class="margintop13"> Found ${totalRow} record(s)</div>
                    </div>
               <div id="table" class="span-18 last">
               <table summary="Ad List table"  border="0" cellspacing="0" cellpadding="0">
                  <thead>
                  <tr>
                    <th class="span-1">&nbsp;</th>
                    <th class="span-2">ZClient ID</th>
                    <th class="span-2">Client Ref</th>
                    <th class="span-2">Zett ID</th>
                    <th class="span-2">Format</th>
                    <th class="span-4">Last Modified</th>
                    <th class="span-1">Status</th>
                    <th class="span-3">Message</th>
                    <th class="span-1 last">&nbsp;</th>
                  </tr>
                  </thread>

                  <tbody>
                      <c:forEach items="${AdStateDataModelList}" var="AdStateDataModel">

                          <tr>
                            <td><input type="checkbox" name="adstateID" value="${AdStateDataModel.id}"></td>
                            <td>${AdStateDataModel.zClientId}</td>
                            <td>${AdStateDataModel.adExternalRef}</td>
                            <td>
                                <c:choose>
                                    <c:when test="${AdStateDataModel.zadObjectId != '0'}">
                                        <a href="${zettUrl}/?${AdStateDataModel.zadObjectId}&noCheck=true" target="_blank">${AdStateDataModel.zadObjectId}</a>
                                    </c:when>
                                    <c:otherwise>
                                        -
                                    </c:otherwise>
                                </c:choose>
                            </td>
                            <td>${AdStateDataModel.clientFormat}</td>
                            <td>${AdStateDataModel.modifiedTime}</td>
                            <td>
                                <c:choose>
                                    <c:when test="${AdStateDataModel.status=='OK'}">
                                        <span class="ok">OK</span>
                                    </c:when>
                                    <c:when test="${AdStateDataModel.status=='MISSING MEDIA'}">
                                        <span class="warning">MEDIA</span>
                                    </c:when>
                                    <c:when test="${AdStateDataModel.status=='ERROR'}">
                                        <span class="err">ERROR</span>
                                    </c:when>
                                    <c:when test="${AdStateDataModel.status=='CLOSED'}">
                                        <span class="quiet">CLOSED</span>
                                    </c:when>
                                    <c:when test="${AdStateDataModel.status=='NOT FOUND'}">
                                        <span class="warning">NOT FOUND</span>
                                    </c:when>
                                    <c:otherwise>
                                        <span class="ok">${AdStateDataModel.status}</span>
                                    </c:otherwise>
                                </c:choose>
                            </td>
                            <c:choose>
                                <c:when test="${AdStateDataModel.status=='MISSING MEDIA'}">
                                    <td>Media missing</td>
                                </c:when>
                                <c:otherwise>
                                    <td>${AdStateDataModel.errorMessage}</td>
                                </c:otherwise>
                            </c:choose>
                            <td><a href="./admin_adinfo.html?adID=${AdStateDataModel.id}"><img src="<c:url value="/image/info_icon.gif"/>" border="0" alt="More information"/></a></td>
                          </tr>
                      </c:forEach>
                  </tbody>
                </table>
                </div>
                <div id="buttons" class="span-18 clearfix last">
                    <div><button type="button" class="button" onClick="checkAll(document.myform.adstateID);">select all</button></div>
                    <div><button type="button" class="button" onClick="uncheckAll(document.myform.adstateID);">clear all</button></div>
                    <div><button type="submit" class="button" name="delete" onclick="checkSubmit('delete')">delete</button></div>
                    <div><button type="submit" class="button" name="reset" onclick="checkSubmit('reset')">hash reset</button></div>
                    <div class="margintop13"> Found ${totalRow} record(s)</div>
                </div>
                <input type="hidden" name="action" id="action" value="" />
                <input type="hidden" name="requestPage" value="1">
                <input type="hidden" name="searchFormat" value="${SearchMessage.searchFormat}"/>
                <input type="hidden" name="searchClientName" value="${SearchMessage.searchClientId}"/>
                <input type="hidden" name="searchFileName" value="${SearchMessage.searchZettId}"/>
                <input type="hidden" name="searchClientRef" value="${SearchMessage.searchClientRef}"/>
                <input type="hidden" name="searchStatus" value="${SearchMessage.searchStatus}"/>
                <input type="hidden" name="searchFromDate" value="${SearchMessage.searchFromDate}"/>
                <input type="hidden" name="searchToDate" value="${SearchMessage.searchToDate}"/>
                </form>
                <div id="page" class="span-18 last grey">
                    <form method="POST" action="./admin_admain.html">
                        <div class="span-4 margintoppaging">
                            Show page <input type="text" class="paging" name="requestPage" value="${SearchMessage.requestPage}"> / ${totalPage}
                        </div>
                        <div class="span-14 pull-1 last">
                             <button type="submit" class="button">update</button>
                        </div>
                        <input type="hidden" name="searchFormat" value="${SearchMessage.searchFormat}"/>
                        <input type="hidden" name="searchClientName" value="${SearchMessage.searchClientId}"/>
                        <input type="hidden" name="searchFileName" value="${SearchMessage.searchZettId}"/>
                        <input type="hidden" name="searchClientRef" value="${SearchMessage.searchClientRef}"/>
                        <input type="hidden" name="searchStatus" value="${SearchMessage.searchStatus}"/>
                        <input type="hidden" name="searchFromDate" value="${SearchMessage.searchFromDate}"/>
                        <input type="hidden" name="searchToDate" value="${SearchMessage.searchToDate}"/>
                    </form>
                </div>

                <div class="span-18 clearfix last grey">
                    <c:if test="${SearchMessage.requestPage != SearchMessage.prevPage}">
                        <div>
                            <form method="POST" action="./admin_admain.html">
                                <button type="submit" class="button">previous page</button>
                                <input type="hidden" name="requestPage" value="${SearchMessage.prevPage}"/>
                                <input type="hidden" name="searchFormat" value="${SearchMessage.searchFormat}"/>
                                <input type="hidden" name="searchClientName" value="${SearchMessage.searchClientId}"/>
                                <input type="hidden" name="searchFileName" value="${SearchMessage.searchZettId}"/>
                                <input type="hidden" name="searchClientRef" value="${SearchMessage.searchClientRef}"/>
                                <input type="hidden" name="searchStatus" value="${SearchMessage.searchStatus}"/>
                                <input type="hidden" name="searchFromDate" value="${SearchMessage.searchFromDate}"/>
                                <input type="hidden" name="searchToDate" value="${SearchMessage.searchToDate}"/>
                            </form>
                        </div>
                    </c:if>
                    <c:if test="${SearchMessage.requestPage != SearchMessage.nextPage}">
                        <div>
                            <form method="POST" action="./admin_admain.html">
                                <button type="submit" class="button">next page</button>
                                <input type="hidden" name="requestPage" value="${SearchMessage.nextPage}"/>
                                <input type="hidden" name="searchFormat" value="${SearchMessage.searchFormat}"/>
                                <input type="hidden" name="searchClientName" value="${SearchMessage.searchClientId}"/>
                                <input type="hidden" name="searchFileName" value="${SearchMessage.searchZettId}"/>
                                <input type="hidden" name="searchClientRef" value="${SearchMessage.searchClientRef}"/>
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