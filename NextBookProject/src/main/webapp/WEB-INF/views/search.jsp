<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
			<div class="navbar-header page-scroll">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-main-collapse">
					<i class="fa fa-bars"></i>
				</button>
				<a class="navbar-brand" href="welcome">
					<h1>NEXT BOOKS</h1>
				</a>
			</div>
			<!-- Collect the nav links, forms, and other content for toggling -->
			<jsp:include page="page-module/pageNavi.jsp" flush="false" />
			<!-- /.navbar-collapse -->
		</div>
	</nav>
	<!-- Section: addBook -->
	<section class="home-section text-center">
		<div class="heading-about">
			<div class="container">
				<div class="page-header">
					<h1 align="center">
						Add Books<br> <small>${msg}</small>
					</h1>
				</div>
				<form class="input-group col-md-12" name="searchForm" action="#"
					method="GET">
					<input type="text" name="keyword" class="form-control"
						placeholder="Search for..."> <span class="input-group-btn">
						<button class="btn btn-default" type="submit">search</button>
					</span>
				</form>
				<br>
				<div class="row">
					<div class="col-md-12 bookListWrap">
						<table class="table table-bordered">
							<tr>
								<th>Image</th>
								<th>Title</th>
								<th>Publisher / Author</th>
								<th>Category</th>
								<th>Add</th>
							</tr>

							<c:forEach var="item" items="${bookList}" varStatus="status">
								<tr>
									<td align="center"><a href="${item.link}"><c:if
												test="${empty item.cover_s_url}">
												<img style="width: 80px"
													src="http://dreamy.jejunu.ac.kr/image/login/logo2.jpg">
											</c:if> <c:if test="${not empty item.cover_s_url}">
												<img src="${item.cover_s_url}">
											</c:if></a></td>
									<td align="center"><a href="${item.link}">${item.title}</a></td>
									<td align="center">${item.pub_nm}/${item.author}</td>
									<td align="center">${item.category}</td>
									<td align="center">
										<form name="addBook" action="search" method="GET">
											<input class="hide" name="pageno" value="${pageno}" /> <input
												class="hide" name="keyword" value="${query}" /> <input
												class="hide" name="index" value="${status.index}" /> <input
												class="btn btn-default navbar-btn" type="submit" value="Add" />
										</form>
									</td>
								</tr>
							</c:forEach>
						</table>
						<div class="col-md-12  text-center">
							<c:forEach var="pageNo1" begin="1" end="10">
								<c:if test="${pageno-(11-pageNo1)>=1}">
									<a href="search?keyword=한국&pageno=${pageno-(8-pageNo1)}">${pageno-(8-pageNo1)}</a>
								</c:if>
							</c:forEach>
							${pageno}
							<c:forEach var="pageNo2" begin="1" end="10">
								<c:if test="${pageno+pageNo2<=totalCount}">
									<a href="search?keyword=한국&pageno=${pageno+pageNo2}">${pageno+pageNo2}</a>
								</c:if>
							</c:forEach>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-md-12 col-lg-12">
						<jsp:include page="page-module/footer.jsp" flush="false" />
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- /Section : addBook -->

	<!-- Core JavaScript Files -->
	<script src="resources/js/jquery.min.js"></script>
	<script src="resources/js/bootstrap.min.js"></script>
	<script src="resources/js/jquery.easing.min.js"></script>
	<script src="resources/js/jquery.scrollTo.js"></script>
	<script src="resources/js/wow.min.js"></script>
	<!-- Custom Theme JavaScript -->
	<script src="resources/js/custom.js"></script>
	<script src="resources/js/loginout.js"></script>
	<script>
		$('.hide').show("none");
	</script>
</body>
</html>