package imgStore.servelet;

import java.io.IOException;


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


@WebServlet("/LoginServelet")
public class LoginServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginServelet() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
		BasicPasswordEncryptor senhaCodificada = new BasicPasswordEncryptor();
		
		String login = request.getParameter("nome");
		String senha = request.getParameter("senha");
		
		Usuario usuarioAutenticar = usuarioDAO.buscarUsuario(login);
		boolean verificar = senhaCodificada.checkPassword(senha,usuarioAutenticar.getSENHA());

		
		if(usuarioAutenticar.getUSER_NAME()!=null && usuarioAutenticar.getUSER_NAME().equals(login) && verificar == true)  {
			//Usuario usuario = new Usuario(login,senha);
			
			HttpServletRequest req = request;
			HttpSession session =req.getSession();
			session.setAttribute("usuario", login);
			response.sendRedirect("/imgStore/VisualizarImagens.jsp");
			//RequestDispatcher direcionar = request.getRequestDispatcher("/VisualizarImagens.jsp");
			//direcionar.forward(request, response);
			return;
				
		}else {
			RequestDispatcher direcionar = request.getRequestDispatcher("index.jsp");
			request.setAttribute("msgErro", "Usuario ou senha incorretos");
			direcionar.forward(request, response);
		}

		
		
	}

}
