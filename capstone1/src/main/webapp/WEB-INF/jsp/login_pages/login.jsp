<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="../include/header.jsp" />

<div class="container">
	<div class="row mt-3 mb-1">
		<h2>Login</h2>
	</div>

    <form action="" method="POST"> 
        <div class="row"       
        <div class="mt-2 mb-3 col-6">
            <label for="username" class="form-label">Username</label>
            <input type="username" name="username" class="form-control" id="username" aria-describedby="usernameHelp">
            <div id="usernamehelp" class="form-text">Enter your username</div>
        </div>
        
        <div class="row">
            <div class="mb-3 col-6">
                <label for="password" class="form-label">Password</label>
                <input type="password" name="password" class="form-control" id="password">
                <div id="passwordHelp" class="form-text">Enter your password</div>
            </div>