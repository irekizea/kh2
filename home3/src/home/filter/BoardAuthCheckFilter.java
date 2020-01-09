package home.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import home.beans.BoardDao;
import home.beans.BoardDto;

public class BoardAuthCheckFilter implements Filter{
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletResponse resp = (HttpServletResponse) response;
		try {
		HttpServletRequest req = (HttpServletRequest) request;

		HttpSession session = req.getSession();
		
		
		
		int no = Integer.parseInt(request.getParameter("no"));
		BoardDao dao = new BoardDao();

			BoardDto dto = dao.get(no);
			
			String id = (String)session.getAttribute("id");
			String grade = (String)session.getAttribute("grade");
			
			boolean isAdmin=grade.equals("관리자");
			boolean isMine = id.contentEquals(dto.getWriter());
			
			if(isAdmin||isMine) {
				chain.doFilter(request, response);
				
			}
			else {
				resp.sendError(403);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
		
		
	}
}
