<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="login.do" method="post">
		<input type="hidden" name="action" value="login">
		아이디 <input type="text" name="mid" required> <br>
		비밀번호 <input type="password" name="mpw" required> <br>
		<input type="submit" value="로그인" required> <br>
	</form>
</body>
</html>
