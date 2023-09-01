<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="language" value="${not empty param.language ? param.language : not empty language ? language : pageContext.request.locale}" scope="session" />
<fmt:setLocale value="${language}" />
<fmt:setBundle basename="com.ibm.cloudoe.samples.i18n.messages" />

<!DOCTYPE html>
<html lang="${language}">
<head>
<title><fmt:message key="application.title" /></title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link href="https://fortawesome.github.io/Font-Awesome/assets/font-awesome/css/font-awesome.css" rel="stylesheet">
<link rel="shortcut icon" href="img/favicon.ico" type="image/x-icon">
<link rel="icon" href="img/favicon.ico" type="image/x-icon">
<link rel="stylesheet" href="css/watson-bootstrap-dark.css">
<link rel="stylesheet" href="css/style.css">
 <script>
function ValidationEvent() {
    var value = document.getElementById("demo").value;
        if(value!=''){
           
             return true;   // Returns Value
        }
alert("Please finish step 1 first");
return false;
}
</script>
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


            <a href="Logout.jsp">  <button type="button"style="background-color:orange"class="btn btn-primary"><span class="glyphicon glyphicon-log-out"></span>Log Out</button></a>						
							
</ul>        
</div>




<!---------------------------NAVIGATION--------------------------------------->

<div class="container-fluid" style="background-color:#FF8000">
		<ul class="pull-left">  
 
			<ul class="nav nav-tabs">
			     <li><a href="UserDashboard.jsp"><b style="color:white"> User Profile </b></a></li> 
			       <li class="active"><a href="WriteParagraph.jsp"><b style="color:#355c7d"> Take test</b></a></li> 
				
				<li><a href="ExploreSchools.jsp"><b style="color:white">Explore Schools</b></a></li>
				<li><a href="ExploreCourses.jsp"><b style="color:white">Explore Online Courses</b></a></li>   
				<li><a href="ExploreCareerCurriculum.jsp"><b style="color:white">Explore Career Curriculum</b></a></li>
                                <li><a href="ViewPreviousResults.jsp"><b style="color:white">View Test Scores</b></a></li>
				<li><a href="Feedback.jsp"><b style="color:white"> Feedback</b></a></li>
	
			</ul>
		</ul>
	</div>

</br>
<!------------------------------------------------------------------------->
	<div class="container">
		<div class="row">
			<div class="col-lg-6 col-md-12 col-xs-12">
				<h2><fmt:message key="application.input.title"/></h2>
				<p><fmt:message key="application.warning.minimumRecommendedWarning"/></p>                               
                <p><fmt:message key="application.warning.selfReflectiveText"/></p>
				<div class="well">
					<div class="form-group row">
						<div style="padding: 0px;" class="col-lg-12 col-xs-12">
							<label class="col-lg-6 col-md-6 col-xs-6 control-label"><fmt:message key="application.label.chooseLanguage"/>:</label>
							<div class="col-lg-6 col-md-6 col-xs-6 sample-radio-list">
								<div class="sample-radio-container">
									<label><input id="english_radio" type="radio"
										name="sample_text" value="en" checked class="sample-radio"><fmt:message key="application.label.english"/></label>
								</div>
							
							</div>
							<textarea rows="12" required="true" name="text"
								placeholder="<fmt:message key="application.input.placeHolder"/>"
								class="content form-control"></textarea>
							<div class="text-right inputFootnote">
								<span class="wordsCount"></span> <span class="small"></span><fmt:message key="application.label.words"/></span>
							</div>
						</div>
					</div>
					<div style="display: none; margin-bottom: 10px;"
						class="form-group row captcha">
						<div data-sitekey="6LcRbQkTAAAAAGUFVbnuqDfse-XZASLZwoC34oJV"
							class="col-lg-12 col-md-12 col-xs-12 g-recaptcha"></div>
					</div>
					<div class="form-group row buttons-container">
						<div class="col-lg-4 col-xs-4">
							<button type="button" class="btn btn-block clear-btn"><fmt:message key="application.input.clear"/></button>
						</div>
						<div class="col-lg-4 col-lg-push-4 col-xs-4 col-xs-push-4">
							<button type="button" class="btn btn-block analysis-btn"><fmt:message key="application.input.analyze"/></button>
						</div>
					</div>
				</div>
			</div>
			<div class="col-lg-6 col-md-12 col-xs-12">
				<div style="display: none;"
					class="form-group row loading text-center loading">
					<h2>&nbsp;</h2>
					<img src="img/watson.gif">
				</div>
				<div style="display: none;" class="form-group row error">
					<h2>&nbsp;</h2>
					<div class="well">
						<p class="errorMsg"></p>
					</div>
				</div>
				<div style="display: none;" class="results">
					<h2><fmt:message key="application.label.yourPersonality"/>*</h2>
					<div class="well">
						<div class="summary-div"></div>
						<div style="color: gray" class="text-right">
							<em class="small">*<fmt:message key="application.label.comparedFootnote"/></em>
						</div>
						<div style="color: gray" class="text-right">
							<em class="small outputWordCountMessage"></em>
						</div>
					</div>
				</div>
			</div>
			<div style="display: none;" class="results">
				<div class="row">
					<div class="col-lg-5 col-md-12 col-xs-12">
						<h3><fmt:message key="application.label.personalityData"/></h3>
						<div style="display: none;" class="col555px well traits"></div>
					</div>
					<div class="col-lg-7 col-xs-12 col-md-12">
						<h3><fmt:message key="application.label.personalityVisualizationData"/></h3>
						<div id="vizcontainer" class="well"></div>
					</div>
				</div>
			</div>
			<div class="hidden">
				<div id="header-template">
					<div class="row theader">
						<div class="col-lg-5 col-xs-5">
							<span><fmt:message key="application.label.name"/></span>
						</div>
						<div class="col-lg-7 col-xs-7 text-right">
							<span><fmt:message key="application.label.value"/> ± <fmt:message key="application.label.samplingError"/></span>
						</div>
					</div>
				</div>
				<div id="trait-template">
					<div class="row">
						<div class="tname col-lg-7 col-xs-7">
							<span></span>
						</div>
						<div class="tvalue col-lg-5 col-xs-5 text-right">
							<span></span>
						</div>
					</div>
				</div>
				<div id="model-template">
					<div class="row">
						<div class="col-lg-12 col-xs-12 text-center">
							<span></span>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
                                                
 
	<script type="text/javascript" src="js/jquery-1.11.1.min.js"></script>
	<script type="text/javascript" src="js/d3.v2.min.js"></script>
	<script type="text/javascript" src="js/demo.js"></script>
	<script type="text/javascript" src="js/personality.js"></script>
        <script type="text/javascript" src="js/string-utils.js"></script>
    <script type="text/javascript" src="js/i18n.js"></script>
	<script type="text/javascript" src="js/textsummary.js"></script>
    <script type="text/javascript">
        textSummary.init('json');
    </script>
     
    
    
    <form  action="ParagraphServlet" method="post" onsubmit="return ValidationEvent()">
   <input type="hidden" id="demo" name="personalitytraits"><br>
   <center><p  id="error" style="color: red;size:3px"></p></center>
   <center>  <button class="btn btn-primary" type="submit"  style="background-color:orange" name="Continue">CONTINUE TO STEP2</button></center>
    </form>
    
</body>
</html>