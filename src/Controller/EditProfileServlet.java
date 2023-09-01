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
import javax.swing.JOptionPane;

/**
 *
 * @author owner
 */
public class EditProfileServlet extends HttpServlet {

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
             String fname=request.getParameter("firstname");
            String lname=request.getParameter( "lastname");
            String pass=request.getParameter("password");
            String cpass=request.getParameter("cpassword");
            String gender=request.getParameter("optradio");
           
            
            /*out.println(fname);
            out.println(lname);
            out.println(pass);
            out.println(gender);
            */
        HttpSession session = request.getSession();
        if(session.isNew()){
			out.println("New session is jutst created");
		}else{
			
                      
           int type;            
            UserBean user=UserBean.class.cast(session.getAttribute("currentSessionUser"));
            user.setFirstName(fname);
            user.setLastName(lname);
            user.setPassword(pass);
            type=user.getType();
            user.setGender(gender);
            
              user=DAO.updateProfile(user);
            if (user.isValid())
            {
                
                
                        {
                            session.removeAttribute("currentSessionUser");
                            session.setAttribute("currentSessionUser", user);
                           //JOptionPane.showMessageDialog(null,"Profile Updated Successfully!");
                            RequestDispatcher rd=request.getRequestDispatcher("UserDashboard.jsp");            
                            rd.forward(request, response);
                            
                        }

            }
            else
            {
                //JOptionPane.showMessageDialog(null,"Update Failed.Please try again!");
                
            }
        
            
                      
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
