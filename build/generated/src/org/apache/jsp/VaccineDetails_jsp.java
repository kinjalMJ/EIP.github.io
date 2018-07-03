package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;

public final class VaccineDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Vaccine Form</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/layout.css\" type=\"text/css\" />\n");
      out.write("        ");

         ArrayList a1=new ArrayList();
         String vn="",desc="",fwg="",valF="",valM="",valB="",vt="",valI="",valD="",cat="",valR="",valS="",nod="";
         String operation="";
         String vid="";
        
          if(request.getAttribute("data")!=null)
         {
             operation="edit";
             
             if(request.getParameter("vid")!=null)
                 vid=request.getParameter("vid");
             
           a1= (ArrayList)request.getAttribute("data");
           vn=a1.get(0).toString();
           desc=a1.get(1).toString();
           
           fwg=a1.get(2).toString();
           if(fwg.equalsIgnoreCase("male"))
           valM="checked";
           if(fwg.equalsIgnoreCase("female"))
           valF="checked";
           if(fwg.equalsIgnoreCase("both"))
           valB="checked";
           vt=a1.get(3).toString();
           if(vt.equalsIgnoreCase("Injection"))
           valI="checked";
            if(vt.equalsIgnoreCase("Drop"))
           valD="checked";
           cat=a1.get(4).toString();
           if(cat.equalsIgnoreCase("Routine"))
           valR="checked";
           if(cat.equalsIgnoreCase("Special"))
           valS="checked";
          nod=a1.get(5).toString();
                   }
        
      out.write("\n");
      out.write("        <script language=\"javascript\" >\n");
      out.write("                  function GetXmlHttpObject()   \n");
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
      out.write("        function getVaccineNameCheck()\n");
      out.write("    {\n");
      out.write("         xmlHttp=GetXmlHttpObject();  \n");
      out.write("                if (xmlHttp==null)\n");
      out.write("                {\n");
      out.write("             //   alert (\"Browser does not support HTTP Request\")\n");
      out.write("                    return;\n");
      out.write("                }\n");
      out.write("              //  alert(\"in funmmmm\");\n");
      out.write("                var vn=document.getElementById(\"txtvaccineName\").value;\n");
      out.write("               // alert(vn);\n");
      out.write("                var url=\"vaccineNameCheckDB.jsp?vn=\"+escape(vn);\n");
      out.write("                xmlHttp.open(\"GET\",url,true);  \n");
      out.write("                xmlHttp.onreadystatechange=displayVaccineNameCheck;  \n");
      out.write("                xmlHttp.send(null);\n");
      out.write("        \n");
      out.write("    }\n");
      out.write("     function displayVaccineNameCheck()\n");
      out.write("    {\n");
      out.write("                if(xmlHttp.readyState==4 || xmlHttp.readyState==\"complete\")\n");
      out.write("                {\n");
      out.write("                if(xmlHttp.status==200)\n");
      out.write("                {//       alert(\"in displayVaccineNameCheck\");\n");
      out.write("                       var newStatus=xmlHttp.responseText;\n");
      out.write("                        \n");
      out.write("                        if(newStatus.trim().length>0)\n");
      out.write("                            {\n");
      out.write("                                document.getElementById(\"error\").innerHTML=newStatus;\n");
      out.write("                                   document.getElementById(\"txtvaccineName\").value=\"\";\n");
      out.write("                                  document.getElementById(\"txtvaccineName\").focus();\n");
      out.write("                      \n");
      out.write("                            }\n");
      out.write("                            else\n");
      out.write("                                \n");
      out.write("                                document.getElementById(\"error\").innerHTML=\"\";\n");
      out.write("                        \n");
      out.write("                }\n");
      out.write("                else\n");
      out.write("                {\n");
      out.write("                 //   alert(xmlHttp.status);\n");
      out.write("                }\n");
      out.write("                }\n");
      out.write("   \n");
      out.write("    }\n");
      out.write("\n");
      out.write("            function createDoseTable()\n");
      out.write("            \n");
      out.write("           {\n");
      out.write("             \n");
      out.write("                var dose=document.getElementById(\"noOfDose\").value; \n");
      out.write("               // alert(\"noOfDose \"+dose);\n");
      out.write("                var table = document.getElementById(\"doestable\");\n");
      out.write("                 var row=table.insertRow(0);\n");
      out.write("                        var cell1=row.insertCell(0);\n");
      out.write("                        cell1.innerHTML=\"DoseNo\";\n");
      out.write("                        var cell2=row.insertCell(1);\n");
      out.write("                        cell2.innerHTML=\"Age(inMonth)\";\n");
      out.write("                        var cell3=row.insertCell(2);\n");
      out.write("                        cell3.innerHTML=\"Optional/Mandatory\";\n");
      out.write("                        var cell4=row.insertCell(3);\n");
      out.write("                        cell4.innerHTML=\"Description\";\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                for(i=0;i<dose;i++)\n");
      out.write("                    {\n");
      out.write("                         var row=table.insertRow(i+1);\n");
      out.write("                        var cell1=row.insertCell(0);\n");
      out.write("                        cell1.innerHTML=i+1;\n");
      out.write("                         var cell2=row.insertCell(1);\n");
      out.write("                      //  cell2.innerHTML=\"Age(inMonth)\";\n");
      out.write("                        var element1=document.createElement(\"input\");\n");
      out.write("                        element1.setAttribute(\"type\", \"text\");\n");
      out.write("                        element1.setAttribute(\"name\", \"age\"+i);\n");
      out.write("                        cell2.appendChild(element1);\n");
      out.write("                        var cell3=row.insertCell(2);\n");
      out.write("                        //cell3.innerHTML=\"Optional/Mandatory\";\n");
      out.write("                        \n");
      out.write("                         var element2 = document.createElement(\"select\");\n");
      out.write("                                    element2.style.align=\"center\";\n");
      out.write("                                    element2.name = \"optional_Mandatory\"+i;\n");
      out.write("                                    var optn1 = document.createElement(\"option\");\n");
      out.write("                                    optn1.name = \"optional\"+i;\n");
      out.write("                                    optn1.value=\"optional\";\n");
      out.write("                                    optn1.innerHTML=\"Optional\";\n");
      out.write("                                    element2.add(optn1,null);\n");
      out.write("                                    var optn2 = document.createElement(\"option\");\n");
      out.write("                                    optn2.name = \"mandatory\"+i;\n");
      out.write("                                    optn2.value=\"mandatory\";\n");
      out.write("                                    optn2.innerHTML=\"Mandatory\";\n");
      out.write("                                    element2.add(optn2,null);\n");
      out.write("                                    cell3.appendChild(element2);\n");
      out.write("                                    \n");
      out.write("                        var cell4=row.insertCell(3);\n");
      out.write("                       // cell4.innerHTML=\"Description\";\n");
      out.write("                        var element3=document.createElement(\"input\");\n");
      out.write("                        element3.setAttribute(\"type\", \"text\");\n");
      out.write("                        element3.setAttribute(\"name\", \"desc\"+i);\n");
      out.write("                        cell4.appendChild(element3);\n");
      out.write("                \n");
      out.write("                    }\n");
      out.write("               \n");
      out.write("                \n");
      out.write("             \n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/adminMenu.jsp", out, false);
      out.write("\n");
      out.write("    <div class=\"wrapper col5\">\n");
      out.write("    <div id=\"container\"> \n");
      out.write("        <div id=\"breadcrumb\">\n");
      out.write("                <p>Vaccine Details</p>\n");
      out.write("            </div>\n");
      out.write("        <form method=\"get\" action=\"VaccineDetailsServlet\" id=\"form1\" name=\"formRe\" >\n");
      out.write("\n");
      out.write("                        <div align=\"center\">\n");
      out.write("                    <input type=\"hidden\" name =\"example\" value=\"");
      out.print(operation);
      out.write("\">\n");
      out.write("                    <input type=\"hidden\" name =\"vid\" value=\"");
      out.print(vid);
      out.write("\">\n");
      out.write("                    </input>\n");
      out.write("\n");
      out.write("                <table cellpadding=\"0\" cellspacing=\"7px\"  style=\"text-align:left\"> \n");
      out.write("                    <tr>\n");
      out.write("                    <label  style=\"color:red\" id=\"error\"></label>\n");
      out.write("                    </tr>\n");
      out.write("                  <!--  <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <span class=\"Validation\">*</span></td> \n");
      out.write("                            <td><label for=\"author\">Vaccine Id:</label> </td>\n");
      out.write("                            <td><input type=\"text\" id=\"txtvaccineId\" name=\"txtvaccineId\"  style=\"width: 180px\" placeholder=\"Enter Vaccine Id.\" required ></td>\n");
      out.write("                            <td><label id=\"error\" style=\"color:red\"></label></td>\n");
      out.write("                    </tr>-->\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <span class=\"Validation\">*</span></td> \n");
      out.write("                            <td><label for=\"author\">Vaccine Name:</label> </td>\n");
      out.write("                            <td><input type=\"text\" id=\"txtvaccineName\" name=\"txtvaccineName\" value=\"");
      out.print(vn);
      out.write("\" onblur=\"getVaccineNameCheck();\" style=\"width: 180px\" placeholder=\"Enter Vaccine Name.\" required \"></td>\n");
      out.write("                            <td><label id=\"error\" style=\"color:red\"></label></td>\n");
      out.write("                    </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td></td>\n");
      out.write("                            <td><label for=\"url\">Description:</label> </td>\n");
      out.write("                            <td><textarea id=\"txtDecId\" name=\"txtdec\" required>");
      out.print(desc);
      out.write("</textarea></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><span class=\"Validation\">*</span></td>\n");
      out.write("                            <td><label for=\"url\">For Whom(gender):</label> </td>\n");
      out.write("                            <td colspan=\"3\">\n");
      out.write("                                <table>\n");
      out.write("                                    <tr><td><input type=\"radio\" name=\"gender\"  value=\"male\" ");
      out.print(valM);
      out.write(" required> Male</td>\n");
      out.write("                                        <td><input type=\"radio\" name=\"gender\"  value=\"female\" ");
      out.print(valF);
      out.write(" required> Female</td>\n");
      out.write("                                        <td><input type=\"radio\" name=\"gender\"  value=\"both\"  ");
      out.print(valB);
      out.write(" required> Both</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                </table>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><span class=\"Validation\">*</span></td>\n");
      out.write("                            <td><label for=\"url\">Vaccine Type:</label> </td>\n");
      out.write("                            <td colspan=\"2\">\n");
      out.write("                                <table>\n");
      out.write("                                    <tr><td><input type=\"radio\" name=\"vaccineType\"  value=\"Injection\" ");
      out.print(valI);
      out.write(" required> Injection</td>\n");
      out.write("                                        <td><input type=\"radio\" name=\"vaccineType\"  value=\"Drop\" ");
      out.print(valD);
      out.write(" required> Drop</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                </table>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><span class=\"Validation\">*</span></td>\n");
      out.write("                            <td><label for=\"url\">Select Vaccine category:</label> </td>\n");
      out.write("                            <td colspan=\"2\">\n");
      out.write("                                <table>\n");
      out.write("                                    <tr><td><input type=\"radio\" name=\"rs\" value=\"Routine\" ");
      out.print(valR);
      out.write(" required > Routine</td>\n");
      out.write("                                        <td><input type=\"radio\" name=\"rs\" value=\"Special\" ");
      out.print(valS);
      out.write(" required> Special</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                </table>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><span class=\"Validation\">*</span></td>\n");
      out.write("                            <td><label for=\"url\">No Of Dose:</label> </td>\n");
      out.write("                            <td><input type=\"number\" name=\"noofDose\"  id=\"noOfDose\" value=\"nod\" style=\"width: 180px\"  placeholder=\"Enter no of Dose.\" min=\"1\"  onblur=\"createDoseTable();\"  required ></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td colspan=\"3\"><table id=\"doestable\" border =\"1\"></table></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td >\n");
      out.write("                            <table>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td><input style=\"font-weight: bold;\" type=\"submit\" class=\"submitbtn\"  id=\"submit\" value=\"Save\" /></td>\n");
      out.write("                                </tr>\n");
      out.write("                            </table>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                </table> \n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div> \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/FooterPage.jsp", out, false);
      out.write('\n');
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
