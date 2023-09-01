<%-- 
    Document   : TestResult
    Created on : Oct 05, 2017, 1:56:30 PM
    Author     : owner
--%>

<%@page import="Database.ConnectionManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="Model.CareerAssessment"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
  <title>View Results</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
     <link href="https://fortawesome.github.io/Font-Awesome/assets/font-awesome/css/font-awesome.css" rel="stylesheet">
  <link rel="stylesheet" href="css\style.css">
    <link rel="stylesheet" href="css\animate.css">
</head>
  <%
    Model.UserBean u = (Model.UserBean) session.getAttribute("currentSessionUser"); 
    %>

 <body>
     
     <%
 
      Connection currentCon = null;
      ResultSet resultSet= null; 
      Statement stmt = null;    
	
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

<!---------------------------NAVIGATION BAR--------------------------------------->

 <div class="container-fluid" style="background-color:#FF8000">
		<ul class="pull-left">  
 
			<ul class="nav nav-tabs">
			     <li ><a href="UserDashboard.jsp"><b style="color:white"> User Profile </b></a></li> 
			       <li><a href="WriteParagraph.jsp"><b style="color:white"> Take test</b></a></li> 
				
				<li><a href="ExploreSchools.jsp"><b style="color:white">Explore Schools</b></a></li>
				<li><a href="ExploreCourses.jsp"><b style="color:white">Explore Online Courses</b></a></li>   
				<li><a href="ExploreCareerCurriculum.jsp"><b style="color:white">Explore Career Curriculum</b></a></li>
                                <li><a href="ViewPreviousResults.jsp"><b style="color:white">View Test Scores</b></a></li>
				<li><a href="Feedback.jsp"><b style="color:white">Feedback</b></a></li>
	
			</ul>
		</ul>
	</div>


    <br />



</br>
   
<%CareerAssessment c=u.getAssessment() ;
  String[] test2=c.getCareerset();//questionnaire
//out.println(c.getCareerset1());//paragraph
//for(int i=0;test2[i]!="all";i++)
//out.println(test2[i]);
%>
  

<div class="container" >
    
 <img src="img\Main\speak.png" style="display: block; margin: 0 auto; width:130px; height:110px; margin-top:90px; margin-left:80px"/>
 <center> ${displaytext}</center>
    <img src="img\Main\dude.jpg" style=" width:250px; height:250px"/>
    
        
    
    <div class="container" style="height: 100%; width: 20%; float: right; position: relative;top: 0;left: 0;">
        <img src="img\Main\board.jpg" style="position: absolute;top: 0;left: 0;display: block; margin: 0 auto; width:300px; height:300px"/>
        <img class="animated fadeIn" src="img\Main\board2.jpg" style="  position: absolute; top:0; left:0; display: block; margin: 0 auto; width:300px; height:300px"/>
        
        <div class="animated fadeIn" style="margin-top: 100px; position: absolute;top: 10%;left: 60%;transform: translate(-50%, -50%);">
                <h6 style="text-align:center; color:white"><%out.println(c.getCareerset1().toUpperCase());%></h6>
		<h6 style="text-align:center; color:white"><%out.println(test2[0].toUpperCase());%></h6>
		<h6 style="text-align:center; color:white"><%out.println(test2[1].toUpperCase());%></h6>
        </div>
    </div>
    
    
    <img class="animated slideInLeft2" src="img\Main\arrow4.png" style="width:200px; height:40px"/>

    
    
</div>




    </body>
</html>