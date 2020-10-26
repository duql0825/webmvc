<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
    function goList(){
        location.href = "/webmvc/list.do";
    }
    function fnDelete(num){
        location.href = "/webmvc/delete.do?num=" + num;
    }
</script>
</head>
<body>
- ${vo.name} 회원의 상세정보 -
<form action="/webmvc/update.do" method="post">
    <input type="hidden" name="num" value="${vo.num}"/>
    <table border="1" width="600px">
        <tr>
            <td>번호</td>
            <td>${vo.num}</td>
        </tr>
        <tr>
            <td>학번</td>
            <td>${vo.bun}</td>
        </tr>
        <tr>
            <td>이메일</td>
            <td><input type="text" name="email" value="${vo.email}"/></td>
        </tr>
        <tr>
            <td>전화번호</td>
            <td><input type="text" name="phone" value="${vo.phone}"/></td>
        </tr>
        <tr>
            <td>주소</td>
            <td><input type="text" name="addr" value="${vo.addr}" size="60"/></td>
        </tr>
        <tr>
            <td colspan = "2" align = "center">
                <input type="submit" value="수정하기"/>
                <input type="button" value="삭제하기" onclick="fnDelete(${vo.num})"/>
                <input type="button" value="리스트로가기" onclick="goList()"/>
            </td>
           </tr>
    </table>
</form>
</body>
</html>