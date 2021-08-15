<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>

<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>get.jsp</title>

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

            $("#modifyBtn").on('click', function () {
                console.log('#modifyBtn button clicked..');
                
                location.href = "/board/modify?bno=${board.bno}&currPage=${cri.currPage}&amount=${cri.amount}&pagesPerPage=${cri.pagesPerPage}";
            }); // .onclick

        }); // .jq

    </script>
</head>
<body>
    
    <h1>/WEB-INF/views/board/get.jsp</h1>

    <hr>

    <div id="wrapper">

        <form action="#">

            <table border="1">
                <tr>
                    <td>${board.bno}</td>
                </tr>
                <tr>
                    <td>${board.title}</td>
                </tr>
                <tr>
                    <td>${board.content}</td>
                </tr>
                <tr>
                    <td>${board.writer}</td>
                </tr>
            </table>

            <button type="button" id="modifyBtn">MODIFY</button>
            <button type="button" id="listBtn">LIST</button>

        </form>

    </div>

</body>
</html>