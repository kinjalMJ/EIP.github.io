package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import logic.logicFunction;
import java.sql.*;

public final class TypeRightsAjaxDB_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");

    try
    {
        Connection con;
        con=logicFunction.getConnection();
        ArrayList a1=new ArrayList();
        Statement st=con.createStatement();
         String type=request.getParameter("t");
   //     String type=logicFunction.checkRequestNull(request, "t");
        out.println("type="+type.trim());
        String query=null;
     //   query = "select * from menu_description where User_type='"+type.trim()+"'";
        query="select menu_Name,Menu_Id from menu_description where Menu_id not in( "+
                " select m1.menu_id from menu_description m1 inner join menu_description m2 on "+
                " m1.Menu_id=m2.parent_Id and m1.User_type='"+type+"') and User_type='"+type+"'";
        ResultSet rs= st.executeQuery(query);
        StringBuffer sb;

        while(rs.next())
        {
            sb=new StringBuffer();
        
            sb.append(rs.getString("Menu_Name")+"$ "+rs.getString("Menu_Id")) ;
           
            a1.add(sb);
        }
            request.setAttribute("data", a1);
            out.println(a1);
            out.println("kinjal");
    }
    catch(Exception e)
    {
        out.println(e);
    }

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
