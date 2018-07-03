package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;

public final class Drug_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" \n");
      out.write("\n");
      out.write("   \n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/HeaderPage.jsp", out, false);
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title></title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/layout.css\" type=\"text/css\" />\n");
      out.write("         ");
 
         ArrayList a1=new ArrayList();
         String dn="",des="";
          String operation="";
          String Did="";
         if(request.getAttribute("data")!=null)
        {
             operation="edit";
             
             if(request.getParameter("Did")!=null)
                 Did=request.getParameter("Did");
             
           a1= (ArrayList)request.getAttribute("data");
           //out.println(a1);
           dn= a1.get(0).toString();
           des= a1.get(1).toString();
        }
    
      out.write("\n");
      out.write("     <script lang=\"javascript\">\n");
      out.write("       \n");
      out.write("      function GetXmlHttpObject()   \n");
      out.write("      {\n");
      out.write("       var xmlHttp=null;\n");
      out.write("                try\n");
      out.write("                {\n");
      out.write("                // Firefox, Opera 8.0+, Safari, Chrome\n");
      out.write("                xmlHttp=new XMLHttpRequest();\n");
      out.write("                }\n");
      out.write("                catch (e)\n");
      out.write("                {\n");
      out.write("                //Internet Explorer\n");
      out.write("                try\n");
      out.write("                {\n");
      out.write("                xmlHttp=new ActiveXObject(\"Msxml2.XMLHTTP\");\n");
      out.write("                }\n");
      out.write("                catch (e)\n");
      out.write("                {\n");
      out.write("                xmlHttp=new ActiveXObject(\"Microsoft.XMLHTTP\");\n");
      out.write("                }\n");
      out.write("                }\n");
      out.write("                return xmlHttp;\n");
      out.write("      }\n");
      out.write("       function getDrugName()\n");
      out.write("    {\n");
      out.write("         xmlHttp=GetXmlHttpObject();  \n");
      out.write("                if (xmlHttp==null)\n");
      out.write("                {\n");
      out.write("//                alert (\"Browser does not support HTTP Request\")\n");
      out.write("                    return;\n");
      out.write("                }\n");
      out.write("            //    alert(\"in funmmmm\");\n");
      out.write("                var dn=document.getElementById(\"txtDrugName\").value;\n");
      out.write("                alert(dn);\n");
      out.write("                var url=\"drugNameDB.jsp?dn=\"+escape(dn);\n");
      out.write("                xmlHttp.open(\"GET\",url,true);  \n");
      out.write("                xmlHttp.onreadystatechange=displayDrugName;  \n");
      out.write("                xmlHttp.send(null);\n");
      out.write("        \n");
      out.write("    }\n");
      out.write("     function displayDrugName()\n");
      out.write("    {\n");
      out.write("                if(xmlHttp.readyState==4 || xmlHttp.readyState==\"complete\")\n");
      out.write("                {\n");
      out.write("                if(xmlHttp.status==200)\n");
      out.write("                {   \n");
      out.write("                    //alert(\"in displayDrugName\");\n");
      out.write("                       var newStatus=xmlHttp.responseText;\n");
      out.write("                   if(newStatus.trim().length>0)\n");
      out.write("                     {\n");
      out.write("                      document.getElementById(\"dn\").innerHTML=newStatus;\n");
      out.write("                      document.getElementById(\"txtDrugName\").value=\"\";\n");
      out.write("                       document.getElementById(\"txtDrugName\").focus();\n");
      out.write("                     }\n");
      out.write("                     else\n");
      out.write("                         document.getElementById(\"dn\").innerHTML=\"\";  \n");
      out.write("                }\n");
      out.write("                else\n");
      out.write("                {\n");
      out.write("                    //alert(xmlHttp.status);\n");
      out.write("                }\n");
      out.write("                }\n");
      out.write("   \n");
      out.write("    }\n");
      out.write("    </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/adminMenu.jsp", out, false);
      out.write("\n");
      out.write("        <div class=\"wrapper col5\">\n");
      out.write("        <div id=\"container\">\n");
      out.write("            <div id=\"breadcrumb\">\n");
      out.write("                <p>Drug Infomation</p>\n");
      out.write("            </div>\n");
      out.write("            <form method=\"get\" action=\"drugServlet\" id=\"form24\" name=\"formDrugD\" >\n");
      out.write("                <div align=\"center\">\n");
      out.write("                <input type=\"hidden\" name =\"example\" value=\"");
      out.print(operation);
      out.write("\">\n");
      out.write("                <input type=\"hidden\" name =\"Did\" value=\"");
      out.print(Did);
      out.write("\">\n");
      out.write("                </input>\n");
      out.write("               \n");
      out.write("                <table cellpadding=\"0\" cellspacing=\"5px\"  style=\"text-align:left\" >\n");
      out.write("                    <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td> <label for=\"author\">Drug Name:</label> </td>\n");
      out.write("                        <td> <input type=\"text\" id=\"txtDrugName\" name=\"txtDrugName\" value=\"");
      out.print(dn);
      out.write("\" onblur=\"getDrugName();\" style=\"width:100% ;height: 25px\" autofocus required ></td>\n");
      out.write("                        <td></td>\n");
      out.write("                    </tr>\n");
      out.write("                     <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td><label>Description: </label> </td>\n");
      out.write("                        <td><input type=\"text\" id=\"txtDescription\" name=\"txtDescription\" value=\"");
      out.print(des);
      out.write("\" style=\"width:100% ;height: 25px\" ></input></td>           \n");
      out.write("                        <td></td>\n");
      out.write("                   </tr>\n");
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
      out.write("\n");
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
