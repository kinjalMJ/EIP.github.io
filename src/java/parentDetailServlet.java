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
 * @author User
 */
public class parentDetailServlet extends HttpServlet {

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
        Statement stmt=null;
        RequestDispatcher rd=null;
        ArrayList a1=new ArrayList();
try 
        {
         con=logicFunction.getConnection();
            String patientUId=logicFunction.checkRequestNull(request, "txtPatientUN");       
            String fname=logicFunction.checkRequestNull(request, "txtFirstName");
            String lname=logicFunction.checkRequestNull(request, "txtLastName");
            String age=logicFunction.checkRequestNull(request, "txtAge");
           // out.println(gender);
            String relationshipWithChild=logicFunction.checkRequestNull(request, "txtRWChild"); 
            String bloodGroup=logicFunction.checkRequestNull(request, "txtBloodGroup");
            String contactInfo=logicFunction.checkRequestNull(request, "txtContactInfo");
            String contactNo=logicFunction.checkRequestNull(request, "txtContactNo");
            String email=logicFunction.checkRequestNull(request, "txtEmailId");
            String occupation=logicFunction.checkRequestNull(request, "txtOccupation");
           
         //String uname=logicFunction.checkRequestNull(request, "uname");
           // String pass=logicFunction.checkRequestNull(request, "rpass");
            String query="insert into parent_details (Patient_UserId,First_Name,Last_Name,Age,Relation_With_Child_Patient,Blood_Group,Contact_Information,Contact_No,Email_Id,Occupation) values (?,?,?,?,?,?,?,?,?,?)";   
           pstmt=con.prepareStatement(query);
           pstmt.setString(1, patientUId);
           pstmt.setString(2, fname);
           pstmt.setString(3, lname);
           pstmt.setString(4, age);
           pstmt.setString(5, relationshipWithChild);
           pstmt.setString(6, bloodGroup);
           pstmt.setString(7, contactInfo);
           pstmt.setString(8, contactNo);
           pstmt.setString(9, email);
           pstmt.setString(10,occupation);
           pstmt.executeUpdate();
          // out.println("@@@@@"+relationshipWithChild);
                rd=request.getRequestDispatcher("vaccineMsg.jsp");
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
