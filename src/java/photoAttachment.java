
import java.io.*;
import javax.servlet.ServletException;
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
public class photoAttachment extends HttpServlet 
{
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        Connection con=null;
        PreparedStatement pst=null;
        ResultSet rs=null;
        RequestDispatcher rd=null; 
        ArrayList a1=new ArrayList();   
        String saveFile = "";
        String contentType = request.getContentType();
        
        try 
        {
            con=logicFunction.getConnection();
            
            out.println("1111");
            if ((contentType != null) && (contentType.indexOf("multipart/form-data") >= 0))
            {
                    DataInputStream in = new DataInputStream(request.getInputStream());
                    //DataInputStream - An input stream that contains methods for reading the Java standard data types

                    int formDataLength = request.getContentLength();
                    out.println("formDataLength : "+formDataLength);

                    byte dataBytes[] = new byte[formDataLength];

                    int byteRead = 0;
                    int totalBytesRead = 0;

                    while (totalBytesRead < formDataLength)
                    {
                          byteRead = in.read(dataBytes, totalBytesRead, formDataLength);
                          totalBytesRead += byteRead;
                    }

                    String file = new String(dataBytes);
                    saveFile = file.substring(file.indexOf("filename=\"") + 10);
                    saveFile = saveFile.substring(0, saveFile.indexOf("\n"));
                    saveFile = saveFile.substring(saveFile.lastIndexOf("\\") + 1, saveFile.indexOf("\""));

                    int lastIndex = contentType.lastIndexOf("=");
                    String boundary = contentType.substring(lastIndex + 1, contentType.length());

                    int pos;
                    pos = file.indexOf("filename=\"");
                    pos = file.indexOf("\n", pos) + 1;
                    pos = file.indexOf("\n", pos) + 1;
                    pos = file.indexOf("\n", pos) + 1;

                    int boundaryLocation = file.indexOf(boundary, pos) - 4;
                    int startPos = ((file.substring(0, pos)).getBytes()).length;
                    int endPos = ((file.substring(0, boundaryLocation)).getBytes()).length;

                    String path;
                    path = "C:\\Users\\Kinjal Jarodiya\\Documents\\NetBeansProjects\\EIP\\web\\Profile\\" + saveFile;
                    // path="D:/" +saveFile;
                    out.println(path);
                    out.println("-----------------");
                    out.println("------------------"+saveFile);
                    File ff = new File(path);
                    FileOutputStream fileOut = new FileOutputStream(ff);
                    fileOut.write(dataBytes, startPos, (endPos - startPos));
                    fileOut.flush();
                    fileOut.close();
                 out.println("222222222");   
            HttpSession s1=request.getSession(false);
            
            String userId=s1.getAttribute("userId").toString();
           
                 out.println("333"); 
            String Type=s1.getAttribute("Type").toString();
            out.println("ooooooooo");
            /////////////////////////////////////////
            String query="delete from user_profile where User_Id="+userId;
            pst=con.prepareStatement(query);
            pst.executeUpdate();
            String q="insert into user_profile(User_Id,User_Type,File_Name,Path) values(?,?,?,?)"; 
            pst=con.prepareStatement(query);
            
            ///////////////////////////////////////////
                     
            pst=con.prepareStatement(q);
            pst.setString(1, userId);
            pst.setString(2, Type);
            pst.setString(3, saveFile);
            pst.setString(4, path);
           
            int i=pst.executeUpdate();
            System.out.println("@@@@@@");
          
            s1.setAttribute("photo", saveFile);
          
            rd=request.getRequestDispatcher("/photoupload.jsp?path="+saveFile);
            rd.forward(request, response);
            }
                 
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
