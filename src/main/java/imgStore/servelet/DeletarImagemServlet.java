package imgStore.servelet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import imgStore.dao.ImagemDAO;


@WebServlet("/DeletarImagemServlet")
public class DeletarImagemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public DeletarImagemServlet() {
        super();

    }
    
    
   
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		ImagemDAO deletar = new ImagemDAO();
		String idString = request.getParameter("id");
		int id = Integer.parseInt(idString);
		deletar.DeletarImagem(id);
		response.sendRedirect("principal/ListarImagem");

		
		
		System.out.println(id);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
		
		
	}

}
