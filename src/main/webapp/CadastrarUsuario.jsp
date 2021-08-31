<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de Usuario</title>
</head>
<body>

<form action="CadastroUsuarioServelet" method="post">

	<label>Nome:</label>
	<input id="nome" name="nome"><br>
	<label>Senha:</label>
	<input id="senha" name="senha"><br>
	<label>Email:</label>
	<input id="email" name="email"><br>
	<h4 >${msgErro}</h4>

	<input type="submit" value="enviar">
	</form>
	

</body>
</html>