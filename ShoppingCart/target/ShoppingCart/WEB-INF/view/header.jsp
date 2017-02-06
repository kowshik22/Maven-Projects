<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>

	
					<script src="Resource/js/easyResponsiveTabs.js"> type="text/javascript"></script>
							<script type="text/javascript">
								$(document).ready(function () {
									$('#horizontalTab').easyResponsiveTabs({
										type: 'default', //Types: default, vertical, accordion           
										width: 'auto', //auto or any width like 600px
										fit: true   // 100% fit in a container
									});
								});
							</script>
							
							
	<script>
		$('#myModal88').modal('show');
	</script>
	<div class="header">
		<div class="container">
			<div class="w3l_logo">
				<h1><a href="index">Women's Fashion<span  style="color:#0000FF">For Fashion Lovers</span></a></h1>
			</div>
			<div class="clearfix"> </div>
		</div>
	</div>
	<!-- -- > 
	-- -->
	<div style="text-align:right">
					<c:choose>
							<c:when test="${pageContext.request.userPrincipal.name != null}">							
							<i class="fa fa-user-admin"></i>
								<a>Hello, ${pageContext.request.userPrincipal.name}</a>		
								<a href="<c:url value="/j_spring_security_logout"/>">
								<i class="fa fa-logout"></i>logout</a>
							</c:when>						
						</c:choose> 	
						</div>		
			
				<!-- --> 
				<div class="collapse navbar-collapse" id="bs-megadropdown-tabs">
					<ul class="nav navbar-nav">
				
						<li class="active"><a href="index" class="act">Home</a></li>
						<li><a href="<c:url value="/loginPage"/>">Login</a></li>					
						<c:choose>
						
						
												<c:when test="${pageContext.request.userPrincipal.name != null}">
													<c:if test="${pageContext.request.userPrincipal.name == 'Admin'}">
													<li><a href="<c:url value='/categories'/>">Category</a></li>
														<li><a href="<c:url value="/suppliers"/>">Supplier</a></li>
														<li><a href="<c:url value="/products"/>">Product</a></li>
														
														
													</c:if>
														<c:if test="${pageContext.request.userPrincipal.name != 'Admin'}">
													
														<li><a href="<c:url value="/user/cart"/>">Cart</a></li>
													
													</c:if>
													</c:when>
											
													<c:otherwise>
													</c:otherwise>
											</c:choose>
											
											
											<li><a href="register">register</a></li>
					</ul>
				</div>
		</body>
		</html>