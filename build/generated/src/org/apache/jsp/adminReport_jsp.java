package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminReport_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/HeaderPage.jsp", out, false);
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/layout.css\" type=\"text/css\" />\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("  \n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/adminMenu.jsp", out, false);
      out.write("\n");
      out.write("        <div class=\"wrapper col5\">\n");
      out.write("        <div id=\"container\">\n");
      out.write("            <div id=\"breadcrumb\">\n");
      out.write("                <p>Admin Reports</p>\n");
      out.write("            </div>\n");
      out.write("            <div align=\"Center\">\n");
      out.write("                <form method=\"get\" action=\"\" id=\"form66\" name=\"formAR\">\n");
      out.write("                <table border=\"2\" cellpadding=\"0\" cellspacing=\"5px\" height=\"400\" width=\"400\"  style=\"text-align:left\" >\n");
      out.write("                    <thead>\n");
      out.write("                    <th>Sr. No</th>\n");
      out.write("                <th>Reports</th>   \n");
      out.write("                </thead>\n");
      out.write("                <tbody>  \n");
      out.write("                    <tr><td>1</td>\n");
      out.write("                        <td><a href=\"adminReportCall.jsp\" target=\"blank\">Admin List</a></td></tr>\n");
      out.write("                    <tr><td>2</td>\n");
      out.write("                        <td><a href=\"patientNameCall.jsp\" target=\"blank\">Patient List</a></td></tr>\n");
      out.write("                    <tr><td>3</td>\n");
      out.write("                        <td><a href=\"DeletedPatientCall.jsp\" target=\"blank\">Deleted Patient List</a></td></tr>\n");
      out.write("                    <tr><td>4</td>\n");
      out.write("                        <td><a href=\"AllVaccineCall.jsp\" target=\"blank\">Vaccine List</a></td></tr>\n");
      out.write("                    <tr><td>5</td>\n");
      out.write("                        <td><a href=\"getName.jsp\" target=\"blank\">Search Patient Detail By Name</a></td></tr>\n");
      out.write("                    <tr><td>6</td>\n");
      out.write("                        <td><a href=\"getHcare.jsp\" target=\"blank\">Search Doctor Detail By UserName</a> </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr><td>6</td>\n");
      out.write("                        <td><a href=\"deleteVaccineCall.jsp\" target=\"blank\">Deleted Vaccine List</a></td></tr>\n");
      out.write("                    <tr><td>7</td>\n");
      out.write("                        <td><a href=\"AllDrugCall.jsp\" target=\"blank\">Drug List</a></td></tr>\n");
      out.write("                    <tr><td>8</td>\n");
      out.write("                        <td><a href=\"deletedrugCall.jsp\" target=\"blank\">Deleted Drug List</a></td></tr>\n");
      out.write("                </tbody>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </div> \n");
      out.write("  </body>\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/FooterPage.jsp", out, false);
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
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
