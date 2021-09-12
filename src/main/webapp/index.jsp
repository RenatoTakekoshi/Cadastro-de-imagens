<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="stylesheet"  href="estilo/cssLogin.css">
</head>
<body>


	<div class="login">
	<form action="LoginServelet" method="post">
	<h1>Login</h1><br>
	<input id="nome" name="nome" placeholder="Usuario" class="dadosLogin"><br><br>
	<input type="password" id="senha" name="senha" placeholder="Senha" class="dadosLogin"><br><br>
	<h4>${msgErro}</h4>
	<input type="submit" value="Entrar" class="btnDados"><br><br>

	</form>
		<a href="CadastrarUsuario.jsp" ><button class="btnDados">Criar usuario</button></a>
	</div>
	
</body>

</html>