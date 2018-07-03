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
import java.util.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
import logic.logicFunction;

/**
 *
 * @author Kinjal Jarodiya
 */
public class viewInteractionType extends HttpServlet {

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
        String query1=null;
        String query2=null;
        String query3=null;
        RequestDispatcher rd=null; 
        ArrayList b1=new ArrayList();   
        ArrayList b2=new ArrayList();   
        ArrayList b3=new ArrayList();   

        try 
        {
             con=logicFunction.getConnection();
            HttpSession vDetails;
           String vid;
           String did;
           String pId;
           if(request.getParameter("vId")!=null && request.getParameter("dId")!=null && request.getParameter("pId")!=null) 
           {
           vid=logicFunction.checkRequestNull(request,"vId");
            did=logicFunction.checkRequestNull(request,"dId");
            pId=logicFunction.checkRequestNull(request,"pId");
            vDetails=request.getSession(true);
            vDetails.setAttribute("vId", vid);
            vDetails.setAttribute("dId", did);
            vDetails.setAttribute("pId", pId);
           }
           else
           {
                vDetails=request.getSession(false);
                vid=vDetails.getAttribute("vId").toString();
                did=vDetails.getAttribute("dId").toString();
                pId=vDetails.getAttribute("pId").toString();
           }
           
          //   query1="select * from interaction_details inner join "
            //         + " drugs on drugs.Drugs_Id=interaction_details.Drug_Id where Interaction_Type='Drug' and Vaccine_Id="+vid;
            query1 = "select * from interaction_details inner join "
                    + " drugs on drugs.Drugs_Id=interaction_details.Drug_Id "
                    + " inner join medication m on m.Drugs_Id=interaction_details.Drug_Id and m.Patient_Id='"+pId+"'"
                    + " where Interaction_Type='Drug' and Vaccine_Id="+vid;
             stmt=con.createStatement();
             rs=stmt.executeQuery(query1); 
             
             while(rs.next())
              {
                out.println("@@@@@@@@@@@@"+vid);
                
                b1.add(rs.getString("Interaction_Id")+":"+rs.getString("Vaccine_Id")+":"+rs.getString("interaction_details.Drug_Id")+":"+rs.getString("Drugs_Name")+":"+rs.getString("Description")+":"+rs.getString("Medication_Id"));
                
              }
            request.setAttribute("data", b1);
            out.println("b1="+b1);
            
            query2="select Description,Interaction_Id from interaction_details where Interaction_Type='Food' and Vaccine_Id="+vid;
            
            stmt=con.createStatement();
            rs=stmt.executeQuery(query2); 
            while(rs.next())
                b2.add(rs.getString("Interaction_Id")+":"+rs.getString("Description"));
            //b2.add();
            request.setAttribute("data1", b2);
            out.println("b2="+b2);
             
            
            query3="select Description,Interaction_Id from interaction_details where Interaction_Type='Alergy' and Vaccine_Id="+vid;
            
            stmt=con.createStatement();
            rs=stmt.executeQuery(query3); 
            while(rs.next())
                b3.add(rs.getString("Interaction_Id")+":"+rs.getString("Description"));
           
            request.setAttribute("data2", b3);
            out.println("b3="+b3);
            String pname="";
            query3="select User_Name from child_patient where Patient_Id="+pId;
             rs=stmt.executeQuery(query3); 
             while(rs.next())
             {
                 pname=rs.getString("User_Name");
             }
            rd=request.getRequestDispatcher("/viewInteractionType.jsp?patientName="+pname+"&vId="+vid+"&doseId="+did+"&patientId="+pId);
            rd.forward(request, response);
        }
        catch(Exception e)
        {
            out.println(e);
        }
        finally {            
            out.close();
        }
    }// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
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
