<%-- 
    Document   : viewReport
    Created on : 13 Mar, 2015, 3:50:16 PM
    Author     : Kinjal Jarodiya
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
    <body>
        <%
        String f="";
        if(request.getParameter("f")!=null)
        {               
        f=request.getParameter("f").toString();
            out.println(f);
               }
%>
        
        <jsp:include page="/adminMenu.jsp"/>
        <div class="wrapper col5">
        <div id="container">
            <div id="breadcrumb">
                <p>Report</p>
            </div>
               <form method="post" action="uploadFileData" enctype="multipart/form-data">
                <div align="center">
                        <label>Image :</label>
                        <img src="Atachment/<%=f%>" height="500" width="500" ></img>
                        <input type="submit" name="Back" id="Back" value="Back" class="submitbtn" />
                </div>
            </form>
        </div>
    </div> 
  </body>
  <jsp:include page="/FooterPage.jsp"/>
</html>
