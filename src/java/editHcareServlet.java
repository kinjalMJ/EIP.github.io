/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * editHcareServlet
 */
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
public class editHcareServlet extends HttpServlet {

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
        try 
        {
            String uid=logicFunction.checkRequestNull(request, "uid");
            String query="Select * from healthcare_provider_detail where healthcareProvider_Id="+uid;
            ArrayList a1=new ArrayList();
            
            stmt=logicFunction.getConnection().createStatement();
            rs=stmt.executeQuery(query); 
            if(rs.next())
            {
                
                a1.add(rs.getString("First_Name"));
                a1.add(rs.getString("Last_Name"));
                a1.add(rs.getString("Gender"));
                a1.add(rs.getString("Birth_Date"));
                a1.add(rs.getString("Blood_Group"));
                a1.add(rs.getString("Education"));
                a1.add(rs.getString("Experience"));
                a1.add(rs.getString("Mobile_No"));
                a1.add(rs.getString("Email_Id"));
                a1.add(rs.getString("City"));
                a1.add(rs.getString("Description"));
                
            }
            request.setAttribute("data", a1);
            out.println(a1);
                rd=request.getRequestDispatcher("/AhealthcareProviderRegistration.jsp?uid="+uid);
            
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
