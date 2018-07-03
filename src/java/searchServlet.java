/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logic.logicFunction;
import java.sql.*;
import javax.servlet.http.HttpSession;
import javax.servlet.RequestDispatcher;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class searchServlet extends HttpServlet 
{
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
         Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String UserIDRP =null;
        String query = null;
        RequestDispatcher rd=null;
        String usertypeSsn =null;
        try 
        {
             con = logicFunction.getConnection();
             
             String searchRP = logicFunction.checkRequestNull(request, "search");
             String allRP = logicFunction.checkRequestNull(request, "all");
             
             HttpSession s1=request.getSession(false);
     
             if(s1.getAttribute("userTypeAttr")!=null)
             
                 usertypeSsn=s1.getAttribute("userTypeAttr").toString().trim();
             
             
             if(allRP.equalsIgnoreCase("all"))
             {
                 query="SELECT * FROM admin_Detail ";
             }
             else
             {
             query="SELECT * FROM admin_Detail WHERE (User_Name='"+searchRP+"' OR First_Name='"+searchRP+"' OR Last_Name='"+searchRP+"') ";
             }
             
             pstmt=con.prepareStatement(query);
           //  pstmt.setString(1, usertypeSsn);
             rs=pstmt.executeQuery();
             ArrayList a1= new ArrayList();
             
             StringBuffer sb;
            
            while(rs.next())
            {
            sb=new StringBuffer();
            
            sb.append(rs.getString("Admin_Id")+":");
            sb.append(rs.getString("First_Name")+" "+rs.getString("Last_Name")+":");
            sb.append(rs.getString("Gender")+":");
            sb.append(rs.getString("Email_Id")+":");
            sb.append(rs.getString("city")+":");
            sb.append(rs.getString("Mobile_No"));

            
            a1.add(sb);
         }
            out.println(a1);
            request.setAttribute("data", a1);//data1 is variable
            rd=request.getRequestDispatcher("/adminListView.jsp");
            rd.forward(request, response);
        }
        
        catch(Exception e)
        {
            out.println("exception"+e);
        }
        finally
        {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
