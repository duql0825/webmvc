<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@page import="java.util.*" %>
    <%@page import="kr.mem.model.*" %>
    <%
    	ArrayList<MemberVO> list = new ArrayList<MemberVO>();
    	MemberVO vo = new MemberVO();
		vo.setBun(3108);
		vo.setName("신엽");
		vo.setPhone("010-1231-1231");
		
		list.add(vo);
		list.add(vo);
		list.add(vo);
		request.setAttribute("list", list);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<table border="1">
	<tr>
		<td>번호</td>
		<td>이름</td>
		<td>번호</td>
	</tr>
	<c:forEach var="vo" items="${list }">
	<tr>
		<td>${vo.bun }</td>
		<td>${vo.name }</td>
		<td>${vo.phone }</td>
	</tr>
	</c:forEach>
</table>
</body>
</html>