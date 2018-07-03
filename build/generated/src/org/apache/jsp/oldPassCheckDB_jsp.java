package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import logic.logicFunction;
import java.sql.*;
import javax.servlet.http.HttpSession;

public final class oldPassCheckDB_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" \n");

Connection con=null;
    String query=null;          
    HttpSession s1=request.getSession(false);
    String type= s1.getAttribute("Type").toString();
    String uname=s1.getAttribute("user").toString();
               
      
    try
    {
        con=logicFunction.getConnection();
        ArrayList a1=new ArrayList();
        String op=request.getParameter("op");
        if(type.equalsIgnoreCase("admin"))
            {
            query="select Password from admin_detail where User_Name='"+uname.trim()+"' and password='"+op+"'";
            }
         if(type.equalsIgnoreCase("Patient"))
            {
            query="select Password from child_patient where User_Name='"+uname.trim()+"'";
            }
         if(type.equalsIgnoreCase("HealthcareProvider"))
            {
            query="select Password from healthcare_provider_detail where User_Name='"+uname.trim()+"'";
            }
        Statement st=con.createStatement();
            
        ResultSet rs= st.executeQuery(query);
        if(rs.next())
        {
       //String Pass= rs.getString("Password"); 
            
                       }
        else
                       {
            out.println("Re-enter your old Password.");}                                
       
    }
    catch(Exception e)
    {
        out.println(e);
    }

      out.write('\n');
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
