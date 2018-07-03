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
        
        query="select Patient_Id,User_Name from child_patient ORDER by User_Name";
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
