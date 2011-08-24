<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="template/admin_header.jsp" %>
<%@ include file="template/admin_main_nav.jsp" %>

        <hr/>
        <div class="span-24 last" id="header">
        <h3 class="grey">File Information</h3><hr/>
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
                         <c:when test="${FileInformationBean.status=='OK'}">
                                <span class="ok">OK</span>
                         </c:when>
                         <c:when test="${FileInformationBean.status=='MISSING MEDIA'}">
                                <span class="warning">MEDIA MISSING</span>
                         </c:when>
                         <c:when test="${FileInformationBean.status=='ERROR'}">
                                <span class="err">ERROR</span>
                         </c:when>
                         <c:when test="${FileInformationBean.status=='CLOSED'}">
                                <span class="quiet">CLOSED</span>
                         </c:when>
                         <c:otherwise>
                                <span class="ok">${FileInformationBean.status}</span>
                         </c:otherwise>
                    </c:choose>
              </dd>
              <dt>File state ID</dt>
              <dd>${FileInformationBean.id}</dd>
              <dt>Client name</dt>
              <dd>${FileInformationBean.clientName}</dd>
              <dt>Client format</dt>
              <dd>${FileInformationBean.customerFormat}</dd>
              <dt>File name</dt>
              <dd>${FileInformationBean.fileName}</dd>
              <c:if test="${FileStateDataModel.fileSize != ''}">
                  <dt>File size</dt>
                  <dd>${FileInformationBean.fileSize}</dd>
              </c:if>
              <dt>Created time</dt>
              <dd>${FileInformationBean.createdTime}</dd>
              <c:if test="${fileType != 'media'}">
                  <dt>Re-import</dt>
                    <c:if test="${parentFile != null}">
                      <dd>
                        <a href="./admin_archive_re-import_file.html?fileid=${parentFile.id}" onclick="return confirm('Re-import this zip file ?');">re-import Parent (Zip)</a>
                     </dd>
                   </c:if>
                   <c:if test="${fileType == 'xml'}">
                      <dd>
                            <a href="./admin_archive_re-import_file.html?fileid=${FileInformationBean.id}" onclick="return confirm('Re-import this xml file ?');">re-import this XML</a>
                      </dd>
                   </c:if>
                   <c:if test="${fileType == 'zip'}">
                      <dd>
                            <a href="./admin_archive_re-import_file.html?fileid=${FileInformationBean.id}" onclick="return confirm('Re-import this zip file ?');">re-import this ZIP</a>
                      </dd>
                   </c:if>
             </c:if>
          </dl>
          <!-- <p><a href="./admin_main.html">back</a></p> -->
        </div>

        <div class="span-5 last" id="sidebar">
          <dl class="grey">
              <dt>Ad list</dt>
              <c:forEach items="${FileInformationBean.adStateModelsList}" var="AdStateModel">
                    <c:choose>
                       <c:when test="${AdStateModel.adStateStatusInString=='ERROR'}">
                            <dd><span class="err">Error</span> - <a href="./admin_adinfo.html?adID=${AdStateModel.id}" target="_blank">${AdStateModel.adExternalRef}</a></dd>
                       </c:when>
                       <c:when test="${AdStateModel.adStateStatusInString=='CLOSED'}">
                            <dd><span class="quiet">Closed</span> - <a href="./admin_adinfo.html?adID=${AdStateModel.id}" target="_blank">${AdStateModel.adExternalRef}</a></dd>
                       </c:when>
                       <c:when test="${AdStateModel.adStateStatusInString=='MISSING MEDIA'}">
                            <dd><span class="warning">Media missing</span> - <a href="./admin_adinfo.html?adID=${AdStateModel.id}" target="_blank">${AdStateModel.adExternalRef}</a></dd>
                       </c:when>
                       <c:when test="${AdStateModel.adStateStatusInString=='OK'}">
                            <dd><span class="ok">OK</span> - <a href="./admin_adinfo.html?adID=${AdStateModel.id}" target="_blank">${AdStateModel.adExternalRef}</a></dd>
                       </c:when>
                       <c:when test="${AdStateModel.adStateStatusInString=='QUEUE'}">
                            <dd><span class="ok">Queue</span> - <a href="./admin_adinfo.html?adID=${AdStateModel.id}" target="_blank">${AdStateModel.adExternalRef}</a></dd>
                       </c:when>
                       <c:otherwise>
                            <dd>-</dd>
                       </c:otherwise>
                    </c:choose>
              </c:forEach>
          </dl>
          <p class="small">
            <span class="ok">Green</span> = OK or in queue <br/>
            <span class="err">Red</span> = Error <br />
            <span class="warning">Orange</span> = Media missing <br />
            <span class="quiet">Grey</span> = Transaction closed<br />

          </p>
        </div>

        <c:if test="${FileInformationBean.errorMessage!='-'}">
        <div class="span-24 last" id="error">
             <br /><hr />
             <dl class="grey">
              <dt>Error ID (JMS)</dt>
              <dd>${FileInformationBean.jmsId}</dd>
              <dt>Reason</dt>
              <dd><span class="err">${FileInformationBean.errorMessage}</span></dd>
              <c:if test="${!empty FileInformationBean.validationErrorMessage}">
                  <dt>Details</dt>
                  <dd>${FileInformationBean.validationErrorMessage}</dd>
              </c:if>
             </dl>
              <c:if test="${FileInformationBean.fileType == 'xml'}">
                  <p>
                      <form action="admin_adfile_process.html" method="post">
                         <label for="xml">XML</label>
                         <textarea class="width100 medium" rows="50" name="xml" id="xml">${FileInformationBean.xml}</textarea><br/>
                         <input type="hidden" name="fileID" value="${fileId}"/>
                         <input type="hidden" name="jmsid" value="${FileInformationBean.jmsId}"/>
                         <button type="submit" class="button">Resubmit</button>
                      </form>
                  </p>
              </c:if>
        </div>
        </c:if>

  </c:otherwise>
       </c:choose>

<%@ include file="template/admin_footer.jsp" %>