package test.board.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.beans.BoardDao;
import test.beans.BoardDto;

@WebServlet(urlPatterns = "/board/write.do")
public class TestBoardWrite extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
		
			req.setCharacterEncoding("UTF-8");
			
		BoardDto dto = new BoardDto();
		BoardDao dao = new BoardDao();
		
		System.out.println(req.getParameter("content"));
		dto.setContent(req.getParameter("content"));
		dto.setHead(req.getParameter("head"));
		dto.setTitle(req.getParameter("title"));
		dto.setWriter(req.getParameter("writer"));
		System.out.println(dto.getHead());
		System.out.println(dto.getTitle()+"서블릿 타이틀");
		dao.BWrite(dto);
		
		
	
			resp.sendRedirect("list.jsp");
	
		
		}catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
		
	}
}
