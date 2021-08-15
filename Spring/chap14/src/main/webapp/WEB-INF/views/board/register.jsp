<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html>

<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>register.jsp</title>

    <style>

        #wrapper {
            width: 1024px;

            margin: 0 auto;

            font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
            font-size: 14px;
        }

        #submitBtn {
            width: 100px;
            height: 40px;

            border: 0;

            font-size: 15px;
            font-weight: bold;

            color: white;
            background-color: green;
        }

        #listBtn {
            width: 100px;
            height: 40px;

            border: 0;

            font-size: 15px;
            font-weight: bold;

            color: white;
            background-color: blue;
        }

    </style>

    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-migrate/3.3.2/jquery-migrate.min.js"></script>

    <script>

        $(function () {
            console.clear();
            console.debug('jq started...');
            
            $('#listBtn').click(function () {
                console.log('onclick for #listBtn clicked...');

                // GET, Request URI: /board/listPerPage
                location.href = '/board/listPerPage?currPage=${cri.currPage}&amount=${cri.amount}&pagesPerPage=${cri.pagesPerPage}';
            }); // onclick for #listBtn
        }); // .jq
        
    </script>
</head>
<body>
    
    <h1>Register</h1>

    <hr>

    <div id="wrapper">

        <form action="/board/register" method="POST">
            <!-- 어느 화면에서든, 게시판 목록 페이지로 이동시, 반드시 아래 3개의 기준 전송파라미터를
            전송시키기 위해, hidden 값으로 설정 -->
            <input type="hidden" name="currPage" value="${cri.currPage}">
            <input type="hidden" name="amount" value="${cri.amount}">
            <input type="hidden" name="pagesPerPage" value="${cri.pagesPerPage}">
        
            <table>
                <tr>
                    <td><label for="title">제목</label></td>
                    <td><input type="text" name="title" id="title" size="50" placeholder="제목을 입력하세요"></td>
                </tr>
                <tr>
                    <td><label for="content">내용</label></td>
                    <td><textarea name="content" id="content" rows="10" cols="53" placeholder="내용을 입력하세요"></textarea></td>
                </tr>
                <tr>
                    <td><label for="writer">작성자</label></td>
                    <td><input type="text" name="writer" id="writer" size="20" placeholder="작성자"></td>
                </tr>
                <tr>
                    <td colspan="2">&nbsp;</td>
                </tr>
                <tr>
                    <td colspan="2">
                        <button type="submit" id="submitBtn">Register</button>
                        <button type="button" id="listBtn">List</button>
                    </td>
                </tr>
            </table>

        </form>

    </div>

</body>
</html>