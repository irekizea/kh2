package home.board.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.beans.BoardDao;
import home.beans.BoardDto;

@WebServlet(urlPatterns = "/board/delete.do")
public class BoardDeleteServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			int no = Integer.parseInt(req.getParameter("no"));
			// 주의 반드시 관리자이거나 본인글일경우만삭제기능을 실행 아니면 403 오류 송출
			
			BoardDao dao = new BoardDao();
			BoardDto dto = dao.get(no);
			String id = (String)req.getSession().getAttribute("id");
			String grade = (String)req.getSession().getAttribute("grade");
			boolean isAdmin = grade.equals("관리자");
			boolean isMine = id.contentEquals(dto.getWriter());
			if(isAdmin||isMine)
			dao.delete(no);
			else
				resp.sendError(403);
		}
		catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
			
		}
	
	
	}

}
