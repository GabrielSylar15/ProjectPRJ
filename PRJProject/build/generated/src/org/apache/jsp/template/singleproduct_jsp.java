package org.apache.jsp.template;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class singleproduct_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!doctype html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\">\n");
      out.write("    <title>Chi tiết sản phẩm</title>\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <link rel=\"manifest\" href=\"site.webmanifest\">\n");
      out.write("    <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"assets/img/favicon.ico\">\n");
      out.write("\n");
      out.write("    <!-- CSS here -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/owl.carousel.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/flaticon.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css\">\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/slicknav.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/animate.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/magnific-popup.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/fontawesome-all.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/themify-icons.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/slick.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/nice-select.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../Homepage/base.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../Homepage/grid.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../Homepage/home.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../Homepage/toast.css\">\n");
      out.write("</head>\n");
      out.write("    \n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <header>\n");
      out.write("        <div class=\"header__largescreen\">\n");
      out.write("            <div class=\"header__ann\">\n");
      out.write("                <p>Sản phẩm abcxyz đã tăng giá lên 50%, mọi người chú ý💥 Sản phẩm abc đã tăng giá lên 50%, mọi người chú ý💥 </p>\n");
      out.write("             </div>\n");
      out.write("             <div class=\"header row\">\n");
      out.write("                 <div class=\"header__logo lg-2 md-2\">\n");
      out.write("                     <img src=\"../Homepage/assets/img/pngtree-human-feet-icon-flat-style-png-image_1809427.jpg\" alt=\"\">\n");
      out.write("                  \n");
      out.write("                     <a href=\"\">Shop giày dép</a>\n");
      out.write("                 </div>\n");
      out.write("                 <div class=\"header__navigation lg-6 md-6\">\n");
      out.write("                     <ul>\n");
      out.write("                         <li>\n");
      out.write("                             <a href=\"../Homepage/Home.jsp\">Trang chủ</a>\n");
      out.write("                         </li>\n");
      out.write("                         <li>\n");
      out.write("                             <a href=\"listproduct.jsp\">Giày</a>\n");
      out.write("                         </li>\n");
      out.write("                         <li>\n");
      out.write("                             <a href=\"\">Dép</a>\n");
      out.write("                         </li>\n");
      out.write("                         <li class=\"parent\">\n");
      out.write("                             <a href=\"#\">Phụ kiện</a>\n");
      out.write("                             <ul class=\"child\">\n");
      out.write("                                 <li>\n");
      out.write("                                     <a href=\"#\">Áo mưa</a>\n");
      out.write("                                 </li>\n");
      out.write("                                 <li>\n");
      out.write("                                     <a href=\"#\">Gang tay</a>\n");
      out.write("                                 </li>\n");
      out.write("                                 <li>\n");
      out.write("                                     <a href=\"#\">Quần ủng</a>\n");
      out.write("                                 </li>\n");
      out.write("                                 <li>\n");
      out.write("                                     <a href=\"#\">Khác</a>\n");
      out.write("                                 </li>\n");
      out.write("                                 <li>\n");
      out.write("                                     <a href=\"\">Khác nữa</a>\n");
      out.write("                                 </li>\n");
      out.write("                             </ul>\n");
      out.write("                         </li>\n");
      out.write("                         <li>    \n");
      out.write("                             <a href=\"\">Liên hệ</a>\n");
      out.write("                         </li>\n");
      out.write("                     </ul>\n");
      out.write("                 </div>\n");
      out.write("                 <div class=\"header__tool lg-4 md-4\">\n");
      out.write("                     <ul>\n");
      out.write("                         <li class=\"search\">\n");
      out.write("                             <div class=\"search__bigscreen\">\n");
      out.write("                                 <input type=\"text\" placeholder=\"Tìm kiếm...\">\n");
      out.write("                                 <i class=\"fa-solid fa-magnifying-glass\"></i> \n");
      out.write("                             </div>\n");
      out.write("                         </li>\n");
      out.write("                         <li class=\"cart\">\n");
      out.write("                             <a href=\"order\"><i class=\"fa-solid fa-cart-shopping\"></i></a>\n");
      out.write("                         </li>\n");
      out.write("                         <!-- <li class=\"login\"><a href=\"../\">Đăng Nhập</a></li> -->\n");
      out.write("                         <li class=\"cart\">                        \n");
      out.write("                            <a href=\"\" class=\"user\">\n");
      out.write("                                <i class=\"fa-solid fa-user\"></i>\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"expand-infor\">\n");
      out.write("                                <a href=\"\"><i class=\"fa-solid fa-user-large\"></i> Nguyễn Thế Vinh</a> \n");
      out.write("                                <a href=\"\">VinhNT</a>\n");
      out.write("                                <a href=\"\">Đơn hàng đã mua</a>\n");
      out.write("                                <a href=\"\">Đặt trước</a>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                     </ul>\n");
      out.write("                 </div>\n");
      out.write("             </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"col-12 mobile__header\">\n");
      out.write("            <ul class=\"header__mobile--nav\">\n");
      out.write("                <li class=\"header__logo\">\n");
      out.write("                    <img src=\"../Homepage/assets/img/pngtree-human-feet-icon-flat-style-png-image_1809427.jpg\" alt=\"\">\n");
      out.write("                    <a href=\"\">Shop giày dép</a>\n");
      out.write("                </li> \n");
      out.write("\n");
      out.write("                <li class=\"cart\">\n");
      out.write("                    <a href=\"order\"><i class=\"fa-solid fa-cart-shopping\"></i></a>\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("                <li class=\"header__bar\">\n");
      out.write("                    <i class=\"fa-solid fa-bars\"></i>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("            <ul class=\"mobile__nav\">\n");
      out.write("                <li>\n");
      out.write("                    <div class=\"mobile__search\">\n");
      out.write("                        <input type=\"text\" placeholder=\"Tìm kiếm...\">\n");
      out.write("                        <i class=\"fa-solid fa-magnifying-glass\"></i> \n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"\">Trang chủ</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"\">Giày</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"\">Dép</a>\n");
      out.write("                    <!-- <ul class=\"child\">\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"\">Dép tổ ong</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"\">Dép tổ ong</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"\">Dép tổ ong</a>      \n");
      out.write("                        </li>\n");
      out.write("                    </ul> -->\n");
      out.write("                </li>\n");
      out.write("                <li class=\"parent\">\n");
      out.write("                    <a href=\"#\">Phụ kiện</a>\n");
      out.write("                    <ul class=\"child\">\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\">Áo mưa</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\">Gang tay</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\">Quần ủng</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\">Khác</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"\">Khác nữa</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"\">Liên hệ</a>\n");
      out.write("                </li>\n");
      out.write("                <li><a href=\"\">Đăng Nhập</a></li>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    <!-- slider Area Start-->\n");
      out.write("    <div class=\"slider-area \">\n");
      out.write("        <!-- Mobile Menu -->\n");
      out.write("        <div class=\"single-slider slider-height2 d-flex align-items-center\" data-background=\"assets/img/hero/category.jpg\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-xl-12\">\n");
      out.write("                        <div class=\"hero-cap text-center\">\n");
      out.write("                            <h2>Chi tiết sản phẩm</h2>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- slider Area End-->\n");
      out.write("\n");
      out.write("  <!--================Single Product Area =================-->\n");
      out.write("  <div class=\"product_image_area\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-lg-5\">\n");
      out.write("          <div class=\"product_img_slide owl-carousel\">\n");
      out.write("              ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-lg-7\">\n");
      out.write("          <div class=\"single_product_text text-center\">\n");
      out.write("            <h3>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.product.productName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3>\n");
      out.write("            <p>\n");
      out.write("               ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.product.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("            </p>\n");
      out.write("            <div class=\"wrapper-color\">\n");
      out.write("                Màu sắc:\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"wrapper-size\">\n");
      out.write("                Size:\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("            \n");
      out.write("            </div>\n");
      out.write("            <div class=\"card_area\">\n");
      out.write("                <div class=\"product_count_area\">\n");
      out.write("                    <p style=\"text-align:left\">Số lượng:</p>\n");
      out.write("                    <div class=\"product_count d-inline-block\">\n");
      out.write("                        <span class=\"product_count_item inumber-decrement\"> <i class=\"ti-minus\"></i></span>\n");
      out.write("                        <input class=\"product_count_item input-number\" type=\"text\" value=\"1\" min=\"0\" max=\"10\">\n");
      out.write("                        <span class=\"product_count_item number-increment\"> <i class=\"ti-plus\"></i></span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <p style=\"text-align:left\">Giá:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${  requestScope.product.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>  \n");
      out.write("            <p style=\"text-align:left\" id=\"instock\"></p>\n");
      out.write("            <div class=\"button-add-to-cart\">\n");
      out.write("                <div class=\"add_to_cart\">\n");
      out.write("                  <a href=\"#\" class=\"btn_3\">Thêm vào giỏ hàng</a>\n");
      out.write("                </div>  \n");
      out.write("                <div class=\"add_to_cart\">\n");
      out.write("                  <a href=\"#\" class=\"btn_1\">Mua ngay</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("    <div class=\"toast\">\n");
      out.write("    </div>\n");
      out.write("  <!--================End Single Product Area =================-->\n");
      out.write("   <!-- subscribe part here -->\n");
      out.write("   <section class=\"subscribe_part section_padding\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("          <div class=\"row justify-content-center\">\n");
      out.write("              <div class=\"col-lg-8\">\n");
      out.write("                  <div class=\"subscribe_part_content\">\n");
      out.write("                      <h2>Get promotions & updates!</h2>\n");
      out.write("                      <p>Seamlessly empower fully researched growth strategies and interoperable internal or “organic” sources credibly innovate granular internal .</p>\n");
      out.write("                      <div class=\"subscribe_form\">\n");
      out.write("                          <input type=\"email\" placeholder=\"Enter your mail\">\n");
      out.write("                          <a href=\"#\" class=\"btn_1\">Subscribe</a>\n");
      out.write("                      </div>\n");
      out.write("                  </div>\n");
      out.write("              </div>\n");
      out.write("          </div>\n");
      out.write("      </div>\n");
      out.write("  </section>\n");
      out.write("  <!-- subscribe part end -->\n");
      out.write("\n");
      out.write("  <footer>\n");
      out.write("    <!-- Footer Start-->\n");
      out.write("    <div class=\"footer-area footer-padding\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row d-flex justify-content-between\">\n");
      out.write("                <div class=\"col-xl-3 col-lg-3 col-md-5 col-sm-6\">\n");
      out.write("                   <div class=\"single-footer-caption mb-50\">\n");
      out.write("                     <div class=\"single-footer-caption mb-30\">\n");
      out.write("                          <!-- logo -->\n");
      out.write("                         <div class=\"footer-logo\">\n");
      out.write("                             <a href=\"index.html\"><img src=\"assets/img/logo/logo2_footer.png\" alt=\"\"></a>\n");
      out.write("                         </div>\n");
      out.write("                         <div class=\"footer-tittle\">\n");
      out.write("                             <div class=\"footer-pera\">\n");
      out.write("                                 <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit sed do eiusmod tempor incididunt ut labore.</p>\n");
      out.write("                            </div>\n");
      out.write("                         </div>\n");
      out.write("                     </div>\n");
      out.write("                   </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-xl-2 col-lg-3 col-md-3 col-sm-5\">\n");
      out.write("                    <div class=\"single-footer-caption mb-50\">\n");
      out.write("                        <div class=\"footer-tittle\">\n");
      out.write("                            <h4>Quick Links</h4>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"#\">About</a></li>\n");
      out.write("                                <li><a href=\"#\"> Offers & Discounts</a></li>\n");
      out.write("                                <li><a href=\"#\"> Get Coupon</a></li>\n");
      out.write("                                <li><a href=\"#\">  Contact Us</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-xl-3 col-lg-3 col-md-4 col-sm-7\">\n");
      out.write("                    <div class=\"single-footer-caption mb-50\">\n");
      out.write("                        <div class=\"footer-tittle\">\n");
      out.write("                            <h4>New Products</h4>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"#\">Woman Cloth</a></li>\n");
      out.write("                                <li><a href=\"#\">Fashion Accessories</a></li>\n");
      out.write("                                <li><a href=\"#\"> Man Accessories</a></li>\n");
      out.write("                                <li><a href=\"#\"> Rubber made Toys</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-xl-3 col-lg-3 col-md-5 col-sm-7\">\n");
      out.write("                    <div class=\"single-footer-caption mb-50\">\n");
      out.write("                        <div class=\"footer-tittle\">\n");
      out.write("                            <h4>Support</h4>\n");
      out.write("                            <ul>\n");
      out.write("                             <li><a href=\"#\">Frequently Asked Questions</a></li>\n");
      out.write("                             <li><a href=\"#\">Terms & Conditions</a></li>\n");
      out.write("                             <li><a href=\"#\">Privacy Policy</a></li>\n");
      out.write("                             <li><a href=\"#\">Privacy Policy</a></li>\n");
      out.write("                             <li><a href=\"#\">Report a Payment Issue</a></li>\n");
      out.write("                         </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- Footer bottom -->\n");
      out.write("            <div class=\"row\">\n");
      out.write("             <div class=\"col-xl-7 col-lg-7 col-md-7\">\n");
      out.write("                 <div class=\"footer-copy-right\">\n");
      out.write("                     <p><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\n");
      out.write("  Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class=\"ti-heart\" aria-hidden=\"true\"></i> by <a href=\"https://colorlib.com\" target=\"_blank\">Colorlib</a>\n");
      out.write("  <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></p>                    </div>\n");
      out.write("             </div>\n");
      out.write("              <div class=\"col-xl-5 col-lg-5 col-md-5\">\n");
      out.write("                 <div class=\"footer-copy-right f-right\">\n");
      out.write("                     <!-- social -->\n");
      out.write("                     <div class=\"footer-social\">\n");
      out.write("                         <a href=\"#\"><i class=\"fab fa-twitter\"></i></a>\n");
      out.write("                         <a href=\"#\"><i class=\"fab fa-facebook-f\"></i></a>\n");
      out.write("                         <a href=\"#\"><i class=\"fab fa-behance\"></i></a>\n");
      out.write("                         <a href=\"#\"><i class=\"fas fa-globe\"></i></a>\n");
      out.write("                     </div>\n");
      out.write("                 </div>\n");
      out.write("             </div>\n");
      out.write("         </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Footer End-->\n");
      out.write("  </footer>\n");
      out.write("\n");
      out.write("<!-- JS here -->\n");
      out.write("        <!-- All JS Custom Plugins Link Here here -->\n");
      out.write("        <script src=\"./assets/js/vendor/modernizr-3.5.0.min.js\"></script>\n");
      out.write("        \n");
      out.write("        <!-- Jquery, Popper, Bootstrap -->\n");
      out.write("        <script src=\"./assets/js/vendor/jquery-1.12.4.min.js\"></script>\n");
      out.write("        <script src=\"./assets/js/popper.min.js\"></script>\n");
      out.write("        <script src=\"./assets/js/bootstrap.min.js\"></script>\n");
      out.write("        <!-- Jquery Mobile Menu -->\n");
      out.write("        <script src=\"./assets/js/jquery.slicknav.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Jquery Slick , Owl-Carousel Plugins -->\n");
      out.write("        <script src=\"./assets/js/owl.carousel.min.js\"></script>\n");
      out.write("        <script src=\"./assets/js/slick.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- One Page, Animated-HeadLin -->\n");
      out.write("        <script src=\"./assets/js/wow.min.js\"></script>\n");
      out.write("        <script src=\"./assets/js/animated.headline.js\"></script>\n");
      out.write("        <script src=\"./assets/js/jquery.magnific-popup.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Scrollup, nice-select, sticky -->\n");
      out.write("        <script src=\"./assets/js/jquery.scrollUp.min.js\"></script>\n");
      out.write("        <script src=\"./assets/js/jquery.nice-select.min.js\"></script>\n");
      out.write("        <script src=\"./assets/js/jquery.sticky.js\"></script>\n");
      out.write("        \n");
      out.write("        <!-- contact js -->\n");
      out.write("        <script src=\"./assets/js/contact.js\"></script>\n");
      out.write("        <script src=\"./assets/js/jquery.form.js\"></script>\n");
      out.write("        <script src=\"./assets/js/jquery.validate.min.js\"></script>\n");
      out.write("        <script src=\"./assets/js/mail-script.js\"></script>\n");
      out.write("        <script src=\"./assets/js/jquery.ajaxchimp.min.js\"></script>\n");
      out.write("        \n");
      out.write("        <!-- Jquery Plugins, main Jquery -->    \n");
      out.write("        <script src=\"./assets/js/plugins.js\"></script>\n");
      out.write("        <script src=\"./assets/js/main.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- swiper js -->\n");
      out.write("        <script src=\"./assets/js/swiper.min.js\"></script>\n");
      out.write("            <!-- swiper js -->\n");
      out.write("        <script src=\"./assets/js/mixitup.min.js\"></script>\n");
      out.write("        <script src=\"./assets/js/jquery.counterup.min.js\"></script>\n");
      out.write("        <script src=\"./assets/js/waypoints.min.js\"></script>\n");
      out.write("\n");
      out.write("        <script src=\"../Homepage/home.js\"></script>\n");
      out.write("        <script src=\"../Homepage/toast.js\"></script>\n");
      out.write("\n");
      out.write("       <!--<script src=\"BuyProduct.js\"></script>-->\n");
      out.write("</body>\n");
      out.write("<script>\n");
      out.write("    function product(colorID, sizeID, quantity){\n");
      out.write("        this.colorID = colorID;\n");
      out.write("        this.sizeID = sizeID;\n");
      out.write("        this.quantity = quantity;\n");
      out.write("    }\n");
      out.write("    const listProducts = [];\n");
      out.write("    ");
      if (_jspx_meth_c_forEach_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    var sizeindex,colorindex;\n");
      out.write("    if(listProducts[0].colorID==0)  colorindex=0;\n");
      out.write("    if(listProducts[0].sizeID==0)   sizeindex=0;\n");
      out.write("    function ClickButton(){\n");
      out.write("        var sizes = document.querySelectorAll(\".size\");\n");
      out.write("        var colors = document.querySelectorAll(\".color\");\n");
      out.write("        var temp=0;\n");
      out.write("        sizes.forEach((element, index) => {\n");
      out.write("            element.onclick = function(){\n");
      out.write("                temp=index+1;\n");
      out.write("                sizes.forEach(e => {\n");
      out.write("                    e.setAttribute(\"style\",\"background-color:none\");\n");
      out.write("                });\n");
      out.write("                sizeindex=temp;\n");
      out.write("                element.setAttribute(\"style\",\"background-color:skyblue\");\n");
      out.write("                if(colorindex!=null){\n");
      out.write("                    listProducts.forEach(p => {\n");
      out.write("                        if(p.colorID==colorindex&&p.sizeID==sizeindex){\n");
      out.write("                            document.getElementById(\"instock\").innerHTML = p.quantity+\" sản phẩm có sẵn\";\n");
      out.write("                        }\n");
      out.write("                    });\n");
      out.write("                }\n");
      out.write("            }      \n");
      out.write("        });\n");
      out.write("        \n");
      out.write("        colors.forEach((element, index) => {\n");
      out.write("            element.onclick = function(){\n");
      out.write("                temp=index+1;\n");
      out.write("                colors.forEach(e => {\n");
      out.write("                    e.setAttribute(\"style\",\"background-color:none\");\n");
      out.write("                });\n");
      out.write("                colorindex = temp;\n");
      out.write("                element.setAttribute(\"style\",\"background-color:skyblue\");\n");
      out.write("                if(sizeindex!=null){\n");
      out.write("                    listProducts.forEach(p => {\n");
      out.write("                        if(p.colorID==colorindex&&p.sizeID==sizeindex){\n");
      out.write("                            document.getElementById(\"instock\").innerHTML = p.quantity+\" sản phẩm có sẵn\";\n");
      out.write("                        }\n");
      out.write("                    });\n");
      out.write("                }\n");
      out.write("            }      \n");
      out.write("        });\n");
      out.write("    }\n");
      out.write("    ClickButton(); \n");
      out.write("    document.querySelector(\".btn_3\").onclick = function(){\n");
      out.write("        if(sizeindex==null||colorindex==null){\n");
      out.write("            Alert({\n");
      out.write("                type: \"error\",\n");
      out.write("                content: \"Bạn cần chọn sản phẩm cần mua\"\n");
      out.write("            })\n");
      out.write("        }\n");
      out.write("        else{\n");
      out.write("            if(parseInt(document.querySelector(\".input-number\").value)>parseInt(document.querySelector(\"#instock\").innerHTML.split(\" \")[0])){\n");
      out.write("                Alert({\n");
      out.write("                    type: \"error\",\n");
      out.write("                    content: \"Bạn đã thêm vượt số lượng tối đa trong kho\"\n");
      out.write("                })\n");
      out.write("            } \n");
      out.write("            else if((parseInt(document.querySelector(\".input-number\").value)==0)){\n");
      out.write("                Alert({\n");
      out.write("                    type: \"error\",\n");
      out.write("                    content: \"Nhập số lượng cần mua\"\n");
      out.write("                })\n");
      out.write("            }\n");
      out.write("            else{\n");
      out.write("                Alert({\n");
      out.write("                    type: \"success\",\n");
      out.write("                    content: \"Sản phẩm đã được thêm vào giỏ hàng của bạn\"\n");
      out.write("                })\n");
      out.write("                var xttp = new XMLHttpRequest();\n");
      out.write("                var quantity = parseInt(document.querySelector(\".input-number\").value);\n");
      out.write("                xttp.open(\"GET\",\"cart?cid=\"+colorindex+\"&sid=\"+sizeindex+\"&quantity=\"+quantity+\"&pid=\"+");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.product.productID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(");\n");
      out.write("                xttp.send();\n");
      out.write("            }\n");
      out.write("        }     \n");
      out.write("    }\n");
      out.write("\n");
      out.write("</script>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.product.listImages}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("img");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                <div class=\"single_product_img\">\n");
          out.write("                    <img src=\"../");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${img.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"#\" class=\"img-fluid\">\n");
          out.write("                </div>    \n");
          out.write("              ");
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

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.product.listColors}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("c");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    ");
          if (_jspx_meth_c_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.color!='None'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        <span class=\"color\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.color}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span>   \n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.product.listSizes}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setVar("s");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    ");
          if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.size!='None'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <span class=\"size\" >");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span>  \n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_forEach_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent(null);
    _jspx_th_c_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.product.listColor_Sizes}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_3.setVar("cs");
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("        listProducts.push(new product(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cs.colorID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(',');
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cs.sizeID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(',');
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cs.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("))\n");
          out.write("    ");
          int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_3.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_3);
    }
    return false;
  }
}
