package servlet;

import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/dice.do")
public class DiceServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Random r = new Random();
		int data= r.nextInt(6)+1;
		
		req.setAttribute("data", data);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/dice.jsp");
		dispatcher.forward(req, resp);
		
		
		
	}

}
