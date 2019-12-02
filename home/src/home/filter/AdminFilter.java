package home.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter(urlPatterns = "/admin/*")
public class AdminFilter implements Filter{	
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletResponse resp = (HttpServletResponse)response;
		HttpServletRequest req = (HttpServletRequest)request;
		
		String id = (String)req.getSession().getAttribute("id");
		String grade = (String)req.getSession().getAttribute("grade");
		
		
		
		if(id!=null&&grade=="관리자")
		chain.doFilter(request, response);
		else
			resp.sendRedirect("/home/member/login.jsp");
		
	}
	
}
