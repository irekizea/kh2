package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.SnackDao;

@WebServlet(urlPatterns = "/insert")
public class InsertServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		snack 테이블에 데이터 추가아아아아
		
		try {
		String name = req.getParameter("name");
		int price = Integer.parseInt(req.getParameter("price"));
		int stock = Integer.parseInt(req.getParameter("stock"));
		
		SnackDao dao = new SnackDao();
		dao.insert(name, price, stock);
		
		
		
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/plain:charset=UTF-8");
		
		resp.getWriter().println("완료");
		}
		catch(Exception e) {
		e.printStackTrace();// 오류 발생시 개발자 확인케 화면 출력
//		사용자에게 500이라는 상태값 전달(내부 서버 오류)
		resp.sendError(500);
		}
		
	}

}
