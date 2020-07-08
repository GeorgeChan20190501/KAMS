package com.kams.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginFilter implements HandlerInterceptor {

	/**
	 * 在请求处理之前进行调用（Controller方法调用之前）
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
		System.out.println("拦截器方法");
		try {
			// 统一拦截（查询当前session是否存在user）(这里user会在每次登陆成功后，写入session)

			Object user = request.getSession().getAttribute("username");
			System.out.println("user===" + user);
			/*
			 * if (user == null || user.equals("")) {
			 * System.out.println("Session不存在，拦截去首页"); PrintWriter out =
			 * response.getWriter(); out.println("<html>"); out.println("<script>");
			 * out.println("window.open ('/html/logon.html','_top')");
			 * out.println("</script>"); out.println("</html>"); return false; }
			 */
			if (user == null || user.equals("")) {
				System.out.println("Session不存在，拦截去首页");
				response.setHeader("refresh", "0;/html/logon.html");
				response.setContentType("text/html;charset=utf-8");
				response.getWriter().print("登录超时，请重新登录！");
				return false;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;

	}

	/**
	 * 请求处理之后进行调用，但是在视图被渲染之前（Controller方法调用之后）
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) {
//         System.out.println("执行了TestInterceptor的postHandle方法");
	}

	/**
	 * 在整个请求结束之后被调用，也就是在DispatcherServlet 渲染了对应的视图之后执行（主要是用于进行资源清理工作）
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
//        System.out.println("执行了TestInterceptor的afterCompletion方法");
	}

}