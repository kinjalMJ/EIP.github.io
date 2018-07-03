<%-- 
    Document   : TypeRightsAjaxDB
    Created on : 1 Mar, 2015, 3:45:21 PM
    Author     : User
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="logic.logicFunction" %>
<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.* " %>

<%
    try
    {
        Connection con;
        con=logicFunction.getConnection();
        ArrayList a1=new ArrayList();
        Statement st=con.createStatement();
         String type=request.getParameter("t");
   //     String type=logicFunction.checkRequestNull(request, "t");
        out.println("type="+type.trim());
        String query=null;
     //   query = "select * from menu_description where User_type='"+type.trim()+"'";
        query="select menu_Name,Menu_Id from menu_description where Menu_id not in( "+
                " select m1.menu_id from menu_description m1 inner join menu_description m2 on "+
                " m1.Menu_id=m2.parent_Id and m1.User_type='"+type+"') and User_type='"+type+"'";
        ResultSet rs= st.executeQuery(query);
        StringBuffer sb;

        while(rs.next())
        {
            sb=new StringBuffer();
        
            sb.append(rs.getString("Menu_Name")+"$ "+rs.getString("Menu_Id")) ;
           
            a1.add(sb);
        }
            request.setAttribute("data", a1);
            out.println(a1);
            out.println("kinjal");
    }
    catch(Exception e)
    {
        out.println(e);
    }
%>
