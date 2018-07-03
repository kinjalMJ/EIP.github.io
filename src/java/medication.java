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
import javax.servlet.RequestDispatcher;
import logic.logicFunction;

/**
 *
 * @author Kinjal Jarodiya
 */
public class medication extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        Connection con=null;
        PreparedStatement pstmt=null;
        ResultSet rs=null;
        String query=null;
        RequestDispatcher rd=null; 
       
        try
        {
            String pid=logicFunction.checkRequestNull(request, "PatientId");
           // String uid=logicFunction.checkRequestNull(request, "");
            String complain=logicFunction.checkRequestNull(request, "txtComId");
            String drugid=logicFunction.checkRequestNull(request, "DrugName"); 
            String doseQty=logicFunction.checkRequestNull(request, "txtDoseQty");
            String unit=logicFunction.checkRequestNull(request, "txtUnit");
            String nooftimeindy=logicFunction.checkRequestNull(request, "txtNoOfTimesInADay");
            String noofday=logicFunction.checkRequestNull(request, "txtNoOfDay");
            String date=logicFunction.checkRequestNull(request, "txtDate");
             con=logicFunction.getConnection();       
            query="insert into medication (Patient_Id,Drugs_Id,Complain,Dose_Qty,Unit,No_Of_Times_In_A_Day,No_Of_Days,Date) values (?,?,?,?,?,?,?,?)";
           
            pstmt=con.prepareStatement(query);
         //   out.println("@@@@@@@@"+query);
            
            pstmt.setString(1, pid);
            pstmt.setString(2, drugid);
            pstmt.setString(3, complain);
            pstmt.setString(4, doseQty);
            pstmt.setString(5, unit);
            pstmt.setString(6, nooftimeindy);
            pstmt.setString(7, noofday);
            pstmt.setString(8, date);
            pstmt.executeUpdate();
               
            rd=request.getRequestDispatcher("/vaccineMsg.jsp");
            
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
