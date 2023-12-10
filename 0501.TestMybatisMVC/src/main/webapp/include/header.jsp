<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>





<head>
	<title>TITLE</title>
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
	<meta charset="UTF-8">


	<!-- Font -->

	<link href="https://fonts.googleapis.com/css?family=Roboto:300,400,500" rel="stylesheet">


	<!-- Stylesheets -->

	<link href="common-css/bootstrap.css" rel="stylesheet">

	<link href="common-css/ionicons.css" rel="stylesheet">

	<link href="common-css/layerslider.css" rel="stylesheet">


	<link href="01-homepage/css/styles.css" rel="stylesheet">

	<link href="01-homepage/css/responsive.css" rel="stylesheet">

</head>
<body>

	<header>

		<div class="top-menu">

			<ul class="left-area welcome-area">
				<li class="hello-blog">Hello, welcome to my page</li>
				<li><a href="mailto:contact@juliblog.com">Contact: test@hanul201.com</a></li>
			</ul><!-- left-area -->



<!-- right-area -->
<div class="right-area">

				<div class="src-area">
					<form action="post">
						<input class="src-input" type="text" placeholder="글조회">
						<button class="src-btn" type="submit"><i class="ion-ios-search-strong"></i></button>
					</form>
				</div><!-- src-area -->

				<ul class="social-icons">
					<li><a href="#">로그인</a></li>
				
				</ul><!-- right-area -->

			</div>
			<!-- right-area -->







		</div><!-- top-menu -->

		<div class="middle-menu center-text"><a href="#" class="logo"><img src="images/logo.png" alt="Logo Image"></a></div>

		<div class="bottom-area">

			<div class="menu-nav-icon" data-nav-menu="#main-menu"><i class="ion-navicon"></i></div>

			<ul class="main-menu visible-on-click" id="main-menu">
								<li><a href="#">글쓰기</a></li>
								<li><a href="#">수정</a></li>
								<li><a href="#">삭제</a></li>
							</ul>
					
				
			<!-- main-menu -->

		</div><!-- conatiner -->
	</header>


	<div class="main-slider">
		<div id="slider">

			<div class="ls-slide" data-ls="bgsize:cover; bgposition:50% 50%; duration:4000; transition2d:104; kenburnsscale:1.00;">
				<img src="images/slider-1-1600x800.jpg" class="ls-bg" alt="" />

					<div class="slider-content ls-l" style="top:60%; left:30%;" data-ls="offsetyin:100%; offsetxout:-50%; durationin:800; delayin:100; durationout:400; parallaxlevel:0;">
						<a class="btn" href="#">MybatisMVC</a>
						<h3 class="title"><b>글쓰기</b></h3>
						<h6>2023</h6>
					</div>

			</div><!-- ls-slide -->

			<div class="ls-slide" data-ls="bgsize:cover; bgposition:50% 50%; duration:4000; transition2d:104; kenburnsscale:1.00;">
				<img src="images/slider-2-1600x800.jpg" class="ls-bg" alt="" />

					<div class="slider-content ls-l" style="top:60%; left:30%;" data-ls="offsetyin:100%; offsetxout:-50%; durationin:800; delayin:100; durationout:400; parallaxlevel:0;">
						<a class="btn" href="#">MybatisMVC</a>
						<h3 class="title"><b>글수정</b></h3>
						<h6>2023</h6>
					</div>

			</div><!-- ls-slide -->

		</div><!-- slider -->
	</div><!-- main-slider -->
