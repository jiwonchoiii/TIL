<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>

<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>modify.jsp</title>

    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-migrate/3.3.2/jquery-migrate.min.js"></script>

    <script>

        $(function () {
            console.clear();
            console.debug('jq started...');

            $("#listBtn").on('click', function () {
                console.log('#listBtn button clicked..');

                location.href = "/board/listPerPage?currPage=${cri.currPage}&amount=${cri.amount}&pagesPerPage=${cri.pagesPerPage}";
            }); // .onclick

            $("#removeBtn").on('click', function () {
                console.log('#removeBtn button clicked..');
                
                // 아래의 링크형태의 요청은 무조건 GET 방식임.
				// XX: self.location = '/board/remove?bno=<c:out value="${board.bno}" />';

                let formObj = $("form");    // 블록변수 => 지역변수

                formObj.attr('action', '/board/remove');    // ***
                formObj.attr('method', 'POST');

                formObj.submit();   // 실제 HTTP request 전송
            }); // .onclick

        }); // .jq

    </script>
</head>
<body>
    
    <h1>/WEB-INF/views/board/modify.jsp</h1>

    <hr>

    <div id="wrapper">

        <form action="/board/modify" method="POST">
            <!-- 어느 화면에서든, 게시판 목록 페이지로 이동시, 반드시 아래 3개의 기준 전송파라미터를
            전송시키기 위해, hidden 값으로 설정 -->
            <input type="hidden" name="currPage" value="${cri.currPage}">
            <input type="hidden" name="amount" value="${cri.amount}">
            <input type="hidden" name="pagesPerPage" value="${cri.pagesPerPage}">

            <table border="1">
                <tr>
                    <td><label for="bno">Bno</label></td>
                    <td><input type="text" id="bno" name="bno" value="${board.bno}" readonly></td>
                </tr>
                <tr>
                    <td><label for="title">Title</label></td>
                    <td><input type="text" id="title" name="title" value="${board.title}"></td>
                </tr>
                <tr>
                    <td><label for="content">Content</label></td>
                    <td><input type="text" id="content" name="content" value="${board.content}"></td>
                </tr>
                <tr>
                    <td><label for="writer">Writer</label></td>
                    <td><input type="text" id="writer" name="writer" value="${board.writer}"></td>
                </tr>
            </table>

            <button type="submit" id="submitBtn">SUBMIT</button>

            <button type="button" id="removeBtn">REMOVE</button>
            <button type="button" id="listBtn">LIST</button>

        </form>

    </div>

</body>
</html>