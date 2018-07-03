package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import logic.logicFunction;
import java.sql.*;

public final class vaccinationvnServletDB_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
  Connection con=null;
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
