package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/plus.do")
public class PlusServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		int a =4;
//		int b = 3;
//		
//		req.setAttribute("a", a);
//		req.setAttribute("b", b);
//	
//		(Integer)request.getAttribute("a")+(Integer)request.getAttribute("b") 
		try {
			
		int a = Integer.parseInt(req.getParameter("a"));
		int b = Integer.parseInt(req.getParameter("b"));
		
		int total = a+b;
		
		req.setAttribute("total", total);
		
		RequestDispatcher dispatcher =req.getRequestDispatcher("/plus.jsp");
		dispatcher.forward(req, resp);

		}catch(Exception e){
			e.printStackTrace();resp.sendError(500);
		}
		
		
		
	}

}
