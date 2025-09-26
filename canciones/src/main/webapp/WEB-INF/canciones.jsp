<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Canciones</title>
    <meta charset="UTF-8">
</head>
<body>
    <h1>Lista de Canciones</h1>
   <table>
    <thead>
        <tr>
            <th>Título</th>
            <th>Autor</th>           
            <th>Detalle</th> 
        </tr>
    </thead>
    <tbody>
        <c:forEach var="c" items="${listaCanciones}">
        <tr>
            <td>${c.titulo}</td>
            <td>${c.artista}</td>
            <td><a href="${pageContext.request.contextPath}/canciones/detalle/${c.id}">Ver Detalle</a></td>
        </tr>
        </c:forEach>
    </tbody>
   </table>
</body>
</html>
