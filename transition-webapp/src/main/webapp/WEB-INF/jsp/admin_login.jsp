<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="template/admin_header.jsp" %>

        <hr/>
        <div class="span-24 last" id="content">
              <h3 class="loud grey">Sign In</h3>
              <form action="./admin_dashboard.html">

              <div class="clear">
              <div class="span-2 margintop"><label for="email">Email</label></div>
              <div class="span-22 last"><input type="text" class="text" name="email" id="email"></div>
              </div>

              <div class="clear">
              <div class="span-2 margintop"><label for="password">Password</label></div>
              <div class="span-22 last"><input type="password" class="text" name="password" id="password"></div>
              </div>

              <div class="span-24 prepend-2 last"><button type="submit" class="button">sign in</button></div>

              </form>
        </div>

<%@ include file="template/admin_footer.jsp" %>