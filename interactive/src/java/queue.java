import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class queue extends HttpServlet 
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
     out.println("</nav>");
     out.println("<br><br>");   
      out.println("<body>");
       out.println("<table><tr>");
       out.println("<td>");
       out.println("<section class=viss><div class=titulo>Algorithm</div>");
      out.println("INSERT(QUEUE,N,FRONT,REAR,ITEM)<br>");
      out.println("1- IF FRONT=1 AND REAR=N OR FRONT=REAR+1<br>");
      out.println("2-    WRITE OVERFLOW<br>");
      out.println("3- IF FRONT=NULL  <br>");
      out.println("4-     FRONT=1 AND REAR=1<br>");
      out.println("5- ELSE IF REAR=N  <br>");
      out.println("6- ELSE REAR=REAR+1<br>");
      out.println("7-SET QUEUE[REAR]=ITEM<br>");
      out.println("8-END<br>");
      out.println("DELETE(QUEUE,N,FRONT,REAR,ITEM)<br>");
      out.println("1-IF FRONT=NULL THEN WRITE UNDERFLOW<br>");
      out.println("2-SET ITEM=QUEUE[FRONT]<br>");
      out.println("3-IF FRONT=REAR THEN<br>");
      out.println("4-   FRONT=NULL AND REAR=NULL<br>");
      out.println("5-ELSE IF FRONT=N THEN<br>");
      out.println("6-   SET FRONT=1<br>");
      out.println("7-ELSE<br>");
      out.println("8-    SET FRONT=FRONT+1<br>");
      out.println("9-END<br></section></td><td>");
         out.println("<section class=visual><div class=titulo>Validate and Visualise</div>");
      out.println("<form action=queuevalidate method=post>");
      out.println("      <input type=text name=d2 required title=Enter required placeholder=Number data-icon=U/>");
     // out.println("      <input type=text name=d2 required title=Enter required placeholder=Number_to_be_searched data-icon=x/>");
     // out.println("<div class=olvido><div class=col><a href=registration title=Register Carasteres>Register</a></div>");
      //out.println("<div class=col><a href=forget title=Recover>Forgot Password?</a></div></div>");
      out.println(" <input type=submit name=b1 class=enviar value='Insert' />");
      out.println("</form><form action=queuevalidate method=post>");
      out.println(" <input type=submit name=b1 class=enviar value='Delete' />");
      out.println("<div class=olvido><div class=col><a href=stackvisual align=center title=Visual Carasteres>Visualise</a></div>");
      
       
      
       out.println(" </form></section></td></tr></table></body>");
      }
      else if(c==6)
      {
        ses.setAttribute("id",5);  
      out.println("<body bgcolor=lightyellow><h3><pre>");
      out.println("<h3 align='center'>Interactive Learning</h3>");
      out.println("<p align='center'>Queue Implementation Algorithm</p><hr color='red'>");
      
      out.println("<fieldset style='width: 400px; height: 400px;'><legend>Algorithm</legend>");
      out.println("INSERT(QUEUE,N,FRONT,REAR,ITEM)");
      out.println("1- IF FRONT=1 AND REAR=N OR FRONT=REAR+1");
      out.println("2-    WRITE OVERFLOW");
      out.println("3- IF FRONT=NULL  ");
      out.println("4-     FRONT=1 AND REAR=1");
      out.println("5- ELSE IF REAR=N  ");
      out.println("6- ELSE REAR=REAR+1");
      out.println("7-SET QUEUE[REAR]=ITEM");
      out.println("8-END");
      out.println("DELETE(QUEUE,N,FRONT,REAR,ITEM)");
      out.println("1-IF FRONT=NULL THEN WRITE UNDERFLOW");
      out.println("2-SET ITEM=QUEUE[FRONT]");
      out.println("3-IF FRONT=REAR THEN");
      out.println("4-   FRONT=NULL AND REAR=NULL");
      out.println("5-ELSE IF FRONT=N THEN");
      out.println("6-   SET FRONT=1");
      out.println("7-ELSE");
      out.println("8-    SET FRONT=FRONT+1");
      out.println("9-END");
      out.println(" </fieldset>");
      out.println("<fieldset style='width: 200px; height: 20px;'><legend>Time Complexity");
     
      out.println("O(n)");
      out.println("</fieldset>");
      out.println();
      out.println();
      out.println("<fieldset style='width: 200px; height: 20px;'><legend>Space Complexity");
       
     
      out.println("O(n)");
      out.println("</fieldset>");
      out.println("<a href=queuevisual>Visualise</a>");
      out.println("<fieldset style='width: 400px; height: 200px;'><legend>Validate</legend>");
      out.println("<form action=queuevalidate method=post>");
      //out.println("Enter Numbers of Array seperated by ,:<input type=text name=d1 /> ");
      out.println("Enter Number to be inserted:<input type=text name=d2 /> <input type=submit name=b1 value='insert'/>");
      out.println("<p style=color:red>Field cannot be left empty!!!</p>");
      out.println("Click here for deletion:                             <input type=submit name=b1 value='delete'>");
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