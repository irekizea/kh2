package admit.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.beans.MemberDao;
import home.beans.MemberDto;

@WebServlet(urlPatterns = "/admin/findAdmin.do")
public class AdmitFindServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
		req.setCharacterEncoding("UTF-8");
		String id = req.getParameter("id");
		MemberDao dao = new MemberDao();
		
		MemberDto dto = dao.get(id);
		String uid = dto.getId();
		
		if(uid==null) {
			resp.sendRedirect("list.jsp");
		}
		else
			resp.sendRedirect("admin_nfo.jsp?uid="+uid);
		
		}catch(Exception e) {
			
			
		}
		
	}

}
