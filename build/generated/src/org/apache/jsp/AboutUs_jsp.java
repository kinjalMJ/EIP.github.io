package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AboutUs_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("    <title></title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/layout.css\" type=\"text/css\" />\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("        <div class=\"wrapper col1\">\n");
      out.write("            <div id=\"topbar\">\n");
      out.write("                <ul>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"Home.jsp\" class=\"current\"><span></span>Home</a></li>\n");
      out.write("                    <li><a href=\"AboutUs.jsp\"><span></span>About Us</a></li>         \n");
      out.write("                    <li><a href=\"VISHome.jsp\"><span></span>VIS</a></li>\n");
      out.write("                    <li><a href=\"Contact.jsp\"><span></span>Contact</a></li>\n");
      out.write("                </ul>\n");
      out.write("                <br class=\"clear\" />\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"wrapper col2\">\n");
      out.write("            <div id=\"header\">\n");
      out.write("                <div class=\"fl_left\">\n");
      out.write("                    <table cellpadding=\"5px\" cellspacing=\"0\" border=\"0\"   >\n");
      out.write("                        <tr>\n");
      out.write("                            <td><a href=\"#\"><img src=\"images/Logo.png\" alt=\"logo\" /></a></td>\n");
      out.write("                            <td><h1><a href=\"#\">Immunize and</a></h1><p><h3>eHealthcare</h3></p></td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"fl_right\"></div>\n");
      out.write("                <br class=\"clear\" />\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("\t            <br/>\n");
      out.write("       <div id=\"sliderFrame\">\n");
      out.write("        <div id=\"slider\">\n");
      out.write("            <a href=\"#\">\n");
      out.write("                <img src=\"Slider/Big Slider/1.jpg\" alt=\"Welcome \"/>\n");
      out.write("            </a>\n");
      out.write("            <a href=\"#\">\n");
      out.write("                <img src=\"Slider/Big Slider/2.jpg\" alt=\"Welcome \"/>\n");
      out.write("            </a>\n");
      out.write("            <a href=\"#\">\n");
      out.write("                <img src=\"Slider/Big Slider/3.jpg\" alt=\"Welcome \" />\n");
      out.write("            </a>\n");
      out.write("            <a href=\"#\">\n");
      out.write("                <img src=\"Slider/Big Slider/4.jpg\" alt=\"Welcome \" />\n");
      out.write("            </a>\n");
      out.write("            <a href=\"#\">\n");
      out.write("                <img src=\"Slider/Big Slider/5.jpg\" alt=\"Welcome \" />\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("    </div> \n");
      out.write("             <br/>\n");
      out.write("            <div class=\"wrapper col5\">\n");
      out.write("        <div id=\"container\">\n");
      out.write("            \n");
      out.write("        <label class=\"lblFormHeader\" >About Us</label> \n");
      out.write("<hr />\n");
      out.write("    <h3>Our Services:</h3>\n");
      out.write("    <p>Land Transport:<br />\n");
      out.write("    Dedicated to safe and reliable transport, \n");
      out.write("    Provides a comprehensive distribution and delivery network.</p>  \n");
      out.write("      \n");
      out.write("                    <h2>Our Programs</h2>\n");
      out.write("                    <p>\"Programs\" Includes Immunization information, Chronic Disease and Health Promotion, Family Health checkup and Environmental Health.</p>\n");
      out.write("                    <h2>Our Services</h2>\n");
      out.write("                    <p>\"Services\" provides information on clinical, preventive, and outreach work; training for consumers and business partners, work we do with other governmental entities, professionals, and advisory boards.</p>\n");
      out.write("                    <h2>Health Records</h2>\n");
      out.write("                    <p>Health Information\" provides a variety of topics such as specific diseases and conditions, family health, environmental health, and workplace health records and safety.</p>\n");
      out.write("                    <br class=\"clear\" />\n");
      out.write("                </div>\n");
      out.write("                </div> \n");
      out.write("\n");
      out.write("             <div class=\"wrapper col7\">\n");
      out.write("             <div id=\"copyright\">\n");
      out.write("                <p class=\"fl_left\">Copyright &copy; 2015 - All Rights Reserved - <a href=\"www.ImmunizeYourBaby.co.in\">ImmunizeYourBaby.co.in</a></p>\n");
      out.write("                <br class=\"clear\" />\n");
      out.write("             </div>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"bottom\"></div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("    ");
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
