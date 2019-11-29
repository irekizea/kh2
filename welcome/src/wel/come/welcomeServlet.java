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
//	사용자 요청 했을 시 처리할 내용을 코드로 작성
		System.out.println("hello");
		
//		화면 출력 하려면 resp 라는 객체 사용해야 함(응답정보)()()(()()()()())()()()()())()()()()()()()()()()
		resp.setCharacterEncoding("EUC-KR"); // 문서 제작 인코딩 방식
		resp.setContentType("text/plain; charset = UTF-8"); // 문서 유형 + 해석 방식
		resp.getWriter().println("안녕");
		resp.getWriter().println("안반가워");
	}

}
