import java.io.IOException;
import java.io.PrintWriter;
import java.security.Security;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//@WebServlet(name = "a3", urlPatterns = {"/register"})
public class verifyforget extends HttpServlet 
{
  int c=1;
  String user,email,pass;
  @Override
  public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  
  {
       PrintWriter out = res.getWriter();
       HttpSession ses=req.getSession(false);
       c=(Integer)ses.getAttribute("f");
       user=req.getParameter("t1");
       email=req.getParameter("t2");
       if(user.equals("")||email.equals(""))
       {
           out.println("<body bgcolor=lightyellow><h3><pre>");
              out.println("<h3 align='center'>Ideal Institute of Technology,GZB</h3>");
              out.println("<p align='center'>Online Registration</p><hr color='red'>");
              ses.setAttribute("f",2);
              res.sendRedirect("http://localhost:8084/interactive/forget");
       }  
       else
       {
            try
           {   
            Connection con=MyConnection.getConnection();
            String query="Select password from member where username=? and email=?";
            PreparedStatement ps=con.prepareStatement(query);
            ps.setString(1,user);
            ps.setString(2,email);
            ResultSet rs=ps.executeQuery();
          
           // System.out.println(pass);
            if(rs.next())
            {    
                   while(rs.next())
                   {
                     pass=rs.getString(1);
                   }
                 String subject="Request for Password";
                 String emailMsgTxt=pass+"<br>This is your password ";
                 String SMTP_HOST_NAME = "smtp.gmail.com";
                 String SMTP_PORT = "465"; // gmail/yahoo
                 final String SENDERID = "cityvillehelphimanshu";
                 final String SENDERPASS="coolbhai";
                 String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
                 String[] EMAIL_TO_ADDRESS = {email};
                 Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
                 Properties props = new Properties();
                 props.put("mail.smtp.host", SMTP_HOST_NAME);
                 props.put("mail.smtp.auth", "true");
                 props.put("mail.debug", "true");
                 props.put("mail.smtp.port", SMTP_PORT);
                 props.put("mail.smtp.socketFactory.port", SMTP_PORT);
                 props.put("mail.smtp.socketFactory.class", SSL_FACTORY);
                 props.put("mail.smtp.socketFactory.fallback", "false");
                 Session sess = Session.getDefaultInstance(props,new javax.mail.Authenticator() {
                 @Override
                 protected PasswordAuthentication getPasswordAuthentication() {
                 return new PasswordAuthentication(SENDERID, SENDERPASS);//Please Provide The Sender Address
                            }
                  });
                sess.setDebug(true);
                Message msg = new MimeMessage(sess);
                InternetAddress addressFrom = new InternetAddress(SENDERID);
                msg.setFrom(addressFrom);
                InternetAddress[] ADDRESS_TO = new InternetAddress[EMAIL_TO_ADDRESS.length];
               for (int i = 0; i < EMAIL_TO_ADDRESS.length; i++) {
               ADDRESS_TO[i] = new InternetAddress(EMAIL_TO_ADDRESS[i]);
                }
               msg.setRecipients(Message.RecipientType.TO, ADDRESS_TO);
      // Setting the Subject and Content Type
                msg.setSubject(subject);
                msg.setContent(emailMsgTxt, "text/html");
                Transport.send(msg);
       
                HttpSession session=req.getSession(false);
                session.setAttribute("id",10); 
               
             
                res.sendRedirect("http://localhost:8084/interactive/home");
      
         
             }
             else
            {  HttpSession session=req.getSession(false);
                session.setAttribute("f",3); 
              
             
              res.sendRedirect("http://localhost:8084/interactive/forget");
            }
           }
        catch(Exception e)
        {
            out.println(e.getMessage());
        }
      
    }
 }
           
}

  
  