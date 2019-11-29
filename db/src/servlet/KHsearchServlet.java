package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.KHMemberDao;
import beans.KHMemberDto;

@WebServlet(urlPatterns = "/kh_search")
public class KHsearchServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	try {
		
		KHMemberDao dao = new KHMemberDao();
		
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/plain: charset = UTF-8");
		
			List<KHMemberDto> list = dao.getList();
			for(KHMemberDto a : list) {
				resp.getWriter().println(a);

//			doPost(req, resp); 
			
//			doGet(req, resp);
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
			resp.sendError(500);
		}

	
	}

}
