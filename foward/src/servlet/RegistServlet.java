package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.beans.MemberDao;
import home.beans.MemberDto;

@WebServlet(urlPatterns="/regist.do")
public class RegistServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-I NF/view/regist.jsp");
		dispatcher.forward(req, resp);
	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
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
			
			resp.sendRedirect(req.getContextPath()+"/login.do");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resp.sendError(500);
		}
		
		
		
	}
	
	
}
