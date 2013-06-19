<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>
	
	<h1>City List</h1>

	<c:forEach items="${cityList}" var="city">
		${city.name}
		<br />
	</c:forEach>
	
 </body>
</html>