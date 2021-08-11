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

        font-size: 15px;
        font-weight: bold;

        color: white;
        background-color: rgba(44, 3, 3, 0.212);
      }

      tr:hover {
        background-color: rgb(239, 253, 226);
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

        width: 40%;
        padding-left: 10px;
      }
    </style>

    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-migrate/3.3.2/jquery-migrate.min.js"></script>

    <script>
      $(function () {
        console.clear();
        console.log("jquery started...");

        // 게시물을 등록, 수정, 삭제 처리하고 리다이렉션을 통해, 게시글 목록화면으로 이동시킬때 함께 rttrs로 전송시킨 처리결과를 경고창으로 출력
        var result = '<c:out value="${result}" />';
        // var result = '${result}';

        if (result.length > 0) {
          alert(result);
        } // if

        $("#regBtn").on("click", function () {
          console.log("onclicked on #regBtn...");

          self.location = "/board/register";
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
            <li>tbl_board</li>
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
                <a href="/board/get?bno=<c:out value='${board.bno}' />"
                  ><c:out value="${board.title}"
                /></a>
              </td>

              <!-- <td><c:out value="${board.content}" /></td> -->

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
    </div>

    <p>${result}</p>
    <!-- result라는 이름으로 공유영역에 값이 들어온다 -->
  </body>
</html>
