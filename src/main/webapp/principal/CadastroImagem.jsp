<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page import="imgStore.entidades.Imagem" %>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="app/jquery-3.6.0.js"></script>
<meta charset="ISO-8859-1">

<title>Cadastrar imagens</title>
<link rel="stylesheet"  href="/imgStore/estilo/cssLogin.css">
</head>
<body>


<div class="login">
<h1>Cadastre suas imagens</h1>
<form action="/imgStore/CadastroImagemServlet" method="post">

 <input type="hidden" name="urlimagemBase64" id="urlimagemBase64" value="${imagem.URL_IMG}"/>


	<input type="text" id="titulo" name="titulo" placeholder="Titulo da imagem" class="dadosLogin" required><br><br>
	<img alt="imagem"  src="" id="target" widht="200" height="200" class="imgSalvar"><br><br>
	<label for="file" class="btnDados">Carregar foto</label>
	<input type="file" id="file" name="file" onchange="uploadFile();"  class="inputFile" required/><br><br>

	<input type="submit" value="enviar" class="btnDados"><br><br>
	

</form>
<a href="Menu.jsp" ><button class="btnDados">Voltar ao menu</button></a>

</div>

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