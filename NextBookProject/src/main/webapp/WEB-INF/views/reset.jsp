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
		<jsp:include page="page-module/loginNavi.jsp" flush="false" />
		<div class="page-header">
			<h1>
				Reset Your NextBook Password<br> <small>Submit your
					email address and we’ll send you a link to reset your password.</small>
			</h1>
		</div>

		<!-- Simple Login - START -->
		<form name="resetForm" class="col-md-12" method="post"
			action="resetSubmit">
			<div class=" form-group">
				<input type="email" class="form-control input-lg"
					placeholder="Email" name="username">
			</div>
			<div class="form-group">
				<input name="submit" class="btn btn-primary btn-lg btn-block"
					type="submit" value="Send" />
			</div>
			<input type="hidden" name="${_csrf.parameterName}"
				value="${_csrf.token}" />
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
