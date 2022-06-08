<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.*" %>
<%
	User user=(User)session.getAttribute("User");
	String name=user==null?"":user.getName();
	String email=user==null?"":user.getEmail();
	String message=user==null?"":user.getMessage();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="http://yui.yahooapis.com/3.18.1/build/cssreset/cssreset-min.css">
<link rel="stylesheet" href="/contactlesson/css/main.css">
<title>お問い合わせフォーム</title>
</head>
<body>
<div class="container">
<h1>お問い合わせフォーム</h1>
<form action="/contactlesson/contact" method="post">
<table>
<tr>
<th>お名前</th>
<td><input type="text" name="name" value=<%=name %>></td>
</tr>
<tr>
<th>メールアドレス</th>
<td><input type="email" name="email" value=<%=email %>></td>
</tr>
<tr>
<th>お問い合わせ内容</th>
<td><textarea name="message" > <%=message %></textarea></td>
</tr>
</table>
<button type="submit">確認</button>
</form>
</div>
</body>
</html>