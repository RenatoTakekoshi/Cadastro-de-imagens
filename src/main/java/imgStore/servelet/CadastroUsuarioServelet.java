package imgStore.servelet;

import java.io.IOException;
//import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.jasypt.util.password.BasicPasswordEncryptor;

import imgStore.dao.usuarioDAO;
import imgStore.entidades.Usuario;


@WebServlet("/CadastroUsuarioServelet")
public class CadastroUsuarioServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public CadastroUsuarioServelet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		BasicPasswordEncryptor senhaCodificada = new BasicPasswordEncryptor();
		
		Usuario usuario = new Usuario();
		String nome = request.getParameter("nome") ;
		String senha = request.getParameter("senha");
		String email = request.getParameter("email");
		

		
		
		
		if(nome.isEmpty() || senha.isEmpty() || email.isEmpty() ) {
			RequestDispatcher direcionar = request.getRequestDispatcher("CadastrarUsuario.jsp");
			request.setAttribute("msgErro", "Preencha todos os campos");
			direcionar.forward(request, response);
		}else {
			
			usuario.setUSER_NAME(nome);
			usuario.setSENHA(senhaCodificada.encryptPassword(senha));
			usuario.setEMAIL(email);
			usuarioDAO.cadastrarUsuario(usuario);
			RequestDispatcher direcionar = request.getRequestDispatcher("index.jsp");
			request.setAttribute("msgErro", "Usuario Criado, fa?a o login");
			direcionar.forward(request, response);
			
		}
		

		


		//boolean ok = usuarioDAO.cadastrarUsuario(usuario);
		//PrintWriter out = response.getWriter();


	}

}
