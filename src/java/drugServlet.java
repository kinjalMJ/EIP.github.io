/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logic.logicFunction;
import java.sql.*;
import java.util.*;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author india
 */

public class drugServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
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
        Statement stmt=null;
        RequestDispatcher rd=null;
        try
        {
           con=logicFunction.getConnection();
           String dname=logicFunction.checkRequestNull(request,"txtDrugName");
           String des=logicFunction.checkRequestNull(request,"txtDescription");
           String operation=logicFunction.checkRequestNull(request, "example");
           String Did=logicFunction.checkRequestNull(request, "Did");
                  String query;        
                   if(operation.equalsIgnoreCase("edit"))
                   {
                     query="update drugs set Drugs_name='"+dname+"',  Description='"+des+"' where drugs_id="+Did;
                          stmt=con.prepareStatement(query);
          
                        stmt.executeUpdate(query);
                   }   
                   else
                   {
           
            out.println("Drug Name");
            out.println("Description");
             query="Insert into Drugs (Drugs_Name,Description) value (?,?)";
              pstmt=con.prepareStatement(query);
                //pstmt.setString(1, vid);
                pstmt.setString(1, dname);
                pstmt.setString(2, des);
                pstmt.executeUpdate();
                   }
        
        rd=request.getRequestDispatcher("gridViewOfDrug");
        rd.forward(request, response);
        }
                catch(Exception e)
                {
                    out.println(e);
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
