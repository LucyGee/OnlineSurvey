package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class survey_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"row\">\n");
      out.write("       <div class=\"wrap-login100\">\n");
      out.write("                    <form id=\"form-container\" method=\"post\" action=\"AddSurvey\">\n");
      out.write("                      <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-6 ml-auto\">\n");
      out.write("                          <p class=\"lead\">Survey Name</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6 mr-auto\">\n");
      out.write("                        <p class=\"lead\">Survey Name</p>\n");
      out.write("                        </div>\n");
      out.write("                      </div> \n");
      out.write("                        <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-6 ml-auto\">\n");
      out.write("                          <p class=\"lead\">Question 1</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6 mr-auto\">\n");
      out.write("                        <p class=\"lead\">Survey Name</p>\n");
      out.write("                     </div>\n");
      out.write("                        </div>\n");
      out.write("                       <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-6 mr-auto\">\n");
      out.write("                        <input type=\"radio\" class=\"input100\" value=\"\">\n");
      out.write("                     </div>\n");
      out.write("                        <div class=\"col-md-6 mr-auto\">\n");
      out.write("                        <input type=\"radio\" class=\"input100\" value=\"\">\n");
      out.write("                        </div>\n");
      out.write("                       </div>\n");
      out.write("                      <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-6 ml-auto\">\n");
      out.write("                          <p class=\"lead\">Question 1</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6 mr-auto\">\n");
      out.write("                        <p class=\"lead\">Survey Name</p>\n");
      out.write("                     </div>\n");
      out.write("                        </div>\n");
      out.write("                       <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-6 mr-auto\">\n");
      out.write("                        <input type=\"radio\" class=\"input100\" value=\"\">\n");
      out.write("                     </div>\n");
      out.write("                        <div class=\"col-md-6 mr-auto\">\n");
      out.write("                        <input type=\"radio\" class=\"input100\" value=\"\">\n");
      out.write("                        </div>\n");
      out.write("                       </div>\n");
      out.write("                       <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-6 ml-auto\">\n");
      out.write("                          <p class=\"lead\">Question 1</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6 mr-auto\">\n");
      out.write("                        <p class=\"lead\">Survey Name</p>\n");
      out.write("                     </div>\n");
      out.write("                        </div>\n");
      out.write("                       <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-6 mr-auto\">\n");
      out.write("                        <input type=\"radio\" class=\"input100\" value=\"\">\n");
      out.write("                     </div>\n");
      out.write("                        <div class=\"col-md-6 mr-auto\">\n");
      out.write("                        <input type=\"radio\" class=\"input100\" value=\"\">\n");
      out.write("                        </div>\n");
      out.write("                       </div>\n");
      out.write("                        \n");
      out.write("                       <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-6 ml-auto\">\n");
      out.write("                          <p class=\"lead\">Question 1</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6 mr-auto\">\n");
      out.write("                        <p class=\"lead\">Survey Name</p>\n");
      out.write("                     </div>\n");
      out.write("                        </div>\n");
      out.write("                       <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-6 mr-auto\">\n");
      out.write("                        <input type=\"radio\" class=\"input100\" value=\"\">\n");
      out.write("                     </div>\n");
      out.write("                        <div class=\"col-md-6 mr-auto\">\n");
      out.write("                        <input type=\"radio\" class=\"input100\" value=\"\">\n");
      out.write("                        </div>\n");
      out.write("                       </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-6 ml-auto\">\n");
      out.write("                          <p class=\"lead\">Question 1</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6 mr-auto\">\n");
      out.write("                        <p class=\"lead\">Survey Name</p>\n");
      out.write("                     </div>\n");
      out.write("                        </div>\n");
      out.write("                       <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-6 mr-auto\">\n");
      out.write("                        <input type=\"radio\" class=\"input100\" value=\"\">\n");
      out.write("                     </div>\n");
      out.write("                        <div class=\"col-md-6 mr-auto\">\n");
      out.write("                        <input type=\"radio\" class=\"input100\" value=\"\">\n");
      out.write("                        </div>\n");
      out.write("                       </div>\n");
      out.write("                        <input type=\"hidden\" class=\"input100\" id=\"optionb\" name=\"adminId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${admin.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                        <center>\n");
      out.write("                            <button type=\"submit\" class=\"login100-form-btn\">CREATE</button>\n");
      out.write("                        </center>\n");
      out.write("                    </form>\n");
      out.write("       </div>\n");
      out.write("      </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
