<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<link rel="stylesheet" href="../../pub/css/account.css">
<jsp:include page="include/header.jsp" />

<div class="account_page">
    <div class="header">
      <br>
        <b>
        <h1>ACCOUNT INFORMATION</h1>
        <br>
    </div>
    <div class="account_table">
      <table border="1" cellpadding="20">
        <tr>
            <th class="text-center" width="10%">First Name:</th>
            <th class="text-center" width="10%">Last Name:</th>
            <th class="text-center" width="15%">Email:</th>
            <th class="text-center" width="10%">Phone:</th>
            <th class="text-center" width="10%">Address:</th>
            <th class="text-center" width="10%">City:</th>
            <th class="text-center" width="5%">State:</th>
            <th class="text-center" width="10%">Zip:</th>
        </tr>
        <tr>
            <td class="text-center" width="10%">${user.firstName}</td>
            <td class="text-center" width="10%">${user.lastName}</td>
            <td class="text-center" width="15%">${user.email}</td>
            <td class="text-center" width="10%">${user.phone}</td>
            <td class="text-center" width="10%">${user.address}</td>
            <td class="text-center" width="10%">${user.city}</td>
            <td class="text-center" width="5%">${user.state}</td>
            <td class="text-center" width="10%">${user.zip}</td>
        </tr>
      </table>
    </div>
    <br><br><br><br>
    <div class="order_history">
      <a class="nav-link" href="./orderhistory"><h3>Order History</h3><h5>Click here to see Order History</h5></a>
    </div>
  </div>

  <jsp:include page="include/footer.jsp" />