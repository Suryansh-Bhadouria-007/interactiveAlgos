import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//@WebServlet(name = "a3", urlPatterns = {"/register"})
public class daa extends HttpServlet 
{
   int c=0;
  @Override
  public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  
  {
           
        PrintWriter out = res.getWriter();
        HttpSession ses = req.getSession(false);
        c=(Integer)ses.getAttribute("id");
         //ses.setAttribute("id",1);
        if(c==5)
        {  
       out.println("<body bgcolor=lightyellow><h3><pre>");
       out.println("<h3 align='center'>Interactive Learning</h3>");
       out.println("<p align='center'>Online Registration</p><hr color='red'>");
       out.println("<fieldset style='width: 200px; heights: 200px;'><legend>Algorithms</legend>");
       out.println("<form>");
       //out.println("       Roll No.:    <input type=text name=t1 />");
       //out.println("       Password:    <input type=password name=t2 />");
       //out.println("                    <input type=submit value='Sign In' />");
       //out.println("<a href=register>New Registration</a>  <a href=forget>Forget Password</a>");
       out.println("<a href=dijikstra>Dijikstra</a>");
       out.println("<a href=bellmanford>Bellman-Ford</a>");
       out.println("<a href=prims>Prim's</a>");
       out.println("<a href=kruskal>Kruskal</a>");
       out.println("<a href=knapsack>0-1 Knapsack</a>");
       out.println("<a href=maxmin>Max-Min using Divide and Conquer</a>");
      // out.println("<a href=daa></a>");
       out.println(" </form></fieldset></body>");
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