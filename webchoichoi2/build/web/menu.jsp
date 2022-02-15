<%-- 
    Document   : menu
    Created on : Nov 14, 2021, 12:33:56 AM
    Author     : Ducphi
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="top-menu">
    <div class="container">
        <div class="row">
            <div class="col-sm-7 col-md-9">
                <div id="colorlib-logo"><a href="home">Footwear</a></div>
            </div>
            <div class="col-sm-5 col-md-3">
                <form action="search" method="post" class="search-wrap">
                    <div class="form-group">
                        <input value="${txtSearch}" name="txtSearch"type="text" class="form-control search" placeholder="Search">
                        <button class="btn btn-primary submit-search text-center" type="submit"><i class="icon-search"></i></button>
                    </div>
                </form>
            </div>
        </div>
        <div class="row">
            <div class="col-sm-12 text-left menu-1">
                <ul>
                    <li class="active"><a href="home">Home</a></li>
                    <li class="has-dropdown">
                        <a href="men">Men</a>
                        <ul class="dropdown">
                            <li><a href="product-detail.html">Product Detail</a></li>
                            <li><a href="cart">Shopping Cart</a></li>
                            <li><a href="checkout.html">Checkout</a></li>
                            <li><a href="order-complete.html">Order Complete</a></li>
                            <li><a href="add-to-wishlist.html">Wishlist</a></li>
                        </ul>
                    </li>
                    <li><a href="women">Women</a></li>
                    <li><a href="about.jsp">About</a></li>
                    <li><a href="contact.jsp">Contact</a></li>
                    <c:if test="${sessionScope.acc!=null}">
                        <li class="nav-item">
                            <a class="nav-link" href="#">Hello ${sessionScope.acc.user}</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="logout">LogOut</a>
                            <a class="nav-link" href="manager">Manager Product</a>
                        </li>
                    </c:if>
                    <c:if test="${sessionScope.acc == null}">
                        <li class="nav-item">
                            <a class="nav-link" href="Login.jsp">Login</a>
                        </li>
                    </c:if>
                    <li class="cart"><a href="cart"><i class="icon-shopping-cart"></i> Cart [0]</a></li>
                </ul>
            </div>
        </div>
    </div>
</div>
