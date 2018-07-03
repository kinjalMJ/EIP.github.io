
<%@page import="logic.logicFunction"%>
<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.*,java.sql.*,java.text.SimpleDateFormat;"%>
<%
    String url ;
    Connection con=null;
    Statement stmn1=null;
    ResultSet rs= null,rs1=null;
    ArrayList al= new ArrayList();
    try
    { 
            String bday="",patientGender="",id="7";
          //  String uname=session.getAttribute("UserName").toString();
            //System.out.println("UserName :"+uname);
            con=logicFunction.getConnection();
            
            stmn1=con.createStatement();
            PreparedStatement ps = null;
            
            String q="select gender,Birth_Date from child_patient where Patient_Id=7";
            rs1=stmn1.executeQuery(q);
            while(rs1.next())
            {
                bday=rs1.getObject("Birth_Date").toString();
                patientGender=rs1.getObject("gender").toString();
                //id =rs1.getObject("Patient_No").toString();
            }
           // String q1="select * from vaccine_dose as vd inner join vaccine as v  on v.Vaccine_Id=vd.Vaccine_Id where v.For_Whom='"+patientGender+"' or v.For_Whom='both' order by v.Vaccine_Name ,vd.Age_Range";
            
           String q1="select vvd.Vaccine_Name,vvd.Vaccine_Id,vvd.Vaccine_Dose_Id,vvd.No_Of_Dose,vr.Vaccination_Date,vvd.Age_Range from (select vd.vaccine_Id,vd.vaccine_dose_id,vd.Age_range,v.Vaccine_name,v.No_Of_dose from vaccine_dose as vd inner join vaccine as v  on v.Vaccine_Id=vd.Vaccine_Id where v.For_Whom='"+patientGender+"' or v.For_Whom='both' )as vvd left join vaccination_record as vr on vr.Vaccine_Id= vvd.Vaccine_Id and vr.Vaccine_Dose_Id= vvd.Vaccine_Dose_Id and vr.Patient_id="+id+" order by vvd.Vaccine_Name,vvd.Age_Range";
            ps = con.prepareStatement(q1);
            rs=ps.executeQuery(q1);
          //  bday="25-Nov-1996";
            while(rs.next())
            {
                out.println("in while of insert");
                int doseId=rs.getInt("Vaccine_Dose_Id");
                System.out.println(doseId);
                int age=rs.getInt("Age_Range");
                System.out.println(age);
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                java.util.Date convertedCurrentDate = sdf.parse(bday);
                convertedCurrentDate.setMonth((convertedCurrentDate.getMonth() - 1 + age) % 12 + 1);
                System.out.println(convertedCurrentDate);
                String reportDate = sdf.format(convertedCurrentDate);
                al.add(rs.getString("Vaccine_Name")+"$"+rs.getInt("Vaccine_Dose_Id")+"#"+reportDate+"@"+rs.getString("Vaccination_Date")+"*"+rs.getInt("No_Of_Dose"));
            }
            /*String q ="SELECT v.Vaccine_Name, vc.Vaccine_Dose_Id,vc.Date,v.No_Of_Dose from vaccination_chart_for_child as vc INNER JOIN child_patient as cp ON vc.Patient_No=cp.Patient_No and cp.Patient_User_Name='"+uname+"'inner join vaccine_dose vd on vc.Vaccine_Dose_Id=vd.Vaccine_Dose_Id inner join vaccine as v on v.Vaccine_Id=vd.Vaccine_Id order by Vaccine_Name";
            rs=stmn1.executeQuery(q);
            while(rs.next())
            {
                al.add(rs.getString("Vaccine_Name")+"$"+rs.getInt("Vaccine_Dose_Id")+"#"+rs.getString("Date")+"*"+rs.getInt("No_Of_Dose"));
            }*/
            out.println(al);
            System.out.println("vaccine Data"+al);
    }
    catch(Exception e)
    {
        out.println(e);
    }
    finally
    {
        try
        {
            con.close();
        }
        catch(Exception e)
        {
        }
    }
%>