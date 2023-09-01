/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

