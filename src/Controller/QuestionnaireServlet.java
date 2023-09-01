/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Database.DAO;
import Model.CareerAssessment;
import Model.RIASEC;
import Model.UserBean;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author owner
 */
public class QuestionnaireServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
           // out.println("here\n");
          String[] checkedIds = request.getParameterValues("checkedRows");
          Integer  Rcount=0,Icount=0,Scount=0,Ecount=0,Acount=0,Ccount=0;
          
        
          //out.println("the count is "+Rcount);
          for (int i = 0; i < checkedIds.length; i++)
          {
          
              if(checkedIds[i].equalsIgnoreCase("R"))
                  Rcount++;
              else  if(checkedIds[i].equalsIgnoreCase("I"))
                  Icount++;
              else  if(checkedIds[i].equalsIgnoreCase("S"))
                  Scount++;
              else  if(checkedIds[i].equalsIgnoreCase("A"))
                  Acount++;
              else  if(checkedIds[i].equalsIgnoreCase("E"))
                  Ecount++;
              else  if(checkedIds[i].equalsIgnoreCase("C"))
                  Ccount++;
          }
          
          out.println("This is Questinnaire Servlet "+Rcount+Icount+Scount+Acount+Ecount+Ccount);    
          RIASEC person=new RIASEC();
          person.setRealistic(Rcount);
          person.setArtistic(Acount);
          person.setInvestigative(Icount);
          person.setEnterprising(Ecount);
          person.setSocial(Scount);
          person.setConventional(Ccount);
         
          DAO traits= new DAO();
          traits.Rtraits(person);
          
          String[] career=new String[100];
          
         HttpSession session = request.getSession();
         if(session.isNew()){
			out.println("New session is just created");
		}
        else{
             
          UserBean user=UserBean.class.cast(session.getAttribute("currentSessionUser"));
          
         
          session.removeAttribute("currentSessionUser");
          CareerAssessment careers=user.getAssessment();
          String suggestedcareer=careers.getCareerset1();
          String display="";
          //R
          if(Rcount>Acount&&Rcount>Icount&&Rcount>Ecount&&Rcount>Scount&&Rcount>Ccount)
          {
              career[0]="Sports and Recreation";
              career[1]="Engineering & Industrial";
              career[2]="all";
             
              
              for(int i=0;career[i]!="all";i++)
              {
                  System.out.println(i+":"+career[i]);
              }
             
               
               careers.setCareerset(career);
               careers.setTraits(person);
              
              display="A person with similar personality traits are often good at mechanical or athletic jobs.";
               user.setAssessment(careers);
               session.setAttribute("currentSessionUser", user);
           }   
          
          //I
          else if(Icount>Rcount&&Icount>Acount&&Icount>Ecount&&Icount>Scount&&Icount>Ccount)
          {
              
       
              career[0]="Technology & Computing";
              career[1]="Engineering & Industrial";
              career[2]="all";
             
              
              for(int i=0;career[i]!="all";i++)
              {
                  System.out.println(i+":"+career[i]);
              }
             
               
               careers.setCareerset(career);
               careers.setTraits(person);
              
                display="A person with similar personality traits like to watch, learn, analyze and solve problems";
               user.setAssessment(careers);
               session.setAttribute("currentSessionUser", user);
           }
          
          //A
           else if(Acount>Rcount&&Acount>Icount&&Acount>Ecount&&Acount>Scount&&Acount>Ccount)
          {
              
       
              career[0]="Arts, Literature & Entertainment";
              career[1]="Communications";
              career[2]="all";
             
              
              for(int i=0;career[i]!="all";i++)
              {
                  System.out.println(i+":"+career[i]);
              }
             
               
               careers.setCareerset(career);
               careers.setTraits(person);
              
               display="A person with similar personality traits  like to work in unstructured situations\n" +
"where they can use their creativity";
               user.setAssessment(careers);
               session.setAttribute("currentSessionUser", user);
           }
           
           //S
           else if(Scount>Rcount&&Scount>Icount&&Scount>Ecount&&Scount>Acount&&Scount>Ccount)
          {
              
       
              career[0]="Social Sciences";
              career[1]="Healthcare & Medical";
              career[2]="Education";
              career[3]="all";
             
              
              for(int i=0;career[i]!="all";i++)
              {
                  System.out.println(i+":"+career[i]);
              }
             
               
               careers.setCareerset(career);
               careers.setTraits(person);
              
                display="A person with similar personality traits  like to work with other people,\n" +
"rather than things";
               user.setAssessment(careers);
               session.setAttribute("currentSessionUser", user);
           }
          
           //E
          else if(Ecount>Rcount&&Ecount>Icount&&Ecount>Acount&&Ecount>Scount&&Ecount>Ccount)
          {
              
       
              career[0]="Business, Commerce & Management";
              career[1]="Law & Public Policy";
              career[2]="all";
             
              
              for(int i=0;career[i]!="all";i++)
              {
                  System.out.println(i+":"+career[i]);
              }
             
               
               careers.setCareerset(career);
               careers.setTraits(person);
              
               display="A person with similar personality traits   like to work with others and enjoy\n" +
"persuading and and performing";
               user.setAssessment(careers);
               session.setAttribute("currentSessionUser", user);
           }
          
          //C
          else if(Ccount>Rcount&&Ccount>Icount&&Ccount>Acount&&Ccount>Scount&&Ccount>Ecount)
          {
              
       
              career[0]="Business, Commerce & Management";
              career[1]="Engineering & Industrial";
              career[2]="all";
             
              
              for(int i=0;career[i]!="all";i++)
              {
                  System.out.println(i+":"+career[i]);
              }
             
               
               careers.setCareerset(career);
               careers.setTraits(person);
              
               display="A person with similar personality traits   are very detail oriented,organized\n" +
"and like to work with data";
               user.setAssessment(careers);
               session.setAttribute("currentSessionUser", user);
           }
          
          
          
          else if(Rcount==Icount && Rcount>Acount && Rcount>Ecount && Rcount>Scount && Rcount>Ccount && Icount>Acount && Icount>Ecount && Icount>Scount && Icount>Ccount)
          {
              career[0]="Technology & Computing";
              career[1]="Engineering & Industrial";
	      career[2]="Sports and Recreation";
              career[3]="all";
             
              
              for(int i=0;career[i]!="all";i++)
              {
                  System.out.println(i+":"+career[i]);
              }
             
               
               careers.setCareerset(career);
               careers.setTraits(person);
              
              display="A person with similar personality traits are often good at mechanical, athletic jobs like to watch, learn, analyze and solve problems";
               user.setAssessment(careers);
               session.setAttribute("currentSessionUser", user);
           }  
          
          else if(Rcount==Ccount && Rcount>Acount && Rcount>Ecount && Rcount>Scount && Rcount>Icount && Ccount>Acount && Ccount>Ecount && Ccount>Scount && Icount>Icount)
          {
              career[0]="Business, Commerce & Management";
              career[1]="Engineering & Industrial";
	      career[2]="Sports and Recreation";
              career[3]="all";
             
              
              for(int i=0;career[i]!="all";i++)
              {
                  System.out.println(i+":"+career[i]);
              }
             
               
               careers.setCareerset(career);
               careers.setTraits(person);
              
              display="A person with similar personality traits are often good at mechanical or athletic jobs and are very detail oriented, organized";
               user.setAssessment(careers);
               session.setAttribute("currentSessionUser", user);
           } 
          
          else if(Icount==Acount && Icount>Rcount && Icount>Scount && Icount>Ecount && Icount>Ccount && Acount>Ccount && Acount>Ecount && Acount>Scount && Acount>Icount)
          {
              career[0]="Technology & Computing";
              career[1]="Arts, Literature & Entertainment";
              career[2]="all";
             
              
              for(int i=0;career[i]!="all";i++)
              {
                  System.out.println(i+":"+career[i]);
              }
             
               
               careers.setCareerset(career);
               careers.setTraits(person);
              
              display="A person with similar personality traits like to watch, learn, analyze and solve problems and work in unstructured situations";
               user.setAssessment(careers);
               session.setAttribute("currentSessionUser", user);
           } 
          
          else if(Scount==Acount && Scount>Rcount && Scount>Icount && Scount>Ecount && Scount>Ccount && Acount>Rcount && Acount>Icount && Acount>Ecount && Acount>Ccount)
          {
              career[0]="Social Sciences";
              career[1]="Arts, Literature & Entertainment";
              career[2]="all";
             
              
              for(int i=0;career[i]!="all";i++)
              {
                  System.out.println(i+":"+career[i]);
              }
             
               
               careers.setCareerset(career);
               careers.setTraits(person);
              
              display="A person with similar personality traits  like to work with other people and in unstructured situations";
               user.setAssessment(careers);
               session.setAttribute("currentSessionUser", user);
           } 
          
          else if(Scount==Ecount && Scount>Rcount && Scount>Icount && Scount>Acount && Scount>Ccount && Ecount>Rcount && Ecount>Icount && Ecount>Acount && Ecount>Ccount)
          {
              career[0]="Social Sciences";
              career[1]="Business, Commerce & Management";
              career[2]="all";
             
              
              for(int i=0;career[i]!="all";i++)
              {
                  System.out.println(i+":"+career[i]);
              }
             
               
               careers.setCareerset(career);
               careers.setTraits(person);
              
              display="A person with similar personality traits like to work with other people";
               user.setAssessment(careers);
               session.setAttribute("currentSessionUser", user);
           } 
          
          else if(Ecount==Ccount && Ecount>Rcount && Ecount>Icount && Ecount>Acount && Ecount>Scount && Ccount>Rcount && Ccount>Icount && Ccount>Acount && Ccount>Scount)
          {
              career[0]="Engineering & Industrial";
              career[1]="Business, Commerce & Management";
	      career[2]="Law & Public Policy";
              career[3]="all";
             
              
              for(int i=0;career[i]!="all";i++)
              {
                  System.out.println(i+":"+career[i]);
              }
             
               
               careers.setCareerset(career);
               careers.setTraits(person);
              
              display="A person with similar personality traits like to work with others and are very detail oriented, organized\n";
               user.setAssessment(careers);
               session.setAttribute("currentSessionUser", user);
           } 
          
          else if(Rcount==Icount && Icount==Acount && Rcount>Scount && Rcount>Ecount && Rcount>Ccount && Icount>Scount && Icount>Ecount && Icount>Ccount && Acount>Scount && Acount>Ecount && Acount>Ccount)
          {
              career[0]="Engineering & Industrial";
              career[1]="Arts, Literature & Entertainment";
	      career[2]="Sports and Recreation";
              career[3]="all";
             
              
              for(int i=0;career[i]!="all";i++)
              {
                  System.out.println(i+":"+career[i]);
              }
             
               
               careers.setCareerset(career);
               careers.setTraits(person);
              
              display="A person with similar personality traits are good at mechanical or athletic jobs, like to watch, learn, analyze and solve problems and work in unstructured situations\n";
               user.setAssessment(careers);
               session.setAttribute("currentSessionUser", user);
           } 
          
          else if(Rcount==Icount && Icount==Ccount && Rcount>Acount && Rcount>Ecount && Rcount>Scount && Icount>Acount && Icount>Ecount && Icount>Scount && Ccount>Acount && Ccount>Ecount && Ccount>Scount)
          {
              career[0]="Engineering & Industrial";
              career[1]="Business, Commerce & Management";
	      career[2]="Sports and Recreation";
              career[3]="all";
             
              
              for(int i=0;career[i]!="all";i++)
              {
                  System.out.println(i+":"+career[i]);
              }
             
               
               careers.setCareerset(career);
               careers.setTraits(person);
              
              display="A person with similar personality traits are good at mechanical or athletic jobs, like to watch, learn, analyze and solve problems and are very detail oriented, organized\n";
               user.setAssessment(careers);
               session.setAttribute("currentSessionUser", user);
           } 
          
          else if(Acount==Icount && Icount==Scount && Acount>Ccount && Acount>Ecount && Acount>Rcount && Icount>Ccount && Icount>Ecount && Icount>Rcount && Scount>Ccount && Scount>Ecount && Scount>Rcount)
          {
              career[0]="Engineering & Industrial";
              career[1]="Arts, Literature & Entertainment";
	      career[2]="Social Sciences";
              career[3]="all";
             
              
              for(int i=0;career[i]!="all";i++)
              {
                  System.out.println(i+":"+career[i]);
              }
             
               
               careers.setCareerset(career);
               careers.setTraits(person);
              
              display="A person with similar personality traits like to work with people and in unstructured situations and like to watch, learn, analyze and solve problems/n";
               user.setAssessment(careers);
               session.setAttribute("currentSessionUser", user);
           } 

     else if(Acount==Scount && Scount==Ecount && Acount>Ccount && Acount>Rcount && Acount>Icount && Scount>Ccount && Scount>Rcount && Scount>Icount && Ecount>Ccount && Ecount>Rcount && Ecount>Icount)
          {
              career[0]="Business, Commerce & Management";
              career[1]="Arts, Literature & Entertainment";
	      career[2]="Social Sciences";
              career[3]="all";
             
              
              for(int i=0;career[i]!="all";i++)
              {
                  System.out.println(i+":"+career[i]);
              }
             
               
               careers.setCareerset(career);
               careers.setTraits(person);
              
              display="A person with similar personality traits like to work in unstructured situations and with other people\n";
               user.setAssessment(careers);
               session.setAttribute("currentSessionUser", user);
           } 

     else if(Scount==Ecount && Ecount==Ccount && Scount>Rcount && Scount>Icount && Scount>Acount && Ecount>Rcount && Ecount>Icount && Ecount>Acount && Ccount>Rcount && Ccount>Icount && Ccount>Acount)
          {
              career[0]="Business, Commerce & Management";
              career[1]="Engineering & Industrial";
	      career[2]="Education";
              career[3]="all";
             
              
              for(int i=0;career[i]!="all";i++)
              {
                  System.out.println(i+":"+career[i]);
              }
             
               
               careers.setCareerset(career);
               careers.setTraits(person);
              
              display="A person with similar personality traits like to work with other people and are very detail oriented,organized\n";
               user.setAssessment(careers);
               session.setAttribute("currentSessionUser", user);
           } 

else if(Ecount==Rcount && Rcount==Ccount && Ecount>Scount && Ecount>Acount && Ecount>Icount && Rcount>Scount && Rcount>Acount && Rcount>Icount && Ccount>Scount && Ccount>Acount && Ccount>Icount)
          {
              career[0]="Business, Commerce & Management";
              career[1]="Engineering & Industrial";
	      career[2]="Law & Public Policy";
              career[3]="all";
             
              
              for(int i=0;career[i]!="all";i++)
              {
                  System.out.println(i+":"+career[i]);
              }
             
               
               careers.setCareerset(career);
               careers.setTraits(person);
              
              display="A person with similar personality traits like to work with others, are very detail oriented,organized and are often good at mechanical or athletic jobs\n ";
               user.setAssessment(careers);
               session.setAttribute("currentSessionUser", user);
           } 
          
else
{
    ///////////////////////////////////
              career[0]="";
              career[1]="";
	      career[2]="";
              career[3]="all";
             
              
              for(int i=0;career[i]!="all";i++)
              {
                  System.out.println(i+":"+career[i]);
              }
             
               
               careers.setCareerset(career);
               careers.setTraits(person);
              
              display="You have a very unique personality. People depicting these personality traits are rare to be found.\n ";
               user.setAssessment(careers);
               session.setAttribute("currentSessionUser", user);
}

          
          
          
          
          
             suggestedcareer=suggestedcareer.concat(";");       
            for(int i=0;career[i]!="all";i++)
            {
            suggestedcareer=suggestedcareer.concat(career[i]);
            suggestedcareer=suggestedcareer.concat(";");
            }
            System.out.println(suggestedcareer);
            
            
           DAO addcareer= new DAO();
           Date date=new Date();
           addcareer.setCareer(user.getUsername(), careers.getCareerset1(), careers.getCareerset(),date.toString());
           addcareer.viewResults(user.getUsername(), suggestedcareer, date.toString());
  
            request.setAttribute("displaytext", display);
            RequestDispatcher rd=request.getRequestDispatcher("TestResult.jsp");            
            rd.forward(request, response);
            
          
         }           
        
         
          
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
