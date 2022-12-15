<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link rel="stylesheet" href="../../pub/css/contact.css">
<jsp:include page="include/header.jsp" />

<div class="container">
    <form action="contact_page">
  
      <label for="fname">First Name</label>
      <input type="text" id="fname" name="firstname">
  
      <label for="lname">Last Name</label>
      <input type="text" id="lname" name="lastname">
  
      <label for="country">Country</label>
      <select id="country" name="country">
        <option value="australia">Australia</option>
        <option value="canada">Canada</option>
        <option value="usa">USA</option>
      </select>
  
      <label for="subject">Subject</label>
      <textarea id="subject" name="subject" placeholder="Write something.." style="height:200px"></textarea>
  
      <form action="/action_page.php">
        <p>Would you like to recieve emails about upcoming promotions?</p>
        <input type="radio" id="yes" name="Y/N" value="yes">
        <label for="yes">Yes, please!</label><br>
        <input type="radio" id="no" name="Y/N" value="no">
        <label for="no">No, thanks.</label>
      </form>

      <input type="submit" value="Submit">
  
    </form>
  </div>