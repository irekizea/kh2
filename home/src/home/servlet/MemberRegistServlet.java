package home.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.beans.MemberDao;
import home.beans.MemberDto;

@WebServlet(urlPatterns = "/member/regist.do")
public class MemberRegistServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
		
		req.setCharacterEncoding("UTF-8");
		MemberDto dto = new MemberDto();
		dto.setId(req.getParameter("id"));
		dto.setPw(req.getParameter("pw"));
		dto.setName(req.getParameter("name"));
		dto.setPost(req.getParameter("post"));
		dto.setBasic_addr(req.getParameter("basic_addr"));
		dto.setExtra_addr(req.getParameter("extra_addr"));
		dto.setPhone(req.getParameter("phone"));
		
	
		MemberDao dao = new MemberDao();

			dao.regist(dto);
			
			resp.sendRedirect(req.getContextPath());
		} catch (Exception e) {
	
			e.printStackTrace();
			resp.sendRedirect("regist_fail.jsp");
		}
		
		
	}
}
