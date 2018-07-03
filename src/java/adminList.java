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

import java.sql.*;
import logic.logicFunction;
import javax.servlet.http.HttpSession;
import javax.servlet.RequestDispatcher;
import java.util.*;



/**
 *
 * @author User
 */
public class adminList extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        Connection con=null;
         Statement stmt=null;
         ResultSet rs=null;
         RequestDispatcher rd=null;
         ArrayList b1=new ArrayList();
        try 
        {
                     con=logicFunction.getConnection();
                     //String pId=logicFunction.checkRequestNull(request, "");
                     String fname=logicFunction.checkRequestNull(request, "txtFirstName");
                     String lname=logicFunction.checkRequestNull(request, "txtLastName");
                     String gender=logicFunction.checkRequestNull(request, "txtgender");
                     String emailId =logicFunction.checkRequestNull(request, "txtEmailId");
                     String city=logicFunction.checkRequestNull(request, "txtCity");
                
                     
                    String query="select Admin_Id,First_Name,Last_Name,Gender,Email_Id,City,Mobile_No from admin_detail where flag='1' ORDER by User_Name";
                    //String query="select User_Id,First_Name,Type,Last_Name,Gender,Email_Id,City  from user_details where Type='admin'";
                     stmt=con.createStatement();
                     rs=stmt.executeQuery(query);
                     //out.println(rs);
                     StringBuffer sb;
                             
                     while(rs.next()) 
        {
            
                      sb=new StringBuffer();
                      //sb.append(rs.getString("User_Id")+":");
                      
                    //  sb.append(rs.getString("Type"));
                      sb.append(rs.getString("Admin_Id")+":");
                    sb.append(rs.getString("First_Name")+" "+rs.getString("Last_Name")+":");
                      
                    sb.append(rs.getString("Gender")+":");
                    sb.append(rs.getString("Email_Id")+":");
                    sb.append(rs.getString("city")+":");
                    sb.append(rs.getString("Mobile_No"));
                      b1.add(sb);
                     
               
        }
                     request.setAttribute("data", b1);
                      out.println(b1);
                      rd=request.getRequestDispatcher("/adminListView.jsp");
                    rd.forward(request, response);

        }
        catch(Exception e)
        {
                     System.out.println(e);
        }
        
        finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
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
     * Handles the HTTP <code>POST</code> method.
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
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
