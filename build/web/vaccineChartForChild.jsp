
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.*"%>
<!DOCTYPE html>
<jsp:include page="HeaderPage.jsp" />

<html>
    <head>
         <link rel="stylesheet" href="css/layout.css" type="text/css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
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
            
            function vaccineTable()
            {
                //alert("in function");
                xmlHttp=GetXmlHttpObject();
                if(xmlHttp==null)
                    {
                        alert ("Browser does not support HTTP Request")
                        return
                    }
                    var url="VaccineTable.jsp";
                    //alert(url);
                    xmlHttp.open("GET",url,true);
                    xmlHttp.onreadystatechange=CreateVaccineTable;  // function call to update page using retrieved data
                    xmlHttp.send(null);
            }
            function CreateVaccineTable()
            {
                if(xmlHttp.readyState==4 || xmlHttp.readyState=="complete")
                {
                    //alert("in ready state 4 page");
                    if(xmlHttp.status==200)
                    {
                            var newStatus=xmlHttp.responseText;
                            //alert(newStatus);
                            newStatus=newStatus.substring((newStatus.indexOf("[")+1), newStatus.indexOf("]"));
                            //alert(newStatus);
                            var k=newStatus.split(",");
                            //alert(k);
                            var table = document.getElementById("vaccineTable");
                            //alert(table);
                            var row ;
                                row= table.insertRow(0);
                              
                                var cell = row.insertCell(0);
                                var element = document.createElement("label");
                                cell.style.backgroundColor="#333333";
                                cell.style.color="red";
                                cell.appendChild(element);
                                cell.innerHTML="Vaccine";
                                
                                var cell = row.insertCell(1);
                                var element = document.createElement("label");
                                cell.style.backgroundColor="#333333";
                                cell.style.color="red";
                                cell.appendChild(element);
                                cell.innerHTML="Dose_Id";
                                
                                var cell = row.insertCell(2);
                                var element = document.createElement("label");
                                cell.style.backgroundColor="#333333";
                                cell.style.color="red";
                                cell.appendChild(element);
                                cell.innerHTML=" Schedule Date";
                                
                                var cell = row.insertCell(3);
                                var element = document.createElement("label");
                                cell.style.backgroundColor="#333333";
                                cell.style.color="red";
                                cell.appendChild(element);
                                cell.innerHTML=" Taken Date";
                                
                                var vaccine,VaccineDate,doseId,noOfDose,prevVaccine,tkndate;
                                for(var i=0; i<k.length;i++)
                                {
                                    //alert("in for");
                                    vaccine=k[i].substring(0, k[i].indexOf('$')).trim();
                                    //alert(vaccine);
                                    doseId=k[i].substring(k[i].indexOf('$')+1,k[i].indexOf('#')).trim();
                                    //alert(doseId);
                                    VaccineDate=k[i].substring(k[i].indexOf('#')+1,k[i].indexOf('@')).trim();
                                    tkndate=k[i].substring(k[i].indexOf('@')+1,k[i].indexOf('*')).trim();
                                    noOfDose=k[i].substring(k[i].indexOf('*')+1);
                                    //alert(VaccineDate);
                                    var flag=1;
                                   // alert("vaccine: "+vaccine);
                                    //alert("prevVaccine: "+prevVaccine);
                                    if(i!=0)
                                        {
                                            if(vaccine==prevVaccine)
                                                flag=0;
                                        }
                                       
                                    row= table.insertRow(i+1);
                                    var x=0;
                                    //alert("flag= "+flag);
                                    if(flag==1)
                                    {
                                        var cell = row.insertCell(x);
                                        cell.setAttribute("rowSpan",noOfDose);
                                        var element = document.createElement("label");
                                        cell.style.backgroundColor="#999999";
                                        cell.style.color="#000000";
                                        cell.appendChild(element);
                                        cell.innerHTML=vaccine;
                                        x++;
                                    }
                                    var cell = row.insertCell(x);
                                    var element = document.createElement("label");
                                    cell.style.backgroundColor="#999999";
                                    cell.style.color="#000000";
                                    cell.appendChild(element);
                                    cell.innerHTML=doseId;
                                    x++;
                                    var cell = row.insertCell(x);
                                    var element = document.createElement("label");
                                    cell.style.backgroundColor="#999999";
                                    cell.style.color="#000000";
                                    cell.appendChild(element);
                                    cell.innerHTML=VaccineDate;
                                    prevVaccine=vaccine;
                                    x++;
                                    var cell = row.insertCell(x);
                                    var element = document.createElement("label");
                                    cell.style.backgroundColor="#999999";
                                    cell.style.color="#000000";
                                    cell.appendChild(element);
                                    if(tkndate=="null")
                                    {
                                        cell.innerHTML="";
                                    }
                                    else
                                    {
                                        cell.innerHTML=tkndate;
                                    }
                                    
                                }
                    }
                    else
                    {
                            alert("Error! request status is "+xmlHttp.status);
                    }
                }   
            }
        </script>
    </head>
    <body onload="vaccineTable();">
        <jsp:include page="/adminMenu.jsp"/>
    <div class="wrapper col5">
        <div id="container">
            <div id="breadcrumb">
                <p>Dash Board</p>
            </div>
 <!------------------------------------------------------------------------------------------------------------------------------------------>
            <table>
                <tr>
                    <td align="center" valign="top"> 
                        <br>
                        <br>
                        <div class="marqueecontainer" >
                            
                        </div>
                         </table> 
                    </td>
  <!----------------------------------------------------------------------------------------------------------------------------------------------------------->                  
        <td  align="center"> 
        <table id="vaccineTable"></table>
        </td>
   <!---------------------------------------------------------------------------------------------------------------------------------------------------------------->     
    <table>
                <tr>
                    <td align="center" valign="top"> 
                        <br>
                        <br>
                        <div class="marqueecontainer" >
                            
                        </div>
                         </table> 
                    </td>
<!---------------------------------------------------------------------------------------------------------------------------------------------------------->                    
         </div>
    </div>

</body>
</html>
<jsp:include page="FooterPage.jsp" />
