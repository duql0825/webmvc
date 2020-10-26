<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%
    	String[] f={"사과", "바나나", "오렌지", "포도", "귤"};
    	request.setAttribute("f", f);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<c:forEach var="{frName" items="${f}">
	${frName }
</c:forEach>
</body>
</html>