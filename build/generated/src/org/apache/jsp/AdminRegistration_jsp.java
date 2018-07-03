package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;

public final class AdminRegistration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \n");
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
      out.write("          ");

    if(request.getParameter("page")!=null)
        out.println(request.getParameter("page"));
  
      out.write("\n");
      out.write("    ");
 
         ArrayList a1=new ArrayList();
         String fn="",ln="",gen="",bd="",bg="",ed="",ex="",mn="",eid="",cty="",des="";
          String valM="";
          String valF="";
          String operation="";
          String uid="";
         if(request.getAttribute("data")!=null)
        {
             operation="edit";
             
             if(request.getParameter("uid")!=null)
                 uid=request.getParameter("uid");
             
           a1= (ArrayList)request.getAttribute("data");
           //out.println(a1);
           fn= a1.get(0).toString();
           ln= a1.get(1).toString();
           gen= a1.get(2).toString();
           if(gen.equalsIgnoreCase("male"))
           valM="checked";
           if(gen.equalsIgnoreCase("female"))
           valF="checked";
       
           bd= a1.get(3).toString();
           bg= a1.get(4).toString();
           ed= a1.get(5).toString();
           ex= a1.get(6).toString();
           mn= a1.get(7).toString();
           eid= a1.get(8).toString();
           cty= a1.get(9).toString();
           des= a1.get(10).toString();
          // editadmin
        }
    
      out.write("\n");
      out.write("    <script lang=\"javascript\">\n");
      out.write("        \n");
      out.write("        function GetXmlHttpObject()   // function to load object\n");
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
      out.write("   function getUserName()\n");
      out.write("    {\n");
      out.write("         xmlHttp=GetXmlHttpObject();  \n");
      out.write("                if (xmlHttp==null)\n");
      out.write("                {\n");
      out.write("                alert (\"Browser does not support HTTP Request\")\n");
      out.write("                    return;\n");
      out.write("                }\n");
      out.write("                alert(\"in funmmmm\");\n");
      out.write("                var un=document.getElementById(\"un\").value;\n");
      out.write("                alert(un);\n");
      out.write("                var url=\"userNameADB.jsp?un=\"+escape(un);\n");
      out.write("                xmlHttp.open(\"GET\",url,true);  \n");
      out.write("                xmlHttp.onreadystatechange=displayUserName;  \n");
      out.write("                xmlHttp.send(null);\n");
      out.write("        \n");
      out.write("    }\n");
      out.write("     function displayUserName()\n");
      out.write("    {\n");
      out.write("                if(xmlHttp.readyState==4 || xmlHttp.readyState==\"complete\")\n");
      out.write("                {\n");
      out.write("                if(xmlHttp.status==200)\n");
      out.write("                {       alert(\"in displayUserName\");\n");
      out.write("                       var newStatus=xmlHttp.responseText;\n");
      out.write("                   if(newStatus.trim().length>0)\n");
      out.write("                     {\n");
      out.write("                      document.getElementById(\"txtUname\").innerHTML=newStatus;\n");
      out.write("                      document.getElementById(\"un\").value=\"\";\n");
      out.write("                       document.getElementById(\"un\").focus();\n");
      out.write("                     }\n");
      out.write("                     else\n");
      out.write("                         document.getElementById(\"txtUname\").innerHTML=\"\";  \n");
      out.write("                }\n");
      out.write("                else\n");
      out.write("                {\n");
      out.write("                    alert(xmlHttp.status);\n");
      out.write("                }\n");
      out.write("                }\n");
      out.write("   \n");
      out.write("    }\n");
      out.write("    function checkCptcha()\n");
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
      out.write("//////////////////////////////////////////////////////////////////////////////\n");
      out.write("\n");
      out.write("function trim(s)\n");
      out.write("{\n");
      out.write("  return s.replace(/^\\s+|\\s+$/, '');\n");
      out.write("} \n");
      out.write("\n");
      out.write("function validateEmail(fld) {\n");
      out.write("    var error=\"\";\n");
      out.write("    var tfld = trim(fld.value);                        // value of field with whitespace trimmed off\n");
      out.write("    var emailFilter = /^[^@]+@[^@.]+\\.[^@]*\\w\\w$/ ;\n");
      out.write("    var illegalChars= /[\\(\\)\\<\\>\\,\\;\\:\\\\\\\"\\[\\]]/ ;\n");
      out.write("    \n");
      out.write("    if (fld.value == \"\") {\n");
      out.write("        fld.style.background = 'Yellow';\n");
      out.write("        error = \"You didn't enter an email address.\\n\";\n");
      out.write("    } else if (!emailFilter.test(tfld)) {              //test email for illegal characters\n");
      out.write("        fld.style.background = 'Yellow';\n");
      out.write("        error = \"Please enter a valid email address.\\n\";\n");
      out.write("    } else if (fld.value.match(illegalChars)) {\n");
      out.write("        fld.style.background = 'Yellow';\n");
      out.write("        error = \"The email address contains illegal characters.\\n\";\n");
      out.write("    } else {\n");
      out.write("        fld.style.background = 'White';\n");
      out.write("    }\n");
      out.write("    return error;\n");
      out.write("}\n");
      out.write("function checkPass()\n");
      out.write("{\n");
      out.write(" alert(\"in fun\");\n");
      out.write("    var error=\"\";\n");
      out.write("    var pass=document.getElementById(\"ps\").value;\n");
      out.write("     var rpass=document.getElementById(\"rps\").value;\n");
      out.write("     if(pass==rpass)\n");
      out.write("         {  \n");
      out.write("           alert(\"password is matched \"+pass1);\n");
      out.write("                //document.getElementById(\"error\").innerHTML=\"\";\n");
      out.write("                            \n");
      out.write("         }\n");
      out.write("     else\n");
      out.write("     {\n");
      out.write("           alert(\"password not match\");\n");
      out.write("            document.getElementById(\"txtRpass\").innerHTML=\"please enter Re-Password as Password\";\n");
      out.write("           document.getElementById(\"rps\").value=\"\";\n");
      out.write("           document.getElementById(\"rps\").focus();\n");
      out.write("      \n");
      out.write("   }                          \n");
      out.write("}\n");
      out.write("    </script>    \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/adminMenu.jsp", out, false);
      out.write("\n");
      out.write("        <div class=\"wrapper col5\">\n");
      out.write("        <div id=\"container\">\n");
      out.write("            <div id=\"breadcrumb\">\n");
      out.write("                <p>Registration</p>\n");
      out.write("            </div>\n");
      out.write("            <form method=\"get\" action=\"adminServlet\" id=\"form12\" name=\"formAR\" >\n");
      out.write("                <div align=\"center\">\n");
      out.write("                    <input type=\"hidden\" name =\"example\" value=\"");
      out.print(operation);
      out.write("\">\n");
      out.write("                    <input type=\"hidden\" name =\"uid\" value=\"");
      out.print(uid);
      out.write("\">\n");
      out.write("                    </input>\n");
      out.write("                    <table cellpadding=\"0\" cellspacing=\"5px\"  style=\"text-align:left\" >\n");
      out.write("                 \n");
      out.write("                    <tr>\n");
      out.write("                        <td><span class=\"Validation\">*</span></td>\n");
      out.write("                        <td> <label for=\"author\">First Name:</label> </td>\n");
      out.write("                        <td> <input type=\"text\" id=\"txtFirstName\" name=\"txtFirstName\" value=\"");
      out.print(fn);
      out.write("\" style=\"width:100% ;height: 25px\" autofocus required ></td>\n");
      out.write("                        <td></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><span class=\"Validation\">*</span></td>\n");
      out.write("                        <td><label for=\"author\">Last Name:</label></td>\n");
      out.write("                        <td><input type=\"text\" id=\"txtLastName\" name=\"txtLastName\" value=\"");
      out.print(ln);
      out.write("\" style=\"width:100% ;height: 25px\" required></td>\n");
      out.write("                        <td></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                            <td></td>\n");
      out.write("                            <td><label>Gender:</label> </td>\n");
      out.write("                            <td colspan=\"2\">\n");
      out.write("                                <table>\n");
      out.write("                                    <tr><td><input type=\"radio\" name=\"txtgender\"  value=\"male\"  ");
      out.print(valM);
      out.write(" required> Male</td>\n");
      out.write("                                        <td><input type=\"radio\" name=\"txtgender\"  value=\"Female\"  ");
      out.print(valF);
      out.write(" required> Female</td>                               \n");
      out.write("                                    </tr>\n");
      out.write("                                </table>\n");
      out.write("                            </td>\n");
      out.write("                    </tr>\n");
      out.write("                   \n");
      out.write("                    <tr>\n");
      out.write("                        <td><span class=\"Validation\">*</span></td>\n");
      out.write("                        <td><label>Birth Date: </label> </td>\n");
      out.write("                        <td><input type=\"Date\" id=\"txtBirthDate\" name=\"txtBirthDate\" value=\"");
      out.print(bd);
      out.write("\"  style=\"width:100% ;height: 25px\" required></input></td>           \n");
      out.write("                        <td></td>\n");
      out.write("                   </tr> \n");
      out.write("                   <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td><label>Blood Group: </label> </td>\n");
      out.write("                        <td><input type=\"text\" id=\"txtBloodGroup\" name=\"txtBloodGroup\" value=\"");
      out.print(bg);
      out.write("\" style=\"width:100% ;height: 25px\"required ></input></td>           \n");
      out.write("                        <td></td>\n");
      out.write("                   </tr>\n");
      out.write("                   <tr>\n");
      out.write("                        <td><span class=\"Validation\">*</span></td>\n");
      out.write("                        <td>Type:</td>\n");
      out.write("                        <td><select id=\"type\" name=\"type\" style=\"width:100% ;height: 25px\" required>\n");
      out.write("                                <option value=\"superadmin\">SuperAdmin</option>\n");
      out.write("                                <option value=\"subadmin\">SubAdmin</option>\n");
      out.write("                                <option value=\"Moderator\">Moderator</option>\n");
      out.write("                                \n");
      out.write("                            </select></td>\n");
      out.write("                        <td></td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                   <tr>\n");
      out.write("                        <td><span class=\"Validation\">*</span></td>\n");
      out.write("                        <td><label>Education: </label> </td>\n");
      out.write("                        <td><input type=\"text\" id=\"txtEducation\" name=\"txtEducation\" value=\"");
      out.print(ed);
      out.write("\" style=\"width:100% ;height: 25px\" required></input></td>           \n");
      out.write("                        <td></td>\n");
      out.write("                   </tr>\n");
      out.write("                    \n");
      out.write("                   <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td><label>Experience: </label> </td>\n");
      out.write("                        <td><input type=\"text\" id=\"txtExperience\" name=\"txtExperience\" value=\"");
      out.print(ex);
      out.write("\"  style=\"width:100% ;height: 25px\" required ></input></td>           \n");
      out.write("                        <td></td>\n");
      out.write("                   </tr>\n");
      out.write("    \n");
      out.write("                   <tr>\n");
      out.write("                        <td><span class=\"Validation\">*</span></td>\n");
      out.write("                        <td><label>MobileNo: </label> </td>\n");
      out.write("                        <td><input type=\"numeric\" id=\"txtMobileNo\" name=\"txtMobileNo\" value=\"");
      out.print(mn);
      out.write("\" maxlength=\"10\" style=\"width:100% ;height: 25px\" required></input></td>           \n");
      out.write("                        <td></td>\n");
      out.write("                   </tr>\n");
      out.write("                   \n");
      out.write("                   <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td><label>City: </label> </td>\n");
      out.write("                        <td><input type=\"text\" id=\"txtCity\" name=\"txtCity\" value=\"");
      out.print(cty);
      out.write("\" style=\"width:100% ;height: 25px\"required ></input></td>           \n");
      out.write("                        <td></td>\n");
      out.write("                   </tr>                 \n");
      out.write("                   <tr>\n");
      out.write("                        <td><span class=\"Validation\">*</span></td>\n");
      out.write("                        <td><label for=\"email\">Email:</label> </td>\n");
      out.write("                        <td><input type=\"email\" name=\"txtEmailId\" id=\"txtEmailId\"  value=\"");
      out.print(eid);
      out.write("\" style=\"width:100% ;height: 25px\" onblur=\"validateEmail();\" required></td>\n");
      out.write("                        <td></td>\n");
      out.write("                   </tr>\n");
      out.write("                   <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td><label>Description: </label> </td>\n");
      out.write("                        <td><input type=\"text\" id=\"txtDescription\" name=\"txtDescription\" value=\"");
      out.print(des);
      out.write("\" style=\"width:100% ;height: 25px\" ></input></td>           \n");
      out.write("                        <td></td>\n");
      out.write("                   </tr>\n");
      out.write("                   ");
 
                 if(request.getAttribute("data")==null)
           {  
    
      out.write("\n");
      out.write("                   <tr>\n");
      out.write("                        <td><span class=\"Validation\">*</span></td>\n");
      out.write("                        <td><label for=\"url\">Desired UserName:</label> </td>\n");
      out.write("                        <td><input  id=\"un\" type=\"text\" name=\"uname\" autocomplete=\"off\" onblur=\"getUserName();\" maxlength=\"7\" style=\"width:100% ;height: 25px\" required ></td>\n");
      out.write("                        <td><label name=\"txtUname\" id=\"txtUname\" style=\"color:red\"></label></td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("                        <td><span class=\"Validation\">*</span></td>\n");
      out.write("                        <td><label for=\"url\">Set Password:</label> </td>\n");
      out.write("                        <td><input id=\"ps\" type=\"password\" name=\"pass\" maxlength=\"7\" style=\"width:100% ;height: 25px\" required></td>\n");
      out.write("                        <td><label name=\"txtPass\" id=\"txtPass\" style=\"color:red\"></label></td>                      \n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><span class=\"Validation\">*</span></td>\n");
      out.write("                        <td><label for=\"url\"> Re-enter Password:</label> </td>\n");
      out.write("                        <td><input id=\"rps\" type=\"password\" name=\"rpass\" maxlength=\"7\" onblur=\"checkPass()\" style=\"width:100% ;height: 25px\"  required ></td>\n");
      out.write("                        <td><label name=\"txtRpass\" id=\"txtRpass\" style=\"color:red\"></label> </td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                   <tr>\n");
      out.write("                        <td><span class=\"Validation\">*</span></td>\n");
      out.write("                        <td>Captcha</td>\n");
      out.write("                        <td><img src=\"displayCaptcha\" border=\"0\" width=\"100%\"></td>\n");
      out.write("                        <td></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><span class=\"Validation\">*</span></td>\n");
      out.write("                        <td><label>Enter the verification code:</label></td>\n");
      out.write("                        <td><input type=\"text\" name=\"captchaCode\" id=\"captchaCode\"  placeholder=\"Type above coad here.\" style=\"width:100% ;height: 25px\" onblur=\"checkCptcha();\" required/></td>\n");
      out.write("                        <td><label name=\"txtCaptcha\" id=\"txtCaptcha\" style=\"color:red\"></label> </td>\n");
      out.write("                    </tr>\n");
      out.write("                ");
 } 
          
      out.write("    \n");
      out.write("                   <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td colspan=\"2\">\n");
      out.write("                            <table>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td><input style=\"font-weight: bold;\" type=\"submit\" class=\"submitbtn\"  id=\"submit\" value=\"Submit\" /></td>\n");
      out.write("                                    <td><input type=\"button\" name=\"reset\" id=\"reset\" value=\"Reset\" class=\"submitbtn\" /></td>\n");
      out.write("    ");
                               if(request.getAttribute("data")!=null)
                                     {
    
      out.write("\n");
      out.write("            <td>   \n");
      out.write("                <a href=\"adminList\"><input type=\"button\" name=\"Back\" id=\"Back\" value=\"Back\" class=\"submitbtn\" /></a></td>\n");
      out.write("   \n");
      out.write("    ");
  }                               
                                    if(request.getAttribute("data")==null) {
    
      out.write("\n");
      out.write("              \n");
      out.write("    <td> <a href=\"newRegistration.jsp\"><input type=\"button\" name=\"Back\" id=\"Back\" value=\"Back\" class=\"submitbtn\" /></a></td>\n");
      out.write("   ");
  } 
      out.write("\n");
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
