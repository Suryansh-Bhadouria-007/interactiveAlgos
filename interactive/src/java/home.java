import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//@WebServlet(name = "a3", urlPatterns = {"/register"})
public class home extends HttpServlet 
{
  int c=1,count=1;
  @Override
  public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  
  {
      PrintWriter out = res.getWriter();
       if(count==1)
       {    
       
       HttpSession ses = req.getSession(true);
       ses.setAttribute("id",count);
       }
       else
       { 
           HttpSession ses=req.getSession(false);
           c=(Integer)ses.getAttribute("id");
           
       }
       if(c==1)
       {
       count++;  
    //   out.println("<head><link rel='stylesheet' type='text/css' href='" + req.getContextPath() +"/css.css' />");
      // out.println("</head>");
       out.println("<head><link href=login.css rel=stylesheet type=text/css /></head> ");
       out.println("<section class=login><div class=titulo>Login</div>");
       
       out.println("<body>");
       //out.println("<h3>Interactive Learning</h3>");
      // out.println("<p align='center'>Online Registration</p><hr color='red'>");
       //out.println("<fieldset style='width: 400px; height: 200px;'><legend>Student Login</legend>");
       out.println("<form action=verifys method=post>");
       out.println("      <input type=text name=t1 required title=Username required placeholder=Username data-icon=U/>");
       out.println("      <input type=password name=t2 required title=Password required placeholder=Password data-icon=x/>");
       out.println("<div class=olvido><div class=col><a href=registration title=Register Carasteres>Register</a></div>");
       out.println("<div class=col><a href=forget title=Recover>Forgot Password?</a></div></div>");
       out.println(" <input type=submit class=enviar value='Log In' />");
       out.println();
      // out.println("       <a href=registration>New Registration</a>  <a href=forget>Forget Password</a>");
       out.println(" </form></section></body>");
       }
       else if(c==2)
       {HttpSession ses=req.getSession(false);
         ses.setAttribute("id",1);
             out.println("<head><link href=login.css rel=stylesheet type=text/css /></head> ");
       out.println("<section class=login><div class=titulo>Login</div>");
       
       out.println("<body>");
       //out.println("<h3>Interactive Learning</h3>");
      // out.println("<p align='center'>Online Registration</p><hr color='red'>");
       //out.println("<fieldset style='width: 400px; height: 200px;'><legend>Student Login</legend>");
       out.println("<form action=verifys method=post>");
       
       out.println(" <p style=color:red>All Fields are Mandatory!!!</p>    <input type=text name=t1 required title=username required placeholder=username data-icon=U/>");
       out.println("      <input type=password name=t2 required title=password required placeholder=password data-icon=x/>");
       out.println("<div class=olvido><div class=col><a href=registration title=Ver Carasteres>Register</a></div>");
       out.println("<div class=col><a href=forget title=Recuperar>Forgot Password?</a></div></div>");
       out.println(" <input type=submit class=enviar value='Log In' />");
       out.println();
      // out.println("       <a href=registration>New Registration</a>  <a href=forget>Forget Password</a>");
       out.println(" </form></section></body>");
       }
       else if(c==3)
       {HttpSession ses=req.getSession(false);
          ses.setAttribute("id",1);
       out.println("<head><link href=login.css rel=stylesheet type=text/css /></head> ");
       
       out.println("<section class=login><div class=titulo>Login</div>");
       out.println("<body>");
       out.println("<p style=color:white align=center>Username or Password is Invalid!!!</p>");
       out.println("<form action=verifys method=post>");
       out.println("      <input type=text name=t1 required title=username required placeholder=username data-icon=U/>");
       out.println("      <input type=password name=t2 required title=password required placeholder=password data-icon=x/>");
       out.println("<div class=olvido><div class=col><a href=registration title=Register Carasteres>Register</a></div>");
       out.println("<div class=col><a href=forget title=Recover>Forgot Password?</a></div></div>");
       out.println(" <input type=submit class=enviar value='Log In' />");
       out.println();
      // out.println("       <a href=registration>New Registration</a>  <a href=forget>Forget Password</a>");
       out.println(" </form></section></body>");
         
       }
          else if(c==11)
       {HttpSession ses=req.getSession(false);
          ses.setAttribute("id",1);
       out.println("<head><link href=login.css rel=stylesheet type=text/css /></head> ");
       
       out.println("<section class=login><div class=titulo>Login</div>");
       out.println("<body>");
       out.println("<p style=color:white align=center>Registration Successful</p>");
       out.println("<form action=verifys method=post>");
       out.println("      <input type=text name=t1 required title=username required placeholder=username data-icon=U/>");
       out.println("      <input type=password name=t2 required title=password required placeholder=password data-icon=x/>");
       out.println("<div class=olvido><div class=col><a href=registration title=Register Carasteres>Register</a></div>");
       out.println("<div class=col><a href=forget title=Recover>Forgot Password?</a></div></div>");
       out.println(" <input type=submit class=enviar value='Log In' />");
       out.println();
      // out.println("       <a href=registration>New Registration</a>  <a href=forget>Forget Password</a>");
       out.println(" </form></section></body>");
         
       }
       else if(c==10)
       {
         HttpSession ses=req.getSession(false);
           ses.setAttribute("id",1); 
           out.println("<head><link href=login.css rel=stylesheet type=text/css /></head> ");
       
       out.println("<section class=login><div class=titulo>Login</div>");
       out.println("<body>");
       out.println("<p style=color:white align=center>password has been sent to your email</p>");
       //out.println("password has been sent to your email");
       out.println("<form action=verifys method=post>");
       out.println("      <input type=text name=t1 required title=username required placeholder=username data-icon=U/>");
       out.println("      <input type=password name=t2 required title=password required placeholder=password data-icon=x/>");
       out.println("<div class=olvido><div class=col><a href=registration title=Register Carasteres>Register</a></div>");
       out.println("<div class=col><a href=forget title=Recover>Forgot Password?</a></div></div>");
       out.println(" <input type=submit class=enviar value='Log In' />");
       out.println();
      // out.println("       <a href=registration>New Registration</a>  <a href=forget>Forget Password</a>");
       out.println(" </form></section></body>");
       }
       else
       {  HttpSession ses=req.getSession(false);
          ses.setAttribute("id",1);
          out.println("<head><link href=login.css rel=stylesheet type=text/css /></head> ");
       
       out.println("<section class=login><div class=titulo>Login</div>");
       out.println("<body>");
       out.println("<p style=color:white align=center>Login First!!!</p>");
       out.println("<form action=verifys method=post>");
       out.println("      <input type=text name=t1 required title=username required placeholder=username data-icon=U/>");
       out.println("      <input type=password name=t2 required title=password required placeholder=password data-icon=x/>");
       out.println("<div class=olvido><div class=col><a href=registration title=Register Carasteres>Register</a></div>");
       out.println("<div class=col><a href=forget title=Recover>Forgot Password?</a></div></div>");
       out.println(" <input type=submit class=enviar value='Log In' />");
       out.println();
      // out.println("       <a href=registration>New Registration</a>  <a href=forget>Forget Password</a>");
       out.println(" </form></section></body>");
       }
       
  }
} 