package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.el.lang.FunctionMapperImpl.Function;
import java.util.ArrayList;

public final class gridViewOfReports_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/HeaderPage.jsp", out, false);
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title></title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/layout.css\" type=\"text/css\" />\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        ");
 
        ArrayList a2=new ArrayList();

        if(request.getAttribute("data")!=null)   
            a2=(ArrayList) request.getAttribute("data");
        //out.println(a1);
     
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/adminMenu.jsp", out, false);
      out.write("\n");
      out.write("        <div class=\"wrapper col5\">\n");
      out.write("        <div id=\"container\">\n");
      out.write("            <div id=\"breadcrumb\">\n");
      out.write("               <p>Vaccine List</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"body1\">\n");
      out.write("            <div class=\"form1\">\n");
      out.write("            <fieldset class=\"fieldset\">\n");
      out.write("                <legend><font size=\"5\" color=\"red\" style=\"font: bold\">Vaccines</font></legend>\n");
      out.write("            <div class=\"grid\" style=\"margin-top: 30px;\">\n");
      out.write("            <div>\n");
      out.write("            <table align=\"center\" width=\"100%\" id=\"tableid\" border=\"1\" >\n");
      out.write("           <thead style=\"background-color: silver\">\n");
      out.write("                        <th>Field Id</th>\n");
      out.write("                        <th>File Name</th>\n");
      out.write("                        <th>Patient Id</th>\n");
      out.write("                        <th>Path</th>\n");
      out.write("                        \n");
      out.write("                  </thead>\n");
      out.write("                  <tbody>\n");
      out.write("                  ");

                        String uname=null;
                        String uid=null;
                          for(int i=0;i<a2.size();i++)
                        {
                           String Rdetails[]=a2.get(i).toString().split(":");
                      
                           
                        
      out.write("\n");
      out.write("                        <tr> \n");
      out.write("                         ");

                           for(int j=0;j<Rdetails.length;j++)
                             {
                                    if(j==0)
                                    {uid=Rdetails[0];}
                                                                       if(j==1)
                                        {
                                        
      out.write("\n");
      out.write("                                        <td> <a href=\"\">\n");
      out.write("                                    ");
      out.print(Rdetails[1]);
      out.write("\n");
      out.write("                                    </a></td>\n");
      out.write("                                    ");

                                    }else{
                                    
      out.write("\n");
      out.write("                                                    <td>\n");
      out.write("                                                         ");
      out.print(Rdetails[j]);
      out.write("\n");
      out.write("                                                 </td>\n");
      out.write("                             ");

                                                       }  
                           }
                             
      out.write("\n");
      out.write("                       </tr>\n");
      out.write("                            \n");
      out.write("                        ");

                          }
                        
      out.write("\n");
      out.write("                  </tbody>\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </fieldset>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("        </div></div>\n");
      out.write("    </body>\n");
      out.write("   ");
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
