<%-- 
    Document   : home.jsp
    Created on : Apr 1, 2021, 5:39:35 PM
    Author     : Hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style type="text/css">
            *
            {
                margin:0px;
            }
            
            header{
                height:100px;
                background-color:orange;
                
            }
            header a{
                margin-left: 20px;
                font-size: 25px;
                font-weight: bolder;
                text-decoration: none;
                
            }
            section{
                height:500px;
                background-color:graytext;
            }
            
            footer{
              height:100px;
                background-color:orange;  
            }
            
        </style>
    </head>
    <body>
        <header>
            <h1>Welcome in header part</h1>
            <a href="home.jsp">Home</a><a href="contact.jsp">Contact</a>
        </header>
        <section>
           <h1>Welcome in section part</h1> 
        </section>
        <footer>
            <h1>Welcome in footer part</h1>
        </footer>
    </body>
</html>
