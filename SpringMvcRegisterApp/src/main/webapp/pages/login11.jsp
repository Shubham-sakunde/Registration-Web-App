<!doctype html>
<html lang="en">
<head>

<%@ include file="header.jsp"%>
<title>Login Page</title>
</head>


<body>


	<div class="container">
		<%@ include file="navbar.jsp"%>
	</div>



	<div class="text-center mt-4">
		<h1>Login</h1>
	</div>




	<div class="container mt-5 w-25 mx-auto">
		<div class="text-center" style="color:#FD5D5D;font-size:30px;">${message}</div>
	</div>


	<!------ Form start here ----->

	<form style="border: 1px solid #ced4da; border-radius: 7px;"
		class="m-5 p-3 w-25 mx-auto">

		<div class="mb-3">
			<label class="form-label">Username</label> <input type="text"
				name="username" class="form-control" placeholder="Enter Username">
		</div>

		<div class="mb-3">
			<label class="form-label">Password </label> <input type="password"
				name="password" class="form-control" placeholder="Enter Password">
		</div>

		<div class="text-center">
			<button type="submit" class="btn btn-primary btn-block w-100 mx-auto"
				style="Background-color: #BEADFA;" formaction="validate">Login</button>
		</div>

		<div class="text-center  mt-2">
			<button type="submit" class="btn btn-primary btn-block w-100 mx-auto"
				style="Background-color: #BEADFA;" formaction="showRegister">Register</button>
		</div>


	</form>

	<!------ Form start here ----->


	<%@ include file="footer.jsp"%>
</body>
</html>