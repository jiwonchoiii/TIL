<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html lang="ko">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>login.jsp</title>
  </head>
  <body>
    <h1>/WEB-INF/views/user/login.jsp</h1>

    <hr />

    <form action="/user/loginPost" method="POST">
      <fieldset>
        <legend>loginForm</legend>

        <div>
          ID <input type="text" name="userid" placeholder="아이디를 입력하세요" />
        </div>
        <div>
          PW <input type="password" name="userpw" placeholder="비밀번호를 입력하세요"
          />
        </div>
        <div>Remember-me <input type="checkbox" name="rememberMe" /></div>

        <p></p>

        <div><button type="submit">Sign-in</button></div>
      </fieldset>
    </form>
  </body>
</html>
