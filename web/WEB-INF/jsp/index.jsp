
<%@page import="java.text.ParseException"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>


<!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">
  <title>Online Survey System</title>
   <link rel="icon" type="image/png" href="images/survey-tool.jpg"/>
  <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic" rel="stylesheet" type="text/css">
  <link href="css/freelancer.css" rel="stylesheet">
  <script type="text/javascript" src="js/jquery-3.5.1.js"></script>
  <style>
      .form-popup {
  display: none;
  position: absolute;
  bottom: 0;
  right: 15px;
  border: 3px solid #f1f1f1;
  z-index: 9;
}
.form-container {
  max-width: 1000px;
  max-height: 1000px;
  padding: 10px;
  background-color: infotext;
}

  </style>

</head>


  <!-- Navigation -->
  <nav class="navbar navbar-expand-lg copyright text-uppercase" id="mainNav">
    <div class="container">
      <a class="navbar-brand js-scroll-trigger" href="#page-top">
          <img src="images/survey-tool.jpg" alt="" width="100%" height="100%">
      </a>
     
      <div class="collapse navbar-collapse" id="navbarResponsive">
        <ul class="navbar-nav ml-auto">
          <li class="nav-item mx-0 mx-lg-1">
            <a class="nav-link py-3 px-0 px-lg-3 rounded js-scoll-trigger" href="#home">Home</a>
          </li>
          
          <li class="nav-item mx-0 mx-lg-1">
            <a class="nav-link py-3 px-0 px-lg-3 rounded js-scoll-trigger" href="#about">About</a>
          </li>
          
          
          <li class="nav-item mx-0 mx-lg-1">
            <a class="nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger" href="#surveys">Surveys</a>
          </li>
          <li class="nav-item mx-0 mx-lg-1">
            <a class="nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger" href="AdminLogin.jsp">Admin</a>
          </li>
          
          <li class="nav-item mx-0 mx-lg-1">
            <a class="nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger" href="#contact">Contact</a>
          </li>
          
        </ul>
      </div>
        <a class="navbar-brand js-scroll-trigger" href="#page-top">
          <img src="images/survey-tool.jpg" alt="" width="100%" height="100%">
      </a>
    </div>
  </nav>

  <header class="page-section bg-secondary text-white mb-0" id="home">
      <h1 class="page-section-heading text-uppercase text-center text-warning">Online Survey System</h1>
      <div class="divider-custom divider-light">
        <div class="divider-custom-line"></div>
        <div class="divider-custom-icon">
          <i class="fas fa-star"></i>
        </div>
        <div class="divider-custom-line"></div>
      </div>
      <div class="container">
        <div class="row">
            <div class="col-md-6 ml-auto">
                          <p class="lead">Select any of our Surveys</p>
            </div>
            <div class="col-md-6 mr-auto">
                <form action="survey.jsp" method="post">
                <select id="sname" required="">
            
                            <option value="">Please select</option>
                <%
                       Connection con;
                        PreparedStatement st;
                        ResultSet rs;

                        Class.forName("com.mysql.jdbc.Driver");
                        con = DriverManager.getConnection("jdbc:mysql://localhost/survey","root","");
                        st = con.prepareStatement("SELECT * FROM survey");
                        
                        rs=st.executeQuery();
                        
                        while(rs.next()){
                   %>
                   
                  
                      
                   <option value="<%=rs.getString("sid")%>"><%=rs.getString("sname")%></option>
                 <%
                   }                             
                  %> 

            </select>
                   <button type="submit">Open form</button>  
                </form>
            </div>  
</div>
                         
      </div>
  </header>

  

  <section class="page-section bg-secondary text-white mb-0" id="about">
    <div class="container">
      <h2 class="page-section-heading text-center text-uppercase text-white">About</h2>
      <div class="divider-custom divider-light">
        <div class="divider-custom-line"></div>
        <div class="divider-custom-icon">
          <i class="fas fa-star"></i>
        </div>
        <div class="divider-custom-line"></div>
      </div>
      <div class="row">
       <div class="col-lg-4 ml-auto">
          <p class="lead">The best Online Survey System. Engage with us. We value your say!!</p>
        </div>
        <div class="col-lg-4 mr-auto">
          <p class="lead">We are always happy to serve you to your satisfaction, hope you love our services.</p>
        </div>
      </div>     
    </div>
  </section>

  <!-- Contact Section -->
  <section class="page-section" id="contact">
    <div class="container">
      <h2 class="page-section-heading text-center text-uppercase text-secondary mb-0">Contact Me</h2>
      <div class="divider-custom">
        <div class="divider-custom-line"></div>
        <div class="divider-custom-icon">
          <i class="fas fa-star"></i>
        </div>
        <div class="divider-custom-line"></div>
      </div>
      <div class="row">
        <div class="col-lg-4 ml-auto">
          <i class="glyphicon glyphicon-phone"></i>
          </a>
          <p class="lead">Phone number:
              <br>(+254)7 06 245 760</p>
        </div>
        <div class="col-lg-4 mr-auto">
           <i class="glyphicon glyphicon-envelope"></i>
          <p class="lead">Email:
              <br>info@onlinesurvey.com</p>
        </div>
      </div>
    </div>
  </section>
  
  <!-- Footer -->
  <section class="page-section bg-secondary text-white mb-0">
    <div class="container">
      <div class="row">
        <div class="col-lg-4 mb-5 mb-lg-0">
          <h4 class="text-uppercase mb-4">Location</h4>
          <p class="lead mb-0">Yaya Towers
            <br>8th Floor, Room 803</p>
        </div>
        <div class="col-lg-4">
          <h4 class="text-uppercase mb-4">Facebook</h4>
          <a class="btn btn-outline-light btn-social mx-1" href="facebook.com/onlinesurvey">
            <i class="fab fa-fw fa-facebook-f"></i>
          </a>
          <p>Online Survey</p>
        </div>
        <div class="col-lg-4 mb-5">
          <h4 class="text-uppercase mb-4">Twitter</h4>
          <a class="btn btn-outline-light btn-social mx-1" href="twitter.com/onlinesurvey">
            <i class="fab fa-fw fa-twitter"></i>
          </a>
          <p>Online Survey</p>
        </div>
      </div>
    </div>
   </section>

  <!-- Copyright Section -->
  <section class="copyright py-4 text-center text-white fixed-bottom">
    <div class="container">
      <small>Copyright &copy; Online Survey 2021</small>
    </div>
  </section>

  <script src="vendor/jquery/jquery.min.js"></script>
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

  <!-- Plugin JavaScript -->
  <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

  <!-- Contact Form JavaScript -->
  <script src="js/jqBootstrapValidation.js"></script>
  <script src="js/contact_me.js"></script>

  <!-- Custom scripts for this template -->
  <script src="js/freelancer.min.js"></script>
  <script>
   function openForm() {
  document.getElementById("myForm").style.display = "block";
}

function closeForm() {
  document.getElementById("myForm").style.display = "none";
  }
  </script>
</body>

</html>

