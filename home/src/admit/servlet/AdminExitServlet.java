package admit.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.beans.MemberDao;

@WebServlet(urlPatterns= "/admin/exit.do")
public class AdminExitServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			req.setCharacterEncoding("UTF-8");
			String id = (String) req.getSession().getAttribute("id");
		MemberDao dao = new MemberDao();
		
		req.getSession().removeAttribute("id");
		req.getSession().removeAttribute("grade");
			boolean result = dao.exit(id);
			
			if(result) {

				resp.sendRedirect("exit_result.jsp");
			}
			else
				resp.sendRedirect("exit.jsp");
			
			
			
		} catch (Exception e) {
		
			e.printStackTrace();
			resp.sendError(500);
		}
		
		
		
		
		
		
	}

}
