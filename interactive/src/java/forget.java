import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//@WebServlet(name = "a3", urlPatterns = {"/register"})
public class forget extends HttpServlet 
{
  int c=1,count=1;
  @Override
  public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  
  {
       PrintWriter out = res.getWriter();
       if(count==1)
       {   
       HttpSession ses=req.getSession(false);
       ses.setAttribute("f",1);
       }
       else
       {
           HttpSession ses=req.getSession(false);
           c=(Integer)ses.getAttribute("f");
       }   
       if(c==1)
       {   count++; 
      
       out.println("<head><link href=login.css rel=stylesheet type=text/css /></head> ");
       out.println("<section class=login><div class=titulo>Forget Password</div>");
       
       out.println("<body>");
       //out.println("<h3>Interactive Learning</h3>");
      // out.println("<p align='center'>Online Registration</p><hr color='red'>");
       //out.println("<fieldset style='width: 400px; height: 200px;'><legend>Student Login</legend>");
       out.println("<form action=verifyforget method=post>");
       out.println("      <input type=text name=t1 required title=Username required placeholder=Username data-icon=U/>");
       out.println("      <input type=text name=t2 required title=Email required placeholder=Registered_Email data-icon=x/>");
      // out.println("<div class=olvido><div class=col><a href=registration title=Register Carasteres>Register</a></div>");
       //out.println("<div class=col><a href=forget title=Recover>Forgot Password?</a></div></div>");
       out.println(" <input type=submit class=enviar value='Recover' />");
       out.println();
      // out.println("       <a href=registration>New Registration</a>  <a href=forget>Forget Password</a>");
       out.println(" </form></section></body>");
       }
       else if(c==2)
       {
        out.println("<body bgcolor=lightyellow><h3><pre>");
       out.println("<h3 align='center'>Interactive Learning</h3>");
       out.println("<p align='center'>Online Registration</p><hr color='red'>");
       out.println("<fieldset style='width: 400px; height: 200px;'><legend>Student Login</legend>");
       out.println("<form action=verifyforget method=post>");
       out.println("    Enter Username:           <input type=text name=t1 />");
       out.println("    Enter Registered email id:<input type=text name=t2 />");
       out.println("                              <input type=submit value='Recover' />");
       out.println("<p style=color:red>field cannot be left blank!!!</p>");
       out.println(" </form></fieldset></body>");   
       }   
       else if(c==3)
       {
       out.println("<head><link href=login.css rel=stylesheet type=text/css /></head> ");
       out.println("<section class=login><div class=titulo>Forget Password</div>");
       
       out.println("<body>");
       out.println("<p style=color:white align=center>Username or Email is Invalid!!!</p>");
       out.println("<form action=verifyforget method=post>");
       out.println("      <input type=text name=t1 required title=Username required placeholder=Username data-icon=U/>");
       out.println("      <input type=password name=t2 required title=Email required placeholder=Registered_Email data-icon=x/>");
      // out.println("<div class=olvido><div class=col><a href=registration title=Register Carasteres>Register</a></div>");
       //out.println("<div class=col><a href=forget title=Recover>Forgot Password?</a></div></div>");
       out.println(" <input type=submit class=enviar value='Recover' />");
       out.println();
      // out.println("       <a href=registration>New Registration</a>  <a href=forget>Forget Password</a>");
       out.println(" </form></section></body>");
       }  
           
  }
}

  
  