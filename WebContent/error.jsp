
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>error Page</title>
    </head>
    <body>
        <h1>ERROR! request could not be handled</h1>
        
        <%
                                            if (request.getParameter("user").equalsIgnoreCase("ad")) {
                                                out.println("You need to login to perform this action");
                                                out.println("<a href='AdminDashboard.jsp' class='btn btn-default'>Home Page</a>");
                                            } else if (request.getParameter("user").equalsIgnoreCase("pu")) {
                                                out.println("You need to login to perform this action");
                                                out.println("<a href='UserDashboard.jsp' class='btn btn-default'>Home Page</a>");
                                            }
                                            else
                                            out.println("You need to login to perform this action");
                                           
                                        %>
    </body>
</html>
