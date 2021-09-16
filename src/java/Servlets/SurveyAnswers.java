/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Business.Answers;
import Business.Surveys;
import Data.AnswersIO;
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
@WebServlet(name = "SurveyAnswers", urlPatterns = {"/SurveyAnswers"})
public class SurveyAnswers extends HttpServlet {

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String sid=request.getParameter("sid");
        String question1=request.getParameter("question1");     
        String option1=request.getParameter("option1");
        String question2=request.getParameter("question2");     
        String option2=request.getParameter("option2");
         String question3=request.getParameter("question2");     
        String option3=request.getParameter("option3");
         String question4=request.getParameter("question4");     
        String option4=request.getParameter("option4");
         String question5=request.getParameter("question5");     
        String option5=request.getParameter("option5");
        
        Answers answer=new Answers();
        
        answer.setSid(sid);
        answer.setQuestion1(question1);
        answer.setOption1(option1);
        answer.setQuestion2(question2);
        answer.setOption2(option2);
        answer.setQuestion3(question3);
        answer.setOption3(option3);
        answer.setQuestion4(question4);
        answer.setOption4(option4);
        answer.setQuestion5(question5);
        answer.setOption5(option5);
        try {
            if(AnswersIO.insert(answer)>0)
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
