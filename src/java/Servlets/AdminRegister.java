/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Business.Admin;
import Data.AdminIO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author user
 */
public class AdminRegister extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String fname=request.getParameter("fname");
        String lname=request.getParameter("lname");     
        String email=request.getParameter("email");
        String phoneNo=request.getParameter("phoneNo");
        String password=request.getParameter("password");

        
        Admin admin=new Admin();
        
        admin.setFname(fname);
        admin.setLname(lname);
        admin.setEmail(email);
        admin.setPhoneNo(phoneNo);
        admin.setPassword(password);
        try {
            if(AdminIO.insert(admin)>0)
            {
               String message1="Admin successfully registered";
                String url1="/newlogin.jsp";
                request.setAttribute("message", message1);

                RequestDispatcher dispatcher=getServletContext().
                getRequestDispatcher(url1);
               dispatcher.forward(request,response);  
            }
            else
            {
                String message="This staff number is already registered";
                String url="/AdminRegistration.jsp";
                request.setAttribute("message", message);

                RequestDispatcher dispatcher=getServletContext().
                getRequestDispatcher(url);
               dispatcher.forward(request,response);  
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminRegister.class.getName()).log(Level.SEVERE, null, ex);
            
        
    }
    }}