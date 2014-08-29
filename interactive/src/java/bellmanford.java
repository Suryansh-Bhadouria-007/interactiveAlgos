import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class bellmanford extends HttpServlet 
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
       out.println("<br><br><br><br><br><br>");
       out.println("<section class=viss><div class=titulo>Algorithm</div>");
      out.println("BELLMAN_FORD(G,W,S)<br>");
      out.println("1- Initialise SINGLE_SOURCE(G,S)<br>");
      out.println("2- for i=1 to |V[G]|-1<br>");
      out.println("3-     do for each edge (u,v)<-E[G]<br>");
      out.println("4-          do RELAX(u,v,w) <br>");
      out.println("5- for each edge (u,v)<-E[G]<br>");
      out.println("6-     if d[V]>d[U]+w(u,v)<br>");
      out.println("7-        return false<br>");
      out.println("8-     return true<br>");
      out.println();
      out.println("SINGLE_SOURCE(G,S)<br>");
      out.println("1- for each vertex v<-V[G]<br>");
      out.println("2-    do d[V]<-infinity<br>");
      out.println("3-       parent[V]<-NIL <br>");
      out.println("4-       d[S]<-0<br>");
      out.println();
      out.println("RELAX(u,v,w)<br>");
      out.println("1- if d[V]>d[u]+w(u,v)<br>");
      out.println("2-     then d[v]=d[w]+w(u,v)<br>");
      out.println("3- else parent[v]<-u<br></section>");
      
     
      out.println("<a href=bellmanfordvisual>Visualise</a>");
      
      }
      else if(c==6)
      {
         ses.setAttribute("id",5);
          out.println("<body bgcolor=lightyellow><h3><pre>");
      out.println("<h3 align='center'>Interactive Learning</h3>");
      out.println("<p align='center'>Linear Search Algorithm</p><hr color='red'>");
      
      out.println("<fieldset style='width: 400px; height: 400px;'><legend>Algorithm</legend>");
       out.println("BELLMAN_FORD(G,W,S)");
      out.println("1- Initialise SINGLE_SOURCE(G,S)");
      out.println("2- for i=1 to |V[G]|-1");
      out.println("3-     do for each edge (u,v)<-E[G]");
      out.println("4-          do RELAX(u,v,w) ");
      out.println("5- for each edge (u,v)<-E[G]");
      out.println("6-     if d[V]>d[U]+w(u,v)");
      out.println("7-        return false");
      out.println("8-     return true");
      out.println();
      out.println("SINGLE_SOURCE(G,S)");
      out.println("1- for each vertex v<-V[G]");
      out.println("2-    do d[V]<-infinity");
      out.println("3-       parent[V]<-NIL ");
      out.println("4-       d[S]<-0");
      out.println();
      out.println("RELAX(u,v,w)");
      out.println("1- if d[V]>d[u]+w(u,v)");
      out.println("2-     then d[v]=d[w]+w(u,v)");
      out.println("3- else parent[v]<-u");
      out.println(" </fieldset>");
      out.println("<fieldset style='width: 200px; height: 20px;'><legend>Time Complexity");
     
      out.println("O(n)");
      out.println("</fieldset>");
      out.println();
      out.println();
      out.println("<fieldset style='width: 200px; height: 20px;'><legend>Space Complexity");
       
     
      out.println("O(n)");
      out.println("</fieldset>");
      out.println("<a href=bellmanfordvisual>Visualise</a>");
      out.println("<fieldset style='width: 400px; height: 200px;'><legend>Validate</legend>");
      out.println("<form action=bellmanfordvalidate method=post>");
      out.println("Enter Number:<input type=text name=d1 /> ");
     // out.println("Enter Number to be searched:          <input type=text name=d2 /> ");
      out.println("             <input type=submit  value='Check for Armstrong'/>");
      out.println("<p style=color:red>field cannot be left empty!!!");
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