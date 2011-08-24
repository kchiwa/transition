<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="template/admin_header.jsp" %>
<%@ include file="template/admin_main_nav.jsp" %>
<script type="text/javascript" src="showimage.js"></script>
<script type="text/javascript" src="js/tooltip_image.js"></script>
<link rel="stylesheet" type="text/css" href="css/tooltip_image.css" />

<script language="Javascript">
<!--
function ShowImage(id,Source) {
if (Source=="1"){
if (document.layers) document.layers[''+id+''].visibility = "show"
else if (document.all) document.all[''+id+''].style.visibility = "visible"
else if (document.getElementById){
document.getElementById(''+id+'').style.visibility = "visible"
document.getElementById(''+id+'').style.top = event.pageY +10
document.getElementById(''+id+'').style.left = event.pageX -50
}
}
else
if (Source=="0"){
if (document.layers) document.layers[''+id+''].visibility = "hide"
else if (document.all) document.all[''+id+''].style.visibility = "hidden"
else if (document.getElementById) document.getElementById(''+id+'').style.visibility = "hidden"
}
}
//-->
</script>
<style type="text/css">
#Style {
position:absolute;
visibility:hidden;
border:solid 1px #CCC;
padding:5px;

}
</style>

        <hr/>
        <div class="span-24 last" id="header">
        <h3 class="grey">Advertisement Information</h3><hr/>
        </div>

  <c:choose>
            <c:when test="${!empty errorMessage}">
             <div class="span-24 last" id="content">
               <div class="error">${errorMessage}</div>
             </div>
            </c:when>
            <c:otherwise>


        <div class="span-15 colborder" id="content">
          <dl class="grey">
              <dt>Status</dt>
              <dd class="formatName">
                    <c:choose>
                         <c:when test="${AdInformationBean.status=='OK'}">
                                <span class="ok">OK</span>
                         </c:when>
                         <c:when test="${AdInformationBean.status=='MISSING MEDIA'}">
                                <span class="warning">MEDIA MISSING</span>
                         </c:when>
                         <c:when test="${AdInformationBean.status=='ERROR'}">
                                <span class="err">ERROR</span>
                         </c:when>
                         <c:when test="${AdInformationBean.status=='CLOSED'}">
                                <span class="quiet">CLOSED</span>
                         </c:when>
                         <c:otherwise>
                                <span class="ok">${AdInformationBean.status}</span>
                         </c:otherwise>
                    </c:choose>
              </dd>
              <dt>File state ID</dt>
              <dd><a href="./admin_fileinfo.html?fileID=${AdInformationBean.fileStateID}">${AdInformationBean.fileStateID}</a></dd>
              <dt>Zett ID <a href="${zettUrl}/export/dumpObject?id=${AdInformationBean.zadObjectId}" target="_blank"><img class="padding" src="<c:url value="/image/xml_icon.png" />" alt="See this advertisement in an XML format" title="See this advertisement in an XML format"/></a></dt>
              <dd>
                    <c:choose>
                        <c:when test="${AdInformationBean.zadObjectId != '0'}">
                             <a href="${zettUrl}/?${AdInformationBean.zadObjectId}&noCheck=true" target="_blank">${AdInformationBean.zadObjectId}</a>
                        </c:when>
                        <c:otherwise>
                             -
                        </c:otherwise>
                    </c:choose>
              </dd>
              <dt>Zett client ID</dt>
              <dd>${AdInformationBean.zClientId}</dd>
              <dt>Format</dt>
              <dd>${AdInformationBean.clientFormat}</dd>
              <dt>Client reference</dt>
              <dd>${AdInformationBean.adExternalRef}</dd>
              <dt>SHA-hash</dt>
              <dd>${AdInformationBean.shaHash}</dd>
              <dt>Created time</dt>
              <dd>${AdInformationBean.createdTime}</dd>
              <dt>Modified time</dt>
              <dd>${AdInformationBean.modifiedTime}</dd>
              <!--
              <dt>Re-import</dt>
              <dd>
                    <a href="./admin_archive_re-import_ad.html?adid=${AdInformationBean.id}">re-import this ad</a>
              </dd>
              -->

          </dl>
          <!-- <p><a href="./admin_main.html">back</a></p> -->
        </div>

        <div class="span-5 last" id="sidebar">
          <dl class="grey">
              <dt>Media list</dt>
              <c:forEach items="${AdInformationBean.mediaStateModelsList}" var="MediaStateModel">
                    <c:if test="${MediaStateModel.status=='PRODUCTION'}">
                     <%--
                     <dd><span class="ok">${MediaStateModel.extref}</span><c:if test="${!empty MediaStateModel.title}"> - ${MediaStateModel.title} (${MediaStateModel.prodref})</c:if></dd>
                     <dd><span class="ok" onMouseOver="ShowImage('Style',1)" onMouseOut="ShowImage('Style',0)">${MediaStateModel.extref}</span><c:if test="${!empty MediaStateModel.title}"> - ${MediaStateModel.title} (${MediaStateModel.prodref})</c:if></dd>
                    --%>

                    <dd><span class="ok"onMouseOver="tooltip.show('<img src=\'${MediaStateModel.imageURL}${MediaStateModel.prodref}\' />');" onMouseOut="tooltip.hide();">${MediaStateModel.extref}</span><c:if test="${!empty MediaStateModel.title}"> - ${MediaStateModel.title} (${MediaStateModel.prodref})</c:if></dd>
                    <div id="Style"><img src="${MediaStateModel.imageURL}${MediaStateModel.prodref}"></div>

                    <%--
                    <div>url==>${MediaStateModel.imageURL} </div>
                    <div>filename ===> ${MediaStateModel.prodref}</div>
                    --%>
                    <%--
                    <div id="Style"><img src="http://img.zett.no/searchthumb165/searchthumb165/ac/0c/ac0c915e029cd0be90f41c782edce0c7"></div>
                    --%>
                    </c:if>
                    <c:if test="${MediaStateModel.status=='MISSING'}">
                          <dd><span class="err">${MediaStateModel.extref}</span><c:if test="${!empty MediaStateModel.title}"> - ${MediaStateModel.title} (${MediaStateModel.prodref})</c:if></dd>
                    </c:if>
                    <c:if test="${MediaStateModel.status=='UPLOADED'}">
                          <dd><span class="warning">${MediaStateModel.extref}</span><c:if test="${!empty MediaStateModel.title}"> - ${MediaStateModel.title} (${MediaStateModel.prodref})</c:if></dd>
                    </c:if>
              </c:forEach>
          </dl>
          <p class="small">
            <span class="ok">Green</span> = Media OK <br/>
            <span class="err">Red</span> = Media missing <br />
            <span class="warning">Orange</span> = Media uploaded but not in production <br />

          </p>
        </div>
        <c:if test="${AdInformationBean.errorMessage!='-'}">
        <div class="span-24 last" id="error">
             <br /><hr />
             <dl class="grey">
              <dt>Error ID (JMS)</dt>
              <dd>${AdInformationBean.jmsId}</dd>
              <dt>Reason</dt>
              <dd><span class="err">${AdInformationBean.errorMessage}</span></dd>
              <c:if test="${!empty AdInformationBean.validationErrorMessage}">
                  <dt>Details</dt>
                  <dd>${AdInformationBean.validationErrorMessage}</dd>
              </c:if>
             </dl>
              <p>
                  <form action="admin_adinfo_process.html" method="post">
                     <label for="xml">XML</label>
                     <textarea class="width100 medium" rows="50" name="xml" id="xml">${AdInformationBean.xml}</textarea><br/>
                     <input type="hidden" name="adID" value="${adId}"/>
                     <input type="hidden" name="jmsid" value="${AdInformationBean.jmsId}"/>
                     <button type="submit" class="button">Resubmit</button>
              </form>
              </p>
        </div>
        </c:if>
 </c:otherwise>
</c:choose>

<%@ include file="template/admin_footer.jsp" %>