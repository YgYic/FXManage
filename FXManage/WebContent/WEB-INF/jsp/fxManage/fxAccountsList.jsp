<%@ page language="java" contentType="text/html;charset=GBK" pageEncoding="GBK"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="gbk" />
<title>飞信账号管理</title>
<meta name="description" content="Administry - Admin Template by www.865171.cn" />
<meta name="keywords" content="Admin,Template" />
<!-- Favicons --> 
<link rel="shortcut icon" type="image/png" HREF="img/favicons/favicon.png"/>
<link rel="icon" type="image/png" HREF="img/favicons/favicon.png"/>
<link rel="apple-touch-icon" HREF="img/favicons/apple.png" />
<!-- Main Stylesheet --> 
<link rel="stylesheet" href="css/style.css" type="text/css" />
<!-- Colour Schemes
Default colour scheme is blue. Uncomment prefered stylesheet to use it.
<link rel="stylesheet" href="css/brown.css" type="text/css" media="screen" />  
<link rel="stylesheet" href="css/gray.css" type="text/css" media="screen" />  
<link rel="stylesheet" href="css/green.css" type="text/css" media="screen" />
<link rel="stylesheet" href="css/pink.css" type="text/css" media="screen" />  
<link rel="stylesheet" href="css/red.css" type="text/css" media="screen" />
-->
<!-- Your Custom Stylesheet --> 
<link rel="stylesheet" href="css/custom.css" type="text/css" />
<!--swfobject - needed only if you require <video> tag support for older browsers -->
<script type="text/javascript" SRC="js/swfobject.js"></script>
<!-- jQuery with plugins -->
<script type="text/javascript" SRC="js/jquery-1.4.2.min.js"></script>
<!-- Could be loaded remotely from Google CDN : <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.4.2/jquery.min.js"></script> -->
<script type="text/javascript" SRC="js/jquery.ui.core.min.js"></script>
<script type="text/javascript" SRC="js/jquery.ui.widget.min.js"></script>
<script type="text/javascript" SRC="js/jquery.ui.tabs.min.js"></script>
<!-- jQuery tooltips -->
<script type="text/javascript" SRC="js/jquery.tipTip.min.js"></script>
<!-- Superfish navigation -->
<script type="text/javascript" SRC="js/jquery.superfish.min.js"></script>
<script type="text/javascript" SRC="js/jquery.supersubs.min.js"></script>
<!-- jQuery form validation -->
<script type="text/javascript" SRC="js/jquery.validate_pack.js"></script>
<!-- jQuery popup box -->
<script type="text/javascript" SRC="js/jquery.nyroModal.pack.js"></script>
<!-- jQuery data tables -->
<script type="text/javascript" SRC="js/jquery.dataTables.min.js"></script>
<!-- Internet Explorer Fixes --> 
<!--[if IE]>
<link rel="stylesheet" type="text/css" media="all" href="css/ie.css"/>
<script src="js/html5.js"></script>
<![endif]-->
<!--Upgrade MSIE5.5-7 to be compatible with MSIE8: http://ie7-js.googlecode.com/svn/version/2.1(beta3)/IE8.js -->
<!--[if lt IE 8]>
<script src="js/IE8.js"></script>
<![endif]-->
<script type="text/javascript">
$(document).ready(function(){
	
	/* setup navigation, content boxes, etc... */
	Administry.setup();
	
	/* datatable */
	$('#example').dataTable();
	
	/* expandable rows */
	Administry.expandableRows();
	
	$("#accountsQuery").validate({
		rules: {
			account: "required",
			stringCheck:true
		},
		messages: {
			account: "请输入账号",
			stringCheck: "用户名只能包括中文字、英文字母、数字和下划线"
		},
		// the errorPlacement has to take the layout into account
		errorPlacement: function(error, element) {
			error.insertAfter(element.parent().find('label:last'));
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
	<!-- Page title -->
	<div id="pagetitle">
		<div class="wrapper">
			<h1>飞信账号列表</h1>
			<!-- Quick search box -->
			<form action="fxAccountsList.do" method="post" id="accountsQuery">
				<input class="" type="text" id="account" name="account" value=""/>
			</form>
		</div>
	</div>
	<!-- End of Page title -->
	
	<!-- Page content -->
	<div id="page">
		<!-- Wrapper -->
		<div class="wrapper">
				<!-- Left column/section -->
				<section class="column width6 first">					
					
					<h3>Expandable table rows</h3>
					
					<div class="box box-info">Click on a link to expand the row</div>
					
					<table id="report" class="stylized full" style="">
						<thead>
							<tr>
								<th>Country</th>
								<th class="ta-right">Population</th>
								<th class="ta-right">Area</th>
								<th>Official languages</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td class="title">
									<div>
										<a href="#"><b>United States of America</b></a>
										<div class="listingDetails">
											<div class="pad">
												<b>Additional information</b>
												<ul>
													<li><a HREF="http://www.865171.cn">www.865171.cn</a></li>
													<li><a HREF="http://www.865171.cn">www.865171.cn</a></li>
													<li><a HREF="http://www.865171.cn">www.865171.cn</a></li>
												</ul>
											</div>
										</div>
									</div>
								</td>
								<td class="ta-right">306,939,000</td>
								<td class="ta-right">9,826,630 km<sup>2</sup></td>
								<td>English</td>
							</tr>
							<tr>
								<td class="title">
									<div>
										<a href="#"><b>United Kingdom</b></a>
										<div class="listingDetails" style="z-index:1">
											<div class="pad">
												<b>Additional information</b>
												<ul>
													<li><a HREF="http://www.865171.cn">www.865171.cn</a></li>
													<li><a HREF="http://www.865171.cn">www.865171.cn</a></li>
													<li><a HREF="http://www.865171.cn">www.865171.cn</a></li>
												</ul>
											</div>
										</div>
									</div>
								</td>
								<td class="ta-right">61,612,300</td>
								<td class="ta-right">244,820 km<sup>2</sup></td>
								<td>English</td>
							</tr>
							<tr>
								<td class="title">
									<div>
										<a href="#"><b>India</b></a>
										<div class="listingDetails">
											<div class="pad">
												<b>Additional information</b>
												<ul>

													<li><a HREF="http://www.865171.cn">www.865171.cn</a></li>
													<li><a HREF="http://www.865171.cn">www.865171.cn</a></li>
													<li><a HREF="http://www.865171.cn">www.865171.cn</a></li>
												</ul>
											</div>
										</div>
									</div>
								</td>
								<td class="ta-right">1,147,995,904</td>
								<td class="ta-right">3,287,240 km<sup>2</sup></td>
								<td>Hindi, English</td>
							</tr>
						</tbody>
					</table>
					
					<div class="clear">&nbsp;</div>
					
					<h3>Data tables</h3>
					
					<table class="display stylized" id="example">
						<thead>
							<tr>
								<th>Rendering engine</th>
								<th>Browser</th>
								<th>Platform(s)</th>
								<th>Engine version</th>
								<th>CSS grade</th>
							</tr>
						</thead>
						<tbody>
							<tr class="gradeX">
								<td>Trident</td>
								<td>Internet Explorer 4.0</td>
								<td>Win 95+</td>
								<td class="center">4</td>
								<td class="center">X</td>
							</tr>
							<tr class="gradeC">
								<td>Trident</td>
								<td>Internet
									 Explorer 5.0</td>
								<td>Win 95+</td>
								<td class="center">5</td>
								<td class="center">C</td>
							</tr>
							<tr class="gradeA">
								<td>Trident</td>
								<td>Internet
									 Explorer 5.5</td>
								<td>Win 95+</td>
								<td class="center">5.5</td>
								<td class="center">A</td>
							</tr>
							<tr class="gradeA">
								<td>Trident</td>
								<td>Internet
									 Explorer 6</td>
								<td>Win 98+</td>
								<td class="center">6</td>
								<td class="center">A</td>
							</tr>
							<tr class="gradeA">
								<td>Trident</td>
								<td>Internet Explorer 7</td>
								<td>Win XP SP2+</td>
								<td class="center">7</td>
								<td class="center">A</td>
							</tr>
							<tr class="gradeA">
								<td>Trident</td>
								<td>AOL browser (AOL desktop)</td>
								<td>Win XP</td>
								<td class="center">6</td>
								<td class="center">A</td>
							</tr>
							<tr class="gradeA">
								<td>Gecko</td>
								<td>Firefox 1.0</td>
								<td>Win 98+ / OSX.2+</td>
								<td class="center">1.7</td>
								<td class="center">A</td>
							</tr>
							<tr class="gradeA">
								<td>Gecko</td>
								<td>Firefox 1.5</td>
								<td>Win 98+ / OSX.2+</td>
								<td class="center">1.8</td>
								<td class="center">A</td>
							</tr>
							<tr class="gradeA">
								<td>Gecko</td>
								<td>Firefox 2.0</td>
								<td>Win 98+ / OSX.2+</td>
								<td class="center">1.8</td>
								<td class="center">A</td>
							</tr>
							<tr class="gradeA">
								<td>Gecko</td>
								<td>Firefox 3.0</td>
								<td>Win 2k+ / OSX.3+</td>
								<td class="center">1.9</td>
								<td class="center">A</td>
							</tr>
							<tr class="gradeA">
								<td>Gecko</td>
								<td>Camino 1.0</td>
								<td>OSX.2+</td>
								<td class="center">1.8</td>
								<td class="center">A</td>
							</tr>
							<tr class="gradeA">
								<td>Gecko</td>
								<td>Camino 1.5</td>
								<td>OSX.3+</td>
								<td class="center">1.8</td>
								<td class="center">A</td>
							</tr>
							<tr class="gradeA">
								<td>Gecko</td>
								<td>Netscape 7.2</td>
								<td>Win 95+ / Mac OS 8.6-9.2</td>
								<td class="center">1.7</td>
								<td class="center">A</td>
							</tr>
							<tr class="gradeA">
								<td>Gecko</td>
								<td>Netscape Browser 8</td>
								<td>Win 98SE+</td>
								<td class="center">1.7</td>
								<td class="center">A</td>
							</tr>
							<tr class="gradeA">
								<td>Gecko</td>
								<td>Netscape Navigator 9</td>
								<td>Win 98+ / OSX.2+</td>
								<td class="center">1.8</td>
								<td class="center">A</td>
							</tr>
							<tr class="gradeA">
								<td>Gecko</td>
								<td>Mozilla 1.0</td>
								<td>Win 95+ / OSX.1+</td>
								<td class="center">1</td>
								<td class="center">A</td>
							</tr>
							<tr class="gradeA">
								<td>Gecko</td>
								<td>Mozilla 1.1</td>
								<td>Win 95+ / OSX.1+</td>
								<td class="center">1.1</td>
								<td class="center">A</td>
							</tr>
							<tr class="gradeA">
								<td>Gecko</td>
								<td>Mozilla 1.2</td>
								<td>Win 95+ / OSX.1+</td>
								<td class="center">1.2</td>
								<td class="center">A</td>
							</tr>
							<tr class="gradeA">
								<td>Gecko</td>
								<td>Mozilla 1.3</td>
								<td>Win 95+ / OSX.1+</td>
								<td class="center">1.3</td>
								<td class="center">A</td>
							</tr>
							<tr class="gradeA">
								<td>Gecko</td>
								<td>Mozilla 1.4</td>
								<td>Win 95+ / OSX.1+</td>
								<td class="center">1.4</td>
								<td class="center">A</td>
							</tr>
							<tr class="gradeA">
								<td>Gecko</td>
								<td>Mozilla 1.5</td>
								<td>Win 95+ / OSX.1+</td>
								<td class="center">1.5</td>
								<td class="center">A</td>
							</tr>
							<tr class="gradeA">
								<td>Gecko</td>
								<td>Mozilla 1.6</td>
								<td>Win 95+ / OSX.1+</td>
								<td class="center">1.6</td>
								<td class="center">A</td>
							</tr>
							<tr class="gradeA">
								<td>Gecko</td>
								<td>Mozilla 1.7</td>
								<td>Win 98+ / OSX.1+</td>
								<td class="center">1.7</td>
								<td class="center">A</td>
							</tr>
							<tr class="gradeA">
								<td>Gecko</td>
								<td>Mozilla 1.8</td>
								<td>Win 98+ / OSX.1+</td>
								<td class="center">1.8</td>
								<td class="center">A</td>
							</tr>
							<tr class="gradeA">
								<td>Gecko</td>
								<td>Seamonkey 1.1</td>
								<td>Win 98+ / OSX.2+</td>
								<td class="center">1.8</td>
								<td class="center">A</td>
							</tr>
							<tr class="gradeA">
								<td>Gecko</td>
								<td>Epiphany 2.20</td>
								<td>Gnome</td>
								<td class="center">1.8</td>
								<td class="center">A</td>
							</tr>
							<tr class="gradeA">
								<td>Webkit</td>
								<td>Safari 1.2</td>
								<td>OSX.3</td>
								<td class="center">125.5</td>
								<td class="center">A</td>
							</tr>
							<tr class="gradeA">
								<td>Webkit</td>
								<td>Safari 1.3</td>
								<td>OSX.3</td>
								<td class="center">312.8</td>
								<td class="center">A</td>
							</tr>
							<tr class="gradeA">
								<td>Webkit</td>
								<td>Safari 2.0</td>
								<td>OSX.4+</td>
								<td class="center">419.3</td>
								<td class="center">A</td>
							</tr>
							<tr class="gradeA">
								<td>Webkit</td>
								<td>Safari 3.0</td>
								<td>OSX.4+</td>
								<td class="center">522.1</td>
								<td class="center">A</td>
							</tr>
							<tr class="gradeA">
								<td>Webkit</td>
								<td>OmniWeb 5.5</td>
								<td>OSX.4+</td>
								<td class="center">420</td>
								<td class="center">A</td>
							</tr>
							<tr class="gradeA">
								<td>Webkit</td>
								<td>iPod Touch / iPhone</td>
								<td>iPod</td>
								<td class="center">420.1</td>
								<td class="center">A</td>
							</tr>
							<tr class="gradeA">
								<td>Webkit</td>
								<td>S60</td>
								<td>S60</td>
								<td class="center">413</td>
								<td class="center">A</td>
							</tr>
							<tr class="gradeA">
								<td>Presto</td>
								<td>Opera 7.0</td>
								<td>Win 95+ / OSX.1+</td>
								<td class="center">-</td>
								<td class="center">A</td>
							</tr>
							<tr class="gradeA">
								<td>Presto</td>
								<td>Opera 7.5</td>
								<td>Win 95+ / OSX.2+</td>
								<td class="center">-</td>
								<td class="center">A</td>
							</tr>
							<tr class="gradeA">
								<td>Presto</td>
								<td>Opera 8.0</td>
								<td>Win 95+ / OSX.2+</td>
								<td class="center">-</td>
								<td class="center">A</td>
							</tr>
							<tr class="gradeA">
								<td>Presto</td>
								<td>Opera 8.5</td>
								<td>Win 95+ / OSX.2+</td>
								<td class="center">-</td>
								<td class="center">A</td>
							</tr>
							<tr class="gradeA">
								<td>Presto</td>
								<td>Opera 9.0</td>
								<td>Win 95+ / OSX.3+</td>
								<td class="center">-</td>
								<td class="center">A</td>
							</tr>
							<tr class="gradeA">
								<td>Presto</td>
								<td>Opera 9.2</td>
								<td>Win 88+ / OSX.3+</td>
								<td class="center">-</td>
								<td class="center">A</td>
							</tr>
							<tr class="gradeA">
								<td>Presto</td>
								<td>Opera 9.5</td>
								<td>Win 88+ / OSX.3+</td>
								<td class="center">-</td>
								<td class="center">A</td>
							</tr>
							<tr class="gradeA">
								<td>Presto</td>
								<td>Opera for Wii</td>
								<td>Wii</td>
								<td class="center">-</td>
								<td class="center">A</td>
							</tr>
							<tr class="gradeA">
								<td>Presto</td>
								<td>Nokia N800</td>
								<td>N800</td>
								<td class="center">-</td>
								<td class="center">A</td>
							</tr>
							<tr class="gradeA">
								<td>Presto</td>
								<td>Nintendo DS browser</td>
								<td>Nintendo DS</td>
								<td class="center">8.5</td>
								<td class="center">C/A<sup>1</sup></td>
							</tr>
							<tr class="gradeC">
								<td>KHTML</td>
								<td>Konqureror 3.1</td>
								<td>KDE 3.1</td>
								<td class="center">3.1</td>
								<td class="center">C</td>
							</tr>
							<tr class="gradeA">
								<td>KHTML</td>
								<td>Konqureror 3.3</td>
								<td>KDE 3.3</td>
								<td class="center">3.3</td>
								<td class="center">A</td>
							</tr>
							<tr class="gradeA">
								<td>KHTML</td>
								<td>Konqureror 3.5</td>
								<td>KDE 3.5</td>
								<td class="center">3.5</td>
								<td class="center">A</td>
							</tr>
							<tr class="gradeX">
								<td>Tasman</td>
								<td>Internet Explorer 4.5</td>
								<td>Mac OS 8-9</td>
								<td class="center">-</td>
								<td class="center">X</td>
							</tr>
							<tr class="gradeC">
								<td>Tasman</td>
								<td>Internet Explorer 5.1</td>
								<td>Mac OS 7.6-9</td>
								<td class="center">1</td>
								<td class="center">C</td>
							</tr>
							<tr class="gradeC">
								<td>Tasman</td>
								<td>Internet Explorer 5.2</td>
								<td>Mac OS 8-X</td>
								<td class="center">1</td>
								<td class="center">C</td>
							</tr>
							<tr class="gradeA">
								<td>Misc</td>
								<td>NetFront 3.1</td>
								<td>Embedded devices</td>
								<td class="center">-</td>
								<td class="center">C</td>
							</tr>
							<tr class="gradeA">
								<td>Misc</td>
								<td>NetFront 3.4</td>
								<td>Embedded devices</td>
								<td class="center">-</td>
								<td class="center">A</td>
							</tr>
							<tr class="gradeX">
								<td>Misc</td>
								<td>Dillo 0.8</td>
								<td>Embedded devices</td>
								<td class="center">-</td>
								<td class="center">X</td>
							</tr>
							<tr class="gradeX">
								<td>Misc</td>
								<td>Links</td>
								<td>Text only</td>
								<td class="center">-</td>
								<td class="center">X</td>
							</tr>
							<tr class="gradeX">
								<td>Misc</td>
								<td>Lynx</td>
								<td>Text only</td>
								<td class="center">-</td>
								<td class="center">X</td>
							</tr>
							<tr class="gradeC">
								<td>Misc</td>
								<td>IE Mobile</td>
								<td>Windows Mobile 6</td>
								<td class="center">-</td>
								<td class="center">C</td>
							</tr>
							<tr class="gradeC">
								<td>Misc</td>
								<td>PSP browser</td>
								<td>PSP</td>
								<td class="center">-</td>
								<td class="center">C</td>
							</tr>
							<tr class="gradeU">
								<td>Other browsers</td>
								<td>All others</td>
								<td>-</td>
								<td class="center">-</td>
								<td class="center">U</td>
							</tr>
						</tbody>
						<tfoot>
							<tr>
								<th>Rendering engine</th>
								<th>Browser</th>
								<th>Platform(s)</th>
								<th>Engine version</th>
								<th>CSS grade</th>
							</tr>
						</tfoot>
					</table>
					
					<div class="clear">&nbsp;</div>
					
				</section>
				<!-- End of Left column/section -->
				
				<!-- Right column/section -->
				<aside class="column width2">
					<div id="rightmenu">
						<header>
							<h3>You might also want to check out...</h3>
						</header>
						<dl class="first">
							<dt><img width="16" height="16" alt="Basic styles" SRC="img/style.png"></dt>
							<dd><a HREF="styles.html">Basic styles</a></dd>
							<dd class="last">Basic elements and styles</dd>							
							
							<dt><img width="16" height="16" alt="" SRC="img/book.png"></dt>
							<dd><a HREF="http://www.865171.cn">www.865171.cn</a></dd>
							<dd class="last">Datatable documentation</dd>							
						</dl>
					</div>
					<div class="content-box">
						<header>
							<h3>Tables</h3>
						</header>
						<section>
							Try other alternatives:<br/>
							<dl>
								<dt></dt>
								<dd><a HREF="http://www.865171.cn">www.865171.cn</a></dd>
							</dl>
						</section>
					</div>
				</aside>
				<!-- End of Right column/section -->
				
		</div>
		<!-- End of Wrapper -->
	</div>
	<!-- End of Page content -->
	
	<%@ include file="../bottom.jsp" %>
<!-- User interface javascript load -->
<script type="text/javascript" SRC="js/administry.js"></script>
</body>
</html>