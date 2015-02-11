<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false" pageEncoding="UTF-8"
	contentType="text/html; charset=UTF-8"%>
<html>
<head>
<title>Home</title>
</head>

<body>
	<h2>회원가입</h2>
	<form name="signin" method="post" accept-charset="utf-8"
		action="registerFinished.do">
		<table>
			<tr height="40px">
				<td>유저ID</td>
				<td><input type="text" name="id"></td>
			</tr>
			<tr height="40px">
				<td>패스워드</td>
				<td><input type="password" name="pw"></td>
			</tr>
			<tr height="40px">
				<td>패스워드 확인</td>
				<td><input type="password" name="confirm_pw"></td>
			</tr>
		</table>
		<table>
			<tr>
				<td align="center"><input type="submit" value="회원가입"></td>
				<td align="center"><input type="reset" value="리셋"></td>
			</tr>
		</table>
	</form>
</body>
</html>