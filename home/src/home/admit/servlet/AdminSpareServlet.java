package home.admit.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.beans.MemberDao;
import home.util.StringUtil;

@WebServlet(urlPatterns = "/admin/spare.do")
public class AdminSpareServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			
			req.setCharacterEncoding("UTF-8");
			MemberDao dao = new MemberDao();
			String id = req.getParameter("id");
			
			String pw = StringUtil.GenerateRandomString(10);
//			System.out.println(id+"asd");
			req.getSession().setAttribute("pw", pw);
			dao.chagePassword(id, pw);
			
			resp.sendRedirect("spare_result.jsp");
			
			
			
		}
		catch(Exception e) {
			
			e.getStackTrace();
			resp.sendError(500);
		}
		
		
		
		
	}
	
	
}
