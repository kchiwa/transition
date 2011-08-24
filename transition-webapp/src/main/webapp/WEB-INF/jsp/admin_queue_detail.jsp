<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="template/admin_header.jsp" %>
<%@ include file="template/admin_main_nav.jsp" %>
<SCRIPT LANGUAGE="JavaScript">

<!-- Begin
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
//  End -->
</script>
        <hr/>
        <div class="span-24 last" id="header">
           <h3 class="grey">${queueName} Queue Information</h3><hr />
           <form:form method="POST" commandName="searchMessage" action="export_error.html">
                         <form:hidden path="searchFormat" class="search" name="searchFormat" id="searchFormat" />
                         <form:hidden path="searchClientId" class="search" name="searchClientId" id="searchClientId" />
                         <form:hidden path="searchClientRef" class="search" name="searchClientRef" id="searchClientRef" />
                         <form:hidden path="searchClientName" class="search" name="searchClientName" id="searchClientName" />
                         <form:hidden path="searchFileName"  class="search" name="searchFileName" id="searchFileName" />
                         <form:hidden path="searchFromDate"  name="searchFromDate"  id="searchFromDate" class="search" />
                         <form:hidden path="searchToDate"  name="searchToDate" id="searchToDate"  class="search" />
                         <input type="hidden" name="queueName" value="${queueNameFull}">
                 <button type="submit" class="button">Export To CSV</button>

               </form:form>
        </div>


        <div class="span-5 colborder" id="sidebar">

              <div class="span-5 colborder" id="sidebar">

                  <div id="sidebar_link" class="span-5 last">


                  </div>


                  <div class="searchTitle">Search</div>


                <div id="searchAd">
                 <form:form method="POST" commandName="searchMessage">
                     <!--  -->
                     <div class="span-2 margintopsearch"><label for="searchFormat" class="searchField">Format</label></div>
                     <div class="span-3 last">
                                             <form:select path="searchFormat" id="searchFormat" name="searchFormat" class="width100 grey">
                                                   <form:option value="">show all</form:option>
                                                   <c:forEach items="${customerFormatList}" var="customerFormat">
                                                      <form:option value="${customerFormat}">${customerFormat}</form:option>
                                                   </c:forEach>
                                             </form:select>
                     </div>

                     <div class="span-2 margintopsearch"><label for="searchClientName" class="searchField">Client Name</label></div>
                      <div class="span-3 last"><form:input path="searchClientName" class="search" name="searchClientName" id="searchClientName" /></div>

                      <div class="span-2 margintopsearch"><label for="searchClientId" class="searchField">ZClient ID</label></div>
                      <div class="span-3 last"><form:input path="searchClientId" class="search" name="searchClientId" id="searchClientId" /></div>

                      <div class="span-2 margintopsearch"><label for="searchClientRef" class="searchField">Client Ref</label></div>
                      <div class="span-3 last"><form:input type="text" path="searchClientRef" class="search" name="searchClientRef" id="searchClientRef" /></div>

                      <div class="span-2 margintopsearch"><label for="searchFileName" class="searchField">File Name</label></div>
                      <div class="span-3 last"><form:input path="searchFileName"  class="search" name="searchFileName" id="searchFileName" /></div>

                       <div class="span-2 margintopsearch"><label for="searchFileName" class="searchField">From Date</label></div>
                  <div class="span-3 last"><form:input path="searchFromDate"  name="searchFromDate"  id="searchFromDate" class="search" /></div>
                      <div class="span-2 margintopsearch"></div>
                  <div class="span-3 last">(yyyy-mm-dd)</div>


                   <div class="span-2 margintopsearch"><label for="searchFileName" class="searchField">To Date</label></div>
                   <div class="span-3 last"><form:input path="searchToDate"  name="searchToDate" id="searchToDate"  class="search" /></div>
                     <div class="span-2 margintopsearch"></div>
                  <div class="span-3 last">(yyyy-mm-dd)</div>


                      <input type="hidden" name="queueName" value="${queueNameFull}">
                      <div class="span-5 prepend-2 last"><button type="submit" class="button">search</button></div>

                      <form:hidden id="requestPage" path="requestPage" value="1"/>

                  </form:form>

                  <div id="error" class="span-5 last">
                <c:if test="${!empty searchError}">
                    <div class="error">${searchError}</div>
                </c:if>
              </div>

                </div>


        </div>

        </div>

        <div class="span-18 last grey" id="content">


            <c:choose>
            <c:when test="${!empty queueListModels}">
                <form:form method="POST" id="myform" name="myform" commandName="searchMessage" action="queue_list.html" onsubmit="return confirm('Delete all selected ?');">
                         <form:hidden path="searchFormat" class="search" name="searchFormat" id="searchFormat" />
                         <form:hidden path="searchClientId" class="search" name="searchClientId" id="searchClientId" />
                         <form:hidden path="searchClientRef" class="search" name="searchClientRef" id="searchClientRef" />
                         <form:hidden path="searchClientName" class="search" name="searchClientName" id="searchClientName" />
                         <form:hidden path="searchFileName"  class="search" name="searchFileName" id="searchFileName" />
                         <form:hidden path="searchFromDate"  name="searchFromDate"  id="searchFromDate" class="search" />
                         <form:hidden path="searchToDate"  name="searchToDate" id="searchToDate"  class="search" />
                         <input type="hidden" name="queueName" value="${queueNameFull}">
                <div id="buttons" class="span-18 clearfix last">
                    <div><button type="button" class="button" onClick="checkAll(document.myform.jmsIds);">select all</button></div>
                    <div><button type="button" class="button" onClick="uncheckAll(document.myform.jmsIds);">clear all</button></div>
                    <div><button type="submit" class="button">delete</button></div>

                    <div class="margintop13"> Found ${queueSize} item(s) in this queue.</div>
                </div>

                <div id="table" class="span-18 last">
                    <table summary="Queue List table"  border="0" cellspacing="0" cellpadding="0">
                      <thead>
                      <tr>
                        <th class="span-1">&nbsp;</th>
                        <th class="span-3">Client Name</th>
                        <th class="span-3">Client ID</th>
                        <th class="span-3">Client Ref</th>
                        <th class="span-3">Format</th>
                        <th class="span-5">File</th>
                        <th class="span-4 last">Timestamp</th>
                      </tr>
                      </thead>

                      <tbody>
                          <c:forEach items="${queueListModels}" var="queueListModel">
                              <tr>
                                <td><input type="checkbox" name="jmsIds" value="${queueListModel.jmsId}"></td>
                                <td>${queueListModel.clientName}</td>
                                <td>${queueListModel.clientId}</td>
                                <td>${queueListModel.clientRef}</td>
                                <td>${queueListModel.format}</td>
                                <td>
                                    <a href="admin_fileinfo.html?fileID=${queueListModel.fileStateId}" onClick="return confirm('Edit this Queue ?');" target="_editQueue">${queueListModel.fileName}</a>
                                    (${queueListModel.errorMessage})
                                </td>
                                <td>${queueListModel.incomingTime}</td>
                              </tr>
                          </c:forEach>
                      </tbody>
                    </table>
                </div>


                <div id="buttons" class="span-18 clearfix last">
                    <div><button type="button" class="button" onClick="checkAll(document.myform.jmsIds);">select all</button></div>
                    <div><button type="button" class="button" onClick="uncheckAll(document.myform.jmsIds);">clear all</button></div>
                    <div><button type="submit" class="button">delete</button></div>
                    <div class="margintop13"> Found ${queueSize} item(s) in this queue.</div>
                </div>


               </form:form>

            </c:when>
            <c:otherwise>
                <div class="span-18 prepend-7 last grey"><blockquote>No result to display</blockquote></div>
            </c:otherwise>
            </c:choose>

        </div>

<%@ include file="template/admin_footer.jsp" %>