
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import  java.util.*;
import javax.servlet.http.HttpSession;
import javax.servlet.RequestDispatcher;
import java.sql.*;
import logic.logicFunction;

public class pendingTask extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        Connection con=null;
        PreparedStatement pstmt=null;
        RequestDispatcher rd=null;
        try 
        {
            con=logicFunction.getConnection();
            
            String tnm=logicFunction.checkRequestNull(request, "txtTaskName");
            String td=logicFunction.checkRequestNull(request, "txtTaskDate");
            String tdes=logicFunction.checkRequestNull(request, "txtDescription");
            HttpSession s1=request.getSession(false);
            String user=s1.getAttribute("userId").toString();
            String type=s1.getAttribute("Type").toString();
            String query="";
            if(tnm.length()>0)
            {
            query="insert into Pending_Task(Task_Name,Task_Date,Description,User_Id,User_Type) values(?,?,?,?,?)";
           
            pstmt=con.prepareStatement(query);
            pstmt.setString(1, tnm);
            pstmt.setString(2, td);
            pstmt.setString(3, tdes);
            pstmt.setString(4, user);
            pstmt.setString(5, type);
            pstmt.executeUpdate();
            }
              query="select * from pending_task where User_Id='"+user+"' and user_type='"+type+"'and flag=1" ;
             Statement stmt=con.createStatement();
          ResultSet rs=stmt.executeQuery(query); 
           ArrayList task=new ArrayList();
           while(rs.next())
            {
                task.add(rs.getString("Task_Id")+":"+rs.getString("Task_Name")+":"+rs.getString("Task_Date")+":"+rs.getString("Description"));
            }
           request.setAttribute("task", task);
                      
            rd=request.getRequestDispatcher("/pendingTask.jsp");
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
