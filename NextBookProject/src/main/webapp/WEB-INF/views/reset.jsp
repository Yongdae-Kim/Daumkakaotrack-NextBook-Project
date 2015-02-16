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
<title>Reset Your NextBook Password</title>

<!-- Bootstrap Core CSS -->
<link href="resources/css/bootstrap.min.css" rel="stylesheet"
	type="text/css">
<link href="resources/css/theme_style.css" rel="stylesheet"
	type="text/css">
<!-- Fonts -->
<link href="resources/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">

</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-4">
				<a href="welcome"><button type="button"
						class="btn btn-default btn-lg ">Home</button></a>
			</div>
			<div class="col-md-4 col-md-offset-4">
				<a href="login"><button type="button"
						class="btn btn-default btn-lg ">Log In</button></a> <a href="register"><button
						type="button" class="btn btn-default btn-lg ">Sign Up</button></a>
			</div>
		</div>
		<div class="page-header">
			<h1>
				Reset Your NextBook Password<br> <small>Submit your
					email address and we’ll send you a link to reset your password.</small>
			</h1>
		</div>

		<!-- Simple Login - START -->
		<form class="col-md-12" method="post" action="loginProcess">
			<div class="form-group">
				<input type="text" class="form-control input-lg" placeholder="Email"
					name="user_reset_id">
			</div>
			<div class="form-group">
				<button class="btn btn-primary btn-lg btn-block">Submit</button>
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
