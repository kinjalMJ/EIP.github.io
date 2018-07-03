<%-- 
    Document   : adminListView
    Created on : 11 Feb, 2015, 6:09:10 PM
    Author     : User
--%>
<%@page import="org.apache.el.lang.FunctionMapperImpl.Function"%>
<%@page import="java.util.ArrayList"%>
<%@page import=" javax.servlet.http.HttpSession" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:include page="/HeaderPage.jsp"/>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>

        <link rel="stylesheet" href="css/layout.css" type="text/css" />
            <script lang="javascript">

        function f2()
            {
             //   alert("in fun");
            
            var x;
            var flag=false;
            if (confirm("Are You Sure ?") == true)
            {
                x = "You Want To Delete Record!";
                alert(x);
                flag=true;
            }
            else 
            {
                x = "You Don't Want To Delete Record!!";
                  alert(x);
                  flag=false;
            }
           // document.getElementById("demo").innerHTML = x;
         //  alert(flag);
           return flag;
            }
      </script> 
  
        
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
                        <th>Vaccine Id</th>
                        <th>Vaccine Name</th>
                        <th>Description</th>
                        <th>For Whom</th>
                        <th>Vaccine Type</th>
                        <th>Routine/Special</th>
                        <th>No.Of Dose</th>
                    <%  
                    HttpSession s1=request.getSession(false);
                    String type=s1.getAttribute("Type").toString();                
                                   
                     if(type.equalsIgnoreCase("admin"))
                     {
                     %>

                        <th>Edit</th>
                        <th>Delete</th>
                     <%
                     }
                     %>   
                        
                  </thead>
                  <tbody>
                  <%
                        String vname=null;
                        String vid=null;
                          for(int i=0;i<a1.size();i++)
                        {
                           String Vdetails[]=a1.get(i).toString().split(":");
                      
                           
                        %>
                        <tr> 
                         <%
                           for(int j=0;j<Vdetails.length;j++)
                             {
                                    if(j==0)
                                    {vid=Vdetails[0];}
                                                                       if(j==1)
                                        {
                                        %>
                                        <td> <a href="gridViewOfVaccineDose?vid=<%=vid%>">
                                    <%=Vdetails[1]%>
                                    </a></td>
                                    <%
                                    }else{
                                    %>
                                                    <td>
                                                         <%=Vdetails[j]%>
                                                 </td>
                                <%
                                 }
                               }          
                              if(type.equalsIgnoreCase("admin"))
                                {
                                 %>
                       
                                <td><a href="editVaccineServlet?vid=<%=vid%>" ><img src="Tick.png"></a></td>
                                <td><a href="deleteVaccineServlet?vid=<%=vid%>" onclick="f2();"><img src="Cross.png"></a></td>
                            </tr>
                            
                           <% 
                           }
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
            
           
