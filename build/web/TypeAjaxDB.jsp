<%-- 
    Document   : TypeAjaxDB
    Created on : 1 Mar, 2015, 2:25:17 PM
    Author     : User
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.* " %>

<%
    try
    {
        Connection con;
        Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/eip";
        con =DriverManager.getConnection(url,"root", "");
        ArrayList a1=new ArrayList();
        Statement st=con.createStatement();
        out.print("kinjal");
        String type=request.getParameter("t");
        String query=null;
             if(type.equalsIgnoreCase("Admin"))
            {
             query="select * from admin_Detail order by User_Name";
            }
            if(type.equalsIgnoreCase("Patient"))
            {
             query="select * from child_patient order by User_Name";    
            }
            if(type.equalsIgnoreCase("HealthcareProvider"))
            {
             query="select * from healthcare_provider_detail order by User_Name";
            }

         
        ResultSet rs= st.executeQuery(query);
        StringBuffer sb;

        while(rs.next())
        {
             sb=new StringBuffer();

            sb.append(rs.getString(1)+"$ "+rs.getString("User_Name"));
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
