<%@ page contentType="text/xml; charset=iso-8859-1" session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<adstate>
    <adstateid>${adstate.id}</adstateid>
    <status>${adstate.status}</status>
    <clientid>${adstate.zClientId}</clientid>
     <adexternalref>${adstate.adExternalRef}</adexternalref>
    <shahash>${adstate.shaHash}</shahash>
    <filestate>
        <customerformat>${adstate.fileStateModel.customerFormat} </customerformat>
        <owner>${adstate.fileStateModel.owner}</owner>
        <filename>${adstate.fileStateModel.filename}</filename>
        <createdtime>${adstate.fileStateModel.createdTime}</createdtime>
    </filestate>
    <mediastates>
         <c:forEach var="mediastate" items="${mediastate}">
          <mediastate id="${mediastate.id}">
              <title>${mediastate.title}</title>
              <contenttype>${mediastate.contentType}</contenttype>
              <extref>${mediastate.extref}</extref>
              <status>${mediastate.status}</status>
              <sequencenum>${mediastate.sequenceNum}</sequencenum>
              <md5hash>${mediastate.md5hash}</md5hash>
              <prodref>${mediastate.prodref}</prodref>
              <lastModified>${mediastate.lastModified}</lastModified>
         </mediastate>
      </c:forEach>
    </mediastates>
</adstate>