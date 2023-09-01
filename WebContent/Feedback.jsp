<!doctype html>
<html lang="en">
<head>
  <title>Feedback</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link href="https://fortawesome.github.io/Font-Awesome/assets/font-awesome/css/font-awesome.css" rel="stylesheet">
  <link rel="stylesheet" href="css\homepage.css">
<link rel="stylesheet" href="http://netdna.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css">
<style>
@import url(http://fonts.googleapis.com/css?family=Roboto:500,100,300,700,400);

* {
  margin: 0;
  padding: 0;
  font-family: roboto;
}

body { background: white; }

.cont {
  width: 93%;
  max-width: 350px;
  text-align: center;
  margin: 4% auto;
  margin-top:5px;
  margin-bottom:5px;
  padding: 30px 0;
  background: white;
  color: #EEE;
  overflow: hidden;
}


hr {
  margin: 20px;
  border: none;
  border-bottom: thin solid rgba(255,255,255,.1);
}

div.title { font-size: 2em; }

h1 span {
  font-weight: 300;
  color: #Fd4;
}

div.stars {
  width: 270px;
  display: inline-block;
}

input.star { display: none; }

label.star {
  float: right;
  padding: 10px;
  font-size: 36px;
  color: black;
  transition: all .2s;
}

input.star:checked ~ label.star:before {
  content: '\f005';
  color: #FD4;
  transition: all .25s;
}

input.star-5:checked ~ label.star:before {
  color: #FE7;
  text-shadow: 0 0 20px #952;
}

input.star-1:checked ~ label.star:before { color: #F62; }

label.star:hover { transform: rotate(-15deg) scale(1.3); }

label.star:before {
  content: '\f006';
  font-family: FontAwesome;
}
</style>
<link href="http://www.cssscript.com/wp-includes/css/sticky.css" rel="stylesheet" type="text/css">
</head>

<body>
     
<%
        if (u==null){//authentication
            response.sendRedirect("index.jsp?error=notsignin");
            return;
        }
        else if (!(u.getType()==2))//authorization
        {
            int type = u.getType();
            String role="ad";
            if(type==1)
                role="ad";
            
            response.sendRedirect("error.jsp?user="+role);
            return;
        }
        
    %>      
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

    
    <!---------------------------NAVIGATION--------------------------------------->

<div class="container-fluid" style="background-color:#FF8000">
		<ul class="pull-left">  
 
			<ul class="nav nav-tabs">
			       <li><a href="UserDashboard.jsp"><b style="color:white"> User Profile </b></a></li> 
			       <li><a href="WriteParagraph.jsp"><b style="color:white"> Take test</b></a></li> 
				
				<li><a href="ExploreSchools.jsp"><b style="color:white">Explore Schools</b></a></li>
				<li><a href="ExploreCourses.jsp"><b style="color:white">Explore Online Courses</b></a></li>   
				<li><a href="ExploreCareerCurriculum.jsp"><b style="color:white">Explore Career Curriculum</b></a></li>
                                <li><a href="ViewPreviousResults.jsp"><b style="color:white">View Previous Results</b></a></li>
				<li class="active"><a href="Feedback.jsp"><b style="color:#355c7d">Feedback</b></a></li>
	
			</ul>
		</ul>
	</div>
    
    <h4>${displaytext}</h4>
    <br /><p style="text-align:center">Customer feedback is of valuable importance to us. <br /> Rate the site below and don't forget to leave valuable suggestions</p>
<div class="container" style="width: 500px; margin-right: auto; margin-left: auto;">
  <div class="stars">
    <form action="FeedbackServlet">
        <div style="width: 400px; margin-right: auto; margin-left: auto;">
      <input class="star star-5" id="star-5-2" type="radio" name="star" value="5"/>
      <label class="star star-5" for="star-5-2"></label>
      <input class="star star-4" id="star-4-2" type="radio" name="star" value="4"/>
      <label class="star star-4" for="star-4-2"></label>
      <input class="star star-3" id="star-3-2" type="radio" name="star" value="3"/>
      <label class="star star-3" for="star-3-2"></label>
      <input class="star star-2" id="star-2-2" type="radio" name="star" value="2"/>
      <label class="star star-2" for="star-2-2"></label>
      <input class="star star-1" id="star-1-2" type="radio" name="star" value="1"/>
      <label class="star star-1" for="star-1-2"></label>
      </div>
      <br><br><br>
      <br><br>
      <div class="container" style="width:500px; margin-right: auto; margin-left: auto;">
    <P>SUGGEST A CHANGE!</P>
    <textarea  name="comment" style="width:500px; height:200px"></textarea>
    <br><center><input type="submit" style="background-color:orange" class="btn btn-primary" value="SUBMIT FEEDBACK"></center>
      </div>
      <br><br>
    </form>
  </div>
</div>

    






<script>
  (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
  (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
  m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
  })(window,document,'script','//www.google-analytics.com/analytics.js','ga');

  ga('create', 'UA-46156385-1', 'cssscript.com');
  ga('send', 'pageview');

</script>


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
    		<center> <h7 style="color:orange">  Student Advisory</h7> <h7 style="color:white">&#169;2017</h7><a href="Terms.html">Terms and Conditions</a></center>
    	</div>
  	</div>
  </div>
</div>	
	

</body>

</html>
