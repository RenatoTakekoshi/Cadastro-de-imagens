<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Imagens</title>
<link rel="stylesheet"  href="/imgStore/estilo/cssImg.css">


</head>
<body>
<header>
<div class="topo">
	<h1>Galeria</h1>
	</div>
<div >
		<a href="Menu.jsp" ><button class="btnMenu">Voltar ao menu</button></a>
	</div>
	
	</header>
	

	<div class="galeria">
		<c:forEach var="c" items="${imagens}">
			<div class="itemGaleria">
				<img src="<c:out value="${c.IMG_URL}"/>" id="target" name="target" class="imgGaleria">
				<div class="imgDados">
					<span class="tituloImg">${c.IMG_TITULO }</span>

					<a href="/imgStore/DeletarImagemServlet?id=${c.ID_IMG}"><img src="/imgStore/icones/lixeira.png"></a>
					
				</div>
				</form>
		
			</div>
		</c:forEach>
	</div>


	
</body>
</html>