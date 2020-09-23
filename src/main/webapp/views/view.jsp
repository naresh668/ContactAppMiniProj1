<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">


<title>List of Empolyees</title>
</head>
<body>


<h2>List of Contacts</h2>
<script>
function deleteConfirm() {
    confirm("Press a button!?");
}
</script>
<a href="/">Back To Home Page</a>

<br>
<br>

<font color='green'>${delete}</font>

<table border="2" width="70%" cellpadding="2">  
	<tr>
		<th>Name</th>
		<th>Email</th>
		<th>Phone</th>
		<th>action</th>
	</tr>
<c:forEach  items="${contactForm}" var="contact" >
<tr>

<td>${contact.eName}</td>
<td>${contact.eMail}</td>
<td>${contact.eNum}</td>	
<td>	<a href="/editContact${contact.id}">Edit</a> &nbsp    <a href="/deleteContact${contact.id}"  onclick="return deleteConfirm();">Delete</a></td>

</tr>
</c:forEach>
</body>
</html>