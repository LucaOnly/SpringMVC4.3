<%@ page contentType="text/html; charset=UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%> 
<html>
<head>
<title><fmt:message key="index.addUser"/></title>
</head>
<body>
	<form:form method="POST" commandName="form" action="${pageContext.request.contextPath}/user/save">
		<form:errors path="*"></form:errors><br/><br/>
		<fieldset>
			<legend><fmt:message key="index.addUser"/></legend>
			<p>
				<label for="user"><fmt:message key="addUser.user.name"/></label>
				<form:input path="name" />
				<form:errors path="name" />
			</p>
			<p>
				<label for="user"><fmt:message key="addUser.user.pwd"/></label>
				<form:password path="pwd" />
				<form:errors path="pwd" />
				<br>
			<p id="buttons">
				<input type="submit" value="<fmt:message key="btn.name.register"/>">
			</p>
		</fieldset>
	</form:form>

	<%-- <form action="user/save" method="post">
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
	</form> --%>
</body>
</html>