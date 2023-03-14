<%--
  Created by IntelliJ IDEA.
  User: 82747
  Date: 2023-03-14
  Time: 오후 4:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>User Sign Up Form</title>
    <style>
        .error {color: red}
    </style>
</head>
<body>

    <form:form action="processForm" modelAttribute="user">
        Email : <form:input path="email" />
        <form:errors path="email" cssClass="error" />
        <br /><br />

        password : <form:input path="password" />
        <form:errors path="password" cssClass="error" />
        <br /><br />

        username : <form:input path="username" />
        <form:errors path="username" cssClass="error" />
        <br /><br />

        phone_number : <form:input path="phone_number" />
        <form:errors path="phone_number" cssClass="error" />
        <br /><br />

        address : <form:input path="address" />
        <form:errors path="address" cssClass="error" />
        <br /><br />

        <input type="submit" value="Submit">
    </form:form>
</body>
</html>
