<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s" %>    
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sp" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1><s:message code="label.register.header"/></h1>

	<sp:form modelAttribute="bean" action="register">
		<s:message code="label.firstname"/><sp:input path="uname"/><sp:errors path="uname"/><br/>
		<s:message code="label.email"/><sp:input path="email"/><sp:errors path="email"/><br/>
		<s:message code="label.pass"/><sp:password path="pass"/><sp:errors path="pass"/><br/>
		<s:message code="label.dob"/><sp:input path="dob"/><sp:errors path="dob"/><br/>
		
		<br/>
		<input type="submit"/>
		
	</sp:form>
	${errmsg}

</body>
</html>