package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;

public final class viewInteractionType_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("          <script lang=\"javascript\">\n");
      out.write("            function overRuled(tmp)\n");
      out.write("            {\n");
      out.write("               alert(tmp.checked);\n");
      out.write("               var a=tmp.checked;\n");
      out.write("               if(a==true)\n");
      out.write("                   alert(\"You are overruled the interaction. Mail about interaction overruled is sent to hospital\");\n");
      out.write("            \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            function checkInteractionChk(size)\n");
      out.write("            {\n");
      out.write("             //  alert(\"in fun\");\n");
      out.write("               for(var i=0;i<size;i++)\n");
      out.write("                    {\n");
      out.write("                       var ch= document.getElementById(\"chk\"+i).checked;\n");
      out.write("                       alert(ch);\n");
      out.write("                    }\n");
      out.write("                    return false;\n");
      out.write("            }\n");
      out.write("            function trySubmit(size)\n");
      out.write("            {\n");
      out.write("                //alert(\"in fun: \"+size);\n");
      out.write("                var flag=true;\n");
      out.write("                for(var i=0;i<size;i++)\n");
      out.write("                    {\n");
      out.write("                        var ch=document.getElementById(\"chk\"+i).checked;\n");
      out.write("                        //alert(ch);\n");
      out.write("                        if(ch==false)\n");
      out.write("                            {\n");
      out.write("                                flag=false;\n");
      out.write("                                alert(\"Either chnge Drug or over ruled Interaction.\")\n");
      out.write("                                break;\n");
      out.write("                            }\n");
      out.write("                    }\n");
      out.write("                return flag;\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("       ");
 
        ArrayList b1=new ArrayList();
        String patientId="no";
        String doseId="";
        String vId="";
        String patientName="";
        if(request.getAttribute("data")!=null)   
        b1=(ArrayList) request.getAttribute("data");
        
        ArrayList b2=new ArrayList();
        if(request.getAttribute("data1")!=null)   
        b2=(ArrayList) request.getAttribute("data1");
        
        ArrayList b3=new ArrayList();
        if(request.getAttribute("data2")!=null)   
        b3=(ArrayList) request.getAttribute("data2");
        
        if(request.getParameter("patientId")!=null)
            patientId=request.getParameter("patientId");
        
        if(request.getParameter("patientName")!=null)
            patientName=request.getParameter("patientName");
        
        if(request.getParameter("doseId")!=null)
            doseId=request.getParameter("doseId");
      
        if(request.getParameter("vId")!=null)
            vId=request.getParameter("vId");
       int s=b1.size();
     
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/adminMenu.jsp", out, false);
      out.write("\n");
      out.write("        <div class=\"wrapper col5\">\n");
      out.write("        <div id=\"container\">\n");
      out.write("            <div id=\"breadcrumb\">\n");
      out.write("                <p>Interaction Information</p>\n");
      out.write("            </div>\n");
      out.write("            <form method=\"get\" action=\"pre-Diagnous.jsp\" id=\"form34\" name=\"formIL\" onsubmit=\" return trySubmit(");
      out.print(s);
      out.write(");\" >\n");
      out.write("                <input type=\"submit\" value=\"okkk\"></input>\n");
      out.write("                <div align=\"center\">\n");
      out.write("                    <input type=\"text\" name=\"txtvaccineid\" value=\"");
      out.print(vId);
      out.write("\">\n");
      out.write("                    <input type=\"text\" name=\"txtdoseid\" value=\"");
      out.print(doseId);
      out.write("\">\n");
      out.write("                    <input type=\"text\" name=\"txtpid\" value=\"");
      out.print(patientId);
      out.write("\">\n");
      out.write("                    <label>");
      out.print(patientName);
      out.write("</label><br></br>\n");
      out.write("                    <input type=\"text\" name=\"patientName\" value=\"");
      out.print(patientName);
      out.write("\">\n");
      out.write("                    <label>Drug Interaction</label>\n");
      out.write("                    <table border=\"1\">\n");
      out.write("                        <tr>\n");
      out.write("                                <th>Interaction Id</th>\n");
      out.write("                                <th>Vaccine Id</th>\n");
      out.write("                                <th>Drug Id</th>\n");
      out.write("                                <th>Drug Name</th>\n");
      out.write("                                <th>Description</th>\n");
      out.write("                                <th>OverRule</th>\n");
      out.write("                                <th>Change</th>\n");
      out.write("                         </tr>\n");
      out.write("                            \n");
      out.write("                        ");

                        String iid="";
                        String vid="";
                        String did="";
                        for(int i=0;i<b1.size();i++)
                        {
                           String Idetails[]=b1.get(i).toString().split(":");
                        
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                ");

                                for(int j=0;j<Idetails.length;j++)
                                {
                                    if(j==0)
                                    {
                                        iid=Idetails[0];
                                    }
    
      out.write("\n");
      out.write("                                \n");
      out.write("                                <td>\n");
      out.write("                                    ");
      out.print(Idetails[j]);
      out.write("\n");
      out.write("                                </td>\n");
      out.write("                                \n");
      out.write("                                ");

                                }
                                   
                                
      out.write("\n");
      out.write("                                <td><input type=\"checkbox\" onchange=\"overRuled(this);\" id=\"chk");
      out.print(i);
      out.write("\"></input></td>\n");
      out.write("                         <td><a href=\"changeDrug?mId=");
      out.print(Idetails[Idetails.length-1]);
      out.write("\">Change</a></td>     \n");
      out.write("                            </tr>\n");
      out.write("                                                        \n");
      out.write("                        ");
}

      out.write("\n");
      out.write("                    </table>\n");
      out.write("                           <label style=\"font-size:12\">Food Interaction</label>\n");
      out.write("                    <table border=\"1\">\n");
      out.write("                        <tr>\n");
      out.write("                            <th>Interaction Id</th>    \n");
      out.write("                            <th>Description</th>\n");
      out.write("                        </tr>\n");
      out.write("                            \n");
      out.write("                        ");

                        String iid2="";
                        for(int i=0;i<b2.size();i++)
                        {
                           String Idetails[]=b2.get(i).toString().split(":");
                        
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                        ");

                                for(int j=0;j<Idetails.length;j++)
                                {
                                    if(j==0)
                                    {
                                        iid2=Idetails[0];
                                    }
                        
      out.write("\n");
      out.write("                              \n");
      out.write("                                <td>\n");
      out.write("                                    ");
      out.print(Idetails[j]);
      out.write("\n");
      out.write("                                </td>\n");
      out.write("                           \n");
      out.write("                                ");

                               }
                                
      out.write("\n");
      out.write("                         \n");
      out.write("                             </tr>\n");
      out.write("                        ");

}

      out.write("\n");
      out.write("                    </table>\n");
      out.write("                    <label align=\"left\" style=\"font-size:12\">Allergy Interaction</label>\n");
      out.write("                    <table border=\"1\">\n");
      out.write("                        <tr>\n");
      out.write("                            <th>Interaction Id</th>    \n");
      out.write("                            <th>Description</th>\n");
      out.write("                        </tr>\n");
      out.write("                            \n");
      out.write("                        ");

                        String iid3="";
                        for(int i=0;i<b3.size();i++)
                        {
                           
                            String Idetails[]=b3.get(i).toString().split(":");
                        
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                ");

                                for(int j=0;j<Idetails.length;j++)
                                {
                                    if(j==0)
                                    {
                                        iid3=Idetails[0];
                                    }
    
      out.write("\n");
      out.write("                               \n");
      out.write("                                    <td>\n");
      out.write("                                    ");
      out.print(Idetails[j]);
      out.write("\n");
      out.write("                                    </td>\n");
      out.write("                                ");

                                }
                                
      out.write("                  \n");
      out.write("                         </tr>\n");
      out.write("                         ");
}
      out.write("\n");
      out.write("                          </table>\n");
      out.write("               \n");
      out.write("                            <table>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td><input style=\"font-weight: bold;\" type=\"submit\" class=\"Next\"  id=\"Next\" value=\"submit\"></td>\n");
      out.write("                                    <td><a href=\"\"><input type =\"button\" class=\"Back\" id=\"Back\" value=\"Back\" style=\"font-weight: bold;\"></a></td>\n");
      out.write("                                </tr>\n");
      out.write("                            </table>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("            \n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("            </body>\n");
      out.write("    ");
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
