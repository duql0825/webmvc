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
		${data }¦���Դϴ�.
	</c:when>
	<c:when test="${data%2!=0 }">
		${data }Ȧ���Դϴ�.
	</c:when>
	<c:otherwise>
		�����ϴ� ������ ������ ����Ǵ� �κ�
	</c:otherwise>
</c:choose>
</body>
</html>