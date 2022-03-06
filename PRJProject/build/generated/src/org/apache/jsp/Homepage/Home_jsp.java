package org.apache.jsp.Homepage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Document</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"home.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"base.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"grid.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css\">\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600;700&family=Roboto:wght@500&display=swap\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Dancing+Script:wght@400;500;600;700&family=Playfair+Display:ital,wght@0,400;0,500;1,400;1,900&family=Poppins:wght@300;400;500;600;700&family=Roboto:wght@100;500&display=swap\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Dancing+Script:wght@400;500;600;700&family=Poppins:wght@300;400;500;600;700&family=Roboto:wght@100;500&display=swap\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"main\">\n");
      out.write("        <header>\n");
      out.write("            <div class=\"header__largescreen\">\n");
      out.write("                <div class=\"header__ann\">\n");
      out.write("                    <p>Sản phẩm abcxyz đã tăng giá lên 50%, mọi người chú ý</p>\n");
      out.write("                 </div>\n");
      out.write("                 <div class=\"header row\">\n");
      out.write("                     <div class=\"header__logo lg-2 md-2\">\n");
      out.write("                         <img src=\"assets/img/pngtree-human-feet-icon-flat-style-png-image_1809427.jpg\" alt=\"\">\n");
      out.write("                         <a href=\"\">Shop giày dép</a>\n");
      out.write("                     </div>\n");
      out.write("                     <div class=\"header__navigation lg-6 md-6\">\n");
      out.write("                         <ul>\n");
      out.write("                             <li>\n");
      out.write("                                 <a href=\"\">Trang chủ</a>\n");
      out.write("                             </li>\n");
      out.write("                             <li class=\"parent\">\n");
      out.write("                                 <a href=\"\">Quản lý</a>\n");
      out.write("                                 <ul class=\"child\">\n");
      out.write("                                     <li>\n");
      out.write("                                         <a href=\"\">Đơn hàng</a>\n");
      out.write("                                     </li>\n");
      out.write("                                     <li>\n");
      out.write("                                         <a href=\"\">Sản phẩm</a>\n");
      out.write("                                     </li>                                     \n");
      out.write("                                 </ul>\n");
      out.write("                             </li>\n");
      out.write("                             <li>\n");
      out.write("                                 <a href=\"\">Giày</a>\n");
      out.write("                             </li>\n");
      out.write("                             <li>\n");
      out.write("                                 <a href=\"\">Dép</a>\n");
      out.write("                             </li>\n");
      out.write("                             <li class=\"parent\">\n");
      out.write("                                 <a href=\"#\">Phụ kiện</a>\n");
      out.write("                                 <ul class=\"child\">\n");
      out.write("                                     <li>\n");
      out.write("                                         <a href=\"#\">Áo mưa</a>\n");
      out.write("                                     </li>\n");
      out.write("                                     <li>\n");
      out.write("                                         <a href=\"#\">Gang tay</a>\n");
      out.write("                                     </li>\n");
      out.write("                                     <li>\n");
      out.write("                                         <a href=\"#\">Quần ủng</a>\n");
      out.write("                                     </li>\n");
      out.write("                                     <li>\n");
      out.write("                                         <a href=\"#\">Khác</a>\n");
      out.write("                                     </li>\n");
      out.write("                                     <li>\n");
      out.write("                                         <a href=\"\">Khác nữa</a>\n");
      out.write("                                     </li>\n");
      out.write("                                 </ul>\n");
      out.write("                             </li>\n");
      out.write("                             <li>    \n");
      out.write("                                 <a href=\"\">Liên hệ</a>\n");
      out.write("                             </li>\n");
      out.write("                         </ul>\n");
      out.write("                     </div>\n");
      out.write("                     <div class=\"header__tool lg-4 md-4\">\n");
      out.write("                         <ul>\n");
      out.write("                             <li class=\"search\">\n");
      out.write("                                 <div class=\"search__bigscreen\">\n");
      out.write("                                     <input type=\"text\" placeholder=\"Tìm kiếm...\">\n");
      out.write("                                     <i class=\"fa-solid fa-magnifying-glass\"></i> \n");
      out.write("                                 </div>\n");
      out.write("                             </li>\n");
      out.write("                             <li class=\"cart\">\n");
      out.write("                                 <a href=\"\"><i class=\"fa-solid fa-cart-shopping\"></i></a>\n");
      out.write("                             </li>\n");
      out.write("                             ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                             ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                         </ul>\n");
      out.write("                     </div>\n");
      out.write("                 </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-12 mobile__header\">\n");
      out.write("                <ul class=\"header__mobile--nav\">\n");
      out.write("                    <li class=\"header__logo\">\n");
      out.write("                        <img src=\"assets/img/pngtree-human-feet-icon-flat-style-png-image_1809427.jpg\" alt=\"\">\n");
      out.write("                        <a href=\"\">Shop giày dép</a>\n");
      out.write("                    </li> \n");
      out.write("    \n");
      out.write("                    <li class=\"cart\">\n");
      out.write("                        <a href=\"\"><i class=\"fa-solid fa-cart-shopping\"></i></a>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li class=\"header__bar\">\n");
      out.write("                        <i class=\"fa-solid fa-bars\"></i>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("                <ul class=\"mobile__nav\">\n");
      out.write("                    <li>\n");
      out.write("                        <div class=\"mobile__search\">\n");
      out.write("                            <input type=\"text\" placeholder=\"Tìm kiếm...\">\n");
      out.write("                            <i class=\"fa-solid fa-magnifying-glass\"></i> \n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"\">Trang chủ</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"\">Giày</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"\">Dép</a>\n");
      out.write("                        <!-- <ul class=\"child\">\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"\">Dép tổ ong</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"\">Dép tổ ong</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"\">Dép tổ ong</a>      \n");
      out.write("                            </li>\n");
      out.write("                        </ul> -->\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"parent\">\n");
      out.write("                        <a href=\"#\">Phụ kiện</a>\n");
      out.write("                        <ul class=\"child\">\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">Áo mưa</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">Gang tay</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">Quần ủng</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">Khác</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"\">Khác nữa</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"\">Liên hệ</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        Xin chào Vinhdeptrai\n");
      out.write("                        <!--<a href=\"../login\">Đăng Nhập-->\n");
      out.write("                    </a></li>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <div class=\"containerX\">\n");
      out.write("            <div class=\"slider row\">\n");
      out.write("                <div class=\"lg-6 sm-0 md-6\">\n");
      out.write("                    <img src=\"assets/img/hero_man.png\" alt=\"\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"lg-6 sm-12 md-6 slider__content\">\n");
      out.write("                    <div>\n");
      out.write("                        <p>Mua hàng giá rẻ</p>\n");
      out.write("                        <p>Cửa hàng giày dép</p>\n");
      out.write("                        <p>Đầy đủ mẫu mã</p>\n");
      out.write("                        <p>\n");
      out.write("                            Chuyên bán buôn các loại giày dép.\n");
      out.write("                        </p>\n");
      out.write("                        <p class=\"button\">\n");
      out.write("                            <a href=\"\">Mua ngay</a>\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div>\n");
      out.write("                <div class=\"container--wrapper\">\n");
      out.write("                    <h2>Phân loại Sản phẩm</h2>\n");
      out.write("                    <div class=\"row category\">\n");
      out.write("                        <div class=\"lg-4 md-6 sm-12 category__content\">\n");
      out.write("                            <img src=\"assets/img/sandal.png\" alt=\"\">\n");
      out.write("                            <div class=\"content--text\">\n");
      out.write("                                <a href=\"\">Dép, Sandals</a>\n");
      out.write("                                <h3>Giá tốt nhất</h3>              \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"lg-4 md-6 sm-12 category__content\">\n");
      out.write("                            <img src=\"assets/img/raincoat.jpg\" alt=\"\">\n");
      out.write("                            <div class=\"content--text\">\n");
      out.write("                                <a href=\"\">Áo mưa, phụ kiện</a>\n");
      out.write("                                <h3>Mẫu mã đa dạng</h3>\n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"lg-4 md-6 sm-12 category__content\">\n");
      out.write("                            <img src=\"assets/img/shoes.jpg\" alt=\"\">\n");
      out.write("                            <div class=\"content--text\">\n");
      out.write("                                <a href=\"\">Giày thể thao</a>\n");
      out.write("                                <h3>Giảm giá 50%</h3>\n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"latest_product\">\n");
      out.write("                    <h2>Sản phẩm mới nhất</h2>\n");
      out.write("                    <div class=\"product row\">\n");
      out.write("                        <div class=\"lg-3 md-4 sm-12 product--detail\">\n");
      out.write("                            <img src=\"assets/img/sampleproduct.jpg\" alt=\"\">\n");
      out.write("                            <span>New</span>\n");
      out.write("                            <div class=\"product--price\">\n");
      out.write("                                <a href=\"\">Giày thể thao cao cấp</a> <br>\n");
      out.write("                                <span>1.696.969₫</span>\n");
      out.write("                                <span>2.000.000₫</span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"lg-3 md-4 sm-12 product--detail\">\n");
      out.write("                            <img src=\"assets/img/sampleproduct.jpg\" alt=\"\">\n");
      out.write("                            <span>New</span>\n");
      out.write("                            <div class=\"product--price\">\n");
      out.write("                                <a href=\"\">Giày thể thao cao cấp</a> <br>\n");
      out.write("                                <span>1.696.969₫</span>\n");
      out.write("                                <span>2.000.000₫</span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"lg-3 md-4 sm-12 product--detail\">\n");
      out.write("                            <img src=\"assets/img/sampleproduct.jpg\" alt=\"\">\n");
      out.write("                            <span>New</span>\n");
      out.write("                            <div class=\"product--price\">\n");
      out.write("                                <a href=\"\">Giày thể thao cao cấp</a> <br>\n");
      out.write("                                <span>1.696.969₫</span>\n");
      out.write("                                <span>2.000.000₫</span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"lg-3 md-4 sm-12 product--detail\">\n");
      out.write("                            <img src=\"assets/img/sampleproduct.jpg\" alt=\"\">\n");
      out.write("                            <span>New</span>\n");
      out.write("                            <div class=\"product--price\">\n");
      out.write("                                <a href=\"\">Giày thể thao cao cấp</a> <br>\n");
      out.write("                                <span>1.696.969₫</span>\n");
      out.write("                                <span>2.000.000₫</span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"lg-3 md-4 sm-12 product--detail\">\n");
      out.write("                            <img src=\"assets/img/sampleproduct.jpg\" alt=\"\">\n");
      out.write("                            <span>New</span>\n");
      out.write("                            <div class=\"product--price\">\n");
      out.write("                                <a href=\"\">Giày thể thao cao cấp</a> <br>\n");
      out.write("                                <span>1.696.969₫</span>\n");
      out.write("                                <span>2.000.000₫</span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"lg-3 md-4 sm-12 product--detail\">\n");
      out.write("                            <img src=\"assets/img/sampleproduct.jpg\" alt=\"\">\n");
      out.write("                            <span>New</span>  \n");
      out.write("                            <div class=\"product--price\">\n");
      out.write("                                <a href=\"\">Giày thể thao cao cấp</a> <br>\n");
      out.write("                                <span>1.696.969₫</span>\n");
      out.write("                                <span>2.000.000₫</span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"conveyor__product\">\n");
      out.write("                <h2>Sản phẩm bán chạy</h2>\n");
      out.write("                <div class=\"owl-button\">\n");
      out.write("                    <i class=\"fa-solid fa-angle-left\" id=\"button--previous\"></i>\n");
      out.write("                    <i class=\"fa-solid fa-angle-right\" id=\"button--next\"></i>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"owl--warpper row\">\n");
      out.write("                    <div class=\"\">\n");
      out.write("                        <div class=\"owl\" draggable=\"true\">\n");
      out.write("                            <div class=\"owl-item\">\n");
      out.write("                                <img src=\"assets/img/shoes.jpg\" alt=\"\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"owl-item\">\n");
      out.write("                                <img src=\"assets/img/shoes.jpg\" alt=\"\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"owl-item\">\n");
      out.write("                                <img src=\"assets/img/shoes.jpg\" alt=\"\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"owl-item\">\n");
      out.write("                                <img src=\"assets/img/shoes.jpg\" alt=\"\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"owl-item\">\n");
      out.write("                                <img src=\"assets/img/shoes.jpg\" alt=\"\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"owl-item\">\n");
      out.write("                                <img src=\"assets/img/shoes.jpg\" alt=\"\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"owl-item\">\n");
      out.write("                                <img src=\"assets/img/shoes.jpg\" alt=\"\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"owl-item\">\n");
      out.write("                                <img src=\"assets/img/shoes.jpg\" alt=\"\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"owl-item\">\n");
      out.write("                                <img src=\"assets/img/shoes.jpg\" alt=\"\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"method row\">\n");
      out.write("                <div class=\"lg-3 md-6 sm-12\">\n");
      out.write("                    <img src=\"https://img.icons8.com/nolan/64/box.png\"/>\n");
      out.write("                    <h3>Chính hãng</h3>\n");
      out.write("                    <p>\n");
      out.write("                        Cam hết hàng chính hãng với mức giá phù hợp.\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"lg-3 md-6 sm-12\">\n");
      out.write("                    <img src=\"https://img.icons8.com/ios/50/000000/support.png\"/>\n");
      out.write("                    <h3>Hỗ trợ và tư vấn</h3>\n");
      out.write("                    <p>Liên hệ Hotline 0969696969 để được tư vấn miễn phí.</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"lg-3 md-6 sm-12\">\n");
      out.write("                    <img src=\"https://img.icons8.com/external-bartama-outline-64-bartama-graphic/64/000000/external-Shipping-e-commerce-outline-bartama-outline-64-bartama-graphic.png\"/>\n");
      out.write("                    <h3>Miễn phí giao hàng</h3>\n");
      out.write("                    <p>Đơn hàng được vận chuyển nhanh chóng và miễn phí.</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"lg-3 md-6 sm-12\">\n");
      out.write("                    <img src=\"https://img.icons8.com/ios/50/000000/exchange-pound.png\"/>\n");
      out.write("                    <h3>Chính sách đổi trả</h3>\n");
      out.write("                    <p>Đổi trả hàng miễn phí khi đủ điều kiện.</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"footer\">\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("<script src=\"home.js\"></script>\n");
      out.write("<script>\n");
      out.write("</script>\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account==null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <li class=\"login\">\n");
        out.write("                                    <a href=\"../login\">Đăng Nhập</a>\n");
        out.write("                                </li>\n");
        out.write("                             ");
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

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <li class=\"cart\">                        \n");
        out.write("                                    <a href=\"#\" class=\"user\">\n");
        out.write("                                        <i class=\"fa-solid fa-user\"></i>\n");
        out.write("                                    </a>\n");
        out.write("                                    <div class=\"expand-infor\">\n");
        out.write("                                        <a href=\"\"><i class=\"fa-solid fa-user-large\"></i> Nguyễn Thế Vinh</a> \n");
        out.write("                                        <a href=\"\">Đơn hàng đã mua</a>\n");
        out.write("                                        <a href=\"\">Đặt trước</a>\n");
        out.write("                                    </div>\n");
        out.write("                                </li>\n");
        out.write("                             ");
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
}
