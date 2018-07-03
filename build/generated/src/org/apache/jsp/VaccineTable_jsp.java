package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import logic.logicFunction;
import java.util.*;
import java.sql.*;
import java.text.SimpleDateFormat;;

public final class VaccineTable_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");

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

    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
