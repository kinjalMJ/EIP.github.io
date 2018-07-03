<%-- 
    Document   : adminDashBoardDisplay
    Created on : 25 Jan, 2015, 1:30:39 PM
    Author     : Kinjal Jarodiya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:include page="/HeaderPage.jsp" />
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Graph Page</title>
            <link rel="stylesheet" href="css/layout.css" type="text/css" />
    </head>
 <body>
    <jsp:include page="/adminMenu.jsp"/>
    <div class="wrapper col5">
        <div id="container">
            <div id="breadcrumb">
                <p>Chart</p>
            </div>
        <img src="adminDashBord.jsp" alt="Progress chart" />
        </div>
    </div>
    </body>
</html>
<jsp:include page="FooterPage.jsp"/>
