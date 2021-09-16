<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Online Survey System</title>
        <link rel="icon" type="image/png" href="images/survey-tool.jpg"/>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <link href="css/studentRegistration.css" type="text/css" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
	<link rel="stylesheet" type="text/css" href="fonts/iconic/css/material-design-iconic-font.min.css">
	<link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">	
	<link rel="stylesheet" type="text/css" href="vendor/css-hamburgers/hamburgers.min.css">
	<link rel="stylesheet" type="text/css" href="vendor/animsition/css/animsition.min.css">
	<link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">	
	<link rel="stylesheet" type="text/css" href="vendor/daterangepicker/daterangepicker.css">
	<link rel="stylesheet" type="text/css" href="css/util.css">
	<link rel="stylesheet" type="text/css" href="css/main.css">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="limiter">
            <div class="container-login100" style="background-image: url('images/office2.jpg');">
                <div class="wrap-login100">
                    <form class="form-container" method="post" action="AdminRegister" name="staff_registration_form" id="staff_registration_form">
                        <span class="login100-form-logo">
                            <img src='images/survey-tool.jpg' alt='logo' width="200%" height="100%">
			</span>
                        <span class="login100-form-title p-b-34 p-t-27">
                            Admin Registration Form
			</span>
                        
                        <div class="login100-form">
                          <label for="fname">First Name:</label>
                          <input type="text" class="input100" id="fname" name="fname" placeholder="First Name" pattern="[A-Za-z']+" title="alphabets and ' only" required>
                        </div>
                     
                        <div class="login100-form">
                          <label for="lname">Last Name:</label>
                          <input type="text" class="input100" id="lname" name="lname" placeholder="Last Name" pattern="[A-Za-z']+" title="alphabets and ' only" required>
                        </div>
                        
                     
                        <div class="login100-form">
                          <label for="email">Email Address:</label>
                          <input type="email" class="input100" id="email" name="email" placeholder="xyz@abc.com" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$" title="Use the correct format -----@---.----" required>
                        </div>
                        <div class="login100-form">
                          <label for="phone_no">Phone Number</label>
                          <input type="tel" class="input100" id="phoneNo" name="phoneNo" placeholder="0712345678" pattern="[0]+[7]+[0-9]{8,8}"  title="valid phone numbers only e.g 07--" minlength="10" maxlength="10" required>
                        </div>
                
                        <div class="login100-form">
                          <label for="password">Password</label>
                          <input type="text" class="input100" id="password" name="password" placeholder=""  minlength="8" maxlength="15" required>
                        </div>
                
                         <br>
                        <center>
                            <button type="submit" class="login100-form-btn">REGISTER</button>
                        </center>
                    </form>
                    
		</div>
            </div>
	</div>
    </body>
</html>