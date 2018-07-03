

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>For New Password Page</title>
    </head>
    <%
 
       String uname="abc";//request.getParameter("Username").trim();
       String type="admin";//request.getParameter("Type").trim();
 %>
 
    <body>
        <form action="UpdateNewPassword" id="form1" name="formRe" method="get" >
            <h3>Reset your password</h3>
            <h2>Enter a new password for pooja.magichorse@gmail.com. We highly recommend you create a unique password - one that you don't use for any other websites.</h2>
            <h2>Note: You can't reuse your old password once you change it.</h2>
            <table cellpadding="10px" cellspacing="0" width="100%"   >
                <tr>
                    <td><label for="url"> New Password:</label> </td>
                    <td><input name="txtNewPass" type="password" id="ps" class="input_field" autocomplete="off" placeholder="Enter your new password." required/><span class="Validation">*</span></td>
                    <td><label name="txtPass" id="txtPass" style="color:red"></label></td>                      
                </tr>
                <tr>
                    <td><label for="url"> Confirm Password:</label> </td>
                    <td><input name="txtComPass" type="password" id="rps" class="input_field" autocomplete="off" placeholder="Re-Enter your new password." required/><span class="Validation">*</span></td>
                    <td><label name="txtRpass" id="txtRpass" style="color:red"></label> </td>
                </tr>
                <tr>
                    <td></td>
                    <td>
                        <input style="font-weight: bold;" type="submit" class="submitbtn"  id="submit" value="Save" />
                    </td>
                </tr>
            </table> 
            <input type="hidden" name="hndUname" id="hdnUname" value="<%=uname%>"/>
            <input type="hidden" name="hndType" id="hdnType" value="<%=type%>"/>
        </form>
    </body>
</html>