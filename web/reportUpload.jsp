<%-- 
    Document   : VaccineDetails
    Created on : 15 Oct, 2014, 5:45:57 PM
    Author     : Jarodiya Kinjal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:include page="/HeaderPage.jsp" />
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Vaccine Form</title>
        <link rel="stylesheet" href="css/layout.css" type="text/css" />
        <script language="javascript" type="text/javascript" src="js/FunctionJS.js"></script>
    </head>
    <body>
    <jsp:include page="/adminMenu.jsp"/>
    <div class="wrapper col5">
    <div id="container"> 
        <div id="breadcrumb">
                <p>ReportUpload</p>
        </div>
    <form method="get" action="reportUpload" id="form1" name="formRe" >
    <div align="center">
    <table cellpadding="0" cellspacing="7px"  style="text-align:left"> 
    <tr>
    <label  style="color:red" id="error"></label>
    </tr>
    <tr>
          <td>
              <span class="Validation">*</span></td> 
              <td><label for="author">User Id:</label> </td>
              <td><input type="text" id="txtuserId" name="txtuserId"  style="width: 180px" placeholder="Enter User Id." required onblur=" return duplicatevaccine();"></td>
              <td><label id="error" style="color:red"></label></td>
    </tr>
    <tr>
         <td>
             <span class="Validation">*</span></td> 
         <td><label for="author">User Name:</label> </td>
         <td><input type="text" id="txtvaccineName" name="txtvaccineName"  style="width: 180px" placeholder="Enter Vaccine Name." required onblur=" return duplicatevaccine();"></td>
         <td><label id="error" style="color:red"></label></td>
    </tr>
    <tr>
        <td>
            <span class="Validation">*</span></td>
        <td><label for="url">Description:</label> </td>
        <td><textarea id="txtDecId" name="txtdec"></textarea></td>
    </tr>
    <tr>`
        <td><span class="Validation">*</span></td>
        <td><label for="url">For Whom(gender):</label> </td>
        <td colspan="3">
    <table>
        <tr><td><input type="radio" name="gender"  value="male"> Male</td>
            <td><input type="radio" name="gender"  value="female"> Female</td>
            <td><input type="radio" name="gender"  value="both"> Both</td>
        </tr>
    </table>
        </td>
    </tr>
    <tr>
        <td><span class="Validation">*</span></td>
        <td><label for="url">Vaccine Type:</label> </td>
        <td colspan="2">
            <table>
                <tr><td><input type="radio" name="vaccineType"  value="Injection"> Injection</td>
                    <td><input type="radio" name="vaccineType"  value="Drop"> Drop</td>
                </tr>
            </table>
        </td>
    </tr>
    <tr>
        <td><span class="Validation">*</span></td>
        <td><label for="url">Select Vaccine category:</label> </td>
        <td colspan="2">
            <table>
                <tr><td><input type="radio" name="rs" value="Routine" > Routine</td>
                    <td><input type="radio" name="rs" value="Special" > Special</td>
                </tr>
            </table>
        </td>
    </tr>
    <tr>
        <td><span class="Validation">*</span></td>
        <td><label for="url">No Of Dose:</label> </td>
        <td><input type="number" name="noofDose"  id="noOfDose"  style="width: 180px" onblur="doseTable();" placeholder="Enter no of Dose." min="1" required></td>
    </tr>
    <tr>
        <td colspan="3"><table id="tableid" border ="1"></table></td>
    </tr>
    <tr>
    <td></td>
    <td></td>
    <td>
    <table>
        <tr>
            <td><input style="font-weight: bold;" type="submit" class="submitbtn"  id="submit" value="Save" /></td>
        </tr>
    </table>
    </td>
    </tr>
    </table> 
    </div>
    </form>
    </div>
    </div> 
    </body>
    </html>
    <jsp:include page="/FooterPage.jsp"/>
