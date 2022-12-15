<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<link rel="stylesheet" href="../../pub/css/orderhistory.css">
<jsp:include page="include/header.jsp" />

<div class="orderhistory_page">
    <div class="header">
      <br>
        <b>
        <h1>ORDER HISTORY</h1>
        <br>
    </div>
    <div class="orders_table">
      <table border="1" cellpadding="20">
        <tr>
            <th class="text-center">Order Number:</th>
            <th class="text-center">Expected Shipping Date:</th>
        </tr>
        <tr>
            <td class="text-center">${order.id}</td>
            <td class="text-center">02/30</td>
        </tr>
      </table>
    </div>
  </div>

  <jsp:include page="include/footer.jsp" />