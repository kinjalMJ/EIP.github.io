<%-- 
    Document   : changePassword
    Created on : 11 Jan, 2015, 12:27:16 PM
    Author     : india
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page="/HeaderPage.jsp"/>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
        <link rel="stylesheet" href="css/layout.css" type="text/css" />
    </head>
    <body>
         <script lang="javascript">
       function GetXmlHttpObject()   
      {
       var xmlHttp=null;
                try
                {
                // Firefox, Opera 8.0+, Safari, Chrome
                xmlHttp=new XMLHttpRequest();
                }
                catch (e)
                {
                //Internet Explorer
                try
                {
                xmlHttp=new ActiveXObject("Msxml2.XMLHTTP");
                }
                catch (e)
                {
                xmlHttp=new ActiveXObject("Microsoft.XMLHTTP");
                }
                }
                return xmlHttp;
      }
       function getOPass()
            {
                

         xmlHttp=GetXmlHttpObject();  
                if (xmlHttp==null)
                {
             //   alert ("Browser does not support HTTP Request")
                    return;
                }
              //  alert("in funmmmm");
             var op=document.getElementById("Enteroldpassword").value;
             
             alert(op);
                var url="oldPassCheckDB.jsp?op="+escape(op);
                xmlHttp.open("GET",url,true);  
                xmlHttp.onreadystatechange=displayOPass;  
                xmlHttp.send(null);
        
    }
       function displayOPass()
    {
                if(xmlHttp.readyState==4 || xmlHttp.readyState=="complete")
                {
                if(xmlHttp.status==200)
                {       alert("in displayOPass");
                       var newStatus=xmlHttp.responseText;
                   if(newStatus.trim().length>0)
                     {
                      document.getElementById("txtOpass").innerHTML=newStatus;
                      document.getElementById("Enteroldpassword").value="";
                       document.getElementById("Enteroldpassword").focus();
                     }
                     else
                         document.getElementById("txtOpass").innerHTML="";  
                }
                else
                {
                    alert(xmlHttp.status);
                }
                }
   
    }
       
           function myFunction()
            {
            alert("in my fun");
            var pass1=document.formchangepass.Enternewpassword.value;
             var pass2=document.formchangepass.ReEnternewpassword.value;
             
             alert("pass1: "+pass1);
             alert("pass2: "+pass2);
             
             if(pass1==pass2)
                   {
                         //alert(document.getElementById("Enternewpassword").value);
                            alert("password is matched "+pass1);
                            document.getElementById("error").innerHTML="";
                            
                   }
                   else
                       {
                         // alert("password not match");
                          document.getElementById("error").innerHTML="password and confirm password does not matched";
                                      
                       }
                            
            }
          function check()
            {
              var op=document.getElementById("Enteroldpassword").value();
             alert(op);
             alert("len"+op.length());
             if(op.length()>0)
                    return true;
                else
                    {
                        document.getElementById("error").innerHTML="Old password should not be blanked.";
                    
                    return false;
                    }
                return false;
            }
            
            function createText()
            {
                var element = document.createElement("input");
                element.setAttribute("type", "text");
                element.setAttribute("value", "hello");
                var foo=document.getElementById("foo");
                foo.appendChild(element);
            }
        </script>
        
        <jsp:include page="/adminMenu.jsp"/>
        <div class="wrapper col5">
        <div id="container">
            <div id="breadcrumb">
                <p>Password Change</p>
            </div>
            <form method="get" action="changePassword" id="form42" name="formchangepass" onsubmit="return check();" >
                <div align="center">
                <table cellpadding="0" cellspacing="5px"  style="text-align:left" >
                    <tr>
                        <td></td>
                        <td> <label for="author">Old Password: </label> </td>
                        <td> <input type="password" id="Enteroldpassword" name="Enteroldpassword" style="width:100% ;height: 25px" onblur="getOPass()" autofocus required ></td>
                         <td><label name="txtOpass" id="txtOpass" style="color:red"></label></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><label>New Password: </label> </td>
                        <td><input type="password" id="Enternewpassword" name="Enternewpassword" style=" width:100% ;height: 25px" required></input></td>           
                        <td></td>
                   </tr>
                   <tr>
                        <td></td>
                        <td><label>Re-Enter New Password: </label> </td>
                        <td><input type="password" id="ReEnternewpassword" name="Re-Enternewpassword"  onblur="myFunction();"  style="width:100% ;height: 25px" required></input></td>           
                        <td></td>
                   </tr>
                   <tr>
                       <td></td>
                       <td><label id="error"></label></td>
                       <% 
                              String no="";
                              if(request.getParameter("p4")!=null)
                              no=request.getParameter("p4");
                       %>

                   </tr>
                   <tr>
                        <td></td>
                        <td></td>
                        <td colspan="2">
                            <table>
                                <tr>
                                    <td><input style="font-weight: bold;" type="submit" class="submitbtn"  id="submit" value="Submit" /></td>
                                    <td></td>
                                </tr>
                            </table>
                        </td>
                    </tr>
                </table> 
                </div>
                              <div id="foo"></div>
            </form>
        </div>
    </div> 
    </body>
  <jsp:include page="/FooterPage.jsp"/>
</html>
