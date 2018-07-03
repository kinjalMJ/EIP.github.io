<%-- 
    Document   : GetNameDB
    Created on : 3 Apr, 2015, 4:18:25 PM
    Author     : Kinjal Jarodiya
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
        query="select healthcareProvider_Id,User_Name from healthcare_provider_detail";
        ResultSet rs= st.executeQuery(query);
        while(rs.next())
        {
            a1.add(rs.getString("User_Name")+"$"+rs.getString("User_Name"));
        
        }
          request.setAttribute("data", a1);
            out.println(a1);
             
    }
    catch(Exception e)
    {
        out.println(e);
    }

%>