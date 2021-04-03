/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Hp
 */
public class Addition extends HttpServlet {
   int x,y;
    public void init()
    {
       x=100;
       y=200;
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        PrintWriter out = response.getWriter();
       // out.print("x="+x+"y="+y);
        response.setContentType("text/html");
        out.print("<form action='' method='post'>");
        out.print("<input type='text' name='txtnum1' placeholder='enter first number' /><br>");
        out.print("<input type='text' name='txtnum2' placeholder='enter second number' /><br>");
        out.print("<input type='submit' name='btnsubmit' /><br>");
        out.print("</form>");
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        PrintWriter out = response.getWriter();
        try
        {
        int num1 = Integer.parseInt(request.getParameter("txtnum1"));
        int num2 = Integer.parseInt(request.getParameter("txtnum2"));
        int num3 = num1+num2;
        
        out.print("result is "+num3);
        }
        catch(Exception ex)
        {
             out.print(ex.getMessage().toString());
        }
        
        
    }
    
    public void destroy()
    {
        
    }
    
}
