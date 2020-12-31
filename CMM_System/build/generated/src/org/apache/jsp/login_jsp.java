package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/asset/bootstrapScript.jsp");
  }

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
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("        <title>CMMS - Login</title>\n");
      out.write("\n");
      out.write("        <!-- Custom fonts for this template-->\n");
      out.write("        <link href=\"vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link\n");
      out.write("            href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\"\n");
      out.write("            rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Custom styles for this template-->\n");
      out.write("        <link href=\"css/sb-admin-2.min.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("            <!-- Outer Row -->\n");
      out.write("            <div class=\"row justify-content-center\">\n");
      out.write("\n");
      out.write("                <div class=\"col-xl-10 col-lg-12 col-md-9\">\n");
      out.write("\n");
      out.write("                    <div class=\"card o-hidden border-0 shadow-lg my-5\">\n");
      out.write("                        <div class=\"card-body p-0\">\n");
      out.write("                            <!-- Nested Row within Card Body -->\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-lg-6 d-none d-lg-block bg-login-image\"></div>\n");
      out.write("                                <div class=\"col-lg-6\">\n");
      out.write("                                    <div class=\"p-5\">\n");
      out.write("                                        <div class=\"text-center\">\n");
      out.write("                                            <h1 class=\"h4 text-gray-900 mb-4\">Welcome Back!</h1>\n");
      out.write("                                        </div>\n");
      out.write("                                        <form class=\"user\">\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <input type=\"email\" class=\"form-control form-control-user\"\n");
      out.write("                                                    id=\"exampleInputEmail\" aria-describedby=\"emailHelp\"\n");
      out.write("                                                    placeholder=\"Enter Email Address...\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <input type=\"password\" class=\"form-control form-control-user\"\n");
      out.write("                                                    id=\"exampleInputPassword\" placeholder=\"Password\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <div class=\"custom-control custom-checkbox small\">\n");
      out.write("                                                    <input type=\"checkbox\" class=\"custom-control-input\" id=\"customCheck\">\n");
      out.write("                                                    <label class=\"custom-control-label\" for=\"customCheck\">Remember\n");
      out.write("                                                        Me</label>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <a href=\"index.html\" class=\"btn btn-primary btn-user btn-block\">\n");
      out.write("                                                Login\n");
      out.write("                                            </a>\n");
      out.write("                                            <hr>\n");
      out.write("                                            <a href=\"index.html\" class=\"btn btn-google btn-user btn-block\">\n");
      out.write("                                                <i class=\"fab fa-google fa-fw\"></i> Login with Google\n");
      out.write("                                            </a>\n");
      out.write("                                            <a href=\"index.html\" class=\"btn btn-facebook btn-user btn-block\">\n");
      out.write("                                                <i class=\"fab fa-facebook-f fa-fw\"></i> Login with Facebook\n");
      out.write("                                            </a>\n");
      out.write("                                        </form>\n");
      out.write("                                        <hr>\n");
      out.write("                                        <div class=\"text-center\">\n");
      out.write("                                            <a class=\"small\" href=\"forgot-password.html\">Forgot Password?</a>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"text-center\">\n");
      out.write("                                            <a class=\"small\" href=\"register.html\">Create an Account!</a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        ");
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
      out.write("        <!-- Bootstrap core JavaScript-->\n");
      out.write("        <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("        <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Core plugin JavaScript-->\n");
      out.write("        <script src=\"vendor/jquery-easing/jquery.easing.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Custom scripts for all pages-->\n");
      out.write("        <script src=\"js/sb-admin-2.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Page level plugins -->\n");
      out.write("        <script src=\"vendor/chart.js/Chart.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Page level custom scripts -->\n");
      out.write("        <script src=\"js/demo/chart-area-demo.js\"></script>\n");
      out.write("        <script src=\"js/demo/chart-pie-demo.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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