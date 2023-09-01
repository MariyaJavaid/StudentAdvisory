<!DOCTYPE html>
<html lang="en">
<head>
  <title>Dashboard</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
     <link href="https://fortawesome.github.io/Font-Awesome/assets/font-awesome/css/font-awesome.css" rel="stylesheet">
  <link rel="stylesheet" href="css\homepage.css">
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


	<ul class="pull-right" >


            <a href="Logout.jsp">  <button type="button"style="background-color:orange"class="btn btn-primary"><span class="glyphicon glyphicon-log-out"></span>Log Out</button></a>						
							
</ul>       
</div>



</br>

<!----------------------------ADMIN dASHBOARD------------------------------>

 <div class="container-fluid" style="background-color:#FF8000">
		<ul class="pull-left">  
 
			<ul class="nav nav-tabs">
			       <li class="active"><a href="AdminDashboard.jsp"><b style="color:#355c7d"> Admin Profile </b></a></li> 
			       <li><a href="ViewFeedback.jsp"><b style="color:white"> View Feedback</b></a></li> 
				
				
			</ul>
		</ul>
	</div>
</br>
</br>
</br>	
	<div class="container">
 
  <div class="row">
    <div class="col-sm-3" ><img src="https://image.freepik.com/free-vector/businessman-with-a-bulb-in-the-head_1133-329.jpg" alt="Mandrin hotel" style="width:190px;height:170px;"/> </div>

    <div class="col-sm-5">  
	<ul class="list-group">
    <li class="list-group-item" ><b>Name:</b> <%out.println(u.getFirstName()+" ");%><%out.println(u.getLastName());%></li>
    <li class="list-group-item"><b>Email address:</b> <%out.println(u.getUsername());%></li>
    <li class="list-group-item"><b>Gender:</b><%out.println(u.getGender());%></li>
    
    </br>
   <center><a href="EditProfile.jsp"> <button type="button" class="btn btn-primary" style="background-color:orange">EDIT PROFILE</button></a></center>
   
  </ul></div>
  </div>
 
</div>
    </br>

</br>
</br>
</br>	
	
<!------------------------------------------------------FOOTER--------------------------------------------------->
	<footer class="container-fluid text-center">
		<div class="row spRow">
			<div class="col-sm-4">
				<h3>Contact Us </h3>
				 <p><i class="fa fa-phone"></i> Phone (Pakistan) : (042) 111 128 128</p>
                 <p><i class="fa fa-envelope"></i> E-mail : support@studentadvisory.com</p>
			</div>
			<div class="col-sm-4">
				<h3>Follow Us</h3>
				<a href="https://www.facebook.com/"><img src="img\Icons\icon_1.png" alt="Facebook" style="width:30px;height:30px;"/></a> 
				<a href="https://www.facebook.com/"><img src="img\Icons\icon_5.png" alt="Facebook" style="width:30px;height:30px;"/></a> 
				<a href="https://www.facebook.com/"><img src="img\Icons\icon_2.png" alt="Facebook" style="width:30px;height:30px;"/></a> 
			</div>
			<div class="col-sm-4">
				<h3>Explore Us</h3>
				<a href="FAQ.html">FAQ</a>
			</div>
		</div>
	</footer>

<!-------------END FOOTER----------------------->	
<div class="copyright" style="background-color:#000000">
  <div class="container">
  	<div class="footer_last">
  		<div class="col-md-12">
    		<center> <h7 style="color:orange">  Student Advisory</h7> <h7 style="color:white">&#169;2017</h7><a href="Terms.html">Terms and Condition</a></center>
    	</div>
  	</div>
  </div>
</div>	
	


</body>
</html>