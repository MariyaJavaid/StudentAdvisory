<!DOCTYPE html>
<html lang="en">
<head>
  <title>Logout</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
     <link href="https://fortawesome.github.io/Font-Awesome/assets/font-awesome/css/font-awesome.css" rel="stylesheet">
  <link rel="stylesheet" href="css/homepage.css">
</head>
<body> 
 
<div class="container-fluid">
    
    <%
session.setAttribute("currentSessionUser", null);
session.invalidate();
//response.sendRedirect("index.jsp");
%>
    </br>
  <div class="panel panel-default">
    <div class="panel-body"style="background-color:#355c7d"><b style="color:white">You have been successfully logged out.To login please return to the <a href="index.jsp">Login page.</b></div>
  </div>
</div>

</body>

</html>