<%@page import="kr.mem.model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%
    	MemberVO[] marr = new MemberVO[3];
    	MemberVO vo = new MemberVO();
    	vo.setBun(1002);
    	vo.setName("나길동");
    	vo.setPhone("010-1231-1231");
    	
    	marr[0]=vo;
    	marr[1]=vo;
    	marr[2]=vo;
    	
    	request.setAttribute("marr", marr);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<c:forEach var="vo" items="${marr }">
${vo.bun },${vo.name },${vo.phone } <br>
</c:forEach>

</body>
</html>