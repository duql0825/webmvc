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
- ${vo.name} ȸ���� ������ -
<form action="/webmvc/update.do" method="post">
    <input type="hidden" name="num" value="${vo.num}"/>
    <table border="1" width="600px">
        <tr>
            <td>��ȣ</td>
            <td>${vo.num}</td>
        </tr>
        <tr>
            <td>�й�</td>
            <td>${vo.bun}</td>
        </tr>
        <tr>
            <td>�̸���</td>
            <td><input type="text" name="email" value="${vo.email}"/></td>
        </tr>
        <tr>
            <td>��ȭ��ȣ</td>
            <td><input type="text" name="phone" value="${vo.phone}"/></td>
        </tr>
        <tr>
            <td>�ּ�</td>
            <td><input type="text" name="addr" value="${vo.addr}" size="60"/></td>
        </tr>
        <tr>
            <td colspan = "2" align = "center">
                <input type="submit" value="�����ϱ�"/>
                <input type="button" value="�����ϱ�" onclick="fnDelete(${vo.num})"/>
                <input type="button" value="����Ʈ�ΰ���" onclick="goList()"/>
            </td>
           </tr>
    </table>
</form>
</body>
</html>