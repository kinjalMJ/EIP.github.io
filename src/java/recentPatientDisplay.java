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
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
import javax.servlet.RequestDispatcher;
import java.util.*;
/**
 *
 * @author india
 */
public class recentPatientDisplay extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
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
        Connection con=null;
        RequestDispatcher rd=null;
        String query=null;
        ResultSet rs=null;
        ArrayList a1=new ArrayList();
        try 
        {
        con= logicFunction.getConnection();
        
        HttpSession s1=request.getSession(false);
        String type=s1.getAttribute("Type").toString();
         String uid=  s1.getAttribute("userId").toString();
         out.println(uid);
        if(type.equalsIgnoreCase("admin"))
        {  
        query="select User_Name from child_patient Order by Patient_Id desc limit 5";
        }
        else if(type.equalsIgnoreCase("HealthcareProvider"))
        {
         query="select c.User_Name from medication m inner join child_patient c on m.Patient_Id=c.Patient_Id Order by m.Patient_Id desc limit 5";        
        }
 ///////////////////////////////////////////////////////code for task assign in patient/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////               
        else if(type.equalsIgnoreCase("Patient"))
        {
            query="select * from pending_task where User_Id='"+uid+"' and user_type='"+type+"'and flag=1" ;
              stmt=con.createStatement();
           rs=stmt.executeQuery(query); 
           ArrayList task=new ArrayList();
           while(rs.next())
            {
                task.add(rs.getString("Task_Id")+":"+rs.getString("Task_Name")+":"+rs.getString("Task_Date")+":"+rs.getString("Description"));
            }
           request.setAttribute("task", task);
          
               
            rd=request.getRequestDispatcher("/vaccineChartForChild.jsp");
                rd.forward(request, response);
       
        }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////       
        stmt=con.createStatement();
        rs= stmt.executeQuery(query);
           while (rs.next())
            {
                
                a1.add(rs.getString("User_Name"));
            }
           request.setAttribute("data", a1);
           out.println("a1="+a1);
           
           query="select * from pending_task where User_Id='"+uid+"' and user_type='"+type+"'and flag=1" ;
           rs=stmt.executeQuery(query); 
           ArrayList task=new ArrayList();
           while(rs.next())
            {
                task.add(rs.getString("Task_Id")+":"+rs.getString("Task_Name")+":"+rs.getString("Task_Date")+":"+rs.getString("Description"));
            }
           request.setAttribute("task", task);
           System.out.println("@@@@@@@@@@@ Task: "+task);
                rd=request.getRequestDispatcher("/adminJsp.jsp");
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
     * Handles the HTTP
     * <code>GET</code> method.
     *
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
     * Handles the HTTP
     * <code>POST</code> method.
     *
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
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
