<%@page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Register</title>

    <style>
      #wrapper {
        width: 1024px;

        margin: 0 auto;

        font-family: "Lucida Sans", "Lucida Sans Regular", "Lucida Grande",
          "Lucida Sans Unicode", Geneva, Verdana, sans-serif;
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

        float: right;
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
        console.debug("jquery started ....");

        $("#listBtn").on("click", function () {
          console.log("clicked on the #listBtn...");

          self.location = "/board/list";
        }); // onclick
      }); // jq
    </script>
  </head>
  <body>
    <h1>Register</h1>

    <hr />

    <div id="wrapper">
      <form action="/board/register" method="POST">
        <table>
          <tr>
            <td><label for="title">제목</label></td>
            <td>
              <input
                type="text"
                id="title"
                name="title"
                size="50"
                placeholder="제목을 입력하세요"
              />
            </td>
            <!-- size는 랜더링된 창의 크기 -->
          </tr>

          <tr>
            <td><label for="content">내용</label></td>
            <td>
              <textarea
                name="content"
                id="content"
                cols="52"
                rows="10"
                placeholder="내용을 입력하세요"
              ></textarea>
            </td>
          </tr>

          <tr>
            <td><label for="writer">작성자</label></td>
            <td>
              <input
                type="text"
                id="writer"
                name="writer"
                size="20"
                placeholder="작성자"
              />
            </td>
          </tr>

          <tr>
            <td colspan="2">&nbsp;</td>
          </tr>
          <!-- 버튼과 작성자 사이에 차이를 띄우려고 씀 -->
          <tr>
            <td colspan="2">
              <button type="submit" id="submitBtn">REGISTER</button>
              <button type="button" id="listBtn">LIST</button>
            </td>
          </tr>
        </table>
      </form>
    </div>
  </body>
</html>
