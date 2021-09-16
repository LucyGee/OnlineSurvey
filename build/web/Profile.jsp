<%-- 
    Document   : Profile
    Created on : Sep 16, 2021, 10:07:05 AM
    Author     : user
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">


  <title>Online Survey System</title>

  <link rel="icon" type="image/png" href="images/logo2.png"/>
  <link href="css/freelancer.css" rel="stylesheet">
     <link href="css/sb-admin-2.css" rel="stylesheet">

  <!-- Custom fonts for this template-->
  <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">

  <!-- Custom styles for this template-->
   

  
       
</head>

<body id="page-top">

  <!-- Navigation -->
  <ul class="navbar-nav ml-auto">
          <!-- Navigation -->
  <nav class="navbar navbar-expand-lg text-uppercase copyright" id="mainNav">
    <div class="container">
      <a class="navbar-brand js-scroll-trigger" href="#page-top">Welcome</a>
      <a class="navbar-brand js-scroll-trigger" href="#page-top">${admin.fname}</a>
     
    
          
          <li class="nav-item mx-0 mx-lg-1">
              <a href="#"  data-toggle="dropdown"><img src="images/user.png"><span class="dropdown-toggle"></span>                       
              <div class="dropdown-menu dropdown-menu-right user-dd animated">
                            <a class="dropdown-item" href="#ViewProfile"><span class="fa fa-user"></span> My Profile</a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item" href="newlogin.jsp"><i class="fa fa-power-off m-r-5 m-l-5"></i> Logout</a>
              </div>
              </a>
          </li>
        </ul>
      </div>
    </div>
  </nav>
      
      </ul>
     
      
  <div id="wrapper">

   
  <ul class="navbar-nav bg-gradient-primary sidebar sidebar-brand-text accordion" id="accordionSidebar">

      <!-- Sidebar - Brand -->
      <a class="sidebar-brand d-flex align-items-center justify-content-center" href="staff.jsp">
        <div class="sidebar-brand-icon rotate-n-15">
          <i class="fas fa-folder"></i>
        </div>
        <div class="sidebar-brand-text mx-3">Home</div>
      </a>

      <!-- Divider -->
      <hr class="sidebar-divider my-0">

      <!-- Nav Item - Dashboard -->
      <li class="nav-item active">
        <a class="nav-link" href="AdminHome.jsp">
          <i class="fas fa-list"></i>
          <span>Dashboard</span></a>
      </li>

      <!-- Divider -->
      <hr class="sidebar-divider">

      <!-- Nav Item - Pages Collapse Menu -->
      <li class="nav-item">
        <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseTwo" aria-expanded="true" aria-controls="collapseTwo">
          <i class="fas fa-fw fa-cog"></i>
          <span>Leaves</span>
        </a>
        <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionSidebar">
          <div class="bg-white py-2 collapse-inner rounded">
            <a class="collapse-item" href="allowedLeaves.jsp">Allowed</a>
            <a class="collapse-item" href="deniedLeaves.jsp">Denied</a>
            <a class="collapse-item" href="pendingLeaves.jsp">Pending</a>
            <a class="collapse-item" href="leaveapplication.jsp">Apply A Leave</a>
          </div>
        </div>
      </li>

      
      <!-- Divider -->
      <hr class="sidebar-divider">

      <li class="nav-item">
        <a class="nav-link" href="home.jsp">
          <i class="fas fa-fw fa-chart-area"></i>
          <span>Job Vacancies</span></a>
      </li>
      <hr class="sidebar-divider">

        </ul> 

    <!-- Content Wrapper -->
    <div id="content-wrapper" class="d-flex flex-column">

      <!-- Main Content -->
      <div id="content">
    
            <section class="page-section bg-info text-white mb-0" id="about">

            <div class="container">

      <!-- About Section Heading -->
      <h2 class="page-section-heading text-center text-uppercase text-white">Your Profile</h2>

      <!-- Icon Divider -->
      <div class="divider-custom divider-light">
        <div class="divider-custom-line"></div>
        <div class="divider-custom-icon">
          <i class="fas fa-star"></i>
        </div>
        <div class="divider-custom-line"></div>
      </div>

       <!-- About Section Content -->
      <div class="row">
        <div class="col-lg-4 ml-auto">
          <p class="lead">First Name</p>
        </div>
        <div class="col-lg-4 mr-auto">
          <p class="lead">${admin.fname}</p>
        </div>
        </div>
        <div class="row">
        <div class="col-lg-4 ml-auto">
          <p class="lead">Last Name</p>
        </div>
        <div class="col-lg-4 mr-auto">
          <p class="lead">${admin.lname}</p>
        </div>
        </div>
        <div class="row">
        <div class="col-lg-4 ml-auto">
          <p class="lead">Phone No</p>
        </div>
        <div class="col-lg-4 mr-auto">
          <p class="lead">${admin.phoneNo}</p>
        </div>
      </div>
        <div class="row">
        <div class="col-lg-4 ml-auto">
          <p class="lead">Email</p>
        </div>
        <div class="col-lg-4 mr-auto">
          <p class="lead">${admin.email}</p>
        </div>
      </div>

     
    </section>
          
      </div>
   </div>

  </div>
  <!-- Copyright Section -->
  <section class="copyright py-4 text-center text-white">
    <div class="container">
      <big>Copyright &copy; EvaMay Technologies 2020</big>
    </div>
  </section>

  

  <!-- Scroll to Top Button (Only visible on small and extra-small screen sizes) -->
  <div class="scroll-to-top d-lg-none position-fixed ">
    <a class="js-scroll-trigger d-block text-center text-white rounded" href="#page-top">
      <i class="fa fa-chevron-up"></i>
  </div>

 
  <!-- Bootstrap core JavaScript -->
  <script src="vendor/jquery/jquery.min.js"></script>
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  <!-- Plugin JavaScript -->
  <script src="vendor/jquery-easing/jquery.easing.min.js"></script>
  <script src="js/jqBootstrapValidation.js"></script>
  <script src="js/contact_me.js"></script>
  <!-- Custom scripts for this template -->    </a>

  <script src="js/freelancer.min.js"></script>

</body>

</html>



