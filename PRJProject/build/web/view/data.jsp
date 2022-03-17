<%@page import="java.util.ArrayList"%>
<%@page import="model.Cart"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%
    int count=0; 
    Cart c = (Cart) request.getAttribute("cart");
    ArrayList<String> listPrices =c.getListPrices();
%>
<c:if test="${requestScope.cart!=null}">
 <c:forEach items="${requestScope.cart.listProducts}" var="p">
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
              <button class="add">+</button>
              ${p.quantity}
              <input type="hidden" class="infor" value="pid=${p.productID}&sid=${p.sizeID}&cid=${p.colorID}">
              <button class="minus">-</button></h5>
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