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
		<div class="row boxed-grey">
			<form action="deleteUserSubmit" method="POST">
				<div class="row">
					<div class="form-group col-md-6 center">
						<label for="name"> USER ID</label> <input type="text"
							class="form-control" name="username" value="${username}" />
					</div>
					<div class="col-md-12">
						<input type="submit" class="btn btn-skin pull-right"
							value="DELETE" />
					</div>
				</div>
				<input type="hidden" name="${_csrf.parameterName}"
					value="${_csrf.token}" />
			</form>
		</div>
	</div>
</section>