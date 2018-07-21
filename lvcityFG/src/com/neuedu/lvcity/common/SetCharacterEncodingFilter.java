package com.neuedu.lvcity.common;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Example filter that sets the character encoding to be used in parsing the
 * incoming request
 */
public class SetCharacterEncodingFilter implements Filter {

	public void init(FilterConfig filterConfig) throws ServletException {
	}

	/**
	 * Select and set (if specified) the character encoding to be used to
	 * interpret request parameters for this request.
	 */
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		request.setCharacterEncoding("utf-8");
		//response.setCharacterEncoding("utf-8");
		response.setContentType("utf-8");

		// 传递控制到下一个过滤器
		chain.doFilter(request, response);
	}

	public void destroy() {
	}
}
