<%@page import="Database.ConnectionManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html>
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
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

<!------------------------DASHBOARD NAVIGATION BAR-------------------------------->

   <div class="container-fluid" style="background-color:#FF8000">
		<ul class="pull-left">  
                     <ul class="nav nav-tabs">
			     <li ><a href="UserDashboard.jsp"><b style="color:white"> User Profile </b></a></li> 
			       <li><a href="WriteParagraph.jsp"><b style="color:white"> Take test</b></a></li> 
				
				<li><a href="ExploreSchools.jsp"><b style="color:white">Explore Schools</b></a></li>
				<li><a href="ExploreCourses.jsp"><b style="color:white">Explore Online Courses</b></a></li>   
				<li class="active"><a href="ExploreCareerCurriculum.jsp"><b style="color:#355c7d">Explore Career Curriculum</b></a></li>
                                <li><a href="ViewPreviousResults.jsp"><b style="color:white">View Previous Results</b></a></li>
				<li><a href="Feedback.jsp"><b style="color:white">Feedback</b></a></li>
	
			</ul>
		</ul>
	</div>


</br>


<div class="container">
  <div class="panel-group">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h4 class="panel-title">
          <a data-toggle="collapse" href="#collapse1">Medical & Healthcare</a>
        </h4>
      </div>
      <div id="collapse1" class="panel-collapse collapse">
        <ul class="list-group">
          <li class="list-group-item"><div class="container">
                  <table   id="myTable"  class="table-striped table-bordered table-sm" style=" width:300px; border:2px;margin-right: 2px; padding-left: 2px">
                      <tr bgcolor="#DCDCDC">
                          <td><b>Image</b></td>
                          <td><b>TITLE</b></td>
                          <td><b>DESCRIPTION</b></td>
                          <td><b>PRIOR EXPERTISE</b></td>
                          <td><b>JOB INSIGHTS</b></td>
                      </tr>
                      
                      <%
                          try{	
                              String sql ="SELECT * FROM CareerCurriculum WHERE uprofession='Healthcare & Medical'";;
                              currentCon = ConnectionManager.getConnection();
                              stmt=currentCon.createStatement();
                              resultSet = stmt.executeQuery(sql);
                              String link= null;       
                              
                              while(resultSet.next())
                              {
                      %>
                      <tr bgcolor="#e6e6e6">
                        <td> <img src="<%=resultSet.getString("Img") %>"width="80" height="80" padding="5 5 5 5"></td>
			<td style="padding-right: 2px; padding-top: 2px"><%=resultSet.getString("title") %></td>
                        <td><%=resultSet.getString("description") %><br><a href="<%=resultSet.getString("link") %>">Read More..</a></td>
			<td><%=resultSet.getString("priorexpertise") %></td>
			<td><%=resultSet.getString("jobinsights") %></td>
                      </tr>
                      <%}
                        } catch (Exception e) {
                            e.printStackTrace();
                            }%>
                  </table>
              </div></li>
          
        </ul>
        
      </div>
    </div>
  </div>
</div>


 <!--------------------------------------------------------------->

<div class="container">
  <div class="panel-group">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h4 class="panel-title">
          <a data-toggle="collapse" href="#collapse2">Engineering & Industrial</a>
        </h4>
      </div>
      <div id="collapse2" class="panel-collapse collapse">
        <ul class="list-group">
          <li class="list-group-item"><div class="container">
                  
                  <table   id="myTable"  class="table-striped table-bordered table-sm"  style=" width:300px; border:2px;margin-right: 2px; padding-left: 2px">
                      <tr bgcolor="#DCDCDC">
                          <td><b>Image</b></td>
                          <td><b>TITLE</b></td>
                          <td><b>DESCRIPTION</b></td>
                          <td><b>PRIOR EXPERTISE</b></td>
                          <td><b>JOB INSIGHTS</b></td>
                      </tr>
                      
                      <%
                          try{	
                              String sql ="SELECT * FROM CareerCurriculum WHERE uprofession='Engineering & Industrial'";;
                              currentCon = ConnectionManager.getConnection();
                              stmt=currentCon.createStatement();
                              resultSet = stmt.executeQuery(sql);
                              String link= null;       
                              
                              while(resultSet.next())
                              {
                      %>
                      <tr bgcolor="#e6e6e6">
                        <td> <img src="<%=resultSet.getString("Img") %>"width="80" height="80" padding="5 5 5 5"></td>
			<td style="padding-right: 2px; padding-top: 2px"><%=resultSet.getString("title") %></td>
                        <td><%=resultSet.getString("description") %><br><a href="<%=resultSet.getString("link") %>">Read More..</a></td>
			<td><%=resultSet.getString("priorexpertise") %></td>
			<td><%=resultSet.getString("jobinsights") %></td>
                      </tr>
                      <%}
                        } catch (Exception e) {
                            e.printStackTrace();
                            }%>
                  </table>
              </div></li>
          
        </ul>
        
      </div>
    </div>
  </div>
</div>
                  

                  <!--------------------------------------------------------------->

<div class="container">
  <div class="panel-group">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h4 class="panel-title">
          <a data-toggle="collapse" href="#collapse3">Business, Commerce & Management</a>
        </h4>
      </div>
      <div id="collapse3" class="panel-collapse collapse">
        <ul class="list-group">
          <li class="list-group-item"><div class="container">
                  
                  <table   id="myTable"  class="table-striped table-bordered table-sm"  style=" width:300px ;column-width: 200px; border:2px;margin-right: 2px; padding-left: 2px">
                      <tr bgcolor="#DCDCDC">
                          <td><b>Image</b></td>
                          <td><b>TITLE</b></td>
                          <td><b>DESCRIPTION</b></td>
                          <td><b>PRIOR EXPERTISE</b></td>
                          <td><b>JOB INSIGHTS</b></td>
                      </tr>
                      
                      <%
                          try{	
                              String sql ="SELECT * FROM CareerCurriculum WHERE uprofession='Business, Commerce & Management'";;
                              currentCon = ConnectionManager.getConnection();
                              stmt=currentCon.createStatement();
                              resultSet = stmt.executeQuery(sql);
                              String link= null;       
                              
                              while(resultSet.next())
                              {
                      %>
                      <tr bgcolor="#e6e6e6">
                        <td> <img src="<%=resultSet.getString("Img") %>"width="80" height="80" padding="5 5 5 5"></td>
			<td style="padding-right: 2px; padding-top: 2px"><%=resultSet.getString("title") %></td>
                        <td><%=resultSet.getString("description") %><br><a href="<%=resultSet.getString("link") %>">Read More..</a></td>
			<td><%=resultSet.getString("priorexpertise") %></td>
			<td><%=resultSet.getString("jobinsights") %></td>
                      </tr>
                      <%}
                        } catch (Exception e) {
                            e.printStackTrace();
                            }%>
                  </table>
              </div></li>
          
        </ul>
        
      </div>
    </div>
  </div>
</div>
           
                  
                   <!--------------------------------------------------------------->

<div class="container">
  <div class="panel-group">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h4 class="panel-title">
          <a data-toggle="collapse" href="#collapse4">Arts, Literature & Entertainment</a>
        </h4>
      </div>
      <div id="collapse4" class="panel-collapse collapse">
        <ul class="list-group">
          <li class="list-group-item"><div class="container">
                 
                  <table   id="myTable"  class="table-striped table-bordered table-sm"  style=" width:300px ;column-width: 200px; border:2px;margin-right: 2px; padding-left: 2px">
                      <tr bgcolor="#DCDCDC">
                          <td><b>Image</b></td>
                          <td><b>TITLE</b></td>
                          <td><b>DESCRIPTION</b></td>
                          <td><b>PRIOR EXPERTISE</b></td>
                          <td><b>JOB INSIGHTS</b></td>
                      </tr>
                      
                      <%
                          try{	
                              String sql ="SELECT * FROM CareerCurriculum WHERE uprofession='Arts, Literature & Entertainment'";;
                              currentCon = ConnectionManager.getConnection();
                              stmt=currentCon.createStatement();
                              resultSet = stmt.executeQuery(sql);
                              String link= null;       
                              
                              while(resultSet.next())
                              {
                      %>
                      <tr bgcolor="#e6e6e6">
                        <td> <img src="<%=resultSet.getString("Img") %>"width="80" height="80" padding="5 5 5 5"></td>
			<td style="padding-right: 2px; padding-top: 2px"><%=resultSet.getString("title") %></td>
                        <td><%=resultSet.getString("description") %><br><a href="<%=resultSet.getString("link") %>">Read More..</a></td>
			<td><%=resultSet.getString("priorexpertise") %></td>
			<td><%=resultSet.getString("jobinsights") %></td>
                      </tr>
                      <%}
                        } catch (Exception e) {
                            e.printStackTrace();
                            }%>
                  </table>
              </div></li>
          
        </ul>
        
      </div>
    </div>
  </div>
</div>
                  

                  <!--------------------------------------------------------------->

<div class="container">
  <div class="panel-group">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h4 class="panel-title">
          <a data-toggle="collapse" href="#collapse5">Social Sciences</a>
        </h4>
      </div>
      <div id="collapse5" class="panel-collapse collapse">
        <ul class="list-group">
          <li class="list-group-item"><div class="container">
                 
                  <table   id="myTable"  class="table-striped table-bordered table-sm"  style=" width:300px ;column-width: 200px; border:2px;margin-right: 2px; padding-left: 2px">
                      <tr bgcolor="#DCDCDC">
                          <td><b>Image</b></td>
                          <td><b>TITLE</b></td>
                          <td><b>DESCRIPTION</b></td>
                          <td><b>PRIOR EXPERTISE</b></td>
                          <td><b>JOB INSIGHTS</b></td>
                      </tr>
                      
                      <%
                          try{	
                              String sql ="SELECT * FROM CareerCurriculum WHERE uprofession='Social Sciences'";;
                              currentCon = ConnectionManager.getConnection();
                              stmt=currentCon.createStatement();
                              resultSet = stmt.executeQuery(sql);
                              String link= null;       
                              
                              while(resultSet.next())
                              {
                      %>
                      <tr bgcolor="#e6e6e6">
                        <td> <img src="<%=resultSet.getString("Img") %>"width="80" height="80" padding="5 5 5 5"></td>
			<td style="padding-right: 2px; padding-top: 2px"><%=resultSet.getString("title") %></td>
                        <td><%=resultSet.getString("description") %><br><a href="<%=resultSet.getString("link") %>">Read More..</a></td>
			<td><%=resultSet.getString("priorexpertise") %></td>
			<td><%=resultSet.getString("jobinsights") %></td>
                      </tr>
                      <%}
                        } catch (Exception e) {
                            e.printStackTrace();
                            }%>
                  </table>
              </div></li>
          
        </ul>
        
      </div>
    </div>
  </div>
</div>
                  
                  
                  <!----------------------------------->
                  <!----------------------------------->
                  
                  
                  
<div class="container">
  <div class="panel-group">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h4 class="panel-title">
          <a data-toggle="collapse" href="#collapse6">Natural Sciences</a>
        </h4>
      </div>
      <div id="collapse6" class="panel-collapse collapse">
        <ul class="list-group">
          <li class="list-group-item"><div class="container">
                  
                  <table   id="myTable"  class="table-striped table-bordered table-sm"  style=" width:300px ;column-width: 200px; border:2px;margin-right: 2px; padding-left: 2px">
                      <tr bgcolor="#DCDCDC">
                          <td><b>Image</b></td>
                          <td><b>TITLE</b></td>
                          <td><b>DESCRIPTION</b></td>
                          <td><b>PRIOR EXPERTISE</b></td>
                          <td><b>JOB INSIGHTS</b></td>
                      </tr>
                      
                      <%
                          try{	
                              String sql ="SELECT * FROM CareerCurriculum WHERE uprofession='Natural Sciences'";;
                              currentCon = ConnectionManager.getConnection();
                              stmt=currentCon.createStatement();
                              resultSet = stmt.executeQuery(sql);
                              String link= null;       
                              
                              while(resultSet.next())
                              {
                      %>
                      <tr bgcolor="#e6e6e6">
                        <td> <img src="<%=resultSet.getString("Img") %>"width="80" height="80" padding="5 5 5 5"></td>
			<td style="padding-right: 2px; padding-top: 2px"><%=resultSet.getString("title") %></td>
                        <td><%=resultSet.getString("description") %><br><a href="<%=resultSet.getString("link") %>">Read More..</a></td>
			<td><%=resultSet.getString("priorexpertise") %></td>
			<td><%=resultSet.getString("jobinsights") %></td>
                      </tr>
                      <%}
                        } catch (Exception e) {
                            e.printStackTrace();
                            }%>
                  </table>
              </div></li>
          
        </ul>
        
      </div>
    </div>
  </div>
</div>


 <!--------------------------------------------------------------->

<div class="container">
  <div class="panel-group">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h4 class="panel-title">
          <a data-toggle="collapse" href="#collapse7">Sports and Recreation</a>
        </h4>
      </div>
      <div id="collapse7" class="panel-collapse collapse">
        <ul class="list-group">
          <li class="list-group-item"><div class="container">
                  
                  <table   id="myTable"  class="table-striped table-bordered table-sm"  style=" width:300px ;column-width: 200px; border:2px;margin-right: 2px; padding-left: 2px">
                      <tr bgcolor="#DCDCDC">
                          <td><b>Image</b></td>
                          <td><b>TITLE</b></td>
                          <td><b>DESCRIPTION</b></td>
                          <td><b>PRIOR EXPERTISE</b></td>
                          <td><b>JOB INSIGHTS</b></td>
                      </tr>
                      
                      <%
                          try{	
                              String sql ="SELECT * FROM CareerCurriculum WHERE uprofession='Sports and Recreation'";;
                              currentCon = ConnectionManager.getConnection();
                              stmt=currentCon.createStatement();
                              resultSet = stmt.executeQuery(sql);
                              String link= null;       
                              
                              while(resultSet.next())
                              {
                      %>
                      <tr bgcolor="#e6e6e6">
                        <td> <img src="<%=resultSet.getString("Img") %>"width="80" height="80" padding="5 5 5 5"></td>
			<td style="padding-right: 2px; padding-top: 2px"><%=resultSet.getString("title") %></td>
                        <td><%=resultSet.getString("description") %><br><a href="<%=resultSet.getString("link") %>">Read More..</a></td>
			<td><%=resultSet.getString("priorexpertise") %></td>
			<td><%=resultSet.getString("jobinsights") %></td>
                      </tr>
                      <%}
                        } catch (Exception e) {
                            e.printStackTrace();
                            }%>
                  </table>
              </div></li>
          
        </ul>
        
      </div>
    </div>
  </div>
</div>
                  

                  <!--------------------------------------------------------------->

<div class="container">
  <div class="panel-group">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h4 class="panel-title">
          <a data-toggle="collapse" href="#collapse8">Technology & Computing</a>
        </h4>
      </div>
      <div id="collapse8" class="panel-collapse collapse">
        <ul class="list-group">
          <li class="list-group-item"><div class="container">
                  
                  <table   id="myTable"  class="table-striped table-bordered table-sm"  style=" width:300px ;column-width: 200px; border:2px;margin-right: 2px; padding-left: 2px">
                      <tr bgcolor="#DCDCDC">
                          <td><b>Image</b></td>
                          <td><b>TITLE</b></td>
                          <td><b>DESCRIPTION</b></td>
                          <td><b>PRIOR EXPERTISE</b></td>
                          <td><b>JOB INSIGHTS</b></td>
                      </tr>
                      
                      <%
                          try{	
                              String sql ="SELECT * FROM CareerCurriculum WHERE uprofession='Technology & Computing'";;
                              currentCon = ConnectionManager.getConnection();
                              stmt=currentCon.createStatement();
                              resultSet = stmt.executeQuery(sql);
                              String link= null;       
                              
                              while(resultSet.next())
                              {
                      %>
                      <tr bgcolor="#e6e6e6">
                        <td> <img src="<%=resultSet.getString("Img") %>"width="80" height="80" padding="5 5 5 5"></td>
			<td style="padding-right: 2px; padding-top: 2px"><%=resultSet.getString("title") %></td>
                        <td><%=resultSet.getString("description") %><br><a href="<%=resultSet.getString("link") %>">Read More..</a></td>
			<td><%=resultSet.getString("priorexpertise") %></td>
			<td><%=resultSet.getString("jobinsights") %></td>
                      </tr>
                      <%}
                        } catch (Exception e) {
                            e.printStackTrace();
                            }%>
                  </table>
              </div></li>
          
        </ul>
        
      </div>
    </div>
  </div>
</div>
           
                  
                   <!--------------------------------------------------------------->

<div class="container">
  <div class="panel-group">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h4 class="panel-title">
          <a data-toggle="collapse" href="#collapse9">Architecture, Planning & Environmental Design</a>
        </h4>
      </div>
      <div id="collapse9" class="panel-collapse collapse">
        <ul class="list-group">
          <li class="list-group-item"><div class="container">
                  
                  <table   id="myTable"  class="table-striped table-bordered table-sm"  style=" width:300px ;column-width: 200px; border:2px;margin-right: 2px; padding-left: 2px">
                      <tr bgcolor="#DCDCDC">
                          <td><b>Image</b></td>
                          <td><b>TITLE</b></td>
                          <td><b>DESCRIPTION</b></td>
                          <td><b>PRIOR EXPERTISE</b></td>
                          <td><b>JOB INSIGHTS</b></td>
                      </tr>
                      
                      <%
                          try{	
                              String sql ="SELECT * FROM CareerCurriculum WHERE uprofession='Architecture, Planning & Environmental Design'";;
                              currentCon = ConnectionManager.getConnection();
                              stmt=currentCon.createStatement();
                              resultSet = stmt.executeQuery(sql);
                              String link= null;       
                              
                              while(resultSet.next())
                              {
                      %>
                      <tr bgcolor="#e6e6e6">
                        <td> <img src="<%=resultSet.getString("Img") %>"width="80" height="80" padding="5 5 5 5"></td>
			<td style="padding-right: 2px; padding-top: 2px"><%=resultSet.getString("title") %></td>
                        <td><%=resultSet.getString("description") %><br><a href="<%=resultSet.getString("link") %>">Read More..</a></td>
			<td><%=resultSet.getString("priorexpertise") %></td>
			<td><%=resultSet.getString("jobinsights") %></td>
                      </tr>
                      <%}
                        } catch (Exception e) {
                            e.printStackTrace();
                            }%>
                  </table>
              </div></li>
          
        </ul>
        
      </div>
    </div>
  </div>
</div>
                  

                  <!--------------------------------------------------------------->

<div class="container">
  <div class="panel-group">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h4 class="panel-title">
          <a data-toggle="collapse" href="#collapse10">Communications</a>
        </h4>
      </div>
      <div id="collapse10" class="panel-collapse collapse">
        <ul class="list-group">
          <li class="list-group-item"><div class="container">
                  
                  <table   id="myTable"  class="table-striped table-bordered table-sm"  style=" width:300px ;column-width: 200px; border:2px;margin-right: 2px; padding-left: 2px">
                      <tr bgcolor="#DCDCDC">
                          <td><b>Image</b></td>
                          <td><b>TITLE</b></td>
                          <td><b>DESCRIPTION</b></td>
                          <td><b>PRIOR EXPERTISE</b></td>
                          <td><b>JOB INSIGHTS</b></td>
                      </tr>
                      
                      <%
                          try{	
                              String sql ="SELECT * FROM CareerCurriculum WHERE uprofession='Communications'";;
                              currentCon = ConnectionManager.getConnection();
                              stmt=currentCon.createStatement();
                              resultSet = stmt.executeQuery(sql);
                              String link= null;       
                              
                              while(resultSet.next())
                              {
                      %>
                      <tr bgcolor="#e6e6e6">
                        <td> <img src="<%=resultSet.getString("Img") %>"width="80" height="80" padding="5 5 5 5"></td>
			<td style="padding-right: 2px; padding-top: 2px"><%=resultSet.getString("title") %></td>
                        <td><%=resultSet.getString("description") %><br><a href="<%=resultSet.getString("link") %>">Read More..</a></td>
			<td><%=resultSet.getString("priorexpertise") %></td>
			<td><%=resultSet.getString("jobinsights") %></td>
                      </tr>
                      <%}
                        } catch (Exception e) {
                            e.printStackTrace();
                            }%>
                  </table>
              </div></li>
          
        </ul>
        
      </div>
    </div>
  </div>
</div>
                  
                  
                                    <!--------------------------------------------------------------->

<div class="container">
  <div class="panel-group">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h4 class="panel-title">
          <a data-toggle="collapse" href="#collapse11">Education</a>
        </h4>
      </div>
      <div id="collapse11" class="panel-collapse collapse">
        <ul class="list-group">
          <li class="list-group-item"><div class="container">
                <table   id="myTable"  class="table-striped table-bordered table-sm"  style=" width:300px ;column-width: 200px; border:2px;margin-right: 2px; padding-left: 2px">
                      <tr bgcolor="#DCDCDC">
                          <td><b>Image</b></td>
                          <td><b>TITLE</b></td>
                          <td><b>DESCRIPTION</b></td>
                          <td><b>PRIOR EXPERTISE</b></td>
                          <td><b>JOB INSIGHTS</b></td>
                      </tr>
                      
                      <%
                          try{	
                              String sql ="SELECT * FROM CareerCurriculum WHERE uprofession='Education'";;
                              currentCon = ConnectionManager.getConnection();
                              stmt=currentCon.createStatement();
                              resultSet = stmt.executeQuery(sql);
                              String link= null;       
                              
                              while(resultSet.next())
                              {
                      %>
                      <tr bgcolor="#e6e6e6">
                        <td> <img src="<%=resultSet.getString("Img") %>"width="80" height="80" padding="5 5 5 5"></td>
			<td style="padding-right: 2px; padding-top: 2px"><%=resultSet.getString("title") %></td>
                        <td><%=resultSet.getString("description") %><br><a href="<%=resultSet.getString("link") %>">Read More..</a></td>
			<td><%=resultSet.getString("priorexpertise") %></td>
			<td><%=resultSet.getString("jobinsights") %></td>
                      </tr>
                      <%}
                        } catch (Exception e) {
                            e.printStackTrace();
                            }%>
                  </table>
              </div></li>
          
        </ul>
        
      </div>
    </div>
  </div>
</div>
  
                  
                                        <!--------------------------------------------------------------->

<div class="container">
  <div class="panel-group">
    <div class="panel panel-default">
      <div class="panel-heading">
        <h4 class="panel-title">
          <a data-toggle="collapse" href="#collapse12">Law & Public Policy</a>
        </h4>
      </div>
      <div id="collapse12" class="panel-collapse collapse">
        <ul class="list-group">
          <li class="list-group-item"><div class="container">
                  
                  <table   id="myTable"  class="table-striped table-bordered table-sm"  style=" width:300px ;column-width: 200px; border:2px;margin-right: 2px; padding-left: 2px">
                      <tr bgcolor="#DCDCDC">
                          <td><b>Image</b></td>
                          <td><b>TITLE</b></td>
                          <td><b>DESCRIPTION</b></td>
                          <td><b>PRIOR EXPERTISE</b></td>
                          <td><b>JOB INSIGHTS</b></td>
                      </tr>
                      
                      <%
                          try{	
                              String sql ="SELECT * FROM CareerCurriculum WHERE uprofession='Law & Public Policy'";;
                              currentCon = ConnectionManager.getConnection();
                              stmt=currentCon.createStatement();
                              resultSet = stmt.executeQuery(sql);
                              String link= null;       
                              
                              while(resultSet.next())
                              {
                      %>
                      <tr bgcolor="#e6e6e6">
                        <td> <img src="<%=resultSet.getString("Img") %>"width="80" height="80" padding="5 5 5 5"></td>
			<td style="padding-right: 2px; padding-top: 2px"><%=resultSet.getString("title") %></td>
                        <td><%=resultSet.getString("description") %><br><a href="<%=resultSet.getString("link") %>">Read More..</a></td>
			<td><%=resultSet.getString("priorexpertise") %></td>
			<td><%=resultSet.getString("jobinsights") %></td>
                      </tr>
                      <%}
                        } catch (Exception e) {
                            e.printStackTrace();
                            }%>
                  </table>
              </div></li>
          
        </ul>
        
      </div>
    </div>
  </div>
</div>             
                                 
                  
</body>
</html>
