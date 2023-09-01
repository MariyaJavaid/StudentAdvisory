
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Signup</title>
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
                  
                  else
                  {
                  
                  var xhttp = new XMLHttpRequest(); 
                 var params = "firstname=" + fname + "&" +"lastname=" + lname + "&" +  "email=" + emailid+ "&" + "password=" + pass + "&" + "optradio=" + gender;
                  
        
                xhttp.onreadystatechange = function() 
                  {   if (xhttp.readyState == 4 && xhttp.status == 200)
                      
                      {     
                          if (this.responseText == " ")
                              location.href="EmailForm.jsp";
                        
                              
                          
                          document.getElementById("demo").innerHTML = this.responseText;    
                      }
                      
                      
                    };
                  xhttp.open("POST", "SignUpServlet", true); 
                  xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
                  xhttp.send(params);
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
        <center><img src="img\Icons\1.png" width="400" height="70"></center>
      <!-- SIGNUP MODAL -->
			
				<div class="modal-dialog">
					<!-- Modal content-->
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal">&times;</button>
                                                        <h4 class="modal-title"><center>Sign Up to Create an Account</center></h4>
						</div>
						<div class="modal-body">
							
								<form name="myForm" id="signupform" class="form-horizontal" role="form">
						          
                                   <div class="form-group">
                                    <label for="firstname" class="col-md-3 control-label">First Name</label>
                                    <div class="col-md-9">
                                    <input type="text" class="form-control" name="firstname" id="firstname" placeholder="First Name">
                                    </div>
                                    </div>
								   
								<div class="form-group">
                                    <label for="lastname" class="col-md-3 control-label">Last Name</label>
                                    <div class="col-md-9">
                                        <input type="text" class="form-control" name="lastname" id="lastname"placeholder="Last Name"> 
                                    </div>
                                </div>
								   
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
								
								<div class="form-group">
                                    <label for="gender" class="col-md-3 control-label">Gender</label>
                                    <div class="col-md-9">
										<div class="radio">
											<label><input type="radio" name="optradio" id="optradio" value="male" checked="checked">Male</label>
											<label><input type="radio" name="optradio" id="optradio" value="female">Female</label>
										</div>
									</div>
								</div>
								
								
								
							
								
                                <div style="margin-top:10px" class="form-group">
                                    <!-- Button -->
                                    <center><p  id="error" style="color: red;size:2px"></p></center>
                                    <div class="col-sm-12 controls">
                                        <center> <button type="button" onclick="signup()"style="background-color:orange"class="btn btn-primary"> Create Account</button>	</center>
								 
									 <center><h7>By clicking this button, you understand and agree to StudentAdvisory's <a href="Terms.html">Terms & Conditions</a></h7></center>

                                    </div>
                                </div>  
                              
                            </form>     


							
					
				</div> 
			

    </body>
</html>
