<%-- 
    Document   : cart
    Created on : Mar 16, 2022, 5:53:13 PM
    Author     : ADMIN
--%>

<%@page import="model.Cart"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html lang="zxx">
<head>
  <meta charset="utf-8">
  <meta http-equiv="x-ua-compatible" content="ie=edge">
  <title>Giỏ hàng</title>
  <meta name="description" content="">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="manifest" href="site.webmanifest">
  <link rel="shortcut icon" type="image/x-icon" href="assets/img/favicon.ico">

  <!-- CSS here -->
      <link rel="stylesheet" href="assets/css/bootstrap.min.css">
      <link rel="stylesheet" href="assets/css/owl.carousel.min.css">
      <link rel="stylesheet" href="assets/css/flaticon.css">
      <link rel="stylesheet" href="assets/css/slicknav.css">
      <link rel="stylesheet" href="assets/css/animate.min.css">
      <link rel="stylesheet" href="assets/css/magnific-popup.css">
      <link rel="stylesheet" href="assets/css/fontawesome-all.min.css">
      <link rel="stylesheet" href="assets/css/themify-icons.css">
      <link rel="stylesheet" href="assets/css/slick.css">
      <link rel="stylesheet" href="assets/css/nice-select.css">
      <link rel="stylesheet" href="assets/css/style.css">
      <!--  -->
      <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600;700&family=Roboto:wght@500&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Dancing+Script:wght@400;500;600;700&family=Playfair+Display:ital,wght@0,400;0,500;1,400;1,900&family=Poppins:wght@300;400;500;600;700&family=Roboto:wght@100;500&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css">
    <link href="https://fonts.googleapis.com/css2?family=Dancing+Script:wght@400;500;600;700&family=Poppins:wght@300;400;500;600;700&family=Roboto:wght@100;500&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="../Homepage/base.css">
    <link rel="stylesheet" href="../Homepage/grid.css">
    <link rel="stylesheet" href="../Homepage/home.css">
</head>

<body>
<% int count=0; %>   
        <header>
            <div class="header__largescreen">
                <div class="header__ann">
                    <p>Sản phẩm abcxyz đã tăng giá lên 50%, mọi người chú ý</p>
                 </div>
                 <div class="header row">
                     <div class="header__logo lg-2 md-2">
                         <img src="../Homepage/assets/img/pngtree-human-feet-icon-flat-style-png-image_1809427.jpg" alt="">
                         <a href="">Shop giày dép</a>
                     </div>
                     <div class="header__navigation lg-6 md-6">
                         <ul>
                             <li>
                                 <a href="#">Trang chủ</a>
                             </li>
                             <c:if test="${sessionScope.account.isAdmin}">
                                <li class="parent">
                                    <a href="">Quản lý</a>
                                    <ul class="child">
                                        <li>
                                            <a href="">Đơn hàng</a>
                                        </li>
                                        <li>
                                            <a href="">Sản phẩm</a>
                                        </li>                                     
                                    </ul>
                                </li>
                             </c:if>
                             <li>
                                 <a href="../template/displayproducts">Giày</a>
                             </li>
                             <li>
                                 <a href="">Dép</a>
                             </li>
                             <li class="parent">
                                 <a href="#">Phụ kiện</a>
                                 <ul class="child">
                                     <li>
                                         <a href="#">Áo mưa</a>
                                     </li>
                                     <li>
                                         <a href="#">Gang tay</a>
                                     </li>
                                     <li>
                                         <a href="#">Quần ủng</a>
                                     </li>
                                     <li>
                                         <a href="#">Khác</a>
                                     </li>
                                     <li>
                                         <a href="">Khác nữa</a>
                                     </li>
                                 </ul>
                             </li>
                             <li>    
                                 <a href="">Liên hệ</a>
                             </li>
                         </ul>
                     </div>
                     <div class="header__tool lg-4 md-4">
                         <ul>
                             <li class="search">
                                 <div class="search__bigscreen">
                                     <input type="text" placeholder="Tìm kiếm...">
                                     <i class="fa-solid fa-magnifying-glass"></i> 
                                 </div>
                             </li>
                             <li class="cart">
                                 <a href=""><i class="fa-solid fa-cart-shopping"></i></a>
                             </li>
                             <c:if test="${sessionScope.account==null}">
                                <li class="login">
                                    <a href="../login">Đăng Nhập</a>
                                </li>
                             </c:if>

                             <c:if test="${sessionScope.account!=null}">
                                <li class="cart">                        
                                    <a href="#" class="user">
                                        <i class="fa-solid fa-user"></i>
                                    </a>
                                    <div class="expand-infor">
                                        <a href=""><i class="fa-solid fa-user-large"></i>${sessionScope.account.displayName}</a> 
                                        <a href="">Đơn hàng đã mua</a>
                                        <a href="">Đặt trước</a>
                                        <a href="../logout">Đăng xuất</a>
                                    </div>
                                </li>
                             </c:if>
                         </ul>
                     </div>
                 </div>
            </div>

            <div class="col-12 mobile__header">
                <ul class="header__mobile--nav">
                    <li class="header__logo">
                        <img src="assets/img/pngtree-human-feet-icon-flat-style-png-image_1809427.jpg" alt="">
                        <a href="">Shop giày dép</a>
                    </li> 
    
                    <li class="cart">
                        <a href=""><i class="fa-solid fa-cart-shopping"></i></a>
                    </li>

                    <li class="header__bar">
                        <i class="fa-solid fa-bars"></i>
                    </li>
                </ul>

                <ul class="mobile__nav">
                    <li>
                        <div class="mobile__search">
                            <input type="text" placeholder="Tìm kiếm...">
                            <i class="fa-solid fa-magnifying-glass"></i> 
                        </div>
                    </li>
                    <li>
                        <a href="">Trang chủ</a>
                    </li>
                    <li>
                        <a href="">Giày</a>
                    </li>
                    <li>
                        <a href="">Dép</a>
                        <!-- <ul class="child">
                            <li>
                                <a href="">Dép tổ ong</a>
                            </li>
                            <li>
                                <a href="">Dép tổ ong</a>
                            </li>
                            <li>
                                <a href="">Dép tổ ong</a>      
                            </li>
                        </ul> -->
                    </li>
                    <li class="parent">
                        <a href="#">Phụ kiện</a>
                        <ul class="child">
                            <li>
                                <a href="#">Áo mưa</a>
                            </li>
                            <li>
                                <a href="#">Gang tay</a>
                            </li>
                            <li>
                                <a href="#">Quần ủng</a>
                            </li>
                            <li>
                                <a href="#">Khác</a>
                            </li>
                            <li>
                                <a href="">Khác nữa</a>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <a href="">Liên hệ</a>
                    </li>
                    <li>
                        Xin chào Vinhdeptrai
                        <!--<a href="../login">Đăng Nhập-->
                    </a></li>
                </ul>

            </div>
        </header>



  <!-- slider Area Start-->
  <div class="slider-area ">
    <!-- Mobile Menu -->
    <div class="single-slider slider-height2 d-flex align-items-center" data-background="assets/img/hero/category.jpg">
        <div class="container">
            <div class="row">
                <div class="col-xl-12">
                    <div class="hero-cap text-center">
                        <h2>Giỏ hàng</h2>
                    </div>
                </div>
            </div>
        </div>
    </div>
  </div>
  <!-- slider Area End-->

  <!--================Cart Area =================-->
  <section class="cart_area section_padding">
    <div class="container">
      <div class="cart_inner">
        <div class="table-responsive">
          <table class="table">
            <thead>
              <tr>
                <th scope="col">Sản phẩm</th>
                <th scope="col">Giá</th>
                <th scope="col">Số lượng</th>
                <th scope="col">Thành tiền</th>
                <th scope="col">Thao tác</th>
              </tr>
            </thead>
            <tbody>
            <c:if test="${requestScope.cart!=null}">
             <c:forEach items="${requestScope.cart.listProducts}" var="p">
            <%
                Cart c = (Cart) request.getAttribute("cart");
                ArrayList<String> listPrices =c.getListPrices();
            %>
                <tr>                
                  <td>
                    <div class="media">
                      <div class="d-flex">
                        <img src="../${p.image}" alt="" />
                      </div>
                      <div class="media-body">
                        <p>${p.productName}</p>
                        <p>
                            <c:if test="${p.color!='None'}">
                                Màu sắc: ${p.color}
                            </c:if>
                        </p>
                        <p>
                            <c:if test="${p.size!='None'}">
                                Kích thước: ${p.size}
                            </c:if>
                        </p>
                      </div>
                    </div>
                  </td>
                  <td>
                    <h5 class="price">${p.price}₫</h5>
                  </td>                  
                  <td>
                    <div class="product_count">
                      <h5>
                          <button class="add" value="pid=${p.productID}&sid=${p.sizeID}&cid=${p.colorID}&num=1">+</button>
                          ${p.quantity}
                          <button class="minus" value="pid=${p.productID}&sid=${p.sizeID}&cid=${p.colorID}&num=-1">-</button></h5>
                    </div>
                  </td>
                  <td>
                      <h5 class="totalmoney"><%=listPrices.get(count)%>₫</h5>
                      <% count+=1; %>
                  </td>
                  <td>
                    <h5>Xóa<i class="fa-solid fa-circle-trash"></i></h5>
                  </td>
                </tr>
              </c:forEach>               
            </c:if>
                
              <tr class="bottom_button">
                <td>
                  <a class="btn_1" href="#">Mua thêm</a>
                </td>
                <td></td>
                <td></td>
                <td>
                  <!-- <div class="cupon_text float-right">
                    <a class="btn_1" href="#">Close Coupon</a>
                  </div> -->
                </td>
              </tr>
              
              <tr>
                <td></td>
                <td></td>
                <td>
                  <h5>Tổng số tiền</h5>
                </td>
                <td>
                    <h5>${requestScope.cart.totalMoney}</h5>
                </td>
              </tr>
              <tr class="shipping_area">
                <td></td>
                <td></td>
                <td>
                  <h5>Shipping</h5>
                </td>
                <td>
                  <div class="shipping_box">
                    <ul class="list">
                      <li>
                        Flat Rate: $5.00
                        <input type="radio" aria-label="Radio button for following text input">
                      </li>
                      <li>
                        Free Shipping
                        <input type="radio" aria-label="Radio button for following text input">
                      </li>
                      <li>
                        Flat Rate: $10.00
                        <input type="radio" aria-label="Radio button for following text input">
                      </li>
                      <li class="active">
                        Local Delivery: $2.00
                        <input type="radio" aria-label="Radio button for following text input">
                      </li>
                    </ul>
                    <h6>
                      Calculate Shipping
                      <i class="fa fa-caret-down" aria-hidden="true"></i>
                    </h6>
                    <select class="shipping_select">
                      <option value="1">Bangladesh</option>
                      <option value="2">India</option>
                      <option value="4">Pakistan</option>
                    </select>
                    <select class="shipping_select section_bg">
                      <option value="1">Select a State</option>
                      <option value="2">Select a State</option>
                      <option value="4">Select a State</option>
                    </select>
                    <input class="post_code" type="text" placeholder="Postcode/Zipcode" />
                    <a class="btn_1" href="#">Update Details</a>
                  </div>
                </td>
              </tr>
            </tbody>
          </table>
          <div class="checkout_btn_inner float-right">
            <a class="btn_1" href="#">Continue Shopping</a>
            <a class="btn_1 checkout_btn_1" href="#">Proceed to checkout</a>
          </div>
        </div>
      </div>
  </section>
  <!--================End Cart Area =================-->

<footer>
    <!-- Footer Start-->
    <div class="footer-area footer-padding2">
        <div class="container">
            <div class="row d-flex justify-content-between">
                <div class="col-xl-3 col-lg-3 col-md-5 col-sm-6">
                   <div class="single-footer-caption mb-50">
                     <div class="single-footer-caption mb-30">
                          <!-- logo -->
                         <div class="footer-logo">
                             <a href="index.html"><img src="assets/img/logo/logo2_footer.png" alt=""></a>
                         </div>
                         <div class="footer-tittle">
                             <div class="footer-pera">
                                 <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit sed do eiusmod tempor incididunt ut labore.</p>
                            </div>
                         </div>
                     </div>
                   </div>
                </div>
                <div class="col-xl-2 col-lg-3 col-md-3 col-sm-5">
                    <div class="single-footer-caption mb-50">
                        <div class="footer-tittle">
                            <h4>Quick Links</h4>
                            <ul>
                                <li><a href="#">About</a></li>
                                <li><a href="#"> Offers & Discounts</a></li>
                                <li><a href="#"> Get Coupon</a></li>
                                <li><a href="#">  Contact Us</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
                <div class="col-xl-3 col-lg-3 col-md-4 col-sm-7">
                    <div class="single-footer-caption mb-50">
                        <div class="footer-tittle">
                            <h4>New Products</h4>
                            <ul>
                                <li><a href="#">Woman Cloth</a></li>
                                <li><a href="#">Fashion Accessories</a></li>
                                <li><a href="#"> Man Accessories</a></li>
                                <li><a href="#"> Rubber made Toys</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
                <div class="col-xl-3 col-lg-3 col-md-5 col-sm-7">
                    <div class="single-footer-caption mb-50">
                        <div class="footer-tittle">
                            <h4>Support</h4>
                            <ul>
                             <li><a href="#">Frequently Asked Questions</a></li>
                             <li><a href="#">Terms & Conditions</a></li>
                             <li><a href="#">Privacy Policy</a></li>
                             <li><a href="#">Privacy Policy</a></li>
                             <li><a href="#">Report a Payment Issue</a></li>
                         </ul>
                        </div>
                    </div>
                </div>
            </div>
            <!-- Footer bottom -->
            <div class="row">
             <div class="col-xl-7 col-lg-7 col-md-7">
                 <div class="footer-copy-right">
                     <p><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
  Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="ti-heart" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib</a>
  <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></p>                   </div>
             </div>
              <div class="col-xl-5 col-lg-5 col-md-5">
                 <div class="footer-copy-right f-right">
                     <!-- social -->
                     <div class="footer-social">
                         <a href="#"><i class="fab fa-twitter"></i></a>
                         <a href="#"><i class="fab fa-facebook-f"></i></a>
                         <a href="#"><i class="fab fa-behance"></i></a>
                         <a href="#"><i class="fas fa-globe"></i></a>
                     </div>
                 </div>
             </div>
         </div>
        </div>
    </div>

    <!-- Footer End-->
</footer>

<!-- JS here -->

    <!-- All JS Custom Plugins Link Here here -->
    <script src="./assets/js/vendor/modernizr-3.5.0.min.js"></script>
    
    <!-- Jquery, Popper, Bootstrap -->
    <script src="./assets/js/vendor/jquery-1.12.4.min.js"></script>
    <script src="./assets/js/popper.min.js"></script>
    <script src="./assets/js/bootstrap.min.js"></script>
    <!-- Jquery Mobile Menu -->
    <script src="./assets/js/jquery.slicknav.min.js"></script>

    <!-- Jquery Slick , Owl-Carousel Plugins -->
    <script src="./assets/js/owl.carousel.min.js"></script>
    <script src="./assets/js/slick.min.js"></script>

    <!-- One Page, Animated-HeadLin -->
    <script src="./assets/js/wow.min.js"></script>
    <script src="./assets/js/animated.headline.js"></script>
    
    <!-- Scrollup, nice-select, sticky -->
    <script src="./assets/js/jquery.scrollUp.min.js"></script>
    <script src="./assets/js/jquery.nice-select.min.js"></script>
    <script src="./assets/js/jquery.sticky.js"></script>
    <script src="./assets/js/jquery.magnific-popup.js"></script>

    <!-- contact js -->
    <script src="./assets/js/contact.js"></script>
    <script src="./assets/js/jquery.form.js"></script>
    <script src="./assets/js/jquery.validate.min.js"></script>
    <script src="./assets/js/mail-script.js"></script>
    <script src="./assets/js/jquery.ajaxchimp.min.js"></script>
    
    <!-- Jquery Plugins, main Jquery -->	
    <script src="./assets/js/plugins.js"></script>
    <script src="./assets/js/main.js"></script>
    <script src="../Homepage/home.js"></script>
</body>
<script>
    function loadData(){
        var infor = document.querySelectorAll(".infor");
        var xttp = new XMLHttpRequest();
        document.querySelector(".table").addEventListener("click",function(e){
            if(e.target && e.target.nodeName == "BUTTON"){
                xttp.open("POST", "order", true);
                xttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
                xttp.send(e.target.value); 
            }
        });
            xttp.onreadystatechange = function() {
                if (this.readyState == 4 && this.status == 200) {
                    document.querySelector("table").innerHTML = this.responseText;
                }
            }
    }
    loadData();
</script>
</html>

