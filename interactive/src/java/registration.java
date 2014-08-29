import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//@WebServlet(name = "a3", urlPatterns = {"/register"})
public class registration extends HttpServlet 
{ int c=1,count=1;
  @Override
  public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  
  {
      PrintWriter out = res.getWriter();
      if(count==1)
      {
          HttpSession ses=req.getSession(false);
          ses.setAttribute("r",1);
      }  
      else
      {
          HttpSession ses=req.getSession(false);
          c=(Integer)ses.getAttribute("r");
      }
      if(c==1)
      { count++;  
       out.println("<head><link href=login.css rel=stylesheet type=text/css /></head> ");
       out.println("<section class=reg><div class=titulo>Registration</div>");
       out.println("<body>");
       out.println("<form action=verifyregistration method=post>");
       out.println("       <input type=text name=t1 required title=Enter_Username required placeholder=Username data-icon=U/>");
       out.println("       <input type=text name=t2 required title=Enter_Name required placeholder=Name data-icon=U/>");
       out.println("       <input type=password name=t3 required title=Enter_Password required placeholder=Password data-icon=U/>");
       out.println("       <input type=text name=t4 required title=Enter_email-id required placeholder=Email data-icon=U/>");
       out.println("       <input type=text name=t5 required title=Enter_phone required placeholder=Phone data-icon=U/>");
       out.println("    <br>    <input type=submit class=enviar value='Register' />");
       out.println(" </form></section></body>");
      }
      else if(c==2)
      {
          HttpSession ses=req.getSession(false);
          ses.setAttribute("r",1);
           out.println("<body bgcolor=lightyellow><h3><pre>");
       out.println("<h3 align='center'>Ideal Institute of Technology,GZB</h3>");
       out.println("<p align='center'>Online Registration</p><hr color='red'>");
       out.println("<fieldset><legend>Student Registration</legend>");
       out.println("<form action=verifyregistration method=post>");
       out.println("       Username:<input type=text name=t1 />");
       out.println("       Name:    <input type=text name=t2 />");
       out.println("       Password:<input type=password name=t3 />");
       out.println("       E-mail:  <input type=text name=t4 />");
       out.println("       phone:   <input type=text name=t5 />");
       out.println("                    <input type=submit value='Register' />");
       out.println("<p style=color:red>All fields are mandatory!!!");
       out.println(" </form></fieldset></body>");
      }   
      else if(c==3)
      {
            HttpSession ses=req.getSession(false);
          ses.setAttribute("r",1);
           out.println("<head><link href=login.css rel=stylesheet type=text/css /></head> ");
       out.println("<section class=reg><div class=titulo>Registration</div>");
       out.println("<body>");
       out.println("<p style=color:white align=center>Username already exists!!!</p>");
       out.println("<form action=verifyregistration method=post>");
       out.println("       <input type=text name=t1 required title=Enter_Username required placeholder=Username data-icon=U/>");
       out.println("       <input type=text name=t2 required title=Enter_Name required placeholder=Name data-icon=U/>");
       out.println("       <input type=password name=t3 required title=Enter_Password required placeholder=Password data-icon=U/>");
       out.println("       <input type=text name=t4 required title=Enter_email-id required placeholder=Email data-icon=U/>");
       out.println("       <input type=numeric name=t5 required title=Enter_phone required placeholder=Phone data-icon=U/>");
       out.println("    <br>    <input type=submit class=enviar value='Register' />");
       out.println(" </form></section></body>");
      }   
  }        
}
