<%-- 
    Document   : adminReport
    Created on : 3 Apr, 2015, 1:52:39 PM
    Author     : Kinjal Jarodiya
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
  
    <body>
        <jsp:include page="/adminMenu.jsp"/>
        <div class="wrapper col5">
        <div id="container">
            <div id="breadcrumb">
                <p>Admin Reports</p>
            </div>
            <div align="Center">
                <form method="get" action="" id="form66" name="formAR">
                <table border="2" cellpadding="0" cellspacing="5px" height="400" width="400"  style="text-align:left" >
                    <thead>
                    <th>Sr. No</th>
                <th>Reports</th>   
                </thead>
                <tbody>  
                    <tr><td>1</td>
                        <td><a href="adminReportCall.jsp" target="blank">Admin List</a></td></tr>
                    <tr><td>2</td>
                        <td><a href="patientNameCall.jsp" target="blank">Patient List</a></td></tr>
                    <tr><td>3</td>
                        <td><a href="DeletedPatientCall.jsp" target="blank">Deleted Patient List</a></td></tr>
                    <tr><td>4</td>
                        <td><a href="AllVaccineCall.jsp" target="blank">Vaccine List</a></td></tr>
                    <tr><td>5</td>
                        <td><a href="getName.jsp" target="blank">Search Patient Detail By Name</a></td></tr>
                    <tr><td>6</td>
                        <td><a href="getHcare.jsp" target="blank">Search Doctor Detail By UserName</a> </td>
                    </tr>
                    <tr><td>6</td>
                        <td><a href="deleteVaccineCall.jsp" target="blank">Deleted Vaccine List</a></td></tr>
                    <tr><td>7</td>
                        <td><a href="AllDrugCall.jsp" target="blank">Drug List</a></td></tr>
                    <tr><td>8</td>
                        <td><a href="deletedrugCall.jsp" target="blank">Deleted Drug List</a></td></tr>
                </tbody>
                </table>
            </div>
            </form>
        </div>
    </div> 
  </body>
  <jsp:include page="/FooterPage.jsp"/>
</html>

