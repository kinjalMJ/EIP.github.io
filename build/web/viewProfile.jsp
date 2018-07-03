<%-- 
    Document   : viewProfile
    Created on : 3 Mar, 2015, 2:54:13 PM
    Author     : User
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
         String fn="",ln="",gen="",bd="",bg="",ed="",ex="",mn="",eid="",cty="",des="",bt="",btu="",wb="",hb="",heb="",dt="",sym="",cd="";
          String valM="";
          String valF="";
          String operation="";
          String uid="";
          HttpSession s1=request.getSession(false);
           String type=s1.getAttribute("Type").toString();
 
         if(request.getAttribute("data")!=null)
        {
            
             
             
           a1= (ArrayList)request.getAttribute("data");
           //out.println(a1);
          fn= a1.get(0).toString();
           ln= a1.get(1).toString();
           gen= a1.get(2).toString();
          
       
           bd= a1.get(3).toString();
           bg= a1.get(4).toString();
           
           if(type.equalsIgnoreCase("admin") || type.equalsIgnoreCase("HealthcareProvider"))
           {
           ed= a1.get(5).toString();
           ex= a1.get(6).toString();
           mn= a1.get(7).toString();
           eid= a1.get(8).toString();
           cty= a1.get(9).toString();
            des= a1.get(10).toString();
           }
            else if(type.equalsIgnoreCase("patient"))
           {
           bt= a1.get(5).toString();
           btu= a1.get(6).toString();
           wb= a1.get(7).toString();
           hb= a1.get(8).toString();
           heb= a1.get(9).toString();
           dt = a1.get(10).toString();
           sym = a1.get(11).toString();
           cd= a1.get(12).toString();
           des= a1.get(13).toString();
            }
          
          // editadmina1.add(rs.getString("First_Name"));*/
            
                
        
                
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
            <form method="get" action="" id="form76" name="formVP" >
            <div align="center">
            <table cellpadding="0" cellspacing="5px"  style="text-align:left" >
               
                  <tr>
                        <td></td>
                        <td> <label for="author">First Name:</label> </td> 
                        <td> <label for="author"><%=fn%></label> </td>
                        <td></td>
                  </tr>
                  <tr>
                        <td></td>
                        <td> <label for="author">Last Name:</label> </td> 
                        <td> <label for="author"><%=ln%></label> </td>
                        <td></td>
                  </tr>
                  <tr>
                        <td></td>
                        <td> <label for="author">Gender:</label> </td> 
                        <td> <label for="author"><%=gen%></label> </td>
                        <td></td>
                  </tr>
                  <tr>
                        <td></td>
                        <td> <label for="author">Birth Date:</label> </td> 
                        <td> <label for="author"><%=bd%></label> </td>
                        <td></td>
                  </tr>
                  <tr>
                        <td></td>
                        <td> <label for="author">Blood Group:</label> </td> 
                        <td> <label for="author"><%=bg%></label> </td>
                        <td></td>
                  </tr>
                   <%
                      
                        if(type.equalsIgnoreCase("admin") || type.equalsIgnoreCase("HealthcareProvider"))
                       {
                  %>
                  <tr>
                        <td></td>
                        <td> <label for="author">Education:</label> </td> 
                        <td> <label for="author"><%=ed%></label> </td>
                        <td></td>
                  </tr>
                  <tr>
                        <td></td>
                        <td> <label for="author">Experience:</label> </td> 
                        <td> <label for="author"><%=ex%></label> </td>
                        <td></td>
                  </tr>
                  <tr>
                        <td></td>
                        <td> <label for="author">Mobile No:</label> </td> 
                        <td> <label for="author"><%=mn%></label> </td>
                        <td></td>
                  </tr>
                  <tr>
                        <td></td>
                        <td> <label for="author">City:</label> </td> 
                        <td> <label for="author"><%=cty%></label> </td>
                        <td></td>
                  </tr>
                  <tr>
                        <td></td>
                        <td> <label for="author">Email:</label> </td> 
                        <td> <label for="author"><%=eid%></label> </td>
                        <td></td>
                  </tr>
                  <%
                       }
                         else if(type.equalsIgnoreCase("patient"))
                       {
                  %>
                  <tr>
                        <td></td>
                        <td> <label for="author">Birth Time:</label> </td> 
                        <td> <label for="author"><%=bt%></label> </td>
                        <td></td>
                  </tr>
                  <tr>
                        <td></td>
                        <td> <label for="author">Birth Time Unit:</label> </td> 
                        <td> <label for="author"><%=btu%></label> </td>
                        <td></td>
                  </tr>
                  <tr>
                        <td></td>
                        <td> <label for="author">Weight At Birth:</label> </td> 
                        <td> <label for="author"><%=wb%></label> </td>
                        <td></td>
                  </tr>
                  <tr>
                        <td></td>
                        <td> <label for="author">Height At Birth:</label> </td> 
                        <td> <label for="author"><%=hb%></label> </td>
                        <td></td>
                  </tr>
                  <tr>
                        <td></td>
                        <td> <label for="author">Heartbit at Birth:</label> </td> 
                        <td> <label for="author"><%=heb%></label> </td>
                        <td></td>
                  </tr>
                  <tr>
                        <td></td>
                        <td> <label for="author">Delivery Type:</label> </td> 
                        <td> <label for="author"><%=dt%></label> </td>
                        <td></td>
                  </tr>
                  <tr>
                        <td></td>
                        <td> <label for="author">Any Abnormal Symptoms:</label> </td> 
                        <td> <label for="author"><%=sym%></label> </td>
                        <td></td>
                  </tr>
                   <tr>
                        <td></td>
                        <td> <label for="author">Consultant Doctor:</label> </td> 
                        <td> <label for="author"><%=cd%></label> </td>
                        <td></td>
                  </tr>

                  <%
                     }
                  %>
                  <tr>
                        <td></td>
                        <td> <label for="author"> Description:</label> </td> 
                        <td> <label for="author"><%=des%></label> </td>
                        <td></td>
                  </tr>
                  
    </body>
</html>
