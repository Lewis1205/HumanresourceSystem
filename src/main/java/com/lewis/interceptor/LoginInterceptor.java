package com.lewis.interceptor;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		System.out.println("preHandle");
		String uri = request.getRequestURI();
		// System.out.println(request.getContextPath());
		if (uri.equals(request.getContextPath() + "/login")) {
			return true;
		}
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals("user")) {
					String cookieVal = cookie.getValue();
					System.out.println(cookieVal);
					return true;
				}
			}
		}
		// request.getRequestDispatcher("/login.jsp").forward(request,

		response.sendRedirect("/login.jsp");
		return false;
	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("postHandle");
	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("afterCompletion");
	}

}
