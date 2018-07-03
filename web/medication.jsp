<%-- 
    Document   : patientInspection
    Created on : 20 Feb, 2015, 3:15:17 PM
    Author     : User
    Medication
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:include page="/HeaderPage.jsp"/>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
   
   function getPatientId()
   {
       
         xmlHttp=GetXmlHttpObject();  // function call to load object
                if (xmlHttp==null)
                {
               // alert ("Browser does not support HTTP Request")
                    return;
                }
              // var uname=document.myForm.uname.value;
            
        var url="patientInspectionDB.jsp";
        xmlHttp.open("GET",url,true);  
        xmlHttp.onreadystatechange=displayPatientId;  // function call to update page using retrieved data
        xmlHttp.send(null);
   }
   function displayPatientId()
   {
      // alert("in type data function ready state: "+xmlHttp.readyState)
                if(xmlHttp.readyState==4 || xmlHttp.readyState=="complete")
                {
             //         alert("in ready state 4 page");
                if(xmlHttp.status==200)
                {
                       var newStatus=xmlHttp.responseText;
                       //alert("newStatus: "+newStatus);
                       var ind1=newStatus.indexOf("[");
                       var ind2=newStatus.indexOf("]");
                       newStatus=newStatus.substring(ind1+1,ind2);
                       var data=newStatus.split(",")
                       var optn=document.getElementById("PatientId");
                       for(var i=0;i<data.length;i++)
                       {
                         var allData=data[i].split("$");
                         optn[i]=new Option(allData[1],allData[0]);
                       }       
                }
                
                else
                    
                    {
                        //alert(xmlHttp.status);
                    }
                }
   }        
        function getDrug()
        {
       
         xmlHttp=GetXmlHttpObject();  // function call to load object
                if (xmlHttp==null)
                {
               // alert ("Browser does not support HTTP Request")
                    return;
                }
              // var uname=document.myForm.uname.value;
            
        var url="drugInspectionDB.jsp";
        xmlHttp.open("GET",url,true);  
        xmlHttp.onreadystatechange=displayDrug;  // function call to update page using retrieved data
        xmlHttp.send(null);
   }
   function displayDrug()
   {
       //alert("in type data function ready state: "+xmlHttp.readyState)
                if(xmlHttp.readyState==4 || xmlHttp.readyState=="complete")
                {
             //         alert("in ready state 4 page");
                if(xmlHttp.status==200)
                {
                       var newStatus=xmlHttp.responseText;
                       //alert("newStatus: "+newStatus);
                       var ind1=newStatus.indexOf("[");
                       var ind2=newStatus.indexOf("]");
                       newStatus=newStatus.substring(ind1+1,ind2);
                       var data=newStatus.split(",")
                       var optn=document.getElementById("DrugName");
                       for(var i=0;i<data.length;i++)
                       {
                         var allData=data[i].split("$");
                         optn[i]=new Option(allData[1],allData[0]);
                     
                       }       
                }
                
                else
                    
                    {
                        //alert(xmlHttp.status);
                    }
                }
    
}

</script>

    </head>
    <body onload="getPatientId();">
        <jsp:include page="/adminMenu.jsp"/>
        <div class="wrapper col5">
        <div id="container">
            <div id="breadcrumb">
                <p>Medication</p>
            </div>
        <form method="get" action="medication" id="form25" name="Medication" >
                <div align="center">
                <table cellpadding="0" cellspacing="5px"  style="text-align:left" >
                    <tr>
                        <td><span class="Validation">*</span></td>
                        <td> Patient Name: </td>
                        <td><select id="PatientId" name="PatientId" onchange="getDrug();"></select></td>
                        <td></td>
                    </tr>
                     <tr>
                         <td><span class="Validation">*</span></td>
                         <td> Drug Name: </td>
                         <td><select id="DrugName" name="DrugName"></select></td>
                         <td></td>
                     </tr>
                      <tr>
                         <td><span class="Validation">*</span></td>
                         <td><label>Complain:</label> </td>
                         <td><textarea id="txtComId" name="txtComId"></textarea></td>
                      </tr>
                       <tr>
                         <td></td>
                         <td><label>Dose Quantity: </label> </td>
                         <td><input type="text" id="txtDoseQty" name="txtDoseQty" value"" style="width:100% ;height: 25px" required></input></td>           
                         <td></td>
                      </tr>
                       <tr>
                         <td></td>
                         <td><label>Unit: </label> </td>
                         <td><input type="text" id="txtUnit" name="txtUnit" value"" style="width:100% ;height: 25px" required></input></td>           
                         <td></td>
                      </tr>
                       <tr>
                         <td></td>
                         <td><label>No of Times in a Day : </label> </td>
                         <td><input type="text" id="txtNoOfTimesInADay" name="txtNoOfTimesInADay" value"" style="width:100% ;height: 25px" required></input></td>           
                         <td></td>
                      </tr>
                       <tr>
                         <td></td>
                         <td><label>No of Day : </label> </td>
                         <td><input type="text" id="txtNoOfDay" name="txtNoOfDay" value"" style="width:100% ;height: 25px" required></input></td>           
                         <td></td>
                      </tr>
                       <tr>
                         <td></td>
                         <td><label>Date: </label> </td>
                         <td><input type="Date" id="txtDate" name="txtDate" value=""  style="width:100% ;height: 25px" required></input></td>           
                         <td></td>
                      </tr>
                       <tr>
                        <td></td>
                        <td></td>
                        <td colspan="2">
                            <table>
                                <tr>
                                    <td><input style="font-weight: bold;" type="submit" class="submitbtn"  id="submit" value="Submit" /></td>
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
