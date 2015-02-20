<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<body onload='document.resetForm.username.focus();'>
	<div class="container">
		<jsp:include page="page-module/loginNavi.jsp" flush="false" />
		<div class="page-header">
			<h1>
				Reset Your NextBook Password<br>
				<c:choose>
					<c:when test="${empty msg}">
						<small>Submit your email address and we’ll send you a link
							to reset your password.</small>
					</c:when>
					<c:otherwise>
						<small>${msg}</small>
					</c:otherwise>
				</c:choose>
			</h1>
		</div>

		<!-- Reset Form Start -->
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
		<!-- Reset Form End -->
	</div>

	<jsp:include page="page-module/footer.jsp" flush="false" />

	<script src="resources/js/jquery.min.js"></script>
	<script src="resources/js/bootstrap.min.js"></script>

</body>
</html>
