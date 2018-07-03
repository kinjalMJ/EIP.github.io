<%-- 
    Document   : getHcare
    Created on : 3 Apr, 2015, 3:38:46 PM
    Author     : Kinjal Jarodiya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:include page="/HeaderPage.jsp"/>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
        <link rel="stylesheet" href="css/layout.css" type="text/css" />
          <script lang="javascript">
  
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
       function getHcare()
       {
       
         xmlHttp=GetXmlHttpObject();  // function call to load object
                if (xmlHttp==null)
                {
               // alert ("Browser does not support HTTP Request")
                    return;
                }
              // var uname=document.myForm.uname.value;
                var cn=document.getElementById("txtHcareName").value;
            //    alert("txtVaccineName",+vn);
                var url="GetNameDB.jsp?cn1="+escape(cn);

                xmlHttp.open("GET",url,true);  
                xmlHttp.onreadystatechange=displayhcare;  // function call to update page using retrieved data
                xmlHttp.send(null);
        }
//-------------------------------------
    function displayhcare()
    {
             // alert("in type data function ready state: "+xmlHttp.readyState)
                if(xmlHttp.readyState==4 || xmlHttp.readyState=="complete")
                {
               //    alert("in ready state 4 page");
                if(xmlHttp.status==200)
                {
                       var newStatus=xmlHttp.responseText;
                 //      alert("newStatus: "+newStatus);
                       
                       var ind1=newStatus.indexOf("[");
                       var ind2=newStatus.indexOf("]");
                       newStatus=newStatus.substring(ind1+1,ind2);
                       var data=newStatus.split(",")
                       var optn=document.getElementById("txtHcareName");
                       for(var i=0;i<data.length;i++)
                       {
                        var cn=data[i].split("$");
                        optn[i]=new Option(cn[1],cn[0]);
                       }
                       
                       var cn=document.getElementById("txtHcareName");
                      // alert("sub="+sub);
                }
                
                else
                    {
                        alert(xmlHttp.status);
                    }
                }
   
    } 
          </script>
    </head>
    <body onload="getHcare();">
        <jsp:include page="/adminMenu.jsp"/>
        <div class="wrapper col5">
        <div id="container">
            <div id="breadcrumb">
                <p>Search Patient</p>
            </div>
            
                <form id="form23" action="HcareNameCall.jsp">
                    <div align="center">
                    <table cellpadding="0" cellspacing="5px"  style="text-align:left" >
                        
                        <tr>
                        <td></td>
                        
                            <td> <label for="author">Health Care Provider Name:</label> </td>
                       <td>
                           <select id="txtHcareName" style="width:100% ;height: 25px" name="txtHcareName" autofocus required >
                           </select>
                           <td><input type="submit" name="search" id="search" value="search" class="submitbtn" /></td>
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
