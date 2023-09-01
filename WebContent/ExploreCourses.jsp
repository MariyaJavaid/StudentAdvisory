<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Explore Courses</title>
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
			     <li ><a href="UserDashboard.jsp"><b style="color:white"> User Profile </b></a></li> 
			       <li><a href="WriteParagraph.jsp"><b style="color:white"> Take test</b></a></li> 
				
				<li ><a href="ExploreSchools.jsp"><b style="color:white">Explore Schools</b></a></li>
				<li class="active"><a href="ExploreCourses.jsp"><b style="color:#355c7d">Explore Online Courses</b></a></li>   
				<li><a href="ExploreCareerCurriculum.jsp"><b style="color:white">Explore Career Curriculum</b></a></li>
                                <li><a href="ViewPreviousResults.jsp"><b style="color:white">View Test Scores</b></a></li>
				<li><a href="Feedback.jsp"><b style="color:white">Feedback</b></a></li>
	
			</ul>
		</ul>
	</div>

</br>
</br>
<!---------------------------body--------------------------------------->

<div class="container">
    <div class="container-fluid">

        <br><br>
        <div class="well themargin">
            <div class="row">
                <div class="col-md-3">
                    <img class ="img3" src="img\Main\physics.png" style="height:150px; width:150px">
                </div>
                <div class="col-md-9">
                    <h3>Engineering and Industrial</h3>
                    <h5>COURSE LINKS</h5>
                    <p><img src="img\Icons\edx.png" alt="edx" style="width:30px;height:30px;"/>: 
                        <a href="https://www.edx.org/"> Link 1</a>
                        
                    </p>
                    <p><img src="img\Icons\coursera.png" alt="coursera" style="width:30px;height:30px;"/>: 
                        <a href="https://www.coursera.org/"> Link 2</a>
                    </p>
                </div>
            </div>
        </div>

        <div class="well themargin">
            <div class="row">
                <div class="col-md-3">
                    <img class ="img3" src="img\Main\Artist.png" style="height:150px; width:150px">
                </div>
                <div class="col-md-9">
                    <h3>Arts, Literature & Entertainment</h3>
                    <h5>COURSE LINKS</h5>
                    <p><img src="img\Icons\edx.png" alt="edx" style="width:30px;height:30px;"/>: 
                        <a href="https://www.edx.org//"> Link 1</a>
                       
                    </p>
                    <p><img src="img\Icons\coursera.png" alt="coursera" style="width:30px;height:30px;"/>: 
                       <a href="https://www.coursera.org/"> Link 2</a>
                       
                    </p>
                </div>
            </div>
        </div>

        <div class="well themargin">
            <div class="row">
                <div class="col-md-3">
                    <img class ="img3" src="img\Main\health.png" style="height:150px; width:150px">
                </div>
                <div class="col-md-9">
                    <h3>Healthcare & Medical</h3>
                    <h5>COURSE LINKS</h5>
                    <p><img src="img\Icons\edx.png" alt="edx" style="width:30px;height:30px;"/>: 
                        <a href="https://www.edx.org/"> Link 1</a>
                       
                    </p>
                    <p><img src="img\Icons\coursera.png" alt="coursera" style="width:30px;height:30px;"/>: 
                        <a href="https://www.coursera.org/"> Link 2</a>
                    </p>
                </div>
            </div>
        </div>

        <div class="well themargin">
            <div class="row">
                <div class="col-md-3">
                    <img class ="img3" src="img\Main\athletics.png" style="height:150px; width:150px">
                </div>
                <div class="col-md-9">
                    <h3>Sports & Recreation</h3>
                    <h5>COURSE LINKS</h5>
                    <p><img src="img\Icons\edx.png" alt="edx" style="width:30px;height:30px;"/>: 
                        <a href="https://www.edx.org/"> Link 1</a>
                       
                    </p>
                     <p><img src="img\Icons\coursera.png" alt="coursera" style="width:30px;height:30px;"/>: 
                        <a href="https://www.coursera.org/"> Link 2</a>
                    </p>
                </div>
            </div>
        </div>

    </div>
</div>


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





