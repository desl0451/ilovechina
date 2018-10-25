﻿<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="UTF-8" />
<title>系统登录 - 中华网</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath }/statics/backend/css/style.css" />
</head>
<body class="login_bg">
	<section class="loginBox">
		<header class="loginHeader">
			<h1>中华网</h1>
		</header>
		<section class="loginCont">
			<form class="loginForm"
				action="${pageContext.request.contextPath }/user/dologin.html"
				name="actionForm" id="actionForm" method="post">
				<div class="info">${error}</div>
				<div class="inputbox">
					<label for="user">用户名：</label> <input type="text"
						class="input-text" id="userCode" name="userCode"
						placeholder="请输入用户名" value="admin" required />
				</div>
				<div class="inputbox">
					<label for="mima">密码：</label> <input type="password"
						id="userPassword" name="userPassword" placeholder="请输入密码"
						value="8888888" required />

				</div>
				<div class="subBtn">
					<input type="submit" value="登录" /> <input type="reset" value="重置" />
				</div>
			</form>
		</section>
	</section>
</body>
</html>
