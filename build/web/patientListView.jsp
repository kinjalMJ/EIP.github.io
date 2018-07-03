<%-- 
    Document   : adminListView
    Created on : 11 Feb, 2015, 6:09:10 PM
    Author     : User
--%>
<%@page import="org.apache.el.lang.FunctionMapperImpl.Function"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import=" javax.servlet.http.HttpSession" %>

<!DOCTYPE html>
<jsp:include page="/HeaderPage.jsp"/>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
        <link rel="stylesheet" href="css/layout.css" type="text/css" />
        <script lang="javascript">
          function deleteConfirm()
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
               <p>Patient List</p>
            </div>
            <div align="right">
                <form method="get" action="searchServlet" id="form33" name="formS">
                <table border="1">
                    <tr>
                        <td><input type="text" name="search" ></td>
                        <td><input type="submit" name="search" id="search" value="search" class="submitbtn" /></td>
                        <td><a href="searchServlet?all=all"> View </a></td>
                    </tr>
                </table>
                </form>
            </div>
               
                <div class="body1">
        <div class="form1">
        
                    <fieldset class="fieldset">
                        <legend><font size="5" color="Red" bold> User Data</font></legend>
                <div class="grid" style="margin-top: 30px;">
                    <div>
                  <table align="center" width="100%" id="tableid" border="1" >
                      <thead style="background-color: silver">
                        <th>PatientId</th>
                        <th>Name</th>
                        <th>Gender</th>
                        <th>Blood Group</th>
                        <th>Abnormal Symptoms</th>
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
                        String uid="";
                        for(int i=0;i<a1.size();i++)
                        {
                           String udetails[]=a1.get(i).toString().split(":");
                        %>
                            <tr>
                                <%
                                for(int j=0;j<udetails.length;j++)
                                                                       {
                                    if(j==0)
                                        uid=udetails[0];
    %>
                                <td>
                                    <%=udetails[j]%>
                                </td>
                                <%
                                 }
                                           
                              if(type.equalsIgnoreCase("admin"))
                                {
                                 %>
                                <td><a href="editPatientServlet?uid=<%=uid%>"><img src="Tick.png"></a></td>
                                <td><a href="deletePatientServlet?uid=<%=uid%>" onclick=" return deleteConfirm();"><img src="Cross.png"> </a></td>
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
            
           
