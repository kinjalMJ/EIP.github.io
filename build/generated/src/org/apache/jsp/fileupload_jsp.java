package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;

public final class fileupload_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/HeaderPage.jsp", out, false);
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title></title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/layout.css\" type=\"text/css\" />\n");
      out.write("      </head>\n");
      out.write("    <body>\n");
      out.write("        ");

         ArrayList a2=new ArrayList();

          if(request.getAttribute("data")!=null)   
            a2=(ArrayList) request.getAttribute("data");
    

      out.write("\n");
      out.write("        \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/adminMenu.jsp", out, false);
      out.write("\n");
      out.write("        <div class=\"wrapper col5\">\n");
      out.write("        <div id=\"container\">\n");
      out.write("            <div id=\"breadcrumb\">\n");
      out.write("                <p>Report</p>\n");
      out.write("            </div>\n");
      out.write("               <form method=\"post\" action=\"attachmentservlet\" enctype=\"multipart/form-data\">\n");
      out.write("                <div align=\"center\">\n");
      out.write("                <table cellpadding=\"0\" cellspacing=\"5px\"  style=\"text-align:left\" >\n");
      out.write("                    <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td><label for=\"author\">Select File :</label> </td>\n");
      out.write("                        <td><input type=\"file\" name=\"file\" class=\"submitbtn\" value=\"uuuuuuuuu\"/></td>\n");
      out.write("                        <td></td>\n");
      out.write("                    </tr>\n");
      out.write("                     <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td><label>Upload :</label> </td>\n");
      out.write("                        <td colspan=\"2\" align=\"left\"><input type=\"submit\" value=\"Upload\" class=\"submitbtn\"  id=\"submit\"></td>\n");
      out.write("                        <td></td>\n");
      out.write("                   </tr>\n");
      out.write("                   <tr>\n");
      out.write("                        <table align=\"center\" width=\"100%\" id=\"tableid\" border=\"1\" >\n");
      out.write("           <thead style=\"background-color: silver\">\n");
      out.write("                        <th>Field Id</th>\n");
      out.write("                        <th>File Name</th>\n");
      out.write("                        \n");
      out.write("                  </thead>\n");
      out.write("                  <tbody>\n");
      out.write("                  ");

                        String uname=null;
                        String uid=null;
                        for(int i=0;i<a2.size();i++)
                        {
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print(i+1);
      out.write("</td>\n");
      out.write("                            <td><a href=\"viewReport.jsp?f=");
      out.print(a2.get(i));
      out.write('"');
      out.write('>');
      out.print(a2.get(i));
      out.write("</a></td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");
}
                        
      out.write("\n");
      out.write("                        \n");
      out.write("                  </tbody>\n");
      out.write("                        </table>\n");
      out.write("                   </tr>\n");
      out.write("                </table> \n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </div> \n");
      out.write("  </body>\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/FooterPage.jsp", out, false);
      out.write("\n");
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
