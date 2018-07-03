<%-- 
    Document   : vaccinationvnServletDB
    Created on : 4 Mar, 2015, 2:20:33 PM
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
        
        String pid=logicFunction.checkRequestNull(request, "data"); 
       // query="select v.Vaccine_Id,vd.Vaccine_Dose_Id,v.vaccine_name,v.no_of_dose,v.for_whom,vd.age_range "
         //       + " from vaccine v left outer join vaccine_Dose vd on v.Vaccine_Id=vd.Vaccine_Id order by vaccine_name, Vaccine_Dose_Id";
        
        query="select v.Vaccine_Id,vd.Vaccine_Dose_Id,v.vaccine_name,v.no_of_dose,v.for_whom,vd.age_range,vr.Patient_Id "+
                " from vaccine v inner join vaccine_Dose vd on v.Vaccine_Id=vd.Vaccine_Id "+
                " left outer join vaccination_record vr on vr.Vaccine_Dose_Id=vd.Vaccine_Dose_Id and vr.Patient_Id="+pid+
                " order by vaccine_name, Vaccine_Dose_Id ";
        
        ResultSet rs= st.executeQuery(query);
        StringBuffer sb;

        while(rs.next())
        {
           // sb=new StringBuffer();
            
           
                a1.add(rs.getString("vaccine_name")+"$ "+rs.getString("Vaccine_Id")+"$"+rs.getString("Vaccine_Dose_Id")+"$"+rs.getString("Patient_Id")+"$"+rs.getString("age_range")) ;
            
            
        }
          //  request.setAttribute("data", a1);
            out.println(a1);         //  out.println("kinjal");
    }
    catch(Exception e)
    {
        out.println(e);
    }

%>