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
           <h3 class="grey">Router Status</h3><hr />
        </div>


        <div class="span-5 colborder" id="sidebar">
              <div id="sidebar_link" class="span-5 last">
                 <br/><br/><br/><br/><br/><br/><br/><br/>
                 <br/><br/><br/><br/><br/><br/><br/><br/>
                 <br/><br/><br/><br/><br/><br/><br/><br/>
                 <br/><br/><br/><br/><br/><br/><br/><br/>
                 <br/><br/><br/><br/><br/><br/><br/><br/>
                 <br/><br/><br/><br/><br/><br/><br/><br/>
                 <br/><br/><br/><br/><br/><br/><br/><br/>
                 <br/><br/><br/><br/><br/><br/><br/><br/>
                 <br/><br/><br/><br/><br/><br/><br/><br/>
                 <br/><br/><br/><br/><br/><br/><br/><br/>
                 <br/><br/><br/><br/><br/><br/><br/><br/>
                 <br/><br/><br/><br/><br/><br/><br/><br/>
              </div>
        </div>

        <div class="span-18 last grey" id="content">
           <div id="queueStatus" class="span-18 last queueList">

                 <h1 class="systemStatus borderStatus">FTP Router Switch</h1>
                 <c:if test="${!empty message}">
                    ${message}
                 </c:if>

                     <c:forEach items="${router}" var="router">
                       <form action="router.html" method="post" >
                       <input type="hidden" name="routerId" value="${router.id}" >
                       <input type="hidden" name="active" value="${router.active}" >
                        <div class="span-12 formatName prepend-1">${router.customerFormat}</div>
                        <div class="span-5 last queueNumber">
                           <c:choose>
                             <c:when test="${router.active}">
                                <input style="cursor: pointer" type = "submit" value=" ON  " onMouseover="showhint('Click to turn it OFF', this, event, '150px')" />
                             </c:when>
                             <c:otherwise>
                                <input style="cursor: pointer"  type = "submit" value=" OFF " onMouseover="showhint('Click to turn it ON', this, event, '150px')"/>
                             </c:otherwise>
                           </c:choose>
                        </div>
                        </form>
                      </c:forEach>

            </div>

        </div>

        <div class="span-18 last grey" id="content">
           <div id="queueStatus" class="span-18 last queueList">

                 <h1 class="systemStatus borderStatus">Router Status</h1>
                     <c:forEach items="${routerList}" var="routerList">
                        <div class="span-12 formatName prepend-1">${routerList.routerName}</div>
                        <c:choose>
                        <c:when test="${routerList.serviceStatus == 'Started'}">
                            <div class="span-5 last formatName ok">${routerList.serviceStatus}</div>
                        </c:when>
                        <c:otherwise>
                            <div class="span-5 last formatName warning">${routerList.serviceStatus}</div>
                        </c:otherwise>
                        </c:choose>
                      </c:forEach>

            </div>

             <div class="span-18 last grey" id="content">
                       <div id="queueStatus" class="span-18 last queueList">

                             <h1 class="systemStatus borderStatus">quartzroutes</h1>

                             <c:if test="${!empty message}">
                                   ${message}
                            </c:if>

                              <c:forEach items= "${schedulerList}" var="schedulerModel" >
                               <form action="setscheduler.html" method="post" >

                               <input type="hidden" name="shedulerId" value="${schedulerModel.id}"/>
                               <input type="hidden" name="clientname" value="${schedulerModel.clientName}"/>
                               <input type="hidden" name="active" value="${schedulerModel.active}"/>
                               <div class="span-12 formatName prepend-1">${schedulerModel.clientName}</div>
                                <div class="span-5 last queueNumber">
                                   <c:choose>
                                     <c:when test="${schedulerModel.active}">

                                <input style="cursor: pointer" type = "submit" value=" ON  " onMouseover="showhint('Click to turn it OFF', this, event, '150px')" />
                             </c:when>
                             <c:otherwise>
                                <input style="cursor: pointer"  type = "submit" value=" OFF " onMouseover="showhint('Click to turn it ON', this, event, '150px')"/>
                             </c:otherwise>

                             </c:choose>
                        </div>
                        </form>
                        </c:forEach>

                    </div>


        </div>



<%@ include file="template/admin_footer.jsp" %>