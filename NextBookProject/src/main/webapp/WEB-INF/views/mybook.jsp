<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<title>NEXT BOOK - DaumKakao Track</title>

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
	<div id="preloader">
		<div id="load"></div>
	</div>

	<nav class="navbar navbar-custom navbar-fixed-top" role="navigation">
		<div class="container">
			<!-- Collect the nav links, forms, and other content for toggling -->
			<jsp:include page="page-module/pageNavi.jsp" flush="false" />
			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container -->
	</nav>


	<!-- Section: today -->
	<section id="mybooklist" class="home-section text-center">
		<div class="heading-about">
			<div class="container">
				<div class="row">
					<div class="col-lg-8 col-lg-offset-2">
						<div class="wow bounceInDown" data-wow-delay="0.4s">
							<div class="section-heading">
								<h2>MY BOOKS</h2>
								<i class="fa fa-2x fa-angle-down"></i>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

		<div class="container">
			<div class="row">
				<div class="col-lg-2 col-lg-offset-5">
					<hr class="marginbot-50">
				</div>
			</div>
			<div class="row">
				<jsp:include page="function-module/bookList.jsp" flush="false" />
			</div>
		</div>
	</section>
	<!-- /Section: today -->

	<div class="container">
		<div class="row">
			<div class="col-md-12 col-lg-12">
				<div class="wow shake" data-wow-delay="0.4s">
					<div class="page-scroll marginbot-30">
						<a href="#intro" id="totop" class="btn btn-circle"> <i
							class="fa fa-angle-double-up animated"></i>
						</a>
					</div>
				</div>
				<jsp:include page="page-module/footer.jsp" flush="false" />
			</div>
		</div>
	</div>

	<script src="resources/js/jquery.min.js"></script>
	<script src="resources/js/bootstrap.min.js"></script>
	<script src="resources/js/jquery.easing.min.js"></script>
	<script src="resources/js/jquery.scrollTo.js"></script>
	<script src="resources/js/wow.min.js"></script>
	<script src="resources/js/custom.js"></script>
</body>

</html>
