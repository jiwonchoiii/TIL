<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@page session="false" %> <%-- session을 사용하지 않겠다 --%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>

<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>errorPage.jsp</title>
</head>
<body>
    <h1>/WEB-INF/views/errorPage.jsp</h1>
    <hr>
    <p>${exception}</p>
    <hr>
    <ul>
        <c:forEach items="${exception.getStackTrace()}" var="stack">
            <li><c:out value="${stack}"/></li>
        </c:forEach>
    </ul>
</body>
</html>