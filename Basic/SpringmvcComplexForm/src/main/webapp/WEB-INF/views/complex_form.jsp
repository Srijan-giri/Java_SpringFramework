<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<title>Complex Form</title>
</head>
<body class="" style="background: #e2e2e2">
	<div class="container mt-4">
		<div class="row">
			<div class="col-md-8 offset-md-2">
				<div class="card">
					<div class="card-body">
						<h3 class="text-center">Complex Form</h3>
						<div class="alert alert-danger" role="alert">
						
                            <form:errors path="student.*"/>
                            
                        </div> 
						<form action="processForm1" method="post">
							<div class="mb-3">
								<label for="exampleInputEmail1" class="form-label">Your
									Name</label>
						  <input type="text" class="form-control" placeholder="Enter name" name="name"/>
							</div>

							<div class="mb-3">
								<label for="exampleInputEmail1" class="form-label">Your
									Id</label> <input type="text" class="form-control" name="id"
									id="exampleInputEmail1" aria-describedby="emailHelp"
									placeholder="Your Id">
							</div>

							<div class="mb-3">
								<label for="exampleInputPassword1" class="form-label">Your
									DOB</label> <input type="text" class="form-control"
									id="exampleInputPassword1" name="date" placeholder="dd/mm/yyyy">
							</div>

							<div class="mb-3">
								<label for="exampleInputPassword1" class="form-label">Select
									Course</label> <select name="courses" class="form-control"
									id="exampleFormControlSelect1" multiple>
									<option>Java</option>
									<option>Python</option>
									<option>C++</option>
									<option>Django</option>
									<option>Spring</option>
								</select>

							</div>
							<div class="mb-3">
								<span style="margin-right: 3%;">Select Gender</span>
								<div class="form-check form-check-inline">
									<input class="form-check-input" type="radio"
										 id="flexRadioDefault1" name="gender" value="male"> <label
										class="form-check-label" for="flexRadioDefault1">
										Male </label>
								</div>
								<div class="form-check form-check-inline">
									<input class="form-check-input" type="radio"
										 id="flexRadioDefault1" name="gender" value="female"> <label
										class="form-check-label" for="flexRadioDefault1">
										Female </label>
								</div>
								
								</div>
								<div class="mb-3">
								<label for="exampleInputPassword1" class="form-label">Select Type</label> <select  class="form-control"
									id="exampleFormControlSelect1" name="type">
									<option value="oldstudent">Old Student</option>
									<option value="normalstudent">Normal Student</option>
								</select>

							   </div>
							   
							   <div class="card">
							      <div class="card-body">
							         <p>Your Address</p>
							         <div class="mb-3">
							             <input name="address.street" type="text" class="form-control" placeholder="Enter street"/>
							         </div>
							          <div class="mb-3">
							             <input name="address.city" type="text" class="form-control" placeholder="Enter city"/>
							         </div>
							      </div>
							   </div>
							
							 <div class="container text-center">
								<button type="submit" class="btn btn-primary">Submit</button>
							 </div>
								

							

						</form>


					</div>



				</div>

			</div>

		</div>

	</div>


	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
</body>
</html>