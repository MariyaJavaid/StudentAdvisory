<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
     <link href="https://fortawesome.github.io/Font-Awesome/assets/font-awesome/css/font-awesome.css" rel="stylesheet">
  <link rel="stylesheet" href="css\homepage.css">
<title>Send an e-mail</title>
</head>



     <%
    Model.UserBean u = (Model.UserBean) session.getAttribute("currentSessionUser"); 
    %>
    

<body>
    
    <!-----------------------------HEADER------------------------------------------>
 <div class="container-fluid">
 
  <h2 style="font-size:30px">
  <ul class="pull-left">
   <img src="https://image.flaticon.com/icons/svg/321/321828.svg" style="width:50px;height:50px;">
   <b style="color:#355c7d; font-family:Bernard MT Condensed;">Student</b> <b style="color:#ff5400;;font-family:Bernard MT Condensed">Advisory</b></h2> 
</ul>
</br>


</div>
    


      <center><img src="img\Icons\2.png" width="400" height="70"></center>
      <center><b><h3 style="padding-left: 280px">Account Activation</h3></b></center>
    
	<form action="EmailSendingServlet" method="post">
		

<!---------------------------body--------------------------------------->
<div class="container">
    <div class="container-fluid">
	<div class="row">
		<div class="col-md-12 center">
			<h3>Hi,</h3>
			<h4>Thanks for signing up for Student Advisory!</h4>
			<h4>To get started, please confirm your account below</h4><br/>
<input type="submit"style="background-color:#355c7d"class="btn btn-primary" value="Confirm Your Account"/>
	
			<br><br/>
			<h4>For your reference, your username is <b> <% String username = u.getUsername();
                          out.println(username);
                        %></b> for Logging in</h4>
			<h4>Thanks, Team Student Advisory.</h4><br/>
		</div>
	</div>
    </div>
</div>


		
	</form>
                        </br>
                        </br>
                        </br>
                        
                        
                        
                        
   



                     
                        
</body>
</html>