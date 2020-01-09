package home.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;

//필터(Filter)
//[1]상속 받음
//[2]주소를 등록
// - 주소를 만드는 것 x 기존 있는 주소를 검사
//[3] 메소드를 구현한다(doFilter)
//@WebFilter(urlPatterns = "/index.jsp")
public class TestFilter implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		System.out.println("테스트 필터 실행");
//		통과 명령
		chain.doFilter(request, response);
		
		HttpServletResponse resp = (HttpServletResponse)response;
		
		resp.sendRedirect("/home/member/login.jsp");
	}

	
	
	
}
