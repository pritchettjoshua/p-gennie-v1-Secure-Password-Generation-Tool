<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="pPGennie.Questions1"%>
<%@ page import="pPGennie.Questions2"%>
<%@ page import="pPGennie.Randomizer"%>
<%@ page import="javax.servlet.http.*" %>
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
    <link rel="stylesheet" href="assets/plugins/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="assets/plugins/font-awesome/css/font-awesome.min.css">
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
    <div class="container">
        <!--pass Block-->
        <div class="pass-block">
            
            <div class="pass-block-header">
                <h4>Password Origin</h4>
            </div>
			Primary Origin:<pre>${requestScope.first_word}</pre>
			Secondary Origin:<pre>${requestScope.second_word}</pre>	
            
            <div class="pass-block-header margin-bottom-10">
              New Password:<pre>${requestScope.password}</pre>
   
            </div>
            
            <div class="row">
                <div class="col-md-12">
                     <button type="reset" onclick="window.location.reload();" class="btn btn-u">Regenerate Password</button>
                </div>
            </div>
        </div>
        <!--End pass Block-->
    </div>
    <!--/container-->
    <!-- end of content part -->

    <!-- js global compulsory -->
    <script type="text/javascript" src="assets/plugins/jquery-1.10.2.min.js"></script>
    <script type="application/javascript" src="assets/plugins/jquery-migrate-1.2.1.min.js"></script>
    <script type="text/javascript" src="assets/plugins/bootstrap/js/bootstrap.min.js"></script>
    <!-- js implementing plugins -->
    <script type="application/javascript" src="assets/plugins/backstretch/jquery.backstretch.min.js"></script>
    <script type="text/javascript">
        $.backstretch([
"assets/img/bg/bg4.jpg", "assets/img/bg/bg3.jpg",
"assets/img/bg/bg2.jpg",
      ], {

            fade: 1200,
            duration: 9000
        });
    </script>
    <!-- js page level -->


</body>

</html>