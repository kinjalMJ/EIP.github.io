<%-- 
    Document   : adminListView
    Created on : 11 Feb, 2015, 6:09:10 PM
    Author     : User
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
        ArrayList a1=new ArrayList();

        if(request.getAttribute("data")!=null)   
            a1=(ArrayList) request.getAttribute("data");
        //out.println(a1);
     %>
        <jsp:include page="/adminMenu.jsp"/>
        <div class="wrapper col5">
        <div id="container">
            <div id="breadcrumb">
               <p>Vaccine Dose List</p>
            </div>
            <div class="body1">
            <div class="form1">
            <fieldset class="fieldset">
            <legend><font size="5" color="Red" bold> Dose Description</font></legend>
            <div class="grid" style="margin-top: 30px;">
            <div>
            <table align="center" width="100%" id="tableid" border="1" >
           <thead style="background-color: silver">
                        <th>Vaccine Dose Id</th>
                        <th>Vaccine Id</th>
                        <th>Age Range</th>
                        <th>Optional/Mandatory</th>
                        <th>Description</th>
                        <th>Edit</th>
                        <th>Delete</th>
                  </thead>
                  <tbody>
                  <%
                        String VDid="";
                        for(int i=0;i<a1.size();i++)
                        {
                           String Vdetails[]=a1.get(i).toString().split(":");
                        %>
                            <tr>
    <%
                                for(int j=0;j<Vdetails.length;j++)
                                                                       {
                                    if(j==0)
                                        VDid=Vdetails[0];
    %>
                                <td>
                                    <%=Vdetails[j]%>
                                </td>
                                <%
                                                               }
                                %>
                                <td><a href="editVaccineDose?VDid=<%=VDid%>" ><img src="Tick.png"></a></td>
                                <td><a href="deleteVaccineDose?VDid=<%=VDid%>" onclick="f2();"><img src="Cross.png"></a></td>
                            </tr>
                            
                        <%}
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
            
           
