<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="template/admin_header.jsp" %>

        <hr/>
        <div class="span-24 last" id="header">
           <h3 class="grey">Create Partner</h3><hr />
        </div>


        <div class="span-5 colborder" id="sidebar">

                  <div id="sidebar_link" class="span-5 last">
                     <br /><br/><br /><br/><br /><br/><br /><br/>
                     <br /><br/>
                  </div>


        </div>

        <div class="span-18 last grey" id="content">

            <div id="error" class="span-18 last">
                <c:if test="${!empty formErrorList}">
                    <c:forEach items="${formErrorList}" var="formError">
                        <div class="error">${formError.errorMessage}</div>
                    </c:forEach>
                </c:if>
            </div>

            <div id="created" class="span-18 last">
                <c:if test="${!empty createdCompleted}">
                        <div class="success">Partner <strong>${createdCompleted}</strong> created successfully</div>
                </c:if>
            </div>

            <form:form method="POST" action="./admin_partneradd.html" commandName="partnerForm">

                <div class="span-18 clearfix last grey">
                    <div class="span-2 margintop6"><label for="id">Login</label></div>
                    <div class="span-16 last">
                        <form:select path="id" id="id" name="id" class="grey">
                              <form:option value="Please_select">Please select</form:option>
                              <c:forEach items="${partnerLoginModelList}" var="partnerLoginModel">
                                 <form:option value="${partnerLoginModel.id}">${partnerLoginModel.login}</form:option>
                              </c:forEach>
                        </form:select> <form:errors path="id" cssClass="error" />
                    </div>
                </div>

                <div class="span-18 clearfix last grey">
                    <div class="span-2 margintop"><label for="identifier">Identifier</label></div>
                    <div class="span-16 last"><form:input class="text" path="identifier" name="identifier" id="identifier" /> <form:errors path="identifier" cssClass="error" /></div>
                </div>

                <div class="span-18 clearfix last grey">
                    <div class="span-2 margintop"><label for="password">Password</label></div>
                    <div class="span-16 last"><form:password class="text" path="password" name="password" id="password" /> <form:errors path="password" cssClass="error" /></div>
                </div>

                <div class="span-18 clearfix last grey">
                    <div class="span-2 margintop"><label for="zClientID">ZClientID</label></div>
                    <div class="span-16 last"><form:input class="text" path="zClientID" name="zClientID" id="zClientID" /> <form:errors path="zClientID" cssClass="error" /></div>
                </div>
                <div class="span-18 clearfix last grey">
                    <div class="span-2 margintop"><label for="description">Description</label></div>
                    <div class="span-16 last"><form:input class="text" path="description" name="description" id="description" /></div>
                </div>

                <div class="span-18 prepend-2 clearfix last grey">
                    <button type="submit" class="button">create</button>
                </div>
            </form:form>

        </div>

<%@ include file="template/admin_footer.jsp" %>