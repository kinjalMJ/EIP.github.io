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
public class adminServlet extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        Connection con=null;
        PreparedStatement pstmt=null;
        Statement stmt=null;
        RequestDispatcher rd=null;
         try 
        {
            con=logicFunction.getConnection();
            String fname=logicFunction.checkRequestNull(request, "txtFirstName");
            
            String lname=logicFunction.checkRequestNull(request, "txtLastName");
            String gender=logicFunction.checkRequestNull(request, "txtgender");
            out.println(gender);
            String birthDate=logicFunction.checkRequestNull(request, "txtBirthDate"); 
            String bloodGroup=logicFunction.checkRequestNull(request, "txtBloodGroup");
            String education=logicFunction.checkRequestNull(request, "txtEducation");
            String experience=logicFunction.checkRequestNull(request, "txtExperience");
            String mobileNo=logicFunction.checkRequestNull(request, "txtMobileNo");
            String city=logicFunction.checkRequestNull(request, "txtCity");
            String email=logicFunction.checkRequestNull(request, "txtEmailId");
            String description=logicFunction.checkRequestNull(request, "txtDescription");
            String type=logicFunction.checkRequestNull(request, "type");
            String uname=logicFunction.checkRequestNull(request, "uname");
            String pass=logicFunction.checkRequestNull(request, "rpass");
            
   //             out.println(description);
           String operation=logicFunction.checkRequestNull(request, "example");
            String uid=logicFunction.checkRequestNull(request, "uid");
                out.println(uid);
                  String query;        
                   if(operation.equalsIgnoreCase("edit"))
                   {
                       query="update admin_detail set First_name='"+fname+"', Last_name='"+lname+"' , Gender='"+gender+"', Birth_Date='"+birthDate+"', Blood_Group='"+bloodGroup+"', Education='"+education+"', Experience='"+experience+"', Mobile_No='"+mobileNo+"', City='"+city+"',Email_Id='"+email+"', Description='"+description+"' where Admin_id="+uid;
                          stmt=con.prepareStatement(query);
                        //  pstmt.setString(1, fname);
                         // pstmt.setString(2, lname);
                          stmt.executeUpdate(query);
                   }   
                   else
                   {
                       //insert
                        query="insert into admin_detail (First_Name,Last_Name,Gender,Birth_Date,Blood_Group,Education,Experience,Mobile_No,City,Email_Id,Description,User_Name,Password,type) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

                        pstmt=con.prepareStatement(query);
                        pstmt.setString(1, fname);
                        pstmt.setString(2, lname);
                        pstmt.setString(3, gender);
                        pstmt.setString(4, birthDate);
                        pstmt.setString(5, bloodGroup);
                        pstmt.setString(6, education);
                        pstmt.setString(7, experience);
                        pstmt.setString(8, mobileNo);
                        pstmt.setString(9, city);
                        pstmt.setString(10, email);
                        pstmt.setString(11, description);
                        pstmt.setString(12, uname);
                        pstmt.setString(13, pass);
                        pstmt.setString(14, type);
                        pstmt.executeUpdate();
                   }
                   rd=request.getRequestDispatcher("adminList");
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
