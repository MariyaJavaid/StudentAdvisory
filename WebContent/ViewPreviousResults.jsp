<html>  
<%@page import="Database.ConnectionManager"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<head>
  <title>Test Scores</title>
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


<%
 
      Connection currentCon = null;
      ResultSet resultSet= null; 
      Statement stmt = null;    
	
%>

<style>
    .row-padding {
    margin-top: 25px;
    margin-bottom: 5px;
}
</style>

<!------------------------DASHBOARD NAVIGATION BAR-------------------------------->

   <div class="container-fluid" style="background-color:#FF8000">
		<ul class="pull-left">  
 
			<ul class="nav nav-tabs">
			       <li><a href="UserDashboard.jsp"><b style="color:white"> User Profile </b></a></li> 
			       <li><a href="WriteParagraph.jsp"><b style="color:white"> Take test</b></a></li> 
				
				<li><a href="ExploreSchools.jsp"><b style="color:white">Explore Schools</b></a></li>
				<li><a href="ExploreCourses.jsp"><b style="color:white">Explore Online Courses</b></a></li>   
				<li><a href="ExploreCareerCurriculum.jsp"><b style="color:white">Explore Career Curriculum</b></a></li>
                                <li class="active"><a href="ViewPreviousResults.jsp"><b style="color:#355c7d"> View Test Scores </b></a></li>
				<li><a href="Feedback.jsp"><b style="color:white">Feedback</b></a></li>
	
			</ul>
		</ul>
	</div>


</br>

<div class="container">
    
    <h4>Your previous test results are as follows</h4>
    <br>
 
    <center>
<table   id="myTable" class="table-striped table-bordered table-sm"  style="border-radius: 5px ;column-width: 300px; border:2px;margin-right: 2px; margin-bottom:4px; padding-left: 2px">
<tr>
    
</tr>
	<tr bgcolor="#FF8000">
            <td style="height: 40px; text-align: center; width: 50%"><b>Suggested Career</b></td>
            <td style="height: 40px; text-align: center"><b>Date & Time</b></td>
		
	</tr>
   <%
	try{	
         String sql ="SELECT * FROM ViewCareer WHERE userid='" + u.getUsername() + "' order by testdate ";
         currentCon = ConnectionManager.getConnection();
         stmt=currentCon.createStatement();
         resultSet = stmt.executeQuery(sql);
         String link= null;       
                
		

		
		while(resultSet.next())
                {
   %>
		<tr bgcolor="#e6e6e6">
                    
                    <td style="padding: 5px 5px 5px 5px "><%=resultSet.getString("title") %></td>
			<td style="padding: 5px 5px 5px 5px "><%=resultSet.getString("testdate") %></td>
			
                      
                        
		</tr>
		            
	<%		
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
%>
</table></center>
</div>

</body>
</html>