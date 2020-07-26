<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
<head>
</head>
<body>
<h3>Welcome, Enter The Employee Details</h3>
<form:form method="POST"
           action="/addProduct" modelAttribute="product">
    <table>
        <tr>
            <td><form:label path="Specie">Name</form:label></td>
            <td><form:input path="Specie"/></td>
        </tr>
        <tr>
            <td><form:label path="Quantity">Id</form:label></td>
            <td><form:input path="Quantity"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Submit"/></td>
        </tr>
    </table>
</form:form>
</body>
</html>