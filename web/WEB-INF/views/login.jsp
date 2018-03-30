<%--
  Created by IntelliJ IDEA.
  User: IT
  Date: 2018/3/30
  Time: 10:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
    <form name="form" method="get">
        <table width="200" border="1">
            <tr>
                <td colspan="2">登录窗口</td>
            </tr>
            <tr>
                <td>用户名</td>
                <td><input type="text" name="loginName" size="10"></td>
            </tr>
            <tr>
                <td>密码</td>
                <td><input type="password" name="password" size="10"></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" name="submit" value="登录"><a>注册</a></td>
            </tr>
        </table>
    </form>
</body>
</html>
