import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

public class MyConnection extends HttpServlet
{
   public static Connection con;
public static Connection getConnection()
	{
	try
          {    
		Class.forName("com.mysql.jdbc.Driver");
		//System.out.println("Driver Loaded");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/suryansh_interactive","suryansh_007","umasingh");
		//System.out.println("Connected");
          }
	  catch(ClassNotFoundException e)
	   {
		System.out.println(e);
           }
	  catch(SQLException r)
	   {
               System.out.println(r);
	   }
		return con;
	}
}   


   