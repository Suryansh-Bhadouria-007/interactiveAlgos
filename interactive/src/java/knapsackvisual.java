import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
//package com.javatpoint;  
import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*; 
public class knapsackvisual extends HttpServlet 
{
  @Override
  public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  
  { 
       PrintWriter out = res.getWriter();
       
       out.println("<body bgcolor=lightyellow><h3><pre>");
       out.println("<h3 align='center'>Interactive Learning</h3>");
       out.println("<p align='center'>Validation</p><hr color='red'>");
       out.print("<img src='" + req.getContextPath() + "/images/knapsack.gif' alt='image' />");
       out.println("</body>");
          
     
     // out.println("<img src='linear.gif' height=200px width=200px>");
  }
} 