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
import logic.logicFunction;
import java.sql.*;
import java.util.ArrayList;
import org.apache.catalina.Session;


/**
 *
 * @author Kinjal Jarodiya
 */
public class changeDrug extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        Statement stmt=null;
        Connection con=null;
        RequestDispatcher rd=null;
        ResultSet rs=null;
        ArrayList a1=new ArrayList();
        try 
        {
           con=logicFunction.getConnection();
           HttpSession s1=request.getSession(false);
       //    String uid=s1.getAttribute("User_Id").toString();
         //  out.println("uid"+uid);
           //String did=s1.getAttribute("Drugs_Id").toString();
           //String pid=s1.getAttribute("Patient_Id").toString();
           String mId=logicFunction.checkRequestNull(request, "mId");
      //      int mid=27;
           /*   
           String pid=logicFunction.checkRequestNull(request, "Patient_Id");
           String uid=logicFunction.checkRequestNull(request, "User_Id");
           String com=logicFunction.checkRequestNull(request, "Complain");
           String did=logicFunction.checkRequestNull(request, "Drugs_Id");
           String qty=logicFunction.checkRequestNull(request, "Dose_Qty");
           String unit=logicFunction.checkRequestNull(request, "Unit");
           String time=logicFunction.checkRequestNull(request, "No_Of_Times_In_A_Day");
           String day=logicFunction.checkRequestNull(request, "No_Of_Days");
           String date=logicFunction.checkRequestNull(request, "Date");
           */
         out.println("hhhhhhhhhhh");
            String query=""
                   + "select cp.Patient_Id,cp.User_Name,md.Medication_Id,md.Complain,md.Drugs_Id,md.Dose_Qty,"
                   + "md.Unit,md.No_Of_Times_In_A_Day,md.No_Of_Days,md.Date from child_patient cp"
                   + " left outer join medication md on cp.Patient_Id=md.Patient_Id "
                   + "where Medication_Id="+mId+" "
                   + "ORDER BY Patient_Id";
           stmt=con.createStatement();
           rs=stmt.executeQuery(query); 
         out.println("hhhhhhhhhhh");
           if(rs.next())
           {
             out.println("@@@ in if @@@");
            
             a1.add(rs.getString("Patient_Id"));
             a1.add(rs.getString("User_Name"));
             a1.add(rs.getString("Medication_Id"));
             a1.add(rs.getString("Complain"));
             a1.add(rs.getString("Drugs_Id"));
             a1.add(rs.getString("Dose_Qty"));
             a1.add(rs.getString("Unit"));
             a1.add(rs.getString("No_Of_Times_In_A_Day"));
             a1.add(rs.getString("No_Of_Days"));
             a1.add(rs.getString("Date"));
           }  
             request.setAttribute("data1", a1);
             out.println("arrayresult"+a1);
             
             rd=request.getRequestDispatcher("/changeDrug.jsp?mId=mId");
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
