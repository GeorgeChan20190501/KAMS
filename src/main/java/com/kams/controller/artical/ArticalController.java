package com.kams.controller.artical;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONArray;
import com.kams.bean.SmComments;
import com.kams.bean.SmGonggao;
import com.kams.bean.SmUseraction;
import com.kams.bean.common.JsonReqObject;
import com.kams.service.ArticalService;

@RestController
public class ArticalController {

	@Autowired
	private ArticalService articalService;

	@PostMapping("/deployComm")
	public String deployComm(@RequestBody String param) {
		System.out.println("参数===" + param);
		JsonReqObject jsonReqObject = JSONArray.parseObject(param, JsonReqObject.class);
		String obj = jsonReqObject.getMsg();
		SmComments smComments = JSONArray.parseObject(obj, SmComments.class);
		int a = articalService.deployComm(smComments);
		if (a > 0) {
			return "评论发布成功";
		} else {
			return "评论发布异常，请查看日志！";
		}
	}

	@PostMapping("/getComms")
	public Map<String, Object> getComms(@RequestBody String param) throws UnsupportedEncodingException {
		System.out.println("参数===" + param);
		JsonReqObject jsonReqObject = JSONArray.parseObject(param, JsonReqObject.class);
		String obj = jsonReqObject.getMsg();
		SmComments smComments = JSONArray.parseObject(obj, SmComments.class);
		List<SmComments> list = articalService.getComms(smComments);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("list", list);
		return map;

	}

	@PostMapping("/addView")
	public String addView(@RequestBody String param) {
		System.out.println("参数===" + param);
		JsonReqObject jsonReqObject = JSONArray.parseObject(param, JsonReqObject.class);
		String obj = jsonReqObject.getMsg();
		SmUseraction smUseraction = JSONArray.parseObject(obj, SmUseraction.class);
		int a = articalService.addView(smUseraction);
		if (a > 0) {
			return "阅读+1";
		}
		return "阅读+0";
	}

	@PostMapping("/addFavo")
	public String addFavo(@RequestBody String param) {
		System.out.println("参数===" + param);
		JsonReqObject jsonReqObject = JSONArray.parseObject(param, JsonReqObject.class);
		String id = jsonReqObject.getMsg();
		int count = Integer.parseInt(jsonReqObject.getMsg1());
		String reader = jsonReqObject.getMsg2();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		map.put("count", count);
		map.put("reader", reader);
		int a = articalService.addFavo(map);
		if (a > 0) {
			return "点赞成功";
		}
		return "点赞+0";
	}

	@PostMapping("/getIsDZ")
	public String getIsDZ(@RequestBody String param) {
		System.out.println("参数===" + param);
		JsonReqObject jsonReqObject = JSONArray.parseObject(param, JsonReqObject.class);
		String id = jsonReqObject.getMsg();
		String reader = jsonReqObject.getMsg2();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		map.put("reader", reader);
		SmUseraction smUseraction = articalService.getgetIsDZ(map);
		if (smUseraction == null) {
			return "-1";
		}
		String num = smUseraction.getDianz();
		return num;
	}

	@PostMapping("/getHotAatical")
	public Map<String, Object> getHotAatical(@RequestBody String param) {
		List<SmGonggao> list = articalService.getHotAatical();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("list", list);
		return map;

	}

	@PostMapping("/searchFunc")
	public Map<String, Object> searchFunc(@RequestBody String param) {

		System.out.println("参数===" + param);
		JsonReqObject jsonReqObject = JSONArray.parseObject(param, JsonReqObject.class);
		String key = jsonReqObject.getMsg();

		List<SmGonggao> list = articalService.searchFunc(key);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("list", list);
		return map;

	}

	@PostMapping("/searchArtByType")
	public Map<String, Object> searchArtByType(@RequestBody String param) {
		System.out.println("参数===" + param);
		JsonReqObject jsonReqObject = JSONArray.parseObject(param, JsonReqObject.class);
		String key = jsonReqObject.getMsg();

		List<SmGonggao> list = articalService.searchArtByType(key);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("list", list);
		return map;

	}

	@PostMapping("/jiajing")
	public String jiajing(@RequestBody String param) {
		System.out.println("参数===" + param);
		JsonReqObject jsonReqObject = JSONArray.parseObject(param, JsonReqObject.class);
		String id = jsonReqObject.getMsg();

		int a = articalService.jiajing(id);
		if (a > 0) {
			return "加精成功！";
		}
		return "加精异常！";

	}

	@PostMapping("/delComm")
	public String delComm(@RequestBody String param) {
		System.out.println("参数===" + param);
		JsonReqObject jsonReqObject = JSONArray.parseObject(param, JsonReqObject.class);
		String id = jsonReqObject.getMsg();

		int a = articalService.delComm(id);
		if (a > 0) {
			return "删除成功！";
		}
		return "删除异常！";

	}

	@PostMapping("/updateA")
	public String updateA(@RequestBody String param) {
		System.out.println("参数===" + param);
		JsonReqObject jsonReqObject = JSONArray.parseObject(param, JsonReqObject.class);
		String obj = jsonReqObject.getMsg();
		SmGonggao smGonggao = JSONArray.parseObject(obj, SmGonggao.class);

		int a = articalService.updateA(smGonggao);
		if (a > 0) {
			return "修改成功！";
		}
		return "修改异常！";

	}

}
