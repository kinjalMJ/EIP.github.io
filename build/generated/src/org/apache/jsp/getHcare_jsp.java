package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class getHcare_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("          <script lang=\"javascript\">\n");
      out.write("  \n");
      out.write("  function GetXmlHttpObject()   // function to load object\n");
      out.write("   {\n");
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
      out.write("   }\n");
      out.write("       function getHcare()\n");
      out.write("       {\n");
      out.write("       \n");
      out.write("         xmlHttp=GetXmlHttpObject();  // function call to load object\n");
      out.write("                if (xmlHttp==null)\n");
      out.write("                {\n");
      out.write("               // alert (\"Browser does not support HTTP Request\")\n");
      out.write("                    return;\n");
      out.write("                }\n");
      out.write("              // var uname=document.myForm.uname.value;\n");
      out.write("                var cn=document.getElementById(\"txtHcareName\").value;\n");
      out.write("            //    alert(\"txtVaccineName\",+vn);\n");
      out.write("                var url=\"GetNameDB.jsp?cn1=\"+escape(cn);\n");
      out.write("\n");
      out.write("                xmlHttp.open(\"GET\",url,true);  \n");
      out.write("                xmlHttp.onreadystatechange=displayhcare;  // function call to update page using retrieved data\n");
      out.write("                xmlHttp.send(null);\n");
      out.write("        }\n");
      out.write("//-------------------------------------\n");
      out.write("    function displayhcare()\n");
      out.write("    {\n");
      out.write("             // alert(\"in type data function ready state: \"+xmlHttp.readyState)\n");
      out.write("                if(xmlHttp.readyState==4 || xmlHttp.readyState==\"complete\")\n");
      out.write("                {\n");
      out.write("               //    alert(\"in ready state 4 page\");\n");
      out.write("                if(xmlHttp.status==200)\n");
      out.write("                {\n");
      out.write("                       var newStatus=xmlHttp.responseText;\n");
      out.write("                 //      alert(\"newStatus: \"+newStatus);\n");
      out.write("                       \n");
      out.write("                       var ind1=newStatus.indexOf(\"[\");\n");
      out.write("                       var ind2=newStatus.indexOf(\"]\");\n");
      out.write("                       newStatus=newStatus.substring(ind1+1,ind2);\n");
      out.write("                       var data=newStatus.split(\",\")\n");
      out.write("                       var optn=document.getElementById(\"txtHcareName\");\n");
      out.write("                       for(var i=0;i<data.length;i++)\n");
      out.write("                       {\n");
      out.write("                        var cn=data[i].split(\"$\");\n");
      out.write("                        optn[i]=new Option(cn[1],cn[0]);\n");
      out.write("                       }\n");
      out.write("                       \n");
      out.write("                       var cn=document.getElementById(\"txtHcareName\");\n");
      out.write("                      // alert(\"sub=\"+sub);\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("                else\n");
      out.write("                    {\n");
      out.write("                        alert(xmlHttp.status);\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("   \n");
      out.write("    } \n");
      out.write("          </script>\n");
      out.write("    </head>\n");
      out.write("    <body onload=\"getHcare();\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/adminMenu.jsp", out, false);
      out.write("\n");
      out.write("        <div class=\"wrapper col5\">\n");
      out.write("        <div id=\"container\">\n");
      out.write("            <div id=\"breadcrumb\">\n");
      out.write("                <p>Search Patient</p>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("                <form id=\"form23\" action=\"HcareNameCall.jsp\">\n");
      out.write("                    <div align=\"center\">\n");
      out.write("                    <table cellpadding=\"0\" cellspacing=\"5px\"  style=\"text-align:left\" >\n");
      out.write("                        \n");
      out.write("                        <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        \n");
      out.write("                            <td> <label for=\"author\">Health Care Provider Name:</label> </td>\n");
      out.write("                       <td>\n");
      out.write("                           <select id=\"txtHcareName\" style=\"width:100% ;height: 25px\" name=\"txtHcareName\" autofocus required >\n");
      out.write("                           </select>\n");
      out.write("                           <td><input type=\"submit\" name=\"search\" id=\"search\" value=\"search\" class=\"submitbtn\" /></td>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                        \n");
      out.write("             </table>\n");
      out.write("                    </div>\n");
      out.write("                     </form>\n");
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
