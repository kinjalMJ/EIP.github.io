<%-- 
    Document   : newRegistration
    Created on : 9 Feb, 2015, 2:19:57 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:include page="/HeaderPage.jsp"/>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title></title>
    <link rel="stylesheet" href="css/layout.css" type="text/css" />
        <script language="javascript">
          
        function f1()
        {
            
            window.open("AdminRegistration.jsp","_self");
        }
        function f2()
        {
            
            window.open("ModeratorRegistration.jsp","_self");
        }
        function f3()
        {
            
            window.open("AhealthcareProviderRegistration.jsp","_self");
        }
        function f4()
        {
            
            window.open("ApatientRegistration.jsp","_self");
        }
    </script>
    </head>
    
        <body onload="return loadType();">
<jsp:include page="/adminMenu.jsp"/>
    
    <div class="wrapper col5">
        <div id="container">
            <div id="breadcrumb">
                <p>Registration</p>
            </div>
                 
                 <div align="center">
                 <table cellpadding="0" cellspacing="5px"  style="text-align:left" height="200" width="800" border="0">
                    <tr>
                   <td>   <input type="submit" name="submit" id="submit" class="submitbtn" value="Admin Registration"  onclick="f1();"/>
                    <td>   <input type="submit" name="submit" id="submit" class="submitbtn" value="Moderator Registration""  onclick="f2();"/>
                  
                    </tr>
                    <tr>
                    <td>   <input type="submit" name="submit" id="submit" class="submitbtn" value="Healthcare Provider Registration"  onclick="f3();"/>
                    
                  <!-- <td> <input  type="button" value="Patient Registration" onclick="f4();" /></td>
                   <td><input  type="button" value="Healthcare Provider Registration"onclick="f3();" /></td>
                 <td><input type="button" value="Admin Registration" onclick="f1();"/></td>                   
                   <td><input  type="button"   value="Moderator Registration" onclick="f2();" /></td>
                    
                  --> 
                  <td>   <input type="submit" name="submit" id="submit" class="submitbtn" value="Patient Registration"  onclick="f4();"/>
                   </td>                    
                    </tr>
                    </table>
                  </div>
             </div>
        </div>
      </body>
      <jsp:include page="/FooterPage.jsp"/>
</html>
