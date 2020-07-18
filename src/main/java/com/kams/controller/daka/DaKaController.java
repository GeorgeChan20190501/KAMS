package com.kams.controller.daka;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONArray;
import com.kams.bean.SmConfig;
import com.kams.bean.SmDakarecord;
import com.kams.bean.SmGonggao;
import com.kams.bean.common.JsonReqObject;
import com.kams.service.AppConfigService;

@RestController
public class DaKaController {

	@Autowired
	private AppConfigService appConfigService;

	@PostMapping("/getZhiRi")
	public Map<String, Object> getZhiRi(@RequestBody String param) {
		System.out.println("值日参数===" + param);
		// 查询当前值日人。
		List<SmConfig> list = appConfigService.getZhiRi();
		// 上述拿到完整list，现在进行分页返回当前页面数据。
		System.out.println("总条数为===" + list.size());
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("list", list);
		return map;
	}

	@PostMapping("/getCurrentStep")
	public String getCurrentStep(@RequestBody String param) {
		System.out.println("当前步骤参数===" + param);
		// 查询当前值日人。
		String step = appConfigService.getCurrentStep();
		// 上述拿到完整list，现在进行分页返回当前页面数据。

		return step;
	}

	@PostMapping("/setStep")
	public String setStep(@RequestBody String param) {
		System.out.println("当前步骤参数===" + param);
		JsonReqObject jsonReqObject = JSONArray.parseObject(param, JsonReqObject.class);
		String step = jsonReqObject.getMsg();
		String user = jsonReqObject.getMsg1();
		SmDakarecord smDakarecord = new SmDakarecord();
		smDakarecord.setActive(step);
		smDakarecord.setUsr(user);
		appConfigService.setStep(smDakarecord);
		// 上述拿到完整list，现在进行分页返回当前页面数据。

		return step;
	}

	@PostMapping("/emailNotify")
	public String emailNotify(@RequestBody String param) {
		System.out.println("通知邮件参数===" + param);
		JsonReqObject jsonReqObject = JSONArray.parseObject(param, JsonReqObject.class);
		String nextUser = jsonReqObject.getMsg();
		String currentUser = jsonReqObject.getMsg1();
		String msgString = appConfigService.emailNotify(nextUser, currentUser);
		return msgString;
	}

	@PostMapping("/fenyeQueryGongGao")
	public Map<String, Object> fenyeQueryGongGao(@RequestBody String param) {
		System.out.println("公告参数===" + param);
		List<SmGonggao> list = appConfigService.fenyeQueryGongGao();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("list", list);
		return map;
	}

	@PostMapping("/addGongGao")
	public String addGongGao(@RequestBody String param) {
		System.out.println("公告参数===" + param);
		JsonReqObject jsonReqObject = JSONArray.parseObject(param, JsonReqObject.class);
		String obj = jsonReqObject.getMsg();
		SmGonggao smGonggao = JSONArray.parseObject(obj, SmGonggao.class);

		int a = appConfigService.addGongGao(smGonggao);
		if (a > 0) {
			return "恭喜，公告发布成功！";
		} else {
			return "发布异常，请查看日志！";
		}
	}

	@PostMapping("/delGongGao")
	public String delGongGao(@RequestBody String param) {
		System.out.println("删除公告参数===" + param);
		JsonReqObject jsonReqObject = JSONArray.parseObject(param, JsonReqObject.class);
		String id = jsonReqObject.getMsg();

		int a = appConfigService.delGongGao(id);
		if (a > 0) {
			return "公告删除成功！";
		} else {
			return "删除异常，请查看日志！";
		}
	}

}
