package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.KHMemberDao;
import beans.KHMemberDto;

@WebServlet(urlPatterns = "/kh_insert")
public class KHInsertServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		try {
	KHMemberDto Dto = new KHMemberDto();
	Dto.setName(req.getParameter("name"));
	Dto.setId(req.getParameter("id"));
	Dto.setPw(req.getParameter("pw"));
	
	System.out.println(Dto.getId());
	
	KHMemberDao dao = new KHMemberDao();
		dao.regist(Dto);
	}
		catch (Exception e) {
		
		
		e.printStackTrace();
		resp.sendError(500);
	} 
	
	
	
	
	}

}
