/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


      
                  function loadDoc() {
                  var xhttp = new XMLHttpRequest(); 
                  var emailid = document.getElementById("email").value;
                  var pass = document.getElementById("password").value;
               
                   if(emailid==""||pass=="")
                  {
                      var x = "Please input all details";
                    document.getElementById("error1").innerHTML = x;
                
                    
                    
                    return false;
                  }
                  
                  var params = "email=" + emailid + "&" + "password=" + pass;
                  xhttp.onreadystatechange = function() 
                  {   if (xhttp.readyState == 4 && xhttp.status == 200)
                      
                      {     
                          if (this.responseText == "User")
                              location.href="UserDashboard.jsp";
                          else if (this.responseText == "Admin")
                               location.href="AdminDashboard.jsp";
                           else if (this.responseText == "SuperAdmin")
                               location.href="SuperAdminDashboard.jsp";
                              
                          
                          document.getElementById("error1").innerHTML = this.responseText;    
                      }
                      
                      
                    };
                  xhttp.open("POST", "LoginServlet", true); 
                  xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
                  xhttp.send(params);
              }
              
