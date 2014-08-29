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


//@WebServlet(name = "a3", urlPatterns = {"/register"})
public class floydvalidate extends HttpServlet 
{  
   String arr,n;
        int c=0,i=0,num;
         
  @Override
  public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  
  {   
      PrintWriter out = res.getWriter();
      n=req.getParameter("d1");
      arr=req.getParameter("d2");
      arr+=',';
      num=Integer.parseInt(n);
      while(i<arr.length())
      {
          if(arr.charAt(i)==',')
                c++;
          i++;
      }
     // int s1[][]=new int[num][num];
     // System.out.println(arr);
      if(c<num*num)
      {
       out.println("<body bgcolor=lightyellow><script type=text/javascript /><h3><pre>");
       out.println("<h3 align='center'>Interactive Learning</h3>");
       out.println("<p align='center'>Validation</p><hr color='red'>");
       out.println("window.open(floyd)");
       out.println("</script></body>");
      }
    /*  for(int i=0;i<arr.length();i++)
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
       out.println("<body bgcolor=lightyellow><h3><pre>");
       out.println("<h3 align='center'>Interactive Learning</h3>");
       out.println("<p align='center'>Validation</p><hr color='red'>");
      if(pos==0)out.println("Number not found");
      else out.println("Number found at "+pos);
      beg=0;end=-1;c=0;pos=0;
      out.println("<a href=linearsearch>Back</a>");*/
     c=0;i=0;
  }
}
      
          
    