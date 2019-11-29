package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.KHMemberDao;

@WebServlet(urlPatterns = "/update.do")
public class UpdateServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			
			resp.setCharacterEncoding("UTF-8");
			
			String id = req.getParameter("id");
			String pw = req.getParameter("pw");
			String newpw = req.getParameter("newpw");
			
			KHMemberDao dao = new KHMemberDao();
			
			if(dao.update(id, pw, newpw))
				resp.sendRedirect("update_success.jsp");
			else
				resp.sendRedirect("update_fail.jsp");
			
			
			
			
			
			
		}
		catch (Exception e) {
		e.printStackTrace();
		resp.sendError(500);
		
		
		}
		
		
	}

}
