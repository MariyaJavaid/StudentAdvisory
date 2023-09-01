/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Database.DAO;
import Model.UserBean;
import java.io.IOException;
import java.io.PrintWriter;
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
public class LoginServlet extends HttpServlet {

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
       String email = request.getParameter("email");
       String pass = request.getParameter("password");
       System.out.println("This is Login Controller");  
       System.out.println(email);  
       System.out.println(pass);
       
       UserBean user=new UserBean();
       user.setUsername(email);
       user.setPassword(pass);
       
       
       user=DAO.login(user);
       
       
       
       
      if (user.isValid())
     {
	        
          HttpSession session = request.getSession(true);	    
          session.setAttribute("currentSessionUser",user);
          System.out.println("correct email id");
          if(user.getType()==0)
          {
              response.getWriter().print("Admin");
          //response.sendRedirect("UserDashboard.jsp"); //logged-in page
          }     
          else if(user.getType()==1)
          {
               response.getWriter().print("SuperAdmin");
            //response.sendRedirect("AdminDashboard.jsp"); //logged-in page
          } 
          else  if(user.getType()==2)
          {
          
               response.getWriter().print("User");
              //response.sendRedirect("SuperAdminDashboard.jsp"); //logged-in page
          }  
     }
      else
      {
        //request.setAttribute("error","Invalid Username or Password");
        //RequestDispatcher rd=request.getRequestDispatcher("index.jsp");            
        //rd.include(request, response);
        response.getWriter().write("Username or password incorrect");
      }
      
      
        }
         
         
 catch (Throwable theException) 	    
{
     System.out.println(theException); 
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
