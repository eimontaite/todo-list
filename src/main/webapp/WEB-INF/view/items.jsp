<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="academy.learnprogramming.util.Mappings" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ToDo Items</title>
</head>
<body>
    <div align="center">
        <c:url var="addItem" value="${Mappings.ADD_ITEM}"/>
        <h2><a href="${addItem}"/>Add Item</h2>
        <table border="1" cellpadding="5">
            <caption><h2>ToDoItems</h2></caption>

            <tr>
                <th>Title</th>
                <th>Deadline</th>
                <th>Delete</th>
            </tr>
            <c:forEach var="item" items="${toDoData.items}">
                <c:url var="deleteUrl" value="${Mappings.DELETE_ITEM}">
                    <c:param name="id" value="${item.id}"/>
                </c:url>
                <tr>
                    <td><c:out value="${item.title}"></c:out></td>
                    <td><c:out value="${item.deadline}"></c:out></td>
                    <td><a href="${deleteUrl}">Delete</a></td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>
