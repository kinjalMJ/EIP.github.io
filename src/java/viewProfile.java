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
import javax.servlet.http.HttpSession;
import java.util.*;
import javax.servlet.RequestDispatcher;
import logic.logicFunction;


/**
 *
 * @author User
 */
public class viewProfile extends HttpServlet {

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
        Statement stmt=null;
        ResultSet rs=null;
        String user="";
        RequestDispatcher rd=null; 
        ArrayList b1=new ArrayList();   

        try
        {
             con=logicFunction.getConnection();
             HttpSession s1=request.getSession(false);
             user=s1.getAttribute("user").toString();
             String type=s1.getAttribute("Type").toString();
            
             String query=null;
             if(type.equalsIgnoreCase("admin"))
            {
             query="select * from admin_Detail where user_name='"+user.trim()+"' ORDER by user_name";
            }
            if(type.equalsIgnoreCase("Patient"))
            {
             query="select * from child_patient where user_name='"+user.trim()+"'";    
            }
            if(type.equalsIgnoreCase("HealthcareProvider"))
            {
             query="select * from healthcare_provider_detail where user_name='"+user.trim()+"'";
            }
             out.println("user= "+user);
              stmt=con.createStatement();
              rs=stmt.executeQuery(query); 
            
               if(rs.next())
            {
                
                b1.add(rs.getString("First_Name"));
                b1.add(rs.getString("Last_Name"));
                b1.add(rs.getString("Gender"));
                b1.add(rs.getString("Birth_Date"));
                b1.add(rs.getString("Blood_Group"));
               
                if(type.equalsIgnoreCase("admin") || type.equalsIgnoreCase("HealthcareProvider"))
                {
                     b1.add(rs.getString("Education"));
                     b1.add(rs.getString("Experience"));
                     b1.add(rs.getString("Mobile_No"));
                     b1.add(rs.getString("Email_Id"));
                     b1.add(rs.getString("City"));
   
                }
                else if(type.equalsIgnoreCase("patient"))
                {
                    b1.add(rs.getString("Birth_Time"));
                    b1.add(rs.getString("Birth_Time_Unit"));
                    b1.add(rs.getString("Weight_At_Birth"));
                    b1.add(rs.getString("Height_At_Birth"));
                    b1.add(rs.getString("Heartbit_At_Birth"));
                    b1.add(rs.getString("Delivery_Type"));
                    b1.add(rs.getString("Any_Abnormal_Symptoms"));
                    b1.add(rs.getString("Consultant_Doctor"));
                }
               
                    b1.add(rs.getString("Description"));
                
            }
            request.setAttribute("data", b1);
            out.println("b1="+b1);

            rd=request.getRequestDispatcher("/viewProfile.jsp");
            
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
