package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class DTaP_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                <tr>\n");
      out.write("                <form id=\"form01\" name=\"Multi\" >\n");
      out.write("                <label><h1></h1></label>\n");
      out.write("                <fieldset>\n");
      out.write("                <legend>Why get vaccinated?</legend>\n");
      out.write("                <label>Your baby will get one or more of these vaccines today:</label>\n");
      out.write("                <li><b><i>Diphtheria, tetanus, and pertussis are serious diseases caused by bacteria.</b></i> Diphtheria and pertussis are spread from person to person. Tetanus enters the body through cuts or wounds.</li>\n");
      out.write("                <b>DIPHTHERIA</b> causes a thick covering in the back of the throat.\n");
      out.write("                <li>It can lead to breathing problems, paralysis, heart failure, and even death.</li>\n");
      out.write("                <b>TETANUS(Lockjaw)</b> causes painful tightening of the muscles, usually all over the body.\n");
      out.write("                <li>It can lead to \"locking\" of the jaw so the victim cannot open his mouth or swallow. Tetanus leads to death in up to 2 out of 10 cases.</li>\n");
      out.write("                <b>PERTUSSIS(Whooping Cough)</b> causes coughing spells so bad that it is hard for infants to eat, drink, or breathe. These spells can last for weeks.\n");
      out.write("                <li>It can lead to pneumonia, seizures (jerking and staring spells), brain damage, and death.</li>\n");
      out.write("                <li>Diphtheria, tetanus, and pertussis vaccine (DTaP) can help prevent these diseases. Most children who are vaccinated with DTaP will be protected throughout childhood. Many more children would get these diseases if we stopped vaccinating.</li>\n");
      out.write("                <p>DTaP is a safer version of an older vaccine called DTP. DTP is no longer used in the United States.</p>\n");
      out.write("                </fieldset></br>\n");
      out.write("                <fieldset>\n");
      out.write("                    <legend>Who should get DTaP vaccine and when?</legend>\n");
      out.write("                    <label>Who should get DTaP vaccine and when?</label>\n");
      out.write("                    <li>2 Months</li>\n");
      out.write("                    <li>4 Months</li>\n");
      out.write("                    <li>6 Months</li>\n");
      out.write("                    <li>15-18 Months</li>\n");
      out.write("                    <li>4-6 Months</li>\n");
      out.write("                    <p>DTaP may be given at the same time as other vaccines.</p>\n");
      out.write("                </fieldset></br>\n");
      out.write("                <fieldset>\n");
      out.write("                    <legend>DTaP may be given at the same time as other vaccines.</legend>\n");
      out.write("                    <li>Children with minor illnesses, such as a cold, may be vaccinated. But children who are moderately or severely ill should usually wait until they recover before getting DTaP vaccine.</li>\n");
      out.write("                    <li>Any child who had a life-threatening allergic reaction after a dose of DTaP should not get another dose.</li>\n");
      out.write("                    <li>Any child who suffered a brain or nervous system disease within 7 days after a dose of DTaP should not get another dose.</li>\n");
      out.write("                    <li>Talk with your doctor if your child:\n");
      out.write("                    <li>had a seizure or collapsed after a dose of DTaP</li>\n");
      out.write("                    <li>cried non-stop for 3 hours or more after a dose of DTaP</li>\n");
      out.write("                    <li>had a fever over 105°F after a dose of DTaP</li>\n");
      out.write("                    </li>\n");
      out.write("                        \n");
      out.write("                </fieldset></br>\n");
      out.write("                <fieldset>\n");
      out.write("                    <legend>What are the risks from DTaP vaccine?</legend>\n");
      out.write("                    <p>Getting diphtheria, tetanus, or pertussis disease is much riskier than getting DTaP vaccine.</p>\n");
      out.write("                    <p>However, a vaccine, like any medicine, is capable of causing serious problems, such as severe allergic reactions. The risk of DTaP vaccine causing serious harm, or death, is extremely small.</p>\n");
      out.write("                    <label><b>Mild Problems</b></label>\n");
      out.write("                    <li>Fever (up to about 1 child in 4)</li>\n");
      out.write("                    <li>Redness or swelling where the shot was given (up to about 1 child in 4)</li>\n");
      out.write("                    <li>Soreness or tenderness where the shot was given (up to about 1 child in 4)</li>\n");
      out.write("                    <p>These problems occur more often after the 4th and 5th doses of the DTaP series than after earlier doses. Sometimes the 4th or 5th dose of DTaP vaccine is followed by swelling of the entire arm or leg in which the shot was given, lasting 1-7 days (up to about 1 child in 30).</p>\n");
      out.write("                    <label><b>Other mild problems include:</b></label>\n");
      out.write("                    <li>Fussiness (up to about 1 child in 3)<li>\n");
      out.write("                    <li>Tiredness or poor appetite (up to about 1 child in 10)</li>\n");
      out.write("                    <li>Vomiting (up to about 1 child in 50)</li>\n");
      out.write("                    <p>These problems generally occur 1-3 days after the shot.</p>\n");
      out.write("                    <label><b>Moderate Problems (Uncommon):</b></label>\n");
      out.write("                    <li>Seizure (jerking or staring) (about 1 child out of 14,000)</li>\n");
      out.write("                    <li>Non-stop crying, for 3 hours or more (up to about 1 child out of 1,000)</li>\n");
      out.write("                    <li>High fever, over 105°F (about 1 child out of 16,000)</li>\n");
      out.write("                    <label><b>Severe Problems (Very Rare)</b></label>\n");
      out.write("                    <li>Serious allergic reaction (less than 1 out of a million doses)</li>\n");
      out.write("                    <li>Several other severe problems have been reported after DTaP vaccine. These include:\n");
      out.write("                    <li>Long-term seizures, coma, or lowered consciousness</li>\n");
      out.write("                    <li>Permanent brain damage.</li>\n");
      out.write("                    </li>\n");
      out.write("                    <p>These are so rare it is hard to tell if they are caused by the vaccine.</br>Controlling fever is especially important for children who have had seizures, for any reason. It is also important if another family member has had seizures. You can reduce fever and pain by giving your child an aspirin-free pain reliever when the shot is given, and for the next 24 hours, following the package instructions.</p>\n");
      out.write("                </fieldset></br>\n");
      out.write("                <fieldset>\n");
      out.write("                    <legend>What if there is a serious reaction?</legend>\n");
      out.write("                    <label><b>What should I look for?</b></label>\n");
      out.write("                    <li>Look for anything that concerns you, such as signs of a severe allergic reaction, very high fever, or behavior changes.</li>\n");
      out.write("                    <li>Signs of a severe allergic reaction can include hives, swelling of the face and throat, difficulty breathing, a fast heartbeat, dizziness, and weakness. These would start a few minutes to a few hours after the vaccination.</li>\n");
      out.write("                    <label><b>What should I do?</b></label>\n");
      out.write("                    <li>If you think it is a severe allergic reaction or other emergency that can’t wait, call 9-1-1 or get the person to the nearest hospital. Otherwise, call your doctor.</li>\n");
      out.write("                    <li>Afterward, the reaction should be reported to the Vaccine Adverse Event Reporting System (VAERS). Your doctor might file this report, or you can do it yourself through the VAERS websiteExternal Web Site Icon, or by calling 1-800-822-7967.</li>\n");
      out.write("                    <p>VAERS is only for reporting reactions. They do not give medical advice.</p>\n");
      out.write("                    <label>The National Vaccine Injury Compensation Program</label>\n");
      out.write("                    <p>The National Vaccine Injury Compensation Program (VICP) is a federal program that was created to compensate people who may have been injured by certain vaccines.\n");
      out.write("                    </p><p>Persons who believe they may have been injured by a vaccine can learn about the program and about filing a claim by calling 1-800-338-2382 or visiting the VICP websiteExternal Web Site Icon.</p>\n");
      out.write("                    <label><b>How can I learn more?</b></label>\n");
      out.write("                    <li>Ask your doctor.</li><li>\n");
      out.write("                        Contact your local or state health department’s immunization program.</li>\n");
      out.write("                    <li>Contact the Centers for Disease Control and Prevention (CDC):\n");
      out.write("                    <li>Call 1-800-232-4636 (1-800-CDC-INFO)</li>\n");
      out.write("                    <li>Visit CDC's vaccines website</li></li>\n");
      out.write("                </fieldset>\n");
      out.write("                </form>\n");
      out.write("                </div>\n");
      out.write("                </form>\n");
      out.write("                </div>\n");
      out.write("                </div> \n");
      out.write("                </body>\n");
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
