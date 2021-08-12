<%@page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %> <%@taglib uri="http://java.sun.com/jsp/jstl/core"
prefix="c" %> <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>

<html>
  <head>
    <meta charset="UTF-8" />
    <title>list.jsp</title>

    <style>
      * {
        margin: 0 auto;
        padding: 0;
      }

      #wrapper {
        width: 1024px;

        font-family: "Lucida Sans", "Lucida Sans Regular", "Lucida Grande",
          "Lucida Sans Unicode", Geneva, Verdana, sans-serif;
        font-size: 14px;
      }

      table {
        width: 95%;

        border: 1px ridge green;
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

      /* tr:nth-child(2n) {
			background-color: rgb(255, 254, 188);
		} */

      tr:hover {
        background-color: rgb(239, 253, 226);
        cursor: pointer;
      }

      a,
      a:link,
      a:visited {
        text-decoration: none;

        color: black;

        cursor: pointer;
      }

      td:nth-child(2) {
        text-align: left;

        width: 300px;
        padding-left: 10px;
      }

      #pagination {
        width: 95%;
        margin: 0 auto;

        font-size: 16px;
      }

      #pagination ul {
        float: right;
      }

      #pagination li {
        float: left;

        width: 30px;
        height: 30px;
        /* border: 1px dotted black; */

        list-style: none;
        text-align: center;
        line-height: 30px;
      }

      .prev,
      .next {
        width: 70px !important;

        color: white !important;
        background-color: blue;
      }

      .currPage {
        color: white !important;
        background-color: green;
      }
    </style>

    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-migrate/3.3.2/jquery-migrate.min.js"></script>

    <script>
      $(function () {
        console.clear();
        console.log("jquery started...");

        var result = '<c:out value="${result}" />';
        // var result = '${result}';

        if (result.length > 0) {
          alert(result);
        } // if

        $("#regBtn").on("click", function () {
          console.log("onclicked on #regBtn...");

          location.href =
            "/board/register?currPage=${cri.currPage}&amount=${cri.amount}&pagesPerPage=${cri.pagesPerPage}";
        }); // onclick

        $("a.prev, a.next").on("click", function (e) {
          console.log("onclicked on a.prev or a.next ...");
          console.log("\t+ this:", this);

          e.preventDefault();

          var paginationForm = $("#paginationForm");

          paginationForm.attr("action", "/board/listPerPage");
          paginationForm.attr("method", "GET");

          paginationForm.find("input[name=currPage]").val($(this).attr("href"));
          paginationForm
            .find("input[name=amount]")
            .val("${pageMaker.cri.amount}");
          paginationForm
            .find("input[name=pagesPerPage]")
            .val("${pageMaker.cri.pagesPerPage}");

          paginationForm.submit();
        }); // onclick
      }); // jq
    </script>
  </head>

  <body>
    <p>&nbsp;</p>

    <div id="wrapper">
      <table border="1">
        <caption>
          <ul id="topmenu">
            <li>&nbsp;</li>
            <li>tbl_board (${pageMaker.totalAmount})</li>
            <li><button id="regBtn" type="button">REGISTER</button></li>
          </ul>
        </caption>

        <thead>
          <tr>
            <th>bno</th>
            <th>title</th>
            <!-- <th>content</th> -->
            <th>writer</th>
            <th>insert_ts</th>
            <th>update_ts</th>
          </tr>
        </thead>

        <tbody>
          <c:forEach items="${list}" var="board">
            <tr>
              <td><c:out value="${board.bno}" /></td>
              <td>
                <a
                  href="/board/get?bno=${board.bno}&currPage=${pageMaker.cri.currPage}&amount=${pageMaker.cri.amount}&pagesPerPage=${pageMaker.cri.pagesPerPage}"
                >
                  <c:out value="${board.title}" />
                </a>
              </td>

              <td><c:out value="${board.writer}" /></td>
              <td>
                <fmt:formatDate
                  pattern="yyyy/MM/dd HH:mm:ss"
                  value="${board.insert_ts}"
                />
              </td>
              <td>
                <fmt:formatDate
                  pattern="yyyy/MM/dd HH:mm:ss"
                  value="${board.update_ts}"
                />
              </td>
            </tr>
          </c:forEach>
        </tbody>

        <tfoot></tfoot>
      </table>

      <p>&nbsp;</p>

      <div id="pagination">
        <form id="paginationForm">
          <input type="hidden" name="currPage" />
          <input type="hidden" name="amount" />
          <input type="hidden" name="pagesPerPage" />

          <ul>
            <c:if test="${pageMaker.prev}">
              <li class="prev">
                <a class="prev" href="${pageMaker.startPage - 1}">Prev</a>
              </li>
            </c:if>

            <c:forEach
              var="pageNum"
              begin="${pageMaker.startPage}"
              end="${pageMaker.endPage}"
            >
              <li class="${pageMaker.cri.currPage == pageNum? 'currPage' : ''}">
                <a
                  class="${pageMaker.cri.currPage == pageNum? 'currPage' : ''}"
                  href="/board/listPerPage?currPage=${pageNum}&amount=${pageMaker.cri.amount}&pagesPerPage=${pageMaker.cri.pagesPerPage}"
                  ><c:out value="${pageNum}"
                /></a>
              </li>
            </c:forEach>

            <c:if test="${pageMaker.next}">
              <li class="next">
                <a class="next" href="${pageMaker.endPage + 1}">Next</a>
              </li>
            </c:if>
          </ul>
        </form>
      </div>
    </div>
  </body>
</html>
