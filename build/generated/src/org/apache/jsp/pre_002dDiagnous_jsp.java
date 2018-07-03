package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pre_002dDiagnous_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    ");

    String patientName="";
    if(request.getParameter("patientName")!=null)
            patientName=request.getParameter("patientName");
     String doseId="";
    if(request.getParameter("txtdoseid")!=null)
            doseId=request.getParameter("txtdoseid");
      String vId="";
    if(request.getParameter("txtvaccineid")!=null)
            vId=request.getParameter("txtvaccineid");
      String patientId=""; 
    if(request.getParameter("txtpid")!=null)
            patientId=request.getParameter("txtpid");
   //  out.println("@@@@@@@@@@@"+pid);
  
    
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/adminMenu.jsp", out, false);
      out.write("\n");
      out.write("        <div class=\"wrapper col5\">\n");
      out.write("        <div id=\"container\">\n");
      out.write("            <div id=\"breadcrumb\">\n");
      out.write("                <p>Pre-Diagnose</p>\n");
      out.write("            </div>\n");
      out.write("            <div align=\"Center\">\n");
      out.write("                <form method=\"get\" action=\"preDiagnous\" id=\"form66\" name=\"formPD\">\n");
      out.write("                <table cellpadding=\"0\" cellspacing=\"5px\"  style=\"text-align:left\" >\n");
      out.write("                    <tr><td>\n");
      out.write("                        <input type=\"hidden\" name=\"txtvaccineid\" value=\"");
      out.print(vId);
      out.write("\">\n");
      out.write("                        </td>\n");
      out.write("                        <td><input type=\"hidden\" name=\"txtdoseid\" value=\"");
      out.print(doseId);
      out.write("\">\n");
      out.write("                        </td>\n");
      out.write("                         <td><input type=\"hidden\" name=\"txtpid\" value=\"");
      out.print(patientId);
      out.write("\">\n");
      out.write("                        </td>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td> <label for=\"author\">Patient Name:</label> </td>\n");
      out.write("                        <td>");
      out.print(patientName);
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td><label>Date: </label> </td>\n");
      out.write("                        <td><input type=\"Date\" id=\"txtDate\" name=\"txtDate\" style=\"width:100% ;height: 25px\" required></input></td>           \n");
      out.write("                        <td></td>\n");
      out.write("                   </tr> \n");
      out.write("                    <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td><label>Weight: </label> </td>\n");
      out.write("                        <td><input type=\"text\" id=\"txtWeight\" name=\"txtWeight\"  style=\"width:100% ;height: 25px\" required></input></td>           \n");
      out.write("                        <td></td>\n");
      out.write("                   </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td><label>Height: </label> </td>\n");
      out.write("                        <td><input type=\"text\" id=\"txtHeight\" name=\"txtHeight\"  style=\"width:100% ;height: 25px\" required></input></td>           \n");
      out.write("                        <td></td>\n");
      out.write("                   </tr>\n");
      out.write("                   \n");
      out.write("                   <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td><label>HeartBit: </label> </td>\n");
      out.write("                        <td><input type=\"text\" id=\"txtHeartBit\" name=\"txtHeartBit\" style=\"width:100% ;height: 25px\" required></input></td>           \n");
      out.write("                        <td></td>\n");
      out.write("                   </tr> \n");
      out.write("                   <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td><label>Description: </label> </td>\n");
      out.write("                        <td><input type=\"text\" id=\"txtDescription\" name=\"txtDescription\" style=\"width:100% ;height: 25px\" required></input></td>           \n");
      out.write("                        <td></td>\n");
      out.write("                   </tr>\n");
      out.write("                   <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td colspan=\"4\">\n");
      out.write("                            <table>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td><input style=\"font-weight: bold;\" type=\"submit\" class=\"submitbtn\"  id=\"submit\" value=\"Submit\" /></td>\n");
      out.write("                                </tr>\n");
      out.write("                            </table>\n");
      out.write("                        </td>\n");
      out.write("                        <td></td>\n");
      out.write("                    </tr>\n");
      out.write("                </table> \n");
      out.write("                </div>\n");
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
