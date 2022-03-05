<%-- 
    Document   : Home
    Created on : Mar 6, 2022, 12:25:59 AM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="home.css">
    <link rel="stylesheet" href="base.css">
    <link rel="stylesheet" href="grid.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600;700&family=Roboto:wght@500&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Dancing+Script:wght@400;500;600;700&family=Playfair+Display:ital,wght@0,400;0,500;1,400;1,900&family=Poppins:wght@300;400;500;600;700&family=Roboto:wght@100;500&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Dancing+Script:wght@400;500;600;700&family=Poppins:wght@300;400;500;600;700&family=Roboto:wght@100;500&display=swap" rel="stylesheet">
</head>
<body>
    <div class="main">
        <header>
            <div class="header__largescreen">
                <div class="header__ann">
                    <p>Sản phẩm abc đã tăng giá lên 50%, mọi người chú ý💥 Sản phẩm abc đã tăng giá lên 50%, mọi người chú ý💥 </p>
                 </div>
                 <div class="header row">
                     <div class="header__logo lg-2 md-2">
                         <img src="assets/img/pngtree-human-feet-icon-flat-style-png-image_1809427.jpg" alt="">
                         <a href="">Shop giày dép</a>
                     </div>
                     <div class="header__navigation lg-6 md-6">
                         <ul>
                             <li>
                                 <a href="">Trang chủ</a>
                             </li>
                             <li>
                                 <a href="">Giày</a>
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
                             <li class="login"><a href="../login">Đăng Nhập</a></li>
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
                    <li><a href="../login">Đăng Nhập</a></li>
                </ul>

            </div>
        </header>

        <div class="containerX">
            <div class="slider row">
                <div class="lg-6 sm-0 md-6">
                    <img src="assets/img/hero_man.png" alt="">
                </div>
                <div class="lg-6 sm-12 md-6 slider__content">
                    <div>
                        <p>Mua hàng giá rẻ</p>
                        <p>Cửa hàng giày dép</p>
                        <p>Đầy đủ mẫu mã</p>
                        <p>
                            Chuyên bán buôn các loại giày dép.
                        </p>
                        <p class="button">
                            <a href="">Mua ngay</a>
                        </p>
                    </div>
                </div>
            </div>

            <div>
                <div class="container--wrapper">
                    <h2>Phân loại Sản phẩm</h2>
                    <div class="row category">
                        <div class="lg-4 md-6 sm-12 category__content">
                            <img src="assets/img/sandal.png" alt="">
                            <div class="content--text">
                                <a href="">Dép, Sandals</a>
                                <h3>Giá tốt nhất</h3>              
                            </div>
                        </div>
                        <div class="lg-4 md-6 sm-12 category__content">
                            <img src="assets/img/raincoat.jpg" alt="">
                            <div class="content--text">
                                <a href="">Áo mưa, phụ kiện</a>
                                <h3>Mẫu mã đa dạng</h3>
                                
                            </div>
                        </div>
                        <div class="lg-4 md-6 sm-12 category__content">
                            <img src="assets/img/shoes.jpg" alt="">
                            <div class="content--text">
                                <a href="">Giày thể thao</a>
                                <h3>Giảm giá 50%</h3>
                                
                            </div>
                        </div>
                    </div>
                </div>
                <div class="latest_product">
                    <h2>Sản phẩm mới nhất</h2>
                    <div class="product row">
                        <div class="lg-3 md-4 sm-12 product--detail">
                            <img src="assets/img/sampleproduct.jpg" alt="">
                            <span>New</span>
                            <div class="product--price">
                                <a href="">Giày thể thao cao cấp</a> <br>
                                <span>1.696.969₫</span>
                                <span>2.000.000₫</span>
                            </div>
                        </div>
                        <div class="lg-3 md-4 sm-12 product--detail">
                            <img src="assets/img/sampleproduct.jpg" alt="">
                            <span>New</span>
                            <div class="product--price">
                                <a href="">Giày thể thao cao cấp</a> <br>
                                <span>1.696.969₫</span>
                                <span>2.000.000₫</span>
                            </div>
                        </div>
                        <div class="lg-3 md-4 sm-12 product--detail">
                            <img src="assets/img/sampleproduct.jpg" alt="">
                            <span>New</span>
                            <div class="product--price">
                                <a href="">Giày thể thao cao cấp</a> <br>
                                <span>1.696.969₫</span>
                                <span>2.000.000₫</span>
                            </div>
                        </div>
                        <div class="lg-3 md-4 sm-12 product--detail">
                            <img src="assets/img/sampleproduct.jpg" alt="">
                            <span>New</span>
                            <div class="product--price">
                                <a href="">Giày thể thao cao cấp</a> <br>
                                <span>1.696.969₫</span>
                                <span>2.000.000₫</span>
                            </div>
                        </div>
                        <div class="lg-3 md-4 sm-12 product--detail">
                            <img src="assets/img/sampleproduct.jpg" alt="">
                            <span>New</span>
                            <div class="product--price">
                                <a href="">Giày thể thao cao cấp</a> <br>
                                <span>1.696.969₫</span>
                                <span>2.000.000₫</span>
                            </div>
                        </div>
                        <div class="lg-3 md-4 sm-12 product--detail">
                            <img src="assets/img/sampleproduct.jpg" alt="">
                            <span>New</span>  
                            <div class="product--price">
                                <a href="">Giày thể thao cao cấp</a> <br>
                                <span>1.696.969₫</span>
                                <span>2.000.000₫</span>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <div class="conveyor__product">
                <h2>Sản phẩm bán chạy</h2>
                <div class="owl-button">
                    <i class="fa-solid fa-angle-left" id="button--previous"></i>
                    <i class="fa-solid fa-angle-right" id="button--next"></i>
                </div>
                <div class="owl--warpper row">
                    <div class="">
                        <div class="owl" draggable="true">
                            <div class="owl-item">
                                <img src="assets/img/shoes.jpg" alt="">
                            </div>
                            <div class="owl-item">
                                <img src="assets/img/shoes.jpg" alt="">
                            </div>
                            <div class="owl-item">
                                <img src="assets/img/shoes.jpg" alt="">
                            </div>
                            <div class="owl-item">
                                <img src="assets/img/shoes.jpg" alt="">
                            </div>
                            <div class="owl-item">
                                <img src="assets/img/shoes.jpg" alt="">
                            </div>
                            <div class="owl-item">
                                <img src="assets/img/shoes.jpg" alt="">
                            </div>
                            <div class="owl-item">
                                <img src="assets/img/shoes.jpg" alt="">
                            </div>
                            <div class="owl-item">
                                <img src="assets/img/shoes.jpg" alt="">
                            </div>
                            <div class="owl-item">
                                <img src="assets/img/shoes.jpg" alt="">
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <div class="method row">
                <div class="lg-3 md-6 sm-12">
                    <img src="https://img.icons8.com/nolan/64/box.png"/>
                    <h3>Chính hãng</h3>
                    <p>
                        Cam hết hàng chính hãng với mức giá phù hợp.
                    </p>
                </div>
                <div class="lg-3 md-6 sm-12">
                    <img src="https://img.icons8.com/ios/50/000000/support.png"/>
                    <h3>Hỗ trợ và tư vấn</h3>
                    <p>Liên hệ Hotline 0969696969 để được tư vấn miễn phí.</p>
                </div>
                <div class="lg-3 md-6 sm-12">
                    <img src="https://img.icons8.com/external-bartama-outline-64-bartama-graphic/64/000000/external-Shipping-e-commerce-outline-bartama-outline-64-bartama-graphic.png"/>
                    <h3>Miễn phí giao hàng</h3>
                    <p>Đơn hàng được vận chuyển nhanh chóng và miễn phí.</p>
                </div>
                <div class="lg-3 md-6 sm-12">
                    <img src="https://img.icons8.com/ios/50/000000/exchange-pound.png"/>
                    <h3>Chính sách đổi trả</h3>
                    <p>Đổi trả hàng miễn phí khi đủ điều kiện.</p>
                </div>
            </div>
        </div>
        <div class="footer">
        </div>
    </div>

</body>
<script src="home.js"></script>
<script>
</script>
</html>
