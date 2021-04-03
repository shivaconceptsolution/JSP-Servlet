<%-- 
    Document   : SI.jsp
    Created on : Apr 3, 2021, 5:37:17 PM
    Author     : Hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="SISer" method="post">
            
            <input type="text" name="txtp" placeholder="Enter P" />
            <br>
            <br>
            <input type="text" name="txtr" placeholder="Enter rate" />
            <br>
            <br>
            <input type="text" name="txtt" placeholder="Enter time" />
            <br>
            <br>
            <input type="submit" name="btnsubmit" value="SI" />
            <input type="submit" name="btnsubmit1" value="ADD" />
            
        </form>
        <p><%
    if(request.getParameter("q")!=null)
    {
    out.print(request.getParameter("q")) ;
    }%></p>
        
    </body>
</html>
