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

@WebFilter(urlPatterns = {
		"/admin/*",
		"/member/info.jsp",
		"/member/change_info.do",
		"/member/change_info.jsp",
		"/member/check.do",
		"/member/check.jsp",
		"/member/exit.do",
		"/member/logout.do"
		
		
})
public class LoginFilter implements Filter{
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpServletResponse resp = (HttpServletResponse)response;
		HttpServletRequest req =(HttpServletRequest)request;
		
		String id = (String)req.getSession().getAttribute("id");
		
		if(id!=null) {
			chain.doFilter(request, response);
		}
		else {
			resp.sendRedirect(req.getContextPath()+"/member/login.jsp");
		}
		
	}

}
