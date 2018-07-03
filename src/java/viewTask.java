
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.util.ArrayList;
import logic.logicFunction;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author Kinjal Jarodiya
 */
public class viewTask extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        Connection con=null;
        Statement stmt=null;
        ResultSet rs=null;
        RequestDispatcher rd=null;
        ArrayList a1=new ArrayList();
        try 
        {
         out.println("in servlet");
            con=logicFunction.getConnection();
         //   String tid=logicFunction.checkRequestNull(request, "task");
           String tid=request.getParameter("task"); 
           out.println("taskId="+tid);
            String query="select Task_Id,Task_Name,Task_Date,Description,User_Id,User_Type from Pending_Task where Task_Id="+tid ;  
            
         stmt=con.createStatement();
         rs=stmt.executeQuery(query); 
         if(rs.next())
         {
             out.println("@@@ in if @@@");
             a1.add(rs.getString("Task_Id"));
             a1.add(rs.getString("Task_Name"));
             a1.add(rs.getString("Task_Date"));
             a1.add(rs.getString("Description"));
             a1.add(rs.getString("User_Id"));
             a1.add(rs.getString("User_Type"));
         }  
             request.setAttribute("data", a1);
             out.println("arrayresult"+a1);
             
             rd=request.getRequestDispatcher("/viewTask.jsp?");
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
