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
public class dijikstravalidate extends HttpServlet 
{  
   String n,s,d,ar;
        int num,source,dest,c=0,i=0,j=0,count=0;
         
  @Override
  public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  
  {   
      PrintWriter out = res.getWriter();
      HttpSession ses=req.getSession(false);
      c=(Integer)ses.getAttribute("id");
      n=req.getParameter("d1");
      s=req.getParameter("d2");
      d=req.getParameter("d3");
      ar=req.getParameter("d4");ar=ar+",";
      if(n.equals("")||s.equals("")||d.equals(""))
      {
              out.println("<body bgcolor=lightyellow><h3><pre>");
              out.println("<h3 align='center'>Ideal Institute of Technology,GZB</h3>");
              out.println("<p align='center'>Online Registration</p><hr color='red'>");
              ses.setAttribute("id",6);
              res.sendRedirect("http://localhost:8084/interactive/dijikstra");   
      } 
      else
      {
          
      //int s1[]=new int[arr.length()];
     // System.out.println(arr);
         num=Integer.parseInt(n);   
         source=Integer.parseInt(s);
         dest=Integer.parseInt(d);
         int arr[][]=new int [num][num];
         int k=0,l=0,n1=0,c=0;
         for(int i=0;i<ar.length();i++)
         {
             if(ar.charAt(i)!=',')s+=ar.charAt(i);
             else
             {    
             n1=Integer.parseInt(s);
             if(c==num){k++;l=0;c=0;}
                     arr[k][l++]=n1;
                     c++;
             s="";             
             }
         }
         arr[0][0]-=10;
         for( k=0;k<num;k++)
         {
             for( l=0;l<num;l++)System.out.println(arr[k][l]);
         }
         k=0;l=0;n1=0;
          out.println("<body bgcolor=lightyellow><h3><pre>");
          out.println("<h3 align='center'>Ideal Institute of Technology,GZB</h3>");
          out.println("<p align='center'>Online Registration</p><hr color='red'>");
          //int arr[][]=new int[num][num];
          
          s="";
                    
      }   
  }
}