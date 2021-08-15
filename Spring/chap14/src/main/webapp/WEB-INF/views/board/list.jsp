<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>

<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>list.jsp</title>

    <style>

		* {	
			margin: 0 auto;
			padding: 0;
		}

		#wrapper {
			width: 1024px;

			font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
			font-size: 14px;
		}
		
		table {
			width: 95%;

			border: 1px ridge rgb(58, 161, 58);
			border-collapse: collapse;

			text-align: center;
		}

		th {
			padding: 10px;

			color: white;
			background-color: purple;

			font-size: 16px;
		}

		td {
			padding: 3px;
		}

		caption {
			font-size: 16px;
			font-weight: bold;

			padding: 0;
		}

		#topmenu > li {
			float: left;

			text-align: center;
			line-height: 50px;
			list-style: none;

			width: 33%;
			height: 50px;
		}

		#regBtn {
			width: 150px;
			height: 40px;

			border: 0;

			cursor: pointer;

			font-size: 15px;
			font-weight: bold;

			color: white;
			background-color: red;
		}

		tr:hover {
			background-color: rgb(239, 253, 226);
		}

		a, a:link, a:visited {
			text-decoration: none;

			color: black;

			cursor: pointer;
		}

		td:nth-child(2) {
			text-align: left;

			width: 40%;
			padding-left: 10px;
		}

		#pagination {
			width: 95%;

			margin: 0 auto;
		}

		#pagination ul {
			float: right;
		}

		#pagination li {
			float: left;

			width: 30px;
			height: 30px;
			border: 1px dotted black;

			text-align: center;
			list-style: none;
			line-height: 30px;
		}

		.prev, .next {
			width: 70px!important;

			color: white!important;
			background-color: blue;
		}

		.currPage {
			background-color: green;
			color: white;
		}

    </style>

    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-migrate/3.3.2/jquery-migrate.min.js"></script>

    <script>

        $(function () {
            console.clear();
            console.debug('jq started...');

            // 게시글의 등록, 수정, 삭제 처리 후, 리다이렉션을 통해,
            // 게시글 목록화면으로 이동시킬 때 함께 임시박스(rttrs)로 전송시킨
            // 처리결과를 경고창으로 출력시키자!
            var result = '<c:out value="${result}" />';
            if(result.length > 0) {
                alert(result);
            } // if

            $('#regBtn').click(function () {
                console.log('onclick on #regBtn clicked...');

                location.href = "/board/register?currPage=${cri.currPage}&amount=${cri.amount}&pagesPerPage=${cri.pagesPerPage}";  // GET, Request URI: /board/register
            }); // onclick

			$('a.prev, a.next').on('click', function (e) {
				console.debug("onclicked for a.next or a.prev ...");
				console.log('\t+ this:', this);

				// Event에 의한 선택된 요소의 기본동작을 금지(무력화)
				e.preventDefault();

				// 아래 지역변수에는 Rvalue 선택자에 의해서 선택된 요소
				// (즉,form 태그)가 저장됨.
				var paginationForm = $('#paginationForm');

				paginationForm.attr('action', '/board/listPerPage');
				paginationForm.attr('method', 'GET');

				paginationForm.find('input[name=currPage]').val($(this).attr('href'));
				paginationForm.find('input[name=amount]').val('${pageMaker.cri.amount}');
				paginationForm.find('input[name=pagesPerPage]').val('${pageMaker.cri.pagesPerPage}');

				paginationForm.submit();
			});	// onclick for Prev, Next button

        }); // .jq

    </script>
</head>
<body>

    <div id="wrapper">
    
        <table border="1">
            <caption>
				<ul id="topmenu">
					<li>&nbsp;</li>
					<li>tbl_board</li>
					<li><button id="regBtn" type="button">REGISTER</button></li>
				</ul>
            </caption>

            <thead>
                <tr>
                    <th>bno</th>
                    <th>title</th>
                    <th>writer</th>
                    <th>insert_ts</th>
                    <th>update_ts</th>
                </tr>
            </thead>

            <tbody>

                <c:forEach items="${list}" var="board">

                    <tr>
                        <td><c:out value="${board.bno}"/></td>
                        <td><a href="/board/get?bno=${board.bno}&currPage=${pageMaker.cri.currPage}&amount=${pageMaker.cri.amount}&pagesPerPage=${pageMaker.cri.pagesPerPage}"><c:out value="${board.title}"/></a></td>
                        <td><c:out value="${board.writer}"/></td>
                        <td><fmt:formatDate pattern="yyyy/MM/dd HH:mm:ss" value="${board.insert_ts}" /></td>
                        <td><fmt:formatDate pattern="yyyy/MM/dd HH:mm:ss" value="${board.update_ts}" /></td>
                    </tr>

                </c:forEach>

            </tbody>
        </table>

		<p>&nbsp;</p>

		<div id="pagination">

			<form id="paginationForm">
				<!-- 어느 화면에서든, 게시판 목록 페이지로 이동시, 반드시 아래 3개의 기준 전송파라미터를
				전송시키기 위해, hidden 값으로 설정 -->
				<input type="hidden" name="currPage">
				<input type="hidden" name="amount">
				<input type="hidden" name="pagesPerPage">

				<ul>
					<c:if test="${pageMaker.prev}">
						<li class="prev"><a class="prev" href="${pageMaker.startPage - 1}">Prev</a></li>
					</c:if>

					<!-- begin ~ end까지 반복하고, 현재의 번호값은 var속성에 넣어준다 -->
					<c:forEach
						begin="${pageMaker.startPage}"
						end="${pageMaker.endPage}"
						var="pageNum">

						<li class="${pageMaker.cri.currPage == pageNum? 'currPage' : ''}">
							<a 	
								class="${pageMaker.cri.currPage == pageNum? 'currPage' : ''}"
								href="/board/listPerPage?currPage=${pageNum}&amount=${pageMaker.cri.amount}&pagesPerPage=${pageMaker.cri.pagesPerPage}">
								${pageNum}
							</a>
						</li>

					</c:forEach>

					<c:if test="${pageMaker.next}">
						<li class="next"><a class="next" href="${pageMaker.endPage + 1}">Next</a></li>
					</c:if>
				</ul>

			</form>

		</div>

    </div>

    <p>${result}</p>
    <p>${pageMaker.cri.pagesPerPage}</p>

</body>
</html>