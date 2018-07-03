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
import logic.logicFunction;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author Kinjal Jarodiya
 */
public class VaccineDetailsServlet extends HttpServlet {

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
        PreparedStatement pstmt=null;
       // ResultSet rs=null;
        RequestDispatcher rd=null;
        try
        {
                con=logicFunction.getConnection();
                String vid=logicFunction.checkRequestNull(request, "txtvaccineId");
                String vname=logicFunction.checkRequestNull(request, "txtvaccineName");
                String gen=logicFunction.checkRequestNull(request, "gender");
                String vt=logicFunction.checkRequestNull(request, "vaccineType");
                String rs1=logicFunction.checkRequestNull(request, "rs");
                String doseno=logicFunction.checkRequestNull(request, "noofDose");
               // out.println(gen);
                String dec=logicFunction.checkRequestNull(request, "txtdec");
               
                String query="insert into Vaccine (Vaccine_Name,Description,For_Whom,Vaccine_Type,Routine_Special,No_Of_Dose) values (?,?,?,?,?,?)";

                pstmt=con.prepareStatement(query);
                //pstmt.setString(1, vid);
                pstmt.setString(1, vname);
                pstmt.setString(2, dec);
                pstmt.setString(3, gen);
                pstmt.setString(4, vt);
                pstmt.setString(5, rs1);
                pstmt.setString(6, doseno);
             
                pstmt.executeUpdate();
                
                query="select max(Vaccine_id) Vid from vaccine";
            
                pstmt=con.prepareStatement(query);
                ResultSet rs=pstmt.executeQuery();
                String vaccineId="0";
                if(rs.next())
                {
                    vaccineId=rs.getString("Vid");
                        out.println(vaccineId);
                }
                query="insert into vaccine_dose (Vaccine_Id,Age_Range,Optional_OR_Mandatory,Description) values(?,?,?,?)";
               pstmt=con.prepareStatement(query);
                for(int i=0;i < Integer.parseInt(doseno);i++)
                {
                    String age=logicFunction.checkRequestNull(request, "age"+i);
                    String optn=logicFunction.checkRequestNull(request, "optional_Mandatory"+i);
                    String desc=logicFunction.checkRequestNull(request, "desc"+i);
                    pstmt.setInt(1, Integer.parseInt(vaccineId));
                    pstmt.setInt(2, Integer.parseInt(age));
                    pstmt.setString(3, optn);
                    pstmt.setString(4, desc);
                    pstmt.addBatch();
                    
                }
                pstmt.executeBatch();
                rd=request.getRequestDispatcher("gridViewOfVaccine");
                rd.forward(request, response);
                
            } 
                
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally 
        {            
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
