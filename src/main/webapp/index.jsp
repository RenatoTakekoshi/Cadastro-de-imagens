<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>

<form action="LoginServelet" method="post">

	<label>nome:</label>
	<input id="nome" name="nome"><br>
	<label>senha:</label>
	<input type="password" id="senha" name="senha"><br>
	<h4>${msgErro}</h4>
	<input type="submit" value="Entrar">
	
	</form>
	
	<a href="CadastrarUsuario.jsp" ><button>Criar usuario</button></a>
	<a href="principal/ListarImagem" ><button>Listar Usuario</button></a>
	
</body>
</html>