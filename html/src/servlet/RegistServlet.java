package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.SnackDao;

@WebServlet(urlPatterns = "/insert/regist.do")
public class RegistServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	try {
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/plain:charset = UTF-9");
		
		String name = req.getParameter("name");
		int price = Integer.parseInt(req.getParameter("price"));
		int stock = Integer.parseInt(req.getParameter("stock"));
		
		SnackDao dao = new SnackDao();
		dao.insert(name, price, stock);
		
		resp.sendRedirect("regist_result.jsp");
		
		
	}
	catch(Exception e ) {
		e.printStackTrace();
		resp.sendError(500);
	}
	
	
	}
	
}

