<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>
	
	<h1>Country List</h1>

	<c:forEach items="${countryList}" var="country">
		
		<br />
		<td><a href="/MyCountryProject/welcome/${country.id}.html">${country.name}</a></td>
	</c:forEach>
 
 </body>
</html>