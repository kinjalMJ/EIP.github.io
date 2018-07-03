package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newRegistration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("    <title></title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/layout.css\" type=\"text/css\" />\n");
      out.write("        <script language=\"javascript\">\n");
      out.write("          \n");
      out.write("        function f1()\n");
      out.write("        {\n");
      out.write("            \n");
      out.write("            window.open(\"AdminRegistration.jsp\",\"_self\");\n");
      out.write("        }\n");
      out.write("        function f2()\n");
      out.write("        {\n");
      out.write("            \n");
      out.write("            window.open(\"ModeratorRegistration.jsp\",\"_self\");\n");
      out.write("        }\n");
      out.write("        function f3()\n");
      out.write("        {\n");
      out.write("            \n");
      out.write("            window.open(\"AhealthcareProviderRegistration.jsp\",\"_self\");\n");
      out.write("        }\n");
      out.write("        function f4()\n");
      out.write("        {\n");
      out.write("            \n");
      out.write("            window.open(\"ApatientRegistration.jsp\",\"_self\");\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("        <body onload=\"return loadType();\">\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/adminMenu.jsp", out, false);
      out.write("\n");
      out.write("    \n");
      out.write("    <div class=\"wrapper col5\">\n");
      out.write("        <div id=\"container\">\n");
      out.write("            <div id=\"breadcrumb\">\n");
      out.write("                <p>Registration</p>\n");
      out.write("            </div>\n");
      out.write("                 \n");
      out.write("                 <div align=\"center\">\n");
      out.write("                 <table cellpadding=\"0\" cellspacing=\"5px\"  style=\"text-align:left\" height=\"200\" width=\"800\" border=\"0\">\n");
      out.write("                    <tr>\n");
      out.write("                   <td>   <input type=\"submit\" name=\"submit\" id=\"submit\" class=\"submitbtn\" value=\"Admin Registration\"  onclick=\"f1();\"/>\n");
      out.write("                    <td>   <input type=\"submit\" name=\"submit\" id=\"submit\" class=\"submitbtn\" value=\"Moderator Registration\"\"  onclick=\"f2();\"/>\n");
      out.write("                  \n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                    <td>   <input type=\"submit\" name=\"submit\" id=\"submit\" class=\"submitbtn\" value=\"Healthcare Provider Registration\"  onclick=\"f3();\"/>\n");
      out.write("                    \n");
      out.write("                  <!-- <td> <input  type=\"button\" value=\"Patient Registration\" onclick=\"f4();\" /></td>\n");
      out.write("                   <td><input  type=\"button\" value=\"Healthcare Provider Registration\"onclick=\"f3();\" /></td>\n");
      out.write("                 <td><input type=\"button\" value=\"Admin Registration\" onclick=\"f1();\"/></td>                   \n");
      out.write("                   <td><input  type=\"button\"   value=\"Moderator Registration\" onclick=\"f2();\" /></td>\n");
      out.write("                    \n");
      out.write("                  --> \n");
      out.write("                  <td>   <input type=\"submit\" name=\"submit\" id=\"submit\" class=\"submitbtn\" value=\"Patient Registration\"  onclick=\"f4();\"/>\n");
      out.write("                   </td>                    \n");
      out.write("                    </tr>\n");
      out.write("                    </table>\n");
      out.write("                  </div>\n");
      out.write("             </div>\n");
      out.write("        </div>\n");
      out.write("      </body>\n");
      out.write("      ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/FooterPage.jsp", out, false);
      out.write("\n");
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
