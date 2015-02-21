<%@taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="collapse navbar-collapse navbar-right navbar-main-collapse">
	<ul class="nav navbar-nav">
		<li class="active"><a href="welcome#intro">Home</a></li>
		<li><a href="welcome#today">Today's Books</a></li>
		<li><a href="mybook#mybooklist">My Books</a></li>
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
					<div>
						<div style="float: left;">
							<form action="change" method="post">
								<input type="hidden" name="username"
									value="${pageContext.request.userPrincipal.name}" /> <input
									type="submit" class="btn btn-default navbar-btn"
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
			</sec:authorize>
		<li>
	</ul>

</div>
