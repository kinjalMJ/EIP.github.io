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
        String query="select * from child_patient";
        
        ResultSet rs= st.executeQuery(query);
        while(rs.next())
        {
            a1.add(rs.getString("Patient_Id")+"$"+rs.getString("User_Name"));
        }
        out.println(a1);
    }
    catch(Exception e)
    {
        out.println(e);
    }

%>
