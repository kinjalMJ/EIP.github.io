package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class vaccineInteraction_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/HeaderPage.jsp", out, false);
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title></title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/layout.css\" type=\"text/css\" />\n");
      out.write("        <script lang=\"javascript\">\n");
      out.write("                function GetXmlHttpObject()   // function to load object\n");
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
      out.write("\n");
      out.write("                \n");
      out.write("       function getvn()\n");
      out.write("       {\n");
      out.write("       \n");
      out.write("         xmlHttp=GetXmlHttpObject();  // function call to load object\n");
      out.write("                if (xmlHttp==null)\n");
      out.write("                {\n");
      out.write("               // alert (\"Browser does not support HTTP Request\")\n");
      out.write("                    return;\n");
      out.write("                }\n");
      out.write("              // var uname=document.myForm.uname.value;\n");
      out.write("                var vn=document.getElementById(\"txtVaccineName\").value;\n");
      out.write("            //    alert(\"txtVaccineName\",+vn);\n");
      out.write("                var url=\"interactionServletDB.jsp?vn1=\"+escape(vn);\n");
      out.write("\n");
      out.write("                xmlHttp.open(\"GET\",url,true);  \n");
      out.write("                xmlHttp.onreadystatechange=displayvn;  // function call to update page using retrieved data\n");
      out.write("                xmlHttp.send(null);\n");
      out.write("        }\n");
      out.write("//-------------------------------------\n");
      out.write("    function displayvn()\n");
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
      out.write("                       var optn=document.getElementById(\"txtVaccineName\");\n");
      out.write("                       for(var i=0;i<data.length;i++)\n");
      out.write("                       {\n");
      out.write("                        var vc=data[i].split(\"$\");\n");
      out.write("                        optn[i]=new Option(vc[1],vc[0]);\n");
      out.write("                       }\n");
      out.write("                       \n");
      out.write("                       var vn=document.getElementById(\"txtVaccineName\");\n");
      out.write("                      // alert(\"sub=\"+sub);\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("                else\n");
      out.write("                    {\n");
      out.write("                        alert(xmlHttp.status);\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("   \n");
      out.write("    }\n");
      out.write("    function getdn()\n");
      out.write("       {\n");
      out.write("              \n");
      out.write("              alert(\"in fun\")\n");
      out.write("              var It=document.getElementById(\"txtVaccineType\").value;\n");
      out.write("                alert(It);\n");
      out.write("                if(It.trim()!=\"Drug\")\n");
      out.write("                  {\n");
      out.write("                      alert(\"in if\");\n");
      out.write("                      document.getElementById(\"txtDrugName\").style.display = 'none';\n");
      out.write("                    //  document.getElementById(one).style.display = 'block';\n");
      out.write("                      document.getElementById(\"txtDN\").style.display = 'none';              \n");
      out.write("                      return;\n");
      out.write("\n");
      out.write("                    }\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                    \n");
      out.write("                \n");
      out.write("            else\n");
      out.write("                {\n");
      out.write("                    document.getElementById('txtDrugName').style.display = \"block\";\n");
      out.write("                    \n");
      out.write("                    document.getElementById('txtDN').style.display = \"block\";              \n");
      out.write("                      \n");
      out.write("                   alert(\"in else\");\n");
      out.write("                \n");
      out.write("         xmlHttp=GetXmlHttpObject();  // function call to load object\n");
      out.write("                if (xmlHttp==null)\n");
      out.write("                {\n");
      out.write("               // alert (\"Browser does not support HTTP Request\")\n");
      out.write("                    return;\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("              // var uname=document.myForm.uname.value;\n");
      out.write("                var dn=document.getElementById(\"txtDrugName\").value;\n");
      out.write("            //    alert(\"txtDrugName\",+dn);\n");
      out.write("                var url=\"interactiondnServletDB.jsp?vn1=\"+escape(dn);\n");
      out.write("\n");
      out.write("                xmlHttp.open(\"GET\",url,true);  \n");
      out.write("                xmlHttp.onreadystatechange=displaydn;  // function call to update page using retrieved data\n");
      out.write("                xmlHttp.send(null);\n");
      out.write("        }}\n");
      out.write("    function displaydn()\n");
      out.write("    {\n");
      out.write("             // alert(\"in type data function ready state: \"+xmlHttp.readyState)\n");
      out.write("                if(xmlHttp.readyState==4 || xmlHttp.readyState==\"complete\")\n");
      out.write("                {\n");
      out.write("                 //  alert(\"in ready state 4 page\");\n");
      out.write("                if(xmlHttp.status==200)\n");
      out.write("                {\n");
      out.write("                       var newStatus=xmlHttp.responseText;\n");
      out.write("                  //     alert(\"newStatus: \"+newStatus);\n");
      out.write("                       \n");
      out.write("                       var ind1=newStatus.indexOf(\"[\");\n");
      out.write("                       var ind2=newStatus.indexOf(\"]\");\n");
      out.write("                       newStatus=newStatus.substring(ind1+1,ind2);\n");
      out.write("                       var data=newStatus.split(\",\")\n");
      out.write("                       var optn=document.getElementById(\"txtDrugName\");\n");
      out.write("                       for(var i=0;i<data.length;i++)\n");
      out.write("                       {\n");
      out.write("                         var vd=data[i].split(\"$\");\n");
      out.write("                         optn[i]=new Option(vd[1],vd[0]);\n");
      out.write("                       }\n");
      out.write("                       var dn=document.getElementById(\"txtDrugName\");\n");
      out.write("                //       alert(\"sub=\"+dn);\n");
      out.write("                }\n");
      out.write("                else\n");
      out.write("                    {\n");
      out.write("                        alert(xmlHttp.status);\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("   \n");
      out.write("\n");
      out.write("    \n");
      out.write("</script>\n");
      out.write("    \n");
      out.write("    </head>\n");
      out.write("    <body onload=\"getvn();\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/adminMenu.jsp", out, false);
      out.write("\n");
      out.write("        <div class=\"wrapper col5\">\n");
      out.write("        <div id=\"container\">\n");
      out.write("            <div id=\"breadcrumb\">\n");
      out.write("                <p>Vaccine Interaction</p>\n");
      out.write("            </div>\n");
      out.write("            <form method=\"get\" action=\"interactionServlet\" id=\"form24\" name=\"formInteraction\" >\n");
      out.write("                <div align=\"center\">\n");
      out.write("                <table cellpadding=\"0\" cellspacing=\"5px\"  style=\"text-align:left\" >\n");
      out.write("                    <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        \n");
      out.write("                            <td> <label for=\"author\">Vaccine Name:</label> </td>\n");
      out.write("                       <td>\n");
      out.write("                           <select id=\"txtVaccineName\" style=\"width:100% ;height: 25px\" name=\"txtVaccineName\" autofocus required ></select>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td> <label for=\"author\">Interaction Type:</label> </td>\n");
      out.write("                        <td>\n");
      out.write("                            <select id=\"txtVaccineType\"  name=\"txtVaccineType\" onchange=\"getdn();\" style=\"width:100% ;height: 25px\" autofocus required >\n");
      out.write("                                \n");
      out.write("                                <option id=\"optn1\" value=\"All\">Allergy</option>\n");
      out.write("                                <option id=\"optn2\" value=\"Drug\">Drug</option>\n");
      out.write("                                <option id=\"optn3\" value=\"Food\">Food</option>\n");
      out.write("                                \n");
      out.write("                            </select>\n");
      out.write("                             \n");
      out.write("                        </td>\n");
      out.write("                        <td></td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");

              
           
                    
      out.write("                                                                                     \n");
      out.write("                    <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td> <label for=\"author\" id=\"txtDN\">Drug Name:</label> </td>\n");
      out.write("                        <td> \n");
      out.write("                            <select id=\"txtDrugName\" name=\"txtDrugName\" style=\"width:100% ;height: 25px\" autofocus required ></select>\n");
      out.write("                        </td>\n");
      out.write("                        <td></td>\n");
      out.write("                    </tr>\n");
      out.write("                     <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td><label>Description: </label> </td>\n");
      out.write("                        <td>\n");
      out.write("                            <textarea id=\"txtDescription\" name=\"txtDescription\" style=\"width:200% ;height: 100px\"  ></textarea> \n");
      out.write("                            </td>           \n");
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
