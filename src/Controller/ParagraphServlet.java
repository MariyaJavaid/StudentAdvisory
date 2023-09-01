 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Database.DAO;
import Model.Big5;
import Model.CareerAssessment;
import Model.Needs;
import Model.UserBean;
import Model.Values;
import com.myFuzzyProject.TestCareer;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;
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
public class ParagraphServlet extends HttpServlet {

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
            out.println("This is a Paragraph Servlet Controller");
        
        String s = request.getParameter("personalitytraits");
       out.println(s);
        StringTokenizer tokenizer = new StringTokenizer(s, "%");
        Big5 traits=new Big5();
        Needs traits1=new Needs();
        Values traits2=new Values();
        //int a= Integer.parseInt( Integer.parseInt(tokenizer.nextToken());
          //out.println("a"+a);
        traits.setOpeness( Integer.parseInt(tokenizer.nextToken()));
        traits.setAdventurousness( Integer.parseInt(tokenizer.nextToken()));
        traits.setArtisticInterests( Integer.parseInt(tokenizer.nextToken()));
        traits.setEmotionality( Integer.parseInt(tokenizer.nextToken()));
        traits.setImagination( Integer.parseInt(tokenizer.nextToken()));
        traits.setIntellect( Integer.parseInt(tokenizer.nextToken()));
        traits.setAuthorityChallenging( Integer.parseInt(tokenizer.nextToken()));
        traits.setConscientiousness( Integer.parseInt(tokenizer.nextToken()));
        traits.setAchievementStriving( Integer.parseInt(tokenizer.nextToken()));
        traits.setCautiousness( Integer.parseInt(tokenizer.nextToken()));
        traits.setDutifulness( Integer.parseInt(tokenizer.nextToken()));
        traits.setOrderliness( Integer.parseInt(tokenizer.nextToken()));
        traits.setSelfDiscipline( Integer.parseInt(tokenizer.nextToken()));
        traits.setSelfEfficacy( Integer.parseInt(tokenizer.nextToken()));
        traits.setExtraversion( Integer.parseInt(tokenizer.nextToken()));
        traits.setActivityLevel( Integer.parseInt(tokenizer.nextToken()));
        traits.setAssertiveness( Integer.parseInt(tokenizer.nextToken()));
        traits.setCheerfulness( Integer.parseInt(tokenizer.nextToken()));
        traits.setExcitementSeeking( Integer.parseInt(tokenizer.nextToken()));
        traits.setOutgoing( Integer.parseInt(tokenizer.nextToken()));
        traits.setGregariousness( Integer.parseInt(tokenizer.nextToken()));
        traits.setAgreeableness( Integer.parseInt(tokenizer.nextToken()));
        traits.setAltruism( Integer.parseInt(tokenizer.nextToken()));
        traits.setCooperation( Integer.parseInt(tokenizer.nextToken()));
        traits.setModesty( Integer.parseInt(tokenizer.nextToken()));
        traits.setUncompromising( Integer.parseInt(tokenizer.nextToken()));
        traits.setSympathy( Integer.parseInt(tokenizer.nextToken()));
        traits.setTrust( Integer.parseInt(tokenizer.nextToken()));
        traits.setEmotionalRange( Integer.parseInt(tokenizer.nextToken()));
        traits.setFiery( Integer.parseInt(tokenizer.nextToken()));
        traits.setProneToWorry( Integer.parseInt(tokenizer.nextToken()));
        traits.setMelancholy( Integer.parseInt(tokenizer.nextToken()));
        traits.setImmoderation( Integer.parseInt(tokenizer.nextToken()));
        traits.setSelfConsciousness( Integer.parseInt(tokenizer.nextToken()));
        traits.setSusceptibletostress( Integer.parseInt(tokenizer.nextToken()));
        
        
       traits1.setChallenge( Integer.parseInt(tokenizer.nextToken()));
       traits1.setCloseness(Integer.parseInt(tokenizer.nextToken()));
       traits1.setCuriosity(( Integer.parseInt(tokenizer.nextToken())));
       traits1.setExcitement(( Integer.parseInt(tokenizer.nextToken())));
       traits1.setHarmony(( Integer.parseInt(tokenizer.nextToken())));
       traits1.setIdeal(( Integer.parseInt(tokenizer.nextToken())));
       traits1.setLiberty( Integer.parseInt(tokenizer.nextToken()));
       traits1.setLove( Integer.parseInt(tokenizer.nextToken()));
       traits1.setPracticality( Integer.parseInt(tokenizer.nextToken()));
       traits1.setSelfExpression(Integer.parseInt(tokenizer.nextToken()));
       traits1.setStability( Integer.parseInt(tokenizer.nextToken()));
       traits1.setStructure( Integer.parseInt(tokenizer.nextToken()));
       
       traits2.setConservation(( Integer.parseInt(tokenizer.nextToken())));
       traits2.setOpennessToChange( Integer.parseInt(tokenizer.nextToken()));
       traits2.setHedonism( Integer.parseInt(tokenizer.nextToken()));
       traits2.setSelfEnhancement( Integer.parseInt(tokenizer.nextToken()));
       traits2.setSelfTranscendence( Integer.parseInt(tokenizer.nextToken()));
              
        out.println("Traits : " +traits.getOpeness()+traits.getAdventurousness()+traits.getArtisticInterests());
        
        String career="";
        TestCareer test=new TestCareer();
        career=test.careerEstimate(traits,traits1,traits2);
          
          
          CareerAssessment assessment1=new CareerAssessment(10);
          assessment1.setTraits1(traits);
          assessment1.setTraits2(traits1);
          assessment1.setTraits3(traits2);
          assessment1.setCareerset1(career);
          System.out.println(career);
          
          
         HttpSession session = request.getSession();
        if(session.isNew()){
			out.println("New session is jutst created");
		}
        else{
			
                      
                      
            UserBean user=UserBean.class.cast(session.getAttribute("currentSessionUser"));
           
            
            
            session.removeAttribute("currentSessionUser");
            user.setAssessment(assessment1);
             
            session.setAttribute("currentSessionUser", user);
            
            DAO adddata= new DAO();
            adddata.setBig5(traits, user.getUsername());
            adddata.setNeeds(traits1, user.getUsername());
            adddata.setValues(traits2, user.getUsername());
            
            RequestDispatcher rd=request.getRequestDispatcher("Questionnairre.jsp");            
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