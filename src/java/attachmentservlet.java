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
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
import logic.logicFunction;
import java.io.*;
/**
 *
 * @author User
 */
public class attachmentservlet  extends HttpServlet {

       protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
            String saveFile = "";
            String contentType = request.getContentType();

        try {
            
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
                    
                    path = "C:\\Users\\Kinjal Jarodiya\\Documents\\NetBeansProjects\\EIP\\web\\Atachment\\" + saveFile;
                    // path="D:/" +saveFile;
                    out.println(path);
                    out.println("-----------------");
                    out.println("------------------"+saveFile);

                    File ff = new File(path);
                    FileOutputStream fileOut = new FileOutputStream(ff);
                    fileOut.write(dataBytes, startPos, (endPos - startPos));


                    fileOut.flush();
                    fileOut.close();
                    
                   // String fl=request.getParameter("file");
                HttpSession s1=request.getSession(false);
                out.println("user Id: "+s1.getAttribute("userId"));
             int pNo=Integer.parseInt(s1.getAttribute("userId").toString().trim());
             Connection con=null;
             PreparedStatement pst=null;
          //  ArrayList user = new ArrayList();
            con=logicFunction.getConnection();
            String q="insert into attach(Patient_Id,File_Name,Path) values(?,?,?)";            
            pst=con.prepareStatement(q);
            pst.setInt(1,pNo);
            pst.setString(2, saveFile);
            pst.setString(3, path);
            int i=pst.executeUpdate();
            RequestDispatcher rd;
            rd=request.getRequestDispatcher("/uploadFileData");
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
