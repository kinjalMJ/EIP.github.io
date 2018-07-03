<%-- 
    Document   : userNamePDB
    Created on : 13 Mar, 2015, 1:41:49 PM
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
        String un=request.getParameter("un");
        query="select User_Name from child_patient where User_Name='"+un.trim()+"' ORDER by User_Name";
    //    out.println(un);
        ResultSet rs= st.executeQuery(query);
        if(rs.next())
        {
                   out.println("UserName is already exist!!");   
        }
        }
    catch(Exception e)
    {
        out.println(e);
    }

%>