<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 
<html>
<body>
	<h1>Add country</h1>
 
	<form:form method="POST" commandName="country" action="savecountry.html">  
 
 
		Name of Country<br />
		<form:input path="name"/><br /><br />
 	    <input type="submit" value="Submit">
		
 
	</form:form>
</body>
</html>