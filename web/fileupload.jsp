<%-- 
    Document   : fileupload
    Created on : Feb 4, 2015, 3:47:29 PM
    Author     : 
--%>

<%@page import="java.util.ArrayList"%>
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
         ArrayList a2=new ArrayList();

          if(request.getAttribute("data")!=null)   
            a2=(ArrayList) request.getAttribute("data");
    
%>
        
        <jsp:include page="/adminMenu.jsp"/>
        <div class="wrapper col5">
        <div id="container">
            <div id="breadcrumb">
                <p>Report</p>
            </div>
               <form method="post" action="attachmentservlet" enctype="multipart/form-data">
                <div align="center">
                <table cellpadding="0" cellspacing="5px"  style="text-align:left" >
                    <tr>
                        <td></td>
                        <td><label for="author">Select File :</label> </td>
                        <td><input type="file" name="file" class="submitbtn" value="uuuuuuuuu"/></td>
                        <td></td>
                    </tr>
                     <tr>
                        <td></td>
                        <td><label>Upload :</label> </td>
                        <td colspan="2" align="left"><input type="submit" value="Upload" class="submitbtn"  id="submit"></td>
                        <td></td>
                   </tr>
                   <tr>
                        <table align="center" width="100%" id="tableid" border="1" >
           <thead style="background-color: silver">
                        <th>Field Id</th>
                        <th>File Name</th>
                        
                  </thead>
                  <tbody>
                  <%
                        String uname=null;
                        String uid=null;
                        for(int i=0;i<a2.size();i++)
                        {%>
                        <tr>
                            <td><%=i+1%></td>
                            <td><a href="viewReport.jsp?f=<%=a2.get(i)%>"><%=a2.get(i)%></a></td>
                        </tr>
                        <%}
                        %>
                        
                  </tbody>
                        </table>
                   </tr>
                </table> 
                    
                </div>
            </form>
        </div>
    </div> 
  </body>
  <jsp:include page="/FooterPage.jsp"/>
</html>