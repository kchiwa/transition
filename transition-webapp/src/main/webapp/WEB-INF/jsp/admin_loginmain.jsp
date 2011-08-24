<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="template/admin_header.jsp" %>


<style type="text/css">

#hintbox{ /*CSS for pop up hint box */
position:absolute;
top: 0;
background-color: lightyellow;
width: 150px; /*Default width of hint.*/
padding: 3px;
border:1px solid black;
font:normal 11px Verdana;
line-height:18px;
z-index:100;
border-right: 3px solid black;
border-bottom: 3px solid black;
visibility: hidden;
}

.hintanchor{ /*CSS for link that shows hint onmouseover*/
font-weight: bold;
color: navy;
margin: 3px 8px;
}

</style>

<script type="text/javascript">

/***********************************************
* Show Hint script- © Dynamic Drive (www.dynamicdrive.com)
* This notice MUST stay intact for legal use
* Visit http://www.dynamicdrive.com/ for this script and 100s more.
***********************************************/

var horizontal_offset="9px" //horizontal offset of hint box from anchor link

/////No further editting needed

var vertical_offset="0" //horizontal offset of hint box from anchor link. No need to change.
var ie=document.all
var ns6=document.getElementById&&!document.all

function getposOffset(what, offsettype){
var totaloffset=(offsettype=="left")? what.offsetLeft : what.offsetTop;
var parentEl=what.offsetParent;
while (parentEl!=null){
totaloffset=(offsettype=="left")? totaloffset+parentEl.offsetLeft : totaloffset+parentEl.offsetTop;
parentEl=parentEl.offsetParent;
}
return totaloffset;
}

function iecompattest(){
return (document.compatMode && document.compatMode!="BackCompat")? document.documentElement : document.body
}

function clearbrowseredge(obj, whichedge){
var edgeoffset=(whichedge=="rightedge")? parseInt(horizontal_offset)*-1 : parseInt(vertical_offset)*-1
if (whichedge=="rightedge"){
var windowedge=ie && !window.opera? iecompattest().scrollLeft+iecompattest().clientWidth-30 : window.pageXOffset+window.innerWidth-40
dropmenuobj.contentmeasure=dropmenuobj.offsetWidth
if (windowedge-dropmenuobj.x < dropmenuobj.contentmeasure)
edgeoffset=dropmenuobj.contentmeasure+obj.offsetWidth+parseInt(horizontal_offset)
}
else{
var windowedge=ie && !window.opera? iecompattest().scrollTop+iecompattest().clientHeight-15 : window.pageYOffset+window.innerHeight-18
dropmenuobj.contentmeasure=dropmenuobj.offsetHeight
if (windowedge-dropmenuobj.y < dropmenuobj.contentmeasure)
edgeoffset=dropmenuobj.contentmeasure-obj.offsetHeight
}
return edgeoffset
}

function showhint(menucontents, obj, e, tipwidth){
if ((ie||ns6) && document.getElementById("hintbox")){
dropmenuobj=document.getElementById("hintbox")
dropmenuobj.innerHTML=menucontents
dropmenuobj.style.left=dropmenuobj.style.top=-500
if (tipwidth!=""){
dropmenuobj.widthobj=dropmenuobj.style
dropmenuobj.widthobj.width=tipwidth
}
dropmenuobj.x=getposOffset(obj, "left")
dropmenuobj.y=getposOffset(obj, "top")
dropmenuobj.style.left=dropmenuobj.x-clearbrowseredge(obj, "rightedge")+obj.offsetWidth+"px"
dropmenuobj.style.top=dropmenuobj.y-clearbrowseredge(obj, "bottomedge")+"px"
dropmenuobj.style.visibility="visible"
obj.onmouseout=hidetip
}
}

function hidetip(e){
dropmenuobj.style.visibility="hidden"
dropmenuobj.style.left="-500px"
}

function createhintbox(){
var divblock=document.createElement("div")
divblock.setAttribute("id", "hintbox")
document.body.appendChild(divblock)
}

if (window.addEventListener)
window.addEventListener("load", createhintbox, false)
else if (window.attachEvent)
window.attachEvent("onload", createhintbox)
else if (document.getElementById)
window.onload=createhintbox


</script>




        <%@ include file="template/admin_main_nav.jsp" %>
        <hr/>
        <div class="span-24 last" id="header">
           <h3 class="grey">Login Lookup</h3><hr />
        </div>


        <div class="span-5 colborder" id="sidebar">

                  <div id="sidebar_link" class="span-5 last">

                  </div>

                  <div class="searchTitle">Search</div>

                  <div id="searchFile">
                     <form:form method="POST" action="./admin_loginmain.html" commandName="partnerForm">

                      <div class="span-2 margintopsearch"><label for="login" class="searchField">Login Name</label></div>
                      <div class="span-3 last"><form:input path="login" class="search" name="login" id="login" /></div>

                      <div class="span-2 margintopsearch"><label for="customerFormat" class="searchField">Format</label></div>
                      <div class="span-3 last">
                        <form:select path="customerFormat" id="customerFormat" name="customerFormat" class="width100 grey">
                              <form:option value="show_all">show all</form:option>
                              <c:forEach items="${customerFormatList}" var="customerFormat">
                                 <form:option value="${customerFormat}">${customerFormat}</form:option>
                              </c:forEach>
                        </form:select>
                      </div>

                      <div class="span-2 margintopsearch"><label for="protocol" class="searchField">Protocol</label></div>
                      <div class="span-3 last">
                        <form:select path="protocol" id="protocol" name="protocol" class="width100 grey">
                              <form:option value="show_all">show all</form:option>
                              <c:forEach items="${ProtocolList}" var="protocol">
                                 <form:option value="${protocol}">${protocol}</form:option>
                              </c:forEach>
                        </form:select>
                      </div>
                      <form:hidden id="requestPage" name="requestPage" path="requestPage" value="1"/>
                      <div class="span-5 prepend-2 last"><button type="submit" class="button">search</button></div>
                  </form:form>
                  </div>

                  <div class="span-5 last">
                       <a href="./admin_loginadd.html" target="blank">Create new login</a>
                  </div>

              <div id="error" class="span-5 last">
                <c:if test="${!empty searchError}">
                    <div class="error">${searchError}</div>
                </c:if>
              </div>
        </div>

        <div class="span-18 last grey" id="content">

            <c:choose>
            <c:when test="${!empty partnerLoginModelList}">

                <table summary="Ad List table"  border="0" cellspacing="0" cellpadding="0">
                  <thead>
                  <tr>
                    <th class="span-3">ID</th>
                    <th class="span-4">Login</th>
                    <th class="span-3">Format</th>
                    <th class="span-3">Protocol</th>
                    <th class="span-4">Password</th>
                    <th class="span-3">Receipt</th>
                    <th class="span-1 last">&nbsp;</th>
                  </tr>
                  </thead>

                  <tbody>
                          <c:forEach items="${partnerLoginModelList}" var="partnerLoginModel">
                          <form method="POST" action="./admin_loginmain.html">
                         <input type="hidden" name="loginId" value="${partnerLoginModel.id}"/>
                          <input type="hidden" name="receipt" value="${partnerLoginModel.receipt}">
                           <input type="hidden" name="requestPage" value="${partnerForm.requestPage}">
                            <input type="hidden" name="login" value="${partnerForm.login}"/>
                            <input type="hidden" name="customerFormat" value="${partnerForm.customerFormat}"/>
                            <input type="hidden" name="protocol" value="${partnerForm.protocol}"/>

                          <tr>
                            <td>${partnerLoginModel.id}</td>
                            <td>${partnerLoginModel.login}</td>
                            <td>${partnerLoginModel.customerFormat}</td>
                            <td>${partnerLoginModel.protocol}</td>
                            <td>${partnerLoginModel.loginPassword}</td>
                            <td>
                            <c:choose>
                                <c:when test="${partnerLoginModel.receipt==true }">
                                    <input style="cursor: pointer" type = "submit" value=" ON  " onMouseover="showhint('Click to turn it OFF', this, event, '150px')" />
                                </c:when>
                                <c:otherwise>
                                  <input style="cursor: pointer"  type = "submit" value=" OFF " onMouseover="showhint('Click to turn it ON', this, event, '150px')"/>
                             </c:otherwise>
                           </c:choose>
                           </td>
                           </form>

                            <td><a href="admin_partnerlogindelete.html?delete_id=${partnerLoginModel.id}" onclick="return confirm('Delete ${partnerLoginModel.login} ?');">Delete</a></td>
                          </c:forEach>
                  </tbody>
                </table>

                <div id="found" class="span-18 last grey">
                   Found ${Paging.totalRecord} record(s)
                </div>
                <div id="page" class="span-18 last grey">
                    <form method="POST" action="./admin_loginmain.html">
                        <div class="span-4 margintoppaging">
                            Show page <input type="text" class="paging" name="requestPage" value="${partnerForm.requestPage}"> / ${Paging.totalPage}
                        </div>
                        <div class="span-14 pull-1 last">
                             <button type="submit" class="button">update</button>
                        </div>
                        <input type="hidden" name="login" value="${partnerForm.login}"/>
                        <input type="hidden" name="customerFormat" value="${partnerForm.customerFormat}"/>
                        <input type="hidden" name="protocol" value="${partnerForm.protocol}"/>
                    </form>
                </div>

                <div class="span-18 clearfix last grey">
                    <c:if test="${partnerForm.requestPage != Paging.prevPage}">
                        <div>

                            <form method="POST" action="./admin_loginmain.html">
                                <button type="submit" class="button">previous page</button>
                                <input type="hidden" name="requestPage" value="${partnerForm.prevoiusPage}">
                                <input type="hidden" name="login" value="${partnerForm.login}"/>
                                <input type="hidden" name="customerFormat" value="${partnerForm.customerFormat}"/>
                                <input type="hidden" name="protocol" value="${partnerForm.protocol}"/>
                            </form>
                        </div>
                    </c:if>
                    <c:if test="${partnerForm.requestPage != Paging.nextPage}">
                        <div>
                            <form method="POST" action="./admin_loginmain.html">
                                <button type="submit" class="button">next page</button>
                                <input type="hidden" name="requestPage" value="${Paging.nextPage}"/>
                                <input type="hidden" name="login" value="${partnerForm.login}"/>
                                <input type="hidden" name="customerFormat" value="${partnerForm.customerFormat}"/>
                                <input type="hidden" name="protocol" value="${partnerForm.protocol}"/>
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