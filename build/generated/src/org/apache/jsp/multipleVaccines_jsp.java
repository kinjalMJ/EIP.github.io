package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class multipleVaccines_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                <p>Multi Vaccine </p>\n");
      out.write("            </div>\n");
      out.write("            <form method=\"get\" action=\"\" id=\"form24\" name=\"formVaccine\" >\n");
      out.write("                <div align=\"left\">\n");
      out.write("                <table cellpadding=\"0\" cellspacing=\"5px\"  style=\"text-align:left\" >\n");
      out.write("                    \n");
      out.write("                <tr>\n");
      out.write("                <form id=\"form01\" name=\"Multi\" >\n");
      out.write("                <label><h1>Multi-, Routine-, & Non-Routine-Vaccine VISs</h1></label>\n");
      out.write("                <fieldset>\n");
      out.write("                <legend>What you need to know</legend>\n");
      out.write("                <label>Your baby will get one or more of these vaccines today:</label>\n");
      out.write("                <li>DTaP</li>\n");
      out.write("                <li>Hib</li>\n");
      out.write("                <li>Hepatitis B</li>\n");
      out.write("                <li>Polio</li>\n");
      out.write("                <li>PCV13</li>\n");
      out.write("                \n");
      out.write("            </fieldset>\n");
      out.write("            </form>\n");
      out.write("            </tr>\n");
      out.write("                    <!-------------------------------------------------------------------------------------->\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                <form id=\"form02\" name=\"Routine\">\n");
      out.write("                <fieldset>\n");
      out.write("                <legend>Why get vaccinated?</legend>\n");
      out.write("                <p>These vaccines can protect your baby from 7 childhood diseases:</p>\n");
      out.write("                <ol>\n");
      out.write("                 <li>diphtheria</li>\n");
      out.write("                    <p>\n");
      out.write("                    <ul><li>Signs and symptoms include a thick coating in the back of the throat that can make it hard to breathe.</li>\n");
      out.write("                        <li>Diphtheria can lead to breathing problems, paralysis and heart failure.</li>\n");
      out.write("                        <li>About 15,000 people died each year in the U.S. from diphtheria before there was a vaccine</li>\n");
      out.write("                    </ul>\n");
      out.write("                    </p>\n");
      out.write("                 <li>Tetanus (Lockjaw)</li>\n");
      out.write("                 <p>\n");
      out.write("                    <ul>\n");
      out.write("                        <li>Signs and symptoms include painful tightening of the muscles, usually all over the body.</li>\n");
      out.write("                        <li>Tetanus can lead to stiffness of the jaw that can make it difficult to open the mouth or swallow.</li>\n");
      out.write("                        <li>Tetanus kills 1 person out of every 5 who get it.</li>\n");
      out.write("                        <li></li>\n");
      out.write("                    \n");
      out.write("                    </ul>\n");
      out.write("                    </p>\n");
      out.write("                    \n");
      out.write("                 <li>Pertussis (Whooping Cough)</li>\n");
      out.write("                 <p>\n");
      out.write("                 \n");
      out.write("                 <ul>\n");
      out.write("                     <li>Signs and symptoms include violent coughing spells that can make it hard for an infant to eat, drink, or breathe. These spells can last for several weeks.</li>\n");
      out.write("                     <li>Pertussis can lead to pneumonia, seizures, brain damage, or death.</li>\n");
      out.write("                    \n");
      out.write("                 </ul>\n");
      out.write("                 </p>\n");
      out.write("                 <li>Hib (Haemophilus influenzae type b)</li>\n");
      out.write("                 <p>\n");
      out.write("                 <ul>\n");
      out.write("                     <li>Signs and symptoms can include fever, headache, stiff neck, cough, and shortness of breath. There might not be any signs or symptoms in mild cases.</li>\n");
      out.write("                     <li>Hib can lead to meningitis (infection of the brain and spinal cord coverings); pneumonia; infections of the blood, joints, bones, and covering of the heart; brain damage; and deafness.</li>\n");
      out.write("                     <li>Before there was a vaccine, Hib disease was the leading cause of bacterial meningitis in children under 5 years of age in the U.S.</li>\n");
      out.write("                 </ul>\n");
      out.write("                 </p>\n");
      out.write("                 <li>Hepatitis B</li>\n");
      out.write("                 <ul>\n");
      out.write("                     <li>Signs and symptoms include tiredness, diarrhea and vomiting, jaundice (yellow skin or eyes), and pain in muscles, joints and stomach. But usually there are no signs or symptoms at all.</li>\n");
      out.write("                      <li>Hepatitis B can lead to liver damage, and liver cancer. Some people develop chronic (long term) hepatitis B infection. These people might not look or feel sick, but they can infect others.</li>\n");
      out.write("                       <li>Hepatitis B can cause liver damage and cancer in 1 child out of 4 who are chronically infected.</li>\n");
      out.write("                 </ul>\n");
      out.write("                 <li>Pneumococcal Disease</li>\n");
      out.write("                 <ul>\n");
      out.write("                     <li>Signs and symptoms include fever, chills, cough, and chest pain.</li>\n");
      out.write("                     <li>Pneumococcal disease can lead to meningitis (infection of the brain and spinal cord coverings), blood infections, ear infections, pneumonia, deafness, and brain damage.</li>\n");
      out.write("                    \n");
      out.write("                 </ul>\n");
      out.write("            </p>\n");
      out.write("                </ol>\n");
      out.write("                </fieldset>\n");
      out.write("                </form>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                <form>\n");
      out.write("                 <fieldset>\n");
      out.write("                 <legend>\n");
      out.write("                    <table align=\"center\" width=\"100%\" id=\"tableid\" border=\"1\" >\n");
      out.write("                    <thead style=\"background-color: silver\">\n");
      out.write("                    <th>Vaccine</th>\n");
      out.write("                    <th>No Of Doses</th>\n");
      out.write("                    <th>Recommanded Ages</th>\n");
      out.write("                    <th>Other Information</th>\n");
      out.write("                  </thead>\n");
      out.write("                  <tbody>\n");
      out.write("                      <tr>\n");
      out.write("                          <td>DTaP (Diphtheria, Tetanus, Pertussis)</td>\n");
      out.write("                          <td>5</td>\n");
      out.write("                          <td>2 months, 4 months, 6 months, 15-18 months, 4-6 years</td>\n");
      out.write("                          <td>Some children should not get pertussis vaccine. These children can get a vaccine called DT (diphtheria & tetanus).</td>\n");
      out.write("                      </tr>\n");
      out.write("                      <tr>\n");
      out.write("                          <td>Hepatitis B</td>\n");
      out.write("                          <td>3</td>\n");
      out.write("                          <td>Birth, 1-2 months, 6-18 months</td>\n");
      out.write("                          <td></td>\n");
      out.write("                      </tr>\n");
      out.write("                      <tr>\n");
      out.write("                          <td>Polio</td>\n");
      out.write("                          <td>4</td>\n");
      out.write("                          <td>2 months, 4 months, 6-18 months, 4-6 years.</td>\n");
      out.write("                          <td>An additional dose of polio vaccine may be recommended for travel to certain countries.</td>\n");
      out.write("                      </tr>\n");
      out.write("                      <tr>\n");
      out.write("                          <td>Hib (Haemophilus influenzae type b)</td>\n");
      out.write("                          <td>3 or 4</td>\n");
      out.write("                          <td>2 months, 4 months, (6 months), 12-15 months</td>\n");
      out.write("                          <td>There are several Hib vaccines. With one of them the 6-month dose is not needed.</td>\n");
      out.write("                      </tr>\n");
      out.write("                      <tr>\n");
      out.write("                          <td>PCV13 (pneumococcal)</td>\n");
      out.write("                          <td>4</td>\n");
      out.write("                          <td>2 months, 4 months, 6 months, 12-15 months</td>\n");
      out.write("                          <td>Older children with certain health conditions may also need this vaccine.</td>\n");
      out.write("                      </tr>\n");
      out.write("                  </table>\n");
      out.write("                  </tbody>\n");
      out.write("                  </legend>\n");
      out.write("                  </form>\n");
      out.write("                  </tr>\n");
      out.write("                  </fieldset> \n");
      out.write("                  </table> \n");
      out.write("                  </div>\n");
      out.write("                  </form>\n");
      out.write("                  </div>\n");
      out.write("                  </div> \n");
      out.write("                  </body>\n");
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
