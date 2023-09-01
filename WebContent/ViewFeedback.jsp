<html>  
<%@page import="Database.ConnectionManager"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<head>
  <title>View Feedback</title>
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
			       <li><a href="AdminDashboard.jsp"><b style="color:white"> Admin Profile </b></a></li> 
			       <li class="active"><a href="ViewFeedback.jsp"><b style="color:#355c7d"> View Feedback</b></a></li> 
				
				
			</ul>
		</ul>
	</div>


</br>

<div class="container">
    
    <br>
 
    <center>
<table   id="myTable" class="table-striped table-bordered table-sm"  style="border-radius: 5px ;column-width: 300px; border:2px;margin-right: 2px; margin-bottom:4px; padding-left: 2px">
<tr>
    
</tr>
	<tr bgcolor="#FF8000">
            <td style="height: 40px; text-align: center; width: 50%"><b>Userid</b></td>
            <td style="height: 40px; text-align: center"><b>Rate</b></td>
	<td style="height: 40px; text-align: center"><b>Comment</b></td>
	</tr>
   <%
	try{	
         String sql ="SELECT * FROM feedback";
         currentCon = ConnectionManager.getConnection();
         stmt=currentCon.createStatement();
         resultSet = stmt.executeQuery(sql);
         String link= null;       
                
		

		
		while(resultSet.next())
                {
   %>
		<tr bgcolor="#e6e6e6">
                    
                        <td style="padding: 5px 5px 5px 5px "><%=resultSet.getString("Userid") %></td>
			<td style="padding: 5px 5px 5px 5px "><%=resultSet.getString("rate") %></td>
			<td style="padding: 5px 5px 5px 5px "><%=resultSet.getString("comment") %></td>
                      
                        
		</tr>
		            
	<%		
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
%>
</table></center>
</div>
</br>
</br>
</br>
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