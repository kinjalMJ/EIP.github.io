<%-- 
    Pending_Task
    Document   : pendingTask
    Created on : 9 Mar, 2015, 2:33:36 PM
    Author     : Kinjal Jarodiya
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:include page="/HeaderPage.jsp"/>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/layout.css" type="text/css" />
   </head>
   <%
   ArrayList pT=new ArrayList();
//ArrayList pN=new ArrayList();
if(request.getAttribute("task")!=null)
{
    pT=(ArrayList)request.getAttribute("task");
}

   %>
   <body>
        <jsp:include page="/adminMenu.jsp"/>
        <div class="wrapper col5">
        <div id="container">
            <div id="breadcrumb">
                <p>Your Task</p>
            </div>
            <div align="Center">
                <form method="get" action="pendingTask" id="form68" name="formPT">
                <table cellpadding="0" cellspacing="5px"  style="text-align:left" >
                    
                    <tr>
                        <td></td>
                        <td><label> Task Name: </label> </td>
                        <td><input type="text" id="txtTaskName" name="txtTaskName"  style="width:100% ;height: 25px" required></input></td>           
                        <td></td>
                   </tr>
                    <tr> 
                        <td></td>
                        <td><label> Task Date: </label> </td>
                        <td><input type="date" id="txtTaskDate" name="txtTaskDate"  style="width:100% ;height: 25px" required></input></td>           
                        <td></td>
                   </tr>
                   <tr>
                        <td></td>
                        <td><label> Description: </label> </td>
                        <td><input type="text" id="txtDescription" name="txtDescription" style="width:100% ;height: 25px" required></input></td>           
                        <td></td>
                   </tr>
                   <tr>
                        <td></td>
                        <td></td>
                        <td colspan="4">
                            <table>
                                <tr>
                                    <td><input style="font-weight: bold;" type="submit" class="submitbtn"  id="submit" value="Submit" /></td>
                                </tr>
                            </table>
                        </td>
                        <td></td>
                    </tr>
                </table> 
               <table align="center" width="100%" id="tableid" border="1" >
               <thead style="background-color: silver">
                        <th>Task Id</th>
                        <th>Task Name</th>
                        <th>Date</th>
                        <th>Description</th>     
                  </thead>
           
                    <%
                                                                    Iterator ivp = pT.iterator();
                                                                    while (ivp.hasNext()) {
                                                                        String task = ivp.next().toString();
                                                                        String taskData[]=task.split(":");
                                                                        %>
                                                                        <tr>
                                                                        <%
                                                                        for(int i=0;i<taskData.length;i++)
                                                                                                                                                       {%>
                                                                                                                                                       <td><%=taskData[i]%></td>
                                                                        <%}
                                                    %> 
                                                                
                                                           
                                                                </tr>
                                                                  <%  }
                                                            %>
                </table>
                                                            </div>
            </form>
        </div>
    </div> 
  </body>
  <jsp:include page="/FooterPage.jsp"/>
</html>