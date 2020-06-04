<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="academy.learnprogramming.util.Mappings" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ToDo Item</title>
</head>
<body>
    <div align="center">
        <c:url var="viewItems" value="${Mappings.ITEMS}"/>
        <h2><a href="${viewItems}"/>All Items</h2>
        <table border="1" cellpadding="5">
            <caption><h2>View Item</h2></caption>

            <tr>
                <th>Title</th>
                <th>Details</th>
                <th>Deadline</th>
                <th>Delete</th>
            </tr>
                <c:url var="deleteUrl" value="${Mappings.DELETE_ITEM}">
                    <c:param name="id" value="${toDoItem.id}"/>
                </c:url>
                <tr>
                    <td><c:out value="${toDoItem.title}"></c:out></td>
                    <td><c:out value="${toDoItem.details}"></c:out></td>
                    <td><c:out value="${toDoItem.deadline}"></c:out></td>
                    <td><a href="${deleteUrl}">Delete</a></td>
                </tr>
        </table>
    </div>
</body>
</html>
