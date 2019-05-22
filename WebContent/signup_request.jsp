<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="p" uri="http://www.springframework.org/tags/form"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<p:form action="do_signup" method="get" modelAttribute="signup">
email: <p:input path="email"/>
pass: <p:password path="pass"/>
name: <p:input path="name"/>
mobile: <p:input path="mobile"/>
<input type="submit" value="signup">
</p:form>
</body>
</html>