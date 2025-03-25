package com.spring.springinterceptor.interceptor;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class BoardInterceptor extends HandlerInterceptorAdapter {
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		
		System.out.println("이곳은 BoardInterceptor안의 preHandle 메소드 입니다.");
		
		HttpSession session = request.getSession();
		
		int level = session.getAttribute("sLevel")==null ? 99 : (int) session.getAttribute("sLevel");

		if(level > 3) {
			String viewPage = "/message/loginError";
			RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
			dispatcher.forward(request, response);
			return false;
		}
		else if(level == 3) {
			String viewPage = "/message/levelError";
			RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
			dispatcher.forward(request, response);
			return false;
		}
		
		return true;
	}

	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		System.out.println("이곳은 BoardInterceptor안의 postHandle 메소드 입니다.");

		super.postHandle(request, response, handler, modelAndView);
	}
	
	 
}
