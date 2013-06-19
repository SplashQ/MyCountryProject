<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 
<html>
<body>
	<h1>Add city</h1>
 
	<form:form method="POST" commandName="city" action="savecity.html">  
 
 
	 	Name of City<br />
		<form:input path="name" /><br /><br />
		
		Select Country:<br />
		<form:select path="id_country">
		<c:forEach items="${countries}" var ="country">
		<form:option value="${country.id}">${country.name}</form:option>
		</c:forEach>
			
  

	</form:select><br />
		
 	<input type="submit" value="Submit"><br />
	
			
 	
 
	</form:form>
</body>
</html>