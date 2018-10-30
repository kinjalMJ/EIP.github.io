package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Registration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("    <title></title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/layout.css\" type=\"text/css\" />\n");
      out.write("    <script language=\"javascript\" type=\"text/javascript\"> \n");
      out.write("  <!--  function checkCptcha()\n");
      out.write("            {\n");
      out.write("                xmlHttp=GetXmlHttpObject();\n");
      out.write("                if(xmlHttp==null)\n");
      out.write("                    {\n");
      out.write("                        alert (\"Browser does not support HTTP Request\")\n");
      out.write("                        return\n");
      out.write("                    }\n");
      out.write("                    var captcha = document.getElementById(\"captchaCode\").value;\n");
      out.write("                    //alert(captcha);\n");
      out.write("                    var url=\"checkCaptcha.jsp?Captcha=\"+captcha;\n");
      out.write("                    //alert(url);\n");
      out.write("                    xmlHttp.open(\"GET\",url,true);\n");
      out.write("                    xmlHttp.onreadystatechange=UpdateCaptcha;  // function call to update page using retrieved data\n");
      out.write("                    xmlHttp.send(null);\n");
      out.write("            }\n");
      out.write("            function UpdateCaptcha()\n");
      out.write("            {\n");
      out.write("                if(xmlHttp.readyState==4 || xmlHttp.readyState==\"complete\")\n");
      out.write("                {\n");
      out.write("                    //alert(\"in ready state 4 page\");\n");
      out.write("                    if(xmlHttp.status==200)\n");
      out.write("                    {\n");
      out.write("                            var newStatus=xmlHttp.responseText;\n");
      out.write("                            //alert(newStatus);\n");
      out.write("                            document.getElementById(\"txtCaptcha\").innerHTML=newStatus;\n");
      out.write("                            if((newStatus.trim()).length>0)\n");
      out.write("                                {\n");
      out.write("                                    document.getElementById(\"captchaCode\").value=\"\";\n");
      out.write("                                    document.getElementById(\"captchaCode\").focus();\n");
      out.write("                                    //alert(\"Length= \"+newStatus.length);\n");
      out.write("                                }\n");
      out.write("                    }\n");
      out.write("                    else\n");
      out.write("                    {\n");
      out.write("                            alert(\"Error! request status is \"+xmlHttp.status);\n");
      out.write("                    }\n");
      out.write("                }    \n");
      out.write("            }\n");
      out.write("    -->\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write(" \n");
      out.write("</head>\n");
      out.write("<body onload=\"return loadType();\">\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/adminMenu.jsp", out, false);
      out.write("\n");
      out.write("    \n");
      out.write("    <div class=\"wrapper col5\">\n");
      out.write("        <div id=\"container\">\n");
      out.write("            <div id=\"breadcrumb\">\n");
      out.write("                <p>Registration</p>\n");
      out.write("            </div>\n");
      out.write("            <form method=\"get\" action=\"regServlet\" id=\"form1\" name=\"formRe\" onsubmit=\"return validate();\">\n");
      out.write("                <div align=\"center\">\n");
      out.write("                <table cellpadding=\"0\" cellspacing=\"5px\"  style=\"text-align:left\" >\n");
      out.write("                    <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td colspan=\"3\">\n");
      out.write("                        <label style=\"color:#999999\"> You should set username and password with maximum 7 character.</label>\n");
      out.write("                        </td>\n");
      out.write("                        <td></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td> <label for=\"author\">First Name:</label> </td>\n");
      out.write("                        <td> <input type=\"text\" id=\"txtFirstName\" name=\"txtFirstName\" style=\"width:100% ;height: 25px\" autofocus required ></td>\n");
      out.write("                        <td></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td><label for=\"author\">Last Name:</label></td>\n");
      out.write("                        <td><input type=\"text\" id=\"txtLastName\" name=\"txtLastName\" style=\"width:100% ;height: 25px\" required></td>\n");
      out.write("                        <td></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><span class=\"Validation\">*</span></td>\n");
      out.write("                        <td><label for=\"email\">Email:</label> </td>\n");
      out.write("                        <td><input type=\"email\" name=\"txtEmailId\" id=\"txtEmailId\" style=\"width:100% ;height: 25px\" required></td>\n");
      out.write("                        <td></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><span class=\"Validation\">*</span></td>\n");
      out.write("                        <td>Type:</td>\n");
      out.write("                        <td><select id=\"type1\" name=\"tp\" style=\"width:100% ;height: 25px\" required>\n");
      out.write("                                <option value=\"admin\">Admin</option>\n");
      out.write("                                <option value=\"HealthcareProvider\">Healthcare Provider</option>\n");
      out.write("                                <option value=\"Moderator\">Moderator</option>\n");
      out.write("                                <option value=\"Patient\">Patient</option>\n");
      out.write("                            </select></td>\n");
      out.write("                        <td></td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("                        <td><span class=\"Validation\">*</span></td>\n");
      out.write("                        <td><label for=\"url\">Desired UserName:</label> </td>\n");
      out.write("                        <td><input  id=\"un\" type=\"text\" name=\"uname\" autocomplete=\"off\" maxlength=\"7\" style=\"width:100% ;height: 25px\" required ></td>\n");
      out.write("                        <td><label name=\"txtUname\" id=\"txtUname\" style=\"color:red\"></label></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><span class=\"Validation\">*</span></td>\n");
      out.write("                        <td><label for=\"url\">Set Password:</label> </td>\n");
      out.write("                        <td><input id=\"ps\" type=\"password\" name=\"pass\" maxlength=\"7\" style=\"width:100% ;height: 25px\" required></td>\n");
      out.write("                        <td><label name=\"txtPass\" id=\"txtPass\" style=\"color:red\"></label></td>                      \n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><span class=\"Validation\">*</span></td>\n");
      out.write("                        <td><label for=\"url\"> Re-enter Password:</label> </td>\n");
      out.write("                        <td><input id=\"rps\" type=\"password\" name=\"rpass\" maxlength=\"7\"  style=\"width:100% ;height: 25px\"  required ></td>\n");
      out.write("                        <td><label name=\"txtRpass\" id=\"txtRpass\" style=\"color:red\"></label> </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><span class=\"Validation\">*</span></td>\n");
      out.write("                        <td><label for=\"city\">City:</label> </td>\n");
      out.write("                        <td><input type=\"text\" name=\"txtCity\" id=\"txtCity\" style=\"width:100% ;height: 25px\" required></td>\n");
      out.write("                        <td></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td><img src=\"displayCaptcha\" border=\"0\" width=\"100%\"></td>\n");
      out.write("                        <td></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><span class=\"Validation\">*</span></td>\n");
      out.write("                        <td><label>Enter the verification code:</label></td>\n");
      out.write("                        <td><input type=\"text\" name=\"captchaCode\" id=\"captchaCode\"  placeholder=\"Type above coad here.\" style=\"width:100% ;height: 25px\" onblur=\"checkCptcha();\" required/></td>\n");
      out.write("                        <td><label name=\"txtCaptcha\" id=\"txtCaptcha\" style=\"color:red\"></label> </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td colspan=\"2\">\n");
      out.write("                            <table>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td><input style=\"font-weight: bold;\" type=\"submit\" class=\"submitbtn\"  id=\"submit\" value=\"Register\" /></td>\n");
      out.write("                                    <td><input type=\"button\" name=\"reset\" id=\"reset\" value=\"Reset\" class=\"submitbtn\" onclick=\"reForm();\"/></td>\n");
      out.write("                                </tr>\n");
      out.write("                            </table>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                </table> \n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </div> \n");
      out.write("</body>\n");
      out.write("</html>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/FooterPage.jsp", out, false);
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
