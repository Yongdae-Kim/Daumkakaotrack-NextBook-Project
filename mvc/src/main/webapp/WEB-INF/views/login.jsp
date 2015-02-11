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
<title>Log in to NextBook</title>

<!-- Bootstrap Core CSS -->
<link href="resources/css/bootstrap.min.css" rel="stylesheet"
	type="text/css">
<link href="resources/css/theme_style.css" rel="stylesheet"
	type="text/css">
<!-- Fonts -->
<link href="resources/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">
<!-- CUSTOM STYLE CSS -->
<link href="assets/css/style.css" rel="stylesheet" />

</head>
<body>
	<div class="container">

		<div class="page-header">
			<h1>Log in to NextBook</h1>
		</div>

		<!-- Simple Login - START -->
		<form class="col-md-12" method="post" action="loginProcess">
			<div class="form-group">
				<input type="text" class="form-control input-lg" placeholder="Email"
					name="user_id">
			</div>
			<div class="form-group">
				<input type="password" class="form-control input-lg"
					placeholder="Password" name="user_pw">
			</div>
			<div class="form-group">
				<button class="btn btn-primary btn-lg btn-block">Log in</button>
			</div>
			<div class="form-group">
				<span>Forget your password?<a href="reset"> Reset your
						password</a></span>
			</div>
			<div class="form-group">
				<span>Don't have an a account?<a href="register"> Create
						a NextBook account</a></span>
			</div>
		</form>
		<!-- Simple Login - END -->
	</div>
	<!-- /container -->

	<jsp:include page="page-module/footer.jsp" flush="false" />

	<!-- JAVASCRIPT FILES PLACED AT THE BOTTOM TO REDUCE THE LOADING TIME  -->
	<!-- Core JavaScript Files -->
	<script src="resources/js/jquery.min.js"></script>
	<script src="resources/js/bootstrap.min.js"></script>

</body>
</html>
