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
//		snack ���̺� ������ �߰��ƾƾƾ�
		
		try {
		String name = req.getParameter("name");
		int price = Integer.parseInt(req.getParameter("price"));
		int stock = Integer.parseInt(req.getParameter("stock"));
		
		SnackDao dao = new SnackDao();
		dao.insert(name, price, stock);
		
		
		
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/plain:charset=UTF-8");
		
		resp.getWriter().println("�Ϸ�");
		}
		catch(Exception e) {
		e.printStackTrace();// ���� �߻��� ������ Ȯ���� ȭ�� ���
//		����ڿ��� 500�̶�� ���°� ����(���� ���� ����)
		resp.sendError(500);
		}
		
	}

}
