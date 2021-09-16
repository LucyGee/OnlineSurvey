<%-- 
    Document   : survey
    Created on : Sep 16, 2021, 4:27:22 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
    </head>
    <body>
        <button class="open-button" onclick="openForm()">Open Form</button>
            
            <div class="form-popup" id="myForm">
                    <form class="form-container" method="post" action="SurveyAnswers">
                      <div class="row">
                        <div class="col-md-12">
                        <p class="lead"><%=rs.getString("sname")%></p>
                        </div>
                      </div> 
                        <div class="row">
                        <div class="col-md-12">
                        <p class="lead"><%=rs.getString("q1")%></p>
                        </div>
                        </div>
                       <div class="row">
                        <div class="col-md-6 mr-auto">
                        <input type="radio" class="input100"  name="option1"  value="<%=rs.getString("option1a")%>"><%=rs.getString("option1a")%>
                     </div>
                        <div class="col-md-6 mr-auto">
                        <input type="radio" class="input100" name="option1" value="<%=rs.getString("option1b")%>"><%=rs.getString("option1b")%>
                        </div>
                       </div>
                      <div class="row">
                        <div class="col-md-12">
                        <p class="lead"><%=rs.getString("q2")%></p>
                        </div>
                        </div>
                       <div class="row">
                        <div class="col-md-6 mr-auto">
                        <input type="radio" class="input100" name="option2" value="<%=rs.getString("option2a")%>"><%=rs.getString("option2a")%>
                     </div>
                        <div class="col-md-6 mr-auto">
                        <input type="radio" class="input100" name="option2" value="<%=rs.getString("option2b")%>"><%=rs.getString("option2b")%>
                        </div>
                       </div>
                        <div class="row">
                        <div class="col-md-12">
                        <p class="lead"><%=rs.getString("q3")%></p>
                        </div>
                        </div>
                       <div class="row">
                        <div class="col-md-6 mr-auto">
                        <input type="radio" class="input100" name="option3" value="<%=rs.getString("option3a")%>"><%=rs.getString("option3a")%>
                     </div>
                        <div class="col-md-6 mr-auto">
                        <input type="radio" class="input100" name="option3" value="<%=rs.getString("option3b")%>"><%=rs.getString("option3b")%>
                        </div>
                       </div><div class="row">
                        <div class="col-md-12">
                        <p class="lead"><%=rs.getString("q4")%></p>
                        </div>
                        </div>
                       <div class="row">
                        <div class="col-md-6 mr-auto">
                        <input type="radio" class="input100" name="option4" value="<%=rs.getString("option4a")%>"><%=rs.getString("option4a")%>
                     </div>
                        <div class="col-md-6 mr-auto">
                        <input type="radio" class="input100" name="option14" value="<%=rs.getString("option4b")%>"><%=rs.getString("option4b")%>
                        </div>
                       </div>
                        <div class="row">
                        <div class="col-md-12">
                        <p class="lead"><%=rs.getString("q5")%></p>
                        </div>
                        </div>
                       <div class="row">
                        <div class="col-md-6 mr-auto">
                        <input type="radio" class="input100" name="option5" value="<%=rs.getString("option5a")%>"><%=rs.getString("option5a")%>
                     </div>
                        <div class="col-md-6 mr-auto">
                        <input type="radio" class="input100" name="option5" value="<%=rs.getString("option5b")%>"><%=rs.getString("option5b")%>
                        </div>
                       </div>
                        
                       <input type="hidden" class="input100" name="question1" value="<%=rs.getString("q1")%>">
                       <input type="hidden" class="input100" name="question2" value="<%=rs.getString("q2")%>">
                       <input type="hidden" class="input100" name="question3" value="<%=rs.getString("q3")%>">
                       <input type="hidden" class="input100" name="question4" value="<%=rs.getString("q4")%>">
                       <input type="hidden" class="input100" name="question5" value="<%=rs.getString("q5")%>">
                       <input type="hidden" class="input100" name="sid" value="<%=rs.getString("sid")%>"
                        <center>
                            <button type="submit" class="login100-form-btn">SUBMIT</button>
                            <button type="submit" onclick="closeForm()" class="login100-form-btn">CLOSE</button>
                        </center>
                    </form>
       </div>
      </div>
    </body>
</html>
