import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class floyd extends HttpServlet
{
  @Override
  public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  
  { 
      PrintWriter out = res.getWriter();
      out.println("<body bgcolor=lightyellow><h3><pre>");
      out.println("<h3 align='center'>Interactive Learning</h3>");
      out.println("<p align='center'>Linear Search Algorithm</p><hr color='red'>");
      
      out.println("<fieldset style='width: 400px; height: 200px;'><legend>Algorithm</legend>");
      out.println("Floyd_WARSHALL(w)");
      out.println("1- n=row(w)");
      out.println("2- D0=w");
      out.println("3-   for k=1 to n");
      out.println("4-     do for i=1 to n");
      out.println("5-       do for j=1 to n");
      out.println("6-         do d[i][j]=min(d[i][j],d[i][k]+d[k][j])");
      out.println("7-  return d ");
      out.println("8- End");
      
      out.println(" </fieldset>");
      out.println("<fieldset style='width: 200px; height: 20px;'><legend>Time Complexity");
     
      out.println("O(n)");
      out.println("</fieldset>");
      out.println();
      out.println();
      out.println("<fieldset style='width: 200px; height: 20px;'><legend>Space Complexity");
       
     
      out.println("O(n)");
      out.println("</fieldset>");
      out.println("<a href=floydvisual>Visualise</a>");
      out.println("<fieldset style='width: 400px; height: 200px;'><legend>Validate</legend>");
      out.println("<form action=floydvalidate method=post>");
      out.println("Enter Number of Vertices     :<input type=text name=d1 /> ");
      out.println("Enter Weights seperated by , :<input type=text name=d2 /> ");
      out.println("                              <input type=submit  value='Enter'/>");
      out.println("</fieldset></form></body>");
  }
}