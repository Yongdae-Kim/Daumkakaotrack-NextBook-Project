<section id="adminBook" class="home-section text-center">
	<div class="heading-contact">
		<div class="container">
			<div class="row">
				<div class="col-lg-8 col-lg-offset-2">
					<div class="wow bounceInDown" data-wow-delay="0.4s">
						<div class="section-heading">
							<h2>ADMIN BOOK</h2>
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
			<div class="boxed-grey">
				<div class="row">
					<form action="searchBookSubmit" method="post">
						<div class="form-group col-md-6">
							<label for="name"> ISBN</label> <input type="text"
								class="form-control" id="name" placeholder="Enter Book ISBN"
								name="isbn13" value="${findBook.isbn13}" />
						</div>
						<div class="form-group col-md-6">
							<input type="submit" class="btn btn-skin pull-right"
								value="SEARCH" />
						</div>
						<input type="hidden" name="${_csrf.parameterName}"
							value="${_csrf.token}" />
					</form>
				</div>
			</div>
			<hr>

			<div class="boxed-grey">
				<form action="bookSubmit" method="post">
					<div class="row">
						<div class="form-group center">
							<a href="${findBook.link}"><img src="${findBook.cover_l_url}"></a>
							<input type="text" class="form-control" name="link"
								value="${findBook.link}" /> <input type="text"
								class="form-control" name="cover_l_url"
								value="${findBook.cover_l_url}" />
						</div>
						<div class="form-group center">
							<label for="name"> Book Isbn</label> <input type="text"
								class="form-control" name="isbn13" value="${findBook.isbn13}" />
						</div>
						<div class="form-group center">
							<label for="name"> Book Title</label> <input type="text"
								class="form-control" name="title" value="${findBook.title}" />
						</div>
						<div class="form-group center">
							<label for="name"> Author</label> <input type="text"
								class="form-control" name="author" value="${findBook.author}" />
						</div>
						<div class="form-group center">
							<label for="name"> Publisher</label> <input type="text"
								class="form-control" name="pub_nm" value="${findBook.pub_nm}" />
						</div>
						<div class="form-group center">
							<label for="name"> Category</label> <input type="text"
								class="form-control" name="category"
								value="${findBook.category}" />
						</div>
					</div>
					<div class="row">
						<div class="form-group col-md-3 center">
							<input type="submit" class="btn btn-skin pull-right"
								name="btnVal" value="DELETE" />
						</div>
						<div class="form-group col-md-3 center">
							<input type="submit" class="btn btn-skin pull-right"
								name="btnVal" value="ADD" />
						</div>
						<div class="form-group col-md-3 center">
							<input type="submit" class="btn btn-skin pull-right"
								name="btnVal" value="MODIFY" />
						</div>
					</div>
					<input type="hidden" name="${_csrf.parameterName}"
						value="${_csrf.token}" />
				</form>
			</div>
		</div>

	</div>
</section>