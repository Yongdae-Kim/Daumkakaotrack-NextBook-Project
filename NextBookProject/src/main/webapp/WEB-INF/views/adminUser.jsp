<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<section id="adminUser" class="home-section text-center">
	<div class="heading-contact">
		<div class="container">
			<div class="row">
				<div class="col-lg-8 col-lg-offset-2">
					<div class="wow bounceInDown" data-wow-delay="0.4s">
						<div class="section-heading">
							<h2>ADMIN USER</h2>
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
		<div class="row boxed-grey col-md-6 col-md-offset-3">
			<form class="form-inline" action="deleteUserSubmit" method="post">

				<c:if test="${not empty userMsg}">
					<div class="alert alert-danger" role="alert">
						<span class="glyphicon glyphicon-exclamation-sign"
							aria-hidden="true"></span> <span class="sr-only">Error:</span>
						${userMsg}
					</div>
				</c:if>

				<div class="form-group">
					<label for="exampleInputName2">Username </label> <input type="text"
						class="form-control" placeholder="Input the username"
						name="username" value="${username}">
				</div>
				<input type="submit" class="btn btn-skin pull-right" value="DELETE" />
				<input type="hidden" name="${_csrf.parameterName}"
					value="${_csrf.token}" />
			</form>
		</div>
	</div>
</section>