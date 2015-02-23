<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<title>Next Book - DaumKakao Track</title>

<!-- Bootstrap Core CSS -->
<link href="resources/css/bootstrap.min.css" rel="stylesheet"
	type="text/css">

<!-- Fonts -->
<link href="resources/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">
<link href="resources/css/animate.css" rel="stylesheet" type="text/css">
<!-- Squad theme CSS -->
<link href="resources/css/theme_style.css" rel="stylesheet"
	type="text/css">
<link href="resources/color/default.css" rel="stylesheet"
	type="text/css">
</head>

<body id="page-top" data-spy="scroll" data-target=".navbar-custom">

	<nav class="navbar navbar-custom navbar-fixed-top" role="navigation">
		<div class="container">
			<div class="navbar-header page-scroll">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-main-collapse">
					<i class="fa fa-bars"></i>
				</button>
				<a class="navbar-brand" href="welcome">
					<h1>NEXT BOOK</h1>
				</a>
			</div>
			<div
				class="collapse navbar-collapse navbar-right navbar-main-collapse">
				<ul class="nav navbar-nav">
					<li class="active">
					<li><a href="#adminBook">Admin Book</a></li>
					<li><a href="#adminUser">Admin User</a></li>
					<li>
						<div>
							<a href="welcome#intro">
								<button type="button" class="btn btn-default navbar-btn">User
									Mode</button>
							</a>
						</div>
					</li>
				</ul>
			</div>
		</div>
		<!-- /.container -->
	</nav>

	<!-- Section: intro -->
	<section id="intro" class="intro">
		<div class="slogan">
			<h2>
				<span class="text_color">ADMINE PAGE</span>
			</h2>
		</div>
		<div class="page-scroll">
			<a href="#adminBook" class="btn btn-circle"> <i
				class="fa fa-angle-double-down animated"></i>
			</a>
		</div>
	</section>
	<!-- /Section: intro -->

	<!-- Section: AdminForBook -->
	<jsp:include page="adminBook.jsp" flush="false" />
	<!-- /Section: AdminForBook -->


	<!-- Section: Admin For User -->
	<jsp:include page="adminUser.jsp" flush="false" />
	<!-- /Section: Admin For User -->

	<jsp:include page="page-module/footer.jsp" flush="false" />

	<script src="resources/js/jquery.min.js"></script>
	<script src="resources/js/bootstrap.min.js"></script>
	<script src="resources/js/jquery.easing.min.js"></script>
	<script src="resources/js/jquery.scrollTo.js"></script>
	<script src="resources/js/wow.min.js"></script>
	<script src="resources/js/custom.js"></script>
</body>

</html>

