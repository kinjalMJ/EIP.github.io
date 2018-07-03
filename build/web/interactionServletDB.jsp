<%@page import="java.util.ArrayList"%>
<%@page import="logic.logicFunction"%>
<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.* " %>

<%  Connection con=null;
    String query=null;    
    try
    {
        con=logicFunction.getConnection();
            
        ArrayList a1=new ArrayList();
//        ArrayList b1=new ArrayList();
        Statement st=con.createStatement();
        //String br=request.getParameter("b");
        
        query="select Vaccine_Id,Vaccine_Name from Vaccine ORDER by Vaccine_Name";//"select * from student where branch='"+br+"'";
        
        ResultSet rs= st.executeQuery(query);
        while(rs.next())
        {
            a1.add(rs.getString("Vaccine_Id")+"$"+rs.getString("Vaccine_Name"));
//            b1.add(rs.getString("username"));
           
        }
        out.println(a1);
    }
    catch(Exception e)
    {
        out.println(e);
    }

%>
