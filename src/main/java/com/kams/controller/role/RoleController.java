package com.kams.controller.role;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.fastjson.JSONArray;
import com.kams.bean.SysMenu;
import com.kams.bean.SysRole;
import com.kams.bean.SysRoleMenu;
import com.kams.bean.common.JsonReqObject;
import com.kams.service.RoleService;

@RestController
public class RoleController {

	@Autowired
	private RoleService roleService;

	@PutMapping("/addRole")
	public String addRole(@RequestBody String param) {
		System.out.println("添加角色参数===" + param);
		JsonReqObject jsonReqObject = JSONArray.parseObject(param, JsonReqObject.class);
		String jsonParam = jsonReqObject.getMsg();
		System.out.println(jsonParam);
		SysRole sysRole = JSONArray.parseObject(jsonParam, SysRole.class);
		// 查询菜单
		try {
			roleService.addRole(sysRole);
		} catch (Exception e) {
			return "操作异常";
		}
		return "角色添加成功";
	}

	@DeleteMapping("/deleteRole")
	public String deleteRole(@RequestBody String param) {
		System.out.println("删除角色参数===" + param);
		JsonReqObject jsonReqObject = JSONArray.parseObject(param, JsonReqObject.class);
		String jsonParam = jsonReqObject.getMsg();
		String ids[] = jsonParam.replace("[", "").replace("]", "").split(",");
		List<String> list = new ArrayList<String>();
		for (String id : ids) {
			list.add(id);
		}
		System.out.println(list);
		try {
			roleService.deleteRole(list);
		} catch (

		Exception e) {
			return "操作异常";
		}
		return "角色删除成功";
	}

	@PostMapping("/updateRole")
	public String updateRole(@RequestBody String param) {
		JsonReqObject jsonReqObject = JSONArray.parseObject(param, JsonReqObject.class);
		String jsonParam = jsonReqObject.getMsg();
		System.out.println("修改角色参数===" + jsonParam);
		String Roles[] = jsonReqObject.getMsg().replace("\\", "").replace("}\",", "}\";").replace("[\"", "")
				.replace("\"]", "").split("\";\"");
		List<SysRole> list = new ArrayList<SysRole>();
		SysRole sysRole;
		for (String Role : Roles) {
			sysRole = JSONArray.parseObject(Role, SysRole.class);
			list.add(sysRole);
		}
		try {
			roleService.updateRole(list);
		} catch (Exception e) {
			return "操作异常";
		}
		return "角色更新成功";
	}


	@PostMapping("/fenyeQueryRole")
	public Map<String, Object> fenyeQueryRole(@RequestBody String param) {
		System.out.println("角色分页查询参数===" + param);
		JsonReqObject jsonReqObject = JSONArray.parseObject(param, JsonReqObject.class);
		String jsonParam = jsonReqObject.getMsg();
		SysRole sysRole = JSONArray.parseObject(jsonParam, SysRole.class); // 查询菜单
		List<SysRole> list = roleService.queryRole(sysRole);

		// 上述拿到完整list，现在进行分页返回当前页面数据。 System.out.println("总条数为===" + Rolelist.size());
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("list", list);
		return map;
	}
	
	@PostMapping("/roleGrant")
	public String roleGrant(@RequestBody String param) {
		JsonReqObject jsonReqObject = JSONArray.parseObject(param, JsonReqObject.class);
		String jsonParam = jsonReqObject.getMsg();
		System.out.println(jsonParam);
		String Roles[] = jsonParam.replace("[", "").replace("]", "").replace("},{", "};{").split(";");
		System.out.println(Roles[0]);
		List<SysRoleMenu>  list =new ArrayList<SysRoleMenu>(); 
		SysRoleMenu sysRoleMenu;
		for (String Role : Roles) {
			sysRoleMenu = JSONArray.parseObject(Role, SysRoleMenu.class);
			list.add(sysRoleMenu);
		}

		try {
			String roleId=list.get(0).getRoleCode();
			roleService.deleteUserRole(roleId);
			roleService.roleGrant(list);
		} catch (Exception e) {
			return "操作异常";
		}
		return "角色授权成功";
	}
	
	
	@PostMapping("/queryRightByRole")
	public Map<String, Object> queryRightByRole(@RequestBody String param) {  
	 
		System.out.println("queryRightByRole=====" + param);
		JsonReqObject jsonReqObject = JSONArray.parseObject(param, JsonReqObject.class);
		String roleId = jsonReqObject.getMsg();
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			List<SysMenu> menulist=roleService.queryRightByRole(roleId);
			map.put("list", menulist);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return map;
	}
	

}
