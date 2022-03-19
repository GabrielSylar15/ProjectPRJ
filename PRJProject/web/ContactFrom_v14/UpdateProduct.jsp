<%-- 
    Document   : InsertProduct
    Created on : Mar 10, 2022, 11:14:10 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<!DOCTYPE html>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>Thêm sản phẩm</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!--===============================================================================================-->
	<link rel="icon" type="image/png" href="images/icons/favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/iconic/css/material-design-iconic-font.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/animsition/css/animsition.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/daterangepicker/daterangepicker.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="css/util.css">
	<link rel="stylesheet" type="text/css" href="css/main.css">
<!--===============================================================================================-->
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
                            <a href="#" class="user">
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

	<div class="container-contact100">
		<div class="wrap-contact100">
                    <form class="contact100-form validate-form" method="POST" action="update" enctype="multipart/form-data">
				<span class="contact100-form-title">
					Cập nhật sản phẩm
				</span>
                                <input type="hidden" name="productID" value="${requestScope.product.productID}">
                                <label class="label-input100" for="phone">Tên sản phẩm</label>
				<div class="wrap-input100">
					<input id="phone" class="input100" type="text" name="name" placeholder="Tên sản phẩm" value="${requestScope.product.productName}">
					<span class="focus-input100"></span>
				</div>

				<label class="label-input100" for="message" name="category">Loại sản phẩm:</label>
				<div class="wrap-input100">
					<select name="category">
                        <c:forEach items="${requestScope.listCategories}" var="category">
                            <option value="${category.categoryID}"
                                    <c:if test="${category.categoryID==requestScope.product.category.categoryID}">
                                        selected
                                    </c:if>
                            >${category.categoryName}</option>
                        </c:forEach>
					</select>
				</div>	
				<label class="label-input100" for="phone">Giá</label>
				<div class="wrap-input100">
					<input id="phone" class="input100" type="text" name="price" placeholder="Giá sản phẩm" value="${requestScope.product.price}">
					<span class="focus-input100"></span>
				</div>

				<label class="label-input100" for="phone">Số lượng trên 1 đơn vị</label>
				<div class="wrap-input100">
					<input id="phone" class="input100" type="text" name="QuantityPerUnit" placeholder="Eg. 5" value="${requestScope.product.quantityPerUnit}">
					<span class="focus-input100"></span>
				</div>
				<label class="label-input100" for="phone">Giá bán ra</label>
				<div class="wrap-input100">
                    <input id="phone" class="input100" type="text" name="retailprice" placeholder="Eg. 15000" value="${requestScope.product.retailPrice}">
					<span class="focus-input100"></span>
				</div>

				<label class="label-input100" for="message">Miêu tả sản phẩm</label>
				<div class="wrap-input100">
					<textarea id="message" class="input100" name="description" placeholder="Sản phẩm này có màu...">${requestScope.product.description}</textarea>
					<span class="focus-input100"></span>
				</div>
				<label class="label-input100" for="message">Ảnh sản phẩm</label>
				<div class="wrap-input100" id="UploadImage">
                    <div class="wrapper-image">
                        <input id="phone" class="input100" type="file" name="image"> 
                    </div>				
				</div>				
				<button id="AddMoreImage" type="button">Thêm ảnh+</button>
                                
                <label class="label-input100" for="message">Ảnh đã thêm</label>                               
                <div class="addedImage" style="display:flex">
                    <c:forEach items="${requestScope.product.listImages}" var="img">                                   
                        <div class="wrapper-imageadded">
                            <img src="../${img.image}">
                            <input type="hidden" name="imagedeltedid" value="${img.imageID}">
                            <input type="hidden" name="imagedeltedname" value="${img.image}">
                            <button type="button" class="removeImageAdded">x</button>
                        </div>
                    </c:forEach>
                </div>
                                
                                
				<label class="label-input100" for="message">Phân loại theo</label>
				<div class="wrapper--sku wrap-input100">
					<label class="label-input100" for="message">Màu sắc</label>
					<div class="smallblock--color">
                                            <c:forEach items="${requestScope.product.listColors}" var="c"> 
                                                <c:if test="${c.color!='None'}">
                                                    <div class="wrap-input100 sku--color">
                                                        <input type="text" class="input100 color" name="color" value="${c.color}">
                                                        <button class="RemoveSKU">x</button>
                                                    </div>
                                                </c:if>
                                            </c:forEach>
					</div>
                   
					<button class="AddMoreSku" type="button">Thêm +</button>

					<label class="label-input100" for="message">Kích thước</label>
					<div class="smallblock--size">
                                            <c:forEach items="${requestScope.product.listSizes}" var="s"> 
                                                <c:if test="${s.size!='None'}">
                                                    <div class="wrap-input100 sku--size">
                                                        <input type="text" class="input100 size" name="size" value="${s.size}">
                                                        <button class="RemoveSKU">x</button>
                                                    </div>
                                                </c:if>
                                            </c:forEach>
					</div>                
					<button class="AddMoreSku" type="button">Thêm +</button>
                                        <button type="button" class="apply">Áp dụng</button>
				</div>
				<label class="label-input100" for="message">Lưu ý: Khí ấn "Áp dụng", số lượng sẽ phải nhập lại từ đầu.</label>

				<label class="label-input100" for="message">Nhập số lượng</label>				
				<div class="tableQuantity">
                 
                    <table border="1px solid black">
                        <tbody class="drawtable">
                           
                        </tbody>
                    </table>
				</div>

				<div class="container-contact100-form-btn">
					<button class="contact100-form-btn">
						<span>
							Cập nhật sản phẩm
							<i class="zmdi zmdi-arrow-right m-l-8"></i>
						</span>
					</button>
				</div>
			</form>
		</div>
	</div>



<!--===============================================================================================-->
	<script src="vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/animsition/js/animsition.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/bootstrap/js/popper.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/daterangepicker/moment.min.js"></script>
	<script src="vendor/daterangepicker/daterangepicker.js"></script>
<!--===============================================================================================-->
	<script src="vendor/countdowntime/countdowntime.js"></script>
<!--===============================================================================================-->
	<script src="../Homepage/home.js"></script>
	<script src="js/main.js"></script>
    <script src="js/removeimageadded.js"></script>


<!-- Global site tag (gtag.js) - Google Analytics -->
<script async src="https://www.googletagmanager.com/gtag/js?id=UA-23581568-13"></script>
<script>
  window.dataLayer = window.dataLayer || [];
  function gtag(){dataLayer.push(arguments);}
  gtag('js', new Date());

  gtag('config', 'UA-23581568-13');
  
    function product(colorID, sizeID, quantity){
        this.colorID = colorID;
        this.sizeID = sizeID;
        this.quantity = quantity;
    }
    const listProducts = [];
    <c:forEach items="${requestScope.product.listColor_Sizes}" var = "cs">
        listProducts.push(new product(${cs.colorID}, ${cs.sizeID}, ${cs.quantity}))
    </c:forEach>

    function color(colorID, color){
        this.colorID = colorID;
        this.color = color;
    }
    const listColors = [];
    function size(sizeID, size){
        this.size = size;
        this.sizeID = sizeID;
    }
    const listSizes = [];
    
    <c:forEach items="${requestScope.product.listColors}" var = "c">
        listColors.push(new color(${c.colorID}, '${c.color}'))
    </c:forEach>

    <c:forEach items="${requestScope.product.listSizes}" var = "s">
        listSizes.push(new size(${s.sizeID}, '${s.size}'))
    </c:forEach>
     
//    listColors.forEach(element => {
//        document.querySelector(".smallblock--color").innerHTML+='<div class="wrap-input100 sku--color">
//        <input type="text" class="input100 color" name="color" value="'+element.color+'">
//        <button class="RemoveSKU">x</button>
//        </div>'
//    });
//    
//    listSizes.forEach(element => {
//        document.querySelector(".smallblock--size").innerHTML+='<div class="wrap-input100 sku--size"><input type="text" class="input100 size" name="size" value="'+element.size+'"><button class="RemoveSKU">x</button></div>'
//    });    

    window.onload = function(){
        drawTableBeta(listProducts, 0);
        document.querySelectorAll(".RemoveSKU").forEach(element => {
            element.onclick = function(){
                element.type="button";
                element.parentElement.remove();    
            }
        });
    }
    document.querySelector(".apply").onclick = function(){
        addMore();
    }
</script>

</body>
</html>
