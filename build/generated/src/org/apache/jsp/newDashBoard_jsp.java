package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import logic.logicFunction;
import java.util.ArrayList;
import java.util.*;

public final class newDashBoard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "HeaderPage.jsp", out, false);
      out.write('\n');

ArrayList pT=new ArrayList();
ArrayList pN=new ArrayList();
pT.add("pendingTask1");
pT.add("pendingTask2");
pT.add("pendingTask3");
pT.add("pendingTask4");
pT.add("pendingTask5");
pN.add("Patient1");
pN.add("Patient2");
pN.add("Patient3");
pN.add("Patient4");
pN.add("Patient5");



      out.write("\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("    <title>Home page</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/layout.css\" type=\"text/css\" />\n");
      out.write("    <script language=\"javascript\" type=\"text/javascript\" src=\"js/FunctionJS.js\"></script>\n");
      out.write("<style type=\"text/css\">\n");
      out.write(".marqueecontainer\n");
      out.write("{\n");
      out.write("position: relative;\n");
      out.write("width: 200px; /*marquee width */\n");
      out.write("height: 240px; /*marquee height */\n");
      out.write("background-color: grey;\n");
      out.write("overflow: hidden;\n");
      out.write("border:  1px solid black;\n");
      out.write("padding: 2px;\n");
      out.write("padding-left: 4px;\n");
      out.write("}\n");
      out.write(".marqueeTd\n");
      out.write("{\n");
      out.write("background-color: #ffffff;\n");
      out.write("border-bottom: 1px solid black;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("/***********************************************\n");
      out.write("* Cross browser Marquee II- Â© Dynamic Drive (www.dynamicdrive.com)\n");
      out.write("* This notice MUST stay intact for legal use\n");
      out.write("* Visit http://www.dynamicdrive.com/ for this script and 100s more.\n");
      out.write("***********************************************/\n");
      out.write("\n");
      out.write("var delayb4scroll=2000 //Specify initial delay before marquee starts to scroll on page (2000=2 seconds)\n");
      out.write("var marqueespeed=2 //Specify marquee scroll speed (larger is faster 1-10)\n");
      out.write("var pauseit=1 //Pause marquee onMousever (0=no. 1=yes)?\n");
      out.write("\n");
      out.write("////NO NEED TO EDIT BELOW THIS LINE////////////\n");
      out.write("\n");
      out.write("var copyspeed=marqueespeed\n");
      out.write("var pausespeed=(pauseit==0)? copyspeed: 0\n");
      out.write("var actualheight=''\n");
      out.write("\n");
      out.write("function scrollmarquee(){\n");
      out.write("if (parseInt(cross_marquee.style.top)>(actualheight*(-1)+8)) //if scroller hasn't reached the end of its height\n");
      out.write("cross_marquee.style.top=parseInt(cross_marquee.style.top)-copyspeed+\"px\" //move scroller upwards\n");
      out.write("else //else, reset to original position\n");
      out.write("cross_marquee.style.top=parseInt(marqueeheight)+8+\"px\"\n");
      out.write("}\n");
      out.write("\n");
      out.write("function initializemarquee(){\n");
      out.write("cross_marquee=document.getElementById(\"vmarquee\")\n");
      out.write("cross_marquee.style.top=0\n");
      out.write("marqueeheight=document.getElementById(\"marqueecontainer\").offsetHeight\n");
      out.write("actualheight=cross_marquee.offsetHeight //height of marquee content (much of which is hidden from view)\n");
      out.write("if (window.opera || navigator.userAgent.indexOf(\"Netscape/7\")!=-1){ //if Opera or Netscape 7x, add scrollbars to scroll and exit\n");
      out.write("cross_marquee.style.height=marqueeheight+\"px\"\n");
      out.write("cross_marquee.style.overflow=\"scroll\"\n");
      out.write("return\n");
      out.write("}\n");
      out.write("setTimeout('lefttime=setInterval(\"scrollmarquee()\",30)', delayb4scroll)\n");
      out.write("}\n");
      out.write("\n");
      out.write("if (window.addEventListener)\n");
      out.write("window.addEventListener(\"load\", initializemarquee, false)\n");
      out.write("else if (window.attachEvent)\n");
      out.write("window.attachEvent(\"onload\", initializemarquee)\n");
      out.write("else if (document.getElementById)\n");
      out.write("window.onload=initializemarquee\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/adminMenu.jsp", out, false);
      out.write("\n");
      out.write("    <div class=\"wrapper col5\">\n");
      out.write("        <div id=\"container\">\n");
      out.write("            <div id=\"breadcrumb\">\n");
      out.write("                <p>Dash Board</p>\n");
      out.write("            </div>\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td align=\"center\" valign=\"top\"> \n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("                            <div class=\"marqueecontainer\" >\n");
      out.write("                          \n");
      out.write("                                <h3>Pending Task</h3>\n");
      out.write("                                <marquee  scrollamount=\"2\" direction=\"up\" loop=\"true\" width=\"100%\" onmouseover=\"stop();\"  onmouseout=\"start();\"> \n");
      out.write("                                    <center> <font color=\"#ffffff\">\n");
      out.write("                                            <strong>  <table  width=\"100%\">\n");
      out.write("                                                    <thead>\n");
      out.write("                                                        <tr><th></th></tr></thead>\n");
      out.write("                                                                ");

                                                                    Iterator ivp = pT.iterator();
                                                                    while (ivp.hasNext()) {
                                                                        String task = ivp.next().toString();
                                                                
      out.write("   \n");
      out.write("                                                    <tr><td class=\"marqueeTd\" align=\"center\"><a href=\"viewTask?task=");
      out.print(task);
      out.write('"');
      out.write('>');
      out.print(task);
      out.write("</a></td></tr>\n");
      out.write("                                                            ");

                                                                }
                                                            
      out.write("\n");
      out.write("                                                </table>\n");
      out.write("                                            </strong>\n");
      out.write("                                        </font>\n");
      out.write("                                    </center>\n");
      out.write("                                </marquee></div> \n");
      out.write("                    </td>\n");
      out.write("                    <td  align=\"center\"> ");

                if ("aa".equalsIgnoreCase("bb")) {
                        
      out.write("\n");
      out.write("                        <table>\n");
      out.write("                            <tr>\n");
      out.write("                                ");
      out.write("\n");
      out.write("                                <td><img src=\"doctorDashBord.jsp\" alt=\"Progress chart\" /></td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                        ");
                } else {
                        
      out.write("\n");
      out.write("                        <table>\n");
      out.write("                            <tr>\n");
      out.write("                                <td><img src=\"adminDashBord.jsp\" alt=\"Progress chart\" /></td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                        ");
                    }
                        
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                \n");
      out.write("                    \n");
      out.write("                        <td align=\"center\" valign=\"top\"> \n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            <div class=\"marqueecontainer\" >\n");
      out.write("                                  <h3>Recent Patient</h3>\n");
      out.write("                                <marquee  scrollamount=\"2\" direction=\"up\" loop=\"true\" width=\"100%\" onmouseover=\"stop();\"  onmouseout=\"start();\"> \n");
      out.write("                                    <center> <font color=\"#ffffff\">\n");
      out.write("                                            <strong>\n");
      out.write("                                                <table  width=\"100%\">\n");
      out.write("                                                    <tr><th></th></tr>\n");
      out.write("                                                            ");

                                                                Iterator iv = pN.iterator();
                                                                while (iv.hasNext()) {
                                                                    String uname = iv.next().toString();
                                                            
      out.write("   \n");
      out.write("                                                    <tr><td class=\"marqueeTd\" align=\"center\"><a href=\"MyData?label=yes&tp=3&un=");
      out.print(uname);
      out.write('"');
      out.write('>');
      out.print(uname);
      out.write("</a></td></tr>\n");
      out.write("                                                            ");

                                                                }
                                                            
      out.write("\n");
      out.write("                                                </table>\n");
      out.write("                                            </strong>\n");
      out.write("                                        </font>\n");
      out.write("                                    </center>\n");
      out.write("                                </marquee>\n");
      out.write("                        </div></td></tr></table>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</table>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "FooterPage.jsp", out, false);
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
