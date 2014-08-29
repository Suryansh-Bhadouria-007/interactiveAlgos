import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class insertion extends HttpServlet 
{ int c=0;
  @Override
  public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  
  { 
      PrintWriter out = res.getWriter();
      HttpSession ses=req.getSession(false);
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
       out.println("<table><tr>");
       out.println("<td>");
       out.println("<section class=viss><div class=titulo>Algorithm</div>");
      out.println("INSERTION SORT<br>");
      out.println(" 1- Read n numbers in array a<br>");
      out.println(" 2- i=2,j=0<br>");
      out.println(" 3- check if i<n<br>");
      out.println(" 4-   key=a[a]<br>");
      out.println(" 5-   i=j-1<br>");
      out.println(" 6-   Check if i=0 and a[i]>key<br>");
      out.println(" 7-       a[i+1]=a[i]<br> ");
      out.println(" 8-       i=i-1<br>");
      out.println(" 9-   else<br>");
      out.println("10-       a[i+1]=key<br>");
      out.println("11-       j=j+1<br>");
      out.println("12- else<br>");
      out.println("13-   end<br></section></td><td>");
      out.println("<section class=visual><div class=titulo>Validate and Visualise</div>");
      out.println("<form action=insertionvalidate method=post>");
      out.println("      <input type=text name=d1 required title=Enter required placeholder=Numbers_seperated_by_, data-icon=U/>");
     // out.println("      <input type=text name=d2 required title=Enter required placeholder=Number_to_be_searched data-icon=x/>");
     // out.println("<div class=olvido><div class=col><a href=registration title=Register Carasteres>Register</a></div>");
      //out.println("<div class=col><a href=forget title=Recover>Forgot Password?</a></div></div>");
      out.println(" <input type=submit class=enviar value='Sort' />");
      out.println("<div class=olvido><div class=col><a href=insertionvisual align=center title=Visual Carasteres>Visualise</a></div>");
      out.println();
      // out.println("       <a href=registration>New Registration</a>  <a href=forget>Forget Password</a>");
       out.println(" </form></section></td></tr></table></body>");
      
      }
      else if(c==6)
      {ses.setAttribute("id",5);
          out.println("<body bgcolor=lightyellow><h3><pre>");
      out.println("<h3 align='center'>Interactive Learning</h3>");
      out.println("<p align='center'>Insertion Sort</p><hr color='red'>");
      
      out.println("<fieldset style='width: 400px; height: 200px;'><legend>Algorithm</legend>");
      out.println(" 1- Read n numbers in array a");
      out.println(" 2- i=2,j=0");
      out.println(" 3- check if i<n");
      out.println(" 4-   key=a[a]");
      out.println(" 5-   i=j-1");
      out.println(" 6-   Check if i=0 and a[i]>key");
      out.println(" 7-       a[i+1]=a[i] ");
      out.println(" 8-       i=i-1");
      out.println(" 9-   else");
      out.println("10-       a[i+1]=key");
      out.println("11-       j=j+1");
      out.println("12- else");
      out.println("13-   end");
      out.println(" </fieldset>");
      out.println("<fieldset style='width: 200px; height: 20px;'><legend>Time Complexity");
     
      out.println("O(n)");
      out.println("</fieldset>");
      out.println();
      out.println();
      out.println("<fieldset style='width: 200px; height: 20px;'><legend>Space Complexity");
       
     
      out.println("O(1)");
      out.println("</fieldset>");
      out.println("<a href=insertionvisual>Visualise</a>");
      out.println("<fieldset style='width: 400px; height: 200px;'><legend>Validate</legend>");
      out.println("<form action=insertionvalidate method=post>");
      out.println("Enter Numbers of Array seperated by ,:<input type=text name=d1 /> ");
    out.println("<p style=color:red>Field cannot be left blank!!!</p>");
      out.println("<input type=submit  value='Enter'/>");
      out.println("</fieldset></form></body>");
      }    
  }
}