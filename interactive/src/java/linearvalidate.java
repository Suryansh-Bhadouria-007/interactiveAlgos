import java.io.IOException;
import java.io.*;
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
public class linearvalidate extends HttpServlet 
{  
   String arr,n;
        int c=0,num,pos=0,beg=0,end=-1;
         
  @Override
  public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  
  {   
      PrintWriter out = res.getWriter();
      arr=req.getParameter("d1");
      n=req.getParameter("d2");
      HttpSession ses = req.getSession(false);
      if(arr.equals("")||n.equals(""))
      {
          
              ses.setAttribute("id",6);
              res.sendRedirect("http://localhost:8084/interactive/linearsearch");
      }
      else
      {  
        if(arr.charAt(arr.length()-1)==',')
        {    ses.setAttribute("id",6);
              res.sendRedirect("http://localhost:8084/interactive/linearsearch");
        }
        else
        {
      arr+=',';
        }
      int s1[]=new int[arr.length()];
     // System.out.println(arr);
      num=Integer.parseInt(n);
      for(int i=0;i<arr.length();i++)
      {
          if(arr.charAt(i)==',')
          {   beg=end+1;
              end=i;
              s1[c]=Integer.parseInt(arr.substring(beg,end));
              c++;
          }    
      }
      for(int i=0;i<c;i++)
          System.out.println(s1[i]);
      for(int i=0;i<c;i++)
      {
           if(num==s1[i])
              pos=i+1;
      }   
         out.println("<head><link href=tab.css rel=stylesheet type=text/css /></head>");  
          out.println("<img src='" + req.getContextPath() + "/images/topbanner.jpg' alt=interactive />");
           out.println("<nav>");
            out.println("<ul>");
                out.println("<li><a href=>Searching</a>");
                out.println("<ul>");
                                out.println("<li><a href=linearsearch>Linear</a></li>");
                                out.println("<li><a href=binarysearch>Binary</a></li>");
                out.println("</ul>");
                out.println("<li><a href=>Sorting</a>");
                    out.println("<ul>");
                                out.println("<li><a href=selection>Selection</a></li>");
                                out.println("<li><a href=bubble>Bubble</a></li>");
                                out.println("<li><a href=insertion>Insertion</a></li>");
                                out.println("<li><a href=merge>Merge</a></li>");
                                out.println("<li><a href=heap>Heap</a></li>");
                                out.println("<li><a href=quick>Quick</a></li>");
                    out.println("</ul>");
                out.println("</li>");
                out.println("<li><a href=>Operating System</a>");
                    out.println("<ul>");
                                out.println("<li><a href=fcfs>FCFS</a></li>");
                                out.println("<li><a href=sjf>Shortest Job First</a></li>");
                                out.println("<li><a href=roundrobin>Round Robin</a></li>");
                                out.println("<li><a href=fifo>FIFO</a></li>");
                                out.println("<li><a href=lru>LRU</a></li>");
                                out.println("<li><a href=optimal>Optimal</a></li>");
                    out.println("</ul>");
                out.println("</li>");
                out.println("<li><a href=>Design and Analysis of Algorithms</a>");
                        out.println("<ul>");
                                out.println("<li><a href=dijikstra>Dijikstra</a></li>");
                                out.println("<li><a href=bellmanford>Bellman-Ford</a></li>");
                                out.println("<li><a href=prims>Prims</a></li>");
                                out.println("<li><a href=kruskal>Kruskal</a></li>");
                                out.println("<li><a href=maxmin>Max-Min</a></li>");
                        out.println("</ul>");
                out.println("</li>");
                out.println("<li><a href=>Basic</a>");
                        out.println("<ul>");
                                out.println("<li><a href=armstrong>Armstrong</a></li>");
                                out.println("<li><a href=pallindrome>Palindrome</a></li>");
                                out.println("<li><a href=factorial>Factorial</a></li>");
                                out.println("<li><a href=fibonacci>Fibonacci</a></li>");
                                out.println("<li><a href=perfect>Perfect No.</a></li>");
                        out.println("</ul>");
                out.println("</li>");
                out.println("<li><a href=>Data Structure</a>");
                        out.println("<ul>");
                                out.println("<li><a href=stack>Stack</a></li>");
                                out.println("<li><a href=queue>Queue</a></li>");
                        out.println("</ul>");
                out.println("</li>");
        out.println("</ul>");
out.println("</nav>");
      out.println("<br><br><br><br><br><br><br><br>");
      if(pos==0)out.println("Number not found");
      else out.println("Number found at "+pos);
      beg=0;end=-1;c=0;pos=0;
      
      }
   }
}
      
          
    