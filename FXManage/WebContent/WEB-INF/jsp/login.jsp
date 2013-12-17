<%@ page language="java" contentType="text/html;charset=GBK" pageEncoding="GBK"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<title>����ƽ̨��¼</title>
<!-- Main Stylesheet --> 
<link rel="stylesheet" href="css/style.css" type="text/css" />
<!-- Your Custom Stylesheet --> 
<link rel="stylesheet" href="css/custom.css" type="text/css" />
<script type="text/javascript" SRC="js/jquery-1.4.2.min.js"></script>
<script type="text/javascript" src="js/excanvas.js"></script>
<!-- jQuery form validation -->
<script type="text/javascript" SRC="js/jquery.validate_pack.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	var validator = $("#loginform").validate({
		rules: {
			username: "required",
			password: "required"
		},
		messages: {
			username: "�������˺�",
			password: "����������"
		},
		// the errorPlacement has to take the layout into account
		errorPlacement: function(error, element) {
			error.insertAfter(element.parent().find('label:first'));
		},
		// set new class to error-labels to indicate valid fields
		success: function(label) {
			// set &nbsp; as text for IE
			label.html("&nbsp;").addClass("ok");
		}
	});

});
</script>
</head>
<body>
	<!-- Header -->
	<header id="top">
		<div class="wrapper-login">
			<!-- Title/Logo - can use text instead of image -->
			<div id="title"><img SRC="img/logo.png" alt="Administry" /></div>
			<!-- Main navigation -->
			<nav id="menu">
				<ul class="sf-menu">
					<li class="current"><a href="#">��¼</a></li>
				</ul>
			</nav>
		</div>
	</header>
	<div id="pagetitle">
		<div class="wrapper-login"></div>
	</div>
	<div id="page">
		<div class="wrapper-login">
				<!-- Login form -->
				<section class="full">					
					
					<h3>��¼���Ź����̨</h3>
					<div class="box box-info">
						<c:if test="${!empty err }"><font style="color:red;font-weight:bold;">${err}</font></c:if>
						<c:if test="${empty err }">���¼��̨</c:if>
					</div>

					<form id="loginform" method="post" action="login.do">
						<p>
							<label class="required" for="username">�û���:</label><br/>
							<input type="text" id="username" class="full" value="" name="username"/>
						</p>
						<p>
							<label class="required" for="password">��&nbsp;&nbsp;��:</label><br/>
							<input type="password" id="password" class="full" value="" name="password"/>
						</p>
						<p>
							<input type="submit" class="btn btn-green big" value="��¼"/>
						</p>
						<div class="clear">&nbsp;</div>
					</form>
				</section>
		</div>
	</div>
	<footer id="bottom">
		<div class="wrapper-login">
			<p>Copyright &copy; 2013 <b>���������Ƽ����޹�˾</b> | ������</p>
		</div>
	</footer>
</body>
</html>