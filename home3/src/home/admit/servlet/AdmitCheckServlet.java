package home.admit.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.beans.MemberDao;

@WebServlet(urlPatterns = "/admin/check.do")
public class AdmitCheckServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
		String id = (String)req.getSession().getAttribute("id");
		String pw = req.getParameter("pw");
		String go = req.getParameter("go");
		MemberDao dao = new MemberDao();
		boolean result = dao.login(id, pw);
		
		System.out.println(go);
		
		
		if(result) {
			resp.sendRedirect(req.getContextPath()+go);
			
		}else {
			resp.sendRedirect("check.jsp?error");
		}
		
		}
		catch(Exception e ) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}

}
