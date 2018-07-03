/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

/**
 *
 * @author Kinjal Jarodiya
 */
import javax.servlet.http.HttpServletRequest;
import java.sql.*;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.Address;
import java.util.*;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
//import javax.mail.PasswordAuthentication;

public class logicFunction
{
    public static Connection getConnection()
    {
       Connection con=null;
        try
       {
        Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/eip";
        con=DriverManager.getConnection(url,"root", "");
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
        return con;
    }
    
    public static String checkRequestNull(HttpServletRequest req,String param)
    {
        String val="";
        if(req.getParameter(param)!=null)
            val=req.getParameter(param).toString().trim();
        return val;
            
    }
    
             public static void mymail(String email,String uname,String type)
        {
                
		String host = "smtp.gmail.com";
                String from = "bhaktigovani@gmail.com";
                String pass = "bhakti203";
                Properties props = System.getProperties();
              /*  props.put("mail.smtp.port", "587");
                props.put("mail.smtp.auth", "true");
                props.put("mail.smtp.timeout" , "3000");
                props.put("mail.smtp.starttls.enable", "true");
                props.put("mail.smtp.socketFactory.port", "587");
                props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
                props.put("javax.net.debug","ssl,session");
                props.put("mail.smtp.dsn.notify","SUCCESS ORCPT=rfc822;");
                props.put("mail.smtp.dsn.ret", "FULL");
                props.put("mail.smtp.host", host);*/
                
            //    props.put("mail.smtp.user", from);
              //  props.put("mail.smtp.password", pass);
               // PasswordAuthentication  p=new PasswordAuthentication (from,pass);
                props.put("mail.smtp.host", "smtp.gmail.com");
                 props.put("mail.smtp.starttls.enable", true);
                 props.put("mail.smtp.auth", true);
                
                System.out.println("11111111111");
                try
                {
                    //email="ankit.monpara@gmail.com";
                    String[] to = {"kinjaljarodiya22@gmail.com"}; // added this line

/*                    Session session = Session.getDefaultInstance(props, null);
                    
                    SmtpAuthenticator authentication = new SmtpAuthenticator();
                     PasswordAuthentication p =authentication.getPasswordAuthentication();
                    javax.mail.Message message = new MimeMessage(Session
                    .getDefaultInstance(props, p));
                  //  MimeMessage message = new MimeMessage(session);*/
     /*               Session session = Session.getDefaultInstance(props, 
    new javax.mail.Authenticator(){
        protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(
                "bhaktigovani@gmail.com", "bhakti203");// Specify the Username and the PassWord
        }
});
                 */   
                    Session session = Session.getInstance(props, new GMailAuthenticator(from, pass));
                     MimeMessage message = new MimeMessage(session);
                    message.setFrom(new InternetAddress(from));

                    InternetAddress[] toAddress = new InternetAddress[to.length];
                     System.out.println("22222111111111");
                    // To get the array of addresses
                    for( int i=0; i < to.length; i++ )
                    { // changed from a while loop
                        toAddress[i] = new InternetAddress(to[i]);
                    }
                    System.out.println(Message.RecipientType.TO);

                    for( int i=0; i < toAddress.length; i++) 
                    { // changed from a while loop
                        message.addRecipient(Message.RecipientType.TO, toAddress[i]);
                    }
                    
                    message.setSubject("Vaccination.com : Password Reset Request");
                    message.setContent(" To reset your password, click on the link below and follow the instructions on the Meetup.com web site."
                            +"<br>"
                            +"<a href=localhost:8084/EIP/ForNewPassword.jsp?Type="+type+"&Username="+uname+">Click here</a>"
                            +"<br>"
                            +"If you did not request to change your password, ignore this email and no changes will be made to your account."
                            +"<br>"
                            +"Best regards,"
                            +"<br>"
                            +"The Team at _________","text/html");

                    Transport transport = session.getTransport("smtp");
                    transport.connect(host, from, pass);
                    transport.sendMessage(message, message.getAllRecipients());
                    transport.close();


                }
                catch(Exception e)
                {
                    System.out.print(e);
                }
        }

}

class GMailAuthenticator extends Authenticator {
     String user;
     String pw;
     public GMailAuthenticator (String username, String password)
     {
        super();
        this.user = username;
        this.pw = password;
     }
    public PasswordAuthentication getPasswordAuthentication()
    {
       return new PasswordAuthentication(user, pw);
    }
}
