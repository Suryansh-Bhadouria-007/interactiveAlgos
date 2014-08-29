import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class Heap extends HttpServlet 
{ int c=0;
  @Override
  public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  
  {   HttpSession ses=req.getSession(false);
      PrintWriter out = res.getWriter();
      c=(Integer)ses.getAttribute("id");
      if(c==5)
      {    
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
                                out.println("<li><a href=Merge>Merge</a></li>");
                                out.println("<li><a href=Heap>Heap</a></li>");
                                out.println("<li><a href=Quick>Quick</a></li>");
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
     out.println("<br><br>");   
          out.println("<body>");
       out.println("<table align=center><tr>");
       out.println("<td>");   
     out.println("<section class=viss><div class=titulo>Algorithms</div>");
      out.println(" # heapify<br>");
      out.println(" 1-for i = n/2:1, sink(a,i,n)<br>");
      out.println("     → invariant: a[1,n] in heap order<br>");

      out.println(" # sortdown<br>");
      out.println(" 1-for i = 1:n,<br>");
      out.println(" 2-    swap a[1,n-i+1]<br>");
      out.println(" 3-    sink(a,1,n-i)<br>");
      out.println("       → invariant: a[n-i+1,n] in final position<br>");
      out.println(" 4-end<br>");

      out.println(" # sink from i in a[1..n]<br>");
      out.println(" 1-function sink(a,i,n):<br>");
      out.println(" 2-    # {lc,rc,mc} = {left,right,max} child index<br>");
      out.println(" 3-    lc = 2*i<br>");
      out.println(" 4-    if lc > n, return # no children<br>");
      out.println(" 5-    rc = lc + 1<br>");
      out.println(" 6-    mc = (rc > n) ? lc : (a[lc] > a[rc]) ? lc : rc<br>");
      out.println(" 7-    check if a[i] >= a[mc], return # heap ordered<br>");
      out.println(" 8-    swap a[i,mc]<br>");
      out.println(" 9-    sink(a,mc,n)<br></section></td><td>");
        out.println("<section class=visual><div class=titulo>Validate and Visualise</div>");
      out.println("<form action=heapvalidate method=post>");
      out.println("      <input type=text name=d1 required title=Enter required placeholder=Numbers_seperated_by_, data-icon=U/>");
     // out.println("      <input type=text name=d2 required title=Enter required placeholder=Number_to_be_searched data-icon=x/>");
     // out.println("<div class=olvido><div class=col><a href=registration title=Register Carasteres>Register</a></div>");
      //out.println("<div class=col><a href=forget title=Recover>Forgot Password?</a></div></div>");
      out.println(" <input type=submit class=enviar value='Sort' />");
      out.println("<div class=olvido><div class=col><a href=heapvisual align=center title=Visual Carasteres>Visualise</a></div>");
      out.println();
      // out.println("       <a href=registration>New Registration</a>  <a href=forget>Forget Password</a>");
       out.println(" </form></section></td></tr></table></body>");
     
    
   
      }
      else if(c==6)
      {
      ses.setAttribute("id",5);
      out.println("<body bgcolor=lightyellow><h3><pre>");
      out.println("<h3 align='center'>Interactive Learning</h3>");
      out.println("<p align='center'>Heap Sort</p><hr color='red'>");
      
      out.println("<fieldset style='width: 400px; height: 400px;'><legend>Algorithm</legend>");
      out.println(" # heapify");
      out.println(" 1-for i = n/2:1, sink(a,i,n)");
      out.println("     → invariant: a[1,n] in heap order");

      out.println(" # sortdown");
      out.println(" 1-for i = 1:n,");
      out.println(" 2-    swap a[1,n-i+1]");
      out.println(" 3-    sink(a,1,n-i)");
      out.println("       → invariant: a[n-i+1,n] in final position");
      out.println(" 4-end");

      out.println(" # sink from i in a[1..n]");
      out.println(" 1-function sink(a,i,n):");
      out.println(" 2-    # {lc,rc,mc} = {left,right,max} child index");
      out.println(" 3-    lc = 2*i");
      out.println(" 4-    if lc > n, return # no children");
      out.println(" 5-    rc = lc + 1");
      out.println(" 6-    mc = (rc > n) ? lc : (a[lc] > a[rc]) ? lc : rc");
      out.println(" 7-    check if a[i] >= a[mc], return # heap ordered");
      out.println(" 8-    swap a[i,mc]");
      out.println(" 9-    sink(a,mc,n)");

      out.println(" </fieldset>");
      out.println("<fieldset style='width: 200px; height: 20px;'><legend>Time Complexity");
     
      out.println("O(n log n)");
      out.println("</fieldset>");
      out.println();
      out.println();
      out.println("<fieldset style='width: 200px; height: 20px;'><legend>Space Complexity");
       
     
      out.println("O(1)");
      out.println("</fieldset>");
      out.println("<a href=heapvisual>Visualise</a>");
      out.println("<fieldset style='width: 400px; height: 200px;'><legend>Validate</legend>");
      out.println("<form action=heapvalidate method=post>");
      out.println("Enter Elements in Array seperated by ,:<input type=text name=d1 /> ");
      out.println("<p style=color:red>Field cannot be left blank!!!</p>");
      out.println("<input type=submit  value='Enter'/>");
      out.println("</fieldset></form></body>");
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