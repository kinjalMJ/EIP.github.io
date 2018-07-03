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
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
/**
 *
 * @author Kinjal Jarodiya
 */
public class discardTask extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
         
        Statement stmt=null;
        Connection con=null;
        RequestDispatcher rd=null;
        try 
        {
        //    String tid=logicFunction.checkRequestNull(request, "tid");
            String tid=request.getParameter("tid");
            out.println("@@@@@@@@@@  "+tid);
            con= logicFunction.getConnection();
            String flag=null;
            stmt=con.createStatement();
            String query="update pending_task set flag=0 where Task_Id="+tid;
            out.println("333333333");
            stmt.executeUpdate(query);
            out.println("44444444444");
            HttpSession s1=request.getSession(false);
            String type=s1.getAttribute("Type").toString();
            String uid=  s1.getAttribute("userId").toString();
        
            
            rd=request.getRequestDispatcher("/recentPatientDisplay");

           rd.forward(request, response);
        } 
        catch(Exception e)
        {
            out.println(e);
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
