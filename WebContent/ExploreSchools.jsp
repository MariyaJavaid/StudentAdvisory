<%-- 
    Document   : ExploreSchools
    Created on : Oct 5, 2017, 3:07:36 PM
    Author     : owner
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Explore Schools</title>
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
				
				<li class="active"><a href="ExploreSchools.jsp"><b style="color:#355c7d">Explore Schools</b></a></li>
				<li><a href="ExploreCourses.jsp"><b style="color:white">Explore Online Courses</b></a></li>   
				<li><a href="ExploreCareerCurriculum.jsp"><b style="color:white">Explore Career Curriculum</b></a></li>
                                <li><a href="ViewPreviousResults.jsp"><b style="color:white">View Test Scores</b></a></li>
				<li><a href="Feedback.jsp"><b style="color:white">Feedback</b></a></li>
	
			</ul>
		</ul>
	</div>

</br>
</br>
        <br /><br />
<!------------------------------------------body--------------------------------->

<center><a id="archi"></a><h3 style="font-family:Calibri"><b>ARCHITECTURE, PLANNING & ENVIRONMENTAL DESIGN</b></h3></center>
<center><p>(WORLDWIDE)</center>
<table class="table" style="width:700px; column-width:100px;margin-left: auto;margin-right: auto; border:2px solid red">
<thead>
<tr style="background-color:red; color:white"><th style="vertical-align:middle">World Rank</th><th style="vertical-align:middle">Institution</th><th style="vertical-align:middle">Score</th></tr>
</thead>
<tbody>
<tr><td><b>1</b></td><td>California Institute of Technology</td><td>94.3</td></tr>
<tr><td><b>2</b></td><td>Stanford University</td><td>93.8</td></tr>
<tr><td><b>3</b></td><td>University of Cambridge</td><td>93.6</td></tr>
<tr><td><b>4</b></td><td>Massachusetts Institute of Technology</td><td>93.4</td></tr>
<tr><td><b>5</b></td><td>Princeton University</td><td>90.2</td></tr>
</tbody>
</table>


<hr>




<center><a id="health"></a><h3 style="font-family:Calibri"><b>HEALTHCARE & MEDICAL</b></h3></center>
<center><p>(WORLDWIDE)</center>
<table class="table" style="width:700px; column-width:100px;margin-left: auto;margin-right: auto; border:2px solid red">
<thead>
<tr style="background-color:red; color:white"><th style="vertical-align:middle">World Rank</th><th style="vertical-align:middle">Institution</th><th style="vertical-align:middle">Score</th></tr>
</thead>
<tbody>
<tr><td><b>1</b></td><td>California Institute of Technology</td><td>94.3</td></tr>
<tr><td><b>2</b></td><td>Massachusetts Institute of Technology</td><td>93.4</td></tr>
<tr><td><b>3</b></td><td>Harvard University</td><td>92.7</td></tr>
<tr><td><b>4</b></td><td>ETH Zurich – Swiss Federal Institute of Technology Zurich</td><td>89.3</td></tr>
<tr><td><b>5</b></td><td>University of California, Berkeley</td><td>88.9</td></tr>
</tbody>
</table>

<center><p>(IN PAKISTAN)</center>
<table class="table" style="width:700px; column-width:100px;margin-left: auto;margin-right: auto;border:2px solid green">
<thead>
<tr style="background-color:green; color:white"><th style="vertical-align:middle">World Rank</th><th style="vertical-align:middle">Institution</th></tr>
</thead>
<tbody>
<tr><td><b>1</b></td><td>Aga Khan University</td></tr>
<tr><td><b>2</b></td><td>University of Health Sciences (Lahore)</td></tr>
<tr><td><b>3</b></td><td>Dow University of Health Sciences</td></tr>
<tr><td><b>4</b></td><td>Khyber Medical University</td></tr>
<tr><td><b>5</b></td><td>Isra University</td></tr>
<tr><td><b>6</b></td><td>King Edward Medical University</td></tr>
</tbody>
</table>
<hr>






<center><a id="arts"></a><h3 style="font-family:Calibri"><b>ARTS, LITERATURE & ENTERTAINMENT</b></h3></center>
<center><p>(WORLDWIDE)</center>
<table class="table" style="width:700px; column-width:100px;margin-left: auto;margin-right: auto; border:2px solid red">
<thead>
<tr style="background-color:red; color:white"><th style="vertical-align:middle">World Rank</th><th style="vertical-align:middle">Institution</th><th style="vertical-align:middle">Score</th></tr>
</thead>
<tbody>
<tr><td><b>1</b></td><td>University of Oxford</td><td>95.0</td></tr>
<tr><td><b>2</b></td><td>Stanford University</td><td>93.8</td></tr>
<tr><td><b>3</b></td><td>University of Cambridge</td><td>93.6</td></tr>
<tr><td><b>4</b></td><td>Massachusetts Institute of Technology</td><td>93.4</td></tr>
<tr><td><b>5</b></td><td>Harvard University</td><td>92.7</td></tr>
</tbody>
</table>

<center><p>(IN PAKISTAN)</center>
<table class="table" style="width:700px; column-width:100px;margin-left: auto;margin-right: auto;border:2px solid green">
<thead>
<tr style="background-color:green; color:white"><th style="vertical-align:middle">World Rank</th><th style="vertical-align:middle">Institution</th></tr>
</thead>
<tbody>
<tr><td><b>1</b></td><td>National College of Arts</td></tr>
<tr><td><b>2</b></td><td>Indus Valley School of Art and Architecture</td></tr>
</tbody>
</table>
<hr>






<center><a id="business"></a><h3 style="font-family:Calibri"><b>BUSINESS & MANAGEMENT</b></h3></center>
<center><p>(WORLDWIDE)</center>
<table class="table" style="width:700px; column-width:100px;margin-left: auto;margin-right: auto; border:2px solid red">
<thead>
<tr style="background-color:red; color:white"><th style="vertical-align:middle">World Rank</th><th style="vertical-align:middle">Institution</th><th style="vertical-align:middle">Score</th></tr>
</thead>
<tbody>
<tr><td><b>1</b></td><td>University of Oxford</td><td>95.0</td></tr>
<tr><td><b>2</b></td><td>California Institute of Technology</td><td>94.3</td></tr>
<tr><td><b>3</b></td><td>University of Cambridge</td><td>93.6</td></tr>
<tr><td><b>4</b></td><td>Massachusetts Institute of Technology</td><td>93.4</td></tr>
<tr><td><b>5</b></td><td>ETH Zurich - Swiss Federal Institute of Technology Zurich</td><td>89.3</td></tr>
</tbody>
</table>

<center><p>(IN PAKISTAN)</center>
<table class="table" style="width:700px; column-width:100px;margin-left: auto;margin-right: auto;border:2px solid green">
<thead>
<tr style="background-color:green; color:white"><th style="vertical-align:middle">World Rank</th><th style="vertical-align:middle">Institution</th></tr>
</thead>
<tbody>
<tr><td><b>1</b></td><td> Lahore University of Management Sciences (LUMS)</td></tr>
<tr><td><b>2</b></td><td> Institute of Business Administration (IBA)</td></tr>
</tbody>
</table>
<hr>





<center><a id="edu"></a><h3 style="font-family:Calibri"><b>EDUCATION</b></h3></center>
<center><p>(WORLDWIDE)</center>
<table class="table" style="width:700px; column-width:100px;margin-left: auto;margin-right: auto; border:2px solid red">
<thead>
<tr style="background-color:red; color:white"><th style="vertical-align:middle">World Rank</th><th style="vertical-align:middle">Institution</th><th style="vertical-align:middle">Score</th></tr>
</thead>
<tbody>
<tr><td><b>1</b></td><td>University of Cambridge</td><td>93.6</td></tr>
<tr><td><b>2</b></td><td>Imperial College London</td><td>90.0</td></tr>
<tr><td><b>3</b></td><td>UCL</td><td>86.5</td></tr>
<tr><td><b>4</b></td><td>Columbia University</td><td>86.1</td></tr>
<tr><td><b>5</b></td><td>Johns Hopkins University</td><td>85.9</td></tr>
</tbody>
</table>

<hr>





<center><a id="eng"></a><h3 style="font-family:Calibri"><b>ENGINEERING & INDUSTRIAL</b></h3></center>
<center><p>(WORLDWIDE)</center>
<table class="table" style="width:700px; column-width:100px;margin-left: auto;margin-right: auto; border:2px solid red">
<thead>
<tr style="background-color:red; color:white"><th style="vertical-align:middle">World Rank</th><th style="vertical-align:middle">Institution</th><th style="vertical-align:middle">Score</th></tr>
</thead>
<tbody>
<tr><td><b>1</b></td><td>University of Oxford</td><td>95.0</td></tr>
<tr><td><b>2</b></td><td>California Institute of Technology</td><td>94.3</td></tr>
<tr><td><b>3</b></td><td>Stanford University</td><td>93.8</td></tr>
<tr><td><b>4</b></td><td>University of Cambridge</td><td>93.6</td></tr>
<tr><td><b>5</b></td><td>Massachusetts Institute of Technology</td><td>93.4</td></tr>
</tbody>
</table>

<center><p>(IN PAKISTAN)</center>
<table class="table" style="width:700px; column-width:100px;margin-left: auto;margin-right: auto;border:2px solid green">
<thead>
<tr style="background-color:green; color:white"><th style="vertical-align:middle">World Rank</th><th style="vertical-align:middle">Institution</th></tr>
</thead>
<tbody>
<tr><td><b>1</b></td><td>National University of Sciences and Technology</td></tr>
<tr><td><b>2</b></td><td>Pakistan Institute of Engineering and Applied Sciences</td></tr>
<tr><td><b>3</b></td><td>Ghulam Ishaq Khan Institute of Engineering Sciences and Technology</td></tr>
<tr><td><b>4</b></td><td>Institute of Space Technology</td></tr>
<tr><td><b>5</b></td><td>University of Engineering and Technology (Lahore)</td></tr>
<tr><td><b>6</b></td><td>Mehran University of Engineering and Technology</td></tr>
</tbody>
</table>
<hr>




<center><a id="it"></a><h3 style="font-family:Calibri"><b>INFORMATION TECHNOLOGY</b></h3></center>
<center><p>(WORLDWIDE)</center>
<table class="table" style="width:700px; column-width:100px;margin-left: auto;margin-right: auto; border:2px solid red">
<thead>
<tr style="background-color:red; color:white"><th style="vertical-align:middle">World Rank</th><th style="vertical-align:middle">Institution</th><th style="vertical-align:middle">Score</th></tr>
</thead>
<tbody>
<tr><td><b>1</b></td><td>University of Oxford</td><td>95.0</td></tr>
<tr><td><b>2</b></td><td>California Institute of Technology</td><td>94.3</td></tr>
<tr><td><b>3</b></td><td>Stanford University</td><td>93.8</td></tr>
<tr><td><b>4</b></td><td>University of Cambridge</td><td>93.6</td></tr>
<tr><td><b>5</b></td><td>Massachusetts Institute of Technology</td><td>93.4</td></tr>
</tbody>
</table>

<center><p>(IN PAKISTAN)</center>
<table class="table" style="width:700px; column-width:100px;margin-left: auto;margin-right: auto;border:2px solid green">
<thead>
<tr style="background-color:green; color:white"><th style="vertical-align:middle">World Rank</th><th style="vertical-align:middle">Institution</th></tr>
</thead>
<tbody>
<tr><td><b>1</b></td><td>COMSATS Institute of Information Technology</td></tr>
<tr><td><b>2</b></td><td>National University of Computer and Emerging Sciences</td></tr>
<tr><td><b>3</b></td><td>NUST</td></tr>
</tbody>
</table>
<hr>




<center><a id="ss"></a><h3 style="font-family:Calibri"><b>SOCIAL SCIENCES</b></h3></center>
<center><p>(WORLDWIDE)</center>
<table class="table" style="width:700px; column-width:100px;margin-left: auto;margin-right: auto; border:2px solid red">
<thead>
<tr style="background-color:red; color:white"><th style="vertical-align:middle">World Rank</th><th style="vertical-align:middle">Institution</th><th style="vertical-align:middle">Score</th></tr>
</thead>
<tbody>
<tr><td><b>1</b></td><td>Stanford University</td><td>93.8</td></tr>
<tr><td><b>2</b></td><td>University of Cambridge</td><td>93.6</td></tr>
<tr><td><b>3</b></td><td>Massachusetts Institute of Technology</td><td>93.4</td></tr>
<tr><td><b>4</b></td><td>Harvard University</td><td>92.7</td></tr>
<tr><td><b>5</b></td><td>Princeton University</td><td>90.2</td></tr>
</tbody>
</table>


<hr>




<center><a id="agri"></a><h3 style="font-family:Calibri"><b>AGRICULTURE</b></h3></center>
<center><p>(WORLDWIDE)</center>
<table class="table" style="width:700px; column-width:100px;margin-left: auto;margin-right: auto; border:2px solid red">
<thead>
<tr style="background-color:red; color:white"><th style="vertical-align:middle">World Rank</th><th style="vertical-align:middle">Institution</th><th style="vertical-align:middle">Score</th></tr>
</thead>
<tbody>
<tr><td><b>1</b></td><td>Harvard University</td><td>92.7</td></tr>
<tr><td><b>2</b></td><td>ETH Zurich - Swiss Federal Institute of Technology Zurich</td><td>89.3</td></tr>
<tr><td><b>3</b></td><td>University of California, Berkeley</td><td>88.9</td></tr>
<tr><td><b>4</b></td><td>Johns Hopkins University</td><td>85.9</td></tr>
<tr><td><b>5</b></td><td>Cornell University</td><td>84.6</td></tr>
</tbody>
</table>

<center><p>(IN PAKISTAN)</center>
<table class="table" style="width:700px; column-width:100px;margin-left: auto;margin-right: auto;border:2px solid green">
<thead>
<tr style="background-color:green; color:white"><th style="vertical-align:middle">World Rank</th><th style="vertical-align:middle">Institution</th></tr>
</thead>
<tbody>
<tr><td><b>1</b></td><td>University of Agriculture (Faisalabad)</td></tr>
<tr><td><b>2</b></td><td>University of Agriculture (Peshawar)</td></tr>
<tr><td><b>3</b></td><td>Sindh Agriculture University</td></tr>
<tr><td><b>4</b></td><td>Lasbela University of Agriculture, Water and Marine Sciences</td></tr>
</tbody>
</table>
<hr>





<br />
<center><a id="sports"></a><h3 style="font-family:Calibri"><b>SPORTS & RECREATION</b></h3></center>
<center><p>(WORLDWIDE)</center>
<table class="table" style="width:700px; column-width:100px;margin-left: auto;margin-right: auto; border:2px solid red">
<thead>
<tr style="background-color:red; color:white"><th style="vertical-align:middle">World Rank</th><th style="vertical-align:middle">Institution</th><th style="vertical-align:middle">Score</th></tr>
</thead>
<tbody>
<tr><td><b>1</b></td><td>University of Michigan</td><td>83.6</td></tr>
<tr><td><b>2</b></td><td>University of Edinburgh</td><td>79.2</td></tr>
<tr><td><b>3</b></td><td>Tsinghua University/td><td>76.2</td></tr>
<tr><td><b>4</b></td><td>University of British Columbia</td><td>75.9</td></tr>
<tr><td><b>5</b></td><td>University of Illinois at Urbana-Champaign</td><td>75.9</td></tr>
</tbody>
</table>


<hr>




<br />
<center><a id="Law"></a><h3 style="font-family:Calibri"><b>LAW & PUBLIC POLICY</b></h3></center>
<center><p>(WORLDWIDE)</center>
<table class="table" style="width:700px; column-width:100px;margin-left: auto;margin-right: auto; border:2px solid red">
<thead>
<tr style="background-color:red; color:white"><th style="vertical-align:middle">World Rank</th><th style="vertical-align:middle">Institution</th><th style="vertical-align:middle">Score</th></tr>
</thead>
<tbody>
<tr><td><b>1</b></td><td>University of Oxford</td><td>95.0</td></tr>
<tr><td><b>2</b></td><td>Stanford University</td><td>93.8</td></tr>
<tr><td><b>3</b></td><td>University of Cambridge</td><td>93.6</td></tr>
<tr><td><b>4</b></td><td>Harvard University</td><td>92.7</td></tr>
<tr><td><b>5</b></td><td>University of California, Berkeley</td><td>88.9</td></tr>
</tbody>
</table>

<hr>




<br />
<center><a id="ns"></a><h3 style="font-family:Calibri"><b>NATURAL SCIENCES</b></h3></center>
<center><p>(WORLDWIDE)</center>
<table class="table" style="width:700px; column-width:100px;margin-left: auto;margin-right: auto; border:2px solid red">
<thead>
<tr style="background-color:red; color:white"><th style="vertical-align:middle">World Rank</th><th style="vertical-align:middle">Institution</th><th style="vertical-align:middle">Score</th></tr>
</thead>
<tbody>
<tr><td><b>1</b></td><td>University of Oxford</td><td>95.0</td></tr>
<tr><td><b>2</b></td><td>California Institute of Technology</td><td>94.3</td></tr>
<tr><td><b>3</b></td><td>Stanford University</td><td>93.8</td></tr>
<tr><td><b>4</b></td><td>University of Cambridge</td><td>93.6</td></tr>
<tr><td><b>5</b></td><td>Massachusetts Institute of Technology</td><td>93.4</td></tr>
</tbody>
</table>


<hr>





<br />
<center><a id="comm"></a><h3 style="font-family:Calibri"><b>COMMUNICATIONS</b></h3></center>
<center><p>(WORLDWIDE)</center>
<table class="table" style="width:700px; column-width:100px;margin-left: auto;margin-right: auto; border:2px solid red">
<thead>
<tr style="background-color:red; color:white"><th style="vertical-align:middle">World Rank</th><th style="vertical-align:middle">Institution</th><th style="vertical-align:middle">Score</th></tr>
</thead>
<tbody>
<tr><td><b>1</b></td><td>Stanford University</td><td>93.8</td></tr>
<tr><td><b>2</b></td><td>Massachusetts Institute of Technology</td><td>93.4</td></tr>
<tr><td><b>3</b></td><td>University of California, Berkeley</td><td>88.9</td></tr>
<tr><td><b>4</b></td><td>University of Pennsylvania</td><td>87.1</td></tr>
<tr><td><b>5</b></td><td>Johns Hopkins University</td><td>85.8</td></tr>
</tbody>
</table>


<hr>




<br />
<center><a id="he"></a><h3 style="font-family:Calibri"><b>HOME ECONOMICS</b></h3></center>
<center><p>(WORLDWIDE)</center>
<table class="table" style="width:700px; column-width:100px;margin-left: auto;margin-right: auto; border:2px solid red">
<thead>
<tr style="background-color:red; color:white"><th style="vertical-align:middle">World Rank</th><th style="vertical-align:middle">Institution</th><th style="vertical-align:middle">Score</th></tr>
</thead>
<tbody>
<tr><td><b>1</b></td><td>University of Oxford</td><td>95.0</td></tr>
<tr><td><b>2</b></td><td>California Institute of Technology</td><td>94.3</td></tr>
<tr><td><b>3</b></td><td>Stanford University</td><td>93.8</td></tr>
<tr><td><b>4</b></td><td>University of Cambridge</td><td>93.6</td></tr>
<tr><td><b>5</b></td><td>Massachusetts Institute of Technology</td><td>93.4</td></tr>
</tbody>
</table>


<hr>
</br></br></br></br>
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
