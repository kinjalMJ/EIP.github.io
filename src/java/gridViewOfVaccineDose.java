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
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import logic.logicFunction;

/**
 *
 * @author User
 */
public class gridViewOfVaccineDose extends HttpServlet {

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
           Statement stmt=null;
        ResultSet rs=null;
        RequestDispatcher rd=null;
        Connection con=null;

        try {
            con=logicFunction.getConnection();
            String vid=logicFunction.checkRequestNull(request, "vid");
            String query="Select * from vaccine_dose where Vaccine_Id="+vid;
            ArrayList a1=new ArrayList();
            
            stmt=con.createStatement();
            rs=stmt.executeQuery(query);
            String vaccinedoseId="0";
            StringBuffer sb;
            while(rs.next()) 
        {
            
                      sb=new StringBuffer();
                      sb.append(rs.getString("Vaccine_Dose_Id")+":");
                      
                      sb.append(rs.getString("Vaccine_Id")+":");
                      
                      sb.append(rs.getString("Age_Range")+":");
                      sb.append(rs.getString("Optional_OR_Mandatory")+":");
                      sb.append(rs.getString("Description"));
                      a1.add(sb);
                     
               
        }
                      request.setAttribute("data", a1);
                      out.println(a1);
                      rd=request.getRequestDispatcher("/gridViewOfVaccineDose.jsp");
                      rd.forward(request, response);



        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        finally
        {            
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
