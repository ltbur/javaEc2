<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.*" %>
<%
	User user=(User)session.getAttribute("User");
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
<p>以下の内容でよろしいですか？</p>
<table>
<tr>
<th>お名前</th>
<td><%=user.getName() %></td>
</tr>
<tr>
<th>メールアドレス</th>
<td><%=user.getEmail() %></td>
</tr>
<tr>
<th>お問い合わせ内容</th>
<td><%=user.getMessage() %></td>
</tr>
</table>
<div class="btBox">
<a href="/contactlesson/contact">戻る</a>
<a href="/contactlesson/contact?mode=send">送信</a>
</div>
</div>
</body>
</html>