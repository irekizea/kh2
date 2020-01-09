package home.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/member/logout.do")
public class MemberLogoutServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//	세션에 들어 있는 회원 로그인 정보를 삭제시키 누디 메인 페이지로 리다이렉트
		req.getSession().removeAttribute("id");
		req.getSession().removeAttribute("grade");
		resp.sendRedirect(req.getContextPath());
		
		
		
	}
	
	
}
