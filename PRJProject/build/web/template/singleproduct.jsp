<%-- 
    Document   : singleproduct
    Created on : Mar 14, 2022, 1:25:54 AM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>Chi tiết sản phẩm</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="manifest" href="site.webmanifest">
    <link rel="shortcut icon" type="image/x-icon" href="assets/img/favicon.ico">

    <!-- CSS here -->
        <link rel="stylesheet" href="assets/css/bootstrap.min.css">
        <link rel="stylesheet" href="assets/css/owl.carousel.min.css">
        <link rel="stylesheet" href="assets/css/flaticon.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
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
        <link rel="stylesheet" href="../Homepage/toast.css">
</head>
    

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
                             <a href="displayproducts?categoryid=1">Giày</a>
                         </li>
                         <li>
                             <a href="displayproducts?categoryid=2">Dép</a>
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
                             <a href="order"><i class="fa-solid fa-cart-shopping"></i></a>
                         </li>
                         <!-- <li class="login"><a href="../">Đăng Nhập</a></li> -->
                         <li class="cart">                        
                            <a href="" class="user">
                                <i class="fa-solid fa-user"></i>
                            </a>
                            <div class="expand-infor">
                                <a href="#"><i class="fa-solid fa-user-large"></i> Nguyễn Thế Vinh</a> 
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
                    <a href="order"><i class="fa-solid fa-cart-shopping"></i></a>
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
                            <h2>Chi tiết sản phẩm</h2>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- slider Area End-->

  <!--================Single Product Area =================-->
  <div class="product_image_area">
    <div class="container">
      <div class="row">
        <div class="col-lg-5">
          <div class="product_img_slide owl-carousel">
              <c:forEach items="${requestScope.product.listImages}" var="img">
                <div class="single_product_img">
                    <img src="../${img.image}" alt="#" class="img-fluid">
                </div>    
              </c:forEach>
          </div>
        </div>
        <div class="col-lg-7">
          <div class="single_product_text text-center">
            <h3>${requestScope.product.productName}</h3>
            <p>
               ${requestScope.product.description}
            </p>
            <div class="wrapper-color">
                Màu sắc:
                <c:forEach items="${requestScope.product.listColors}" var="c">
                    <c:if test="${c.color!='None'}">
                        <span class="color">${c.color}</span>   
                    </c:if>
                </c:forEach>
            </div>
            <div class="wrapper-size">
                Size:
                <c:forEach items="${requestScope.product.listSizes}" var="s">
                    <c:if test="${s.size!='None'}">
                            <span class="size" >${s.size}</span>  
                    </c:if>
                </c:forEach>            
            </div>
            <div class="card_area">
                <div class="product_count_area">
                    <p style="text-align:left">Số lượng:</p>
                    <div class="product_count d-inline-block">
                        <span class="product_count_item inumber-decrement"> <i class="ti-minus"></i></span>
                        <input class="product_count_item input-number" type="text" value="1" min="0" max="10">
                        <span class="product_count_item number-increment"> <i class="ti-plus"></i></span>
                    </div>
                </div>
            </div>
            <p style="text-align:left">Giá:${  requestScope.product.price}</p>  
            <p style="text-align:left" id="instock"></p>
            <div class="button-add-to-cart">
                <div class="add_to_cart">
                  <a href="#" class="btn_3">Thêm vào giỏ hàng</a>
                </div>  
                <div class="add_to_cart">
                  <a href="#" class="btn_1">Mua ngay</a>
                </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
    <div class="toast">
    </div>
  <!--================End Single Product Area =================-->
   <!-- subscribe part here -->
   <section class="subscribe_part section_padding">
      <div class="container">
          <div class="row justify-content-center">
              <div class="col-lg-8">
                  <div class="subscribe_part_content">
                      <h2>Get promotions & updates!</h2>
                      <p>Seamlessly empower fully researched growth strategies and interoperable internal or “organic” sources credibly innovate granular internal .</p>
                      <div class="subscribe_form">
                          <input type="email" placeholder="Enter your mail">
                          <a href="#" class="btn_1">Subscribe</a>
                      </div>
                  </div>
              </div>
          </div>
      </div>
  </section>
  <!-- subscribe part end -->

  <footer>
    <!-- Footer Start-->
    <div class="footer-area footer-padding">
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
  <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></p>                    </div>
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

        <script src="../Homepage/home.js"></script>
        <script src="../Homepage/toast.js"></script>

       <!--<script src="BuyProduct.js"></script>-->
</body>
<script>
    function product(colorID, sizeID, quantity){
        this.colorID = colorID;
        this.sizeID = sizeID;
        this.quantity = quantity;
    }
    const listProducts = [];
    <c:forEach items="${requestScope.product.listColor_Sizes}" var = "cs">
        listProducts.push(new product(${cs.colorID}, ${cs.sizeID}, ${cs.quantity}))
    </c:forEach>
    var sizeindex,colorindex;
    if(listProducts[0].colorID==0)  colorindex=0;
    if(listProducts[0].sizeID==0)   sizeindex=0;
    function ClickButton(){
        var sizes = document.querySelectorAll(".size");
        var colors = document.querySelectorAll(".color");
        var temp=0;
        sizes.forEach((element, index) => {
            element.onclick = function(){
                temp=index+1;
                sizes.forEach(e => {
                    e.setAttribute("style","background-color:none");
                });
                sizeindex=temp;
                element.setAttribute("style","background-color:skyblue");
                if(colorindex!=null){
                    listProducts.forEach(p => {
                        if(p.colorID==colorindex&&p.sizeID==sizeindex){
                            document.getElementById("instock").innerHTML = p.quantity+" sản phẩm có sẵn";
                        }
                    });
                }
            }      
        });
        
        colors.forEach((element, index) => {
            element.onclick = function(){
                temp=index+1;
                colors.forEach(e => {
                    e.setAttribute("style","background-color:none");
                });
                colorindex = temp;
                element.setAttribute("style","background-color:skyblue");
                if(sizeindex!=null){
                    listProducts.forEach(p => {
                        if(p.colorID==colorindex&&p.sizeID==sizeindex){
                            document.getElementById("instock").innerHTML = p.quantity+" sản phẩm có sẵn";
                        }
                    });
                }
            }      
        });
    }
    ClickButton(); 
    document.querySelector(".btn_3").onclick = function(){
        if(sizeindex==null||colorindex==null){
            Alert({
                type: "error",
                content: "Bạn cần chọn sản phẩm cần mua"
            })
        }
        else{
            if(parseInt(document.querySelector(".input-number").value)>parseInt(document.querySelector("#instock").innerHTML.split(" ")[0])){
                Alert({
                    type: "error",
                    content: "Bạn đã thêm vượt số lượng tối đa trong kho"
                })
            } 
            else if((parseInt(document.querySelector(".input-number").value)==0)){
                Alert({
                    type: "error",
                    content: "Nhập số lượng cần mua"
                })
            }
            else{
                Alert({
                    type: "success",
                    content: "Sản phẩm đã được thêm vào giỏ hàng của bạn"
                })
                var xttp = new XMLHttpRequest();
                var quantity = parseInt(document.querySelector(".input-number").value);
                xttp.open("GET","cart?cid="+colorindex+"&sid="+sizeindex+"&quantity="+quantity+"&pid="+${requestScope.product.productID});
                xttp.send();
                xttp.onreadystatechange = function() {
                    if (this.readyState == 4 && this.status == 200) {
                         document.getElementById("instock").innerHTML = this.responseText+" sản phẩm có sẵn";
                    }
                }                    
            }
        }     
    }
</script>
</html>