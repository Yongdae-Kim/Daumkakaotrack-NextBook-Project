<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:forEach var="books" items="${books}" varStatus="status">
	<div class="col-xs-6 col-sm-3 col-md-3">
		<div class="wow bounceInUp animated"
			data-wow-delay="<c:out value="${(status.index + 1) * 0.25}"/>s"
			style="visibility: visible; -webkit-animation-delay: 0.25s; -moz-animation-delay: 0.25s; animation-delay: 0.25s;">
			<div class="team boxed-grey">
				<div class="inner">
					<h5>
						<c:out value="${books.title}" />
					</h5>
					<p class="subtitle">
						<c:out value="${books.author}" />
					</p>
					<p class="subtitle">
						<c:out value="${books.publisher}" />
					</p>
					<div class="avatar">
						<img src="<c:out value="${books.src}"/>"
							alt="<c:out value="${books.title}"/> image"
							class="img-responsive img-circle" />
					</div>
				</div>
			</div>
		</div>
	</div>
</c:forEach>
