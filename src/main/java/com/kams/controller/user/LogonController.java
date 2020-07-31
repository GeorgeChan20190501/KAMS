package com.kams.controller.user;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.kams.bean.SysMenu;
import com.kams.bean.common.JsonReqObject;
import com.kams.service.FunService;
import com.kams.service.LogonService;
import com.kams.service.MenuService;

@Controller
public class LogonController {

	@Autowired
	private LogonService logonService;
	@Autowired
	private MenuService menuService;

	@Autowired
	private FunService funService;

	@PostMapping("/logon")
	@ResponseBody
	public String logon(@RequestBody String param, HttpServletRequest request) {
		System.out.println("用户登录参数===" + param);
		JsonReqObject jsonReqObject = JSONArray.parseObject(param, JsonReqObject.class);
		String username = jsonReqObject.getMsg().toLowerCase();
		String password = jsonReqObject.getMsg1();
		boolean flag = logonService.checkUser(username, password);
		if (flag) {
			HttpSession session = request.getSession(true);
			session.setAttribute("username", username);
			session.setMaxInactiveInterval(15 * 60);
		}
		System.out.println("验证登录flag=" + flag);
		return flag + "";
	}

	@PostMapping("/getUserMenu")
	@ResponseBody
	public Map<String, Object> logon(HttpServletRequest request) {
		HttpSession session = request.getSession(true);
		String username = (String) session.getAttribute("username");
		Map<String, Object> map = new HashMap<String, Object>();
		if (username == null || username.equals("")) {
			System.out.println("session过期，需要重新登陆。");
			return null;
		}
		System.out.println("验证通过,开始拉取用户菜单");
		// 每日登录成功，赠送积分
		funService.loginJiFen(username);
		List<SysMenu> list = menuService.getUserMenu(username);
		map.put("list", list);
		return map;
	}
}
