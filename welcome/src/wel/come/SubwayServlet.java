package wel.come;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/subway")
public class SubwayServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		resp.setCharacterEncoding("EUC-KR");
		resp.setContentType("text/plain; charset =UTF - 8");
	
//		int year = Integer.parseInt(req.getParameter("year"));
		
		String age = req.getParameter("age");
		int k = Integer.parseInt(age);
		int a = 2019-k+1;
		
		
		if(a>7 && a <= 13)
			resp.getWriter().println("450");
		else if (a>13 && a <=19)
			resp.getWriter().println("720");
		else if (a>19 && a<=64)
			resp.getWriter().println("1250");
		else
			resp.getWriter().println("¹«·á");
		
	}

}
