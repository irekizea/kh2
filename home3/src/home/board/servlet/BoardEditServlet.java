package home.board.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.beans.BoardDao;
import home.beans.BoardDto;

@WebServlet(urlPatterns = "/board/edit.do")
public class BoardEditServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
		BoardDao dao = new BoardDao();
		BoardDto dto = new BoardDto();
		
		dto.setContent(req.getParameter("content"));
		dto.setHead(req.getParameter("head"));
		dto.setTitle(req.getParameter("title"));
		dto.setNo(Integer.parseInt(req.getParameter("no")));
	

				dao.BoardEdit(dto);

			
			resp.sendRedirect("content.do?no="+dto.getNo());
		} catch (Exception e) {
			e.printStackTrace();
			resp.sendError(404);
		}
	}
}
