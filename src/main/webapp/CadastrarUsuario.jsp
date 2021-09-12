<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de Usuario</title>
<link rel="stylesheet"  href="/imgStore/estilo/cssLogin.css">
</head>
<body>
<div class="login">
<form action="CadastroUsuarioServelet" method="post">

	<h1>Insira seus dados</h1>
	<input id="nome" name="nome" placeholder="Nome" class="dadosLogin"><br><br>
	<input type="password" id="senha" name="senha" placeholder="Senha" class="dadosLogin"><br><br>
	<input id="email" name="email" placeholder="Email" class="dadosLogin"><br><br>
	<h4 >${msgErro}</h4>

	<input type="submit" value="Enviar" class="btnDados"><br><br>
	
	</form>
	<a href="index.jsp" ><button class="btnDados">Voltar ao menu</button></a>
	</div>

</body>
</html>