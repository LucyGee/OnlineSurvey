package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdminRegistration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>EvaMay Technologies</title>\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"images/logo2.png\"/>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("        <link href=\"css/studentRegistration.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/bootstrap/css/bootstrap.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"fonts/font-awesome-4.7.0/css/font-awesome.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"fonts/iconic/css/material-design-iconic-font.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/animate/animate.css\">\t\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/css-hamburgers/hamburgers.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/animsition/css/animsition.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/select2/select2.min.css\">\t\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/daterangepicker/daterangepicker.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/util.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/main.css\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"limiter\">\n");
      out.write("            <div class=\"container-login100\" style=\"background-image: url('images/office2.jpg');\">\n");
      out.write("                <div class=\"wrap-login100\">\n");
      out.write("                    <form class=\"form-container\" method=\"post\" action=\"staffRegistration2.jsp\" name=\"staff_registration_form\" id=\"staff_registration_form\">\n");
      out.write("                        <span class=\"login100-form-logo\">\n");
      out.write("                            <img src='images/logo2.png' alt='logo' width=\"200%\" height=\"100%\">\n");
      out.write("\t\t\t</span>\n");
      out.write("                        <span class=\"login100-form-title p-b-34 p-t-27\">\n");
      out.write("                            Admin Registration Form\n");
      out.write("\t\t\t</span>\n");
      out.write("                        \n");
      out.write("                        <div class=\"login100-form\">\n");
      out.write("                          <label for=\"fname\">First Name:</label>\n");
      out.write("                          <input type=\"text\" class=\"input100\" id=\"fname\" name=\"fname\" placeholder=\"First Name\" pattern=\"[A-Za-z']+\" title=\"alphabets and ' only\" required>\n");
      out.write("                        </div>\n");
      out.write("                     \n");
      out.write("                        <div class=\"login100-form\">\n");
      out.write("                          <label for=\"lname\">Last Name:</label>\n");
      out.write("                          <input type=\"text\" class=\"input100\" id=\"lname\" name=\"lname\" placeholder=\"Last Name\" pattern=\"[A-Za-z']+\" title=\"alphabets and ' only\" required>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"login100-form\">\n");
      out.write("                          <label for=\"email\">Email Address:</label>\n");
      out.write("                          <input type=\"email\" class=\"input100\" id=\"email\" name=\"email\" placeholder=\"xyz@abc.com\" pattern=\"[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}$\" title=\"Use the correct format -----@---.----\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"login100-form\">\n");
      out.write("                          <label for=\"phone_no\">Phone Number</label>\n");
      out.write("                          <input type=\"tel\" class=\"input100\" id=\"phoneNo\" name=\"phoneNo\" placeholder=\"0712345678\" pattern=\"[0]+[7]+[0-9]{8,8}\"  title=\"valid phone numbers only e.g 07--\" minlength=\"10\" maxlength=\"10\" required>\n");
      out.write("                        </div>\n");
      out.write("                \n");
      out.write("                        <div class=\"login100-form\">\n");
      out.write("                          <label for=\"password\">Password</label>\n");
      out.write("                          <input type=\"text\" class=\"input100\" id=\"password\" name=\"password\" placeholder=\"\"  minlength=\"8\" maxlength=\"15\" required>\n");
      out.write("                        </div>\n");
      out.write("                \n");
      out.write("                         <br>\n");
      out.write("                        <center>\n");
      out.write("                            <button type=\"submit\" class=\"login100-form-btn\">Next</button>\n");
      out.write("                        </center>\n");
      out.write("                    </form>\n");
      out.write("                    \n");
      out.write("\t\t</div>\n");
      out.write("            </div>\n");
      out.write("\t</div>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
