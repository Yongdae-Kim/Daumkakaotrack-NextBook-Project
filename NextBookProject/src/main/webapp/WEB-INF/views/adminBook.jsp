<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

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
		<div class="boxed-grey col-md-6 col-md-offset-3">
			<form class="form-inline" action="searchBookSubmit" method="post">
				<div class="form-group">
					<label for="exampleInputName2">Isbn </label> <input type="text"
						class="form-control" placeholder="Input the book isbn"
						name="isbn13" value="${findBook.isbn13}">
				</div>
				<input type="submit" class="btn btn-skin pull-right" value="SEARCH" />
				<input type="hidden" name="${_csrf.parameterName}"
					value="${_csrf.token}" />
			</form>
		</div>
		<hr>

		<form class="col-md-6 col-md-offset-3" action="bookSubmit"
			method="post">
			<div class="row">
				<div class="form-group center">
					<a href="${findBook.link}"><img src="${findBook.cover_l_url}"></a>
				</div>
				<div class="form-group center">
					<label for="exampleInputName2">Isbn</label> <input type="text"
						class="form-control" name="isbn13" value="${findBook.isbn13}" />
				</div>
				<div class="form-group center">
					<label for="exampleInputName2">Title</label> <input type="text"
						class="form-control" name="title" value="${findBook.title}" />
				</div>
				<div class="form-group center">
					<label for="exampleInputName2">Author</label> <input type="text"
						class="form-control" name="author" value="${findBook.author}" />
				</div>
				<div class="form-group center">
					<label for="exampleInputName2">Publisher</label> <input type="text"
						class="form-control" name="pub_nm" value="${findBook.pub_nm}" />
				</div>
				<div class="form-group center">
					<label for="exampleInputName2">Category</label> <input type="text"
						class="form-control" name="category" value="${findBook.category}" />
				</div>
				<div class="form-group center">
					<label for="exampleInputName2">img</label> <input type="text"
						class="form-control" name="cover_l_url"
						value="${findBook.cover_l_url}" />
				</div>
				<div class="form-group center">
					<label for="name">link</label> <input type="text"
						class="form-control" name="link" value="${findBook.link}" />
				</div>
			</div>
			<div class="row">

				<c:if test="${not empty bookMsg}">
					<div class="alert alert-danger" role="alert">
						<span class="glyphicon glyphicon-exclamation-sign"
							aria-hidden="true"></span> <span class="sr-only">Error:</span>
						${bookMsg}
					</div>
				</c:if>

				<div class="form-group col-xs-6 center">
					<input type="submit" class="btn btn-primary btn-lg btn-block"
						name="btnVal" value="DELETE" />
				</div>
				<div class="form-group col-xs-6 center">
					<input type="submit" class="btn btn-primary btn-lg btn-block"
						name="btnVal" value="ADD" />
				</div>
			</div>
			<input type="hidden" name="${_csrf.parameterName}"
				value="${_csrf.token}" />
		</form>
	</div>

</section>