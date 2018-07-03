package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;

public final class viewProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("         ");
 
         ArrayList a1=new ArrayList();
         String fn="",ln="",gen="",bd="",bg="",ed="",ex="",mn="",eid="",cty="",des="",bt="",btu="",wb="",hb="",heb="",dt="",sym="",cd="";
          String valM="";
          String valF="";
          String operation="";
          String uid="";
          HttpSession s1=request.getSession(false);
           String type=s1.getAttribute("Type").toString();
 
         if(request.getAttribute("data")!=null)
        {
            
             
             
           a1= (ArrayList)request.getAttribute("data");
           //out.println(a1);
          fn= a1.get(0).toString();
           ln= a1.get(1).toString();
           gen= a1.get(2).toString();
          
       
           bd= a1.get(3).toString();
           bg= a1.get(4).toString();
           
           if(type.equalsIgnoreCase("admin") || type.equalsIgnoreCase("HealthcareProvider"))
           {
           ed= a1.get(5).toString();
           ex= a1.get(6).toString();
           mn= a1.get(7).toString();
           eid= a1.get(8).toString();
           cty= a1.get(9).toString();
            des= a1.get(10).toString();
           }
            else if(type.equalsIgnoreCase("patient"))
           {
           bt= a1.get(5).toString();
           btu= a1.get(6).toString();
           wb= a1.get(7).toString();
           hb= a1.get(8).toString();
           heb= a1.get(9).toString();
           dt = a1.get(10).toString();
           sym = a1.get(11).toString();
           cd= a1.get(12).toString();
           des= a1.get(13).toString();
            }
          
          // editadmina1.add(rs.getString("First_Name"));*/
            
                
        
                
        }
    
      out.write("\n");
      out.write("   \n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
 
      
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
      out.write("                <p>Your Profile</p>\n");
      out.write("            </div>\n");
      out.write("            <form method=\"get\" action=\"\" id=\"form76\" name=\"formVP\" >\n");
      out.write("            <div align=\"center\">\n");
      out.write("            <table cellpadding=\"0\" cellspacing=\"5px\"  style=\"text-align:left\" >\n");
      out.write("               \n");
      out.write("                  <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td> <label for=\"author\">First Name:</label> </td> \n");
      out.write("                        <td> <label for=\"author\">");
      out.print(fn);
      out.write("</label> </td>\n");
      out.write("                        <td></td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td> <label for=\"author\">Last Name:</label> </td> \n");
      out.write("                        <td> <label for=\"author\">");
      out.print(ln);
      out.write("</label> </td>\n");
      out.write("                        <td></td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td> <label for=\"author\">Gender:</label> </td> \n");
      out.write("                        <td> <label for=\"author\">");
      out.print(gen);
      out.write("</label> </td>\n");
      out.write("                        <td></td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td> <label for=\"author\">Birth Date:</label> </td> \n");
      out.write("                        <td> <label for=\"author\">");
      out.print(bd);
      out.write("</label> </td>\n");
      out.write("                        <td></td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td> <label for=\"author\">Blood Group:</label> </td> \n");
      out.write("                        <td> <label for=\"author\">");
      out.print(bg);
      out.write("</label> </td>\n");
      out.write("                        <td></td>\n");
      out.write("                  </tr>\n");
      out.write("                   ");

                      
                        if(type.equalsIgnoreCase("admin") || type.equalsIgnoreCase("HealthcareProvider"))
                       {
                  
      out.write("\n");
      out.write("                  <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td> <label for=\"author\">Education:</label> </td> \n");
      out.write("                        <td> <label for=\"author\">");
      out.print(ed);
      out.write("</label> </td>\n");
      out.write("                        <td></td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td> <label for=\"author\">Experience:</label> </td> \n");
      out.write("                        <td> <label for=\"author\">");
      out.print(ex);
      out.write("</label> </td>\n");
      out.write("                        <td></td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td> <label for=\"author\">Mobile No:</label> </td> \n");
      out.write("                        <td> <label for=\"author\">");
      out.print(mn);
      out.write("</label> </td>\n");
      out.write("                        <td></td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td> <label for=\"author\">City:</label> </td> \n");
      out.write("                        <td> <label for=\"author\">");
      out.print(cty);
      out.write("</label> </td>\n");
      out.write("                        <td></td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td> <label for=\"author\">Email:</label> </td> \n");
      out.write("                        <td> <label for=\"author\">");
      out.print(eid);
      out.write("</label> </td>\n");
      out.write("                        <td></td>\n");
      out.write("                  </tr>\n");
      out.write("                  ");

                       }
                         else if(type.equalsIgnoreCase("patient"))
                       {
                  
      out.write("\n");
      out.write("                  <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td> <label for=\"author\">Birth Time:</label> </td> \n");
      out.write("                        <td> <label for=\"author\">");
      out.print(bt);
      out.write("</label> </td>\n");
      out.write("                        <td></td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td> <label for=\"author\">Birth Time Unit:</label> </td> \n");
      out.write("                        <td> <label for=\"author\">");
      out.print(btu);
      out.write("</label> </td>\n");
      out.write("                        <td></td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td> <label for=\"author\">Weight At Birth:</label> </td> \n");
      out.write("                        <td> <label for=\"author\">");
      out.print(wb);
      out.write("</label> </td>\n");
      out.write("                        <td></td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td> <label for=\"author\">Height At Birth:</label> </td> \n");
      out.write("                        <td> <label for=\"author\">");
      out.print(hb);
      out.write("</label> </td>\n");
      out.write("                        <td></td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td> <label for=\"author\">Heartbit at Birth:</label> </td> \n");
      out.write("                        <td> <label for=\"author\">");
      out.print(heb);
      out.write("</label> </td>\n");
      out.write("                        <td></td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td> <label for=\"author\">Delivery Type:</label> </td> \n");
      out.write("                        <td> <label for=\"author\">");
      out.print(dt);
      out.write("</label> </td>\n");
      out.write("                        <td></td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td> <label for=\"author\">Any Abnormal Symptoms:</label> </td> \n");
      out.write("                        <td> <label for=\"author\">");
      out.print(sym);
      out.write("</label> </td>\n");
      out.write("                        <td></td>\n");
      out.write("                  </tr>\n");
      out.write("                   <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td> <label for=\"author\">Consultant Doctor:</label> </td> \n");
      out.write("                        <td> <label for=\"author\">");
      out.print(cd);
      out.write("</label> </td>\n");
      out.write("                        <td></td>\n");
      out.write("                  </tr>\n");
      out.write("\n");
      out.write("                  ");

                     }
                  
      out.write("\n");
      out.write("                  <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td> <label for=\"author\"> Description:</label> </td> \n");
      out.write("                        <td> <label for=\"author\">");
      out.print(des);
      out.write("</label> </td>\n");
      out.write("                        <td></td>\n");
      out.write("                  </tr>\n");
      out.write("                  \n");
      out.write("    </body>\n");
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
