package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ForNewPassword_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>For New Password Page</title>\n");
      out.write("    </head>\n");
      out.write("    ");

 
       String uname="abc";//request.getParameter("Username").trim();
       String type="admin";//request.getParameter("Type").trim();
 
      out.write("\n");
      out.write(" \n");
      out.write("    <body>\n");
      out.write("        <form action=\"UpdateNewPassword\" id=\"form1\" name=\"formRe\" method=\"get\" >\n");
      out.write("            <h3>Reset your password</h3>\n");
      out.write("            <h2>Enter a new password for pooja.magichorse@gmail.com. We highly recommend you create a unique password - one that you don't use for any other websites.</h2>\n");
      out.write("            <h2>Note: You can't reuse your old password once you change it.</h2>\n");
      out.write("            <table cellpadding=\"10px\" cellspacing=\"0\" width=\"100%\"   >\n");
      out.write("                <tr>\n");
      out.write("                    <td><label for=\"url\"> New Password:</label> </td>\n");
      out.write("                    <td><input name=\"txtNewPass\" type=\"password\" id=\"ps\" class=\"input_field\" autocomplete=\"off\" placeholder=\"Enter your new password.\" required/><span class=\"Validation\">*</span></td>\n");
      out.write("                    <td><label name=\"txtPass\" id=\"txtPass\" style=\"color:red\"></label></td>                      \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><label for=\"url\"> Confirm Password:</label> </td>\n");
      out.write("                    <td><input name=\"txtComPass\" type=\"password\" id=\"rps\" class=\"input_field\" autocomplete=\"off\" placeholder=\"Re-Enter your new password.\" required/><span class=\"Validation\">*</span></td>\n");
      out.write("                    <td><label name=\"txtRpass\" id=\"txtRpass\" style=\"color:red\"></label> </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td>\n");
      out.write("                        <input style=\"font-weight: bold;\" type=\"submit\" class=\"submitbtn\"  id=\"submit\" value=\"Save\" />\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table> \n");
      out.write("            <input type=\"hidden\" name=\"hndUname\" id=\"hdnUname\" value=\"");
      out.print(uname);
      out.write("\"/>\n");
      out.write("            <input type=\"hidden\" name=\"hndType\" id=\"hdnType\" value=\"");
      out.print(type);
      out.write("\"/>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
