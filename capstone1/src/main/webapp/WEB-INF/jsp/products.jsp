<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link rel="stylesheet" href="../../pub/css/products.css">
<jsp:include page="include/header.jsp" />

<!-- <script>
  $(document).ready(
      function () {
          $('button[type=button').click(function () {
              console.log("user clicked : " + this.value);

              $.ajax({
                  url: "/productAdd", // the mapped function in controller
                  data: {
                      clickedValue: this.value
                  },
                  success: function (data) {
                      console.log("Server Success.");
                      console.log(data);
                  },
                  error: function (data) {
                      console.log("AJAX Call Failure.");
                      console.log(data);
                  }
              });
              alert('Product Added To Cart!');
              window.location.reload();
          });
      }
  );
</script> -->

<div class="products_page">
  <div class="header">
    <br>
      <b>
      <h1>PRODUCTS</h1>
      <br>
  </div>
  <div class="products_table">
    <table border="1" cellpadding="5">
      <tr>
        <th><b></b></th>
        <th><b></b></th>
        <th><b></b></th>
      </tr>
      <c:forEach items="${products}" var="product">
            <tr>      
              <td width="30%"><img src="${product.productImage}" alt="${product.productName}" width="200px"/></td> 
              <td width="40%"><h3>${product.productName}</h3> <br> ${product.description}</td>
              <td width="10%">${product.price}</td>
              <td width="20%">
                <form action="/addOrder" onSubmit="addOrder(event)">
                <label for="productId">Product ID:</label><br>
                <input type="text" name="" value="${product.id}"><br><br>
                <button type="submit" class="btn btn-primary">Buy Now</button>
              </form>
            </td>
            </tr>
        </c:forEach>
    </table>
  </div>
</div>


<jsp:include page="include/footer.jsp" />