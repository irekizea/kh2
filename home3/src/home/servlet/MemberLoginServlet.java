package home.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.beans.MemberDao;
import home.beans.MemberDto;

@WebServlet(urlPatterns = "/member/login.do")
public class MemberLoginServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
//			준비
			req.setCharacterEncoding("UTF-8");
			String id = req.getParameter("id");
			String pw = req.getParameter("pw");
//			처리
			MemberDao dao = new MemberDao();
			boolean result = dao.login(id, pw);

//			출력
			if(result) {
//				
				req.getSession().setAttribute("id", id);
				MemberDto dto = dao.get(id);
				req.getSession().setAttribute("grade", dto.getGrade());
//				resp.sendRedirect("../index.jsp");
//				resp.sendRedirect("/home/index.jsp");
//				resp.sendRedirect("/home");
//				추가 : 사용자의 최종 로그인 시각을 수정
				dao.updateLastLogin(id);
				resp.sendRedirect(req.getContextPath());
			}
			else {
//				error 메시지가 표시되는 로그인 화면으로 이동
				resp.sendRedirect("login.jsp?error");
//				resp.sendRedirect(req.getContextPath()+"/member/login_fail.jsp");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}
