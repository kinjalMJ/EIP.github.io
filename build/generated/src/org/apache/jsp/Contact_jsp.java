package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Contact_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("    <head>\n");
      out.write("          <title></title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/layout.css\" type=\"text/css\" />\n");
      out.write("    <script language=\"javascript\" type=\"text/javascript\" src=\"js/FunctionJS.js\"> </script>\n");
      out.write("     <script type=\"text/javascript\" src=\"http://maps.googleapis.com/maps/api/js?sensor=false\"></script>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("        var map;\n");
      out.write("        function initialize() {\n");
      out.write("            var latlng = new google.maps.LatLng(23.189786000000000000, 72.6369220999999990000);\n");
      out.write("            var myOptions = {\n");
      out.write("                zoom: 16,\n");
      out.write("                center: latlng,\n");
      out.write("                mapTypeId: google.maps.MapTypeId.ROADMAP\n");
      out.write("            };\n");
      out.write("            map = new google.maps.Map(document.getElementById(\"map\"), myOptions);\n");
      out.write("            var marker = new google.maps.Marker\n");
      out.write("                                                    (\n");
      out.write("                                                        {\n");
      out.write("                                                            position: new google.maps.LatLng(23.189786000000000000, 72.6369220999999990000),\n");
      out.write("                                                            map: map,\n");
      out.write("                                                            title: 'Click me'\n");
      out.write("\n");
      out.write("                                                        }\n");
      out.write("                                                    );\n");
      out.write("\n");
      out.write("            var infowindow = new google.maps.InfoWindow({\n");
      out.write("                content: 'BISAG:<br/>Gandhinagar-Ahmedabad Road</br>Infocity</br>Gandhinagar</br>Gujarat</br>India'\n");
      out.write("            });\n");
      out.write("            google.maps.event.addListener(marker, 'click', function () {\n");
      out.write("                // Calling the open method of the infoWindow \n");
      out.write("                infowindow.open(map, marker);\n");
      out.write("            });\n");
      out.write("            infowindow.open(map, marker);\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("    </script>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("        var map1;\n");
      out.write("        function initialize1() {\n");
      out.write("            var latlng = new google.maps.LatLng(23.189786000000000000, 72.6369220999999990000);\n");
      out.write("            var myOptions = {\n");
      out.write("                zoom: 16,\n");
      out.write("                center: latlng,\n");
      out.write("                mapTypeId: google.maps.MapTypeId.ROADMAP\n");
      out.write("            };\n");
      out.write("            map1 = new google.maps.Map(document.getElementById(\"map1\"), myOptions);\n");
      out.write("            var marker = new google.maps.Marker\n");
      out.write("                                                    (\n");
      out.write("                                                        {\n");
      out.write("                                                            position: new google.maps.LatLng(23.189786000000000000, 72.6369220999999990000),\n");
      out.write("                                                            map: map1,\n");
      out.write("                                                            title: 'Click me'\n");
      out.write("\n");
      out.write("                                                        }\n");
      out.write("                                                    );\n");
      out.write("\n");
      out.write("            var infowindow = new google.maps.InfoWindow({\n");
      out.write("                content: 'BISAG:<br/>Gandhinagar-Ahmedabad Road</br>Infocity</br>Gandhinagar</br>Gujarat</br>India<br />CALL: 9909912765, 7878512765'\n");
      out.write("            });\n");
      out.write("            google.maps.event.addListener(marker, 'click', function () {\n");
      out.write("                // Calling the open method of the infoWindow \n");
      out.write("                infowindow.open(map1, marker);\n");
      out.write("            });\n");
      out.write("            infowindow.open(map1, marker);\n");
      out.write("        }\n");
      out.write("      \n");
      out.write("    </script>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        function loadmaps() {\n");
      out.write("            initialize();\n");
      out.write("            initialize1();\n");
      out.write("        }\n");
      out.write("        window.onload = loadmaps;\n");
      out.write("    </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"wrapper col1\">\n");
      out.write("            <div id=\"topbar\">\n");
      out.write("                <ul>\n");
      out.write("                    <li>\n");
      out.write("                    <a href=\"Home.jsp\" class=\"current\"><span></span>Home</a></li>\n");
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
      out.write("                            <td><a href=\"#\"><img src=\"images/Logo.png\" alt=\"logo\" /></a></td><td><h1><a href=\"#\">Immunize and</a></h1><p><h3>eHealthcare</h3></p></td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"fl_right\"></div>\n");
      out.write("                <br class=\"clear\" />\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    <div class=\"wrapper col5\">\n");
      out.write("        <div id=\"container\">\n");
      out.write("            <h5>Have questions about our services?&nbsp; Here?s how to contact us:</h5>\n");
      out.write("            <table cellspacing=\"10px\" >\n");
      out.write("                <tr>\n");
      out.write("                    <td width=\"50%\" valign=\"top\">\n");
      out.write("                        <table cellpecing=\"10px\">\n");
      out.write("                              <tr>\n");
      out.write("                                <td>\n");
      out.write("                                    <h3>Address One</h3>\n");
      out.write("               \n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                             <tr>\n");
      out.write("                                <td>\n");
      out.write("                                  <div id=\"map1\" style=\"width: 400px; height: 270px\">\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            \n");
      out.write("                        </table>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                    </td>\n");
      out.write("                    <td valign=\"top\" width=\"50%\">\n");
      out.write("                        <table cellpecing=\"10px\">\n");
      out.write("                            <tr>\n");
      out.write("                                <td>\n");
      out.write("                                    BISAG:<br/>\n");
      out.write("                                    Gandhinagar-Ahmedabad Road</br>\n");
      out.write("                                    Infocity</br>Gandhinagar</br>\n");
      out.write("                                    Gujarat</br> India<br/>\n");
      out.write("                       CALL: 9909912765, 7878512765<br />\n");
      out.write("                9 a.m.-8 p.m. Monday-Thursday, GMT<br />\n");
      out.write("                9 a.m.-6 p.m. Friday, GMT<br />\n");
      out.write("                  \n");
      out.write("                         Fax:(022) 2656 5500</P>                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                             <tr>\n");
      out.write("                                <td>\n");
      out.write("                                 <div id=\"map\" style=\"width: 400px; height: 270px\">\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                           \n");
      out.write("                        </table>\n");
      out.write("                        \n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <h2>Contact Form</h2>\n");
      out.write("                    <form method=\"post\" name=\"contact\" action=\"#\">\n");
      out.write("                        <table cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("                            <tr>\n");
      out.write("                                <td>\n");
      out.write("                                    <label for=\"author\">Name:</label> \n");
      out.write("                                    \n");
      out.write("                                </td>\n");
      out.write("                                <td>\n");
      out.write("                                    <input type=\"text\" id=\"author\" name=\"author\" class=\"required input_field\" />\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            \n");
      out.write("                            <tr>\n");
      out.write("                                <td>\n");
      out.write("                                    <label for=\"email\">Email:</label>\n");
      out.write("                                   \n");
      out.write("                                </td>\n");
      out.write("                                 <td>\n");
      out.write("                                     <input type=\"text\" id=\"email\" name=\"email\" class=\"validate-email required input_field\" />    \n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                           \n");
      out.write("                            <tr>\n");
      out.write("                                <td>\n");
      out.write("                                    <label for=\"url\">Phone:</label>\n");
      out.write("                                   \n");
      out.write("                                </td>\n");
      out.write("                                 <td>\n");
      out.write("                                      <input type=\"text\" name=\"url\" id=\"url\" class=\"input_field\" />\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                          \n");
      out.write("                            <tr>\n");
      out.write("                                <td>\n");
      out.write("                                    <label for=\"text\">Message:</label>\n");
      out.write("                                   \n");
      out.write("                                </td>\n");
      out.write("                                 <td>\n");
      out.write("                                       <textarea id=\"text\" name=\"text\" rows=\"0\" cols=\"0\" class=\"required\"></textarea>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                          \n");
      out.write("                            <tr>\n");
      out.write("                                <td></td>\n");
      out.write("                                <td>\n");
      out.write("                                    <table cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input style=\"font-weight: bold;\" type=\"submit\" class=\"submitbtn\" name=\"submit\" id=\"submit\" value=\" Send \" />\n");
      out.write("                                            </td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input style=\"font-weight: bold;\" type=\"reset\" class=\"submitbtn\" name=\"reset\" id=\"reset\" value=\" Reset \" />\n");
      out.write("                                            </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </table>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                    </form>\n");
      out.write("                        \n");
      out.write("                    </td>\n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("             \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("      \n");
      out.write("          <div class=\"wrapper col6\">\n");
      out.write("            <div id=\"footer\">\n");
      out.write("                <div id=\"newsletter\">\n");
      out.write("                    <h2>About Us</h2>\n");
      out.write("                    <p>\"Programs\" Includes Immunization information, Chronic Disease and Health Promotion, Family Health checkup and Environmental Health.</p>\n");
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
      out.write("                    <p>Health Information\" provides a variety of topics such as specific diseases and conditions, family health, environmental health, and workplace health records and safety.</p>\n");
      out.write("                </div>\n");
      out.write("                <br class=\"clear\" />\n");
      out.write("            </div>\n");
      out.write("        </div>                               \n");
      out.write("\n");
      out.write("        <div class=\"wrapper col7\">\n");
      out.write("            <div id=\"copyright\">\n");
      out.write("                <p class=\"fl_left\">Copyright &copy; 2014 - All Rights Reserved - <a href=\"www.MagicHorse.co.in\">MagicHorse.co.in</a></p>\n");
      out.write("                <br class=\"clear\" />\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("                    <div id=\"bottom\"></div>\n");
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
