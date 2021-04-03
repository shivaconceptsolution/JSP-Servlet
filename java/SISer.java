/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Hp
 */
public class SISer extends HttpServlet {

   public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException
   {
       PrintWriter out = response.getWriter();
       float p = Integer.parseInt(request.getParameter("txtp"));
       float r = Integer.parseInt(request.getParameter("txtr"));
       float t = Integer.parseInt(request.getParameter("txtt"));
        float si=0;
       if(request.getParameter("btnsubmit")!=null)
       {
        si = (p*r*t)/100;
       }
       if(request.getParameter("btnsubmit1")!=null)
       {
        si = p+r+t;
       }
       RequestDispatcher req = request.getRequestDispatcher("/SI.jsp?q="+si);
       
       req.forward(request, response);
       //response.sendRedirect("SI.jsp?q="+si);
       //out.print(si);
       
   }
}
