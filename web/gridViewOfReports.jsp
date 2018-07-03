<%-- 
    Document   : gridViewOfReports
    Created on : 13 Mar, 2015, 2:56:51 PM
    Author     : Kinjal Jarodiya
--%>

<%@page import="org.apache.el.lang.FunctionMapperImpl.Function"%>
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
        //out.println(a1);
     %>
        <jsp:include page="/adminMenu.jsp"/>
        <div class="wrapper col5">
        <div id="container">
            <div id="breadcrumb">
               <p>Vaccine List</p>
            </div>
            <div class="body1">
            <div class="form1">
            <fieldset class="fieldset">
                <legend><font size="5" color="red" style="font: bold">Vaccines</font></legend>
            <div class="grid" style="margin-top: 30px;">
            <div>
            <table align="center" width="100%" id="tableid" border="1" >
           <thead style="background-color: silver">
                        <th>Field Id</th>
                        <th>File Name</th>
                        <th>Patient Id</th>
                        <th>Path</th>
                        
                  </thead>
                  <tbody>
                  <%
                        String uname=null;
                        String uid=null;
                          for(int i=0;i<a2.size();i++)
                        {
                           String Rdetails[]=a2.get(i).toString().split(":");
                      
                           
                        %>
                        <tr> 
                         <%
                           for(int j=0;j<Rdetails.length;j++)
                             {
                                    if(j==0)
                                    {uid=Rdetails[0];}
                                                                       if(j==1)
                                        {
                                        %>
                                        <td> <a href="">
                                    <%=Rdetails[1]%>
                                    </a></td>
                                    <%
                                    }else{
                                    %>
                                                    <td>
                                                         <%=Rdetails[j]%>
                                                 </td>
                             <%
                                                       }  
                           }
                             %>
                       </tr>
                            
                        <%
                          }
                        %>
                  </tbody>
                        </table>
                    </div>
                </div>
            </fieldset>
        </div>
    </div>
        </div></div>
    </body>
   <jsp:include page="/FooterPage.jsp"/>
</html>
