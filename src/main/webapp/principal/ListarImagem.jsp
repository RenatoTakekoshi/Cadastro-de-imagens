<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Imagens</title>
</head>
<body>
	<h1>Galeria</h1>
	
	<c:forEach var="c" items="${imagens}">
	
	<input name="IMG_URL" type="text" value="${c.IMG_TITULO}"><br>
	<img src="<c:out value="${c.IMG_URL}"/>" width="140px" height="140px" 
                             style="min-height: 100px;" border="0" id="target" name="target"><br>
	</c:forEach>
	<a href="Menu.jsp" ><button>Voltar ao menu</button></a>

	
</body>
</html>