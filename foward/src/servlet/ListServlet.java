package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.beans.MemberDao;
import home.beans.MemberDto;

@WebServlet(urlPatterns="/list.do")
public class ListServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		try {
			MemberDao dao = new MemberDao();
			List<MemberDto> list = dao.search("id", null);
			
			req.setAttribute("list", list);
			
			RequestDispatcher dispatcher =req.getRequestDispatcher("/WEB-INF/view/list.jsp");
			dispatcher.forward(req, resp);
			
			
		}catch(Exception e){
			e.printStackTrace();
			resp.sendError(500);
		}
		
		
	}
}
