<%-- 
    Document   : viewTask
    Created on : 9 Mar, 2015, 4:01:19 PM
    Author     : Kinjal Jarodiya
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
         <% 
         ArrayList a1=new ArrayList();
         String tid="",tnm="",td="",tdes="",uid="",type="";
         if(request.getAttribute("data")!=null)
        {
           a1= (ArrayList)request.getAttribute("data");
           //out.println(a1);
           tid= a1.get(0).toString();
           tnm= a1.get(1).toString();
           td= a1.get(2).toString();
           tdes= a1.get(3).toString();
           uid=a1.get(4).toString();
           type= a1.get(5).toString();
           
         }
        
    %>
   

    </head>
    <body>
        <% 
      
        if(request.getAttribute("data")!=null)   
            a1=(ArrayList) request.getAttribute("data");
        //out.println(a1);
     %>
        <jsp:include page="/adminMenu.jsp"/>
        <div class="wrapper col5">
        <div id="container">
            <div id="breadcrumb">
                <p>Your Task</p>
            </div>
            <form method="get" action="discardTask" id="form76" name="formVP">
            <div align="center">
            <table cellpadding="0" cellspacing="5px"  style="text-align:left" >
                <tr>
                    <td><input type="hidden" value="<%=tid%>" id="tid" name="tid"></td>
                </tr>
                  <tr>
                        <td></td>
                        <td> <label for="author">Task Id:</label> </td> 
                        <td> <label for="author"><%=tid%></label> </td>
                        <td></td>
                  </tr>
                  <tr>
                        <td></td>
                        <td> <label for="author">Task Name:</label> </td> 
                        <td> <label for="author"><%=tnm%></label> </td>
                        <td></td>
                  </tr>
                  <tr>
                        <td></td>
                        <td> <label for="author">Task Date:</label> </td> 
                        <td> <label for="author"><%=td%></label> </td>
                        <td></td>
                  </tr>
                  <tr>
                        <td></td>
                        <td> <label for="author">Description:</label> </td> 
                        <td> <label for="author"><%=tdes%></label> </td>
                        <td></td>
                  </tr>
                  <tr>
                        <td></td>
                        <td> <label for="author">User Id:</label> </td> 
                        <td> <label for="author"><%=uid%></label> </td>
                        <td></td>
                  </tr>
                  <tr>
                        <td></td>
                        <td> <label for="author">User Type:</label> </td> 
                        <td> <label for="author"><%=type%></label> </td>
                        <td></td>
                  </tr>
                  <tr><td>&nbsp;</td>
                      <td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td>
                      <td>&nbsp;</td>
                      <td>&nbsp;</td><td>&nbsp;</td>
                      <td></td></tr>
            </table>
                        <div align="center">
                      <input type ="submit" class="Back" id="Back" value="Back" style="font-weight: bold;">
                          <a href="discardTask"><input type ="submit" class="Discard" id="Discard" value="Discard" style="font-weight: bold;"></a>
                 
                        </div>
        </div>          
            </form>
        </div>
        </div> 
    </body>
     <jsp:include page="/FooterPage.jsp"/>
</html>
