<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@page session="true"%>
<html>
<body>
	<h1>Title : ${title}</h1>

	<c:if test="${pageContext.request.userPrincipal.name != null}">
		<div>
			<span>${pageContext.request.userPrincipal.name}</span>
			<c:url value="/j_spring_security_logout" var="logoutUrl" />
			<form action="${logoutUrl}" method="post">
				<input type="submit" class="btn btn-default navbar-btn"
					value="Log Out" /><input type="hidden"
					name="${_csrf.parameterName}" value="${_csrf.token}" />
			</form>
		</div>
	</c:if>
	<div>
		<div style="float: left;">
			<c:forEach var="users" items="${users}" varStatus="status">
				<li><c:out value="${users.username}" />
					<form action="deleteUserSubmit" method="post">
						<input type="hidden" name="username" value="${users.username}" />
						<input type="submit" value="delete" /> <input type="hidden"
							name="${_csrf.parameterName}" value="${_csrf.token}" />
					</form></li>
			</c:forEach>
		</div>
		<div style="float: right;">
			<c:forEach var="books" items="${books}" varStatus="status">
				<li><c:out value="${books.title}" />
					<form action="deleteBookSubmit" method="post">
						<input type="hidden" name="isbn" value="${books.isbn}" /> <input
							type="submit" value="delete" /> <input type="hidden"
							name="${_csrf.parameterName}" value="${_csrf.token}" />
					</form></li>
			</c:forEach>
		</div>
	</div>
</body>
</html>