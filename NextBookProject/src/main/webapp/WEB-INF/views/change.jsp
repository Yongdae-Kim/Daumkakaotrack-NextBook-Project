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
<title>Change Password</title>

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
<body onload='document.changeForm.oldPassword.focus();'>

	<div class="container">
		<jsp:include page="page-module/loginNavi.jsp" flush="false" />
		<div class="page-header">
			<h1>
				Change Password<br> <small>${msg}</small>
			</h1>
		</div>

		<!-- Change Form START -->
		<form name=changeForm class="col-md-12" method="post"
			accept-charset="utf-8" action="changeSubmit">
			<div class="form-group">
				<input type="password" class="form-control input-lg"
					placeholder="Old Password" name="oldPassword" />
			</div>
			<div class="form-group">
				<input type="password" class="form-control input-lg"
					placeholder="New Password" name="password" />
			</div>
			<div class="form-group">
				<input type="password" class="form-control input-lg"
					placeholder="New Password(again)" name="confirmPassword" />
			</div>
			<div class="form-group">
				<input type="submit" class="btn btn-primary btn-lg btn-block"
					value="Save" />
			</div>
			<input type="hidden" name="${_csrf.parameterName}"
				value="${_csrf.token}" />
		</form>
		<!-- Change Form End -->

	</div>

	<jsp:include page="page-module/footer.jsp" flush="false" />

	<!-- Core JavaScript Files -->
	<script src="resources/js/jquery.min.js"></script>
	<script src="resources/js/bootstrap.min.js"></script>

</body>
</html>