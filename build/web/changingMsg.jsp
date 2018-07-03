                        <%-- 
    Document   : changingMsg.jsp
    Created on : 4 Mar, 2015, 2:02:25 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page="/HeaderPage.jsp"/>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/layout.css" type="text/css" />
        
    </head>
    <body>
         <jsp:include page="/adminMenu.jsp"/>
        <div class="wrapper col5">
        <div id="container">
            <div id="breadcrumb">
                <p>Message</p>
            </div>
            <form method="get" action="" id="form65" name="formCM" >
                <div align="center">
                    <table cellpadding="0" cellspacing="5px"  style="text-align:center" >
                   <tr>
                   <td> <p><font>Your Password is Successfully </font></p></td>
                   </tr>
                   <tr>
                   <td>Changed......</td>
                   </tr>
                    </table>
                </div>
                </div>
        </div>
    </body>
    <jsp:include page="/FooterPage.jsp"/>

</html>
