package org.apache.jsp.ContactFrom_005fv14;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UpdateProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>Thêm sản phẩm</title>\n");
      out.write("\t<meta charset=\"UTF-8\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"icon\" type=\"image/png\" href=\"images/icons/favicon.ico\"/>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/bootstrap/css/bootstrap.min.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"fonts/font-awesome-4.7.0/css/font-awesome.min.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"fonts/iconic/css/material-design-iconic-font.min.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/animate/animate.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/css-hamburgers/hamburgers.min.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/animsition/css/animsition.min.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/select2/select2.min.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/daterangepicker/daterangepicker.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/util.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/main.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600;700&family=Roboto:wght@500&display=swap\" rel=\"stylesheet\">\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Dancing+Script:wght@400;500;600;700&family=Playfair+Display:ital,wght@0,400;0,500;1,400;1,900&family=Poppins:wght@300;400;500;600;700&family=Roboto:wght@100;500&display=swap\" rel=\"stylesheet\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css\">\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Dancing+Script:wght@400;500;600;700&family=Poppins:wght@300;400;500;600;700&family=Roboto:wght@100;500&display=swap\" rel=\"stylesheet\">\n");
      out.write("<link rel=\"stylesheet\" href=\"../Homepage/base.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"../Homepage/grid.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"../Homepage/home.css\">\n");
      out.write("</head>\n");
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
      out.write("                             <a href=\"..template/listproduct.jsp\">Giày</a>\n");
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
      out.write("                             <a href=\"\"><i class=\"fa-solid fa-cart-shopping\"></i></a>\n");
      out.write("                         </li>\n");
      out.write("                         <!-- <li class=\"login\"><a href=\"../\">Đăng Nhập</a></li> -->\n");
      out.write("                         <li class=\"cart\">                        \n");
      out.write("                            <a href=\"#\" class=\"user\">\n");
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
      out.write("                    <a href=\"\"><i class=\"fa-solid fa-cart-shopping\"></i></a>\n");
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
      out.write("\t<div class=\"container-contact100\">\n");
      out.write("\t\t<div class=\"wrap-contact100\">\n");
      out.write("                    <form class=\"contact100-form validate-form\" method=\"POST\" action=\"update\" enctype=\"multipart/form-data\">\n");
      out.write("\t\t\t\t<span class=\"contact100-form-title\">\n");
      out.write("\t\t\t\t\tCập nhật sản phẩm\n");
      out.write("\t\t\t\t</span>\n");
      out.write("                                <input type=\"hidden\" name=\"productID\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.product.productID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                <label class=\"label-input100\" for=\"phone\">Tên sản phẩm</label>\n");
      out.write("\t\t\t\t<div class=\"wrap-input100\">\n");
      out.write("\t\t\t\t\t<input id=\"phone\" class=\"input100\" type=\"text\" name=\"name\" placeholder=\"Tên sản phẩm\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.product.productName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("\t\t\t\t\t<span class=\"focus-input100\"></span>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<label class=\"label-input100\" for=\"message\" name=\"category\">Loại sản phẩm:</label>\n");
      out.write("\t\t\t\t<div class=\"wrap-input100\">\n");
      out.write("\t\t\t\t\t<select name=\"category\">\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t<label class=\"label-input100\" for=\"phone\">Giá</label>\n");
      out.write("\t\t\t\t<div class=\"wrap-input100\">\n");
      out.write("\t\t\t\t\t<input id=\"phone\" class=\"input100\" type=\"text\" name=\"price\" placeholder=\"Giá sản phẩm\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.product.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("\t\t\t\t\t<span class=\"focus-input100\"></span>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<label class=\"label-input100\" for=\"phone\">Số lượng trên 1 đơn vị</label>\n");
      out.write("\t\t\t\t<div class=\"wrap-input100\">\n");
      out.write("\t\t\t\t\t<input id=\"phone\" class=\"input100\" type=\"text\" name=\"QuantityPerUnit\" placeholder=\"Eg. 5\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.product.quantityPerUnit}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("\t\t\t\t\t<span class=\"focus-input100\"></span>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<label class=\"label-input100\" for=\"phone\">Giá bán ra</label>\n");
      out.write("\t\t\t\t<div class=\"wrap-input100\">\n");
      out.write("                    <input id=\"phone\" class=\"input100\" type=\"text\" name=\"retailprice\" placeholder=\"Eg. 15000\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.product.retailPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("\t\t\t\t\t<span class=\"focus-input100\"></span>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<label class=\"label-input100\" for=\"message\">Miêu tả sản phẩm</label>\n");
      out.write("\t\t\t\t<div class=\"wrap-input100\">\n");
      out.write("\t\t\t\t\t<textarea id=\"message\" class=\"input100\" name=\"description\" placeholder=\"Sản phẩm này có màu...\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.product.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</textarea>\n");
      out.write("\t\t\t\t\t<span class=\"focus-input100\"></span>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<label class=\"label-input100\" for=\"message\">Ảnh sản phẩm</label>\n");
      out.write("\t\t\t\t<div class=\"wrap-input100\" id=\"UploadImage\">\n");
      out.write("                    <div class=\"wrapper-image\">\n");
      out.write("                        <input id=\"phone\" class=\"input100\" type=\"file\" name=\"image\"> \n");
      out.write("                    </div>\t\t\t\t\n");
      out.write("\t\t\t\t</div>\t\t\t\t\n");
      out.write("\t\t\t\t<button id=\"AddMoreImage\" type=\"button\">Thêm ảnh+</button>\n");
      out.write("                                \n");
      out.write("                <label class=\"label-input100\" for=\"message\">Ảnh đã thêm</label>                               \n");
      out.write("                <div class=\"addedImage\" style=\"display:flex\">\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                </div>\n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("\t\t\t\t<label class=\"label-input100\" for=\"message\">Phân loại theo</label>\n");
      out.write("\t\t\t\t<div class=\"wrapper--sku wrap-input100\">\n");
      out.write("\t\t\t\t\t<label class=\"label-input100\" for=\"message\">Màu sắc</label>\n");
      out.write("\t\t\t\t\t<div class=\"smallblock--color\">\n");
      out.write("                                            ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                   \n");
      out.write("\t\t\t\t\t<button class=\"AddMoreSku\" type=\"button\">Thêm +</button>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<label class=\"label-input100\" for=\"message\">Kích thước</label>\n");
      out.write("\t\t\t\t\t<div class=\"smallblock--size\">\n");
      out.write("                                            ");
      if (_jspx_meth_c_forEach_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t</div>                \n");
      out.write("\t\t\t\t\t<button class=\"AddMoreSku\" type=\"button\">Thêm +</button>\n");
      out.write("                                        <button type=\"button\" class=\"apply\">Áp dụng</button>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<label class=\"label-input100\" for=\"message\">Lưu ý: Khí ấn \"Áp dụng\", số lượng sẽ phải nhập lại từ đầu.</label>\n");
      out.write("\n");
      out.write("\t\t\t\t<label class=\"label-input100\" for=\"message\">Nhập số lượng</label>\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"tableQuantity\">\n");
      out.write("                 \n");
      out.write("                    <table border=\"1px solid black\">\n");
      out.write("                        <tbody class=\"drawtable\">\n");
      out.write("                           \n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"container-contact100-form-btn\">\n");
      out.write("\t\t\t\t\t<button class=\"contact100-form-btn\">\n");
      out.write("\t\t\t\t\t\t<span>\n");
      out.write("\t\t\t\t\t\t\tCập nhật sản phẩm\n");
      out.write("\t\t\t\t\t\t\t<i class=\"zmdi zmdi-arrow-right m-l-8\"></i>\n");
      out.write("\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"vendor/jquery/jquery-3.2.1.min.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"vendor/animsition/js/animsition.min.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"vendor/bootstrap/js/popper.js\"></script>\n");
      out.write("\t<script src=\"vendor/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"vendor/select2/select2.min.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"vendor/daterangepicker/moment.min.js\"></script>\n");
      out.write("\t<script src=\"vendor/daterangepicker/daterangepicker.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"vendor/countdowntime/countdowntime.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"../Homepage/home.js\"></script>\n");
      out.write("\t<script src=\"js/main.js\"></script>\n");
      out.write("    <script src=\"js/removeimageadded.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Global site tag (gtag.js) - Google Analytics -->\n");
      out.write("<script async src=\"https://www.googletagmanager.com/gtag/js?id=UA-23581568-13\"></script>\n");
      out.write("<script>\n");
      out.write("  window.dataLayer = window.dataLayer || [];\n");
      out.write("  function gtag(){dataLayer.push(arguments);}\n");
      out.write("  gtag('js', new Date());\n");
      out.write("\n");
      out.write("  gtag('config', 'UA-23581568-13');\n");
      out.write("  \n");
      out.write("    function product(colorID, sizeID, quantity){\n");
      out.write("        this.colorID = colorID;\n");
      out.write("        this.sizeID = sizeID;\n");
      out.write("        this.quantity = quantity;\n");
      out.write("    }\n");
      out.write("    const listProducts = [];\n");
      out.write("    ");
      if (_jspx_meth_c_forEach_4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("    function color(colorID, color){\n");
      out.write("        this.colorID = colorID;\n");
      out.write("        this.color = color;\n");
      out.write("    }\n");
      out.write("    const listColors = [];\n");
      out.write("    function size(sizeID, size){\n");
      out.write("        this.size = size;\n");
      out.write("        this.sizeID = sizeID;\n");
      out.write("    }\n");
      out.write("    const listSizes = [];\n");
      out.write("    \n");
      out.write("    ");
      if (_jspx_meth_c_forEach_5(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_c_forEach_6(_jspx_page_context))
        return;
      out.write("\n");
      out.write("     \n");
      out.write("//    listColors.forEach(element => {\n");
      out.write("//        document.querySelector(\".smallblock--color\").innerHTML+='<div class=\"wrap-input100 sku--color\">\n");
      out.write("//        <input type=\"text\" class=\"input100 color\" name=\"color\" value=\"'+element.color+'\">\n");
      out.write("//        <button class=\"RemoveSKU\">x</button>\n");
      out.write("//        </div>'\n");
      out.write("//    });\n");
      out.write("//    \n");
      out.write("//    listSizes.forEach(element => {\n");
      out.write("//        document.querySelector(\".smallblock--size\").innerHTML+='<div class=\"wrap-input100 sku--size\"><input type=\"text\" class=\"input100 size\" name=\"size\" value=\"'+element.size+'\"><button class=\"RemoveSKU\">x</button></div>'\n");
      out.write("//    });    \n");
      out.write("\n");
      out.write("    window.onload = function(){\n");
      out.write("        drawTableBeta(listProducts, 0);\n");
      out.write("        document.querySelectorAll(\".RemoveSKU\").forEach(element => {\n");
      out.write("            element.onclick = function(){\n");
      out.write("                element.type=\"button\";\n");
      out.write("                element.parentElement.remove();    \n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("    }\n");
      out.write("    document.querySelector(\".apply\").onclick = function(){\n");
      out.write("        addMore();\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</body>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.listCategories}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("category");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                            <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category.categoryID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"\n");
          out.write("                                    ");
          if (_jspx_meth_c_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                            >");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category.categoryName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                        ");
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

  private boolean _jspx_meth_c_if_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category.categoryID==requestScope.product.category.categoryID}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        selected\n");
        out.write("                                    ");
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

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.product.listImages}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("img");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("                                   \n");
          out.write("                        <div class=\"wrapper-imageadded\">\n");
          out.write("                            <img src=\"../");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${img.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                            <input type=\"hidden\" name=\"imagedeltedid\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${img.imageID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                            <input type=\"hidden\" name=\"imagedeltedname\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${img.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                            <button type=\"button\" class=\"removeImageAdded\">x</button>\n");
          out.write("                        </div>\n");
          out.write("                    ");
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

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.product.listColors}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setVar("c");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write(" \n");
          out.write("                                                ");
          if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("\n");
          out.write("                                            ");
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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.color!='None'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                    <div class=\"wrap-input100 sku--color\">\n");
        out.write("                                                        <input type=\"text\" class=\"input100 color\" name=\"color\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.color}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("                                                        <button class=\"RemoveSKU\">x</button>\n");
        out.write("                                                    </div>\n");
        out.write("                                                ");
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
    _jspx_th_c_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.product.listSizes}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_3.setVar("s");
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write(" \n");
          out.write("                                                ");
          if (_jspx_meth_c_if_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_3, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
            return true;
          out.write("\n");
          out.write("                                            ");
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

  private boolean _jspx_meth_c_if_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_3);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.size!='None'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                    <div class=\"wrap-input100 sku--size\">\n");
        out.write("                                                        <input type=\"text\" class=\"input100 size\" name=\"size\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("                                                        <button class=\"RemoveSKU\">x</button>\n");
        out.write("                                                    </div>\n");
        out.write("                                                ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_forEach_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_4 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_4.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_4.setParent(null);
    _jspx_th_c_forEach_4.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.product.listColor_Sizes}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_4.setVar("cs");
    int[] _jspx_push_body_count_c_forEach_4 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_4 = _jspx_th_c_forEach_4.doStartTag();
      if (_jspx_eval_c_forEach_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
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
          int evalDoAfterBody = _jspx_th_c_forEach_4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_4.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_4);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_5 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_5.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_5.setParent(null);
    _jspx_th_c_forEach_5.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.product.listColors}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_5.setVar("c");
    int[] _jspx_push_body_count_c_forEach_5 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_5 = _jspx_th_c_forEach_5.doStartTag();
      if (_jspx_eval_c_forEach_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("        listColors.push(new color(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.colorID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(", '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.color}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("'))\n");
          out.write("    ");
          int evalDoAfterBody = _jspx_th_c_forEach_5.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_5.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_5);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_6 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_6.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_6.setParent(null);
    _jspx_th_c_forEach_6.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.product.listSizes}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_6.setVar("s");
    int[] _jspx_push_body_count_c_forEach_6 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_6 = _jspx_th_c_forEach_6.doStartTag();
      if (_jspx_eval_c_forEach_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("        listSizes.push(new size(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.sizeID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(", '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("'))\n");
          out.write("    ");
          int evalDoAfterBody = _jspx_th_c_forEach_6.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_6[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_6.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_6.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_6);
    }
    return false;
  }
}
