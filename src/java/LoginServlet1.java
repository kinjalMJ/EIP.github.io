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
import java.util.HashMap;
import java.util.Map;
import logic.logicFunction;
import javax.servlet.http.HttpSession;
import javax.servlet.RequestDispatcher;
/**
 *
 * @author Kinjal Jarodiya
 */
public class LoginServlet1 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
         Connection con=null;
         Statement stmt=null;
         ResultSet rs=null;
         RequestDispatcher rd=null;
         String query=null;
        try
        {
            con=logicFunction.getConnection();
            String user=logicFunction.checkRequestNull(request, "uname");
            String password=logicFunction.checkRequestNull(request, "pass");
            String type=request.getParameter("tp");
           // out.print(type);
            if(type.equalsIgnoreCase("admin"))
            {
             query="select * from admin_Detail where user_name='"+user+"'and password='"+password+"'";
             
            }
            if(type.equalsIgnoreCase("Patient"))
            {
             query="select * from child_patient where user_name='"+user+"'and password='"+password+"'";    
            }
            if(type.equalsIgnoreCase("HealthcareProvider"))
            {
             query="select * from healthcare_provider_detail where user_name='"+user+"'and password='"+password+"'";
            }
            
            stmt=con.createStatement();
            rs=stmt.executeQuery(query); 
           String uId="0";
           HttpSession s1=request.getSession(true);
           if(rs.next())
            {      
                
                s1.setAttribute("user",user);
                s1.setAttribute("Type", type);
  //              s1.setAttribute("photo", photo);
                uId=rs.getString(1);
                s1.setAttribute("userId",uId);
                s1.getAttribute("user").toString();
                s1.getAttribute("Type").toString();
                
                rd=request.getRequestDispatcher("recentPatientDisplay");
               // rd=request.getRequestDispatcher("/adminJsp.jsp");
                out.print("login successfully");
            }
            else
            {
                out.print("login not successfully");
                rd=request.getRequestDispatcher("/Home.jsp?err=Either Username or Password incorrect!");
            }
           query="SELECT * from user_profile where user_id="+uId;
            rs=stmt.executeQuery(query); 
        if(rs.next())
            s1.setAttribute("photo", rs.getString("File_Name"));
            query="select * from pending_task where User_Id='"+uId+"' and user_type='"+type+"'" ;
            rs=stmt.executeQuery(query); 
            ArrayList task=new ArrayList();
            while(rs.next())
            {
                task.add(rs.getString("Task_Id")+":"+rs.getString("Task_Name"));
            }
            s1.setAttribute("task", task);
            query="select * from menu_description";
            rs=stmt.executeQuery(query);
            String pId;
           /* while(rs.next())
            {
                pId=rs.getString("Parent_id");
                if(pId.equalsIgnoreCase("0"))
                {
                    
                }
                else
                {
                    
                }
            }*/
            System.out.println("task= "+task);
            
            // menu coding start
            
                 
                // set menu in session so we can use at in other page
                String q="SELECT p.* FROM menu_description p INNER JOIN menu_rights a ON p.Menu_Id=a.Menu_Id AND  p.parent_Id=0 AND a.User_id="+uId+" UNION SELECT p.* FROM menu_description p WHERE p.menu_id IN (SELECT parent_id FROM menu_description WHERE menu_id IN (SELECT menu_id FROM menu_rights WHERE User_id="+uId+")) and p.User_Type='"+type+"' ORDER BY PRIORITY";
                rs= stmt.executeQuery(q);
                ArrayList subMenu;
                Map mn=new HashMap();
                ArrayList mainmenuName=new ArrayList();
                Statement stmt2=con.createStatement();
                ResultSet rs2;
                HttpSession allMenu=request.getSession(true);
                while(rs.next())
                {
                   int mId= rs.getInt("menu_Id");
                   String mname=rs.getString("Menu_Name");
                   String pg=rs.getString("Path");
                   //if(pg==null)
                   //  pg="no";
                   mainmenuName.add(mname+"$"+pg);
                   String q2="SELECT a.Menu_Id,p.Menu_Name,p.Path,a.User_id,p.Priority FROM menu_Rights a INNER JOIN menu_description p ON p.Menu_Id=a.Menu_Id and p.parent_Id='"+mId+"' WHERE a.User_id="+uId+" ORDER BY p.Priority";
                   rs2= stmt2.executeQuery(q2);
                   subMenu=new ArrayList();
                   while(rs2.next())
                   {
                       subMenu.add(rs2.getString("Menu_Name")+"$"+rs2.getString("Path"));
                   }
                   mn.put(mname, subMenu);
                  allMenu.setAttribute("menu", mn);
                  System.out.println("main menu: "+mainmenuName);
                  allMenu.setAttribute("mainMenu", mainmenuName);
                 
                }
System.out.println("@@@main menu: "+mainmenuName);
System.out.println("@@@mn: "+mn);

            //menu coding end
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
