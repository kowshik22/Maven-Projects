<!DOCTYPE html>
<html>
<html lang="en">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

 <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="Resource/https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="Resource/https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="Resource/https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">


<head>
<title>Women's Fashion a Ecommerce Online Shopping Category Flat Bootstrap Responsive Website Template | Sandals :: w3layouts</title>
<!-- for-mobile-apps -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Women's Fashion Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
		function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- //for-mobile-apps -->
<link href="Resource/css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<link href="Resource/css/style.css" rel="stylesheet" type="text/css" media="all" />
<link href="Resource/css/fasthover.css" rel="stylesheet" type="text/css" media="all" />
<!-- js -->
<script src="Resource/js/jquery.min.js"></script>
<!-- //js -->
<!-- cart -->
<script src="Resource/js/simpleCart.min.js"></script>
<!-- cart -->
<!-- for bootstrap working -->
<script type="text/javascript" src="Resource/js/bootstrap-3.1.1.min.js"></script>
<!-- //for bootstrap working -->
<link href='Resource///fonts.googleapis.com/css?family=Glegoo:400,700' rel='stylesheet' type='text/css'>
<link href='Resource///fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>
<!-- start-smooth-scrolling -->
<script type="text/javascript">
	jQuery(document).ready(function($) {
		$(".scroll").click(function(event){		
			event.preventDefault();
			$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
		});
	});
</script>
<!-- //end-smooth-scrolling -->
</head>
	
<body>
<!-- header -->
	<%@include file="header.jsp" %>
<!-- //header -->
<style type="text/css">

.form-group input{
	width:50%;
}
</style>
</head>
<body>



		<div id="content">
			<div class="container">


			

			<section>
					<h2 class="text-uppercase">Category</h2>


					<hr>

					<!-- LOOK HERE -->

					<h3>Add a Category</h3>

					<c:url var="addAction" value="/category/add"></c:url>

					<form:form action="${addAction}" commandName="category">


						<div class="form-group">
							<c:choose>
								<c:when test="${!empty category.id}">

									<div class="form-group">
										<label for="name">ID</label>
										<div class="controls docs-input-sizes">
											<form:input placeholder="id" path="id" required="true"
												class="form-control" id="id" disabled="true" readonly="true" />
										</div>
									</div>

								</c:when>

								<c:otherwise>

									<div class="form-group">
										<form:input path="id" hidden="true" />
										<label for="id">ID</label>
										<div class="controls docs-input-sizes">
											<form:input placeholder="id" path="id" required="true"
												class="form-control" id="id"
												title="id should contains 6 to 7 characters"
												patttern=".{6,7}" />
										</div>
									</div>

								</c:otherwise>
							</c:choose>

						</div>

						<div class="form-group">
							<form:input path="id" hidden="true" />
							<label for="name">Name</label>
							<div class="controls docs-input-sizes">
								<form:input placeholder="name" path="name" required="true"
									class="form-control" id="name" />
							</div>
						</div>

						<div class="form-group">
							<label for="description">Description</label>
							<div class="controls docs-input-sizes">
								<form:input placeholder="description" path="description"
									class="form-control" id="description" />
							</div>
						</div>



						<div class="form-group">
							<div class="controls docs-input-sizes">
								<c:if test="${!empty category.name}">

									<button type="submit" class="btn btn-template-main pull-left">
										<i class="fa fa-user-md"></i> Edit Category
									</button>
								</c:if>
								<c:if test="${empty category.name}">

									<button type="submit" class="btn btn-template-main pull-left">
										<i class="fa fa-user-md"></i> Add Category
									</button>
								</c:if>
							</div>
						</div>
					</form:form>
				
<br><br>

			
					<div class="all">
						<c:if test="${!empty categoryList}">
							<h3>Category List</h3>
							<table class="tg table-hover">
								<tr>
									<th width="80">Category ID</th>
									<th width="120">Category Name</th>
									<th width="120">Category description</th>
									<th width="60">Edit</th>
									<th width="60">Delete</th>
								</tr>
								<c:forEach items="${categoryList}" var="category">
									<tr>
										<td>${category.id}</td>
										<td>${category.name}</td>
										<td>${category.description}</td>
										<td><a
											href="<c:url value='category/edit/${category.id}' />">Edit</a></td>
										<td><a
											href="<c:url value='category/remove/${category.id}' />">Delete</a></td>
									</tr>
								</c:forEach>
							</table>
						</c:if>
						<br> <br> <br>
			</div>
			</section>
			</div>

		</div>
		 <%@include file="footer.jsp" %>


</body>
</html>