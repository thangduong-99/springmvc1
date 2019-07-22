<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE HTML>
<html lang="zxx">

<head>
<title>Triple Forms Responsive Widget Template :: w3layouts</title>
<!-- Meta tag Keywords -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="utf-8">
<meta name="keywords"
	content="Triple Forms Responsive Widget,Login form widgets, Sign up Web forms , Login signup Responsive web form,Flat Pricing table,Flat Drop downs,Registration Forms,News letter Forms,Elements" />
<script>
	addEventListener("load", function() {
		setTimeout(hideURLbar, 0);
	}, false);

	function hideURLbar() {
		window.scrollTo(0, 1);
	}
</script>
<!-- Meta tag Keywords -->

<!-- css files -->
<link rel="stylesheet" href="resources/css/style.css" type="text/css"
	media="all" />
<!-- Style-CSS -->
<link href="resources/css/font-awesome.min.css" rel="stylesheet">
<!-- Font-Awesome-Icons-CSS -->
<!-- //css files -->

<!-- web-fonts -->
<link
	href="//fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i&amp;subset=cyrillic,cyrillic-ext,greek,greek-ext"
	rel="stylesheet">
<!-- //web-fonts -->
</head>

<body>
	<div class="main-bg">
		<!-- title -->
		<h1>Công Thắng Shop</h1>
		<h3 style="text-align: center; font-size: 30px; color: white;">${thongbao}</h3>
		<!-- //title -->
		<div class="sub-main-w3">
			<div class="image-style"></div>
			<!-- vertical tabs -->
			<div class="vertical-tab">
				<div id="section1" class="section-w3ls">
					<input type="radio" name="sections" id="option1" checked> <label
						for="option1" class="icon-left-w3pvt"><span
						class="fa fa-user-circle" aria-hidden="true"></span>Login</label>
					<article>
						<form action="login" method="post">
							<h3 class="legend">Đăng nhập</h3>
							<div class="input">
								<span class="fa fa-envelope-o" aria-hidden="true"></span> <input
									type="email" placeholder="Email" name="username" required />
							</div>
							<div class="input">
								<span class="fa fa-key" aria-hidden="true"></span> <input
									type="password" placeholder="Password" name="password" required />
							</div>
							<button type="submit" class="btn submit">Đăng nhập</button>
							<a href="#" class="bottom-text-w3ls">Quên mật khẩu?</a>
						</form>
					</article>
				</div>
				<div id="section2" class="section-w3ls">
					<input type="radio" name="sections" id="option2"> <label
						for="option2" class="icon-left-w3pvt"><span
						class="fa fa-pencil-square" aria-hidden="true"></span>Đăng ký</label>
					<article>
						<form action="signup" method="post">
							<h3 class="legend">Đăng ký tại đây</h3>
							<div class="input">
								<span class="fa fa-user-o" aria-hidden="true"></span> <input
									type="text" placeholder="Username" name="username" required />
							</div>
							<div class="input">
								<span class="fa fa-key" aria-hidden="true"></span> <input
									type="password" placeholder="Password" name="password1" required />
							</div>
							<div class="input">
								<span class="fa fa-key" aria-hidden="true"></span> <input
									type="password" placeholder="Confirm Password" name="password2"
									required />
							</div>
							<button type="submit" class="btn submit">Đăng ký</button>
						</form>
					</article>
				</div>
				<div id="section3" class="section-w3ls">
					<input type="radio" name="sections" id="option3"> <label
						for="option3" class="icon-left-w3pvt"><span
						class="fa fa-lock" aria-hidden="true"></span>Quên mật khẩu?</label>
					<article>
						<form action="#" method="post">
							<h3 class="legend last">Reset Password</h3>
							<p class="para-style">Nhập địa chỉ email của bạn dưới đây và
								chúng tôi sẽ gửi cho bạn một email với hướng dẫn.</p>
							<p class="para-style-2">
								<strong>Trợ giúp?</strong> Tìm hiểu thêm về cách <a href="#">
									lấy lại một tài khoản hiện có.</a>
							</p>
							<div class="input">
								<span class="fa fa-envelope-o" aria-hidden="true"></span> <input
									type="email" placeholder="Email" name="email" required />
							</div>
							<button type="submit" class="btn submit last-btn">Reset</button>
						</form>
					</article>
				</div>
			</div>
			<!-- //vertical tabs -->
			<div class="clear"></div>
		</div>
		<!-- copyright -->
		<div class="copyright">
			<h2>
				&copy; 2019 CongThang Shop. Kính chào quý khách | Thiết kế bởi <a
					href="http://w3layouts.com" target="_blank">Công Thắng</a>
			</h2>
		</div>
		<!-- //copyright -->
	</div>

</body>

</html>