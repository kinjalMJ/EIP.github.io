<%-- 
    Document   : AhealthcareProviderRegistration
    Created on : 12 Feb, 2015, 2:03:15 PM
    Author     : User
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:include page="/HeaderPage.jsp"/>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
        <link rel="stylesheet" href="css/layout.css" type="text/css" />
              <%
    if(request.getParameter("page")!=null)
        out.println(request.getParameter("page"));
  %>
    <% 
         ArrayList a1=new ArrayList();
         String fn="",ln="",gen="",bd="",bg="",ed="",ex="",mn="",eid="",cty="",des="";
          String valM="";
          String valF="";
          String operation="";
          String uid="";
         if(request.getAttribute("data")!=null)
        {
             operation="edit";
             
             if(request.getParameter("uid")!=null)
                 uid=request.getParameter("uid");
             
           a1= (ArrayList)request.getAttribute("data");
           fn= a1.get(0).toString();
           ln= a1.get(1).toString();
           gen= a1.get(2).toString();
           if(gen.equalsIgnoreCase("male"))
           valM="checked";
           if(gen.equalsIgnoreCase("female"))
           valF="checked";
       
           bd= a1.get(3).toString();
           bg= a1.get(4).toString();
           ed= a1.get(5).toString();
           ex= a1.get(6).toString();
           mn= a1.get(7).toString();
           eid= a1.get(8).toString();
           cty= a1.get(9).toString();
           des= a1.get(10).toString();
          // editadmin
        }
    %>
    <script>
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
    function getUserName()
    {
         xmlHttp=GetXmlHttpObject();  
                if (xmlHttp==null)
                {
                alert ("Browser does not support HTTP Request")
                    return;
                }
                alert("in funmmmm");
                var un=document.getElementById("un").value;
                alert(un);
                var url="userNameADB.jsp?un="+escape(un);
                xmlHttp.open("GET",url,true);  
                xmlHttp.onreadystatechange=displayUserName;  
                xmlHttp.send(null);
        
    }
     function displayUserName()
    {
                if(xmlHttp.readyState==4 || xmlHttp.readyState=="complete")
                {
                if(xmlHttp.status==200)
                {       alert("in displayUserName");
                       var newStatus=xmlHttp.responseText;
                   if(newStatus.trim().length>0)
                     {
                      document.getElementById("txtUname").innerHTML=newStatus;
                      document.getElementById("un").value="";
                       document.getElementById("un").focus();
                     }
                     else
                         document.getElementById("txtUname").innerHTML="";  
                }
                else
                {
                    alert(xmlHttp.status);
                }
                }
   
    }
    function checkCptcha()
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
    function checkPass()
{
 alert("in fun");
    var error="";
    var pass=document.getElementById("ps").value;
     var rpass=document.getElementById("rps").value;
     if(pass==rpass)
         {  
           alert("password is matched "+pass1);
                //document.getElementById("error").innerHTML="";
                            
         }
     else
     {
           alert("password not match");
           document.getElementById("txtRpass").innerHTML="please enter Re-Password as Password";
           document.getElementById("rps").value="";
           document.getElementById("rps").focus();
      
   }                          
}

    </script>

    </head>
    <body>
        <jsp:include page="/adminMenu.jsp"/>
        <div class="wrapper col5">
        <div id="container">
            <div id="breadcrumb">
                <p>Registration</p>
            </div>
            <form method="get" action="healthcareProviderServelet" id="form7" name="formHPD" >
                <div align="center">
                    <input type="hidden" name ="example" value="<%=operation%>"></input>
                    <input type="hidden" name ="uid" value="<%=uid%>">
                    </input>
                <table cellpadding="0" cellspacing="5px"  style="text-align:left" >
                     <tr>
                        <td><span class="Validation">*</span></td>
                        <td> <label for="author">First Name:</label> </td>
                        <td> <input type="text" id="txtFirstName" name="txtFirstName" value="<%=fn%>" style="width:100% ;height: 25px" autofocus required ></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td><span class="Validation">*</span></td>
                        <td><label for="author">Last Name:</label></td>
                        <td><input type="text" id="txtLastName" name="txtLastName" value="<%=ln%>" style="width:100% ;height: 25px" required></td>
                        <td></td>
                    </tr>
                    <tr>
                            <td></td>
                            <td><label>Gender:</label> </td>
                            <td colspan="2">
                                <table>
                                    <tr><td><input type="radio" name="txtgender"  value="male" <%=valM%> required> Male</td>
                                        <td><input type="radio" name="txtgender"  value="Female" <%=valF%> required> Female</td>                               
                                    </tr>
                                </table>
                            </td>
                    </tr>
                    <tr>
                        <td><span class="Validation">*</span></td>
                        <td><label>Birth Date: </label> </td>
                        <td><input type="Date" id="txtBirthDate" name="txtBirthDate" value="<%=bd%>"   style="width:100% ;height: 25px" required></input></td>           
                        <td></td>
                   </tr> 
                   <tr>
                        <td></td>
                        <td><label>Blood Group: </label> </td>
                        <td><input type="text" id="txtBloodGroup" name="txtBloodGroup" value="<%=bg%>" style="width:100% ;height: 25px" required></input></td>           
                        <td></td>
                   </tr>
                   <tr>
                        <td><span class="Validation">*</span></td>
                        <td><label>Education: </label> </td>
                        <td><input type="text" id="txtEducation" name="txtEducation" value="<%=ed%>" style="width:100% ;height: 25px" required></input></td>           
                        <td></td>
                   </tr>
                    <tr>
                        <td></td>
                        <td><label>Experience: </label> </td>
                        <td><input type="text" id="txtExperience" name="txtExperience" value="<%=ex%>" style="width:100% height: 25px"required ></input></td>           
                        <td></td>
                   </tr>
    
                   <tr>
                        <td><span class="Validation">*</span></td>
                        <td><label>MobileNo: </label> </td>
                        <td><input type="numeric" id="txtMobileNo" name="txtMobileNo" value="<%=mn%>"   style="width:100% ;height: 25px" required></input></td>           
                        <td></td>
                   </tr>
                   
                   <tr>
                        <td></td>
                        <td><label>City: </label> </td>
                        <td><input type="text" id="txtCity" name="txtCity" value="<%=cty%>"  style="width:100% ;height: 25px" required ></input></td>           
                        <td></td>
                   </tr>                 
                   <tr>
                        <td><span class="Validation">*</span></td>
                        <td><label for="email">Email:</label> </td>
                        <td><input type="email" name="txtEmailId" id="txtEmailId" value="<%=eid%>" style="width:100% ;height: 25px" required></td>
                        <td></td>
                   </tr>
                   <tr>
                        <td></td>
                        <td><label>Description: </label> </td>
                        <td><input type="text" id="txtDescription" name="txtDescription" value="<%=des%>" style="width:100% ;height: 25px" ></input></td>           
                        <td></td>
                   </tr>
                   <% 
                 if(request.getAttribute("data")==null)
                 {  
                  %>
                    <tr>
                        <td><span class="Validation">*</span></td>
                        <td><label for="url">Desired UserName:</label> </td>
                        <td><input  id="un" type="text" name="uname" autocomplete="off" onblur="getUserName();" maxlength="7" style="width:100% ;height: 25px" required ></td>
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
                        <td><input id="rps" type="password" name="rpass" maxlength="7"  style="width:100% ;height: 25px" onblur="checkPass()" required ></td>
                        <td><label name="txtRpass" id="txtRpass" style="color:red"></label> </td>
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
                    <% 
                    } 
                    %>   
                   <tr>
                        <td></td>
                        <td></td>
                        <td colspan="2">
                            <table>
                                <tr>
                                    <td><input style="font-weight: bold;" type="submit" class="submitbtn"  id="submit" value="Submit" /></td>
                                    <td><input type="button" name="reset" id="reset" value="Reset" class="submitbtn" /></td>
                                     <%                              
                                     if(request.getAttribute("data")!=null)
                                     {
                                     %>
                                     <td><a href="doctorList"><input type="button" name="Back" id="Back" value="Back" class="submitbtn" /></a></td>
   
                                    <%   
                                    }                               
                                    if(request.getAttribute("data")==null)
                                    {
                                    %>
              
                                    <td> <a href="newRegistration.jsp"><input type="button" name="Back" id="Back" value="Back" class="submitbtn" /></a></td>
                                    <% 
                                    } 
                                    %>
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

