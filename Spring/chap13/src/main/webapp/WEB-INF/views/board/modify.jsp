<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@taglib	uri="http://java.sun.com/jsp/jstl/core"	prefix="c" %>
<%@taglib 	uri="http://java.sun.com/jsp/jstl/fmt"	prefix="fmt" %>


<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Modify</title>

    <style>

        #wrapper {
            width: 1024px;
            
            margin: 0 auto;

            font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
            font-size: 14px;
        }

		#submitBtn {
			width: 80px;
			height: 40px;

			border: 0;

			font-size: 15px;
			font-weight: bold;

			color: white;
			background-color: green;
		}

        #removeBtn {
            width: 80px;
            height: 40px;

            border: 0;

            font-size: 15px;
            font-weight: bold;

            color: white;
            background-color: red;
        }

		#listBtn {
			width: 80px;
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
			console.debug("jquery started.....");


			$('#listBtn').on('click', function () {
				console.log('clicked on the #listBtn...');

				self.location = "/board/list";
			});	// onclick

			
			$('#removeBtn').on('click', function () {
				console.log('clicked on the #removeBtn...');
				
				// self.location = '/board/remove?bno=<c:out value="${board.bno}" />';

                var formObj = $('form');

                formObj.attr('method', 'POST');
                formObj.attr('action', '/board/remove');
                formObj.submit();
			});	// onclick
			
		});	//jq

	</script>
</head>
<body>

    <h1>Modify</h1>

    <hr>

    <div id="wrapper">

        <form action="/board/modify" method="POST">

            <input type="hidden" name="bno" value="<c:out value='${board.bno}' />">

            <table>
                <tr>
                    <td><label for="title">제목</label></td>
                    <td><input type="text" id="title" name="title" size="50" value="<c:out value='${board.title}' />" ></td>
                </tr>

                <tr>
                    <td><label for="content">내용</label></td>
                    <td><textarea name="content" id="content" cols="52" rows="10"><c:out value='${board.content}' /></textarea></td>
                </tr>
                
                <tr>
                    <td><label for="writer">작성자</label></td>
                    <td><input type="text" id="writer" name="writer" size="20" value="<c:out value='${board.writer}' />" readonly></td>
                </tr>

                <tr>
                    <td colspan="2">&nbsp;</td>
                </tr>

                <tr>
                    <td colspan="2">
                        <button type="submit" id="submitBtn">SUBMIT</button>
                        <button type="button" id="removeBtn">REMOVE</button>
                        <button type="button" id="listBtn">LIST</button>
                    </td>
                </tr>
            </table>
        </form>

    </div>
</body>
</html>