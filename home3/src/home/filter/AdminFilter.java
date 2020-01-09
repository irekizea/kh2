package home.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebFilter(urlPatterns = "/admin/*")
public class AdminFilter implements Filter{	
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletResponse resp = (HttpServletResponse)response;
		HttpServletRequest req = (HttpServletRequest)request;
		
		String grade = (String)req.getSession().getAttribute("grade");
		
		
		
		if(grade!=null&&grade.contentEquals("관리자"))
		chain.doFilter(request, response);
		else
			resp.sendError(403);
		
	}
	
	@Override
	public void destroy() {
//		필터가 최종 소멸될 떄 1회 호출되는 메소드
//		초기화 했던 내용 중 정리할 것들이 잇따면 정리하는 코드작성
		
	}
	
	
	
	
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
// 	in it
//		필터가 최초 실행될 떄 1번 실행되는 구문
//		파일 로드 db설정 로드시
//		초기화 작업 코드 작성
//		 init() -> doFilter() -> destroy()
	}
	
}
