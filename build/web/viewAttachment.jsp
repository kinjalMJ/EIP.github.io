<%-- 
    Document   : viewAttachment
    Created on : Feb 5, 2015, 5:52:28 PM
    Author     : Jinal
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:include page="/HeaderPage.jsp"/>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
        <link rel="stylesheet" href="css/layout.css" type="text/css" />
    </head>
    <%
    String path="";
    if(request.getParameter("path")!=null)
           path= request.getParameter("path").toString();
    %>
    <body>
        <jsp:include page="/adminMenu.jsp"/>
        <div class="wrapper col5">
        <div id="container">
            <div id="breadcrumb">
                <p>Drug Infomation</p>
            </div>
            <form method="get" action="" id="form24" name="viewAttachment" >
                <div align="center">
                    <img src="Attachment/<%=path%>"height="100" width="100" >Image
                </div>
            </form>
        </div>
    </div> 
  </body>
  <jsp:include page="/FooterPage.jsp"/>
</html>