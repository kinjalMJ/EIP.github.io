package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class adminMenu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Admin Menu</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/layout.css\" type=\"text/css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/Bluemenu.css\"/>\n");
      out.write("    </head>\n");
      out.write("   ");

            Map m=new HashMap();
            ArrayList mn=new ArrayList();
            ArrayList subMenu;
            if(session.getAttribute("mainMenu")!=null)
            {
                mn=(ArrayList)session.getAttribute("mainMenu");
            }
            if(session.getAttribute("menu")!=null)
            {
                m=(HashMap)session.getAttribute("menu");
            }
    //System.out.println("mn in jsp: "+mn);
    //System.out.println("m in jsp: "+m);
    
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div cbreadcrumblass=\"wrapper col3\">\n");
      out.write("        <div id=\"topnav\">\n");
      out.write("           \n");
      out.write("          <ul id=\"Bluenav\">\n");
      out.write("            ");

            if(mn!=null)
            {    
            for(int i=0;i<mn.size();i++)
                {
                    subMenu=new ArrayList();
                    String val1=mn.get(i).toString().trim();
                    //System.out.println("@@@@@@@@@a: "+val1);
                    String mName1=val1.substring(0,val1.indexOf("$")).trim();
                    //System.out.println("@@@@@@@@@@b: "+mName1);
                    String pg1=val1.substring(val1.indexOf("$")+1).trim();
                    //System.out.println("@@@@@@@@c: "+pg1);
            
      out.write("\n");
      out.write("                <li>\n");
      out.write("                    ");

                    if(pg1!=null && pg1.length()>4)
                    {
                    
      out.write("\n");
      out.write("                        <a href=\"");
      out.print(pg1);
      out.write('"');
      out.write('>');
      out.print(mName1);
      out.write("</a> \n");
      out.write("                    ");

                    }
                    else
                    {
            
      out.write("\n");
      out.write("                        <a>");
      out.print( mName1);
      out.write(" </a>\n");
      out.write("            ");

                        subMenu=(ArrayList)m.get(mName1);
                        if(subMenu!=null)
                        {
            
      out.write("\n");
      out.write("                            <ul>\n");
      out.write("            ");
                    
                                for(int j=0;j<subMenu.size();j++)
                                {
                                    String val=subMenu.get(j).toString().trim();
                                    String mName=val.substring(0,val.indexOf("$"));
                                    String pg=val.substring(val.indexOf("$")+1);
            
      out.write("\n");
      out.write("                                <li><a href=\"");
      out.print(pg);
      out.write("\" >");
      out.print(mName);
      out.write("</a></li>\n");
      out.write("            ");

                                }
            
      out.write("\n");
      out.write("                            </ul>\n");
      out.write("            ");

                        }
                    }
            
      out.write("\n");
      out.write("                </li> \n");
      out.write("                    \n");
      out.write("            ");

                }
            }   
            
      out.write(" \n");
      out.write("            </ul>\n");
      out.write("      <br class=\"clear\" />\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
