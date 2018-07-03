<%-- 
    Document   : vaccination
    Created on : 4 Mar, 2015, 1:58:01 PM
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

                
       function getcpatient()
       {
       
         xmlHttp=GetXmlHttpObject();  // function call to load object
                if (xmlHttp==null)
                {
               // alert ("Browser does not support HTTP Request")
                    return;
                }
              // var uname=document.myForm.uname.value;
                var cn=document.getElementById("txtCpatientName").value;
            //    alert("txtVaccineName",+vn);
                var url="vaccinationServletDB.jsp?cn1="+escape(cn);

                xmlHttp.open("GET",url,true);  
                xmlHttp.onreadystatechange=displaycpatient;  // function call to update page using retrieved data
                xmlHttp.send(null);
        }
//-------------------------------------
    function displaycpatient()
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
                       var optn=document.getElementById("txtCpatientName");
                       for(var i=0;i<data.length;i++)
                       {
                        var cn=data[i].split("$");
                        optn[i]=new Option(cn[1],cn[0]);
                       }
                       
                       var cn=document.getElementById("txtCpatientName");
                      // alert("sub="+sub);
                }
                
                else
                    {
       //                 alert(xmlHttp.status);
                    }
                }
   
    } 
    function getdata()
    {
        
       
         xmlHttp=GetXmlHttpObject();  // function call to load object
                if (xmlHttp==null)
                {
               // alert ("Browser does not support HTTP Request")
                    return;
                }
              // var uname=document.myForm.uname.value;
                var dt=document.getElementById("txtCpatientName").value;
            //    alert("txtVaccineName",+vn);
                var url="vaccinationvnServletDB.jsp?data="+escape(dt);

                xmlHttp.open("GET",url,true);  
                xmlHttp.onreadystatechange=createVaccinationTable;  // function call to update page using retrieved data
                xmlHttp.send(null);
    }
    function createVaccinationTable()
    {
                if(xmlHttp.status==200)
                {
                       
               var newStatus=xmlHttp.responseText;
              // alert("newStatus: "+newStatus);
               var ind1=newStatus.indexOf("[");
               var ind2=newStatus.indexOf("]");
               newStatus=newStatus.substring(ind1+1,ind2);
               var data=newStatus.split(",");
               var pId=document.getElementById("txtCpatientName").value;  
   //            alert("pid= "+pId);
                
                var table = document.getElementById("vaccination");
                table.innerHTML="";
                var row=table.insertRow(0);
                var cell1=row.insertCell(0);
                cell1.innerHTML="Vaccine_Name";
                for(i=0;i<25;i++)
                    {
                        var celli=row.insertCell(i+1);
                        celli.innerHTML=i;  
                    }
                    
                    for(i=0;i<data.length;i++)
                    {
                          var row=table.insertRow(i+1);
                          
                        var user1=data[i].split("$");
                        var cell1=row.insertCell(0);
                        cell1.innerHTML=user1[0]+" : Dose "+i;
                        for(z=0;z<25;z++)
                        {
                            var celli=row.insertCell(z+1);
                            if(z==user1[user1.length-1])
                                {
                                    var link = document.createElement("a");
     //                               alert("user1[3]: "+user1[3]);
                                    if(user1[3]=="null")
                                        {
                                           link.setAttribute("href", "viewInteractionType?vId="+user1[1]+"&dId="+user1[2]+"&pId="+pId.trim());
                                            celli.style.background="green";
                                        }
                                        else
                                            {
                                                link.setAttribute("href", "viewVDetail?vId="+user1[1]+"&dId="+user1[2]+"&pId="+pId.trim()); 
                                            
                                                // link.setAttribute("href", "viewInteractionType?vId="+user1[1]+"&dId="+user1[2]+"&pId="+pId.trim());
                                                  celli.style.background="red";
                                       }
                                   
                                    link.innerHTML = z;
                                    celli.appendChild(link);
                                }
                            else
                                celli.innerHTML="";
                        }
                  }
            }
    }
           
</script>
    
    </head>
    <body onload="getcpatient();">
        <jsp:include page="/adminMenu.jsp"/>
        <div class="wrapper col5">
        <div id="container">
            <div id="breadcrumb">
                <p>Vaccine Interaction</p>
            </div>
            <form method="get" action="" id="form65" name="formVaccination" >
                <div align="center">
                <table cellpadding="0" cellspacing="5px"  style="text-align:left" >
                    <tr>
                        <td></td>
                        
                            <td> <label for="author">Child Patient Name:</label> </td>
                       <td>
                           <select id="txtCpatientName" style="width:100% ;height: 25px" name="txtCpatientName" onchange="getdata();"  autofocus required >
                               
                           </select>
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                                <table id="vaccination" border="1" cellpadding="5px" cellspacing="5px"></table>
                                <td></td>
                    </tr>
                               
                   <tr>
                        <td></td>
                        <td></td>
                        <td colspan="2">
                            <table>
                                <tr>
                                    <td><input style="font-weight: bold;" type="submit" class="submitbtn"  id="submit" value="Submit" />
                                    </td>
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
