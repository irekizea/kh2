package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.KHMemberDao;
import beans.KHMemberDto;

@WebServlet(urlPatterns = "/insert2/regist.do")
public class RegistServlet2 extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	resp.setCharacterEncoding("UTF-8");
	
	int count = 0;
	try {
	String name = req.getParameter("name");
	String id = req.getParameter("id");
	String pw = req.getParameter("pw");
	


	
	KHMemberDto dto = new KHMemberDto();
	dto.setName(name);
	dto.setId(id);
	dto.setPw(pw);
	
	KHMemberDao dao = new KHMemberDao();
	
		dao.regist(dto);
		
		resp.sendRedirect("regist_result.jsp");
	} catch (Exception e) {
		e.printStackTrace();
		resp.sendRedirect("regist.jsp");
	}
	
	
	}

}
