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
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
import java.sql.*;
import java.util.*;
import logic.logicFunction;
/**
 *
 * @author Kinjal Jarodiya
 */
public class updateDrug extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        Connection con=null;
        Statement stmt=null;
        ResultSet rs=null;
        RequestDispatcher rd=null; 
        ArrayList a1=new ArrayList();   
        String query=null;
        try 
        {
            con = logicFunction.getConnection();
           String  mid=logicFunction.checkRequestNull(request, "mId");
           String com=logicFunction.checkRequestNull(request, "txtComId");
           String did=logicFunction.checkRequestNull(request, "DrugsId");
           String qty=logicFunction.checkRequestNull(request, "txtDoseQty");
           String unit=logicFunction.checkRequestNull(request, "txtUnit");
           String time=logicFunction.checkRequestNull(request, "txtNoOfTimesInADay");
           String day=logicFunction.checkRequestNull(request, "No_Of_Days");
           String date=logicFunction.checkRequestNull(request, "Date");
           out.println("date="+date);
           stmt=con.createStatement(); 
           query="UPDATE medication set Complain='"+com+"',Drugs_Id='"+did+"',Dose_Qty='"+qty+"',Unit='"+unit+"',No_Of_Times_In_A_Day='"+time+"',No_Of_Days='"+day+"',Date='"+date+"' where Medication_Id="+mid ;
            
            stmt.executeUpdate(query); 
            rd=request.getRequestDispatcher("viewInteractionType");
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
