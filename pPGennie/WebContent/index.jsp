<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="pPGennie.Questions1"%>
<%@ page import="pPGennie.Questions2"%>
<%@ page import="pPGennie.Randomizer"%>
<%@ page import= "javax.servlet.http.*" %>
<!DOCTYPE html>
<!--[if !IE]><!-->
<html lang="en">
<!--<![endif]-->

<head>
<title>secureGenie | Password Generator</title>
<!-- Meta -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">
<meta name="apple-mobile-web-app-title" content="secureGenie">
<!-- Favicon -->
<link rel="apple-touch-icon" sizes="57x57" href="assets/img/favicons/apple-touch-icon-57x57.png">
<link rel="apple-touch-icon" sizes="114x114" href="assets/img/favicons/apple-touch-icon-114x114.png">
<link rel="apple-touch-icon" sizes="72x72" href="assets/img/favicons/apple-touch-icon-72x72.png">
<link rel="apple-touch-icon" sizes="144x144" href="assets/img/favicons/apple-touch-icon-144x144.png">
<link rel="apple-touch-icon" sizes="60x60" href="assets/img/favicons/apple-touch-icon-60x60.png">
<link rel="apple-touch-icon" sizes="120x120" href="assets/img/favicons/apple-touch-icon-120x120.png">
<link rel="apple-touch-icon" sizes="76x76" href="assets/img/favicons/apple-touch-icon-76x76.png">
<link rel="apple-touch-icon" sizes="152x152" href="assets/img/favicons/apple-touch-icon-152x152.png">
<link rel="apple-touch-icon" sizes="180x180" href="assets/img/favicons/apple-touch-icon-180x180.png">
<link rel="icon" type="image/png" href="assets/img/favicons/favicon-192x192.png" sizes="192x192">
<link rel="icon" type="image/png" href="assets/img/favicons/favicon-160x160.png" sizes="160x160">
<link rel="icon" type="image/png" href="assets/img/favicons/favicon-96x96.png" sizes="96x96">
<link rel="icon" type="image/png" href="assets/img/favicons/favicon-16x16.png" sizes="16x16">
<link rel="icon" type="image/png" href="assets/img/favicons/favicon-32x32.png" sizes="32x32">
<meta name="msapplication-TileColor" content="#000000">
<meta name="msapplication-TileImage" content="assets/img/favicons/mstile-144x144.png">
<!-- CSS Global Compulsory -->
<link rel="stylesheet"
	href="assets/plugins/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet"
	href="assets/plugins/font-awesome/css/font-awesome.min.css">
<link rel="stylesheet" href="assets/css/style.css">
</head>

<body>
	<!-- nav bar -->
	<div class="header navbar navbar-default" role="navigation">
		<div class="container">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<a class="navbar-brand" href="index.jsp"> <img id="logo-header" src="assets/img/logo.png" alt="Logo"> </a>
			</div>
		</div>
		<!-- End Navbar -->
	</div>
	<!--=== End Header ===-->

	<!-- end of nav bar -->


	<!-- content part -->
	<%
		String a, b, a1, b1;
					String value = "0";
	%>
	<div class="container">
		<!--pass Block-->
		<form action="Servlet" id="mainForm" method="POST">
		<div class="pass-block">
			<label class="checkbox" id="id1"> <input type="checkbox"
				id="auto" name="autogen" value="<%=value%>">
				<p>Auto-Generate Password</p>
			</label>
			<div class="pass-block-header">
				<%
					Questions1 q1 = new Questions1();
				%>
				<%
					a = q1.random();
				%>
				<h4 id="aReset">
					<%
						out.print(a);
					%>
				</h4>
			</div>
			
				<div class="input-group margin-bottom-20">
					<span class="input-group-addon"><i class="fa fa-pencil"></i></span>
					<input type="text" name="Answer1" class="form-control"
						placeholder="Answer1" id=answer1>
				</div>
				<div class="pass-block-header">

					<%
						Questions2 q2 = new Questions2();
					%>
					<%
						b = q2.random();
					%>
					<h4 id="bReset">
						<%
							out.print(b);
						%>
					</h4>
				</div>
				<div class="input-group margin-bottom-30">
					<span class="input-group-addon"><i class=" fa fa-pencil"></i></span>
					<input type="text" name="Answer2" class="form-control"
						placeholder="Answer2" id="answer2">
				</div>
				<div class="row">
					<div class="col-md-12">
						<button type="submit" class="btn btn-u">Generate Password</button>

						<button type="reset" class="btn btn-u"
							onclick="window.location.reload();">Reset</button>

					</div>

		</div>
	</div>
	<!--End pass Block-->
	</form>
	</div>
	<!--/container-->
	<!-- end of content part -->


	<!-- js global compulsory -->
	<script type="text/javascript"
		src="assets/plugins/jquery-1.10.2.min.js"></script>
	<script type="application/javascript"
		src="assets/plugins/jquery-migrate-1.2.1.min.js"></script>
	<script type="text/javascript"
		src="assets/plugins/bootstrap/js/bootstrap.min.js"></script>
	<!-- js implementing plugins -->
	<script type="application/javascript"
		src="assets/plugins/backstretch/jquery.backstretch.min.js"></script>
	<script type="text/javascript"
		src="assets/plugins/jquery.validate.min.js"></script>
	<script
		src="http://jqueryvalidation.org/files/dist/additional-methods.min.js"></script>
	<script type="text/javascript">
		$.backstretch([ "assets/img/bg/bg4.jpg", "assets/img/bg/bg3.jpg",
				"assets/img/bg/bg2.jpg", ], {

			fade : 1200,
			duration : 9000

		});
	</script>
	<script type="text/javascript">
		var v1 = document.getElementById("auto");
		var a1 = document.getElementById("id1");

		var v2 = document.getElementById("answer1");
		var v3 = document.getElementById("answer2");

		var cn1 = a1.className;
		var cn2 = v2.className;
		var cn3 = v3.className;

		var disableCheckboxConditioned = function() {
			if (v1.checked) {
				v2.className = cn2 + " disabled";
				v2.disabled = true;
				v3.className = cn3 + " disabled";
				v3.disabled = true;
				<% value="1";%>
			} else {
				v2.className = cn2;
				v2.disabled = false;
				v3.className = cn3;
				v3.disabled = false;
				<%value="0";%>
			}
		}

		v1.onclick = disableCheckboxConditioned;
	</script>

	 <script type="text/javascript">
		$(function() {
			jQuery.validator.addMethod("noSpace",function(value,element){
				return value.indexOf(" ")<0 && value!="";
			},"Space are not allowed");
			// Validation
			$("#mainForm").validate({
				rules : {
					Answer1 : {
						required:true,
						minlength : 5,
						noSpace:true
					},
					Answer2 : {
						required:true,
						minlength : 5,
						noSpace:true
					}
				},
				messages:
				{
					Answer1:{
						required:'Please enter answer to question 1',
						minlength:'Answer must be at least 5 characters'
					},
					Answer2:{
						required:'Please enter answer to question 2',
						minlength:'Answer must be at least 5 characters'
					}
			},
			submitHandler: function(form){
				form.submit();
			},
			// Do not change code below
			errorPlacement: function(error, element)
			{
				error.insertBefore(element.parent());
			}
				
			});

		});
	</script>
	<!-- js page level -->


</body>

</html>