package home.board.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.beans.BoardDao;
import home.beans.BoardDto;

@WebServlet(urlPatterns="/board/list.do")
public class BoardListServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
		int pno;
		

		
		try{
			pno=Integer.parseInt(req.getParameter("pno"));
			if(pno<=0) throw new Exception();
			
		}
		catch(Exception e){
			pno=1;
		}
		
		int pageSize= 10;
		
		int finish = pno * pageSize;
		int start = finish -pageSize+1;



		BoardDao dao = new BoardDao();

		
	 	String type = req.getParameter("type");
		String keyword = req.getParameter("keyword");
		
		List<BoardDto> list;
		boolean isSearch = type!= null&& keyword!=null;
		
		
		if(isSearch)
		list = dao.list(start, finish, type, keyword);
		else
	 	list= dao.list(start, finish);
	 	
		/**
		
		하단 네비게이터 계산하기
		-시작블록=(현제페이지-1)/네비게이터크기*네비게이터크기+1
		
		
		**/
		
		
		int navsize = 10;
		
		int count = dao.getCount(type, keyword);
		
		int startBlock = (pno-1)/navsize * navsize +1;
		int finishblock = startBlock +(navsize-1);
		int pagecount = (count+pageSize)/pageSize;
		

		
		// 만약 마지막 블록이 페이지 수보다 크다면 수정 처리
		if(finishblock>pagecount){
			finishblock = pagecount;
		}
		
		req.setAttribute("pno", pno);
		req.setAttribute("list", list);
		
		req.setAttribute("navsize", navsize);
		req.setAttribute("count", count);
		req.setAttribute("startBlock", startBlock);
		req.setAttribute("finishblock", finishblock);
		req.setAttribute("pagecount", pagecount);

		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/view/board/list.jsp");
		dispatcher.forward(req, resp);
		
		
		}catch (Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
	
	
	
}
