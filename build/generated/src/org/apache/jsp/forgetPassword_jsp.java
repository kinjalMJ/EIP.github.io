package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class forgetPassword_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("    <head>\n");
      out.write("        <title> Immunization And Electronic Health Record </title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/layout.css\" type=\"text/css\"/>\n");
      out.write("        <link href=\"themes/6/js-image-slider.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"themes/6/mcVideoPlugin.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"themes/6/js-image-slider.js\" type=\"text/javascript\"></script>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"wrapper col1\">\n");
      out.write("            <div id=\"topbar\">\n");
      out.write("                <ul>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"Home.jsp\" class=\"current\"><span></span>Home</a></li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"AboutUs.jsp\"><span></span>About Us</a></li>               \n");
      out.write("                </ul>\n");
      out.write("                <br class=\"clear\" />\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"wrapper col2\">\n");
      out.write("            <div id=\"header\">\n");
      out.write("                <div class=\"fl_left\">\n");
      out.write("                    <table cellpadding=\"5px\" cellspacing=\"0\" border=\"0\">\n");
      out.write("                        <tr>\n");
      out.write("                            <td><a href=\"#\"><img src=\"images/Logo.png\" alt=\"logo\"/></a></td>\n");
      out.write("                            <td><h1><a href=\"#\">Immunize and</a></h1>\n");
      out.write("                                <p><h3>eHealthcare</h3></p></td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"fl_right\"></div>\n");
      out.write("                <br class=\"clear\"/>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"wrapper col3\">\n");
      out.write("            <div id=\"topnav\">\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>   \n");
      out.write("                            <div id=\"sliderFrame\">\n");
      out.write("                                <div id=\"slider\">\n");
      out.write("                                    <a href=\"#\">\n");
      out.write("                                    <img src=\"themes/images/image-slider-1.jpg\" alt=\"\"/>\n");
      out.write("                                    </a>\n");
      out.write("                                    <a href=\"#\">\n");
      out.write("                                        <img src=\"themes/images/image-slider-2.jpg\" alt=\"\"/>\n");
      out.write("                                    </a>\n");
      out.write("                                    <a href=\"#\">\n");
      out.write("                                        <img src=\"themes/images/image-slider-3.jpg\" alt=\"\"/>\n");
      out.write("                                    </a>\n");
      out.write("                                    <a href=\"#\">\n");
      out.write("                                        <img src=\"themes/images/image-slider-4.jpg\" alt=\"\" height=\"100\" width=\"1000\"/>\n");
      out.write("                                    </a>\n");
      out.write("                                    <a href=\"#\">\n");
      out.write("                                        <img src=\"themes/images/image-slider-5.jpg\" alt=\"\"/>\n");
      out.write("                                    </a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </td>\n");
      out.write("                        <td>  \n");
      out.write("                            <div>\n");
      out.write("                                <div id=\"forgetPassword\">\n");
      out.write("                                    <h2>Forget Password</h2>\n");
      out.write("                                    ");

                                        if(request.getParameter("err")!=null)
                                            out.println(request.getParameter("err"));
                                    
      out.write("\n");
      out.write("                                    <form method=\"get\" action=\"forgetPassword\" id=\"formFP\" name=\"formFP\">\n");
      out.write("                                        <fieldset id=\"inputs\">\n");
      out.write("                                                    <input id=\"un\" type=\"text\" class=\"username\" name=\"uname\" placeholder=\"Username\" autocomplete=\"off\" autofocus required>\n");
      out.write("                                                <!-- <input id=\"ps\" type=\"password\" class=\"password\" name=\"pass\" placeholder=\"Password\" required>\n");
      out.write("                                                --> <select id=\"type1\"  name=\"tp\" required>\n");
      out.write("                                                    <option value=\"admin\">Admin</option>\n");
      out.write("                                                    <option value=\"HealthcareProvider\">Healthcare Provider</option>\n");
      out.write("                                               \n");
      out.write("                                                    <option value=\"Patient\">Patient</option>\n");
      out.write("                            \n");
      out.write("                                                </select>\n");
      out.write("                                        </fieldset>               \n");
      out.write("                                        <fieldset id=\"actions\">\n");
      out.write("                                            <input type=\"submit\" name=\"submit\" id=\"submit\" class=\"submitbtn\" value=\"Sent Email\"/>\n");
      out.write("                                        </fieldset>\n");
      out.write("                                        <fieldset id=\"Mylink\">\n");
      out.write("                                            <a href=\"Home.jsp\">Back to LogIn</a> \n");
      out.write("                                        </fieldset>\n");
      out.write("                                    </form>\n");
      out.write("                                </div> \n");
      out.write("                            </div>\n");
      out.write("                        </td>                    \n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("                <br class=\"clear\" />\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"preLoaderDiv\">\n");
      out.write("                <img id=\"preloaderAnimation\" src=\"loading.gif\"/>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("            <div class=\"wrapper col6\">\n");
      out.write("                <div id=\"footer\">\n");
      out.write("                <center>\n");
      out.write("                <div class=\"footbox\">\n");
      out.write("                    <h2>Vaccination</h2>\n");
      out.write("                    <p> A vaccine is an antigenic preparation used to produce active immunity to a disease, in order to prevent or reduce the effects of infection by any natural or \"wild\" pathogen.</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"footbox\">\n");
      out.write("                    <h2>Our Programs</h2>\n");
      out.write("                    <p>\"Programs\" Includes Immunization information, Chronic Disease and Health Promotion, Family Health checkup and Environmental Health.</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"footbox\">\n");
      out.write("                    <h2>Our Services</h2>\n");
      out.write("                    <p>\"Services\" provides information on clinical, preventive, and outreach work; training for consumers and business partners, work we do with other governmental entities, professionals, and advisory boards.</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"footbox\">\n");
      out.write("                    <h2>Health Records</h2>\n");
      out.write("                    <p> Health Information\" provides a variety of topics such as specific diseases and conditions, family health, environmental health, and workplace health records and safety.</p>\n");
      out.write("                </div>\n");
      out.write("                <br class=\"clear\"/>\n");
      out.write("                </center>\n");
      out.write("            </div>\n");
      out.write("        </div>                               \n");
      out.write("\n");
      out.write("        <div class=\"wrapper col7\">\n");
      out.write("            <div id=\"copyright\">\n");
      out.write("                <p class=\"fl_left\">Copyright &copy; 2015 - All Rights Reserved - \n");
      out.write("                <a href=\"www.ImmunizeYourBaby.co.in\">ImmunizeYourBaby.co.in</a></p>\n");
      out.write("                <br class=\"clear\"/>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("                <div id=\"bottom\"></div>\n");
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
