<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

 
   ${boardVO.writer}
   ${boardVO.createDate}
   ${boardVO.title}
   ${boardVO.content}

   <br>
   <a href='<c:url value="/board/list"/>'>LIST</a>|
   <a href='<c:url value="/board/update?no=${boardVO.no}"/>'>UPDATE</a>|
   <a href='<c:url value="/board/delete?no=${boardVO.no}"/>'>DELETE</a>
</body>
</html>