package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/hello.do")
public class HelloServlet  extends HttpServlet{
		@Override
		protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//			RequestDispatcher dispatcher = req.getRequestDispatcher("Hello.jsp");
			RequestDispatcher dispatcher = req.getRequestDispatcher("/Hello.jsp");
			dispatcher.forward(req, resp);
			
		}

}
