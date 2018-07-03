<%-- 
    Document   : vaccineInteraction
    Created on : 1 Mar, 2015, 1:54:47 PM
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

                
       function getvn()
       {
       
         xmlHttp=GetXmlHttpObject();  // function call to load object
                if (xmlHttp==null)
                {
               // alert ("Browser does not support HTTP Request")
                    return;
                }
              // var uname=document.myForm.uname.value;
                var vn=document.getElementById("txtVaccineName").value;
            //    alert("txtVaccineName",+vn);
                var url="interactionServletDB.jsp?vn1="+escape(vn);

                xmlHttp.open("GET",url,true);  
                xmlHttp.onreadystatechange=displayvn;  // function call to update page using retrieved data
                xmlHttp.send(null);
        }
//-------------------------------------
    function displayvn()
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
                       var optn=document.getElementById("txtVaccineName");
                       for(var i=0;i<data.length;i++)
                       {
                        var vc=data[i].split("$");
                        optn[i]=new Option(vc[1],vc[0]);
                       }
                       
                       var vn=document.getElementById("txtVaccineName");
                      // alert("sub="+sub);
                }
                
                else
                    {
                        alert(xmlHttp.status);
                    }
                }
   
    }
    function getdn()
       {
              
              alert("in fun")
              var It=document.getElementById("txtVaccineType").value;
                alert(It);
                if(It.trim()!="Drug")
                  {
                      alert("in if");
                      document.getElementById("txtDrugName").style.display = 'none';
                    //  document.getElementById(one).style.display = 'block';
                      document.getElementById("txtDN").style.display = 'none';              
                      return;

                    }
                
                
                    
                
            else
                {
                    document.getElementById('txtDrugName').style.display = "block";
                    
                    document.getElementById('txtDN').style.display = "block";              
                      
                   alert("in else");
                
         xmlHttp=GetXmlHttpObject();  // function call to load object
                if (xmlHttp==null)
                {
               // alert ("Browser does not support HTTP Request")
                    return;
                }
                
              // var uname=document.myForm.uname.value;
                var dn=document.getElementById("txtDrugName").value;
            //    alert("txtDrugName",+dn);
                var url="interactiondnServletDB.jsp?vn1="+escape(dn);

                xmlHttp.open("GET",url,true);  
                xmlHttp.onreadystatechange=displaydn;  // function call to update page using retrieved data
                xmlHttp.send(null);
        }}
    function displaydn()
    {
             // alert("in type data function ready state: "+xmlHttp.readyState)
                if(xmlHttp.readyState==4 || xmlHttp.readyState=="complete")
                {
                 //  alert("in ready state 4 page");
                if(xmlHttp.status==200)
                {
                       var newStatus=xmlHttp.responseText;
                  //     alert("newStatus: "+newStatus);
                       
                       var ind1=newStatus.indexOf("[");
                       var ind2=newStatus.indexOf("]");
                       newStatus=newStatus.substring(ind1+1,ind2);
                       var data=newStatus.split(",")
                       var optn=document.getElementById("txtDrugName");
                       for(var i=0;i<data.length;i++)
                       {
                         var vd=data[i].split("$");
                         optn[i]=new Option(vd[1],vd[0]);
                       }
                       var dn=document.getElementById("txtDrugName");
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
    <body onload="getvn();">
        <jsp:include page="/adminMenu.jsp"/>
        <div class="wrapper col5">
        <div id="container">
            <div id="breadcrumb">
                <p>Vaccine Interaction</p>
            </div>
            <form method="get" action="interactionServlet" id="form24" name="formInteraction" >
                <div align="center">
                <table cellpadding="0" cellspacing="5px"  style="text-align:left" >
                    <tr>
                        <td></td>
                        
                            <td> <label for="author">Vaccine Name:</label> </td>
                       <td>
                           <select id="txtVaccineName" style="width:100% ;height: 25px" name="txtVaccineName" autofocus required ></select>
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td> <label for="author">Interaction Type:</label> </td>
                        <td>
                            <select id="txtVaccineType"  name="txtVaccineType" onchange="getdn();" style="width:100% ;height: 25px" autofocus required >
                                
                                <option id="optn1" value="All">Allergy</option>
                                <option id="optn2" value="Drug">Drug</option>
                                <option id="optn3" value="Food">Food</option>
                                
                            </select>
                             
                        </td>
                        <td></td>
                    </tr>
                    <%
              
           
                    %>                                                                                     
                    <tr>
                        <td></td>
                        <td> <label for="author" id="txtDN">Drug Name:</label> </td>
                        <td> 
                            <select id="txtDrugName" name="txtDrugName" style="width:100% ;height: 25px" autofocus required ></select>
                        </td>
                        <td></td>
                    </tr>
                     <tr>
                        <td></td>
                        <td><label>Description: </label> </td>
                        <td>
                            <textarea id="txtDescription" name="txtDescription" style="width:200% ;height: 100px"  ></textarea> 
                            </td>           
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
