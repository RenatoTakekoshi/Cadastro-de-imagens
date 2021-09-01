package imgStore.filtro;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebFilter(urlPatterns= {"/VisualizarImagens.jsp"})
public class AutenticacaoFiltro implements Filter {

    public AutenticacaoFiltro() {
        // TODO Auto-generated constructor stub
    }

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response,  FilterChain chain) throws IOException, ServletException {
		chain.doFilter(request, response);
		
		System.out.println("interceptando");
		
		HttpServletRequest req = (HttpServletRequest) request;
		HttpSession session =req.getSession();
		session.getAttribute("usuario");
		
		if(session.getAttribute("usuario") == null) {
			System.out.println("sim");			
			RequestDispatcher direcionar = request.getRequestDispatcher("/index.jsp");
			direcionar.forward(request, response);
			return;
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {

	}

}
