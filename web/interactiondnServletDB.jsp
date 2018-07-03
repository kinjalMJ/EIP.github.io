<%@page import="java.util.ArrayList"%>
<%@page import="logic.logicFunction"%>
<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.* " %>

<%  Connection con=null;
    String query=null;    
    try
    {
        con=logicFunction.getConnection();
            
        ArrayList a1=new ArrayList();
         //ArrayList b1=new ArrayList();
        Statement st=con.createStatement();
        //String br=request.getParameter("b");
        
        query="select Drugs_Id,Drugs_Name from drugs ORDER by Drugs_Name";
        
        ResultSet rs= st.executeQuery(query);
        while(rs.next())
        {
              a1.add(rs.getString("Drugs_Id")+"$"+rs.getString("Drugs_Name"));
           //   a1.add(rs.getString("Drugs_Id"));
//            b1.add(rs.getString("username"));
           
        }
        out.println(a1);
    }
    catch(Exception e)
    {
        out.println(e);
    }

%>
