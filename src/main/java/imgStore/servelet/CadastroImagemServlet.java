package imgStore.servelet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import imgStore.dao.ImagemDAO;
import imgStore.entidades.Imagem;


@WebServlet("/CadastroImagemServlet")
public class CadastroImagemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public CadastroImagemServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
		System.out.println(request.getParameter("titulo"));
		System.out.println(request.getParameter("urlimagemBase64"));
		
		Imagem imagem = new Imagem();
		imagem.setIMG_URL(request.getParameter("urlimagemBase64"));
		imagem.setIMG_TITULO(request.getParameter("titulo"));
		
		ImagemDAO salvar = new ImagemDAO();
		salvar.CadastrarImagem(imagem);
		
		
	}

}
