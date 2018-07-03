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
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
import java.sql.*;
import logic.logicFunction;
import java.util.*;
/**
 *
 * @author india
 */
public class changePassword extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
 
        Connection con=null;
        Statement stmt=null;
        ResultSet rs=null;
        String user="",type="";
        RequestDispatcher rd=null; 
        ArrayList a1=new ArrayList();   
        String query=null;
        String pass=null;
        try 
        {
            con = logicFunction.getConnection();

            String u1;
            String path="";
            HttpSession s1=request.getSession(false);
            user=s1.getAttribute("user").toString();
            type=s1.getAttribute("Type").toString();
             
            String p1=request.getParameter("Enteroldpassword");
            String p2=request.getParameter("Enternewpassword");    
            String p3=request.getParameter("Re-Enternewpassword");
            out.println(p1);
            if(p2.equals(p3))
             {
            out.println(type);
            
            
           // ---------------------------------------------------------------------------------------------------------
            if(type.equalsIgnoreCase("admin"))
            {
                out.println("in  if");
             query="Select Password from admin_detail where User_Name='"+user.trim()+"'";
             
             stmt=con.createStatement();
             rs=stmt.executeQuery(query); 
           out.println(user);
             
             if(rs.next())
                 {
                     pass=rs.getString("password");
                     out.println("in rs.next pass"+pass);
                     out.println("p1= "+p1);
                     if(pass.equals(p1))
                     {
                           // out.println("@@@@@@@@@@@@@@"+p2);
                           query="UPDATE admin_detail set Password='"+p2+"' where User_Name='"+user+"' and '"+p1+"'!='"+p2+"'";
               
                           //out.println("query: "+query);
              
                           stmt.executeUpdate(query);
                       
                     }
                    
                 }
            }

//----------------------------------------------------------------------------------------------------------------------------------------            
            if(type.equalsIgnoreCase("Patient"))
            {
            // query="select Password from child_patient where  User_Name='"+user.trim()+"'";   
           
                out.println("in  if");
             query="Select Password from child_patient where User_Name='"+user.trim()+"'";
             
             stmt=con.createStatement();
             rs=stmt.executeQuery(query); 
           out.println(user);
             
             if(rs.next())
                 {
                     pass=rs.getString("password");
                     out.println("in rs.next pass"+pass);
                     out.println("p1= "+p1);
                     if(pass.equals(p1))
                     {
                           // out.println("@@@@@@@@@@@@@@"+p2);
                           query="UPDATE child_patient set Password='"+p2+"' where User_Name='"+user+"' and '"+p1+"'!='"+p2+"'";
               
                           //out.println("query: "+query);
              
                           stmt.executeUpdate(query);                       
                     }
                 }
            }
            
 // -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------          
            if(type.equalsIgnoreCase("HealthcareProvider"))
            {
              
                out.println("in  if");
             query="Select Password from healthcare_provider_detail where User_Name='"+user.trim()+"'";
             
             stmt=con.createStatement();
             rs=stmt.executeQuery(query); 
           out.println(user);
             
             if(rs.next())
                 {
                     pass=rs.getString("password");
                     out.println("in rs.next pass"+pass);
                     out.println("p1= "+p1);
                     if(pass.equals(p1))
                     {
                           // out.println("@@@@@@@@@@@@@@"+p2);
                           query="UPDATE healthcare_provider_detail set Password='"+p2+"' where User_Name='"+user+"' and '"+p1+"'!='"+p2+"'";
               
                           //out.println("query: "+query);
              
                           stmt.executeUpdate(query);
                        
                     }
                 }

            }
//   --------------------------------------------------------------------------------------------------------------------------------------------------------------             
            rd=request.getRequestDispatcher("/changingMsg.jsp");
             
             rd.forward(request, response);
            
       }
  //----------------------------------------------------------------------------------------------------------------------------------------------------------------------            
       else
            {
                rd=request.getRequestDispatcher("/changePassword.jsp");
             
                rd.forward(request, response);
            }
  
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
