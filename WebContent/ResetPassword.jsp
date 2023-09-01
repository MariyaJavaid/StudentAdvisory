<%-- 
    Document   : ResetPassword
    Created on : Jan 17, 2018, 11:39:13 AM
    Author     : owner
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reset Password</title>
        <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
       <script> 
                  function signup(){
                  
                  var fname = document.getElementById("firstname").value;
                  var lname = document.getElementById("lastname").value;
                  var emailid = document.getElementById("email").value;
                   var pass = document.getElementById("password").value;
                  var cpass = document.getElementById("cpassword").value;
                  
                  var gender = document.getElementById("optradio").value;
                  
                  
                   if(fname==""||lname==""||emailid==""||pass==""||cpass==""||gender=="")
                  {
                      var x = "Please fill all details";
                    document.getElementById("error").innerHTML = x;
                
                    
                    
                    return false;
                  }
                  
                  
              }
              
              
              
              
                  
              
</script>
            
    </head>
    <body>
         <!-----------------------------HEADER------------------------------------------>
 <div class="container-fluid">
 
  <h2 style="font-size:30px">
  <ul class="pull-left">
   <img src="https://image.flaticon.com/icons/svg/321/321828.svg" style="width:50px;height:50px;">
   <b style="color:#355c7d; font-family:Bernard MT Condensed;">Student</b> <b style="color:#ff5400;;font-family:Bernard MT Condensed">Advisory</b></h2> 
</ul>
</br>


</div>   
  
     
			
				<div class="modal-dialog">
					<!-- Modal content-->
					<div class="modal-content">
						<div class="modal-header">
							
                                                        <h4 class="modal-title"><center>Reset Password</center></h4>
						</div>
						<div class="modal-body">
							
				    <form name="myForm" id="signupform" class="form-horizontal" role="form" action="UpdatePasswordServlet">
						          
                                 
								   
				<div class="form-group">
                                    <label for="email" class="col-md-3 control-label">Email</label>
                                    <div class="col-md-9">
                                        <input type="email" class="form-control" name="email" id="email" placeholder="Email Address">
                                    </div>
                                </div>
                                <center><div size="2px" id="demo"style="color: red"></div></center>
                                <div class="form-group">
                                    <label for="password" class="col-md-3 control-label">Password</label>
                                    <div class="col-md-9">
                                        <input type="password" class="form-control" name="password" id="password" placeholder="Password">
                                    </div>
                                </div>
                                
				<div class="form-group">
                                    <label for="password" class="col-md-3 control-label">Confirm Password</label>
                                    <div class="col-md-9">
                                        <input type="password" class="form-control" name="cpassword" id="cpassword" placeholder="Password">
                                    </div>
                                </div>
								
												
                                <div style="margin-top:10px" class="form-group">
                                    <!-- Button -->
                                    <center>${error}</center>
                                    <center><p  id="error" style="color: red;size:2px"></p></center>
                                    <div class="col-sm-12 controls">
                                        <center> <button type="submit" onclick="signup()"style="background-color:orange"class="btn btn-primary"> Change Password</button>	</center>
								 

                                    </div>
                                </div>  
                              
                            </form>     


							
					
				</div> 
			

    </body>
</html>
