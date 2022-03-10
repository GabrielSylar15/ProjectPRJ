<%-- 
    Document   : InsertProduct
    Created on : Mar 10, 2022, 11:14:10 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
	<title>Contact V14</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
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
<link href="https://fonts.googleapis.com/css2?family=Dancing+Script:wght@400;500;600;700&family=Poppins:wght@300;400;500;600;700&family=Roboto:wght@100;500&display=swap" rel="stylesheet">
</head>
<body>


	<div class="container-contact100">
		<div class="wrap-contact100">
                    <form class="contact100-form validate-form" method="POST" action="insertproducts" enctype="multipart/form-data">
				<span class="contact100-form-title">
					Cập nhật sản phẩm
				</span>

				<label class="label-input100" for="phone">Tên sản phẩm</label>
				<div class="wrap-input100">
					<input id="phone" class="input100" type="text" name="name" placeholder="Tên sản phẩm">
					<span class="focus-input100"></span>
				</div>

				<label class="label-input100" for="message" name="category">Loại sản phẩm:</label>
				<div class="wrap-input100">
					<select>
                                            <c:forEach items="${requestScope.listCategories}" var="category">
                                                <option value="${category.categoryID}">${category.categoryName}</option>
                                            </c:forEach>
					</select>
				</div>	
				<label c
				lass="label-input100" for="phone">Giá</label>
				<div class="wrap-input100">
					<input id="phone" class="input100" type="text" name="price" placeholder="Giá sản phẩm">
					<span class="focus-input100"></span>
				</div>

				<label class="label-input100" for="phone">Số lượng trên 1 đơn vị</label>
				<div class="wrap-input100">
					<input id="phone" class="input100" type="text" name="QuantityPerUnit" placeholder="Eg. 5">
					<span class="focus-input100"></span>
				</div>
				<label class="label-input100" for="phone">Giá bán ra</label>
				<div class="wrap-input100">
					<input id="phone" class="input100" type="text" name="retailprice" placeholder="Eg. 15000">
					<span class="focus-input100"></span>
				</div>

				<label class="label-input100" for="message">Miêu tả sản phẩm</label>
				<div class="wrap-input100">
					<textarea id="message" class="input100" name="description" placeholder="Sản phẩm này có màu..."></textarea>
					<span class="focus-input100"></span>
				</div>

				<label class="label-input100" for="message">Ảnh sản phẩm</label>
				<div class="wrap-input100" id="UploadImage">
					<div class="wrapper-image">
						<input id="phone" class="input100" type="file" name="image"> 
					</div>				
				</div>				
				<button id="AddMoreImage" type="button">Thêm ảnh+</button>

				<label class="label-input100" for="message">Phân loại theo</label>
				<div class="wrapper--sku wrap-input100">
					<label class="label-input100" for="message">Màu sắc</label>
					<div class="smallblock--color">
					</div>

					<button class="AddMoreSku" type="button">Thêm +</button>
					<label class="label-input100" for="message">Kích thước</label>
					<div class="smallblock--size">
					</div>
					<button class="AddMoreSku" type="button">Thêm +</button>
				</div>
				

				<label class="label-input100" for="message">Nhập số lượng</label>				
				<div class="tableQuantity">
						<div class="wrap-input100 sku--size">
							<input id="phone" class="input100" type="text" name="quantity" placeholder="Eg. 100">
						</div>
				</div>


				<div class="container-contact100-form-btn">
					<button class="contact100-form-btn">
						<span>
							Submit
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
	<script src="js/main.js"></script>


<!-- Global site tag (gtag.js) - Google Analytics -->
<script async src="https://www.googletagmanager.com/gtag/js?id=UA-23581568-13"></script>
<script>
  window.dataLayer = window.dataLayer || [];
  function gtag(){dataLayer.push(arguments);}
  gtag('js', new Date());

  gtag('config', 'UA-23581568-13');
</script>

</body>
</html>
