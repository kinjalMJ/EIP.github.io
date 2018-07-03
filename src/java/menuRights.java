/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
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
public class menuRights extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        Connection con=null;
        PreparedStatement pstmt=null;
        String query="";
        RequestDispatcher rd=null;
        try 
        {
           con=logicFunction.getConnection();
           
           Enumeration em=request.getParameterNames();
           ArrayList param=new ArrayList();
           String type=logicFunction.checkRequestNull(request, "Type");
           String uId=logicFunction.checkRequestNull(request, "User");
           while(em.hasMoreElements())
           {
               param.add(em.nextElement());
           }
           
           query="delete from menu_rights where User_Id="+uId;
           pstmt=con.prepareStatement(query);
           pstmt.executeUpdate();
           query="insert into menu_rights(Menu_Id,User_Id,Type) values(?,?,?)";
           pstmt=con.prepareStatement(query);
            for(int i=0;i<param.size();i++)
           {
               String val=param.get(i).toString();
               if(val.contains("chk"))
               {
                   String ind=val.substring("chk".length());
                   String mId=logicFunction.checkRequestNull(request, "sub"+ind);
                   pstmt.setInt(1, Integer.parseInt(mId));
                   pstmt.setInt(2, Integer.parseInt(uId));
                   pstmt.setString(3, type);
                   pstmt.addBatch();
               }
               
           }
          pstmt.executeBatch();
 
          rd=request.getRequestDispatcher("/vaccineMsg.jsp");
            
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
