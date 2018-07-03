package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.el.lang.FunctionMapperImpl.Function;
import java.util.ArrayList;
import javax.servlet.http.HttpSession;

public final class patientListView_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/HeaderPage.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title></title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/layout.css\" type=\"text/css\" />\n");
      out.write("        <script lang=\"javascript\">\n");
      out.write("          function deleteConfirm()\n");
      out.write("            {\n");
      out.write("             //   alert(\"in fun\");\n");
      out.write("            \n");
      out.write("            var x;\n");
      out.write("            var flag=false;\n");
      out.write("            if (confirm(\"Are You Sure ?\") == true)\n");
      out.write("            {\n");
      out.write("                x = \"You Want To Delete Record!\";\n");
      out.write("                alert(x);\n");
      out.write("                flag=true;\n");
      out.write("            }\n");
      out.write("            else \n");
      out.write("            {\n");
      out.write("                x = \"You Don't Want To Delete Record!!\";\n");
      out.write("                  alert(x);\n");
      out.write("                  flag=false;\n");
      out.write("            }\n");
      out.write("           // document.getElementById(\"demo\").innerHTML = x;\n");
      out.write("         //  alert(flag);\n");
      out.write("           return flag;\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("          ");
 
        ArrayList a1=new ArrayList();

        if(request.getAttribute("data")!=null)   
            a1=(ArrayList) request.getAttribute("data");
        //out.println(a1);
     
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/adminMenu.jsp", out, false);
      out.write("\n");
      out.write("        <div class=\"wrapper col5\">\n");
      out.write("        <div id=\"container\">\n");
      out.write("            <div id=\"breadcrumb\">\n");
      out.write("               <p>Patient List</p>\n");
      out.write("            </div>\n");
      out.write("            <div align=\"right\">\n");
      out.write("                <form method=\"get\" action=\"searchServlet\" id=\"form33\" name=\"formS\">\n");
      out.write("                <table border=\"1\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type=\"text\" name=\"search\" ></td>\n");
      out.write("                        <td><input type=\"submit\" name=\"search\" id=\"search\" value=\"search\" class=\"submitbtn\" /></td>\n");
      out.write("                        <td><a href=\"searchServlet?all=all\"> View </a></td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("               \n");
      out.write("                <div class=\"body1\">\n");
      out.write("        <div class=\"form1\">\n");
      out.write("        \n");
      out.write("                    <fieldset class=\"fieldset\">\n");
      out.write("                        <legend><font size=\"5\" color=\"Red\" bold> User Data</font></legend>\n");
      out.write("                <div class=\"grid\" style=\"margin-top: 30px;\">\n");
      out.write("                    <div>\n");
      out.write("                  <table align=\"center\" width=\"100%\" id=\"tableid\" border=\"1\" >\n");
      out.write("                      <thead style=\"background-color: silver\">\n");
      out.write("                        <th>PatientId</th>\n");
      out.write("                        <th>Name</th>\n");
      out.write("                        <th>Gender</th>\n");
      out.write("                        <th>Blood Group</th>\n");
      out.write("                        <th>Abnormal Symptoms</th>\n");
      out.write("                    ");
  
                    HttpSession s1=request.getSession(false);
                    String type=s1.getAttribute("Type").toString();                
                                   
                     if(type.equalsIgnoreCase("admin"))
                     {
                     
      out.write("\n");
      out.write("\n");
      out.write("                        <th>Edit</th>\n");
      out.write("                        <th>Delete</th>\n");
      out.write("                     ");

                     }
                     
      out.write("   \n");
      out.write("                        \n");
      out.write("                  </thead>\n");
      out.write("                  <tbody>\n");
      out.write("                   ");

                        String uid="";
                        for(int i=0;i<a1.size();i++)
                        {
                           String udetails[]=a1.get(i).toString().split(":");
                        
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                ");

                                for(int j=0;j<udetails.length;j++)
                                                                       {
                                    if(j==0)
                                        uid=udetails[0];
    
      out.write("\n");
      out.write("                                <td>\n");
      out.write("                                    ");
      out.print(udetails[j]);
      out.write("\n");
      out.write("                                </td>\n");
      out.write("                                ");

                                 }
                                           
                              if(type.equalsIgnoreCase("admin"))
                                {
                                 
      out.write("\n");
      out.write("                                <td><a href=\"editPatientServlet?uid=");
      out.print(uid);
      out.write("\"><img src=\"Tick.png\"></a></td>\n");
      out.write("                                <td><a href=\"deletePatientServlet?uid=");
      out.print(uid);
      out.write("\" onclick=\" return deleteConfirm();\"><img src=\"Cross.png\"> </a></td>\n");
      out.write("                            </tr>\n");
      out.write("                            \n");
      out.write("                        ");
 
                        }
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
      out.write("            \n");
      out.write("           \n");
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
