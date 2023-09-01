<!DOCTYPE html>
<html lang="en">
<head>
	<title>Student Adviosry | www.studentadvisory.com</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">

	<!-- bootstrap core CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
     
        <link href="https://fortawesome.github.io/Font-Awesome/assets/font-awesome/css/font-awesome.css" rel="stylesheet">
	<!-- my custom css and JS -->
	<link href="css/homepage.css" rel="stylesheet">
         <script> 
            
            function loadDoc() {
                  var xhttp = new XMLHttpRequest(); 
                  var emailid = document.getElementById("email").value;
                  var pass = document.getElementById("password").value;
                  document.getElementById("error1").innerHTML = " ";
               
                  if(emailid==""||pass=="")
                  {
                      document.getElementById("error")="Please fill all fields";
                  }
                 
                  var params = "email=" + emailid + "&" + "password=" + pass;
                  xhttp.onreadystatechange = function() 
                  {   if (xhttp.readyState == 4 && xhttp.status == 200)
                      
                      {     
                          if (this.responseText == "User")
                          {
                              location.href="UserDashboard.jsp";
                              document.getElementById("error").innerHTML = "Login Successful";
                          }
                          else if (this.responseText == "Admin")
                          {
                               location.href="AdminDashboard.jsp";
                               document.getElementById("error").innerHTML = "Login Successful";
                           }
                           else if (this.responseText == "SuperAdmin")
                           {
                               location.href="SuperAdminDashboard.jsp";
                               document.getElementById("error").innerHTML = "Login Successful";
                           }
                           else
                           {
                              document.getElementById("error1").innerHTML=this.responseText; 
                           }
                          
                          
                      }
                    };
                  xhttp.open("POST", "LoginServlet", true); 
                  xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
                  xhttp.send(params);
              }     
</script>
        
           
</head>

<body>
	<div class="wrapper">
		<div class="container-fluid" id="topBar">
			<div class="row spRow">
				<div class="col-sm-8">
					<div class="row spRow">
						
					</div>	
				</div>
				<div class="col-sm-4">
					<ul id="navRight">
				      <li><a  href="Signup.jsp"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
				      <li><a data-toggle="modal" data-target="#loginModal" href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
				    </ul>
				</div>	
			</div>
		</div>
		<!-- Navigation -->
		<nav class="navbar" role="navigation" data-spy="affix" data-offset-top="197">
		    <div class="container">
		        <!-- Brand and toggle get grouped for better mobile display -->
		        <div class="navbar-header">
		            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
		                <span class="sr-only">Toggle navigation</span>
		                <span class="icon-bar"></span>
		                <span class="icon-bar"></span>
		                <span class="icon-bar"></span>
		            </button>
  <h2 style="font-size:30px">
	<ul class="pull-left">
		<img src="https://image.flaticon.com/icons/svg/321/321828.svg" style="width:50px;height:50px;">
		<b style="color:#355c7d; font-family:Bernard MT Condensed;">Student</b> <b style="color:#ff5400;;font-family:Bernard MT Condensed">Advisory</b></h2> 
	</ul>
	</br>
		        </div>
		        <!-- Collect the nav links, forms, and other content for toggling -->
		        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
		            <ul class="nav navbar-nav">
		                <li>
		                    <a class="link" href="#">About</a>
		                </li>
		                <li>
		                    <a class="link" href="#">Services</a>
		                </li>
		                
		                <li>
		                    <a class="link" href="#">Contact</a>
		                </li>
		            </ul>
		        </div>
		        <!-- /.navbar-collapse -->
		    </div>
		    <!-- /.container -->
		</nav>

		<!-- Half Page Image Background Carousel Header -->
		<div id="myCarousel" class="carousel slide" data-ride="carousel">
		    <!-- Indicators -->
		    <ol class="carousel-indicators">
		      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
		      <li data-target="#myCarousel" data-slide-to="1"></li>
			   <li data-target="#myCarousel" data-slide-to="2"></li>
		    </ol>

		    <!-- Wrapper for slides -->
		    <div class="carousel-inner" role="listbox">
		      <div class="item active">
		        <img class="fill" src="img/Main/slider2.jpg" alt="Slide 1">
		      </div>

		      <div class="item">
		        <img class="fill" src="img/Main/ani.gif" alt="Slide 3">
		      </div>
			  
			  <div class="item">
		        <img class="fill" src="img/Main/slider3.png" alt="Slide 3">
		      </div>
		    </div>

		    <!-- Left and right controls -->
		    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
		      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
		      <span class="sr-only">Previous</span>
		    </a>
		    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
		      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
		      <span class="sr-only">Next</span>
		    </a>
		</div>
		<div class="container-fluid">
			<a name="About"></a>
			<div class="row text-center">
				<div class="col-sm-2">&nbsp;</div>
				<div class="col-sm-8">
					<h1>About</h1> 
					<p class="text-center"> Student Advisory is Pakistan's career navigation and education website.We aim to assist people in selecting careers that suit their personality and then learn what it takes to get there.  Applicants can either take a test or input in the form of text to be used in making career recommendations. They can also explore educational institutes and career curriculum and gain career insights.
					 We have consulted Dr Imran Hashmi(MDS in Child Pyschology) and Ms Nighat Iqbal(MS Pyschology) to help us with the research.</p>
				</div>
				<div class="col-sm-2">&nbsp;</div>
			</div>

			<div class="parallax row">
				<div class="col-sm-1">&nbsp;</div>
				<div class="col-sm-5">
				<p style="color: #ff5400; font-size: 36px; font-weight: bold;">WHY<span style="color: white;">CHOOSE US?</span></p>
				<p class="margin20B">We aim to provide you accurate information based upon vast research and analysis</p>
				<a href="booking.html" class="btn btn-default myBtn">Get Assessments</a>
				</div>
				<div class="col-sm-6">&nbsp;</div>
			</div>

			<a name="Services"></a>
			<div class="row text-center">
				<div class="col-sm-2">&nbsp;</div>
				<div class="col-sm-8">
					<h1>Services</h1> 
					<p class="text-center">We aim to provide the following services to our customers</p>
				</div>
				<div class="col-sm-2">&nbsp;</div>
			</div>
			<div class="row text-center">
				<div class="col-sm-3"><img src="img\Main\school.png" style="width:150px;height:150px;"/><h3>Explore Schools</h3></div>
				<div class="col-sm-3"><img src="img\Main\course.png" style="width:150px;height:150px;"/><h3>Explore Online Courses</h3></div>
				<div class="col-sm-3"><img src="img\Main\curriculum.png" style="width:150px;height:150px;"/></span><h3>Get Career Insights</h3></div>
				<div class="col-sm-3"><img src="img\Main\insights.png" style="width:150px;height:150px;"/></span><h3>Get Job Insights</h3></div>
			</div>

			<a name="Contact"></a>
			<div class="row text-center">
				<div class="col-sm-2">&nbsp;</div>
				<div class="col-sm-8">
					<h1>Contact Us</h1> 
					<p class="text-center">Contact us on social media or call us directly. Our 24/7 customer support is available to help you and answer your queries. Feel free to ask any questions regarding career recommendations</p>
				</div>
				<div class="col-sm-2">&nbsp;</div>
			</div>
			


		
		</div>
	</div>


    
    <!-- LOGIN MODAL -->
    
    <div class="modal fade" id="loginModal" role="dialog">
        <div class="modal-dialog">
					<!-- Modal content-->
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal">&times;</button>
							<h4 class="modal-title"><center>Login Form</center></h4>
						</div>
	<div class="modal-body">
	 <form class="form-horizontal"id="loginform"> 
    

       
        EmailID:    <input  type="email" style="padding-top:10px" class="form-control" name="email" id="email" value="" placeholder="Email ID">                           
        </br>
        
         Password:     <input  type="password" class="form-control" name="password" id="password"placeholder="Password">
         <center><div style="background-color:#01DF3A" size="1px" id="error"></div></center></br>
         <a href="ResetPassword.jsp">Forgot Password?</a>
         <center><div style="color:red" size="1px" id="error1"></div></center></br>
         
        <center>  <button type="button" style="background-color:orange"class="btn btn-primary"onclick="loadDoc()"> Login</button></center>
         </form>  
          
        

                                <div class="form-group">
                                    <div class="col-md-12 control">
                                        <div style="border-top: 1px solid#888; padding-top:15px; font-size:85%" >
                                            Don't have an account! 
                                        <a href="#">
                                            Sign Up
                                        </a>
                                        </div>
                                    </div>
                                </div> 
                              
                               
						</div>
				    	<div class="modal-footer">
							<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
				    	</div>
				    </div>
				</div>
			</div>
    
    
    
    <!-----------------Footer----------------------------->

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

	
<div class="copyright" style="background-color:#000000">
  <div class="container">
  	<div class="footer_last">
  		<div class="col-md-12">
    		<center> <h7 style="color:orange">  Student Advisory</h7> <h7 style="color:white">&#169;2017</h7><a href="Terms.html">Terms and Condition</a></center>
    	</div>
  	</div>
  </div>
</div>	
	
	<script type="text/javascript">
		function scrollToAnchor(aid){
		    var aTag = $("a[name='"+ aid +"']");
		    var x=aTag.offset().top-190;
		    $('html,body').animate({scrollTop: x}, 1500);
		}

		$('.link').click(function(e) {
		  var txt = $(e.target).text();
		  console.log(txt);
		  scrollToAnchor(txt);
		});
	</script>
	<!-- Script to Activate the Carousel -->
	<script>
		$('.carousel').carousel({
		  interval: 4500 //changes the speed
		})
	</script>
</body>
</html> 