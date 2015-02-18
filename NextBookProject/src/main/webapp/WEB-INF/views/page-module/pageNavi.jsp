<%@taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="collapse navbar-collapse navbar-right navbar-main-collapse">
	<ul class="nav navbar-nav">
		<li class="active"><a href="#intro">Home</a></li>
		<li><a href="#today">Today's Books</a></li>
		<li><a href="#">My Books</a></li>
		<li><a href="#">Add Books</a></li>
		<li><a href="#">Recommend</a></li>
		<li><sec:authorize access="isAnonymous()">
				<div>
					<a href="login">
						<button type="button" class="btn btn-default navbar-btn">Log
							in</button>
					</a> <a href="register">
						<button type="button" class="btn btn-default navbar-btn">Sign
							Up</button>
					</a>
				</div>
			</sec:authorize></li>
		<li><sec:authorize access="hasRole('ROLE_USER')">
				<c:if test="${pageContext.request.userPrincipal.name != null}">
					<span>${pageContext.request.userPrincipal.name}</span>
					<button id="logoutBtn" type="button"
						class="btn btn-default navbar-btn">Logout</button>
				</c:if>

				<!-- For login user -->
				<c:url value="/j_spring_security_logout" var="logoutUrl" />
				<form id="logoutForm" action="${logoutUrl}" method="post">
					<input type="hidden" name="${_csrf.parameterName}"
						value="${_csrf.token}" />
				</form>
			</sec:authorize>
		<li>
	</ul>

</div>
