package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class parentInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title></title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/layout.css\" type=\"text/css\" />\n");
      out.write("    \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/adminMenu.jsp", out, false);
      out.write("\n");
      out.write("        <div class=\"wrapper col5\">\n");
      out.write("        <div id=\"container\">\n");
      out.write("            <div id=\"breadcrumb\">\n");
      out.write("                <p>Parent Infomation</p>\n");
      out.write("            </div>\n");
      out.write("            <form method=\"get\" action=\"\" id=\"form32\" name=\"formParentD\" >\n");
      out.write("                <div align=\"center\">\n");
      out.write("                <table cellpadding=\"0\" cellspacing=\"5px\"  style=\"text-align:left\" >\n");
      out.write("                    <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td><label>Patient Id:</label></td>\n");
      out.write("                        <td> <input type=\"text\" id=\"txtPatientId\" name=\"txtPatientId\" style=\"width:100% ;height: 25px\" autofocus required ></td>\n");
      out.write("                        <td></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td> <label for=\"author\">First Name:</label> </td>\n");
      out.write("                        <td> <input type=\"text\" id=\"txtFirstName\" name=\"txtFirstName\" style=\"width:100% ;height: 25px\" autofocus required ></td>\n");
      out.write("                        <td></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td><label for=\"author\">Last Name:</label></td>\n");
      out.write("                        <td><input type=\"text\" id=\"txtLastName\" name=\"txtLastName\" style=\"width:100% ;height: 25px\" required></td>\n");
      out.write("                        <td></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td><label for=\"author\">Age:</label></td>\n");
      out.write("                        <td><input type=\"numeric\" id=\"txtAge\" name=\"txtAge\" style=\"width:100% ;height: 25px\" required></td>\n");
      out.write("                        <td></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td><label for=\"author\">Relationship with child :</label></td>\n");
      out.write("                        <td><input type=\"text\" id=\"txtRWChild\" name=\"txtRWChild\" style=\"width:100% ;height: 25px\" required></td>\n");
      out.write("                        <td></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td><label>Blood Group: </label> </td>\n");
      out.write("                        <td><input type=\"text\" id=\"txtBloodGroup\" name=\"txtBloodGroup\"  style=\"width:100% ;height: 25px\" required></input></td>           \n");
      out.write("                        <td></td>\n");
      out.write("                   </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td><label>Contact Infomation: </label> </td>\n");
      out.write("                        <td><input type=\"text\" id=\"txtContactInfo\" name=\"txtContactInfo\"  style=\"width:100% ;height: 25px\" required></input></td>\n");
      out.write("                        <td></td>\n");
      out.write("                   </tr>\n");
      out.write("                   <tr>\n");
      out.write("                       <td></td>\n");
      out.write("                        <td><label>Contact No: </label> </td>\n");
      out.write("                        <td><input type=\"numeric\" id=\"txtContactNo\" name=\"txtContactNo\"  style=\"width:100% ;height: 25px\" required></input></td>\n");
      out.write("                        <td></td>\n");
      out.write("                   </tr>\n");
      out.write("                   <tr>\n");
      out.write("                        <td><span class=\"Validation\">*</span></td>\n");
      out.write("                        <td><label for=\"email\">Email:</label> </td>\n");
      out.write("                        <td><input type=\"email\" name=\"txtEmailId\" id=\"txtEmailId\" style=\"width:100% ;height: 25px\" required></td>\n");
      out.write("                        <td></td>\n");
      out.write("                   </tr>\n");
      out.write("                   <tr>\n");
      out.write("                       <td></td>\n");
      out.write("                        <td><label>Occupation: </label> </td>\n");
      out.write("                        <td><input type=\"text\" id=\"txtOccupation\" name=\"txtOccupation\"  style=\"width:100% ;height: 25px\" required></input></td>\n");
      out.write("                        <td></td>\n");
      out.write("                   </tr>\n");
      out.write("                   <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td colspan=\"2\">\n");
      out.write("                            <table>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td><input style=\"font-weight: bold;\" type=\"submit\" class=\"submitbtn\"  id=\"submit\" value=\"Submit\" /></td>\n");
      out.write("                                    <td><input type=\"button\" name=\"reset\" id=\"reset\" value=\"Reset\" class=\"submitbtn\" /></td>\n");
      out.write("                                </tr>\n");
      out.write("                            </table>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                </table> \n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </div> \n");
      out.write("  </body>\n");
      out.write("\n");
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
