<%-- 
    Document   : doctorNameDB
    Created on : 12 Mar, 2015, 2:15:59 PM
    Author     : User
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="logic.logicFunction"%>
<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.* " %>

<%  Connection con=null;
    String query=null;    
    try
    {
        con=logicFunction.getConnection();
        ArrayList a1=new ArrayList();
        Statement st=con.createStatement();
        query="select healthcareProvider_Id,First_Name,Last_Name,User_Name from healthcare_provider_detail";
        ResultSet rs= st.executeQuery(query);
        while(rs.next())
        {
            a1.add(rs.getString("healthcareProvider_Id")+"$"+rs.getString("User_Name")+"$"+rs.getString("First_Name")+" "+rs.getString("Last_Name"));
        
        }
          request.setAttribute("data", a1);
            out.println(a1);  
    }
    catch(Exception e)
    {
        out.println(e);
    }

%>