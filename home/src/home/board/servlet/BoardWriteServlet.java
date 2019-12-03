package home.board.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.beans.BoardDao;
import home.beans.BoardDto;

@WebServlet(urlPatterns = "/board/write.do")
public class BoardWriteServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
		req.setCharacterEncoding("UTF-8");
		String id = (String)req.getSession().getAttribute("id");
		String name = req.getParameter("name");
		String content = req.getParameter("content");
		String head = req.getParameter("head");
		
		BoardDao dao = new BoardDao();
		BoardDto dto = new BoardDto();
		
		dto.setContent(content);
		dto.setHead(head);
		dto.setName(name);
		
	
			boolean result = dao.BoardWrite(dto);
			if(result) {
				resp.sendRedirect("/board/list.jsp");
			}
				else {
					resp.sendError(403);
			}
		} catch (Exception e) {
			resp.sendError(500);
			e.printStackTrace();
		}
		
		
	}

}
