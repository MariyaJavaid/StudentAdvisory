<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
	 "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Adviosry | Email Activation</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">

	<!-- bootstrap core CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
 <link href="https://fortawesome.github.io/Font-Awesome/assets/font-awesome/css/font-awesome.css" rel="stylesheet">
	<!-- my custom css and JS -->
	<link href="css/homepage.css" rel="stylesheet">
</head>
<body>
    
    <div class="wrapper">
		<div class="container-fluid" id="topBar">
			<div class="row spRow">
				<div class="col-sm-8">
					<div class="row spRow">
						
					</div>	
				</div>
				
			</div>
		</div>
    
	<center>
            <h2><%=request.getAttribute("Message")%>Check your email to activate your account</h2>
	</center>
</body>
</html>