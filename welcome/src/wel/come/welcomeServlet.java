package wel.come;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/hello")
public class welcomeServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//	����� ��û ���� �� ó���� ������ �ڵ�� �ۼ�
		System.out.println("hello");
		
//		ȭ�� ��� �Ϸ��� resp ��� ��ü ����ؾ� ��(��������)()()(()()()()())()()()()())()()()()()()()()()()
		resp.setCharacterEncoding("EUC-KR"); // ���� ���� ���ڵ� ���
		resp.setContentType("text/plain; charset = UTF-8"); // ���� ���� + �ؼ� ���
		resp.getWriter().println("�ȳ�");
		resp.getWriter().println("�ȹݰ���");
	}

}
