/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;
import Model.Big5;
import Model.Needs;
import Model.RIASEC;
import Model.UserBean;
import Model.Values;
   import java.sql.*;

/**
 *
 * @author owner
 */
public class DAO {
    static Connection currentCon = null;
      static ResultSet rs = null; 
    
         public static UserBean login(UserBean bean) {
	
         //preparing some objects for connection 
         Statement stmt = null;    
	
         String username = bean.getUsername();    
         String password = bean.getPassword();   
	    
         String searchQuery =
               "select * from users where email='"
                        + username
                        + "' AND pass='"
                        + password
                        + "'";
	    
      // "System.out.println" prints in the console; Normally used to trace the process
      System.out.println("Your user name is " + username);          
      System.out.println("Your password is " + password);
      System.out.println("Query: "+searchQuery);
	    
      try 
      {
         //connect to DB 
         currentCon = ConnectionManager.getConnection();
         stmt=currentCon.createStatement();
         rs = stmt.executeQuery(searchQuery);	        
         boolean more = rs.next();
	       
         // if user does not exist set the isValid variable to false
         if (!more) 
         {
            System.out.println("Sorry, you are not a registered user! Please sign up first");
            bean.setValid(false);
         } 
	        
         //if user exists set the isValid variable to true
         else if (more) 
         {
            String firstName = rs.getString("fname");
            String lastName = rs.getString("lname");
            String gender=rs.getString("gender");
            String type=rs.getString("utype");
	     	
            System.out.println("Welcome " + firstName);
            System.out.println(type);
            bean.setFirstName(firstName);
            bean.setLastName(lastName);
            bean.setGender(gender);
            bean.setValid(true);
            if(type.equalsIgnoreCase("ad"))
            bean.setType(0);
            else if(type.equalsIgnoreCase("sa"))
                bean.setType(1);
            else if(type.equalsIgnoreCase("pu"))
                bean.setType(2);
         }
      } 

      catch (Exception ex) 
      {
         System.out.println("Log In failed: An Exception has occurred! " + ex);
      } 
	    
      //some exception handling
      finally 
      {
         if (rs != null)	{
            try {
               rs.close();
            } catch (Exception e) {}
               rs = null;
            }
	
         if (stmt != null) {
            try {
               stmt.close();
            } catch (Exception e) {}
               stmt = null;
            }
	
         if (currentCon != null) {
            try {
               currentCon.close();
            } catch (Exception e) {
            }

            currentCon = null;
         }
      }

return bean;
	
      }	

    public static UserBean signup(UserBean bean) {
	
         //preparing some objects for connection 
         Statement stmt = null;    
	
         String fname = bean.getFirstName();
         String lname = bean.getLastName();
         String username = bean.getUsername();    
         String password = bean.getPassword();
         String gender  = bean.getGender();
  
	    
         String searchQuery =
             ("insert into Users values(?,?,?,?,?,?)");

	    
      // "System.out.println" prints in the console; Normally used to trace the process
      System.out.println("Your user name is " + username);          
      System.out.println("Your password is " + password);
      System.out.println("Query: "+searchQuery);
	    
      try 
      {
         //connect to DB 
          //preparing some objects for connection 
        PreparedStatement ps =  null;  

         currentCon = ConnectionManager.getConnection();
         
        ps = currentCon.prepareStatement(searchQuery);
        
         ps.setString(1, fname);
         ps.setString(2, lname);
         ps.setString(3, username);
         ps.setString(4, password);
         ps.setString(5, gender);
         ps.setString(6, "pu");  
         ps.executeUpdate();
        
         bean.setValid(true);
        
  
      }
      catch (Exception ex) 
      {
         System.out.println("Signup failed: An Exception has occurred! " + ex);
          bean.setValid(false);
      } 
	    
      //some exception handling
      finally 
      {
         if (rs != null)	{
            try {
               rs.close();
            } catch (Exception e) {}
               rs = null;
            }
	
         if (stmt != null) {
            try {
               stmt.close();
            } catch (Exception e) {}
               stmt = null;
            }
	
         if (currentCon != null) {
            try {
               currentCon.close();
            } catch (Exception e) {
            }

            currentCon = null;
         }
      }

return bean;
	
      }	

    public static UserBean updateProfile(UserBean bean) {
        Statement stmt = null;    
	
         String fname = bean.getFirstName();
         String lname = bean.getLastName();
         String username = bean.getUsername();    
         String password = bean.getPassword();
         String gender  = bean.getGender();
  
	    
         String searchQuery =
             ("UPDATE Users SET fname= '"+bean.getFirstName()+"',lname='"+bean.getLastName()+"',pass='"+bean.getPassword()+"',gender='"+bean.getGender()+"' where email= '" + bean.getUsername() + "'");


	    
      // "System.out.println" prints in the console; Normally used to trace the process
      System.out.println("Your user name is " + username);          
      System.out.println("Your password is " + password);
      System.out.println("Query: "+searchQuery);
	    
      try 
      {
         //connect to DB 
          //preparing some objects for connection 
        PreparedStatement ps =  null;  

         currentCon = ConnectionManager.getConnection();
         
        ps = currentCon.prepareStatement(searchQuery);
      
                    
     
                     ps.executeUpdate();

         bean.setValid(true);
        
  
      }
      catch (Exception ex) 
      {
         System.out.println("Update failed: An Exception has occurred! " + ex);
          bean.setValid(false);
      } 
	    
      //some exception handling
      finally 
      {
         if (rs != null)	{
            try {
               rs.close();
            } catch (Exception e) {}
               rs = null;
            }
	
         if (stmt != null) {
            try {
               stmt.close();
            } catch (Exception e) {}
               stmt = null;
            }
	
         if (currentCon != null) {
            try {
               currentCon.close();
            } catch (Exception e) {
            }

            currentCon = null;
         }
      }

return bean;
	
      }	

    public static UserBean resetPassword(UserBean bean) {
        
      Statement stmt = null;    
	
         
         String username = bean.getUsername();    
         String password = bean.getPassword();
        
  
	    
         String searchQuery =
             ("UPDATE Users SET pass='"+bean.getPassword()+"' where email= '" + bean.getUsername() + "'");


	    
      // "System.out.println" prints in the console; Normally used to trace the process
      System.out.println("Your user name is " + username);          
      System.out.println("Your password is " + password);
      System.out.println("Query: "+searchQuery);
	    
      try 
      {
         //connect to DB 
          //preparing some objects for connection 
        PreparedStatement ps =  null;  

       currentCon = ConnectionManager.getConnection();
         
        ps = currentCon.prepareStatement(searchQuery);
      
                    
     
        ps.executeUpdate();

         bean.setValid(true);
        
  
      }
      catch (Exception ex) 
      {
         System.out.println("Update failed: An Exception has occurred! " + ex);
          bean.setValid(false);
      } 
	    
      //some exception handling
      finally 
      {
         if (rs != null)	{
            try {
               rs.close();
            } catch (Exception e) {}
               rs = null;
            }
	
         if (stmt != null) {
            try {
               stmt.close();
            } catch (Exception e) {}
               stmt = null;
            }
	
         if (currentCon != null) {
            try {
               currentCon.close();
            } catch (Exception e) {
            }

            currentCon = null;
         }
      }

return bean;
	
      }	


    public void Rtraits(RIASEC person) {
          Statement stmt = null;    
	
         
         int R= person.getRealistic();
         int I=person.getInvestigative();
         int S=person.getSocial();
         int A=person.getArtistic();
         int E=person.getEnterprising();
         int C=person.getConventional();
  
	    
         String searchQuery =
             ("insert into PersonalityTraits values(?,?,?,?,?,?)");

	    
      // "System.out.println" prints in the console; Normally used to trace the process
      System.out.println("R :" + R);          
      System.out.println("I " + I);
      System.out.println("A: "+A);   
      System.out.println("S: "+S);
      System.out.println("E: "+E); 
      System.out.println("C: "+C);
      
      
       try 
      {
         //connect to DB 
          //preparing some objects for connection 
        PreparedStatement ps =  null;  

         currentCon = ConnectionManager.getConnection();
         
        ps = currentCon.prepareStatement(searchQuery);
        
        ps.setInt(1, R);
        ps.setInt(2, I);
        ps.setInt(3, A);
        ps.setInt(4, S);
        ps.setInt(5, E);
        ps.setInt(6, C);
        ps.executeUpdate();
        System.out.println("RISAEC values inserted into database! ");
         person.setValid(true);
        
  
      }
      catch (Exception ex) 
      {
         System.out.println("RISAEC values NOT inserted into database!" + ex);
          person.setValid(false);
      } 
	    
      //some exception handling
      finally 
      {
         if (rs != null)	{
            try {
               rs.close();
            } catch (Exception e) {}
               rs = null;
            }
	
         if (stmt != null) {
            try {
               stmt.close();
            } catch (Exception e) {}
               stmt = null;
            }
	
         if (currentCon != null) {
            try {
               currentCon.close();
            } catch (Exception e) {
            }

            currentCon = null;
         }
      }


	
      }	

    public void setNeeds(Needs traits1,String email) {
        Statement stmt = null;    
	
         
  
	    
         String searchQuery =
             ("insert into ConsumerNeeds values(?,?,?,?,?,?,?,?,?,?,?,?,?)");

	   
      // "System.out.println" prints in the console; Normally used to trace the process
      System.out.println("Challenge :" + traits1.getChallenge());          
      System.out.println("Closeness " + traits1.getChallenge());
      System.out.println("Curosity: "+traits1.getCuriosity());   
      System.out.println("Excitement: "+traits1.getExcitement());
      System.out.println("Harmony: "+traits1.getHarmony()); 
      System.out.println("Ideal: "+traits1.getIdeal()); 
      System.out.println("Liberty: "+traits1.getLiberty());
      System.out.println("Love: "+traits1.getLove()); 
      System.out.println("Practicality: "+traits1.getPracticality()); 
      System.out.println("SelfExpression: "+traits1.getSelfExpression()); 
      System.out.println("Stability: "+traits1.getStability()); 
      System.out.println("Structure: "+traits1.getStructure()); 
      
      
      
       try 
      {
         //connect to DB 
          //preparing some objects for connection 
        PreparedStatement ps =  null;  

       currentCon = ConnectionManager.getConnection();
         
        ps = currentCon.prepareStatement(searchQuery);
        
        ps.setInt(1, traits1.getChallenge());
        ps.setInt(2, traits1.getCloseness());
        ps.setInt(3, traits1.getCuriosity());
        ps.setInt(4, traits1.getExcitement());
        ps.setInt(5, traits1.getHarmony());
        ps.setInt(6, traits1.getIdeal());
        ps.setInt(7, traits1.getLiberty());
        ps.setInt(8, traits1.getLove());
        ps.setInt(9, traits1.getPracticality());
        ps.setInt(10,traits1.getSelfExpression());
        ps.setInt(11, traits1.getStability());
        ps.setInt(12,traits1.getStructure());
        ps.setString(13,email);
        
        ps.executeUpdate();
        
 
        
  
      }
      catch (Exception ex) 
      {
         System.out.println("Needs traits not inserted into database" + ex);
          
      } 
	    
      //some exception handling
      finally 
      {
         if (rs != null)	{
            try {
               rs.close();
            } catch (Exception e) {}
               rs = null;
            }
	
         if (stmt != null) {
            try {
               stmt.close();
            } catch (Exception e) {}
               stmt = null;
            }
	
         if (currentCon != null) {
            try {
               currentCon.close();
            } catch (Exception e) {
            }

            currentCon = null;
         }
      }


	
      
        
    }

          
          
          
        
        
    
        
       
    

    public void setValues(Values traits2,String email) {
        
        Statement stmt = null;    
	
         
         String searchQuery =
             ("insert into Value values(?,?,?,?,?,?)");

	    
      // "System.out.println" prints in the console; Normally used to trace the process
      System.out.println("Conservation :" + traits2.getConservation());          
      System.out.println("OpennessToChange " + traits2.getOpennessToChange());
      System.out.println("Self Enhancement: "+traits2.getSelfEnhancement());   
      System.out.println("Hedonism: "+traits2.getHedonism());
      System.out.println("SelfTranscedence: "+traits2.getSelfTranscendence()); 
    
      
      
       try 
      {
         //connect to DB 
          //preparing some objects for connection 
        PreparedStatement ps =  null;  

       currentCon = ConnectionManager.getConnection();
         
        ps = currentCon.prepareStatement(searchQuery);
        
        ps.setInt(1, traits2.getConservation());
        ps.setInt(2, traits2.getOpennessToChange());
        ps.setInt(3, traits2.getHedonism());
        ps.setInt(4, traits2.getSelfEnhancement());
        ps.setInt(5, traits2.getSelfTranscendence());
        ps.setString(6,email);
       
        ps.executeUpdate();
        
 
        
  
      }
      catch (Exception ex) 
      {
         System.out.println("Values not inserted into database" + ex);
          
      } 
	    
      //some exception handling
      finally 
      {
         if (rs != null)	{
            try {
               rs.close();
            } catch (Exception e) {}
               rs = null;
            }
	
         if (stmt != null) {
            try {
               stmt.close();
            } catch (Exception e) {}
               stmt = null;
            }
	
         if (currentCon != null) {
            try {
               currentCon.close();
            } catch (Exception e) {
            }

            currentCon = null;
         }
      }


	
      
        
    }

          

    public void setBig5(Big5 traits,String email) {
           Statement stmt = null;    
	
         
         String searchQuery =
             ("insert into Big5 values(?,?,?,?,?,?)");

	    
      // "System.out.println" prints in the console; Normally used to trace the process
      System.out.println("Openness :" + traits.getOpeness());          
      System.out.println("Conscientiousness " + traits.getConscientiousness());
      System.out.println("Extraversion: "+traits.getExtraversion());   
      System.out.println("EmotionalRange: "+traits.getEmotionalRange());
      System.out.println("Agreeableness: "+traits.getAgreeableness()); 
    
      
      
       try 
      {
         //connect to DB 
          //preparing some objects for connection 
        PreparedStatement ps =  null;  

       currentCon = ConnectionManager.getConnection();
         
        ps = currentCon.prepareStatement(searchQuery);
        
        ps.setInt(1, traits.getOpeness());
        ps.setInt(2, traits.getConscientiousness());
        ps.setInt(3, traits.getExtraversion());
        ps.setInt(4, traits.getEmotionalRange());
        ps.setInt(5, traits.getAgreeableness());
        ps.setString(6,email);
       
        ps.executeUpdate();
        
 
        
  
      }
      catch (Exception ex) 
      {
         System.out.println("Big5 traits not inserted into database" + ex);
          
      } 
	    
      //some exception handling
      finally 
      {
         if (rs != null)	{
            try {
               rs.close();
            } catch (Exception e) {}
               rs = null;
            }
	
         if (stmt != null) {
            try {
               stmt.close();
            } catch (Exception e) {}
               stmt = null;
            }
	
         if (currentCon != null) {
            try {
               currentCon.close();
            } catch (Exception e) {
            }

            currentCon = null;
         }
      }


	
      
        
    }

    public void insertfeedBack(int stars, String comments, String username) {
       
    Statement stmt = null;    
	
         
         String searchQuery =
             ("insert into feedback values(?,?,?)");

	    
      // "System.out.println" prints in the console; Normally used to trace the process
      System.out.println("Stars :" + stars);          
       System.out.println("Comments :" + comments);  
        System.out.println("Emailid :" + username);   
    
      
      
       try 
      {
         //connect to DB 
          //preparing some objects for connection 
        PreparedStatement ps =  null;  

       currentCon = ConnectionManager.getConnection();
         
        ps = currentCon.prepareStatement(searchQuery);
        ps.setString(1,username);
        ps.setInt(2, stars);
        ps.setString(3, comments);
        
       
        ps.executeUpdate();
        
 
        
  
      }
      catch (Exception ex) 
      {
         System.out.println("Feedback not inserted into database" + ex);
          
      } 
	    
      //some exception handling
      finally 
      {
         if (rs != null)	{
            try {
               rs.close();
            } catch (Exception e) {}
               rs = null;
            }
	
         if (stmt != null) {
            try {
               stmt.close();
            } catch (Exception e) {}
               stmt = null;
            }
	
         if (currentCon != null) {
            try {
               currentCon.close();
            } catch (Exception e) {
            }

            currentCon = null;
         }
      }
    }

    public void setCareer(String user, String careerset1, String[] careerset, String date) {
         Statement stmt = null;    
	
         
         String searchQuery =
             ("insert into SuggestedCareer values(?,?,?)");

	    
      // "System.out.println" prints in the console; Normally used to trace the process

      
      
       try 
      {
         //connect to DB 
          //preparing some objects for connection 
        PreparedStatement ps =  null;  

       currentCon = ConnectionManager.getConnection();
         
        ps = currentCon.prepareStatement(searchQuery);
        ps.setString(1,user);
        ps.setString(2,careerset1);
        ps.setString(3, date);
        
       
        ps.executeUpdate();
        
        for(int i=0;careerset[i]!="all";i++)
        {
                ps.setString(1,user);
                ps.setString(2,careerset[i]);
                ps.setString(3, date);

                ps.executeUpdate();
        }
        
  
      }
      catch (Exception ex) 
      {
         System.out.println("Suggested Career not inserted into database" + ex);
          
      } 
	    
      //some exception handling
      finally 
      {
         if (rs != null)	{
            try {
               rs.close();
            } catch (Exception e) {}
               rs = null;
            }
	
         if (stmt != null) {
            try {
               stmt.close();
            } catch (Exception e) {}
               stmt = null;
            }
	
         if (currentCon != null) {
            try {
               currentCon.close();
            } catch (Exception e) {
            }

            currentCon = null;
         }
      }
       
    }

    public void viewResults(String username, String suggestedcareer,String date) {
       Statement stmt = null;    
	
         
         String searchQuery =
             ("insert into ViewCareer values(?,?,?)");

	    
      // "System.out.println" prints in the console; Normally used to trace the process

      
      
       try 
      {
         //connect to DB 
          //preparing some objects for connection 
        PreparedStatement ps =  null;  

       currentCon = ConnectionManager.getConnection();
         
        ps = currentCon.prepareStatement(searchQuery);
        ps.setString(1,username);
        ps.setString(2,suggestedcareer);
        ps.setString(3, date);
        
       
        ps.executeUpdate();
        
      
  
      }
      catch (Exception ex) 
      {
         System.out.println("View Career not inserted into database" + ex);
          
      } 
	    
      //some exception handling
      finally 
      {
         if (rs != null)	{
            try {
               rs.close();
            } catch (Exception e) {}
               rs = null;
            }
	
         if (stmt != null) {
            try {
               stmt.close();
            } catch (Exception e) {}
               stmt = null;
            }
	
         if (currentCon != null) {
            try {
               currentCon.close();
            } catch (Exception e) {
            }

            currentCon = null;
         }
      }
       
    }
}

    
          
          
          
        
        
    
  
    

   


    

