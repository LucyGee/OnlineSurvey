/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Business.Admin;
import Business.Surveys;
import Data.AdminIO;
import Data.SurveysIO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author user
 */
@WebServlet(name = "AddSurvey", urlPatterns = {"/AddSurvey"})
public class AddSurvey extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String sname=request.getParameter("sname");
        String question1=request.getParameter("question1");     
        String option1a=request.getParameter("option1a");
        String option1b=request.getParameter("option1b");
        String question2=request.getParameter("question2");     
        String option2a=request.getParameter("option2a");
        String option2b=request.getParameter("option2b");
         String question3=request.getParameter("question2");     
        String option3a=request.getParameter("option3a");
        String option3b=request.getParameter("option3b");
         String question4=request.getParameter("question4");     
        String option4a=request.getParameter("option4a");
        String option4b=request.getParameter("option4b");
         String question5=request.getParameter("question5");     
        String option5a=request.getParameter("option5a");
        String option5b=request.getParameter("option5b");
        
        Surveys survey=new Surveys();
        
        survey.setSname(sname);
        survey.setQuestion1(question1);
        survey.setOption1a(option1a);
        survey.setOption1b(option1b);
        survey.setQuestion2(question2);
        survey.setOption2a(option2a);
        survey.setOption2b(option2b);
        survey.setQuestion3(question3);
        survey.setOption3a(option3a);
        survey.setOption3b(option3b);
        survey.setQuestion4(question4);
        survey.setOption4a(option4a);
        survey.setOption4b(option4b);
        survey.setQuestion5(question5);
        survey.setOption5a(option5a);
        survey.setOption5b(option5b);
        try {
            if(SurveysIO.insert(survey)>0)
            {
               String message1="Survey added successfully";
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
    }


}
