<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:forEach var="randomBooks" items="${randomBooks}" varStatus="status">
	<div class="col-xs-6 col-sm-3 col-md-3">
		<div class="wow bounceInUp"
			data-wow-delay="<c:out value="${(status.index + 1) * 0.25}"/>s">
			<div class="team boxed-grey">
				<div class="inner">
					<h5>
						<c:out value="${randomBooks.title}" />
					</h5>
					<p class="subtitle">
						<c:out value="${randomBooks.author}" />
					</p>
					<div class="avatar">
						<img src="<c:out value="${randomBooks.src}"/>"
							alt="<c:out value="${randomBooks.title}"/> 이미지"
							class="img-responsive img-circle" />
					</div>
				</div>
			</div>
		</div>
	</div>
</c:forEach>
>
