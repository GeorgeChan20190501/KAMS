package com.kams.controller.appconfig;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.fastjson.JSONArray;
import com.kams.bean.SmApplist;
import com.kams.bean.SmResult;
import com.kams.bean.common.JsonReqObject;
import com.kams.service.AppConfigService;

@RestController
public class AppConfigController {

	@Autowired
	private AppConfigService appConfigService;

	/*
	 * @PostMapping("/queryMenu") public List<SmApplist> queryMenu(@RequestBody
	 * String param) { System.out.println("查询菜单参数===" + param); JsonReqObject
	 * jsonReqObject = JSONArray.parseObject(param, JsonReqObject.class); String
	 * jsonParam=jsonReqObject.getMsg(); System.out.println(jsonParam); SmApplist
	 * SmApplist = JSONArray.parseObject(jsonParam, SmApplist.class); // 查询菜单
	 * List<SmApplist> menulist = appConfigService.queryMenu(SmApplist);
	 * System.out.println("查询菜单个数===" + menulist.size()); return menulist; }
	 * 
	 * @PutMapping("/addMenu") public String addMenu(@RequestBody String param) {
	 * System.out.println("查询菜单参数===" + param); JsonReqObject jsonReqObject =
	 * JSONArray.parseObject(param, JsonReqObject.class); String
	 * jsonParam=jsonReqObject.getMsg(); System.out.println(jsonParam); SmApplist
	 * SmApplist = JSONArray.parseObject(jsonParam, SmApplist.class); // 查询菜单 try {
	 * appConfigService.addMenu(SmApplist); } catch (Exception e) { return "操作异常"; }
	 * return "菜单添加成功"; }
	 * 
	 * @DeleteMapping("/deleteMenu") public String deleteMenu(@RequestBody String
	 * param) { System.out.println("删除菜单参数===" + param); JsonReqObject jsonReqObject
	 * = JSONArray.parseObject(param, JsonReqObject.class); String
	 * jsonParam=jsonReqObject.getMsg(); //字符数组 System.out.println(jsonParam);
	 * String ids [] =jsonParam.replace("[", "").replace("]", "").split(",");
	 * List<String> list = new ArrayList<String>(); for (String id : ids) {
	 * list.add(id); } // 查询菜单 System.out.println(list); try {
	 * appConfigService.deleteMenu(list); } catch (Exception e) { return "操作异常"; }
	 * return "菜单删除成功"; }
	 * 
	 * @PostMapping("/updateMenu") public String updateMenu(@RequestBody String
	 * param) { JsonReqObject jsonReqObject = JSONArray.parseObject(param,
	 * JsonReqObject.class); String jsonParam=jsonReqObject.getMsg(); //对象形式字符数组
	 * System.out.println("修改菜单参数===" +jsonParam); String configs []
	 * =jsonReqObject.getMsg().replace("\\", "").replace("}\",",
	 * "}\";").replace("[\"", "").replace("\"]", "").split("\";\""); List<SmApplist>
	 * list = new ArrayList<SmApplist>(); SmApplist SmApplist ; for (String menu :
	 * configs) { SmApplist= JSONArray.parseObject(menu, SmApplist.class);
	 * list.add(SmApplist); } try { appConfigService.updateMenu(list); } catch
	 * (Exception e) { return "操作异常"; } return "菜单更新成功"; }
	 */

	@DeleteMapping("/deleteConfig")
	public String deleteConfig(@RequestBody String param) {
		System.out.println("删除配置参数===" + param);
		JsonReqObject jsonReqObject = JSONArray.parseObject(param, JsonReqObject.class);
		String id = jsonReqObject.getMsg(); // 字符数组
		 
		System.out.println(id);
		try {
			appConfigService.deleteConfig(id);
		} catch (Exception e) {
			return "操作异常";
		}
		return "配置删除成功";
	}

	@PostMapping("/updateConfig")
	public String updateConfig(@RequestBody String param) {
		JsonReqObject jsonReqObject = JSONArray.parseObject(param, JsonReqObject.class);
		String jsonParam = jsonReqObject.getMsg();
		System.out.println("修改配置参数===" + jsonParam);
		String configs[] = jsonReqObject.getMsg().replace("\\", "").replace("}\",", "}\";").replace("[\"", "")
				.replace("\"]", "").split("\";\"");
		List<SmApplist> list = new ArrayList<SmApplist>();
		SmApplist SmApplist;
		for (String menu : configs) {
			SmApplist = JSONArray.parseObject(menu, SmApplist.class);
			list.add(SmApplist);
		}
		try {
			appConfigService.updateConfig(list);
		} catch (Exception e) {
			e.printStackTrace();
			return "操作异常";
		}
		return "配置更新成功";
	}

	@PutMapping("/addConfig")
	public String addConfig(@RequestBody String param) {
		System.out.println("查询菜单参数===" + param);
		JsonReqObject jsonReqObject = JSONArray.parseObject(param, JsonReqObject.class);
		String jsonParam = jsonReqObject.getMsg();
		System.out.println(jsonParam);
		SmApplist smApplist = JSONArray.parseObject(jsonParam, SmApplist.class); // 查询菜单
		try {
			appConfigService.addConfig(smApplist);
		} catch (

		Exception e) {
			return "操作异常";
		}
		return "菜单添加成功";
	}

	@PostMapping("/fenyeQueryConfig")
	public Map<String, Object> fenyeQueryConfig(@RequestBody String param) {
		System.out.println("分页查询参数===" + param);
		JsonReqObject jsonReqObject = JSONArray.parseObject(param, JsonReqObject.class);
		String jsonParam = jsonReqObject.getMsg();
 
		  
		SmApplist smApplist = JSONArray.parseObject(jsonParam, SmApplist.class);
		// 查询配置
		List<SmApplist> list = appConfigService.queryAppConfig(smApplist);

		// 上述拿到完整list，现在进行分页返回当前页面数据。
		System.out.println("总条数为===" + list.size());
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("list", list);
		return map;
	}
	
	@PostMapping("/fenyeQueryHealth")
	public Map<String, Object> fenyeQueryHealth(@RequestBody String param) {
		System.out.println("分页查询参数===" + param);
		JsonReqObject jsonReqObject = JSONArray.parseObject(param, JsonReqObject.class);
		String jsonParam = jsonReqObject.getMsg();
		SmResult smResultlist = JSONArray.parseObject(jsonParam, SmResult.class);
		// 查询配置
		List<SmResult> list = appConfigService.queryAppHealth(smResultlist);
		// 上述拿到完整list，现在进行分页返回当前页面数据。
		System.out.println("总条数为===" + list.size());
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("list", list);
		return map;
	}

}
