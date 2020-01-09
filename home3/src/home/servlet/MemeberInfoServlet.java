package home.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.beans.MemberDao;
import home.beans.MemberDto;

@WebServlet(urlPatterns = "/member/info.do")
public class MemeberInfoServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	try {
		
		String id = (String)req.getSession().getAttribute("id");
		MemberDao dao = new MemberDao();
		MemberDto dto = dao.get(id);
		System.out.println(dto.getId());
		req.setAttribute("dto", dto);
	
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/view/member/info.jsp");
		dispatcher.forward(req, resp);
		}catch(Exception e){
			e.printStackTrace();
			resp.sendError(500);
		
		}
	}

}
