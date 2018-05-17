<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%> 
<html>
    <head>
        <meta charset="UTF-8" />
    </head>
    <body>
        恭喜，web項目已經成功搭建！<br/><br/>
   Language:
    <a href="?lang=zh_CN"><fmt:message key="language.cn"/></a> &nbsp;&nbsp;&nbsp;
    <a href="?lang=en_US"><fmt:message key="language.en"/></a>
    <h1>
        <fmt:message key="welcome"/>
    </h1>
    	当前语言: ${pageContext.response.locale}<br/><br/>
        <a href="user"><fmt:message key="index.addUser"/></a>
    </body>
</html>