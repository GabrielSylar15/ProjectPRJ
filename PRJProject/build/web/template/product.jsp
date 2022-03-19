<%-- 
    Document   : product
    Created on : Mar 7, 2022, 5:34:29 PM
    Author     : ADMIN
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="model.Product"%>
<%@page import="model.ProductImages"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>

    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>Sản phẩm</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="manifest" href="site.webmanifest">
    <link rel="shortcut icon" type="image/x-icon" href="assets/img/favicon.ico">
    <!-- Font -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
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
        <link rel="stylesheet" href="../Homepage/base.css">
        <link rel="stylesheet" href="../Homepage/grid.css">
        <link rel="stylesheet" href="../Homepage/home.css">
</head>
    <%
        ArrayList<Product> listProducts = (ArrayList<Product>) request.getAttribute("listProducts");
        int totalpage = (Integer)(request.getAttribute("totalpage"));
        int pageindex = (Integer) request.getAttribute("pageindex");
    %>
  
<body>

    <header>
        <div class="header__largescreen">
            <div class="header__ann">
                <p>Sản phẩm abcxyz đã tăng giá lên 50%, mọi người chú ý💥 Sản phẩm abc đã tăng giá lên 50%, mọi người chú ý💥 </p>
             </div>
             <div class="header row">
                 <div class="header__logo lg-2 md-2">
                     <img src="../Homepage/assets/img/pngtree-human-feet-icon-flat-style-png-image_1809427.jpg" alt="">
                  
                     <a href="">Shop giày dép</a>
                 </div>
                 <div class="header__navigation lg-6 md-6">
                     <ul>
                         <li>
                             <a href="../Homepage/Home.jsp">Trang chủ</a>
                         </li>
                         <li>
                             <a href="..template/listproduct.jsp">Giày</a>
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
                         <!-- <li class="login"><a href="../">Đăng Nhập</a></li> -->
                         <li class="cart">                        
                            <a href="" class="user">
                                <i class="fa-solid fa-user"></i>
                            </a>
                            <div class="expand-infor">
                                <a href=""><i class="fa-solid fa-user-large"></i> Nguyễn Thế Vinh</a> 
                                <a href="">VinhNT</a>
                                <a href="">Đơn hàng đã mua</a>
                                <a href="">Đặt trước</a>
                            </div>
                        </li>
                     </ul>
                 </div>
             </div>
        </div>

        <div class="col-12 mobile__header">
            <ul class="header__mobile--nav">
                <li class="header__logo">
                    <img src="../Homepage/assets/img/pngtree-human-feet-icon-flat-style-png-image_1809427.jpg" alt="">
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
                <li><a href="">Đăng Nhập</a></li>
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
                            <h2>Danh sách sản phẩm</h2>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- slider Area End-->
    
    <!-- product list part start-->
    <section class="product_list section_padding">
        <div class="container">
            <div class="row">
                <div class="col-md-4 col-lg-3">
                    <div class="product_sidebar">
                        <div class="single_sedebar">
                            <form action="#">
                                <input type="text" name="#" placeholder="Tìm kiếm">
                                <a href=""><i class="ti-search"></i></a>
                            </form>
                        </div>
                        <div class="single_sedebar">
                            <div class="select_option">
                                <div class="select_option_list">Danh mục sản phẩm<i class="right fas fa-caret-down"></i> </div>
                                <div class="select_option_dropdown">
                                    <c:forEach items="${requestScope.listCategories}" var="c">
                                        <p><a href="displayproducts?categoryid=${c.categoryID}">${c.categoryName}</a></p>
                                    </c:forEach>
                                </div>
                            </div>
                        </div>
                        <div class="single_sedebar">
                            <div class="select_option">
                                <div class="select_option_list">Sắp xếp theo<i class="right fas fa-caret-down"></i> </div>
                                <div class="select_option_dropdown">
                                    <p class="order">
                                        <input class="ordervalue" type="hidden" value="price-desc">
                                        <a href="">Giám giảm dần</a>
                                    </p>
                                    <p class="order">
                                        <input class="ordervalue" type="hidden" value="price-asc">
                                        <a href="">Giá tăng dần</a>
                                    </p>
                                    <p class="order">
                                        <input class="ordervalue" type="hidden" value="best-selling">
                                        <a href="#">Sản phẩm bán chạy nhất</a>
                                    </p>
                                    <p class="order">
                                        <input class="ordervalue" type="hidden" value="maxquantity">
                                        <a href="#">Số lượng nhiều nhất</a>
                                    </p>
                                    <p class="order">
                                        <input class="ordervalue" type="hidden" value="minquantity">
                                        <a href="#">Số lượng ít nhất</a>
                                    </p>
                                    <p class="order">
                                        <input class="ordervalue" type="hidden" value="newest">
                                        <a href="#">Mới nhất</a>
                                    </p>
                                    <p class="order">
                                        <input class="ordervalue" type="hidden" value="oldest">
                                        <a href="#">Cũ nhất</a>
                                    </p>
                                    <p class="order">
                                        <input class="ordervalue" type="hidden" value="benifit">
                                        <a href="#">Lợi nhuận lớn nhất</a>
                                    </p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-md-8 col-lg-9">
                    <div class="product_list">
                        <div class="row">
                           <%for (Product p : listProducts) {%>
                                 <div class="col-lg-4 col-sm-12 col-md-6">
                                     <img src="../<%=p.getListImages().get(0).getImage()%>" alt="" class="img-fluid">
                                    <div class="single_product_item">
                                        <h3> <a href="productdetail?pid=<%=p.getProductID()%>"><%=p.getProductName()%></a> </h3>
                                        <p><%=p.getPrice()%></p>
                                    </div>
                                </div>                            
                           <%}%>
                        </div>
                        <div class="load_more_btn text-center" id="pagger">
                            <!--<a href="#" class="btn_3">Load More</a>-->
<!--                            <a>1</a>
                            <a>2</a>
                            <a>3</a>-->
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- product list part end-->



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
        <script src="./assets/js/jquery.magnific-popup.js"></script>

        <!-- Scrollup, nice-select, sticky -->
        <script src="./assets/js/jquery.scrollUp.min.js"></script>
        <script src="./assets/js/jquery.nice-select.min.js"></script>
        <script src="./assets/js/jquery.sticky.js"></script>
        
        <!-- contact js -->
        <script src="./assets/js/contact.js"></script>
        <script src="./assets/js/jquery.form.js"></script>
        <script src="./assets/js/jquery.validate.min.js"></script>
        <script src="./assets/js/mail-script.js"></script>
        <script src="./assets/js/jquery.ajaxchimp.min.js"></script>
        
        <!-- Jquery Plugins, main Jquery -->    
        <script src="./assets/js/plugins.js"></script>
        <script src="./assets/js/main.js"></script>

        <!-- swiper js -->
        <script src="./assets/js/swiper.min.js"></script>
            <!-- swiper js -->
        <script src="./assets/js/mixitup.min.js"></script>
        <script src="./assets/js/jquery.counterup.min.js"></script>
        <script src="./assets/js/waypoints.min.js"></script>
        <!--  -->
        <script src="../Homepage/home.js"></script>
        <script src="pagger.js"></script>
</body>
<script>
     pagger('pagger',<%=pageindex%>, <%=totalpage%>,3);
     var OrderValues = document.querySelectorAll(".ordervalue");
     var Taga = document.querySelectorAll(".order a");
     console.log(OrderValues[0].value)
     document.querySelectorAll(".order").forEach((element,index) => {
         element.onclick = function(){
             if(window.location.search.includes("category")){
                var categoryid =  parseInt(window.location.search.split("=")[1]);
                Taga[index].href='displayproducts?categoryid='+categoryid+'&order='+OrderValues[index].value;
             }else{
                Taga[index].href='displayproducts?order='+OrderValues[index].value;
             }
         }
     });
</script>
</html>