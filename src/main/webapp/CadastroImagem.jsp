<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page import="imgStore.entidades.Imagem" %>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="app/jquery-3.6.0.js"></script>
<meta charset="ISO-8859-1">

<title>Insert title here</title>
</head>
<body>
<h1>Cadastre suas imagens</h1>


<form action="CadastroImagemServlet" method="post">

 <input type="text" name="urlimagemBase64" id="urlimagemBase64" value="${imagem.URL_IMG}"/>

	<label>Titulo da imagem:</label>
	<input type="text" id="titulo" name="titulo"><br>
	<img alt="imagem"  src="" id="target" widht="200" height="200"><br>
	<input type="file" id="file" name="file" onchange="uploadFile();"/>

	<input type="submit" value="enviar">

</form>

</body>
<script type="text/javascript">
function uploadFile(){
	var target = document.querySelector("img");
	var file = document.querySelector("input[type=file]").files[0];
	var reader = new FileReader();
	
	reader.onloadend = function(){
		target.src = reader.result;
		document.getElementById("urlimagemBase64").value = reader.result; // seta o valor da imagem ao intputtext urlimagemBase64
	};
	
	if(file){
		reader.readAsDataURL(file);
	}else{
		target.src="";
	}
};


</script>
</html>