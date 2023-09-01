<!DOCTYPE html>
<html lang="en">
<head>
  <title>Questionnaire</title>
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
<!-----------------------------HEADER------------------------------------------>
 <div class="container-fluid">
 
  <h2 style="font-size:30px">
	<ul class="pull-left">
		<img src="https://image.flaticon.com/icons/svg/321/321828.svg" style="width:50px;height:50px;">
		<b style="color:#355c7d; font-family:Bernard MT Condensed;">Student</b> <b style="color:#ff5400;;font-family:Bernard MT Condensed">Advisory</b></h2> 
	</ul>
	</br>


	<ul class="pull-right" >


    <button type="button"style="background-color:orange"class="btn btn-primary"><span class="glyphicon glyphicon-log-out"></span>Log Out</button>						
							
</ul>        
</div>


<!---------------------------NAVIGATION BAR--------------------------------------->

</br>

<div class="container-fluid" style="background-color:#FF8000">
		<ul class="pull-left">  
 
			<ul class="nav nav-tabs">
			     <li ><a href="UserDashboard.jsp"><b style="color:white"> User Profile </b></a></li> 
			       <li class="active"><a href="Questionnairre.jsp"><b style="color:#355c7d"> Take test</b></a></li> 
				
				<li><a href="ExploreSchools.jsp"><b style="color:white">Explore Schools</b></a></li>
				<li><a href="ExploreCourses.jsp"><b style="color:white">Explore Online Courses</b></a></li>   
				<li><a href="ExploreCareerCurriculum.jsp"><b style="color:white">Explore Career Curriculum</b></a></li>
                                <li><a href="ViewPreviousResults.jsp"><b style="color:white">View Test Scores</b></a></li>
				<li><a href="Feedback.jsp"><b style="color:white">Feedback</b></a></li>
	
			</ul>
		</ul>
	</div>

</br>

<a href="WriteParagraph.jsp"> <p style=" padding-left:120px;"><button class="btn btn-primary" type="button"  style="background-color:orange" name="Continue">BACK TO STEP1</button></p></a>

</br>
    <label for="textarea"><h2 style="color: #d74108;font-weight: 700;font-size:30px;  font-family: inherit; padding-left:120px;">Fill Questionnaire</h2></label></center>
<form style="padding-left: 100px" action="QuestionnaireServlet" method="post">
<div class="container-fluid">
<div id="riasec_wrapper">    
 
    <br/>
    <p><b>Read each statement. If you agree with the statement, select the checkbox.</b></p>
    
	<div id="left_box" style= "grid-column-align:center" >
            <table width="800" border="1" cellspacing="0" cellpadding="3" style="">
	    <tr>
	      <td style="padding-left: 5px" height="30" width="300" ><span id="tbl_text">1. I enjoy working on cars.</span></td>
	      <td width="30" align="center"><input type="checkbox" name="checkedRows"  id="chk_37" value="R" /></td>
	      <td width="30">&nbsp;</td>
	      <td width="30">&nbsp;</td>
	      <td width="30">&nbsp;</td>
	      <td width="30">&nbsp;</td>
	      <td width="30">&nbsp;</td>
        </tr>
	    <tr>
	      <td height="30" style="padding-left: 5px"><span id="tbl_text">2. Solving puzzles is a fun task for me.</span></td>
	      <td >&nbsp;</td>
	      <td align="center"><input type="checkbox" name="checkedRows" id="chk_2" value="I" /></td>
	      <td>&nbsp;</td>
	      <td>&nbsp;</td>
	      <td>&nbsp;</td>
	      <td>&nbsp;</td>
        </tr>
	    <tr>
	      <td height="30" style="padding-left: 5px"><span id="tbl_text">3. I enjoy working independently<br /></span>
	      <td >&nbsp;</td>
	      <td >&nbsp;</td>
	      <td align="center"><input type="checkbox" name="checkedRows" id="chk_3" value="A" /></td>
	      <td>&nbsp;</td>
	      <td>&nbsp;</td>
	      <td>&nbsp;</td>
        </tr>
	    <tr>
	      <td height="30" style="padding-left: 5px"><span id="tbl_text">4. I enjoy working in teams.</span></td>
	      <td >&nbsp;</td>
	      <td >&nbsp;</td>
	      <td >&nbsp;</td>
	      <td align="center"><input type="checkbox" id="chk_4" name="checkedRows" value="S" /></td>
	      <td>&nbsp;</td>
	      <td>&nbsp;</td>
        </tr>
	    <tr>
	      <td height="30" style="padding-left: 5px"><span id="tbl_text">5. I am a determined and goal-oriented person, I set goals for myself.<br /></span>					
	      <td >&nbsp;</td>
	      <td >&nbsp;</td>
	      <td >&nbsp;</td>
	      <td >&nbsp;</td>
	      <td align="center"><input type="checkbox" name="checkedRows" id="chk_5" value="E" /></td>
	      <td>&nbsp;</td>
        </tr>
	    <tr>
	      <td height="30" style="padding-left: 5px"><span id="tbl_text">6. I like to live in a systematic way and organize things well (files, desks/offices.)</span></td>
	      <td >&nbsp;</td>
	      <td >&nbsp;</td>
	      <td >&nbsp;</td>
	      <td >&nbsp;</td>
	      <td >&nbsp;</td>
	      <td align="center"><input type="checkbox" name="checkedRows" id="chk_6" value="C" /></td>
        </tr>
	    <tr>
	      <td height="30" style="padding-left: 5px"><span id="tbl_text">7. I like to build things from the scratch on my own.</span></td>
	      <td align="center"><input type="checkbox" name="checkedRows" id="chk_7" value="R" /></td>
	      <td>&nbsp;</td>
	      <td>&nbsp;</td>
	      <td>&nbsp;</td>
	      <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
	    <tr>
	      <td height="30" style="padding-left: 5px"><span id="tbl_text">8. I love reading related to art and music.</span></td>
	      <td >&nbsp;</td>
	      <td >&nbsp;</td>
	      <td align="center"><input type="checkbox"name="checkedRows" id="chk_8" value="A" /></td>
	      <td>&nbsp;</td>
	      <td>&nbsp;</td>
	      <td>&nbsp;</td>
        </tr>
	    <tr>
	      <td height="30" style="padding-left: 5px"><span id="tbl_text">9. I prefer being given clear instructions to follow</span></td>
	      <td >&nbsp;</td>
	      <td >&nbsp;</td>
	      <td >&nbsp;</td>
	      <td >&nbsp;</td>
	      <td >&nbsp;</td>
	      <td align="center"><input type="checkbox" name="checkedRows" id="chk_9" value="C" /></td>
        </tr>
	    <tr>
	      <td height="30" style="padding-left: 5px"><span id="tbl_text">10. I am good at convincing or persuading people.</span></td>
	      <td >&nbsp;</td>
	      <td >&nbsp;</td>
	      <td >&nbsp;</td>
	      <td >&nbsp;</td>
	      <td align="center"><input type="checkbox" name="checkedRows" id="chk_10" value="E" /></td>
	      <td>&nbsp;</td>
        </tr>
        
        
        <tr>
	      <td height="30" style="padding-left: 5px"><span id="tbl_text">11. I like to gain more knowledge by analyzing and experimenting.</span></td>
	      <td >&nbsp;</td>
	      <td align="center"><input type="checkbox" name="checkedRows" id="chk_11" value="I" /></td>
	      <td>&nbsp;</td>
	      <td>&nbsp;</td>
	      <td>&nbsp;</td>
	      <td>&nbsp;</td>
        </tr>
        <tr>
	      <td height="30" style="padding-left: 5px"><span id="tbl_text">12. I enjoy teaching and training people.</span></td>
	      <td >&nbsp;</td>
	      <td >&nbsp;</td>
          <td >&nbsp;</td>
	      <td align="center"><input type="checkbox" name="checkedRows"id="chk_12" value="S" /></td>
	      <td>&nbsp;</td>
	      <td>&nbsp;</td>
        </tr>
        <tr>
	      <td height="30" style="padding-left: 5px"><span id="tbl_text">13. I like to help people in solving their problems and issues.</span></td>
	      <td >&nbsp;</td>
	      <td >&nbsp;</td>
          <td >&nbsp;</td>
	      <td align="center"><input type="checkbox"name="checkedRows" id="chk_13" value="S" /></td>
	      <td>&nbsp;</td>
	      <td>&nbsp;</td>
        </tr>
        <tr>
	      <td height="30" style="padding-left: 5px"><span id="tbl_text">14. I enjoy taking care of animals.</span></td>
	      <td align="center"><input type="checkbox" name="checkedRows"id="chk_14" value="R" /></td>
	      <td>&nbsp;</td>
	      <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
	      <td height="30" style="padding-left: 5px"><span id="tbl_text">15. I won't have any issue in working 8 hours per day in an office.</span></td>
	      <td >&nbsp;</td>
	      <td >&nbsp;</td>
          <td >&nbsp;</td>
          <td >&nbsp;</td>
          <td >&nbsp;</td>
	      <td align="center"><input type="checkbox" name="checkedRows"id="chk_15" value="C" /></td>
        </tr>
        <tr>
	      <td height="30" style="padding-left: 5px"><span id="tbl_text">16. I am good at convincing people to buy things.</span></td>
	      <td >&nbsp;</td>
	      <td >&nbsp;</td>
          <td >&nbsp;</td>
          <td >&nbsp;</td>
          <td align="center"><input type="checkbox" name="checkedRows" id="chk_16" value="E" /></td>
          <td>&nbsp;</td>
        </tr>
        <tr>
	      <td height="30" style="padding-left: 5px"><span id="tbl_text">17. I enjoy imaginative writing.</span></td>
	      <td >&nbsp;</td>
	      <td >&nbsp;</td>
          <td align="center"><input type="checkbox" name="checkedRows"id="chk_17" value="A" /></td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
	      <td height="30" style="padding-left: 5px"><span id="tbl_text">18. I have interest in science and investigating about things.</span></td>
	      <td >&nbsp;</td>
          <td align="center"><input type="checkbox" name="checkedRows"id="chk_18" value="I" /></td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
	      <td height="30" style="padding-left: 5px"><span id="tbl_text">19. I handle new responsibilities efficiently.</span></td>
	      <td >&nbsp;</td>
	      <td >&nbsp;</td>
          <td >&nbsp;</td>
          <td >&nbsp;</td>
	      <td align="center"><input type="checkbox"name="checkedRows" id="chk_19" value="E" /></td>
          <td>&nbsp;</td>
        </tr>
        <tr>
	      <td height="30" style="padding-left: 5px"><span id="tbl_text">20. I like to provide a helping hand to people to heal.</span></td>
	      <td >&nbsp;</td>
	      <td >&nbsp;</td>
          <td >&nbsp;</td>
	      <td align="center"><input type="checkbox"name="checkedRows" id="chk_20" value="S" /></td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
	      <td height="30" style="padding-left: 5px"><span id="tbl_text">21. I enjoy trying to find out how things work.</span></td>
	      <td >&nbsp;</td>
	      <td align="center"><input type="checkbox"name="checkedRows" id="chk_21" value="I" /></td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
          <tr>
	      <td height="30" style="padding-left: 5px"><span id="Span1">22. I enjoy putting things together or assembling things.</span></td>
	      <td align="center"><input type="checkbox"name="checkedRows" id="chk_22" value="R" /></td>
	      <td>&nbsp;</td>
	      <td>&nbsp;</td>
	      <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
	      <td height="30" style="padding-left: 5px"><span id="Span3">23. I am an innovative person.</span></td>
	      <td >&nbsp;</td>
          <td >&nbsp;</td>
	      <td align="center"><input type="checkbox" name="checkedRows"id="chk_30" value="A" /></td>
	      <td>&nbsp;</td>
	      <td>&nbsp;</td>
	      <td>&nbsp;</td>
        </tr>
        <tr>
	      <td height="30" style="padding-left: 5px"><span id="Span4">24. I like to observe and pay attention to details.</span></td>
	      <td >&nbsp;</td>
          <td >&nbsp;</td>
          <td >&nbsp;</td>
          <td >&nbsp;</td>
          <td >&nbsp;</td>
	      <td align="center"><input type="checkbox"name="checkedRows" id="chk_24" value="C" /></td>
        </tr>
        <tr>
	      <td height="30" style="padding-left: 5px"><span id="Span5">25. I enjoy filing or typing.</span></td>
	      <td >&nbsp;</td>
          <td >&nbsp;</td>
          <td >&nbsp;</td>
          <td >&nbsp;</td>
          <td >&nbsp;</td>
	      <td align="center"><input type="checkbox" name="checkedRows"id="Checkbox1" value="C" /></td>
        </tr>
           <tr>
	      <td height="30" style="padding-left: 5px"><span id="Span7">26. I like to analyze things (problems/situations).</span></td>
          <td >&nbsp;</td>
	      <td align="center"><input type="checkbox"name="checkedRows" id="chk_26" value="I" /></td>
	      <td>&nbsp;</td>
	      <td>&nbsp;</td>
	      <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
	      <td height="30" style="padding-left: 5px"><span id="Span9">27. I take pleasure in playing instruments or singing.</span></td>
          <td >&nbsp;</td>
          <td >&nbsp;</td>
	      <td align="center"><input type="checkbox"name="checkedRows" id="chk_27" value="A" /></td>
	      <td>&nbsp;</td>
	      <td>&nbsp;</td>
	      <td>&nbsp;</td>
        </tr>
        <tr>
	      <td height="30" style="padding-left: 5px"><span id="Span11">28. I like to learn about and explore other cultures.</span></td>
          <td >&nbsp;</td>
          <td >&nbsp;</td>
          <td >&nbsp;</td>
	      <td align="center"><input type="checkbox"name="checkedRows" id="chk_28" value="S" /></td>
	      <td>&nbsp;</td>
	      <td>&nbsp;</td>
        </tr>
        <tr>
	      <td height="30" style="padding-left: 5px"><span id="Span13">29. I aim to initiate and set up my own business.</span></td>
          <td >&nbsp;</td>
          <td >&nbsp;</td>
          <td >&nbsp;</td>
          <td >&nbsp;</td>
	      <td align="center"><input type="checkbox"name="checkedRows" id="chk_29" value="E" /></td>
	      <td>&nbsp;</td>
        </tr>
        <tr>
	      <td height="30" style="padding-left: 5px"><span id="Span15">30. I enjoy making different meals.</span></td>
	      <td align="center"><input type="checkbox"name="checkedRows" id="chk_30" value="R" /></td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
	      <td height="30" style="padding-left: 5px"><span id="Span16">31. I enjoy acting in plays.</span></td>
          <td >&nbsp;</td>
          <td >&nbsp;</td>
	      <td align="center"><input type="checkbox" name="checkedRows"id="chk_31" value="A" /></td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
	      <td height="30" style="padding-left: 5px"><span id="Span17">32. I am a realistic and rational person.</span></td>
	      <td align="center"><input type="checkbox" name="checkedRows"id="chk_32" value="R" /></td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
	      <td height="30" style="padding-left: 5px"><span id="Span18">33. I enjoy playing around with numbers or charts.</span></td>
          <td >&nbsp;</td>
	      <td align="center"><input type="checkbox" name="checkedRows"id="chk_33" value="I" /></td>
	      <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
	      <td height="30" style="padding-left: 5px"><span id="Span20">34. I like discussing issues.</span></td>
          <td >&nbsp;</td>
          <td >&nbsp;</td>
          <td >&nbsp;</td>
	      <td align="center"><input type="checkbox" name="checkedRows"id="chk_34" value="S" /></td>
	      <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
	      <td height="30" style="padding-left: 5px"><span id="Span22">35. I am good at keeping track of my work.</span></td>
          <td >&nbsp;</td>
          <td >&nbsp;</td>
          <td >&nbsp;</td>
          <td >&nbsp;</td>
          <td >&nbsp;</td>
	      <td align="center"><input type="checkbox"name="checkedRows" id="chk_35" value="C" /></td>
        </tr>
        <tr>
	      <td height="30" style="padding-left: 5px"><span id="Span24">36. I like to take command and guide people.</span></td>
          <td >&nbsp;</td>
          <td >&nbsp;</td>
          <td >&nbsp;</td>
          <td >&nbsp;</td>
	      <td align="center"><input type="checkbox" name="checkedRows"id="chk_36" value="E" /></td>
          <td>&nbsp;</td>
        </tr>
        <tr>
	      <td height="30" style="padding-left: 5px"><span id="Span30">37. I like working outdoor or to do field work.</span></td>
	      <td align="center"><input type="checkbox"name="checkedRows" id="chk_37" value="R" /></td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
	      <td height="30" style="padding-left: 5px"><span id="Span26">38. I would prefer to work in an office.</span></td>
          <td >&nbsp;</td>
          <td >&nbsp;</td>
          <td >&nbsp;</td>
          <td >&nbsp;</td>
          <td >&nbsp;</td>
	      <td align="center"><input type="checkbox" name="checkedRows"id="chk_38" value="C" /></td>
        </tr>
        <tr>
	      <td height="30" style="padding-left: 5px"><span id="Span28">39. I'm efficient in solving mathematical problems.</span></td>
          <td >&nbsp;</td>
	      <td align="center"><input type="checkbox"name="checkedRows" id="chk_39" value="I" /></td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
	      <td height="30" style="padding-left: 5px"><span id="Span29">40. I take pleasure in helping people.</span></td>
          <td >&nbsp;</td>
          <td >&nbsp;</td>
          <td >&nbsp;</td>
	      <td align="center"><input type="checkbox" name="checkedRows"id="chk_40" value="S" /></td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
	      <td height="30" style="padding-left: 5px"><span id="Span30">41. I am good at sketching and drawing.</span></td>
          <td >&nbsp;</td>
          <td >&nbsp;</td>
	      <td align="center"><input type="checkbox"name="checkedRows" id="chk_41" value="A" /></td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
	      <td height="30" style="padding-left: 5px"><span id="Span31">42. I am good at delivering speeches.</span></td>
          <td >&nbsp;</td>
          <td >&nbsp;</td>
          <td >&nbsp;</td>
          <td >&nbsp;</td>
        <td align="center"><input type="checkbox"name="checkedRows" id="chk_42" value="E" /></td>
          <td>&nbsp;</td>
        </tr>

      </table>
  	</div>

    <br><center><input type="submit" style="background-color:orange" class="btn btn-primary" value="Check Results"></center>

        </form>
   
</div>
</div>
</div>
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
    		<center> <h7 style="color:orange">  Student Advisory</h7> <h7 style="color:white">&#169;2017</h7><a href="Terms.html">Terms and Conditions</a></center>
    	</div>
  	</div>
  </div>
</div>	
	

</body>

</html>