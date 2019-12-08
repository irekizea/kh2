package home.board.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.beans.BoardDao;
import home.beans.BoardDto;

@WebServlet(urlPatterns = "/board/reply.do")
public class BoardReplyServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		아이디 받기 번호 번호가 없으면 1 있으면 +1
//		게시글 번호는 ?= 받을거고
//		
//		
//		
		try {
		BoardDao dao = new BoardDao();
		BoardDto dto = new BoardDto();
		
		
		if(req.getParameter("superno")!=null) {
			int superno = Integer.parseInt(req.getParameter("superno"));
			BoardDto target =dao.get(superno);
			dto.setRsuperno(target.getNo());
			dto.setRgroupno(target.getRgroupno());
			dto.setRdepth(target.getRdepth());
		}else {
			dto.setNo(Integer.parseInt(req.getParameter("no")));
		}
		
		
		
		dto.setRcontent(req.getParameter("rcontent"));
		String id = (String)req.getSession().getAttribute("id");
		
		System.out.println(id+dto.getRgroupno()+"   "+dto.getRsuperno());
		dto.setRwriter(id);
			dao.rwrite(dto);
			
			resp.sendRedirect("/home/board/list.jsp");
		
		
		}catch (Exception e) {
			resp.sendError(500);
			e.printStackTrace();
		}
		
		
		
		
	}

}
