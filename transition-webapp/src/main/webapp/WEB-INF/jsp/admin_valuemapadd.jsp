<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="template/admin_header.jsp" %>

        <hr/>
        <div class="span-24 last" id="header">
           <h3 class="grey">Create ValueMap</h3><hr />
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
                        <div class="error">${formError}</div>
                    </c:forEach>
                </c:if>
            </div>

            <div id="created" class="span-18 last">
                <c:if test="${!empty save}">
                        <div class="success">ValueMap created successfully</div>
                </c:if>
            </div>

            <form:form method="POST" action="./admin_valuemapadd.html" commandName="valueMapFormSearch" accept-charset="UTF-8" >

                <div class="span-18 clearfix last grey">
                    <div class="span-2 margintop6"><label for="customerFormat">Format</label></div>
                    <div class="span-16 last">
                        <form:select path="customerFormat" id="customerFormat" name="customerFormat" class="grey">
                              <form:option value="">Please select</form:option>
                              <c:forEach items="${customerFormatList}" var="customerFormat">
                                 <form:option value="${customerFormat}">${customerFormat}</form:option>
                              </c:forEach>
                        </form:select> <form:errors path="customerFormat" cssClass="error" />
                    </div>
                </div>

                <div class="span-18 clearfix last grey">
                    <div class="span-2 margintop"><label for="login">Lookup</label></div>
                    <div class="span-16 last"><form:input class="text" path="lookup" name="lookup" id="lookup" /> <form:errors path="lookup" cssClass="error" /></div>
                </div>

                <div class="span-18 clearfix last grey">
                    <div class="span-2 margintop"><label for="password">Field</label></div>
                    <div class="span-16 last"><form:input class="text" path="field" name="field" id="field" /> <form:errors path="field" cssClass="error" /></div>
                </div>

                <div class="span-18 clearfix last grey">
                    <div class="span-2 margintop"><label for="login">ZettValue</label></div>
                    <div class="span-16 last"><form:input class="text" path="zettValue" name="zettValue" id="zettValue" /> <form:errors path="zettValue" cssClass="error" /></div>
                </div>

                 <div class="span-18 clearfix last grey">
                    <div class="span-2 margintop"><label for="login">CategoryId</label></div>
                    <div class="span-16 last"><form:input class="text" path="categoryId" name="categoryId" id="categoryId" /> <form:errors path="categoryId" cssClass="error" /></div>
                </div>

                <div class="span-18 prepend-2 clearfix last grey">
                    <button type="submit" class="button">create</button>
                </div>
            </form:form>

        </div>

<%@ include file="template/admin_footer.jsp" %>