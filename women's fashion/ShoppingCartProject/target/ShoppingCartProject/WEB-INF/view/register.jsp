
<!DOCTYPE html>
<html>
 <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>



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
<style>
/* Full-width input fields */
input[type=text], input[type=password] {
    width: 50%;
    padding: 12px 20px;
    margin: 6px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
}
/* Set a style for all buttons */
button {
    background-color: red;
    color: white;
    padding: 10px 12px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 100%;
}
.container {
    padding: 100px;
}
span.psw {
    float: right;
    padding-top: 16px;
}
/* The Modal (background) */
.modal {
    display: none; /* Hidden by default */
    position: fixed; /* Stay in place */
    z-index: 1; /* Sit on top */
    left: 0;
    top: 0;
    width: 100%; /* Full width */
    height: 100%; /* Full height */
    overflow: auto; /* Enable scroll if needed */
    background-color: rgb(0,0,0); /* Fallback color */
    background-color: rgba(0,0,0,0.4); /* Black w/ opacity */
    padding-top: 60px;
}
/* Modal Content/Box */
.modal-content {
    background-color: green;
    margin: 5% auto 15% auto; /* 5% from the top, 15% from the bottom and centered */
    border: 1px solid #888;
    width: 60%; /* Could be more or less, depending on screen size */
}
/* Add Zoom Animation */
.animate {
    -webkit-animation: animatezoom 0.6s;
    animation: animatezoom 0.6s
}
@-webkit-keyframes animatezoom {
    from {-webkit-transform: scale(0)} 
    to {-webkit-transform: scale(1)}
}
    
@keyframes animatezoom {
    from {transform: scale(0)} 
    to {transform: scale(1)}
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
<%@include file="header.jsp" %>
<h2>WELCOME FOR SIGNUP......</h2>
<div>
      
      <ul class="tab-group">
        <li class="tab active">
      </ul>
      
      <div class="tab-content">
        <div id="signup">   
          <h1>Sign Up for Free</h1>
          
          <form:form action="register" method="post" commandName="userDetails" class="field-wrap">
          <div class="top-row">
            <div class="field-wrap">
                      <label>
                FirstName<span class="req">*</span>
                <form:errors path="FirstName" cssStyle="color: #ff0000" />
                <form:input type="text" placeholder="FirstName"  path="FirstName"/>
                     </label>
            </div>
        
            <div class="field-wrap">
                     <label>
                LastName<span class="req">*</span>
                <form:errors path="LastName" cssStyle="color: #ff0000" />
                <form:input type="text" placeholder="LastName" path="LastName"  />
                      </label>
              
            </div>
             <div class="field-wrap">
                     <label>
                userName<span class="req">*</span>
                <form:errors path="username" cssStyle="color: #ff0000" />
                <form:input type="text" placeholder="Username" path="Username" />
                      </label>
              
            </div>
          </div>
          <div class="field-wrap">
            <label>
              Email Address<span class="req">*</span>
              <form:errors path="userEmail" cssStyle="color: #ff0000" />
              <form:input type="text" placeholder="Email" path="userEmail" />
            </label>
           
          </div>
          
          <div class="field-wrap">
            <label>
              Set A Password<span class="req">*</span>
              <form:errors path="password" cssStyle="color: #ff0000" />              
              <form:input type="password" placeholder="Enter password" path="password" />
            </label>
           
          </div>
          <div class="field-wrap">
            <label>
              Contact<span class="req">*</span>
              <form:errors path="userPhone" cssStyle="color: #ff0000" />
              <form:input type="text" placeholder="contact number" path="userPhone" />
                          </label>
           
          </div>
    
          <button type="submit" class="button button-block">Get Started</button>
          
          </form:form>
        </div>
</div> <!-- /form -->
</div>


<%@include file="footer.jsp" %>
</body>
</html>