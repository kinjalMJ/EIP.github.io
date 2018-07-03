<%-- 
    Document   : viewVDetail
    Created on : 8 Mar, 2015, 3:20:41 PM
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
         String vid="",did="",pid="",vdate="",weight="",height="",pulses="",des="",uid="";
         if(request.getAttribute("data")!=null)
        {
           a1= (ArrayList)request.getAttribute("data");
           //out.println(a1);
          pid= a1.get(0).toString();
           did= a1.get(1).toString();
           vid= a1.get(2).toString();
          
           vdate= a1.get(3).toString();
           weight= a1.get(4).toString();
           height=a1.get(5).toString();
           pulses= a1.get(6).toString();
           des= a1.get(7).toString();
           uid=a1.get(8).toString();
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
                <p>Your Profile</p>
            </div>
            <form method="get" action="vaccination.jsp" id="form76" name="formVP" >
            <div align="center">
            <table cellpadding="0" cellspacing="5px"  style="text-align:left" >
               
                  <tr>
                        <td></td>
                        <td> <label for="author">Vaacine Id:</label> </td> 
                        <td> <label for="author"><%=vid%></label> </td>
                        <td></td>
                  </tr>
                  <tr>
                        <td></td>
                        <td> <label for="author">Vaccine Dose Id:</label> </td> 
                        <td> <label for="author"><%=did%></label> </td>
                        <td></td>
                  </tr>
                  <tr>
                        <td></td>
                        <td> <label for="author">Patient Id:</label> </td> 
                        <td> <label for="author"><%=pid%></label> </td>
                        <td></td>
                  </tr>
                  <tr>
                        <td></td>
                        <td> <label for="author">Vaccination Date:</label> </td> 
                        <td> <label for="author"><%=vdate%></label> </td>
                        <td></td>
                  </tr>
                  <tr>
                        <td></td>
                        <td> <label for="author">Weight:</label> </td> 
                        <td> <label for="author"><%=weight%></label> </td>
                        <td></td>
                  </tr>
                  
                  <tr>
                        <td></td>
                        <td> <label for="author">Height:</label> </td> 
                        <td> <label for="author"><%=height%></label> </td>
                        <td></td>
                  </tr>
                  <tr>
                        <td></td>
                        <td> <label for="author">Pulses:</label> </td> 
                        <td> <label for="author"><%=pulses%></label> </td>
                        <td></td>
                  </tr>
                  <tr>
                        <td></td>
                        <td> <label for="author">Description:</label> </td> 
                        <td> <label for="author"><%=des%></label> </td>
                        <td></td>
                  </tr>
                  <tr>
                        <td></td>
                        <td> <label for="author">User Id:</label> </td> 
                        <td> <label for="author"><%=uid%></label> </td>
                        <td></td>
                  </tr>
                  <tr>
                      <td><a href="vaccination.jsp?patientId=<%=pid%>">Back</a></td>
                     
                  </tr>
    </body>
</html>
