<%-- 
    Document   : changeDrug
    Created on : 10 Mar, 2015, 1:40:16 PM
    Author     : Kinjal Jarodiya
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:include page="/HeaderPage.jsp"/>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/layout.css" type="text/css" />
         <% 
         ArrayList a1=new ArrayList();
         String mid="",pid="",com="",did="",unit="",qty="",time="",day="",date="";
         if(request.getAttribute("data1")!=null)
        {
           a1= (ArrayList)request.getAttribute("data1");
           out.println(a1);
           mid= a1.get(2).toString();
           pid= a1.get(1).toString();
           com= a1.get(3).toString();
           did=a1.get(4).toString();
           qty= a1.get(5).toString();   
           unit= a1.get(6).toString();
           time= a1.get(7).toString();
           day= a1.get(8).toString();
           date= a1.get(9).toString();
           
         }
        
    %>
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
      
        
  function getdn()
       {
       
         xmlHttp=GetXmlHttpObject();  // function call to load object
                if (xmlHttp==null)
                {
               // alert ("Browser does not support HTTP Request")
                    return;
                }
              // var uname=document.myForm.uname.value;
                var dn=document.getElementById("DrugsId").value;
            //    alert("txtDrugName",+dn);
                var url="interactiondnServletDB.jsp?dn1="+escape(dn);

                xmlHttp.open("GET",url,true);  
                xmlHttp.onreadystatechange=displaydn;  // function call to update page using retrieved data
                xmlHttp.send(null);
        }
    function displaydn()
    {
             // alert("in type data function ready state: "+xmlHttp.readyState)
                if(xmlHttp.readyState==4 || xmlHttp.readyState=="complete")
                {
                 //  alert("in ready state 4 page");
                if(xmlHttp.status==200)
                {
                       var newStatus=xmlHttp.responseText;
                    alert("newStatus: "+newStatus);
                       
                       var ind1=newStatus.indexOf("[");
                       var ind2=newStatus.indexOf("]");
                       newStatus=newStatus.substring(ind1+1,ind2);
                       var data=newStatus.split(",")
                       var optn=document.getElementById("DrugsId");
                       for(var i=0;i<data.length;i++)
                       {
                         var vd=data[i].split("$");
                         alert(vd);
                         optn[i]=new Option(vd[1],vd[0]);
                       }
                    //   var dn=document.getElementById("DrugsId");
                //       alert("sub="+dn);
                }
                else
                    {
                        alert(xmlHttp.status);
                    }
                }   
    }
    </script>
    </head>
    <body onload="getdn();">
        <jsp:include page="/adminMenu.jsp"/>
        <div class="wrapper col5">
        <div id="container">
            <div id="breadcrumb">
                <p>Medication</p>
            </div>
        <form method="get" action="updateDrug" id="form25" name="ChageDrug" >
                <div align="center">
                <table cellpadding="0" cellspacing="5px"  style="text-align:left" >
                    <tr>
                        <td><span class="Validation">*</span></td>
                        <td> Medication Id: </td>
                        <td><label id="MedicationId" name="MedicationId"><%=mid%></label></td>
                        <td><input type="hidden" value="<%=mid%>" name="mId"></td>
                    </tr>
                    
                    <tr>
                        <td><span class="Validation">*</span></td>
                        <td> Patient Name: </td>
                        <td><label id="PatientId" name="PatientId" ><%=pid%></label></td>
                        <td></td>
                    </tr>
                     <tr>
                         <td><span class="Validation">*</span></td>
                         <td> Drug Id: </td>
                         <td><select type="text" name="DrugsId" id="DrugsId"></select></td>
                         
                         <td></td>
                     </tr>
                      <tr>
                         <td><span class="Validation">*</span></td>
                         <td><label>Complain:</label> </td>
                         <td><input type="text" id="txtComId" name="txtComId" value="<%=com%>"></td>
                      </tr>
                       <tr>
                         <td></td>
                         <td><label>Dose Qty: </label> </td>
                         <td><input type="text" id="txtDoseQty" name="txtDoseQty" value="<%=qty%>" style="width:100% ;height: 25px" required></input></td>           
                         <td></td>
                      </tr>
                       <tr>
                         <td></td>
                         <td><label>Unit: </label> </td>
                         <td><input type="text" id="txtUnit" name="txtUnit" value="<%=unit%>" style="width:100% ;height: 25px" required></input></td>           
                         <td></td>
                      </tr>
                       <tr>
                         <td></td>
                         <td><label>No of Times in a Day : </label> </td>
                         <td><input type="text" id="txtNoOfTimesInADay" name="txtNoOfTimesInADay" value="<%=time%>" style="width:100% ;height: 25px" required></input></td>           
                         <td></td>
                      </tr>
                       <tr>
                         <td></td>
                         <td><label>No of Day : </label> </td>
                         <td><input type="text" id="txtNoOfDay" name="txtNoOfDay" value="<%=day%>" style="width:100% ;height: 25px" required></input></td>           
                         <td></td>
                      </tr>
                       <tr>
                         <td></td>
                         <td><label>Date: </label> </td>
                         <td><input type="Date" id="txtDate" name="txtDate" value="<%=date%>"  style="width:100% ;height: 25px" required></input></td>           
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
