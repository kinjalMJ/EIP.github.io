<%-- 
    Document   : oldPassCheckDB
    Created on : 3 Apr, 2015, 4:15:39 PM
    Author     : User
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="logic.logicFunction"%>
<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.* "  %>

 <%@page import="javax.servlet.http.HttpSession"%>
<%
Connection con=null;
    String query=null;          
    HttpSession s1=request.getSession(false);
    String type= s1.getAttribute("Type").toString();
    String uname=s1.getAttribute("user").toString();
               
      
    try
    {
        con=logicFunction.getConnection();
        ArrayList a1=new ArrayList();
        String op=request.getParameter("op");
        if(type.equalsIgnoreCase("admin"))
            {
            query="select Password from admin_detail where User_Name='"+uname.trim()+"' and password='"+op+"'";
            }
         if(type.equalsIgnoreCase("Patient"))
            {
            query="select Password from child_patient where User_Name='"+uname.trim()+"'";
            }
         if(type.equalsIgnoreCase("HealthcareProvider"))
            {
            query="select Password from healthcare_provider_detail where User_Name='"+uname.trim()+"'";
            }
        Statement st=con.createStatement();
            
        ResultSet rs= st.executeQuery(query);
        if(rs.next())
        {
       //String Pass= rs.getString("Password"); 
            
                       }
        else
                       {
            out.println("Re-enter your old Password.");}                                
       
    }
    catch(Exception e)
    {
        out.println(e);
    }
%>
