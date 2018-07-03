<%-- 
    Document   : menuRights
    Created on : 1 Mar, 2015, 2:01:39 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:include page="/HeaderPage.jsp" />

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu Rights</title>
        <link rel="stylesheet" href="css/layout.css" type="text/css" />
        <script language="javascript" >
      function GetXmlHttpObject()   // function to load object
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
      function getUser()
      {
       xmlHttp=GetXmlHttpObject();  // function call to load object
                if (xmlHttp==null)
                {
               // alert ("Browser does not support HTTP Request")
                    return;
                }
              // var uname=document.myForm.uname.value;
              var tp=document.getElementById("Type").value; 
           //   alert("Type "+tp);
              var url="TypeAjaxDB.jsp?t="+escape(tp);

        xmlHttp.open("GET",url,true);  
        xmlHttp.onreadystatechange=displayUser;  // function call to update page using retrieved data
        xmlHttp.send(null);
     }
    function displayUser()
    {
   //    alert("in type data function ready state: "+xmlHttp.readyState)
                if(xmlHttp.readyState==4 || xmlHttp.readyState=="complete")
                {
             //         alert("in ready state 4 page");
                if(xmlHttp.status==200)
                {
                       
                       var newStatus=xmlHttp.responseText;
                      // alert("newStatus: "+newStatus);
                       var ind1=newStatus.indexOf("[");
                       var ind2=newStatus.indexOf("]");
                       newStatus=newStatus.substring(ind1+1,ind2);
                       var data=newStatus.split(",")
                       var optn=document.getElementById("User");
                       
                       
                       for(var i=0;i<data.length;i++)
                       {
                         var user=data[i].split("$");
                         optn[i]=new Option(user[1],user[0]);
                       }}
                else {
                //        alert(xmlHttp.status);
                    }
                }
     }
     function getRights()
     {
       xmlHttp=GetXmlHttpObject();  // function call to load object
                if (xmlHttp==null)
                {
          //     alert ("Browser does not support HTTP Request")
                    return;
                }
            //   var uname=document.myForm.uname.value;
              var tp=document.getElementById("Type").value; 
            //  alert("tp "+tp);
              
              var url="TypeRightsAjaxDB.jsp?t="+escape(tp);

        xmlHttp.open("GET",url,true);  
        xmlHttp.onreadystatechange=displayRights;  // function call to update page using retrieved data
        xmlHttp.send(null);
     }
     function displayRights()
     {
     //  alert("in type data function ready state: "+xmlHttp.readyState)
                if(xmlHttp.readyState==4 || xmlHttp.readyState=="complete")
                {
             //         alert("in ready state 4 page");
                if(xmlHttp.status==200)
                {
                       
                       var newStatus=xmlHttp.responseText;
                //       alert("newStatus: "+newStatus);
                       var ind1=newStatus.indexOf("[");
                       var ind2=newStatus.indexOf("]");
                       newStatus=newStatus.substring(ind1+1,ind2);
                       var data=newStatus.split(",")
                       
                        var table=document.getElementById("rightsTable");
                        table.innerHTML="";
                       for(var i=0;i<data.length;i++)
                       {
                        var row=table.insertRow(i);
                        var menu=data[i].split("$");
                        var element=document.createElement("input");
                        element.setAttribute("type", "checkbox");
                        element.setAttribute("name", "chk"+i);
                        var cell=row.insertCell(0);
                        cell.appendChild(element);
                        for(var j=0;j<menu.length;j++)
                         {
                                 if(j==0)
                                 {    
                                 var cell=row.insertCell(j+1);
                                 cell.innerHTML=menu[j];
                                 }
                                 else
                                 {
                                  var element=document.createElement("input");
                                  element.setAttribute("type", "text");
                                  element.setAttribute("name", "text");
                                   element.setAttribute("value", menu[j]);
                                   if(j==1)
                                       element.setAttribute("name", "sub"+i);
                                   else
                                       element.setAttribute("name", "main"+i);
                                  var cell=row.insertCell(j+1);
                                  cell.appendChild(element);
                                 
                                 }}}} else
                    
                           {
                               //alert(xmlHttp.status);
                           }
                    }}
    
        </script>

    </head>
     <body>
     <jsp:include page="/adminMenu.jsp"/>
    <div class="wrapper col5">
     <div id="container"> 
        <div id="breadcrumb">
                <p>Menu Rights</p>
        </div>
                <form method="get" action="menuRights" id="form29" name="formMenuRights" >
                <div align="center">
                <table cellpadding="0" cellspacing="5px"  style="text-align:left" >
                <tr>
                    <td><span class="Validation">*</span></td>
                    <td><label for="url">Type:</label> </td>
                    <td><select id="Type" name="Type" onchange="getUser();">
                    <option value="admin">Admin</option>
                    <option value="HealthcareProvider">Healthcare Provider</option>
                    <option value="Patient">Patient</option>                               
                    </select></td>
                    <td></td>
                </tr>
                <tr>
                     <td><span class="Validation">*</span></td>
                     <td><label for="url">Users:</label> </td>
                     <td><select id="User" onchange="getRights();" name="User"></td>
            
                     </select>
                     <td></td>
                </tr>
                </table>
                    <table id="rightsTable" border="1">
                        
                    </table>
                   <input type="submit" name="submit" id="submit" value="submit" class="submitbtn" />
                </div>
       </div>              
     </div>   
     </body>
     <jsp:include page="/FooterPage.jsp"/>
</html>

             
        
    
