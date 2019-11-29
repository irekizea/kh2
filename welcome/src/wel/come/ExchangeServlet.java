package wel.come;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/dollor")
public class ExchangeServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	resp.setCharacterEncoding("EUC-KR");
	resp.setContentType("text/plain; charset = UTF-8");
	
	int to = Integer.parseInt(req.getParameter("dollor"));
	
	int rate = 1176;
	
	int exchange = to*rate;
	
	String result = Integer.toString(exchange);
	
	
	resp.getWriter().println(result);

		
	
	}

}
