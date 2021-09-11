package imgStore.servelet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import imgStore.entidades.Imagem;
import imgStore.dao.ImagemDAO;


@WebServlet("/principal/ListarImagem")
public class ListarImagem extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	

    public ListarImagem() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		HttpServletRequest req = request;
		HttpSession session =req.getSession();
		String login = (String) session.getAttribute("usuario");
		
		if(login != null) {
			
		
		String nome = (String) session.getAttribute("usuario");
		List<Imagem> imagens = ImagemDAO.ListarImagem(nome);
		
		request.setAttribute("imagens", imagens);
		//System.out.println("corinthians");
		RequestDispatcher direcionar = request.getRequestDispatcher("/principal/ListarImagem.jsp");
		direcionar.forward(request, response);
	}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
