<%-- 
    Document   : viewInteractionType
    Created on : 5 Mar, 2015, 3:39:43 PM
    Author     : Kinjal Jarodiya
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
          <script lang="javascript">
            function overRuled(tmp)
            {
               alert(tmp.checked);
               var a=tmp.checked;
               if(a==true)
                   alert("You are overruled the interaction. Mail about interaction overruled is sent to hospital");
            
            }
            
            function checkInteractionChk(size)
            {
             //  alert("in fun");
               for(var i=0;i<size;i++)
                    {
                       var ch= document.getElementById("chk"+i).checked;
                       alert(ch);
                    }
                    return false;
            }
            function trySubmit(size)
            {
                //alert("in fun: "+size);
                var flag=true;
                for(var i=0;i<size;i++)
                    {
                        var ch=document.getElementById("chk"+i).checked;
                        //alert(ch);
                        if(ch==false)
                            {
                                flag=false;
                                alert("Either chnge Drug or over ruled Interaction.")
                                break;
                            }
                    }
                return flag;
            }
        </script>
    </head>
    
    <body>
       <% 
        ArrayList b1=new ArrayList();
        String patientId="no";
        String doseId="";
        String vId="";
        String patientName="";
        if(request.getAttribute("data")!=null)   
        b1=(ArrayList) request.getAttribute("data");
        
        ArrayList b2=new ArrayList();
        if(request.getAttribute("data1")!=null)   
        b2=(ArrayList) request.getAttribute("data1");
        
        ArrayList b3=new ArrayList();
        if(request.getAttribute("data2")!=null)   
        b3=(ArrayList) request.getAttribute("data2");
        
        if(request.getParameter("patientId")!=null)
            patientId=request.getParameter("patientId");
        
        if(request.getParameter("patientName")!=null)
            patientName=request.getParameter("patientName");
        
        if(request.getParameter("doseId")!=null)
            doseId=request.getParameter("doseId");
      
        if(request.getParameter("vId")!=null)
            vId=request.getParameter("vId");
       int s=b1.size();
     %>
        <jsp:include page="/adminMenu.jsp"/>
        <div class="wrapper col5">
        <div id="container">
            <div id="breadcrumb">
                <p>Interaction Information</p>
            </div>
            <form method="get" action="pre-Diagnous.jsp" id="form34" name="formIL" onsubmit=" return trySubmit(<%=s%>);" >
                <input type="submit" value="okkk"></input>
                <div align="center">
                    <input type="text" name="txtvaccineid" value="<%=vId%>">
                    <input type="text" name="txtdoseid" value="<%=doseId%>">
                    <input type="text" name="txtpid" value="<%=patientId%>">
                    <label><%=patientName%></label><br></br>
                    <input type="text" name="patientName" value="<%=patientName%>">
                    <label>Drug Interaction</label>
                    <table border="1">
                        <tr>
                                <th>Interaction Id</th>
                                <th>Vaccine Id</th>
                                <th>Drug Id</th>
                                <th>Drug Name</th>
                                <th>Description</th>
                                <th>OverRule</th>
                                <th>Change</th>
                         </tr>
                            
                        <%
                        String iid="";
                        String vid="";
                        String did="";
                        for(int i=0;i<b1.size();i++)
                        {
                           String Idetails[]=b1.get(i).toString().split(":");
                        %>
                            <tr>
                                <%
                                for(int j=0;j<Idetails.length;j++)
                                {
                                    if(j==0)
                                    {
                                        iid=Idetails[0];
                                    }
    %>
                                
                                <td>
                                    <%=Idetails[j]%>
                                </td>
                                
                                <%
                                }
                                   
                                %>
                                <td><input type="checkbox" onchange="overRuled(this);" id="chk<%=i%>"></input></td>
                         <td><a href="changeDrug?mId=<%=Idetails[Idetails.length-1]%>">Change</a></td>     
                            </tr>
                                                        
                        <%}
%>
                    </table>
                           <label style="font-size:12">Food Interaction</label>
                    <table border="1">
                        <tr>
                            <th>Interaction Id</th>    
                            <th>Description</th>
                        </tr>
                            
                        <%
                        String iid2="";
                        for(int i=0;i<b2.size();i++)
                        {
                           String Idetails[]=b2.get(i).toString().split(":");
                        %>
                            <tr>
                        <%
                                for(int j=0;j<Idetails.length;j++)
                                {
                                    if(j==0)
                                    {
                                        iid2=Idetails[0];
                                    }
                        %>
                              
                                <td>
                                    <%=Idetails[j]%>
                                </td>
                           
                                <%
                               }
                                %>
                         
                             </tr>
                        <%
}
%>
                    </table>
                    <label align="left" style="font-size:12">Allergy Interaction</label>
                    <table border="1">
                        <tr>
                            <th>Interaction Id</th>    
                            <th>Description</th>
                        </tr>
                            
                        <%
                        String iid3="";
                        for(int i=0;i<b3.size();i++)
                        {
                           
                            String Idetails[]=b3.get(i).toString().split(":");
                        %>
                            <tr>
                                <%
                                for(int j=0;j<Idetails.length;j++)
                                {
                                    if(j==0)
                                    {
                                        iid3=Idetails[0];
                                    }
    %>
                               
                                    <td>
                                    <%=Idetails[j]%>
                                    </td>
                                <%
                                }
                                %>                  
                         </tr>
                         <%}%>
                          </table>
               
                            <table>
                                <tr>
                                    <td><input style="font-weight: bold;" type="submit" class="Next"  id="Next" value="submit"></td>
                                    <td><a href=""><input type ="button" class="Back" id="Back" value="Back" style="font-weight: bold;"></a></td>
                                </tr>
                            </table>
                        </td>
                    </tr>
            
                </div>
            </form>
            </body>
    <jsp:include page="/FooterPage.jsp"/>
</html>