<%-- 
    Document   : VaccineDetails
    Created on : 15 Oct, 2014, 5:45:57 PM
    Author     : Jarodiya Kinjal
--%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:include page="/HeaderPage.jsp" />
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Vaccine Form</title>
        <link rel="stylesheet" href="css/layout.css" type="text/css" />
        <%
         ArrayList a1=new ArrayList();
         String vn="",desc="",fwg="",valF="",valM="",valB="",vt="",valI="",valD="",cat="",valR="",valS="",nod="";
         String operation="";
         String vid="";
        
          if(request.getAttribute("data")!=null)
         {
             operation="edit";
             
             if(request.getParameter("vid")!=null)
                 vid=request.getParameter("vid");
             
           a1= (ArrayList)request.getAttribute("data");
           vn=a1.get(0).toString();
           desc=a1.get(1).toString();
           
           fwg=a1.get(2).toString();
           if(fwg.equalsIgnoreCase("male"))
           valM="checked";
           if(fwg.equalsIgnoreCase("female"))
           valF="checked";
           if(fwg.equalsIgnoreCase("both"))
           valB="checked";
           vt=a1.get(3).toString();
           if(vt.equalsIgnoreCase("Injection"))
           valI="checked";
            if(vt.equalsIgnoreCase("Drop"))
           valD="checked";
           cat=a1.get(4).toString();
           if(cat.equalsIgnoreCase("Routine"))
           valR="checked";
           if(cat.equalsIgnoreCase("Special"))
           valS="checked";
          nod=a1.get(5).toString();
                   }
        %>
        <script language="javascript" >
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
        function getVaccineNameCheck()
    {
         xmlHttp=GetXmlHttpObject();  
                if (xmlHttp==null)
                {
             //   alert ("Browser does not support HTTP Request")
                    return;
                }
              //  alert("in funmmmm");
                var vn=document.getElementById("txtvaccineName").value;
               // alert(vn);
                var url="vaccineNameCheckDB.jsp?vn="+escape(vn);
                xmlHttp.open("GET",url,true);  
                xmlHttp.onreadystatechange=displayVaccineNameCheck;  
                xmlHttp.send(null);
        
    }
     function displayVaccineNameCheck()
    {
                if(xmlHttp.readyState==4 || xmlHttp.readyState=="complete")
                {
                if(xmlHttp.status==200)
                {//       alert("in displayVaccineNameCheck");
                       var newStatus=xmlHttp.responseText;
                        
                        if(newStatus.trim().length>0)
                            {
                                document.getElementById("error").innerHTML=newStatus;
                                   document.getElementById("txtvaccineName").value="";
                                  document.getElementById("txtvaccineName").focus();
                      
                            }
                            else
                                
                                document.getElementById("error").innerHTML="";
                        
                }
                else
                {
                 //   alert(xmlHttp.status);
                }
                }
   
    }

            function createDoseTable()
            
           {
             
                var dose=document.getElementById("noOfDose").value; 
               // alert("noOfDose "+dose);
                var table = document.getElementById("doestable");
                 var row=table.insertRow(0);
                        var cell1=row.insertCell(0);
                        cell1.innerHTML="DoseNo";
                        var cell2=row.insertCell(1);
                        cell2.innerHTML="Age(inMonth)";
                        var cell3=row.insertCell(2);
                        cell3.innerHTML="Optional/Mandatory";
                        var cell4=row.insertCell(3);
                        cell4.innerHTML="Description";
                
                
                for(i=0;i<dose;i++)
                    {
                         var row=table.insertRow(i+1);
                        var cell1=row.insertCell(0);
                        cell1.innerHTML=i+1;
                         var cell2=row.insertCell(1);
                      //  cell2.innerHTML="Age(inMonth)";
                        var element1=document.createElement("input");
                        element1.setAttribute("type", "text");
                        element1.setAttribute("name", "age"+i);
                        cell2.appendChild(element1);
                        var cell3=row.insertCell(2);
                        //cell3.innerHTML="Optional/Mandatory";
                        
                         var element2 = document.createElement("select");
                                    element2.style.align="center";
                                    element2.name = "optional_Mandatory"+i;
                                    var optn1 = document.createElement("option");
                                    optn1.name = "optional"+i;
                                    optn1.value="optional";
                                    optn1.innerHTML="Optional";
                                    element2.add(optn1,null);
                                    var optn2 = document.createElement("option");
                                    optn2.name = "mandatory"+i;
                                    optn2.value="mandatory";
                                    optn2.innerHTML="Mandatory";
                                    element2.add(optn2,null);
                                    cell3.appendChild(element2);
                                    
                        var cell4=row.insertCell(3);
                       // cell4.innerHTML="Description";
                        var element3=document.createElement("input");
                        element3.setAttribute("type", "text");
                        element3.setAttribute("name", "desc"+i);
                        cell4.appendChild(element3);
                
                    }
               
                
             
            }
        </script>
    </head>
    <body>
    <jsp:include page="/adminMenu.jsp"/>
    <div class="wrapper col5">
    <div id="container"> 
        <div id="breadcrumb">
                <p>Vaccine Details</p>
            </div>
        <form method="get" action="VaccineDetailsServlet" id="form1" name="formRe" >

                        <div align="center">
                    <input type="hidden" name ="example" value="<%=operation%>">
                    <input type="hidden" name ="vid" value="<%=vid%>">
                    </input>

                <table cellpadding="0" cellspacing="7px"  style="text-align:left"> 
                    <tr>
                    <label  style="color:red" id="error"></label>
                    </tr>
                  <!--  <tr>
                        <td>
                            <span class="Validation">*</span></td> 
                            <td><label for="author">Vaccine Id:</label> </td>
                            <td><input type="text" id="txtvaccineId" name="txtvaccineId"  style="width: 180px" placeholder="Enter Vaccine Id." required ></td>
                            <td><label id="error" style="color:red"></label></td>
                    </tr>-->
                    <tr>
                        <td>
                            <span class="Validation">*</span></td> 
                            <td><label for="author">Vaccine Name:</label> </td>
                            <td><input type="text" id="txtvaccineName" name="txtvaccineName" value="<%=vn%>" onblur="getVaccineNameCheck();" style="width: 180px" placeholder="Enter Vaccine Name." required "></td>
                            <td><label id="error" style="color:red"></label></td>
                    </tr>
                        <tr>
                            <td></td>
                            <td><label for="url">Description:</label> </td>
                            <td><textarea id="txtDecId" name="txtdec" required><%=desc%></textarea></td>
                        </tr>
                        <tr>
                            <td><span class="Validation">*</span></td>
                            <td><label for="url">For Whom(gender):</label> </td>
                            <td colspan="3">
                                <table>
                                    <tr><td><input type="radio" name="gender"  value="male" <%=valM%> required> Male</td>
                                        <td><input type="radio" name="gender"  value="female" <%=valF%> required> Female</td>
                                        <td><input type="radio" name="gender"  value="both"  <%=valB%> required> Both</td>
                                    </tr>
                                </table>
                            </td>
                        </tr>
                        <tr>
                            <td><span class="Validation">*</span></td>
                            <td><label for="url">Vaccine Type:</label> </td>
                            <td colspan="2">
                                <table>
                                    <tr><td><input type="radio" name="vaccineType"  value="Injection" <%=valI%> required> Injection</td>
                                        <td><input type="radio" name="vaccineType"  value="Drop" <%=valD%> required> Drop</td>
                                    </tr>
                                </table>
                            </td>
                        </tr>
                        <tr>
                            <td><span class="Validation">*</span></td>
                            <td><label for="url">Select Vaccine category:</label> </td>
                            <td colspan="2">
                                <table>
                                    <tr><td><input type="radio" name="rs" value="Routine" <%=valR%> required > Routine</td>
                                        <td><input type="radio" name="rs" value="Special" <%=valS%> required> Special</td>
                                    </tr>
                                </table>
                            </td>
                        </tr>
                        <tr>
                            <td><span class="Validation">*</span></td>
                            <td><label for="url">No Of Dose:</label> </td>
                            <td><input type="number" name="noofDose"  id="noOfDose" value="nod" style="width: 180px"  placeholder="Enter no of Dose." min="1"  onblur="createDoseTable();"  required ></td>
                        </tr>
                        <tr>
                            <td colspan="3"><table id="doestable" border ="1"></table></td>
                        </tr>
                        <tr>
                        <td></td>
                        <td></td>
                        <td >
                            <table>
                                <tr>
                                    <td><input style="font-weight: bold;" type="submit" class="submitbtn"  id="submit" value="Save" /></td>
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
</html>
<jsp:include page="/FooterPage.jsp"/>
