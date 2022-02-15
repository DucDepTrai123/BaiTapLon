package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dang_002dky_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!--\n");
      out.write("Author: Colorlib\n");
      out.write("Author URL: https://colorlib.com\n");
      out.write("License: Creative Commons Attribution 3.0 Unported\n");
      out.write("License URL: http://creativecommons.org/licenses/by/3.0/\n");
      out.write("-->\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Creative Colorlib SignUp Form</title>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<!-- Custom Theme files -->\n");
      out.write("<link href=\"css/style2.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<!-- //Custom Theme files -->\n");
      out.write("<!-- web font -->\n");
      out.write("<link href=\"//fonts.googleapis.com/css?family=Roboto:300,300i,400,400i,700,700i\" rel=\"stylesheet\">\n");
      out.write("<!-- //web font -->\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<!-- main -->\n");
      out.write("\t<div class=\"main-w3layouts wrapper\">\n");
      out.write("\t\t<h1>Creative SignUp Form</h1>\n");
      out.write("\t\t<div class=\"main-agileinfo\">\n");
      out.write("\t\t\t<div class=\"agileits-top\">\n");
      out.write("\t\t\t\t<form action=\"RegisterControl\" method=\"post\">\n");
      out.write("\t\t\t\t\t<input class=\"text\" type=\"text\" name=\"username\" placeholder=\"Username\" required=\"\">\n");
      out.write("\t\t\t\t\t<input class=\"text\" type=\"password\" name=\"password\" placeholder=\"Password\" required=\"\">\n");
      out.write("\t\t\t\t\t<input class=\"text w3lpass\" type=\"password\" name=\"confirm\" placeholder=\"Confirm Password\" required=\"\">\n");
      out.write("\t\t\t\t\t<div class=\"wthree-text\">\n");
      out.write("\t\t\t\t\t\t<label class=\"anim\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"checkbox\" class=\"checkbox\" required=\"\">\n");
      out.write("\t\t\t\t\t\t\t<span>I Agree To The Terms & Conditions</span>\n");
      out.write("\t\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t\t\t<div class=\"clear\"> </div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<input type=\"submit\" value=\"SIGNUP\">\n");
      out.write("\t\t\t\t</form>\n");
      out.write("                            <p>Don't have an Account? <a href=\"Login.jsp\"> Login Now!</a></p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- copyright -->\n");
      out.write("\t\t<div class=\"colorlibcopy-agile\">\n");
      out.write("\t\t\t<p>© 2018 Colorlib Signup Form. All rights reserved | Design by <a href=\"https://colorlib.com/\" target=\"_blank\">Colorlib</a></p>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- //copyright -->\n");
      out.write("\t\t<ul class=\"colorlib-bubbles\">\n");
      out.write("\t\t\t<li></li>\n");
      out.write("\t\t\t<li></li>\n");
      out.write("\t\t\t<li></li>\n");
      out.write("\t\t\t<li></li>\n");
      out.write("\t\t\t<li></li>\n");
      out.write("\t\t\t<li></li>\n");
      out.write("\t\t\t<li></li>\n");
      out.write("\t\t\t<li></li>\n");
      out.write("\t\t\t<li></li>\n");
      out.write("\t\t\t<li></li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- //main -->\n");
      out.write("</body>\n");
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
