<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
	crossorigin="anonymous"
	
>

<link href="<c:url value="/pages/css/style.css"></c:url>">
<script type="text/javascript" src="<c:url value="/pages/js/script.js"></c:url>"></script>
<title>Search Form</title>
</head>
<body>
   <img alt="pokemon" src='<c:url value="/pages/image/pokemon.jpg"></c:url>'>
	<div class="container">
		<div class="card mx-auto mt-5 bg-secondary" style="width: 50%">
			<div class="card-body py-3">
			<h3 class="text-center text-light text-uppercase">My Search</h3>
				<form action="search" class="mt-5" method="get">
					<div class="mb-3">
							 <input type="text" class="form-control"
							id="exampleInputEmail1" aria-describedby="emailHelp" name="querybox" 
							placeholder="Enter Your Keyword"
							>
							
							<div class = "container text-center mt-3">
							   <button  type="button" class="btn btn-outline-light ">Search</button>
							</div>
						
					</div>


				</form>


			</div>


		</div>


	</div>


	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
</body>
</html>