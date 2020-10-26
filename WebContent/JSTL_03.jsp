<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <c:set var="data" value="7"/>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<c:choose>
	<c:when test="${data%2==0 }">
		${data }짝수입니다.
	</c:when>
	<c:when test="${data%2!=0 }">
		${data }홀수입니다.
	</c:when>
	<c:otherwise>
		만족하는 조건이 없을때 실행되는 부분
	</c:otherwise>
</c:choose>
</body>
</html>