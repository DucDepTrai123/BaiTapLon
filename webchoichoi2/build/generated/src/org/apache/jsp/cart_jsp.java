package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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

      out.write("\n");
      out.write("<!DOCTYPE HTML>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Footwear - Free Bootstrap 4 Template by Colorlib</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Montserrat:300,400,500,600,700\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Rokkitt:100,300,400,700\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Animate.css -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/animate.css\">\n");
      out.write("        <!-- Icomoon Icon Fonts-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/icomoon.css\">\n");
      out.write("        <!-- Ion Icon Fonts-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/ionicons.min.css\">\n");
      out.write("        <!-- Bootstrap  -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("        <!-- Magnific Popup -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/magnific-popup.css\">\n");
      out.write("\n");
      out.write("        <!-- Flexslider  -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/flexslider.css\">\n");
      out.write("\n");
      out.write("        <!-- Owl Carousel -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/owl.theme.default.min.css\">\n");
      out.write("\n");
      out.write("        <!-- Date Picker -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap-datepicker.css\">\n");
      out.write("        <!-- Flaticons  -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"fonts/flaticon/font/flaticon.css\">\n");
      out.write("\n");
      out.write("        <!-- Theme style  -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"colorlib-loader\"></div>\n");
      out.write("        <div id=\"page\">\n");
      out.write("            <nav class=\"colorlib-nav\" role=\"navigation\">\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.jsp", out, false);
      out.write("\n");
      out.write("                    <div class=\"sale\">\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-sm-8 offset-sm-2 text-center\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"owl-carousel2\">\n");
      out.write("                                            <div class=\"item\">\n");
      out.write("                                                <div class=\"col\">\n");
      out.write("                                                    <h3><a href=\"#\">25% off (Almost) Everything! Use Code: Summer Sale</a></h3>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"item\">\n");
      out.write("                                                <div class=\"col\">\n");
      out.write("                                                    <h3><a href=\"#\">Our biggest sale yet 50% off all summer shoes</a></h3>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("\n");
      out.write("                <div class=\"breadcrumbs\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col\">\n");
      out.write("                                <p class=\"bread\"><span><a href=\"home\">Home</a></span> / <span>Shopping Cart</span></p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"shopping-cart\">\n");
      out.write("                    <div class=\"px-4 px-lg-0\">\n");
      out.write("\n");
      out.write("                        <div class=\"pb-5\">\n");
      out.write("                            <div class=\"container\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-lg-12 p-5 bg-white rounded shadow-sm mb-5\">\n");
      out.write("\n");
      out.write("                                        <!-- Shopping cart table -->\n");
      out.write("                                        <div class=\"table-responsive\">\n");
      out.write("                                            <table class=\"table\">\n");
      out.write("                                                <thead>\n");
      out.write("                                                    <tr>\n");
      out.write("                                                        <th scope=\"col\" class=\"border-0 bg-light\">\n");
      out.write("                                                            <div class=\"p-2 px-3 text-uppercase\">S?n Ph?m</div>\n");
      out.write("                                                        </th>\n");
      out.write("                                                        <th scope=\"col\" class=\"border-0 bg-light\">\n");
      out.write("                                                            <div class=\"py-2 text-uppercase\">??n Giá</div>\n");
      out.write("                                                        </th>\n");
      out.write("                                                        <th scope=\"col\" class=\"border-0 bg-light\">\n");
      out.write("                                                            <div class=\"py-2 text-uppercase\">S? L??ng</div>\n");
      out.write("                                                        </th>\n");
      out.write("                                                        <th scope=\"col\" class=\"border-0 bg-light\">\n");
      out.write("                                                            <div class=\"py-2 text-uppercase\">Xóa</div>\n");
      out.write("                                                        </th>\n");
      out.write("                                                    </tr>\n");
      out.write("                                                </thead>\n");
      out.write("                                                <tbody>\n");
      out.write("                                                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                            </tbody>\n");
      out.write("                                        </table>\n");
      out.write("                                    </div>\n");
      out.write("                                    <!-- End -->\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"row py-5 p-4 bg-white rounded shadow-sm\">\n");
      out.write("                                <div class=\"col-lg-6\">\n");
      out.write("                                    <div class=\"bg-light rounded-pill px-4 py-3 text-uppercase font-weight-bold\">Voucher</div>\n");
      out.write("                                    <div class=\"p-4\">\n");
      out.write("                                        <div class=\"input-group mb-4 border rounded-pill p-2\">\n");
      out.write("                                            <input type=\"text\" placeholder=\"Nh?p Voucher\" aria-describedby=\"button-addon3\" class=\"form-control border-0\">\n");
      out.write("                                            <div class=\"input-group-append border-0\">\n");
      out.write("                                                <button id=\"button-addon3\" type=\"button\" class=\"btn btn-dark px-4 rounded-pill\"><i class=\"fa fa-gift mr-2\"></i>S? d?ng</button>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-lg-6\">\n");
      out.write("                                    <div class=\"bg-light rounded-pill px-4 py-3 text-uppercase font-weight-bold\">Thành ti?n</div>\n");
      out.write("                                    <div class=\"p-4\">\n");
      out.write("                                        <ul class=\"list-unstyled mb-4\">\n");
      out.write("                                            <li class=\"d-flex justify-content-between py-3 border-bottom\"><strong class=\"text-muted\">T?ng ti?n hàng</strong><strong>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${total}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</strong></li>\n");
      out.write("                                            <li class=\"d-flex justify-content-between py-3 border-bottom\"><strong class=\"text-muted\">Phí v?n chuy?n</strong><strong>Free ship</strong></li>\n");
      out.write("                                            <li class=\"d-flex justify-content-between py-3 border-bottom\"><strong class=\"text-muted\">VAT</strong><strong>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vat}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</strong></li>\n");
      out.write("                                            <li class=\"d-flex justify-content-between py-3 border-bottom\"><strong class=\"text-muted\">T?ng thanh toán</strong>\n");
      out.write("                                                <h5 class=\"font-weight-bold\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sum}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" ?</h5>\n");
      out.write("                                            </li>\n");
      out.write("                                        </ul><a href=\"order\" class=\"btn btn-dark rounded-pill py-2 btn-block\">Mua hàng</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div> \n");
      out.write("\n");
      out.write("            <footer id=\"colorlib-footer\" role=\"contentinfo\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row row-pb-md\">\n");
      out.write("                        <div class=\"col footer-col colorlib-widget\">\n");
      out.write("                            <h4>About Footwear</h4>\n");
      out.write("                            <p>Even the all-powerful Pointing has no control about the blind texts it is an almost unorthographic life</p>\n");
      out.write("                            <p>\n");
      out.write("                            <ul class=\"colorlib-social-icons\">\n");
      out.write("                                <li><a href=\"#\"><i class=\"icon-twitter\"></i></a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"icon-facebook\"></i></a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"icon-linkedin\"></i></a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"icon-dribbble\"></i></a></li>\n");
      out.write("                            </ul>\n");
      out.write("                            </p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col footer-col colorlib-widget\">\n");
      out.write("                            <h4>Customer Care</h4>\n");
      out.write("                            <p>\n");
      out.write("                            <ul class=\"colorlib-footer-links\">\n");
      out.write("                                <li><a href=\"#\">Contact</a></li>\n");
      out.write("                                <li><a href=\"#\">Returns/Exchange</a></li>\n");
      out.write("                                <li><a href=\"#\">Gift Voucher</a></li>\n");
      out.write("                                <li><a href=\"#\">Wishlist</a></li>\n");
      out.write("                                <li><a href=\"#\">Special</a></li>\n");
      out.write("                                <li><a href=\"#\">Customer Services</a></li>\n");
      out.write("                                <li><a href=\"#\">Site maps</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                            </p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col footer-col colorlib-widget\">\n");
      out.write("                            <h4>Information</h4>\n");
      out.write("                            <p>\n");
      out.write("                            <ul class=\"colorlib-footer-links\">\n");
      out.write("                                <li><a href=\"#\">About us</a></li>\n");
      out.write("                                <li><a href=\"#\">Delivery Information</a></li>\n");
      out.write("                                <li><a href=\"#\">Privacy Policy</a></li>\n");
      out.write("                                <li><a href=\"#\">Support</a></li>\n");
      out.write("                                <li><a href=\"#\">Order Tracking</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                            </p>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col footer-col\">\n");
      out.write("                            <h4>News</h4>\n");
      out.write("                            <ul class=\"colorlib-footer-links\">\n");
      out.write("                                <li><a href=\"blog.html\">Blog</a></li>\n");
      out.write("                                <li><a href=\"#\">Press</a></li>\n");
      out.write("                                <li><a href=\"#\">Exhibitions</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col footer-col\">\n");
      out.write("                            <h4>Contact Information</h4>\n");
      out.write("                            <ul class=\"colorlib-footer-links\">\n");
      out.write("                                <li>291 South 21th Street, <br> Suite 721 New York NY 10016</li>\n");
      out.write("                                <li><a href=\"tel://1234567920\">+ 1235 2355 98</a></li>\n");
      out.write("                                <li><a href=\"mailto:info@yoursite.com\">info@yoursite.com</a></li>\n");
      out.write("                                <li><a href=\"#\">yoursite.com</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"copy\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-12 text-center\">\n");
      out.write("                            <p>\n");
      out.write("                                <span><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\n");
      out.write("                                    Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class=\"icon-heart\" aria-hidden=\"true\"></i> by <a href=\"https://colorlib.com\" target=\"_blank\">Colorlib</a>\n");
      out.write("                                    <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></span> \n");
      out.write("                                <span class=\"block\">Demo Images: <a href=\"http://unsplash.co/\" target=\"_blank\">Unsplash</a> , <a href=\"http://pexels.com/\" target=\"_blank\">Pexels.com</a></span>\n");
      out.write("                            </p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </footer>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"gototop js-top\">\n");
      out.write("            <a href=\"#\" class=\"js-gotop\"><i class=\"ion-ios-arrow-up\"></i></a>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- jQuery -->\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <!-- popper -->\n");
      out.write("        <script src=\"js/popper.min.js\"></script>\n");
      out.write("        <!-- bootstrap 4.1 -->\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <!-- jQuery easing -->\n");
      out.write("        <script src=\"js/jquery.easing.1.3.js\"></script>\n");
      out.write("        <!-- Waypoints -->\n");
      out.write("        <script src=\"js/jquery.waypoints.min.js\"></script>\n");
      out.write("        <!-- Flexslider -->\n");
      out.write("        <script src=\"js/jquery.flexslider-min.js\"></script>\n");
      out.write("        <!-- Owl carousel -->\n");
      out.write("        <script src=\"js/owl.carousel.min.js\"></script>\n");
      out.write("        <!-- Magnific Popup -->\n");
      out.write("        <script src=\"js/jquery.magnific-popup.min.js\"></script>\n");
      out.write("        <script src=\"js/magnific-popup-options.js\"></script>\n");
      out.write("        <!-- Date Picker -->\n");
      out.write("        <script src=\"js/bootstrap-datepicker.js\"></script>\n");
      out.write("        <!-- Stellar Parallax -->\n");
      out.write("        <script src=\"js/jquery.stellar.min.js\"></script>\n");
      out.write("        <!-- Main -->\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                <tr>\n");
          out.write("                                                    <th scope=\"row\">\n");
          out.write("                                                        <div class=\"p-2\">\n");
          out.write("                                                            <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\" width=\"70\" class=\"img-fluid rounded shadow-sm\">\n");
          out.write("                                                            <div class=\"ml-3 d-inline-block align-middle\">\n");
          out.write("                                                                <h5 class=\"mb-0\"> <a href=\"#\" class=\"text-dark d-inline-block\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h5><span class=\"text-muted font-weight-normal font-italic\"></span>\n");
          out.write("                                                            </div>\n");
          out.write("                                                        </div>\n");
          out.write("                                                    </th>\n");
          out.write("                                                    <td class=\"align-middle\"><strong>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</strong></td>\n");
          out.write("                                                    <td class=\"align-middle\">\n");
          out.write("                                                        <a href=\"sub?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><button class=\"btnSub\">-</button></a> <strong>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.amount}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</strong>\n");
          out.write("                                                        <a href=\"cart?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><button class=\"btnAdd\">+</button></a>\n");
          out.write("                                                    </td>\n");
          out.write("                                                    <td class=\"align-middle\"><a href=\"remove?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"text-dark\">\n");
          out.write("                                                            <button type=\"button\" class=\"btn btn-danger\">Delete</button>\n");
          out.write("                                                        </a>\n");
          out.write("                                                    </td>\n");
          out.write("                                                </tr> \n");
          out.write("                                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
