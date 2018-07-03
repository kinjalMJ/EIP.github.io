package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class HeaderPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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

 System.out.println("######");
    String name="";
    String photo="";
    if(session.getAttribute("user")!=null){
        name=session.getAttribute("user").toString();
        photo=session.getAttribute("photo").toString();}
    else
               {
        
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");

        }

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title></title>\n");
      out.write("        <script type='text/javascript' src='js/logging.js'></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/layout.css\" type=\"text/css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"wrapper col1\">\n");
      out.write("            <div id=\"topbar\">\n");
      out.write("                <p>WelCome : ");
      out.print(name);
      out.write("</p>\n");
      out.write("                <ul>\n");
      out.write("                    <li class=\"current\">\n");
      out.write("                        <a href=\"Home.jsp\"><span></span>Logout</a></li>\n");
      out.write("                     \n");
      out.write("                </ul>\n");
      out.write("                <br class=\"clear\"/>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"wrapper col2\">\n");
      out.write("            <div id=\"header\">\n");
      out.write("                <div class=\"fl_left\">\n");
      out.write("                    <table cellpadding=\"5px\" cellspacing=\"0\" border=\"0\">\n");
      out.write("                        <tr>\n");
      out.write("                            <td><a href=\"#\"><img src=\"images/Logo.png\" alt=\"logo\" /></a></td>\n");
      out.write("                            <td><h1><a href=\"#\">Immunize and</a></h1><p><h3>eHealthcare</h3></p></td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"fl_right\" align=\"Right\" > \n");
      out.write("                <img src=\"Profile/");
      out.print(photo);
      out.write("\"height=\"100\" width=\"100\" alt=\"Image\" ></img></div>\n");
      out.write("                <br class=\"clear\" />\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("       \n");
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
