<%@ page language="java" contentType="text/html;charset=GBK" pageEncoding="GBK"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8" />
<title>菜单管理</title>
<meta name="description" content="menu " />
<meta name="keywords" content="menu" />
<!-- Main Stylesheet --> 
<link rel="stylesheet" href="css/style.css" type="text/css" />
<script type="text/javascript" SRC="js/jquery-1.4.2.min.js"></script>
<script type="text/javascript" SRC="js/jquery.tipTip.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	$(".sf-menu>li").each(function(){
		$(this).click(function(){
			$(".sf-menu>li").each(function(){
				$(this).removeClass("current");
			});
			$(this).addClass("current");
		});
	});
});
</script>
</head>
<body>
	<!-- Header -->
	<header id="top">
		<div class="wrapper">
			<div id="title"><img SRC="img/logo.png" alt="accelet fetion management" /></div>
			<div id="topnav">
				<a href="#"><img class="avatar" SRC="img/user_32.png" alt="" /></a>
				欢迎： <b>${admin_name }</b>
				<span>|</span> <a href="#">设置</a>
				<span>|</span> <a href="logout.do">退出</a><br />
			</div>
			<nav id="menu">
				<ul class="sf-menu">
					<li class="current"><a HREF="fxAccountsManage.do" target="bottom">飞信账号管理</a></li>
					<li><a HREF="fxCellManage.do" target="bottom" >通道用户管理</a></li>
					<li><a HREF="fxUserManage.do" target="bottom">飞信好友管理</a></li>
					<li><a HREF="forms.html" target="bottom">个人信息</a></li>	
				</ul>
			</nav>
		</div>
	</header>
</body>
</html>