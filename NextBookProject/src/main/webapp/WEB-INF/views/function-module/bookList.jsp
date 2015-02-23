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
						<c:out value="${books.pub_nm}" />
					</p>
					<div class="avatar">
						<a href="${books.link}"> <c:if
								test="${empty books.cover_l_url}">
								<img style="width:120px" class="img-responsive img-circle"
									src="http://dreamy.jejunu.ac.kr/image/login/logo2.jpg">
							</c:if> <c:if test="${not empty books.cover_l_url}">
								<img class="img-responsive img-circle"
									src="${books.cover_l_url}">
							</c:if></a>
					</div>
				</div>
			</div>
		</div>
	</div>
</c:forEach>

