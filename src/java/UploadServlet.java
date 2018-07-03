import com.itextpdf.text.pdf.codec.Base64.InputStream;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;
import javax.servlet.http.Part;
 
public class UploadServlet extends HttpServlet
 {
    @Override
   protected void service(HttpServletRequest request,HttpServletResponse responst) throws ServletException, IOException
   {
      Collection<Part> parts = request.getParts();
      if (parts.size() != 3) {
         //can write error page saying all details are not entered
       }

       Part filePart = httpServletRequest.getPart("photo");
        java.io.InputStream imageInputStream = filePart.getInputStream();
       //read imageInputStream
       filePart.write("somefiepath");
       //can also write the photo to local storage

       //Read Name, String Type 
       Part namePart = request.getPart("name");
       if(namePart.getSize() > 20){
           //write name cannot exceed 20 chars
       }
       //use nameInputStream if required        
        java.io.InputStream nameInputStream = namePart.getInputStream();
       //name , String type can also obtained using Request parameter 
       String nameParameter = request.getParameter("name");

       //Similialrly can read age properties
       Part agePart = request.getPart("age");
       int ageParameter = Integer.parseInt(request.getParameter("age"));



    }

}