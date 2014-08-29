import java.io.IOException;
import java.io.PrintWriter;
import java.security.Security;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.util.Properties;
import java.util.Random;
import javax.mail.*;
import javax.mail.internet.*;
import javax.servlet.http.HttpSession;


//@WebServlet(name = "a3", urlPatterns = {"/register"})
public class verifyregistration extends HttpServlet 
{
  @Override
  public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  
  {
      PrintWriter out = res.getWriter();
      HttpSession ses=req.getSession(false);
      String username=req.getParameter("t1");
      String name=req.getParameter("t2");
      String password=req.getParameter("t3");
      String email=req.getParameter("t4");
      String phone=req.getParameter("t5");
      int check=0,securecode=0;
      
      
      if(name.equals("")||username.equals("")||password.equals("")||email.equals("")||phone.equals(""))
     {
              // HttpSession session=req.getSession(false);
                ses.setAttribute("r",2); 
                out.println("<body bgcolor=lightyellow><h3><pre>");
              out.println("<h3 align='center'>Ideal Institute of Technology,GZB</h3>");
              out.println("<p align='center'>Online Registration</p><hr color='red'>");
             
              res.sendRedirect("http://localhost:8084/interactive/registration");
    }
      else
    {
       /*  try
        {    
           Connection con=MyConnection.getConnection();
           String checkusername="Select * from member where username=?";
           PreparedStatement pss=con.prepareStatement(checkusername);
           pss.setString(1,username);
           ResultSet rs=pss.executeQuery();
           while(rs.next())
                check++;
        } 
           catch(SQLException e)
            {
            out.println(e);
            }
         
           if(check==0)
           {
            out.println("<body bgcolor=lightyellow><h3><pre>");
            out.println("<h3 align='center'>DHAH Technocrats</h3>");
            out.println("<p align='center'>Iteractive Learning</p><hr color='red'>");
            out.println("username already exists...select a unique username.");
            out.println("<form>");
            out.println("<a href=registration.html>Back</a>");
            out.println("</form>");
            out.println("</body>");
           }
           else
           {*/
               
            
             // String scode=String.valueOf(securecode);
             
           /* {
            //String to="divyakant846@gmail.com";
             String subject="Request mail for verification";
             String emailMsgTxt=scode+"<br>Use this security code for verification ";
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
             Session ses = Session.getDefaultInstance(props,new javax.mail.Authenticator() {
             @Override
             protected PasswordAuthentication getPasswordAuthentication() {
             return new PasswordAuthentication(SENDERID, SENDERPASS);//Please Provide The Sender Address
              }
       });
            ses.setDebug(true);
            Message msg = new MimeMessage(ses);
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
            Transport.send(msg);*/
            try
            {  
       
            Connection con=MyConnection.getConnection();
            String str="Select * from member where username=?";
            PreparedStatement pss=con.prepareStatement(str);
            pss.setString(1,username);
            ResultSet rs=pss.executeQuery();
            if(rs.next())
            {
                HttpSession session=req.getSession(false);
                session.setAttribute("r",3); 
                out.println("<body bgcolor=lightyellow><h3><pre>");
                out.println("<h3 align='center'>Ideal Institute of Technology,GZB</h3>");
                out.println("<p align='center'>Online Registration</p><hr color='red'>");
             
                res.sendRedirect("http://localhost:8084/interactive/registration");
            }   
            else
            {    
            String query="Insert into member values(?,?,?,?,?)";
            PreparedStatement ps=con.prepareStatement(query);
            ps.setString(1,username);
            ps.setString(2,name);
            ps.setString(3,password);
            ps.setString(4,email);
            ps.setString(5,phone);
           // ps.setString(6,scode);
            int psss=ps.executeUpdate();
            ses.setAttribute("id",11);
            res.sendRedirect("http://localhost:8084/interactive/home");
            out.println("</form>");
            out.println("</body>");
            }
            }
             catch(Exception e)
            {
            out.println(e.getMessage());
            }
           }        
            
         }
    }
  
