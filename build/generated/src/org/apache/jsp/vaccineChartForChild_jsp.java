package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.util.*;

public final class vaccineChartForChild_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "HeaderPage.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("         <link rel=\"stylesheet\" href=\"css/layout.css\" type=\"text/css\" />\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        \n");
      out.write("        <script lang=\"javascript\">\n");
      out.write("            \n");
      out.write("            function GetXmlHttpObject()   \n");
      out.write("            {\n");
      out.write("                var xmlHttp=null;\n");
      out.write("                try\n");
      out.write("                {\n");
      out.write("                    // Firefox, Opera 8.0+, Safari, Chrome\n");
      out.write("                    xmlHttp=new XMLHttpRequest();\n");
      out.write("                }\n");
      out.write("                catch (e)\n");
      out.write("                {\n");
      out.write("                    //Internet Explorer\n");
      out.write("                    try\n");
      out.write("                    {\n");
      out.write("                        xmlHttp=new ActiveXObject(\"Msxml2.XMLHTTP\");\n");
      out.write("                    }\n");
      out.write("                    catch (e)\n");
      out.write("                    {\n");
      out.write("                        xmlHttp=new ActiveXObject(\"Microsoft.XMLHTTP\");\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("                return xmlHttp;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            function vaccineTable()\n");
      out.write("            {\n");
      out.write("                //alert(\"in function\");\n");
      out.write("                xmlHttp=GetXmlHttpObject();\n");
      out.write("                if(xmlHttp==null)\n");
      out.write("                    {\n");
      out.write("                        alert (\"Browser does not support HTTP Request\")\n");
      out.write("                        return\n");
      out.write("                    }\n");
      out.write("                    var url=\"VaccineTable.jsp\";\n");
      out.write("                    //alert(url);\n");
      out.write("                    xmlHttp.open(\"GET\",url,true);\n");
      out.write("                    xmlHttp.onreadystatechange=CreateVaccineTable;  // function call to update page using retrieved data\n");
      out.write("                    xmlHttp.send(null);\n");
      out.write("            }\n");
      out.write("            function CreateVaccineTable()\n");
      out.write("            {\n");
      out.write("                if(xmlHttp.readyState==4 || xmlHttp.readyState==\"complete\")\n");
      out.write("                {\n");
      out.write("                    //alert(\"in ready state 4 page\");\n");
      out.write("                    if(xmlHttp.status==200)\n");
      out.write("                    {\n");
      out.write("                            var newStatus=xmlHttp.responseText;\n");
      out.write("                            //alert(newStatus);\n");
      out.write("                            newStatus=newStatus.substring((newStatus.indexOf(\"[\")+1), newStatus.indexOf(\"]\"));\n");
      out.write("                            //alert(newStatus);\n");
      out.write("                            var k=newStatus.split(\",\");\n");
      out.write("                            //alert(k);\n");
      out.write("                            var table = document.getElementById(\"vaccineTable\");\n");
      out.write("                            //alert(table);\n");
      out.write("                            var row ;\n");
      out.write("                                row= table.insertRow(0);\n");
      out.write("                              \n");
      out.write("                                var cell = row.insertCell(0);\n");
      out.write("                                var element = document.createElement(\"label\");\n");
      out.write("                                cell.style.backgroundColor=\"#333333\";\n");
      out.write("                                cell.style.color=\"red\";\n");
      out.write("                                cell.appendChild(element);\n");
      out.write("                                cell.innerHTML=\"Vaccine\";\n");
      out.write("                                \n");
      out.write("                                var cell = row.insertCell(1);\n");
      out.write("                                var element = document.createElement(\"label\");\n");
      out.write("                                cell.style.backgroundColor=\"#333333\";\n");
      out.write("                                cell.style.color=\"red\";\n");
      out.write("                                cell.appendChild(element);\n");
      out.write("                                cell.innerHTML=\"Dose_Id\";\n");
      out.write("                                \n");
      out.write("                                var cell = row.insertCell(2);\n");
      out.write("                                var element = document.createElement(\"label\");\n");
      out.write("                                cell.style.backgroundColor=\"#333333\";\n");
      out.write("                                cell.style.color=\"red\";\n");
      out.write("                                cell.appendChild(element);\n");
      out.write("                                cell.innerHTML=\" Schedule Date\";\n");
      out.write("                                \n");
      out.write("                                var cell = row.insertCell(3);\n");
      out.write("                                var element = document.createElement(\"label\");\n");
      out.write("                                cell.style.backgroundColor=\"#333333\";\n");
      out.write("                                cell.style.color=\"red\";\n");
      out.write("                                cell.appendChild(element);\n");
      out.write("                                cell.innerHTML=\" Taken Date\";\n");
      out.write("                                \n");
      out.write("                                var vaccine,VaccineDate,doseId,noOfDose,prevVaccine,tkndate;\n");
      out.write("                                for(var i=0; i<k.length;i++)\n");
      out.write("                                {\n");
      out.write("                                    //alert(\"in for\");\n");
      out.write("                                    vaccine=k[i].substring(0, k[i].indexOf('$')).trim();\n");
      out.write("                                    //alert(vaccine);\n");
      out.write("                                    doseId=k[i].substring(k[i].indexOf('$')+1,k[i].indexOf('#')).trim();\n");
      out.write("                                    //alert(doseId);\n");
      out.write("                                    VaccineDate=k[i].substring(k[i].indexOf('#')+1,k[i].indexOf('@')).trim();\n");
      out.write("                                    tkndate=k[i].substring(k[i].indexOf('@')+1,k[i].indexOf('*')).trim();\n");
      out.write("                                    noOfDose=k[i].substring(k[i].indexOf('*')+1);\n");
      out.write("                                    //alert(VaccineDate);\n");
      out.write("                                    var flag=1;\n");
      out.write("                                   // alert(\"vaccine: \"+vaccine);\n");
      out.write("                                    //alert(\"prevVaccine: \"+prevVaccine);\n");
      out.write("                                    if(i!=0)\n");
      out.write("                                        {\n");
      out.write("                                            if(vaccine==prevVaccine)\n");
      out.write("                                                flag=0;\n");
      out.write("                                        }\n");
      out.write("                                       \n");
      out.write("                                    row= table.insertRow(i+1);\n");
      out.write("                                    var x=0;\n");
      out.write("                                    //alert(\"flag= \"+flag);\n");
      out.write("                                    if(flag==1)\n");
      out.write("                                    {\n");
      out.write("                                        var cell = row.insertCell(x);\n");
      out.write("                                        cell.setAttribute(\"rowSpan\",noOfDose);\n");
      out.write("                                        var element = document.createElement(\"label\");\n");
      out.write("                                        cell.style.backgroundColor=\"#999999\";\n");
      out.write("                                        cell.style.color=\"#000000\";\n");
      out.write("                                        cell.appendChild(element);\n");
      out.write("                                        cell.innerHTML=vaccine;\n");
      out.write("                                        x++;\n");
      out.write("                                    }\n");
      out.write("                                    var cell = row.insertCell(x);\n");
      out.write("                                    var element = document.createElement(\"label\");\n");
      out.write("                                    cell.style.backgroundColor=\"#999999\";\n");
      out.write("                                    cell.style.color=\"#000000\";\n");
      out.write("                                    cell.appendChild(element);\n");
      out.write("                                    cell.innerHTML=doseId;\n");
      out.write("                                    x++;\n");
      out.write("                                    var cell = row.insertCell(x);\n");
      out.write("                                    var element = document.createElement(\"label\");\n");
      out.write("                                    cell.style.backgroundColor=\"#999999\";\n");
      out.write("                                    cell.style.color=\"#000000\";\n");
      out.write("                                    cell.appendChild(element);\n");
      out.write("                                    cell.innerHTML=VaccineDate;\n");
      out.write("                                    prevVaccine=vaccine;\n");
      out.write("                                    x++;\n");
      out.write("                                    var cell = row.insertCell(x);\n");
      out.write("                                    var element = document.createElement(\"label\");\n");
      out.write("                                    cell.style.backgroundColor=\"#999999\";\n");
      out.write("                                    cell.style.color=\"#000000\";\n");
      out.write("                                    cell.appendChild(element);\n");
      out.write("                                    if(tkndate==\"null\")\n");
      out.write("                                    {\n");
      out.write("                                        cell.innerHTML=\"\";\n");
      out.write("                                    }\n");
      out.write("                                    else\n");
      out.write("                                    {\n");
      out.write("                                        cell.innerHTML=tkndate;\n");
      out.write("                                    }\n");
      out.write("                                    \n");
      out.write("                                }\n");
      out.write("                    }\n");
      out.write("                    else\n");
      out.write("                    {\n");
      out.write("                            alert(\"Error! request status is \"+xmlHttp.status);\n");
      out.write("                    }\n");
      out.write("                }   \n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body onload=\"vaccineTable();\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/adminMenu.jsp", out, false);
      out.write("\n");
      out.write("    <div class=\"wrapper col5\">\n");
      out.write("        <div id=\"container\">\n");
      out.write("            <div id=\"breadcrumb\">\n");
      out.write("                <p>Dash Board</p>\n");
      out.write("            </div>\n");
      out.write(" <!------------------------------------------------------------------------------------------------------------------------------------------>\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td align=\"center\" valign=\"top\"> \n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("                        <div class=\"marqueecontainer\" >\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                         </table> \n");
      out.write("                    </td>\n");
      out.write("  <!----------------------------------------------------------------------------------------------------------------------------------------------------------->                  \n");
      out.write("        <td  align=\"center\"> \n");
      out.write("        <table id=\"vaccineTable\"></table>\n");
      out.write("        </td>\n");
      out.write("   <!---------------------------------------------------------------------------------------------------------------------------------------------------------------->     \n");
      out.write("    <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td align=\"center\" valign=\"top\"> \n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("                        <div class=\"marqueecontainer\" >\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                         </table> \n");
      out.write("                    </td>\n");
      out.write("<!---------------------------------------------------------------------------------------------------------------------------------------------------------->                    \n");
      out.write("         </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "FooterPage.jsp", out, false);
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
