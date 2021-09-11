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


@WebFilter(urlPatterns= {"/principal/*"})
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
		String login = (String) session.getAttribute("usuario"); 
		//String url = request.getParameter("url");
		
		//String urlParaAutenticar = req.getServletPath();
		//System.out.println(urlParaAutenticar);
		
		if(login == null ) {
			System.out.println(login);
			System.out.println("n�o");			
			//RequestDispatcher direcionar = request.getRequestDispatcher("/index.jsp?url="+urlParaAutenticar);
			RequestDispatcher direcionar = request.getRequestDispatcher("/PaginaBarrada.jsp");
			direcionar.forward(request, response);
			return;
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {

	}

}
