<%--
  Created by IntelliJ IDEA.
  User: Vicae
  Date: 2021/8/6
  Time: 21:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <form action="/account/transfer" method="get">
        转账人<input name="fromName"/>
        <br>
        收款人<input name="destName"/>
        <br>
        金额<input name="money"/>
        <br>
        <button type="submit">提交</button>
    </form>

</body>
</html>
