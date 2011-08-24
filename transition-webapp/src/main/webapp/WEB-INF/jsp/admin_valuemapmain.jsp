<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="template/admin_header.jsp" %>

<SCRIPT LANGUAGE="JavaScript">

<!-- Begin
function checkAll(field)
{
selectedItem=document.getElementsByName(field);
for (i = 0; i < selectedItem.length; i++)
	selectedItem[i].checked = true ;
}

function uncheckAll(field)
{
selectedItem=document.getElementsByName(field);
for (i = 0; i < selectedItem.length; i++)
	selectedItem[i].checked = false ;
}

function deleteValueMap(field) {
 document.deleteForm.ids.value ="";
  selectedItem=document.getElementsByName(field);
  var str = "";
  for (i = 0; i < selectedItem.length; i++)
   if(selectedItem[i].checked ) {
         if (selectedItem[i].value != "") {
             if(str != "") {
               str += ",";
             }
             str += selectedItem[i].value;

         }
  }
  if (str != "" ) {
      document.deleteForm.ids.value = str;
      document.deleteForm.submit();
  }
}

//  End -->
</script>

<form method="post" name="deleteForm" action="admin_valuemapdeletemultiple.html" >
<input type="hidden" name ="ids" value="">
<input type="hidden" name="page" value="${paging.currentPage}"/>
<input type="hidden" name="customerFormat" value="${valueMapFormSearch.customerFormat}"/>
</form>

        <%@ include file="template/admin_main_nav.jsp" %>
        <hr/>
        <div class="span-24 last" id="header">
           <h3 class="grey">&nbsp;&nbsp;Valumap Lookup</h3> <hr />
        </div>


        <div class="span-5 colborder" id="sidebar">

                  <div id="sidebar_link" class="span-5 last">

                  </div>

                  <div class="searchTitle">Search</div>

                  <div id="searchFile">
                     <form:form method="POST" action="admin_valuemapmain.html" commandName="valueMapFormSearch">
                      <div class="span-2 margintopsearch"><label for="searchFormat" class="searchField">Format</label></div>
                                           <div class="span-3 last">
                                             <form:select path="customerFormat" id="customerFormat" name="customerFormat" class="width100 grey">
                                                   <form:option value="show_all">show all</form:option>
                                                   <c:forEach items="${customerFormatList}" var="customerFormat">
                                                      <form:option value="${customerFormat}">${customerFormat}</form:option>
                                                   </c:forEach>
                                             </form:select>
                                           </div>
                      <div class="span-5 prepend-2 last"><button type="submit" class="button">search</button></div>
                      <form:hidden id="page" path="page" value="1"/>
                  </form:form>
                  </div>



                  <div class="span-5 last">

                       <hr>
                       <div class="searchTitle">Export ValueMap</div>
                       <p>
                       <form action="exportValueMap.html"><input type="submit" value="Export All Data" /> </form>
                       </p>
                       <hr>
                       <div class="searchTitle">Import ValueMap</div>
                       <p>
                            <form method="POST" enctype="multipart/form-data" action="importValueMap.html">
                            <input type="file" name="importFile" id="importFile" size="10px"/><br/>
                            <input type="submit" name="btnimportfile" id="btnimportfile" value="import"/>
                            </form>
                       </p>

                       <hr>
                       <p>
                         <a href="./admin_valuemapadd.html" target="blank">Create new Valuemap</a>
                       </p>
                       <div class="searchTitle">Last Updated</div>
                       <p>
                         ${lastupdated}
                       </p>
                  </div>




              <div id="error" class="span-5 last">
                <c:if test="${!empty searchError}">
                    <div class="error">${searchError}</div>
                </c:if>
              </div>
        </div>






         <!-- Start List -->
         <div class="span-18 last grey" id="content">


            <div id="created" class="span-18 last">
                <c:if test="${!empty statusMessage}">
                        <div class="success"><strong>${statusMessage}</strong></div>
                </c:if>
            </div>

            <c:choose>
            <c:when test="${!empty valueMapList}">

                <div id="buttons" class="span-18 clearfix last">
                     <div><button type="button" class="button" onClick="checkAll('ids');">select all</button></div>
                    <div><button type="button" class="button" onClick="uncheckAll('ids');">clear all</button></div>
                    <div><button type="button" class="button" onClick="deleteValueMap('ids');">delete</button></div>
                    <div class="margintop13"> Found ${paging.totalRecord} record(s)</div>
                </div>

                <table summary="Ad List table"  border="0" cellspacing="0" cellpadding="0">
                  <thead>
                  <tr>
                    <th class="span-1">&nbsp;</th>
                    <th class="span-1">ID</th>
                    <th class="span-2">Format</th>
                    <th class="span-4">Field</th>
                    <th class="span-4">Lookup</th>
                    <th class="span-4">Zett Value</th>
                    <th class="span-2">CategoryID</th>
                    <th class="span-1 last">&nbsp;</th>
                  </tr>
                  </thead>
                  <tbody>
                          <c:forEach items="${valueMapList}" var="valueMap">
                          <form method="post" action="./admin_valuemapedit.html?id=${valueMap.id}"  accept-charset="UTF-8">

                          <tr>
                            <td><input type="checkbox" name="ids" value="${valueMap.id}"></td>
                            <td>${valueMap.id}<input type="hidden" name="currentFormat" value="${valueMapFormSearch.customerFormat}" title="${valueMapFormSearch.customerFormat}" alt="${valueMapFormSearch.customerFormat}"/></td>
                            <td>${valueMap.format}</td>
                            <td><input class="grey" type="text" value="${valueMap.field}" id="fieldForm" name="fieldForm" size="15" title="${valueMap.field}" alt="${valueMap.field}"></td>
                            <td><input class="grey" type="text" value="${valueMap.lookup}" id="lookupForm" name="lookupForm" size="10" title="${valueMap.lookup}" alt="${valueMap.lookup}"></td>
                            <td><input class="grey" type="text" value="${valueMap.zettValue}" id="zettValueForm" name="zettValueForm" size="15" title="${valueMap.zettValue}" alt="${valueMap.zettValue}"</td>
                            <td>
                            <c:choose>
                                <c:when test="${valueMap.categoryId == '0'}">
                                     <input class="grey" type="text" value="-" id="categoryIdForm" name="categoryIdForm" size="3">
                                </c:when>
                                <c:otherwise>
                                   <input class="grey" type="text" value="${valueMap.categoryId}" id="categoryIdForm" name="categoryIdForm" size="3">
                                </c:otherwise>
                            </c:choose>
                            </td>
                            <td>
                                <button type="submit" class="button">save</button>
                            </td>
                            <input type="hidden" name="page" value="${paging.currentPage}"/>
                            </form>
                          </c:forEach>
                  </tbody>

                </table>
                 <div id="buttons" class="span-18 clearfix last">
                     <div><button type="button" class="button" onClick="checkAll('ids');">select all</button></div>
                    <div><button type="button" class="button" onClick="uncheckAll('ids');">clear all</button></div>
                    <div><button type="button" class="button" onClick="deleteValueMap('ids');">delete</button></div>
                    <div class="margintop13"> Found ${paging.totalRecord} record(s)</div>
                </div>


                <div id="page" class="span-18 last grey">
                    <form method="POST" action="./admin_valuemapmain.html">
                        <div class="span-4 margintoppaging">
                            Show page <input type="text" class="paging" name="page" value="${paging.currentPage}"> / ${paging.totalPage}
                        </div>
                        <div class="span-14 pull-1 last">
                             <button type="submit" class="button">update</button>
                        </div>
                        <input type="hidden" name="customerFormat" value="${valueMapFormSearch.customerFormat}"/>
                    </form>
                </div>

                <div class="span-18 clearfix last grey">
                    <c:if test="${paging.currentPage != paging.prevPage}">
                        <div>
                            <form method="POST" action="./admin_valuemapmain.html">

                                <button type="submit" class="button">previous page</button>
                                <input type="hidden" name="page" value="${paging.prevPage}"/>
                                <input type="hidden" name="customerFormat" value="${valueMapFormSearch.customerFormat}"/>
                            </form>
                        </div>
                    </c:if>
                    <c:if test="${paging.currentPage != paging.nextPage}">
                        <div>
                            <form method="POST" action="./admin_valuemapmain.html">

                                <button type="submit" class="button">Next page</button>
                                <input type="hidden" name="page" value="${paging.nextPage}"/>
                                <input type="hidden" name="customerFormat" value="${valueMapFormSearch.customerFormat}"/>
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
        <!-- End List -->







<%@ include file="template/admin_footer.jsp" %>