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
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author user
 */
public class Login extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email=request.getParameter("email");
        String password=request.getParameter("password");
        
        Admin admin1=new Admin();
       // staff.setDesignation(designation);
        admin1.setEmail(email);
        admin1.setPassword(password);
        
        
        try {
            Admin admin=AdminIO.selectAdmin(password, email);
           if(AdminIO.selectAdmin(password, email)!=null)
           { HttpSession session=request.getSession();
                session.setAttribute("admin", admin);
                
                String url="/AdminHome.jsp";
                RequestDispatcher dispatcher=getServletContext().getRequestDispatcher(url);
                dispatcher.forward(request,response);
                 
               
           }
           else
           {
               String message="invalid login";
                String url="/AdminLogin.jsp";
                request.setAttribute("message", message);
                RequestDispatcher dispatcher=getServletContext().
                       getRequestDispatcher(url);
                dispatcher.forward(request,response);
           }
                    
            } 
        catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }

    
