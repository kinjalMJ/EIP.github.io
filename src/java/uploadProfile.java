
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
import java.sql.*;
import java.util.*;
import logic.logicFunction;
/**
 *
 * @author Kinjal Jarodiya
 */

public class uploadProfile extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        Connection con=null;
        Statement stmt=null;
        ResultSet rs=null;
        RequestDispatcher rd=null; 
        ArrayList a1=new ArrayList();   
        String query=null;
        try 
        {
            out.println("Kinjal");
            con=logicFunction.getConnection();
            HttpSession s1=request.getSession(false);
            String uid=s1.getAttribute("userId").toString();
            out.println("Uid"+uid);
            String user=s1.getAttribute("user").toString();
            out.println("@@@@@@@user"+user);
            query="select User_Id,User_Type,File_Name,Path from user_profile where User_Id='"+uid+"'";
            out.println("user= "+user);
            stmt=con.createStatement();
            rs=stmt.executeQuery(query); 
            while(rs.next())
            {
            //    a1.add(rs.getString("User_Id"));
              //  a1.add(rs.getString("User_Type"));
               a1.add(rs.getString("File_Name"));
               // a1.add(rs.getString("Path"));
                
            }
            request.setAttribute("data", a1);
            System.out.println("@@@@@@@a1="+a1);

            rd=request.getRequestDispatcher("/photoupload.jsp");
            
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