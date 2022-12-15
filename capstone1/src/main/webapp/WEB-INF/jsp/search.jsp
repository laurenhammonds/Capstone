<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="include/header.jsp" />

<div class="container">
	<h1>Search Page</h1>

    <form action="/search" method="get" style="margin: 20px">
        Product Name : <input type="text" name="productName" value="${product_name}" style="margin-bottom:10px">
        <button type="submit">Search</button>
    </form>

    <br><br>

    <table border="1" cellpadding="5">
        <tr>
            <td><B>ID</B></td>
            <td><b>Product Image</b></td>
            <td><b>Product Name</b></td>
            <td><b>Description</b></td>
            <td><b>Price</b></td>
        </tr>
        <c:forEach items="${products}" var="product">
            <tr>  
            <td width="5%">${product.id}</td>   
              <td width="30%"><img src="${product.productImage}" alt="${product.productName}" width="200px"/></td> 
              <td width="40%"><h3>${product.productName}</h3> <br> ${product.description}</td>
              <td width="10%">${product.price}</td>
              <td width="15%"><button>Add to Cart</button></td>
            </tr>
        </c:forEach>
    </table>
</div>

<jsp:include page="include/footer.jsp" />
