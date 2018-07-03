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

/**
 *
 * @author Kinjal Jarodiya
 */
public class regServlet extends HttpServlet {

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
        PreparedStatement pstmt=null;
        try
        {
            con=logicFunction.getConnection();
            String fname=logicFunction.checkRequestNull(request, "txtFirstName");
            String lname=logicFunction.checkRequestNull(request, "txtLastName");
            String email=logicFunction.checkRequestNull(request, "txtEmailId");
            String user=logicFunction.checkRequestNull(request, "uname");
            String password=logicFunction.checkRequestNull(request, "pass");
            String repass=logicFunction.checkRequestNull(request, "rpass");

            String query="insert into User_Details (First_Name,Last_Name,Email_Id,User_Name,Password) values (?,?,?,?,?)";
            
            pstmt=con.prepareStatement(query);
            pstmt.setString(1, fname);
            pstmt.setString(2, lname);
            pstmt.setString(3, email);
            pstmt.setString(4, user);
            pstmt.setString(5, password);
            
            pstmt.executeUpdate();
                       
        } 
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        finally {            
            out.close();
        }
    }   // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
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