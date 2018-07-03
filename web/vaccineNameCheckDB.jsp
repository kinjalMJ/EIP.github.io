<%-- 
    Document   : vaccineNameCheckDB
    Created on : 13 Mar, 2015, 2:28:01 PM
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
        String vn=request.getParameter("vn");
        query="select Vaccine_Name from vaccine where Vaccine_Name='"+vn.trim()+"'";
    //    out.println(un);
        ResultSet rs= st.executeQuery(query);
        if(rs.next())
        {
                   out.println("VaccineName is already exist!!");   
        }
        }
    catch(Exception e)
    {
        out.println(e);
    }

%>