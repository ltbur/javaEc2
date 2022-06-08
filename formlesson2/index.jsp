<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>犬の年齢換算</title>
</head>
<body>
<form action="/formlesson2/Result" method="post">
犬の名前:<br>
<input type="text" name="name"><br>
犬の年齢:<br>
<input type="text" name="age" method="post">
<input type="submit" value="送信">
</form>

</body>
</html>