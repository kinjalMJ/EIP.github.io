<%-- 
    Document   : Drug
    Created on : 20 Feb, 2015, 2:49:03 PM
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
         ArrayList a1=new ArrayList();
         String dn="",des="";
          String operation="";
          String Did="";
         if(request.getAttribute("data")!=null)
        {
             operation="edit";
             
             if(request.getParameter("Did")!=null)
                 Did=request.getParameter("Did");
             
           a1= (ArrayList)request.getAttribute("data");
           //out.println(a1);
           dn= a1.get(0).toString();
           des= a1.get(1).toString();
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
       function getDrugName()
    {
         xmlHttp=GetXmlHttpObject();  
                if (xmlHttp==null)
                {
//                alert ("Browser does not support HTTP Request")
                    return;
                }
            //    alert("in funmmmm");
                var dn=document.getElementById("txtDrugName").value;
                alert(dn);
                var url="drugNameDB.jsp?dn="+escape(dn);
                xmlHttp.open("GET",url,true);  
                xmlHttp.onreadystatechange=displayDrugName;  
                xmlHttp.send(null);
        
    }
     function displayDrugName()
    {
                if(xmlHttp.readyState==4 || xmlHttp.readyState=="complete")
                {
                if(xmlHttp.status==200)
                {   
                    //alert("in displayDrugName");
                       var newStatus=xmlHttp.responseText;
                   if(newStatus.trim().length>0)
                     {
                      document.getElementById("dn").innerHTML=newStatus;
                      document.getElementById("txtDrugName").value="";
                       document.getElementById("txtDrugName").focus();
                     }
                     else
                         document.getElementById("dn").innerHTML="";  
                }
                else
                {
                    //alert(xmlHttp.status);
                }
                }
   
    }
    </script>
    </head>
    <body>
        <jsp:include page="/adminMenu.jsp"/>
        <div class="wrapper col5">
        <div id="container">
            <div id="breadcrumb">
                <p>Drug Infomation</p>
            </div>
            <form method="get" action="drugServlet" id="form24" name="formDrugD" >
                <div align="center">
                <input type="hidden" name ="example" value="<%=operation%>">
                <input type="hidden" name ="Did" value="<%=Did%>">
                </input>
               
                <table cellpadding="0" cellspacing="5px"  style="text-align:left" >
                    <tr>
                        <td></td>
                        <td> <label for="author">Drug Name:</label> </td>
                        <td> <input type="text" id="txtDrugName" name="txtDrugName" value="<%=dn%>" onblur="getDrugName();" style="width:100% ;height: 25px" autofocus required ></td>
                        <td></td>
                    </tr>
                     <tr>
                        <td></td>
                        <td><label>Description: </label> </td>
                        <td><input type="text" id="txtDescription" name="txtDescription" value="<%=des%>" style="width:100% ;height: 25px" ></input></td>           
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

