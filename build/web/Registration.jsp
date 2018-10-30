<%-- 
    Document   : Registration
    Created on : 13 Oct, 2014, 5:14:25 PM
    Author     : Jarodiya Kinjal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:include page="/HeaderPage.jsp"/>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title></title>
    <link rel="stylesheet" href="css/layout.css" type="text/css" />
    <script language="javascript" type="text/javascript"> 
  <!--  function checkCptcha()
            {
                xmlHttp=GetXmlHttpObject();
                if(xmlHttp==null)
                    {
                        alert ("Browser does not support HTTP Request")
                        return
                    }
                    var captcha = document.getElementById("captchaCode").value;
                    //alert(captcha);
                    var url="checkCaptcha.jsp?Captcha="+captcha;
                    //alert(url);
                    xmlHttp.open("GET",url,true);
                    xmlHttp.onreadystatechange=UpdateCaptcha;  // function call to update page using retrieved data
                    xmlHttp.send(null);
            }
            function UpdateCaptcha()
            {
                if(xmlHttp.readyState==4 || xmlHttp.readyState=="complete")
                {
                    //alert("in ready state 4 page");
                    if(xmlHttp.status==200)
                    {
                            var newStatus=xmlHttp.responseText;
                            //alert(newStatus);
                            document.getElementById("txtCaptcha").innerHTML=newStatus;
                            if((newStatus.trim()).length>0)
                                {
                                    document.getElementById("captchaCode").value="";
                                    document.getElementById("captchaCode").focus();
                                    //alert("Length= "+newStatus.length);
                                }
                    }
                    else
                    {
                            alert("Error! request status is "+xmlHttp.status);
                    }
                }    
            }
    -->
    </script>

 
</head>
<body onload="return loadType();">
<jsp:include page="/adminMenu.jsp"/>
    
    <div class="wrapper col5">
        <div id="container">
            <div id="breadcrumb">
                <p>Registration</p>
            </div>
            <form method="get" action="regServlet" id="form1" name="formRe" onsubmit="return validate();">
                <div align="center">
                <table cellpadding="0" cellspacing="5px"  style="text-align:left" >
                    <tr>
                        <td></td>
                        <td colspan="3">
                        <label style="color:#999999"> You should set username and password with maximum 7 character.</label>
                        </td>
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
                        <td><span class="Validation">*</span></td>
                        <td><label for="email">Email:</label> </td>
                        <td><input type="email" name="txtEmailId" id="txtEmailId" style="width:100% ;height: 25px" required></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td><span class="Validation">*</span></td>
                        <td>Type:</td>
                        <td><select id="type1" name="tp" style="width:100% ;height: 25px" required>
                                <option value="admin">Admin</option>
                                <option value="HealthcareProvider">Healthcare Provider</option>
                                <option value="Moderator">Moderator</option>
                                <option value="Patient">Patient</option>
                            </select></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td><span class="Validation">*</span></td>
                        <td><label for="url">Desired UserName:</label> </td>
                        <td><input  id="un" type="text" name="uname" autocomplete="off" maxlength="7" style="width:100% ;height: 25px" required ></td>
                        <td><label name="txtUname" id="txtUname" style="color:red"></label></td>
                    </tr>
                    <tr>
                        <td><span class="Validation">*</span></td>
                        <td><label for="url">Set Password:</label> </td>
                        <td><input id="ps" type="password" name="pass" maxlength="7" style="width:100% ;height: 25px" required></td>
                        <td><label name="txtPass" id="txtPass" style="color:red"></label></td>                      
                    </tr>
                    <tr>
                        <td><span class="Validation">*</span></td>
                        <td><label for="url"> Re-enter Password:</label> </td>
                        <td><input id="rps" type="password" name="rpass" maxlength="7"  style="width:100% ;height: 25px"  required ></td>
                        <td><label name="txtRpass" id="txtRpass" style="color:red"></label> </td>
                    </tr>
                    <tr>
                        <td><span class="Validation">*</span></td>
                        <td><label for="city">City:</label> </td>
                        <td><input type="text" name="txtCity" id="txtCity" style="width:100% ;height: 25px" required></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td></td>
                        <td><img src="displayCaptcha" border="0" width="100%"></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td><span class="Validation">*</span></td>
                        <td><label>Enter the verification code:</label></td>
                        <td><input type="text" name="captchaCode" id="captchaCode"  placeholder="Type above coad here." style="width:100% ;height: 25px" onblur="checkCptcha();" required/></td>
                        <td><label name="txtCaptcha" id="txtCaptcha" style="color:red"></label> </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td></td>
                        <td colspan="2">
                            <table>
                                <tr>
                                    <td><input style="font-weight: bold;" type="submit" class="submitbtn"  id="submit" value="Register" /></td>
                                    <td><input type="button" name="reset" id="reset" value="Reset" class="submitbtn" onclick="reForm();"/></td>
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