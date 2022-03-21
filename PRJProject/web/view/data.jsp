<%@page import="java.util.ArrayList"%>
<%@page import="model.Cart"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<meta charset="utf-8">
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
<% int count=0; %>    
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
            <p><a href="productdetail?pid=${p.productID}">${p.productName}</a></p>
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
          <h5>
              <button class="add" value="pid=${p.productID}&sid=${p.sizeID}&cid=${p.colorID}&num=0">Xóa</button>
          </h5>
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

  </tr>
</tbody>