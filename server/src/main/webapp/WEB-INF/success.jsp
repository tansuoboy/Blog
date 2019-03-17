<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2018/12/25
  Time: 13:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8"/>
    <title>后台管理登录页面</title>
    <link rel="stylesheet" href="../css/layui.css" type="text/css">

</head>
<style>
    body {
        /*加载背景图*/
        background-image: url(../imges/bgImg.jpg);
        /* 背景图垂直、水平均居中 */
        background-position: center center;
        /* 背景图不平铺 */
        background-repeat: no-repeat;
        /* 当内容高度大于图片高度时，背景图像的位置相对于viewport固定 */
        background-attachment: fixed;
    / /此条属性必须设置否则可能无效/
        /* 让背景图基于容器大小伸缩 */
    background-size: cover;
        /* 设置背景颜色，背景图加载过程中会显示背景色 */
        background-color: #CCCCCC;
    }
</style>
<body>
<div class="content">
    <div style="color: red;font-size: 18px;text-align: center;">${info}</div>
    <div class="bigTitle"> My Manager System</div>
    <form method="post" action="http://localhost:8080/view/login" class="logCon">
        <div class="line">
            <span>账号:</span>
            <input type="text" class="bt_input" name="username"/>
        </div>
        <div class="line">
            <span>密码:</span>
            <input type="password" class="bt_input" name="password"/>
        </div>
        <div class="line">
            <input type="submit" value="登陆" class="loginBt"/>
        </div>
    </form>
</div>
</body>

<script src="../js/layui.js" type="text/javascript"></script>

</html>

