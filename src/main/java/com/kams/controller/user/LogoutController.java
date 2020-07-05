package com.kams.controller.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogoutController {

	@PostMapping("/logout")
	public String logout(HttpServletRequest request) {
		HttpSession session = request.getSession(true);
		String username = (String) session.getAttribute("username");
		if (username != null) {
			if (!username.equals("")) {
				session.removeAttribute("username");
				System.out.println("session已经销毁，返回登陆页");
			}
		}
		System.out.println("session user="+(String) session.getAttribute("username"));
		return "true";
	}
}
