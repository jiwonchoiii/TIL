<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@taglib	uri="http://java.sun.com/jsp/jstl/core"	prefix="c" %>
<%@taglib 	uri="http://java.sun.com/jsp/jstl/fmt"	prefix="fmt" %>


<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Get</title>

    <style>

        #wrapper {
            width: 1024px;
            
            margin: 0 auto;

            font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
            font-size: 14px;
        }

		#modifyBtn {
			width: 80px;
			height: 40px;

			border: 0;

			font-size: 15px;
			font-weight: bold;

			color: white;
			background-color: green;
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

			
			$('#modifyBtn').on('click', function () {
				console.log('clicked on the #modifyBtn...');
				
				self.location = '/board/modify?bno=<c:out value="${board.bno}" />';
			});	// onclick
			
		});	//jq

	</script>
</head>
<body>

    <h1>Get</h1>

    <hr>

    <div id="wrapper">

        <form action="#">

            <table>
                <tr>
                    <td><label for="title">제목</label></td>
                    <td><input type="text" id="title" name="title" size="50" value="${board.title}" readonly></td>
                </tr>

                <tr>
                    <td><label for="content">내용</label></td>
                    <td><textarea name="content" id="content" cols="52" rows="10" readonly>${board.content}</textarea></td>
                </tr>
                
                <tr>
                    <td><label for="writer">작성자</label></td>
                    <td><input type="text" id="writer" name="writer" size="20" value="${board.writer}" readonly></td>
                </tr>

                <tr>
                    <td colspan="2">&nbsp;</td>
                </tr>

                <tr>
                    <td colspan="2">
                        <button type="button" id="modifyBtn">MODIFY</button>
                        <button type="button" id="listBtn">LIST</button>
                    </td>
                </tr>
            </table>
        </form>

    </div>
</body>
</html>