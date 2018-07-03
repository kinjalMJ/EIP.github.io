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
 * @author Kinjal Jarodiya
 */
public class gridViewOfReports extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        Statement stmt=null;
        ResultSet rs=null;
        RequestDispatcher rd=null;
        Connection con=null;
        try 
        {
            con=logicFunction.getConnection();
            out.println("&&&&&&&&&&");
            String query="Select * from Attach ORDER by File_Name";
            ArrayList a2=new ArrayList();
            out.println("@@@@@@@@@@@@");
            stmt=con.createStatement();
            rs=stmt.executeQuery(query);
           //  String patientId="0";
             StringBuffer sb;
             out.println("****************");
              while(rs.next())
                {
                
                    sb=new StringBuffer();
                    out.println("&&&&&&&&&&");
                    sb.append(rs.getString("Field_Id")+":"); 
                sb.append(rs.getString("Patient_Id")+":");
                sb.append(rs.getString("File_Name")+":");
                sb.append(rs.getString("Path")+"");
                
                 a2.add(sb); 
                 }
                request.setAttribute("data", a2);
                out.println(a2);
                
                rd=request.getRequestDispatcher("/fileupload.jsp");
                 rd.forward(request, response);  
         }
        catch(Exception e)
        {
            System.out.println(e);
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
