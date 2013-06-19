<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<body>
	<h1>What are you want to add?</h1>
	<form:form method="GET" action="welcome/add/country.html">
		<table>
   		 <tr>
   			 <td>
   				 <input type="submit" value="Add Country"/>
   			 </td>
   		 </tr>
		</table>  
	</form:form>
	<form:form method="GET" action="welcome/add/city.html">
		<table>
  		  <tr>
  			  <td>
  				  <input type="submit" value="Add City"/>
 			   </td>
 		   </tr>
		</table>  
	</form:form>
     <h1>Show me</h1>
     <form:form method="GET" action="welcome/list/country.html">
		<table>
  		  <tr>
  			  <td>
  				  <input type="submit" value="Show all Countries"/>
  		  	 </td>
  		  </tr>
		</table>  
	 </form:form>
     
		<form:form method="GET" action="welcome/list/city.html">
			<table>
  			  <tr>
   				 <td>
   					 <input type="submit" value="Show all Cities"/>
  				  </td>
   			 </tr>
			</table>  
		</form:form>
	
 </body>
</html>