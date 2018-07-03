/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logic.logicFunction;


/**
 *
 * @author User
 */
public class UpdateNewPassword extends HttpServlet {

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
       
        Connection con= null;
        ResultSet rs= null;
        Statement s= null;
        RequestDispatcher rd=null;
        String q="";

        try {
             String pass=request.getParameter("txtNewPass");
            String comPass=request.getParameter("txtComPass");
            String uname=request.getParameter("hndUname");
            String type=request.getParameter("hndType");
            
            con=logicFunction.getConnection();
            s=con.createStatement();
            
            if(type.equalsIgnoreCase("admin"))
            {
                q="update admin_detail set Password='"+pass+"' where user_name='"+uname+"'";
            }
            else if(type.equalsIgnoreCase("HealthcareProvider"))
            {
                q="update healthcare_provider_detail set Password='"+pass+"' where user_name='"+uname+"'";
            }
             else if(type.equalsIgnoreCase("Patient"))
            {
                q="update child_patient set Password='"+pass+"' where user_name='"+uname+"'";
            }
           
            int k =s.executeUpdate(q);
           
            String path="/Home.jsp";
            rd=getServletContext().getRequestDispatcher(path);
            rd.forward(request, response);
        }
        catch(Exception e)
        {
            out.println(e);
        } finally {            
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
