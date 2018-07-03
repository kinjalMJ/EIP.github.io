<%-- 
    Document   : index
    Created on : 8 Oct, 2014, 4:32:01 PM
    Author     : Kinjal Jarodiya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"

    "http://www.w3.org/TR/html4/loose.dtd">
<jsp:include page="/HeaderPage.jsp"/>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
   
        <link rel="stylesheet" href="css/layout.css" type="text/css" />
   
        <title>File Upload Example in JSP and Servlet - Java web application</title>

    </head>


    <body>


        <jsp:include page="/adminMenu.jsp"/>
        <div class="wrapper col5">
        <div id="container">
            <div id="breadcrumb">
                <p>Choose File to Upload in Server</p>
            </div>
       
            <form action="upload" method="post" enctype="multipart/form-data">
       
                <input type="file" name="file" />

                <input type="submit" value="upload" />

            </form>         

        </div>
        </div>
    </body>

    <jsp:include page="/FooterPage.jsp"/>

</html>

