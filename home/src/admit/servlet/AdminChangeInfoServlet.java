package admit.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.beans.MemberDao;
import home.beans.MemberDto;

@WebServlet(urlPatterns = "/admin/change_info.do")
public class AdminChangeInfoServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			req.setCharacterEncoding("UTF-8");
			String phone = req.getParameter("phone");
			String post = req.getParameter("post");
			String basic_addr = req.getParameter("basic_addr");
			String extra_addr = req.getParameter("extra_addr");
			
			String id = (String)req.getSession().getAttribute("id");
			
			MemberDao dao = new MemberDao();
			MemberDto dto = new MemberDto();
			dto.setPhone(phone);
			dto.setPost(post);
			dto.setBasic_addr(basic_addr);
			dto.setExtra_addr(extra_addr);
			
			dto.setId(id);
			
			
			dao.changeInfo(dto);
			
		
			resp.sendRedirect("admin_nfo.jsp");
			
			
		}catch(Exception e) {
			
			e.getStackTrace();
			resp.sendError(500);
		}
		
		
	
	}

}
