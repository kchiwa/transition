<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="template/admin_header.jsp" %>
        <hr/>
        <div class="span-24 last" id="header">
           <h3 class="grey">Emprof XML Fetcher</h3><hr />
        </div>

        <div class="span-5 colborder" id="sidebar">
              <div id="sidebar_link" class="span-5 last">
                 <%@ include file="../template/quicklink.jsp" %>
                 <br/><br/><br/><br/><br/><br/>
              </div>
        </div>

        <div class="span-18 last" id="content">
        <form name="frmEmprof" action="emprof-fetcher.html" method="get">
            <div class="clear">
               <div class="span-1 margintop8"><label for="url">URL</label></div>
               <div class="span-18 last"><input class="width60" type="text" name="url" id="url"/></div>
            </div>
            <div class="span-18 last"><button type="submit" class="button">download and process</button></div>
        </form>
        </div>

<%@ include file="template/admin_footer.jsp" %>