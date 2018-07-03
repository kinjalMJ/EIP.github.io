<%-- 
    Document   : ApatientRegistration
    Created on : 9 Feb, 2015, 3:19:12 PM
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
         String fn="",ln="",gen="",bd="",bt="",btu="",bg="",wb="",hb="",heb="",dt="",sym="",des="",cd="";
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
           bt= a1.get(4).toString();
           
      //     btu= a1.get(5).toString();
           bg= a1.get(6).toString();
           wb= a1.get(7).toString();
           hb= a1.get(8).toString();
           heb= a1.get(9).toString();
           dt = a1.get(10).toString();
           sym = a1.get(11).toString();
          // cd= a1.get(12).toString();
       //    des=a1.get(13).toString();
        }
    %>
    
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
  function getDoctorName()
       {
         xmlHttp=GetXmlHttpObject();  
                if (xmlHttp==null)
                {
                alert ("Browser does not support HTTP Request")
                    return;
                }
                var dn=document.getElementById("txtDoctor").value;
                var url="doctorNameDB.jsp?dn1="+escape(dn);
                xmlHttp.open("GET",url,true);  
                xmlHttp.onreadystatechange=displayDoctorName;  
                xmlHttp.send(null);
        }

    function displayDoctorName()
    {
                if(xmlHttp.readyState==4 || xmlHttp.readyState=="complete")
                {
                if(xmlHttp.status==200)
                {
                       var newStatus=xmlHttp.responseText;
                       var ind1=newStatus.indexOf("[");
                       var ind2=newStatus.indexOf("]");
                       newStatus=newStatus.substring(ind1+1,ind2);
                       var data=newStatus.split(",")
                       var optn=document.getElementById("txtDoctor");
                       for(var i=0;i<data.length;i++)
                       {
                        var dn=data[i].split("$");
                        optn[i]=new Option(dn[1],dn[0]);
                       }
                       var dn=document.getElementById("txtDoctor");
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

    function validate()
            {
                var b = document.getElementById("ps").value;
                var c = document.getElementById("rps").value;
                var status=true;                              
                document.getElementById("txtRpass").innerHTML="";
                if(c!=b)
                {
                   // alert("Enter a number");
                    document.getElementById("txtRpass").innerHTML="please enter Re-Password as Password";
                    status= false;
                    document.getElementById("rps").value="";
                    document.getElementById("rps").focus();
                }
                 return status;
            }
            function checkMin()
            {
             //   alert("in function");
                var num=un.value;
                if(num.length<10)
                    {
                        document.getElementById("len1").innerHTML="";
                        document.getElementById("len1").focus();
                    }
                
                else{
                    alert("ok");
                }
            }
    </script>
    </head>
    <body onload="getDoctorName();">
        <jsp:include page="/adminMenu.jsp"/>
        <div class="wrapper col5">
        <div id="container">
            <div id="breadcrumb">
                <p>Registration</p>
            </div>
            <form method="get" action="patientservlet" id="form2" name="formPD" >
                <div align="center">
                    <input type="text" name ="example" value="<%=operation%>">
                    <input type="text" name ="uid" value="<%=uid%>">
                    </input>

                     <table cellpadding="0" cellspacing="5px"  style="text-align:left" >
                     <tr>
                        <td><span class="Validation">*</span></td>
                        <td> <label for="author">First Name:</label> </td>
                        <td> <input type="text" id="txtFirstName" name="txtFirstName"value="<%=fn%>" style="width:100% ;height: 25px" autofocus required ></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td><span class="Validation">*</span></td>
                        <td><label for="author">Last Name:</label></td>
                        <td><input type="text" id="txtLastName" name="txtLastName"value="<%=ln%>" style="width:100% ;height: 25px" required></td>
                        <td></td>
                    </tr>
                    <tr>
                            <td></td>
                            <td><label>Gender:</label> </td>
                            <td colspan="2">
                            <table>
                                <tr><td><input type="radio" name="txtgender"  value="male"<%=valM%> required> Male</td>
                                    <td><input type="radio" name="txtgender"  value="female"<%=valF%> required> Female</td>                               
                                </tr>
                            </table>
                            </td>
                    </tr>
                    <tr>
                        <td><span class="Validation">*</span></td>
                        <td><label>Birth Date: </label> </td>
                        <td><input type="date" id="txtBirthDate" name="txtBirthDate"value="<%=bd%>"  style="width:100% ;height: 25px" required></input></td>           
                        <td></td>
                    </tr> 
                    <tr>
                        <td><span class="Validation">*</span></td>
                        <td><label>Birth Time: </label> </td>
                        <td><input type="text" id="txtBirthTime" name="txtBirthTime" value="<%=bt%>" style="width:100% ;height: 25px" required></input></td>           
                        <td><select id="txtBirthTimeUnit" name="txtBirthTimeUnit" class="txtBirthTimeUnit" value="txtBirthTimeUnit">
                            <option id="optn1" value="<%=btu%>" >AM</option>
                            <option id="optn2" value="<%=btu%>" >PM</option>
                            </select></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><label>Blood Group: </label> </td>
                        <td><input type="text" id="txtBloodGroup" name="txtBloodGroup" value="<%=bg%>" style="width:100% ;height: 25px" required ></input></td>           
                        <td></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><label>Weight At Birth: </label> </td>
                        <td><input type="text" id="txtWeightAtBirth" name="txtWeightAtBirth" value="<%=wb%>" style="width:100% ;height: 25px" required></input></td>           
                        <td></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><label>Height At Birth: </label> </td>
                        <td><input type="text" id="txtHeightAtBirth" name="txtHeightAtBirth" value="<%=hb%>" style="width:100% ;height: 25px" required></input></td>           
                        <td><label>(in Feet)</label></td>
                    </tr>
                    <tr>
                    <tr>
                        <td></td>
                        <td><label>Heart Bit At Birth: </label> </td>
                        <td><input type="text" id="txtHeartBitAtBirth" name="txtHeartBitAtBirth" value="<%=heb%>" style="width:100% ;height: 25px" required></input></td>           
                        <td><label>(In hz)</label></td>
                    </tr>
                    <tr>
                    <td></td>
                        <td><label>DeliveryType</label></td>
                        <td><select name="DeliveryType"value="<%=dt%>"style="width:100% ;height: 25px" required>
                            <option id="txtNormal" value="Normal" >Normal</option>
                            <option id="txtOperation" value="OPeration">Operation</option>
                        </select></td>          
                        <td></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><label>Any Abnormal Symptoms: </label> </td>
                        <td><input type="text" id="txtAnyAbnormalSymptoms" name="txtAnyAbnormalSymptoms" value="<%=sym%>"  style="width:100% ;height: 25px" required></input></td>           
                        <td></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><label>Consultant Doctor: </label> </td>
                        <td><select name="txtDoctor" id="txtDoctor" style="width:100% ;height: 25px" required>
                        </select></td>
                        <td></td>
                   </tr>
                   <tr> 
                        <td></td>
                        <td><label>Description: </label> </td>
                        <td><input type="text" id="txtDescription" name="txtDescription" style="width:100% ;height: 25px" ></input></td>           
                        <td></td>
                   </tr>
                   <% 
                       if(request.getAttribute("data")==null)
                       {  
                   %>
                   <tr>
                        <td><span class="Validation">*</span></td>
                        <td><label for="url">Desired UserName:</label> </td>
                        <td><input  id="un" type="text" name="uname" autocomplete="off" maxlength="7" onblur="getUserName();" style="width:100% ;height: 25px" required ></td>
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
                        <td><input id="rps" type="password" name="rpass" maxlength="10" onblur="validate();" style="width:100% ;height: 25px"  required ></td>
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
                <% } 
          %>    
                   <tr>
                        <td></td>
                        <td></td>
                        <td colspan="2">
                            <table>
                                <tr>
                                    <td><input style="font-weight: bold;" type="submit" class="submitbtn"  id="submit" value="Submit" /></td>
                                    <td><input type="button" name="reset" id="reset" value="Reset" class="submitbtn" /></td>
    <%                               if(request.getAttribute("data")!=null)
    {  %>
                    <td>   
                        <a href="adminList"><input type="button" name="Back" id="Back" value="Back" class="submitbtn" /></a></td>
    <%  }     if(request.getAttribute("data")==null) 
    {        %>
    
                    <td> <a href="newRegistration.jsp"><input type="button" name="Back" id="Back" value="Back" class="submitbtn" /></a></td>
    <%  } %>
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

