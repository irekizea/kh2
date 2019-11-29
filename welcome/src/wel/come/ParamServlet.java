package wel.come;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//  유저 입력값 해석 서블릿 구현
@WebServlet(urlPatterns = "/param")
public class ParamServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//	이름 정하기: kh
		
		String kh = req.getParameter("kh");
		String test = req.getParameter("test");
		System.out.println(kh);
		System.out.println(test);
	}

}
