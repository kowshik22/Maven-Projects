
<!DOCTYPE html>
<html>
 <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="Resource/https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="Resource/https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="Resource/https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


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
<%@ include file="header.jsp" %>
<style>
form {
    border: 3px solid #f1f1f1;
}

input[type=text], input[type=password] {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
}

button {
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 100%;
}

.cancelbtn {
    width: auto;
    padding: 10px 18px;
    background-color: #f44336;
}

.imgcontainer {
    text-align: center;
    margin: 20px 0 10px 0;
}

img.avatar {
    width: 20%;
    border-radius: 30%;
}

.container {
    padding: 16px;
}

span.psw {
    float: right;
    padding-top: 16px;
}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
    span.psw {
       display: block;
       float: none;
    }
    .cancelbtn {
       width: 100%;
    }
}
</style>
<body>

<h2>sign up Form</h2>


<form:form action="register" method="POST" commandName="userDetails">
   <div class="imgcontainer">
    <img src="Resource/images/img_avatar2.png" alt="Avatar" class="avatar">
  </div>
   <label><b>FirstName</b></label>
     <form:errors path="FirstName" cssStyle="color: #ff0000" />
    <form:input type="text" placeholder="First name" path="FirstName" name="uname"/>
    
       <label><b>LastName</b></label>
        <form:errors path="LastName" cssStyle="color: #ff0000" /> 
   <form:input type="text" placeholder="Last Name" path="LastName" name="uname"/>
 <label><b>Username</b></label>
  <form:errors path="username" cssStyle="color: #ff0000" />
    <form:input type="text" placeholder="Enter Username" path="username" name="username"/>
<label><b>Email</b></label>
  <form:errors path="userEmail" cssStyle="color: #ff0000" />
    <form:input type="text" placeholder="Enter Username" path="userEmail" name="userEmail"/>
   <label><b>Password</b></label>
     <form:errors path="password" cssStyle="color: #ff0000" /> 
    <form:input type="password" placeholder="Enter Password" path="password" name="psw"/>
     <label><b>phone</b></label>
      <form:errors path="userPhone" cssStyle="color: #ff0000" />    
    <form:input type="text" placeholder="phone" path="userPhone" name="phone"/>
    <button type="submit" class="button button-block">Get Started</button>
</form:form>
<%@include file="footer.jsp" %>
</body>
</html>