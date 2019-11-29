package wel.come;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/random")
public class RandomServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		
		Random rn = new Random();
		
		int lotto = rn.nextInt(45)+1;
		
		resp.setCharacterEncoding("EUC-KR");
		resp.setContentType("text/plain; charset = UTF-8");
		resp.getWriter().println(lotto);
	}
	
}
