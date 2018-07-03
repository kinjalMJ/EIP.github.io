<%-- 
    Document   : drugNameDB
    Created on : 13 Mar, 2015, 3:06:08 PM
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
        String dn=request.getParameter("dn");
        query="select Drugs_Name from drugs where Drugs_Name='"+dn.trim()+"'";
    //    out.println(un);
        ResultSet rs= st.executeQuery(query);
        
        out.println("DrugName is already exist!!");  
        if(rs.next())
        {
                   out.println("DrugName is already exist!!");   
        }
        }
    catch(Exception e)
    {
        out.println(e);
    }

%>