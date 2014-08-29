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

//@WebServlet(name = "a5", urlPatterns = {"/verifys"})
public class verifys extends HttpServlet 
    {
        String user="",pass="";//,st="";
        int c=0;
        @Override
        public void service(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException 
       {
        
        PrintWriter out = res.getWriter();
        HttpSession ses = req.getSession(false);
        c=(Integer)ses.getAttribute("id");
        if(c==1)
        {  
                
        //int t=(Integer)ses.getAttribute("id");
        //if(t==1)
        //{              
           user=req.getParameter("t1");
           pass=req.getParameter("t2");                  
            //ses.setAttribute("rolln",roll);
            //ses.setAttribute("passw", pass);
        //}    
        //else
        //{
          //  roll=(String)ses.getAttribute("rolln");
            //pass=(String)ses.getAttribute("passw");
        //}  
        if(user.equals("")||pass.equals(""))
        {
              out.println("<body bgcolor=lightyellow><h3><pre>");
              out.println("<h3 align='center'>Ideal Institute of Technology,GZB</h3>");
              out.println("<p align='center'>Online Registration</p><hr color='red'>");
              ses.setAttribute("id",2);
              res.sendRedirect("http://localhost:8084/interactive/home");
             /* out.println("All Fields are mandatory....");
              out.println("<form>");
              out.println("<a href=welcome>Go Back To Log In</a>");
              out.println("</form>");
              out.println("</body>");*/
              
          
        }
        else
        {
            
           try
           {   
            Connection con=MyConnection.getConnection();
            String query="Select * from member where username=? and password=?";
            PreparedStatement ps=con.prepareStatement(query);
            ps.setString(1,user);
            ps.setString(2,pass);
            ResultSet rs=ps.executeQuery();
            
            if(rs.next())
            {
            /*  String str="Select status from student where roll=?";
              PreparedStatement p=con.prepareStatement(str);
              p.setString(1,roll);
              ResultSet r=p.executeQuery();
              while(r.next())
              {
                  st=r.getString(1);
              }  
           
              if(st.equals("student"))
              {    
              out.println("<body bgcolor=lightyellow><h3><pre>");
              out.println("<h3 align='center'>Ideal Institute of Technology,GZB</h3>");
              out.println("<p align='center'>Online Registration</p><hr color='red'>");
              out.println("Login Succesfull!!!");
              out.println("<form>");
              out.println("");
              out.println("");
              out.println("<a href=takee>Take Exam</a>");
              out.println("<a href=result>Check Result</a>");
              out.println("</form>");
              out.println("</body>");
              }
              else
              {
               out.println("<body bgcolor=lightyellow><h3><pre>");
               out.println("<h3 align='center'>Ideal Institute of Technology,GZB</h3>");
               out.println("<p align='center'>Online Registration</p><hr color='red'>");
               out.println("Login Succesfull!!!");
               out.println("<form>");
               out.println("");
               out.println("");
               out.println("<a href=prepare>prepare Exam</a>");
               out.println("<a href=evaluatee>Evaluate. </a>");
               out.println("</form>");
               out.println("</body>");   
              }*/ 
              ses.setAttribute("id",5);
              out.println("<body bgcolor=lightyellow><h3><pre>");
              out.println("<h3 align='center'>Ideal Institute of Technology,GZB</h3>");
              out.println("<p align='center'>Online Registration</p><hr color='red'>");
              //ses.setAttribute("id",3);
              res.sendRedirect("http://localhost:8084/interactive/algorithms");
            }         
            else
            {
              out.println("<body bgcolor=lightyellow><h3><pre>");
              out.println("<h3 align='center'>Ideal Institute of Technology,GZB</h3>");
              out.println("<p align='center'>Online Registration</p><hr color='red'>");
              ses.setAttribute("id",3);
              res.sendRedirect("http://localhost:8084/interactive/home");
             /* out.println("Username or Password is Invalid!!!");
              out.println("<form>");
              out.println("");
              out.println("");
              out.println("<a href=home.html>Go Back To Login Again</a>");
              out.println("</form>");
              out.println("</body>");*/  
            }  
        } 
             catch(SQLException e)
            {
                out.println(e);
            }
        }
        }
        else
        {
            
              out.println("<body bgcolor=lightyellow><h3><pre>");
              out.println("<h3 align='center'>Ideal Institute of Technology,GZB</h3>");
              out.println("<p align='center'>Online Registration</p><hr color='red'>");
              ses.setAttribute("id",4);
              res.sendRedirect("http://localhost:8084/interactive/home");
        }
    }
}