package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;

public final class ApatientRegistration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        ");

    if(request.getParameter("page")!=null)
        out.println(request.getParameter("page"));
  
      out.write("\n");
      out.write("    ");
 
         ArrayList a1=new ArrayList();
         String fn="",ln="",gen="",bd="",bt="",btu="",bg="",wb="",hb="",heb="",dt="",sym="",des="",cd="";
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
           fn= a1.get(0).toString();
           ln= a1.get(1).toString();
           gen= a1.get(2).toString();
           if(gen.equalsIgnoreCase("male"))
           valM="checked";
           if(gen.equalsIgnoreCase("female"))
           valF="checked";
       
           bd= a1.get(3).toString();
           bt= a1.get(4).toString();
           
      //     btu= a1.get(5).toString();
           bg= a1.get(6).toString();
           wb= a1.get(7).toString();
           hb= a1.get(8).toString();
           heb= a1.get(9).toString();
           dt = a1.get(10).toString();
           sym = a1.get(11).toString();
          // cd= a1.get(12).toString();
       //    des=a1.get(13).toString();
        }
    
      out.write("\n");
      out.write("    \n");
      out.write("    <script lang=\"javascript\">\n");
      out.write("  function GetXmlHttpObject()   \n");
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
      out.write("      function getUserName()\n");
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
      out.write("  function getDoctorName()\n");
      out.write("       {\n");
      out.write("         xmlHttp=GetXmlHttpObject();  \n");
      out.write("                if (xmlHttp==null)\n");
      out.write("                {\n");
      out.write("                alert (\"Browser does not support HTTP Request\")\n");
      out.write("                    return;\n");
      out.write("                }\n");
      out.write("                var dn=document.getElementById(\"txtDoctor\").value;\n");
      out.write("                var url=\"doctorNameDB.jsp?dn1=\"+escape(dn);\n");
      out.write("                xmlHttp.open(\"GET\",url,true);  \n");
      out.write("                xmlHttp.onreadystatechange=displayDoctorName;  \n");
      out.write("                xmlHttp.send(null);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("    function displayDoctorName()\n");
      out.write("    {\n");
      out.write("                if(xmlHttp.readyState==4 || xmlHttp.readyState==\"complete\")\n");
      out.write("                {\n");
      out.write("                if(xmlHttp.status==200)\n");
      out.write("                {\n");
      out.write("                       var newStatus=xmlHttp.responseText;\n");
      out.write("                       var ind1=newStatus.indexOf(\"[\");\n");
      out.write("                       var ind2=newStatus.indexOf(\"]\");\n");
      out.write("                       newStatus=newStatus.substring(ind1+1,ind2);\n");
      out.write("                       var data=newStatus.split(\",\")\n");
      out.write("                       var optn=document.getElementById(\"txtDoctor\");\n");
      out.write("                       for(var i=0;i<data.length;i++)\n");
      out.write("                       {\n");
      out.write("                        var dn=data[i].split(\"$\");\n");
      out.write("                        optn[i]=new Option(dn[1],dn[0]);\n");
      out.write("                       }\n");
      out.write("                       var dn=document.getElementById(\"txtDoctor\");\n");
      out.write("                }\n");
      out.write("                else\n");
      out.write("                {\n");
      out.write("                    alert(xmlHttp.status);\n");
      out.write("                }\n");
      out.write("                }\n");
      out.write("   \n");
      out.write("    }\n");
      out.write("    function checkCptcha()\n");
      out.write("    {\n");
      out.write("        xmlHttp=GetXmlHttpObject();\n");
      out.write("        if(xmlHttp==null)\n");
      out.write("            {\n");
      out.write("                alert (\"Browser does not support HTTP Request\")\n");
      out.write("                return\n");
      out.write("            }\n");
      out.write("            var captcha = document.getElementById(\"captchaCode\").value;\n");
      out.write("            //alert(captcha);\n");
      out.write("            var url=\"checkCaptcha.jsp?Captcha=\"+captcha;\n");
      out.write("            //alert(url);\n");
      out.write("            xmlHttp.open(\"GET\",url,true);\n");
      out.write("            xmlHttp.onreadystatechange=UpdateCaptcha;  // function call to update page using retrieved data\n");
      out.write("            xmlHttp.send(null);\n");
      out.write("    }\n");
      out.write("    function UpdateCaptcha()\n");
      out.write("    {\n");
      out.write("        if(xmlHttp.readyState==4 || xmlHttp.readyState==\"complete\")\n");
      out.write("        {\n");
      out.write("            //alert(\"in ready state 4 page\");\n");
      out.write("            if(xmlHttp.status==200)\n");
      out.write("            {\n");
      out.write("                    var newStatus=xmlHttp.responseText;\n");
      out.write("                    //alert(newStatus);\n");
      out.write("                    document.getElementById(\"txtCaptcha\").innerHTML=newStatus;\n");
      out.write("                    if((newStatus.trim()).length>0)\n");
      out.write("                        {\n");
      out.write("                            document.getElementById(\"captchaCode\").value=\"\";\n");
      out.write("                            document.getElementById(\"captchaCode\").focus();\n");
      out.write("                            //alert(\"Length= \"+newStatus.length);\n");
      out.write("                        }\n");
      out.write("            }\n");
      out.write("            else\n");
      out.write("            {\n");
      out.write("                    alert(\"Error! request status is \"+xmlHttp.status);\n");
      out.write("            }\n");
      out.write("        }    \n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function validate()\n");
      out.write("            {\n");
      out.write("                var b = document.getElementById(\"ps\").value;\n");
      out.write("                var c = document.getElementById(\"rps\").value;\n");
      out.write("                var status=true;                              \n");
      out.write("                document.getElementById(\"txtRpass\").innerHTML=\"\";\n");
      out.write("                if(c!=b)\n");
      out.write("                {\n");
      out.write("                   // alert(\"Enter a number\");\n");
      out.write("                    document.getElementById(\"txtRpass\").innerHTML=\"please enter Re-Password as Password\";\n");
      out.write("                    status= false;\n");
      out.write("                    document.getElementById(\"rps\").value=\"\";\n");
      out.write("                    document.getElementById(\"rps\").focus();\n");
      out.write("                }\n");
      out.write("                 return status;\n");
      out.write("            }\n");
      out.write("            function checkMin()\n");
      out.write("            {\n");
      out.write("             //   alert(\"in function\");\n");
      out.write("                var num=un.value;\n");
      out.write("                if(num.length<10)\n");
      out.write("                    {\n");
      out.write("                        document.getElementById(\"len1\").innerHTML=\"\";\n");
      out.write("                        document.getElementById(\"len1\").focus();\n");
      out.write("                    }\n");
      out.write("                \n");
      out.write("                else{\n");
      out.write("                    alert(\"ok\");\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("    </script>\n");
      out.write("    </head>\n");
      out.write("    <body onload=\"getDoctorName();\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/adminMenu.jsp", out, false);
      out.write("\n");
      out.write("        <div class=\"wrapper col5\">\n");
      out.write("        <div id=\"container\">\n");
      out.write("            <div id=\"breadcrumb\">\n");
      out.write("                <p>Registration</p>\n");
      out.write("            </div>\n");
      out.write("            <form method=\"get\" action=\"patientservlet\" id=\"form2\" name=\"formPD\" >\n");
      out.write("                <div align=\"center\">\n");
      out.write("                    <input type=\"text\" name =\"example\" value=\"");
      out.print(operation);
      out.write("\">\n");
      out.write("                    <input type=\"text\" name =\"uid\" value=\"");
      out.print(uid);
      out.write("\">\n");
      out.write("                    </input>\n");
      out.write("\n");
      out.write("                     <table cellpadding=\"0\" cellspacing=\"5px\"  style=\"text-align:left\" >\n");
      out.write("                     <tr>\n");
      out.write("                        <td><span class=\"Validation\">*</span></td>\n");
      out.write("                        <td> <label for=\"author\">First Name:</label> </td>\n");
      out.write("                        <td> <input type=\"text\" id=\"txtFirstName\" name=\"txtFirstName\"value=\"");
      out.print(fn);
      out.write("\" style=\"width:100% ;height: 25px\" autofocus required ></td>\n");
      out.write("                        <td></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><span class=\"Validation\">*</span></td>\n");
      out.write("                        <td><label for=\"author\">Last Name:</label></td>\n");
      out.write("                        <td><input type=\"text\" id=\"txtLastName\" name=\"txtLastName\"value=\"");
      out.print(ln);
      out.write("\" style=\"width:100% ;height: 25px\" required></td>\n");
      out.write("                        <td></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                            <td></td>\n");
      out.write("                            <td><label>Gender:</label> </td>\n");
      out.write("                            <td colspan=\"2\">\n");
      out.write("                            <table>\n");
      out.write("                                <tr><td><input type=\"radio\" name=\"txtgender\"  value=\"male\"");
      out.print(valM);
      out.write(" required> Male</td>\n");
      out.write("                                    <td><input type=\"radio\" name=\"txtgender\"  value=\"female\"");
      out.print(valF);
      out.write(" required> Female</td>                               \n");
      out.write("                                </tr>\n");
      out.write("                            </table>\n");
      out.write("                            </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><span class=\"Validation\">*</span></td>\n");
      out.write("                        <td><label>Birth Date: </label> </td>\n");
      out.write("                        <td><input type=\"date\" id=\"txtBirthDate\" name=\"txtBirthDate\"value=\"");
      out.print(bd);
      out.write("\"  style=\"width:100% ;height: 25px\" required></input></td>           \n");
      out.write("                        <td></td>\n");
      out.write("                    </tr> \n");
      out.write("                    <tr>\n");
      out.write("                        <td><span class=\"Validation\">*</span></td>\n");
      out.write("                        <td><label>Birth Time: </label> </td>\n");
      out.write("                        <td><input type=\"text\" id=\"txtBirthTime\" name=\"txtBirthTime\" value=\"");
      out.print(bt);
      out.write("\" style=\"width:100% ;height: 25px\" required></input></td>           \n");
      out.write("                        <td><select id=\"txtBirthTimeUnit\" name=\"txtBirthTimeUnit\" class=\"txtBirthTimeUnit\" value=\"txtBirthTimeUnit\">\n");
      out.write("                            <option id=\"optn1\" value=\"");
      out.print(btu);
      out.write("\" >AM</option>\n");
      out.write("                            <option id=\"optn2\" value=\"");
      out.print(btu);
      out.write("\" >PM</option>\n");
      out.write("                            </select></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td><label>Blood Group: </label> </td>\n");
      out.write("                        <td><input type=\"text\" id=\"txtBloodGroup\" name=\"txtBloodGroup\" value=\"");
      out.print(bg);
      out.write("\" style=\"width:100% ;height: 25px\" required ></input></td>           \n");
      out.write("                        <td></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td><label>Weight At Birth: </label> </td>\n");
      out.write("                        <td><input type=\"text\" id=\"txtWeightAtBirth\" name=\"txtWeightAtBirth\" value=\"");
      out.print(wb);
      out.write("\" style=\"width:100% ;height: 25px\" required></input></td>           \n");
      out.write("                        <td></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td><label>Height At Birth: </label> </td>\n");
      out.write("                        <td><input type=\"text\" id=\"txtHeightAtBirth\" name=\"txtHeightAtBirth\" value=\"");
      out.print(hb);
      out.write("\" style=\"width:100% ;height: 25px\" required></input></td>           \n");
      out.write("                        <td><label>(in Feet)</label></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td><label>Heart Bit At Birth: </label> </td>\n");
      out.write("                        <td><input type=\"text\" id=\"txtHeartBitAtBirth\" name=\"txtHeartBitAtBirth\" value=\"");
      out.print(heb);
      out.write("\" style=\"width:100% ;height: 25px\" required></input></td>           \n");
      out.write("                        <td><label>(In hz)</label></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                    <td></td>\n");
      out.write("                        <td><label>DeliveryType</label></td>\n");
      out.write("                        <td><select name=\"DeliveryType\"value=\"");
      out.print(dt);
      out.write("\"style=\"width:100% ;height: 25px\" required>\n");
      out.write("                            <option id=\"txtNormal\" value=\"Normal\" >Normal</option>\n");
      out.write("                            <option id=\"txtOperation\" value=\"OPeration\">Operation</option>\n");
      out.write("                        </select></td>          \n");
      out.write("                        <td></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td><label>Any Abnormal Symptoms: </label> </td>\n");
      out.write("                        <td><input type=\"text\" id=\"txtAnyAbnormalSymptoms\" name=\"txtAnyAbnormalSymptoms\" value=\"");
      out.print(sym);
      out.write("\"  style=\"width:100% ;height: 25px\" required></input></td>           \n");
      out.write("                        <td></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td><label>Consultant Doctor: </label> </td>\n");
      out.write("                        <td><select name=\"txtDoctor\" id=\"txtDoctor\" style=\"width:100% ;height: 25px\" required>\n");
      out.write("                        </select></td>\n");
      out.write("                        <td></td>\n");
      out.write("                   </tr>\n");
      out.write("                   <tr> \n");
      out.write("                        <td></td>\n");
      out.write("                        <td><label>Description: </label> </td>\n");
      out.write("                        <td><input type=\"text\" id=\"txtDescription\" name=\"txtDescription\" style=\"width:100% ;height: 25px\" ></input></td>           \n");
      out.write("                        <td></td>\n");
      out.write("                   </tr>\n");
      out.write("                   ");
 
                       if(request.getAttribute("data")==null)
                       {  
                   
      out.write("\n");
      out.write("                   <tr>\n");
      out.write("                        <td><span class=\"Validation\">*</span></td>\n");
      out.write("                        <td><label for=\"url\">Desired UserName:</label> </td>\n");
      out.write("                        <td><input  id=\"un\" type=\"text\" name=\"uname\" autocomplete=\"off\" maxlength=\"7\" onblur=\"getUserName();\" style=\"width:100% ;height: 25px\" required ></td>\n");
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
      out.write("                        <td><input id=\"rps\" type=\"password\" name=\"rpass\" maxlength=\"10\" onblur=\"validate();\" style=\"width:100% ;height: 25px\"  required ></td>\n");
      out.write("                        <td><label name=\"txtRpass\" id=\"txtRpass\" style=\"color:red\"></label> </td>\n");
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
      out.write("                    <td>   \n");
      out.write("                        <a href=\"adminList\"><input type=\"button\" name=\"Back\" id=\"Back\" value=\"Back\" class=\"submitbtn\" /></a></td>\n");
      out.write("    ");
  }     if(request.getAttribute("data")==null) 
    {        
      out.write("\n");
      out.write("    \n");
      out.write("                    <td> <a href=\"newRegistration.jsp\"><input type=\"button\" name=\"Back\" id=\"Back\" value=\"Back\" class=\"submitbtn\" /></a></td>\n");
      out.write("    ");
  } 
      out.write("\n");
      out.write("    </tr>\n");
      out.write("    </table>\n");
      out.write("    </td>\n");
      out.write("    </tr>\n");
      out.write("    </table> \n");
      out.write("    </div>\n");
      out.write("    </form>\n");
      out.write("    </div>\n");
      out.write("    </div> \n");
      out.write("    </body>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/FooterPage.jsp", out, false);
      out.write("\n");
      out.write("    </html>\n");
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
