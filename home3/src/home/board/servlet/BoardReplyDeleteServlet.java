package home.board.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.beans.BoardDao;
import home.beans.ReplyDao;

@WebServlet(urlPatterns = "/board/reply_delete.do")
public class BoardReplyDeleteServlet extends HttpServlet{
	
@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
try {
		int no = Integer.parseInt(req.getParameter("no"));
		int origin = Integer.parseInt(req.getParameter("origin"));

		ReplyDao dao = new ReplyDao();
		dao.delete(no);
		BoardDao bdao = new BoardDao();
		bdao.calculate(origin);

		resp.sendRedirect("content.do?no=" + origin);
	}
	catch(Exception e) {
		e.printStackTrace();
		resp.sendError(500);
	}
}
}

