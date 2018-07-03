package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reportUpload_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Vaccine Form</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/layout.css\" type=\"text/css\" />\n");
      out.write("        <script language=\"javascript\" type=\"text/javascript\" src=\"js/FunctionJS.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/adminMenu.jsp", out, false);
      out.write("\n");
      out.write("    <div class=\"wrapper col5\">\n");
      out.write("    <div id=\"container\"> \n");
      out.write("        <div id=\"breadcrumb\">\n");
      out.write("                <p>ReportUpload</p>\n");
      out.write("        </div>\n");
      out.write("    <form method=\"get\" action=\"reportUpload\" id=\"form1\" name=\"formRe\" >\n");
      out.write("    <div align=\"center\">\n");
      out.write("    <table cellpadding=\"0\" cellspacing=\"7px\"  style=\"text-align:left\"> \n");
      out.write("    <tr>\n");
      out.write("    <label  style=\"color:red\" id=\"error\"></label>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("          <td>\n");
      out.write("              <span class=\"Validation\">*</span></td> \n");
      out.write("              <td><label for=\"author\">User Id:</label> </td>\n");
      out.write("              <td><input type=\"text\" id=\"txtuserId\" name=\"txtuserId\"  style=\"width: 180px\" placeholder=\"Enter User Id.\" required onblur=\" return duplicatevaccine();\"></td>\n");
      out.write("              <td><label id=\"error\" style=\"color:red\"></label></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("         <td>\n");
      out.write("             <span class=\"Validation\">*</span></td> \n");
      out.write("         <td><label for=\"author\">User Name:</label> </td>\n");
      out.write("         <td><input type=\"text\" id=\"txtvaccineName\" name=\"txtvaccineName\"  style=\"width: 180px\" placeholder=\"Enter Vaccine Name.\" required onblur=\" return duplicatevaccine();\"></td>\n");
      out.write("         <td><label id=\"error\" style=\"color:red\"></label></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td>\n");
      out.write("            <span class=\"Validation\">*</span></td>\n");
      out.write("        <td><label for=\"url\">Description:</label> </td>\n");
      out.write("        <td><textarea id=\"txtDecId\" name=\"txtdec\"></textarea></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>`\n");
      out.write("        <td><span class=\"Validation\">*</span></td>\n");
      out.write("        <td><label for=\"url\">For Whom(gender):</label> </td>\n");
      out.write("        <td colspan=\"3\">\n");
      out.write("    <table>\n");
      out.write("        <tr><td><input type=\"radio\" name=\"gender\"  value=\"male\"> Male</td>\n");
      out.write("            <td><input type=\"radio\" name=\"gender\"  value=\"female\"> Female</td>\n");
      out.write("            <td><input type=\"radio\" name=\"gender\"  value=\"both\"> Both</td>\n");
      out.write("        </tr>\n");
      out.write("    </table>\n");
      out.write("        </td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td><span class=\"Validation\">*</span></td>\n");
      out.write("        <td><label for=\"url\">Vaccine Type:</label> </td>\n");
      out.write("        <td colspan=\"2\">\n");
      out.write("            <table>\n");
      out.write("                <tr><td><input type=\"radio\" name=\"vaccineType\"  value=\"Injection\"> Injection</td>\n");
      out.write("                    <td><input type=\"radio\" name=\"vaccineType\"  value=\"Drop\"> Drop</td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td><span class=\"Validation\">*</span></td>\n");
      out.write("        <td><label for=\"url\">Select Vaccine category:</label> </td>\n");
      out.write("        <td colspan=\"2\">\n");
      out.write("            <table>\n");
      out.write("                <tr><td><input type=\"radio\" name=\"rs\" value=\"Routine\" > Routine</td>\n");
      out.write("                    <td><input type=\"radio\" name=\"rs\" value=\"Special\" > Special</td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td><span class=\"Validation\">*</span></td>\n");
      out.write("        <td><label for=\"url\">No Of Dose:</label> </td>\n");
      out.write("        <td><input type=\"number\" name=\"noofDose\"  id=\"noOfDose\"  style=\"width: 180px\" onblur=\"doseTable();\" placeholder=\"Enter no of Dose.\" min=\"1\" required></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td colspan=\"3\"><table id=\"tableid\" border =\"1\"></table></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("    <td></td>\n");
      out.write("    <td></td>\n");
      out.write("    <td>\n");
      out.write("    <table>\n");
      out.write("        <tr>\n");
      out.write("            <td><input style=\"font-weight: bold;\" type=\"submit\" class=\"submitbtn\"  id=\"submit\" value=\"Save\" /></td>\n");
      out.write("        </tr>\n");
      out.write("    </table>\n");
      out.write("    </td>\n");
      out.write("    </tr>\n");
      out.write("    </table> \n");
      out.write("    </div>\n");
      out.write("    </form>\n");
      out.write("    </div>\n");
      out.write("    </div> \n");
      out.write("    </body>\n");
      out.write("    </html>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/FooterPage.jsp", out, false);
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
