<%-- 
    Document   : parentInfo
    Created on : 12 Feb, 2015, 2:37:16 PM
    Author     : User
--%>

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
        <jsp:include page="/adminMenu.jsp"/>
        <div class="wrapper col5">
        <div id="container">
            <div id="breadcrumb">
                <p>Parent Infomation</p>
            </div>
            <form method="get" action="" id="form32" name="formParentD" >
                <div align="center">
                <table cellpadding="0" cellspacing="5px"  style="text-align:left" >
                    <tr>
                        <td></td>
                        <td><label>Patient Id:</label></td>
                        <td> <input type="text" id="txtPatientId" name="txtPatientId" style="width:100% ;height: 25px" autofocus required ></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td> <label for="author">First Name:</label> </td>
                        <td> <input type="text" id="txtFirstName" name="txtFirstName" style="width:100% ;height: 25px" autofocus required ></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><label for="author">Last Name:</label></td>
                        <td><input type="text" id="txtLastName" name="txtLastName" style="width:100% ;height: 25px" required></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><label for="author">Age:</label></td>
                        <td><input type="numeric" id="txtAge" name="txtAge" style="width:100% ;height: 25px" required></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><label for="author">Relationship with child :</label></td>
                        <td><input type="text" id="txtRWChild" name="txtRWChild" style="width:100% ;height: 25px" required></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><label>Blood Group: </label> </td>
                        <td><input type="text" id="txtBloodGroup" name="txtBloodGroup"  style="width:100% ;height: 25px" required></input></td>           
                        <td></td>
                   </tr>
                    <tr>
                        <td></td>
                        <td><label>Contact Infomation: </label> </td>
                        <td><input type="text" id="txtContactInfo" name="txtContactInfo"  style="width:100% ;height: 25px" required></input></td>
                        <td></td>
                   </tr>
                   <tr>
                       <td></td>
                        <td><label>Contact No: </label> </td>
                        <td><input type="numeric" id="txtContactNo" name="txtContactNo"  style="width:100% ;height: 25px" required></input></td>
                        <td></td>
                   </tr>
                   <tr>
                        <td><span class="Validation">*</span></td>
                        <td><label for="email">Email:</label> </td>
                        <td><input type="email" name="txtEmailId" id="txtEmailId" style="width:100% ;height: 25px" required></td>
                        <td></td>
                   </tr>
                   <tr>
                       <td></td>
                        <td><label>Occupation: </label> </td>
                        <td><input type="text" id="txtOccupation" name="txtOccupation"  style="width:100% ;height: 25px" required></input></td>
                        <td></td>
                   </tr>
                   <tr>
                        <td></td>
                        <td></td>
                        <td colspan="2">
                            <table>
                                <tr>
                                    <td><input style="font-weight: bold;" type="submit" class="submitbtn"  id="submit" value="Submit" /></td>
                                    <td><input type="button" name="reset" id="reset" value="Reset" class="submitbtn" /></td>
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

<jsp:include page="/FooterPage.jsp"/>
</html>
