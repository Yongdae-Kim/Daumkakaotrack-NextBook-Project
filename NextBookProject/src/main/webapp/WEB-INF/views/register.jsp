<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1" />
<meta name="description" content="" />
<meta name="author" content="" />
<title>Create a NextBook Account</title>

<!-- Bootstrap CSS -->
<link href="resources/css/bootstrap.min.css" rel="stylesheet"
	type="text/css">
<!-- Theme CSS -->
<link href="resources/css/theme_style.css" rel="stylesheet"
	type="text/css">
<!-- Fonts CSS-->
<link href="resources/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">

</head>
<body onload='document.registerForm.username.focus();'>

	<div class="container">

		<div class="page-header">
			<h1>
				Create a NextBook Account<br> <small>${msg}</small>
			</h1>
		</div>

		<!-- Register Form START -->
		<form name=registerForm class="col-md-12" method="post"
			accept-charset="utf-8" action="registerSubmit">
			<div class="form-group">
				<input type="email" class="form-control input-lg"
					placeholder="Email" name="username" value="${username}" />
			</div>
			<div class="form-group">
				<input type="password" class="form-control input-lg"
					placeholder="Password" name="password" />
			</div>
			<div class="form-group">
				<input type="password" class="form-control input-lg"
					placeholder="Confirm Password" name="confirmPassword" />
			</div>
			<div class="form-group">
				<input type="submit" class="btn btn-primary btn-lg btn-block"
					value="Create
					New Account" />
			</div>
			<input type="hidden" name="${_csrf.parameterName}"
				value="${_csrf.token}" />
		</form>
		<!-- Register Form End -->

		<div class="form-group">
			<span>Already have an account?<a href="login"> Log in</a></span>
		</div>

	</div>

	<jsp:include page="page-module/footer.jsp" flush="false" />

	<!-- Core JavaScript Files -->
	<script src="resources/js/jquery.min.js"></script>
	<script src="resources/js/bootstrap.min.js"></script>

</body>
</html>