package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;

public final class viewTask_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("         ");
 
         ArrayList a1=new ArrayList();
         String tid="",tnm="",td="",tdes="",uid="",type="";
         if(request.getAttribute("data")!=null)
        {
           a1= (ArrayList)request.getAttribute("data");
           //out.println(a1);
           tid= a1.get(0).toString();
           tnm= a1.get(1).toString();
           td= a1.get(2).toString();
           tdes= a1.get(3).toString();
           uid=a1.get(4).toString();
           type= a1.get(5).toString();
           
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
      out.write("                <p>Your Task</p>\n");
      out.write("            </div>\n");
      out.write("            <form method=\"get\" action=\"discardTask\" id=\"form76\" name=\"formVP\">\n");
      out.write("            <div align=\"center\">\n");
      out.write("            <table cellpadding=\"0\" cellspacing=\"5px\"  style=\"text-align:left\" >\n");
      out.write("                <tr>\n");
      out.write("                    <td><input type=\"hidden\" value=\"");
      out.print(tid);
      out.write("\" id=\"tid\" name=\"tid\"></td>\n");
      out.write("                </tr>\n");
      out.write("                  <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td> <label for=\"author\">Task Id:</label> </td> \n");
      out.write("                        <td> <label for=\"author\">");
      out.print(tid);
      out.write("</label> </td>\n");
      out.write("                        <td></td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td> <label for=\"author\">Task Name:</label> </td> \n");
      out.write("                        <td> <label for=\"author\">");
      out.print(tnm);
      out.write("</label> </td>\n");
      out.write("                        <td></td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td> <label for=\"author\">Task Date:</label> </td> \n");
      out.write("                        <td> <label for=\"author\">");
      out.print(td);
      out.write("</label> </td>\n");
      out.write("                        <td></td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td> <label for=\"author\">Description:</label> </td> \n");
      out.write("                        <td> <label for=\"author\">");
      out.print(tdes);
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
      out.write("                        <td></td>\n");
      out.write("                        <td> <label for=\"author\">User Type:</label> </td> \n");
      out.write("                        <td> <label for=\"author\">");
      out.print(type);
      out.write("</label> </td>\n");
      out.write("                        <td></td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr><td>&nbsp;</td>\n");
      out.write("                      <td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td>\n");
      out.write("                      <td>&nbsp;</td>\n");
      out.write("                      <td>&nbsp;</td><td>&nbsp;</td>\n");
      out.write("                      <td></td></tr>\n");
      out.write("            </table>\n");
      out.write("                        <div align=\"center\">\n");
      out.write("                      <input type =\"submit\" class=\"Back\" id=\"Back\" value=\"Back\" style=\"font-weight: bold;\">\n");
      out.write("                          <a href=\"discardTask\"><input type =\"submit\" class=\"Discard\" id=\"Discard\" value=\"Discard\" style=\"font-weight: bold;\"></a>\n");
      out.write("                 \n");
      out.write("                        </div>\n");
      out.write("        </div>          \n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        </div> \n");
      out.write("    </body>\n");
      out.write("     ");
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
