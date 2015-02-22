<%@taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="collapse navbar-collapse navbar-right navbar-main-collapse">
	<ul class="nav navbar-nav">
		<li class="active"><a href="welcome#intro">Home</a></li>
		<li><a href="welcome#today">Today's Books</a></li>
		<sec:authorize access="isAnonymous()">
			<li><div>
					<a href="login">
						<button type="button" class="btn btn-default navbar-btn">Log
							in</button>
					</a> <a href="register">
						<button type="button" class="btn btn-default navbar-btn">Sign
							Up</button>
					</a>
				</div></li>
		</sec:authorize>
		<sec:authorize access="hasRole('ROLE_USER')">
			<li><a href="mybook#mybooklist">My Books</a></li>
			<li><a href="#">Add Books</a></li>
			<li><a href="#">Recommend</a></li>
			<sec:authorize access="hasRole('ROLE_ADMIN')">
				<li><a href="admin">Admin</a></li>
			</sec:authorize>
			<li><div>
					<c:if test="${pageContext.request.userPrincipal.name != null}">
						<span>${pageContext.request.userPrincipal.name}</span>
						<div>
							<div style="float: left;">
								<form action="change" method="post">
									<input type="submit" class="btn btn-default navbar-btn"
										value="My Page" /> <input type="hidden"
										name="${_csrf.parameterName}" value="${_csrf.token}" />
								</form>
							</div>
							<div style="float: right;">
								<c:url value="/j_spring_security_logout" var="logoutUrl" />
								<form action="${logoutUrl}" method="post">
									<input type="submit" class="btn btn-default navbar-btn"
										value="Log Out" /><input type="hidden"
										name="${_csrf.parameterName}" value="${_csrf.token}" />
								</form>
							</div>
						</div>
					</c:if>
				</div>
			<li>
		</sec:authorize>
	</ul>
</div>
