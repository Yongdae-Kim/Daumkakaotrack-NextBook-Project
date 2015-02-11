
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<title>Squadfree - Free bootstrap 3 one page template</title>

<!-- Bootstrap Core CSS -->
<link href="resources/css/bootstrap.min.css" rel="stylesheet"
	type="text/css">

<!-- Fonts -->
<link href="resources/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">
<link href="resources/css/animate.css" rel="stylesheet" type="text/css">
<!-- Squad theme CSS -->
<link href="resources/css/theme_style.css" rel="stylesheet" type="text/css">
<link href="resources/color/default.css" rel="stylesheet"
	type="text/css">

</head>

<body id="page-top" data-spy="scroll" data-target=".navbar-custom">
	<!-- Preloader -->

	<p>blog : "${blog}"</p>
	<p>test : "${test}"</p>
	<p>a : "${dummy.a}"</p>

	<div id="preloader">
		<div id="load"></div>
	</div>

	<nav class="navbar navbar-custom navbar-fixed-top" role="navigation">
		<div class="container">
			<div class="navbar-header page-scroll">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-main-collapse">
					<i class="fa fa-bars"></i>
				</button>
				<a class="navbar-brand" href="index.html">
					<h1>NEXT BOOK</h1>
				</a>
			</div>

			<!-- Collect the nav links, forms, and other content for toggling -->
			<div
				class="collapse navbar-collapse navbar-right navbar-main-collapse">
				<ul class="nav navbar-nav">
					<li class="active"><a href="#intro">Home</a></li>
					<li><a href="#today">Today's Books</a></li>
					<li><a href="#">My Books</a></li>
					<li><a href="#">Add Books</a></li>
					<li><a href="#">Recommend</a></li>
					<!-- --------------------login form start-------------------- -->
					<li><a href="login">
							<button type="button" class="btn btn-default navbar-btn">Log
								in</button>
					</a></li>
					<li><a href="register">
							<button type="button" class="btn btn-default navbar-btn">Sign
								Up</button>
					</a></li>
					<span>${msg}</span>
					<!-- --------------------login form end-------------------- -->
				</ul>
			</div>
			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container -->
	</nav>

	<!-- Section: intro -->
	<section id="intro" class="intro">

		<div class="slogan">
			<h2>
				WELCOME TO <span class="text_color">NEXT BOOK</span>
			</h2>
			<h4>WE ARE GROUP OF GENTLEMEN MAKING AWESOME WEB WITH BOOTSTRAP</h4>
		</div>
		<div class="page-scroll">
			<a href="#today" class="btn btn-circle"> <i
				class="fa fa-angle-double-down animated"></i>
			</a>
		</div>
	</section>
	<!-- /Section: intro -->

	<!-- Section: today -->
	<section id="today" class="home-section text-center">
		<div class="heading-about">
			<div class="container">
				<div class="row">
					<div class="col-lg-8 col-lg-offset-2">
						<div class="wow bounceInDown" data-wow-delay="0.4s">
							<div class="section-heading">
								<h2>TODAY'S BOOKS</h2>
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
				<div class="col-xs-6 col-sm-3 col-md-3">
					<div class="wow bounceInUp" data-wow-delay="0.2s">
						<div class="team boxed-grey">
							<div class="inner">
								<h5>Anna Hanaceck</h5>
								<p class="subtitle">Pixel Crafter</p>
								<div class="avatar">
									<img src="resources/img/team/1.jpg" alt=""
										class="img-responsive img-circle" />
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-xs-6 col-sm-3 col-md-3">
					<div class="wow bounceInUp" data-wow-delay="0.5s">
						<div class="team boxed-grey">
							<div class="inner">
								<h5>Maura Daniels</h5>
								<p class="subtitle">Ruby on Rails</p>
								<div class="avatar">
									<img src="resources/img/team/2.jpg" alt=""
										class="img-responsive img-circle" />
								</div>

							</div>
						</div>
					</div>
				</div>
				<div class="col-xs-6 col-sm-3 col-md-3">
					<div class="wow bounceInUp" data-wow-delay="0.8s">
						<div class="team boxed-grey">
							<div class="inner">
								<h5>Jack Briane</h5>
								<p class="subtitle">jQuery Ninja</p>
								<div class="avatar">
									<img src="resources/img/team/3.jpg" alt=""
										class="img-responsive img-circle" />
								</div>

							</div>
						</div>
					</div>
				</div>
				<div class="col-xs-6 col-sm-3 col-md-3">
					<div class="wow bounceInUp" data-wow-delay="1s">
						<div class="team boxed-grey">
							<div class="inner">
								<h5>Tom Petterson</h5>
								<p class="subtitle">Typographer</p>
								<div class="avatar">
									<img src="resources/img/team/4.jpg" alt=""
										class="img-responsive img-circle" />
								</div>

							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- /Section: today -->

	<footer>
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
					<p>&copy;Copyright 2014 - Squad. All rights reserved.</p>
				</div>
			</div>
		</div>
	</footer>


	<!-- Core JavaScript Files -->
	<script src="resources/js/jquery.min.js"></script>
	<script src="resources/js/bootstrap.min.js"></script>
	<script src="resources/js/jquery.easing.min.js"></script>
	<script src="resources/js/jquery.scrollTo.js"></script>
	<script src="resources/js/wow.min.js"></script>
	<!-- Custom Theme JavaScript -->
	<script src="resources/js/custom.js"></script>
</body>

</html>
