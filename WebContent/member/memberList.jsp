<%@page import="kr.mem.model.MemberVO"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
        function insertFn() {
            location.href="/webmvc/memberform.do";
        }
        function deleteFn(num) {
            //alert(num);
            location.href="/webmvc/delete.do?num="+num;
        }
    </script>
</head>
<body>
<table border="1" width="600px">
    <tr>
        <td>��ȣ</td>
        <td>�й�</td>
        <td>�̸�</td>
        <td>��ȭ��ȣ</td>
        <td>�̸���</td>
        <td>�ּ�</td>
        <td>����</td>
    </tr>

<c:forEach var="vo" items="${list}">
    <tr>
        <td>${vo.num}</td>
        <td>${vo.bun}</td>
        <td><a href="/webmvc/content?num=${vo.num}">${vo.name}</a></td>
        <td>${vo.phone}</td>
        <td>${vo.email}</td>
        <td>${vo.addr}</td>
        <td><input type="button" value="����" onclick="deleteFn(${vo.num})"/></td>
    </tr>      
</c:forEach>
    <tr>
        <td colspan="7" align="right">
            <input type="button" value="ȸ������" onclick="insertFn()">
        </td>
    </tr>
</table>
</body>
</html>