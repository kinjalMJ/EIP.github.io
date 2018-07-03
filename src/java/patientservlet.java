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
public class patientservlet extends HttpServlet {

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
         try 
        {
            con=logicFunction.getConnection();
                     String fname=logicFunction.checkRequestNull(request, "txtFirstName");
            String lname=logicFunction.checkRequestNull(request, "txtLastName");
            String gender=logicFunction.checkRequestNull(request, "txtgender");
            String birthDate=logicFunction.checkRequestNull(request, "txtBirthDate");
            String birthTime=logicFunction.checkRequestNull(request, "txtBirthTime");
            String birthTimeUnit=logicFunction.checkRequestNull(request, "txtBirthTimeUnit");
            String bloodGroup=logicFunction.checkRequestNull(request, "txtBloodGroup");
            String weightAtBirth=logicFunction.checkRequestNull(request, "txtWeightAtBirth");
            String heightAtBirth=logicFunction.checkRequestNull(request, "txtHeightAtBirth");
            String heartBitAtBirth=logicFunction.checkRequestNull(request, "txtHeartBitAtBirth");
            String deliveryType=logicFunction.checkRequestNull(request, "DeliveryType");
            String symptoms=logicFunction.checkRequestNull(request, "txtAnyAbnormalSymptoms");
            String description=logicFunction.checkRequestNull(request, "txtDescription");
               String uname=logicFunction.checkRequestNull(request, "uname");
            String pass=logicFunction.checkRequestNull(request, "rpass");
            
   //             out.println(description);
           String operation=logicFunction.checkRequestNull(request, "example");
            String uid=logicFunction.checkRequestNull(request, "uid");
                
                  String query;        
                   if(operation.equalsIgnoreCase("edit"))
                   {
                      query= "update child_patient set First_name='"+fname+"',Last_name='"+lname+"',Gender='"+gender+"',Birth_Date='"+birthDate+"',Blood_Group='"+bloodGroup+"',Birth_Time='"+birthTime+"',Birth_Time_Unit='"+birthTimeUnit+"',Weight_At_Birth='"+weightAtBirth+"',Height_At_Birth='"+heightAtBirth+"',Heartbit_At_Birth='"+heartBitAtBirth+"',Delivery_Type='"+deliveryType+"',Any_Abnormal_Symptoms='"+symptoms+"',Description='"+description+"' where Patient_Id="+uid;
                       //query="update admin_detail set First_name='"+fname+"', Last_name='"+lname+"' , Gender='"+gender+"', Birth_Date='"+birthDate+"', Blood_Group='"+bloodGroup+"', Education='"+education+"', Experience='"+experience+"', Mobile_No='"+mobileNo+"', City='"+city+"',Email_Id='"+email+"', Description='"+description+"' where Admin_id="+uid;
                          stmt=con.prepareStatement(query);
                        //  pstmt.setString(1, fname);
                         // pstmt.setString(2, lname);
                          stmt.executeUpdate(query);
                   } 
                   else
                   {
                       //insert
                      query= "insert into child_patient (First_Name,Last_Name,Gender,Birth_Date,Blood_Group,Birth_Time,Birth_Time_Unit,Weight_At_Birth,Height_At_Birth,Heartbit_At_Birth,Delivery_Type,Any_Abnormal_Symptoms,Description,User_Name,Password) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                      //  query="insert into admin_detail (First_Name,Last_Name,Gender,Birth_Date,Blood_Group,Education,Experience,Mobile_No,City,Email_Id,Description,User_Name,Password,type) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                        pstmt=con.prepareStatement(query);
                        pstmt.setString(1, fname);
                        pstmt.setString(2, lname);
                        pstmt.setString(3, gender);
                        pstmt.setString(4, birthDate);    
                        pstmt.setString(5, bloodGroup);
                        pstmt.setString(6, birthTime);
                        pstmt.setString(7, birthTimeUnit);
                        pstmt.setString(8, weightAtBirth);
                        pstmt.setString(9, heightAtBirth);
                        pstmt.setString(10, heartBitAtBirth);
                        pstmt.setString(11, deliveryType);
                        pstmt.setString(12, symptoms);
                        pstmt.setString(13, description);
                        pstmt.setString(14, uname);
                        pstmt.setString(15, pass);
                        pstmt.executeUpdate();
                   }
                   
                   rd=request.getRequestDispatcher("/patientList");
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
