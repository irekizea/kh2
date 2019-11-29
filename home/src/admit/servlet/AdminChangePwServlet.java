package admit.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.beans.MemberDao;

@WebServlet(urlPatterns = "/admin/change_pw.do")
public class AdminChangePwServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			req.setCharacterEncoding("UTF-8");
			String pw = req.getParameter("pw");
			
			String id = (String)req.getSession().getAttribute("id");
			
			MemberDao dao = new MemberDao();
			dao.chagePassword(id, pw);
			
			resp.sendRedirect("change_pw_result.jsp");
			
			
			
			
		}
		catch(Exception e) {
			
			e.getStackTrace();
			resp.sendError(500);
		}
		
		
		
		
	}
	
	
}
