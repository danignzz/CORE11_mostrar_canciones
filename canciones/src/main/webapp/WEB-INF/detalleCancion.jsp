<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Detalles de las canciones</title>
    <meta charset="UTF-8">
</head>
<body>
    <h1>Detalles</h1>
    <p><strong>ID:</strong> ${cancion.id}</p>
        <p><strong>Título:</strong> ${cancion.titulo}</p>
        <p><strong>Artista:</strong> ${cancion.artista}</p>
        <p><strong>Álbum:</strong> ${cancion.album}</p>
        <p><strong>Género:</strong> ${cancion.genero}</p>
        <p><strong>Idioma:</strong> ${cancion.idioma}</p>
        <p><strong>Fecha de Creación:</strong> ${cancion.fechaCreacion}</p>
        <p><strong>Fecha de Actualización:</strong> ${cancion.fechaActualizacion}</p>

        <a href="${pageContext.request.contextPath}/canciones">Volver a lista de canciones</a>
    </div>
</body>
</html>