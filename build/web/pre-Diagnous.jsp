<%-- 
    Document   : pre-Diagnous
    Created on : 5 Mar, 2015, 6:04:04 PM
    Author     : User
--%>

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
    String patientName="";
    if(request.getParameter("patientName")!=null)
            patientName=request.getParameter("patientName");
     String doseId="";
    if(request.getParameter("txtdoseid")!=null)
            doseId=request.getParameter("txtdoseid");
      String vId="";
    if(request.getParameter("txtvaccineid")!=null)
            vId=request.getParameter("txtvaccineid");
      String patientId=""; 
    if(request.getParameter("txtpid")!=null)
            patientId=request.getParameter("txtpid");
   //  out.println("@@@@@@@@@@@"+pid);
  
    %>
    <body>
        <jsp:include page="/adminMenu.jsp"/>
        <div class="wrapper col5">
        <div id="container">
            <div id="breadcrumb">
                <p>Pre-Diagnose</p>
            </div>
            <div align="Center">
                <form method="get" action="preDiagnous" id="form66" name="formPD">
                <table cellpadding="0" cellspacing="5px"  style="text-align:left" >
                    <tr><td>
                        <input type="hidden" name="txtvaccineid" value="<%=vId%>">
                        </td>
                        <td><input type="hidden" name="txtdoseid" value="<%=doseId%>">
                        </td>
                         <td><input type="hidden" name="txtpid" value="<%=patientId%>">
                        </td>
                        
                        
                    </tr>
                    <tr>
                        <td></td>
                        <td> <label for="author">Patient Name:</label> </td>
                        <td><%=patientName%></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><label>Date: </label> </td>
                        <td><input type="Date" id="txtDate" name="txtDate" style="width:100% ;height: 25px" required></input></td>           
                        <td></td>
                   </tr> 
                    <tr>
                        <td></td>
                        <td><label>Weight: </label> </td>
                        <td><input type="text" id="txtWeight" name="txtWeight"  style="width:100% ;height: 25px" required></input></td>           
                        <td></td>
                   </tr>
                    <tr>
                        <td></td>
                        <td><label>Height: </label> </td>
                        <td><input type="text" id="txtHeight" name="txtHeight"  style="width:100% ;height: 25px" required></input></td>           
                        <td></td>
                   </tr>
                   
                   <tr>
                        <td></td>
                        <td><label>HeartBit: </label> </td>
                        <td><input type="text" id="txtHeartBit" name="txtHeartBit" style="width:100% ;height: 25px" required></input></td>           
                        <td></td>
                   </tr> 
                   <tr>
                        <td></td>
                        <td><label>Description: </label> </td>
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
                </div>
            </form>
        </div>
    </div> 
  </body>
  <jsp:include page="/FooterPage.jsp"/>
</html>

