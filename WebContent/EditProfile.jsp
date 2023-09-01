<!DOCTYPE html>
<html lang="en">
<head>
  <title>Edit Profile</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
     <link href="https://fortawesome.github.io/Font-Awesome/assets/font-awesome/css/font-awesome.css" rel="stylesheet">
  <link rel="stylesheet" href="css/homepage.css">
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
</ul>    
</div>
<!-----------------------------EDIT PROFILE FORM-------------------------------------->
<div class="SignUpForm" >
    <div class="container-fluid" >    
        <div id="signupbox" style="margin-top:10px;" class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">                    
            <div class="panel panel-info" >
                    <div class="panel-heading" style="background-color:#355c7d;color:white">
                        <div class="panel-title"><center>Edit Profile</center></div>
                    </div>     
                </br></br>
                    <div style="padding-top:5px" class="panel-body" >

                        <div style="display:none" id="signup-alert" class="alert alert-danger col-sm-12"></div>
                            
                         <form action="EditProfileServlet" class="form-horizontal" role="form" method="post">
						          
                                   <div class="form-group">
                                    <label for="firstname" class="col-md-3 control-label">First Name</label>
                                    <div class="col-md-9">
                                    <input type="text" class="form-control" name="firstname" value="<%out.println(u.getFirstName());%>">
                                    </div>
                                    </div>
								   
								<div class="form-group">
                                    <label for="lastname" class="col-md-3 control-label">Last Name</label>
                                    <div class="col-md-9">
                                        <input type="text" class="form-control" name="lastname" value="<%out.println(u.getLastName());%>">
                                    </div>
                                </div>
								   
								
                                
                                <div class="form-group">
                                    <label for="password" class="col-md-3 control-label">Password</label>
                                    <div class="col-md-9">
                                        <input type="password" class="form-control" name="password" value="<%out.println(u.getPassword());%>">
                                    </div>
                                </div>
                                
								<div class="form-group">
                                    <label for="password" class="col-md-3 control-label">Confirm Password</label>
                                    <div class="col-md-9">
                                        <input type="password" class="form-control" name="cpassword" value="<%out.println(u.getPassword());%>">
                                    </div>
                                </div>
								
								<div class="form-group">
                                    <label for="password" class="col-md-3 control-label">Gender</label>
                                    <div class="col-md-9">
										<div class="radio">
											<label><input type="radio" name="optradio" value="male" checked="checked">Male</label>
										</div>
										<div class="radio">
											<label><input type="radio" name="optradio" value="female">Female</label>
										</div>
									</div>
								</div>
								
                                <div style="margin-top:10px" class="form-group">
                                    <!-- Button -->

                                    <div class="col-sm-12 controls">
                                     <center><input type="submit" style="background-color:orange" class="btn btn-primary" value="Save">
									
									

                                    </div>
                                </div>


                               
                              
                            </form>     

                        <center>  <a href="UserDashboard.jsp"><button type="button"style="background-color:orangered"class="btn btn-primary">Cancel</button></a>
									 </center>
									 

                        </div>                     
                    </div>  
        </div>
   </div>
  <!---------------------------------------------------------------------------------------------------------------------->      
</body>
</html>