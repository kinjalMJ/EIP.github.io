package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;

public final class viewVDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/HeaderPage.jsp", out, false);
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title></title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/layout.css\" type=\"text/css\" />\n");
      out.write("         ");
 
         ArrayList a1=new ArrayList();
         String vid="",did="",pid="",vdate="",weight="",height="",pulses="",des="",uid="";
         if(request.getAttribute("data")!=null)
        {
           a1= (ArrayList)request.getAttribute("data");
           //out.println(a1);
          pid= a1.get(0).toString();
           did= a1.get(1).toString();
           vid= a1.get(2).toString();
          
           vdate= a1.get(3).toString();
           weight= a1.get(4).toString();
           height=a1.get(5).toString();
           pulses= a1.get(6).toString();
           des= a1.get(7).toString();
           uid=a1.get(8).toString();
           }
        
    
      out.write("\n");
      out.write("   \n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
 
      
        if(request.getAttribute("data")!=null)   
            a1=(ArrayList) request.getAttribute("data");
        //out.println(a1);
     
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/adminMenu.jsp", out, false);
      out.write("\n");
      out.write("        <div class=\"wrapper col5\">\n");
      out.write("        <div id=\"container\">\n");
      out.write("            <div id=\"breadcrumb\">\n");
      out.write("                <p>Your Profile</p>\n");
      out.write("            </div>\n");
      out.write("            <form method=\"get\" action=\"vaccination.jsp\" id=\"form76\" name=\"formVP\" >\n");
      out.write("            <div align=\"center\">\n");
      out.write("            <table cellpadding=\"0\" cellspacing=\"5px\"  style=\"text-align:left\" >\n");
      out.write("               \n");
      out.write("                  <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td> <label for=\"author\">Vaacine Id:</label> </td> \n");
      out.write("                        <td> <label for=\"author\">");
      out.print(vid);
      out.write("</label> </td>\n");
      out.write("                        <td></td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td> <label for=\"author\">Vaccine Dose Id:</label> </td> \n");
      out.write("                        <td> <label for=\"author\">");
      out.print(did);
      out.write("</label> </td>\n");
      out.write("                        <td></td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td> <label for=\"author\">Patient Id:</label> </td> \n");
      out.write("                        <td> <label for=\"author\">");
      out.print(pid);
      out.write("</label> </td>\n");
      out.write("                        <td></td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td> <label for=\"author\">Vaccination Date:</label> </td> \n");
      out.write("                        <td> <label for=\"author\">");
      out.print(vdate);
      out.write("</label> </td>\n");
      out.write("                        <td></td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td> <label for=\"author\">Weight:</label> </td> \n");
      out.write("                        <td> <label for=\"author\">");
      out.print(weight);
      out.write("</label> </td>\n");
      out.write("                        <td></td>\n");
      out.write("                  </tr>\n");
      out.write("                  \n");
      out.write("                  <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td> <label for=\"author\">Height:</label> </td> \n");
      out.write("                        <td> <label for=\"author\">");
      out.print(height);
      out.write("</label> </td>\n");
      out.write("                        <td></td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td> <label for=\"author\">Pulses:</label> </td> \n");
      out.write("                        <td> <label for=\"author\">");
      out.print(pulses);
      out.write("</label> </td>\n");
      out.write("                        <td></td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td> <label for=\"author\">Description:</label> </td> \n");
      out.write("                        <td> <label for=\"author\">");
      out.print(des);
      out.write("</label> </td>\n");
      out.write("                        <td></td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td> <label for=\"author\">User Id:</label> </td> \n");
      out.write("                        <td> <label for=\"author\">");
      out.print(uid);
      out.write("</label> </td>\n");
      out.write("                        <td></td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                      <td><a href=\"vaccination.jsp?patientId=");
      out.print(pid);
      out.write("\">Back</a></td>\n");
      out.write("                     \n");
      out.write("                  </tr>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
