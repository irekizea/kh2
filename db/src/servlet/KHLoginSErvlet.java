package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.KHMemberDao;
import beans.KHMemberDto;

@WebServlet(urlPatterns = "/kh_login")
public class KHLoginSErvlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
	KHMemberDao dao = new KHMemberDao();
	KHMemberDto dto = new KHMemberDto();
	dto.setId(req.getParameter("id"));
	dto.setPw(req.getParameter("pw"));

	resp.setCharacterEncoding("UTF-8");
	resp.setContentType("text/plain: charset = UTF-8");
	
		boolean result = dao.login(dto);
		if (result)
			resp.getWriter().print("접속완료");
		else 
			resp.getWriter().print("접속실패");
//		Exception ex = new Exception();
//		
//		throw ex;
		
	} catch (Exception e) {
		e.printStackTrace();
		resp.sendError(500);
	}
	
	}

}
