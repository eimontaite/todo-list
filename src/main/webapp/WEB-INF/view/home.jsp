<%--
  Created by IntelliJ IDEA.
  User: eima
  Date: 2020-06-04
  Time: 16:30
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="academy.learnprogramming.util.Mappings" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ToDo List Application</title>
</head>
<body>
    <div align="center">
        <c:url var="itemsLink" value="${Mappings.ITEMS}"/>
        <h2><a href="${itemsLink}"/>Display Items</h2>
        <c:url var="addItem" value="${Mappings.ADD_ITEM}"/>
        <h2><a href="${addItem}"/>Add Item</h2>
    </div>
</body>
</html>
