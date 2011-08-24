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
           <h3 class="grey">ValueMap Import Information</h3><hr />
        </div>
        <div class="span-24 last grey" id="content">

                <c:if test="${!empty errorMessage}">
                    <div class="error">${errorMessage}</div>
                </c:if>

                <c:forEach items="${importDetail}" var="detail">
                      <br> ${detail}
                </c:forEach>

        </div>

<%@ include file="template/admin_footer.jsp" %>