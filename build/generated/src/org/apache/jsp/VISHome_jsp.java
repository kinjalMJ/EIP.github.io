package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class VISHome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Vaccine Information System</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/layout.css\" type=\"text/css\" />\n");
      out.write("    \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
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
      out.write("           <div class=\"wrapper col2\">\n");
      out.write("            <div id=\"header\">\n");
      out.write("                <div class=\"fl_left\">\n");
      out.write("                    <table cellpadding=\"5px\" cellspacing=\"0\" border=\"0\">\n");
      out.write("                        <tr>\n");
      out.write("                            <td><a href=\"#\"><img src=\"images/folder.png\" alt=\"logo\" /></a></td>\n");
      out.write("                            <td><h1><a href=\"#\">vaccine Information</a></h1><p><h3> System</h3></p></td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"fl_right\" align=\"Right\" > </div>\n");
      out.write("                <br class=\"clear\" />\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("     \n");
      out.write("        </div>\n");
      out.write("        <div class=\"wrapper col5\">\n");
      out.write("        <div id=\"container\">\n");
      out.write("            <div id=\"breadcrumb\">\n");
      out.write("                <p>Vaccine Information Syatem</p>\n");
      out.write("            </div>\n");
      out.write("            <form method=\"get\" action=\"\" id=\"form24\" name=\"formVaccine\" >\n");
      out.write("                <div align=\"left\">\n");
      out.write("                <table cellpadding=\"0\" cellspacing=\"5px\"  style=\"text-align:left\" >\n");
      out.write("                    \n");
      out.write("                <tr>\n");
      out.write("                 <div align=\"center\">  \n");
      out.write("                 <label style=\"font-size: xx-large; color: #ff0000 ;font-style: italic\"></label>Multi-, Routine-, & Non-Routine-Vaccine VIS</label>\n");
      out.write("                 </div>\n");
      out.write("                 <form id=\"form01\" name=\"Multi\" >\n");
      out.write("               \n");
      out.write("                <fieldset>\n");
      out.write("                <legend>Multi Vaccine</legend>\n");
      out.write("                <p><a href=\"multipleVaccines.jsp\" target=\"blank\">Multi</a>\n");
      out.write("                 Multiple Vaccines (DTaP, Hib, Hepatitis B, Polio, and PCV13)</p>\n");
      out.write("                 This VIS may be used in place of the individual VISs for DTaP, Hib, Hepatitis B, Polio, and PCV13 when two or more of these vaccines are administered during the same visit. It may be used for infants through children receiving their routine 4-6 year vaccines.</p>\n");
      out.write("               \n");
      out.write("                </fieldset></br>\n");
      out.write("                </form>\n");
      out.write("            <!-------------------------------------------------------------------------------------->\n");
      out.write("            \n");
      out.write("            <form id=\"form02\" name=\"Routine\">\n");
      out.write("                <fieldset>\n");
      out.write("                    <legend><a href=\"\">Routine</a></legend>\n");
      out.write("                   \n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"DTaP.jsp\" target=\"blank\"> DTaP</a></li>\n");
      out.write("                <li><a href=\"hepatitisA.jsp\" target=\"blank\" > Hepatitis A</a></li>\n");
      out.write("                <li><a href=\"HepatitisB.jsp\" target=\"blank\"> Hepatitis B</a></li>\n");
      out.write("                <li><a href=\"HepatitisB.jsp\" target=\"blank\">Hib (Haemophilus Influenzae type b)</a></li>\n");
      out.write("                <li><a href=\"HepatitisB.jsp\" target=\"blank\">HPV - Cervarix</a> </li>\n");
      out.write("                <li><a href=\"HepatitisB.jsp\" target=\"blank\">HPV - Gardasil</a></li>\n");
      out.write("                <li><a href=\"HepatitisB.jsp\" target=\"blank\">Influenza - Live, Intranasal</a></li>\n");
      out.write("                <li><a href=\"HepatitisB.jsp\" target=\"blank\">Influenza - Inactivated </a></li>\n");
      out.write("                <li><a href=\"HepatitisB.jsp\" target=\"blank\">Measles/Mumps/Rubella (MMR)</a> </li>\n");
      out.write("                <li><a href=\"HepatitisB.jsp\" target=\"blank\">Measles/Mumps/Rubella & Varicella (MMRV) </a></li>\n");
      out.write("                <li><a href=\"HepatitisB.jsp\" target=\"blank\">Meningococcal</a> </li>\n");
      out.write("                <li><a href=\"HepatitisB.jsp\" target=\"blank\">Pneumococcal Conjugate (PCV13) </a></li>\n");
      out.write("                <li><a href=\"HepatitisB.jsp\" target=\"blank\">Pneumococcal Polysaccharide (PPSV23)</a></li>\n");
      out.write("                <li><a href=\"HepatitisB.jsp\" target=\"blank\">Polio</a></li>\n");
      out.write("                <li><a href=\"HepatitisB.jsp\" target=\"blank\">Rotavirus</a></li>\n");
      out.write("                <li><a href=\"HepatitisB.jsp\" target=\"blank\">Shingles (Herpes Zoster)</a></li>\n");
      out.write("                <li><a href=\"HepatitisB.jsp\" target=\"blank\">Tdap (Tetanus, Diphtheria, Pertussis)</a> </li>\n");
      out.write("                <li><a href=\"HepatitisB.jsp\" target=\"blank\">Td (Tetanus, Diphtheria)</a> </li>\n");
      out.write("                <li><a href=\"HepatitisB.jsp\" target=\"blank\">Varicella (Chickenpox)</a> </li>\n");
      out.write("            </ul>\n");
      out.write("            </fieldset></br>\n");
      out.write("            </form>\n");
      out.write("     \n");
      out.write("            <form id=\"form02\" name=\"Routine\">\n");
      out.write("            <fieldset>\n");
      out.write("            <legend><a href=\"\">Non-Routine</a></legend>\n");
      out.write("            <ul>\n");
      out.write("            <li><a href=\"HepatitisB.jsp\" target=\"blank\">Adenovirus</a></li>\n");
      out.write("          \n");
      out.write("            <li><a href=\"HepatitisB.jsp\" target=\"blank\">Anthrax</a></li>\n");
      out.write("            <li><a href=\"HepatitisB.jsp\" target=\"blank\">Japanese Encephalitis</a></li>\n");
      out.write("            <li><a href=\"HepatitisB.jsp\" target=\"blank\">Rabies</a></li>\n");
      out.write("            <li><a href=\"HepatitisB.jsp\" target=\"blank\">Smallpox (Vaccinia)</a>\n");
      out.write("            <p>Medical Guide for vaccination with ACAM2000 Adobe PDF file [227 KB, 6 pages] This medication guide replaces the Smallpox VIS. It is to be used before one receives the vaccination. This guide is not available in other languages.</p></li>\n");
      out.write("            <li><a href=\"HepatitisB.jsp\" target=\"blank\">Typhoid</a></li>\n");
      out.write("            <li><a href=\"HepatitisB.jsp\" target=\"blank\">Yellow Fever</a></li>\n");
      out.write("            </ul>\n");
      out.write("            </fieldset></br>\n");
      out.write("            </form>\n");
      out.write("                    </tr>         \n");
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
      out.write("  ");
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
