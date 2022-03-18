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