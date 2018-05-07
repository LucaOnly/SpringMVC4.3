<%@ page contentType="text/html; charset=UTF-8"%>
<html>
<head>
<title>增加用户</title>
</head>
<body>
	<form action="user/save" method="post">
		<fieldset>
			<legend>创建用户</legend>
			<p>
				<label>姓名：</label> <input type="text" id="name" name="name"
					tabindex="1">
			</p>
			<p>
				<label>密码：</label> <input type="text" id="pwd" name="pwd"
					tabindex="2">
			</p>
			<p id="buttons">
				<input id="reset" type="reset" tabindex="3" value="取消">
				<input id="submit" type="submit" tabindex="4" value="创建">
			</p>
		</fieldset>
	</form>
</body>
</html>