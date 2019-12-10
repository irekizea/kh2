package test.member.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.beans.MemberDao;
import test.beans.MemberDto;

@WebServlet(urlPatterns = "/member/regist.do")
public class TmemberRegistServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			
			
			req.setCharacterEncoding("UTF-8");
			MemberDto dto = new MemberDto();
			dto.setId(req.getParameter("id"));
			dto.setPw(req.getParameter("pw"));
			dto.setName(req.getParameter("name"));
			dto.setPhone(req.getParameter("phone"));

				MemberDao dao = new MemberDao();
				dao.regist(dto);
				
				resp.sendRedirect(req.getContextPath());
			
		}catch (Exception e){
			e.printStackTrace();
			resp.sendError(500);
			
			
		}
		
	}
}
