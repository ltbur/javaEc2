<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.*"%>
<%
User user=(User)session.getAttribute("registerUser");
String id = (user == null) ? "":user.getId();
String pass = (user == null) ? "":user.getPass();
String name = (user == null) ? "":user.getName();

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ユーザー登録</title>
</head>
<body>
<form action="/sessionex/RegisterUser" method="post">
ログインID:<input type="text" name="id"  value=<%=id %>><br>
パスワード:<input type="password" name="pass" value=<%=id %>><br>
名前:<input type="text" name="name" value=<%=id %>><br>
<input type="submit" value="確認">
</form>

</body>
</html>