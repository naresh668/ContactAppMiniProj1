<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<font color='green'>${sucess}</font>
<font color='red'>${failure}</font>

<h1>Form page</h1>
<form:form method="POST" action="save" modelAttribute="contact">
    <table>
        <tr>
            <td>eName:</td>
            <td>
                <form:input path="eName" />
            </td>
            <%-- Show errors for firstName field --%>
                <td>
                    <form:errors path="eName" />
                </td>
        </tr>
        <tr>
            <td>eMail:</td>
            <td>
                <form:input path="eMail" />
            </td>
            <%-- Show errors for lastName field --%>
                <td>
                    <form:errors path="eMail" />
                </td>
        </tr>
        <tr>
            <td>eNum:</td>
            <td>
                <form:input path="eNum" />
            </td>
            <%-- Show errors for lastName field --%>
                <td>
                    <form:errors path="eNum" />
                </td>
        </tr>
        <tr>
            <td colspan="3">
                <input type="submit" value="Save" />
            </td>
        </tr>
        <tr></tr>
        &nbsp
        
         <tr>
            <td colspan="3">
                <a href="/views">ViewAllContacts</a>   
            </td>
        </tr>
    </table>
</form:form>




</body>
</html>