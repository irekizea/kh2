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
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
		req.setCharacterEncoding("UTF-8");

		
		
		BoardDao dao = new BoardDao();
		BoardDto dto = new BoardDto();
		
		if(req.getParameter("superno")!=null) {
			int superno = Integer.parseInt(req.getParameter("superno"));
			BoardDto target =dao.get(superno);
			dto.setSuperno(target.getNo());
			dto.setGroupno(target.getGroupno());
			dto.setDepth(target.getDepth());
		}
		
		
		
		dto.setContent(req.getParameter("content"));
		dto.setHead(req.getParameter("head"));
		dto.setTitle(req.getParameter("title"));
		String id = (String)req.getSession().getAttribute("id");
		dto.setWriter(id);
		
			int no = dao.getSequence();
			dto.setNo(no);
			dao.BoardWrite(dto);
			
			resp.sendRedirect("/home/board/list.jsp");
			
		} catch (Exception e) {
			resp.sendError(500);
			e.printStackTrace();
		}
		
		
	}

}
