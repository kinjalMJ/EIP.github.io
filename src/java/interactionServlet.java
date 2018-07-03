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
import java.util.*;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author Kinjal Jarodiya
 */
public class interactionServlet extends HttpServlet 
{

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        Connection con=null;
        PreparedStatement pstmt=null;
       // Statement stmt=null;
        RequestDispatcher rd=null;
       
        try 
        {
        
            con=logicFunction.getConnection();
            String vname=logicFunction.checkRequestNull(request, "txtVaccineName");
            String vtype=logicFunction.checkRequestNull(request, "txtVaccineType");
            String dname=logicFunction.checkRequestNull(request, "txtDrugName");
            String descrption=logicFunction.checkRequestNull(request, "txtDescription");
            
            String query="insert into interaction_details (Vaccine_Id,Interaction_Type,Drug_Id,Description) values (?,?,?,?)";
  
            pstmt=con.prepareStatement(query);
            pstmt.setInt(1,Integer.parseInt(vname));
            pstmt.setString(2, vtype);
            pstmt.setInt(3, Integer.parseInt(dname));
            pstmt.setString(4, descrption);
            pstmt.executeUpdate();       
            rd=request.getRequestDispatcher("/vaccineMsg.jsp");
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
