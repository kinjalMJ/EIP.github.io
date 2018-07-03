import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import logic.logicFunction;
import javax.servlet.RequestDispatcher;
import java.util.*;
/**
 *
 * @author Kinjal Jarodiya
 */
public class viewVDetail extends HttpServlet {
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
         con=logicFunction.getConnection();
         String pid=logicFunction.checkRequestNull(request, "pId");
         String did=logicFunction.checkRequestNull(request, "dId");
         String vid=logicFunction.checkRequestNull(request, "dId");
         out.println("@@@11111@@@"+pid);
         out.println("@@@22222222222@@@"+vid);
         out.println("@@@33333@@@"+did);
         String query="select Patient_Id,Vaccine_Id,Vaccine_Dose_Id,Vaccination_Date,Wieght,Height,Pluses,Description,User_Id from vaccination_record";        
         stmt=con.createStatement();
         rs=stmt.executeQuery(query); 
         if(rs.next())
         {
             out.println("@@@ in if @@@");
             a1.add(rs.getString("Patient_Id"));
             a1.add(rs.getString("Vaccine_Id"));
             a1.add(rs.getString("Vaccine_Dose_Id"));
             a1.add(rs.getString("Vaccination_Date"));
             a1.add(rs.getString("Wieght"));
             a1.add(rs.getString("Height"));
             a1.add(rs.getString("Pluses"));
             a1.add(rs.getString("Description"));
             a1.add(rs.getString("User_Id"));
         }  
             request.setAttribute("data", a1);
             out.println("arrayresult"+a1);
             
             rd=request.getRequestDispatcher("/viewVDetail.jsp");
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
