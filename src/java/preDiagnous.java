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

/**
 *
 * @author User
 */
public class preDiagnous extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
         Connection con=null;
         Statement stmt=null;
         ResultSet rs=null;
         RequestDispatcher rd=null;
         String query1=null;

        try
        {
                con=logicFunction.getConnection();
                String pid=logicFunction.checkRequestNull(request, "txtpid");
                String vid=logicFunction.checkRequestNull(request, "txtvaccineid");
                String did=logicFunction.checkRequestNull(request, "txtdoseid");
                
                String date=logicFunction.checkRequestNull(request, "txtDate");
                String weight=logicFunction.checkRequestNull(request, "txtWeight");
                String height=logicFunction.checkRequestNull(request, "txtHeight");
                String heartbit=logicFunction.checkRequestNull(request, "txtHeartBit");
                String dec=logicFunction.checkRequestNull(request, "txtDescription");
                out.println("@@@@@@@@@@@@ weight: "+weight);
                query1="insert into vaccination_record(Vaccine_Id,Vaccine_Dose_Id,Patient_Id,Vaccination_Date,Wieght,Height,Pluses,Description,User_Id) values ('"+vid+"','"+did+"','"+pid+"','"+date+"','"+weight+"','"+height+"','"+heartbit+"','"+dec+"',0)";
                stmt=con.createStatement();
                stmt.executeUpdate(query1);
                
                out.println(query1);
                String path="vaccination.jsp?patientId="+pid;
                 rd=request.getRequestDispatcher(path);
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
