<%-- 
    Document   : newlogin
    Created on : Mar 2, 2020, 6:59:08 PM
    Author     : Eva
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
	<title>Online Survey System</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">	
	<link rel="icon" type="image/png" href="images/survey-tool.jpg"/>
	
	<link rel="stylesheet" type="text/css" href="css/util.css">
	<link rel="stylesheet" type="text/css" href="css/main.css">
    </head>

    <body >

	<div class="limiter">
            <div class="container-login100" style="background-image: url('images/office2.jpg');">
		<div class="wrap-login100">
                    <form class="login100-form validate-form" method="post" action="Login" name="login_form" id="login_form" onsubmit="return validateForm()">
			<span class="login100-form-logo">
                            <img src='images/survey-tool.jpg' alt='logo' width="200%" height="100%">
			</span>
                        <span class="login100-form-title p-b-34 p-t-27">
                            Admin Portal
			</span>

		
                        <div class="login100-form">
                          <label for="staffId">Email Address:</label>
                          <input type="text" class="input100" name="email" id="email" placeholder="Email Address" required="">
                        </div>

                        <div class="login100-form">
                          <label for="password">Password:</label>
                          <input type="password" class="input100" name="password" id="password" placeholder="Password" required="">
                        </div>
            
                         <br>
                         
                        <center>
                              <button type="submit" class="login100-form-btn">Login</button>
                        </center>
                    </form>
                    
                </div>
        
            </div>
        </div>
      
	<script>
$(document).ready(function(){
 $(function(){
  $("#email").autocomplete({
      width: 300,
      max: 10,
      delay: 100,
      autoFocus: true,
      scroll: true,
      highlight: false,
      cacheLength: 1,
      source:function(request, response){
       
    $.ajax(
        {url: "ajax3",
            type: 'POST',
            datatype:"json",
            data:{staffId:request.term},
            success: function(data)
            {
            
                console.log(request.term);
                console.log(data);
                 response(JSON.parse(data));
            }
        });
    }
   });
 }); 
});
    </script>
	<script type="text/javascript">
	 function validateForm()                                    
                    { 
                        var staffId = document.forms["login_form"]["staffId"];
                        var password = document.forms["login_form"]["password"];
    
                        if (staffId.value == "")                                  
                        { 
                            window.alert("Please enter your Staff Number."); 
                            staffId.focus(); 
                            return false; 
                        } 

                        if (password.value == "")                        
                        { 
                            window.alert("Please enter your Password."); 
                            password.focus(); 
                            return false; 
                        } 
                        

                        return true; 
                    }
	</script>
	
   
  </body>
</html>
