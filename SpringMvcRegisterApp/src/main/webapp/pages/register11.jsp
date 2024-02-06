<!doctype html>
<html lang="en">
  <head>
  
  <%@ include file="header.jsp" %>
    <title>Register Page</title>
  </head>
  
  
  <body>
  
  
     <div class="container">
    <%@ include file="navbar.jsp" %>
    </div>
    
    
    
    <div class="container">
		<div class="text-center mt-4">
			<h1>Registration</h1>
		</div>
     </div>


<!-- form start here -->


		<form style="border: 1px solid #ced4da; border-radius: 7px;"
			class="m-5 p-3 w-25 mx-auto">

			<div class="mb-3 ">
				<label class="form-label">Username</label>
				<input type="text" name="username" class="form-control"
					placeholder="Enter Username">
			</div>

			<div class="mb-3">
				<label  class="form-label">Password
				</label> <input type="password" name="password" class="form-control"
					placeholder="Enter Password">
			</div>

			<div class="mb-3 ">
				<label class="form-label"> Mobile
					No</label> <input type="number" name="mobno" class="form-control"
					placeholder="Enter Mob No">
			</div>

			<div class="mb-3 ">
				<label class="form-label">Email</label>
				<input type="email"  name="emailid" class="form-control"
					placeholder="Enter Password">
			</div>

			<div class="text-center mx-auto">
				<button type="submit" class="btn btn-primary btn-block  w-100"
					style="Background-color: #DC84F3;" formaction="saveToDB" formmethod="post">Register</button>
			</div>

			<div class="text-center mt-2 mx-auto">
				<button type="submit" class="btn btn-primary w-100"
					style="Background-color: #DC84F3;" formaction="/">Login</button>
			</div>

		</form>


<!-- form end here -->
    
    
    
    
    
   <%@ include file="footer.jsp" %>
  </body>
</html>