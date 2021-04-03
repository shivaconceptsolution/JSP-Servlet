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
public class Hello extends HttpServlet {

   public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException
   {
       PrintWriter out = response.getWriter();
       out.print("<body bgcolor='cyan'>");
       out.print("<marquee><h1>Welcome in Servlet</h1></marquee>");
       out.print("<hr>");
       out.print("<p>sajhkfghjsagf jsag fhsag fjasdgfjg sdahjfghjsdafg </p>");
        
       out.print("</body>");
   }
   public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException
   {
       PrintWriter out = response.getWriter();
       out.print("<body bgcolor='cyan'>");
       out.print("<marquee><h1>Welcome in Servlet</h1></marquee>");
       out.print("<hr>");
       out.print("<p>sajhkfghjsagf jsag fhsag fjasdgfjg sdahjfghjsdafg </p>");
        
       out.print("</body>");
   }
}
