package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.KHMemberDao;
import beans.KHMemberDto;

@WebServlet(urlPatterns = "/login/login.do")
public class LoginServelt extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
		KHMemberDao dao = new KHMemberDao();
		KHMemberDto dto = new KHMemberDto();
		
		dto.setId(req.getParameter("id"));
		dto.setPw(req.getParameter("pw"));
			
			
		if(dao.login(dto))
			resp.sendRedirect("login_result.jsp");
		else
			throw new Exception();
		} catch (Exception e) {
			
			e.printStackTrace();
			resp.sendRedirect("login_error.jsp");
		}
	
	
	}

}
