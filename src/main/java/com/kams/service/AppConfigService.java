package com.kams.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kams.bean.SmApplist;
import com.kams.bean.SmConfig;
import com.kams.bean.SmDakarecord;
import com.kams.bean.SmGonggao;
import com.kams.bean.SmResult;
import com.kams.bean.SysUser;
import com.kams.bean.SysUserExample;
import com.kams.bean.SysUserExample.Criteria;
import com.kams.common.utils.DateFormatUtils;
import com.kams.dao.SmApplistMapper;
import com.kams.dao.SmConfigMapper;
import com.kams.dao.SmDakarecordMapper;
import com.kams.dao.SmGonggaoMapper;
import com.kams.dao.SmResultMapper;
import com.kams.dao.SysUserMapper;

@Service
@Transactional
public class AppConfigService {

	private static Logger logger = LoggerFactory.getLogger(AppConfigService.class);
	@Autowired
	private SmApplistMapper smApplistMapper;

	@Autowired
	private SmResultMapper smResultMapper;

	@Autowired
	private SmConfigMapper smConfigMapper;
	@Autowired
	private SmDakarecordMapper smDakarecordMapper;

	@Autowired
	private ServiceMonitorService serviceMonitorService;
	@Autowired
	private SysUserMapper sysUserMapper;
	@Autowired
	private SmGonggaoMapper smGonggaoMapper;
	/**
	 * 根据用户查询菜单列表
	 * 
	 * @param username
	 * @return
	 */
	/*
	 * public List<SysMenu> getUserMenu(String username){ List<SysMenu>
	 * list=smApplistMapper.getUserMenu(username); return list; }
	 * 
	 *//**
		 * 查询所有有效菜单（页面默认加载）
		 * 
		 * @return
		 */

	/*
	 * public List<SysMenu> getAllMenu(){ SysMenuExample sysMenuExample =new
	 * SysMenuExample(); SysMenuExample.Criteria
	 * criteria=sysMenuExample.createCriteria();
	 * criteria.andIsDeletedEqualTo("0");//标志：1删除 0 未删除 List<SysMenu>
	 * list=smApplistMapper.selectByExample(sysMenuExample); return list; }
	 * 
	 * 
	 *//**
		 * 根据参数查询菜单
		 * 
		 * @param menu
		 * @return
		 *//*
			 * public List<SysMenu> getMenu(SysMenu menu){ SysMenuExample example=new
			 * SysMenuExample(); SysMenuExample.Criteria criteria=example.createCriteria();
			 * String nodecode=menu.getNodeCode(); String nodename=menu.getNodeName();
			 * String isdeleted=menu.getIsDeleted(); if (!"".equals(nodecode)){
			 * criteria.andNodeCodeEqualTo(nodecode); } if (!"".equals(nodename)){
			 * criteria.andNodeNameEqualTo(nodename); } if (!"".equals(isdeleted)){
			 * criteria.andIsDeletedEqualTo(isdeleted); } List<SysMenu>
			 * SysMenuList=smApplistMapper.selectByExample(example);
			 * 
			 * return SysMenuList; }
			 * 
			 * public int insertMenu(SysMenu newMenu){ int
			 * result=smApplistMapper.insert(newMenu); return result; }
			 * 
			 * public int deteteMenu(String nodecode){ SysMenuExample example=new
			 * SysMenuExample(); SysMenuExample.Criteria criteria=example.createCriteria();
			 * criteria.andNodeCodeEqualTo(nodecode); int
			 * result=smApplistMapper.deleteByExample(example); return result; }
			 * 
			 * 
			 * public int updateMenu(SysMenu menu){ SysMenuExample example=new
			 * SysMenuExample(); SysMenuExample.Criteria
			 * criteria=example.createCriteria();//创建更新的条件
			 * criteria.andNodeCodeEqualTo(menu.getNodeCode()); int
			 * result=smApplistMapper.updateByExample(menu,example); return result; }
			 * 
			 * public List<SysMenu> queryMenu(SysMenu sysMenu) { List<SysMenu>
			 * list=smApplistMapper.queryMenu(sysMenu); return list; }
			 * 
			 * public int addMenu (SysMenu sysMenu) { int result =
			 * smApplistMapper.addMenu(sysMenu); return result;
			 * 
			 * }
			 * 
			 * public void deleteMenu(List<String> list) { smApplistMapper.deleteMenu(list);
			 * }
			 * 
			 * public void updateMenu(List<SysMenu> list) {
			 * smApplistMapper.updateMenu(list); }
			 */
	public List<SmApplist> queryAppConfig(SmApplist smApplist) {
		return smApplistMapper.queryAppConfig(smApplist);
	}

	public void addConfig(SmApplist smApplist) {

		smApplistMapper.addConfig(smApplist);
	}

	public void updateConfig(List<SmApplist> list) {
		smApplistMapper.updateConfig(list);

	}

	public void deleteConfig(String id) {
		smApplistMapper.deleteByPrimaryKey(Integer.parseInt(id));

	}

	public List<SmResult> queryAppHealth(SmResult smResultlist) {

		return smResultMapper.queryAppHealth(smResultlist);
	}

	public List<SmConfig> getZhiRi() {

		return smConfigMapper.getZhiRi();
	}

	public String getCurrentStep() {
		// TODO Auto-generated method stub
		return smDakarecordMapper.getCurrentStep();
	}

	public void setStep(SmDakarecord smDakarecord) {
		smDakarecordMapper.setStep(smDakarecord);

	}

	@Transactional(rollbackFor = Exception.class)
	public String emailNotify(String nextUser, String currentUser) {
		// 先判断该人员今天发邮件的次数【距离上次邮件发送超过2小时，允许再次发送】
		try {

			List<SmConfig> list1 = smConfigMapper.getCount();

			String lastTime = list1.get(0).getCreateTime();
			String now = DateFormatUtils.getSTDCNDate();
			int count = Integer.parseInt(list1.get(0).getCval1());
			String diffString = DateFormatUtils.dateDiff(lastTime, now);
			logger.info("距离上次邮件时间是：" + diffString + "分钟");
			int diff = Integer.parseInt(diffString);
			if (diff <= 120 && count > 0) {
				logger.info("距离上次邮件时间不足2小时，不发送邮件！");
				return "2";
			}
			SysUserExample sysUserExample = new SysUserExample();
			Criteria criteria = sysUserExample.createCriteria();
			List<String> userlist = new ArrayList<String>();
			userlist.add(nextUser);
			userlist.add(currentUser);
			criteria.andAccountIn(userlist);
			List<SysUser> nextList = sysUserMapper.selectByExample(sysUserExample);
			String toUser = nextList.get(0).getMail() + "," + nextList.get(1).getMail();
			logger.info("即将通知：" + toUser);
			List<SmConfig> cclist = serviceMonitorService.getEmailConfigInfo();
			String ccUser = "";
			for (SmConfig smConfig : cclist) {
				if (smConfig.getCkey().equals("ccUser")) {
					ccUser = smConfig.getCval4();
				}
			}

			if (toUser.contains("george") && toUser.contains("kevin")) {
				ccUser = "327052186@qq.com";
			} else if (toUser.contains("kevin")) {
				ccUser = "george.chan@metlife.com,327052186@qq.com";
			} else if (toUser.contains("george")) {
				ccUser = "kevin.li@metlife.com,327052186@qq.com";
			}
			serviceMonitorService.sendEmail(toUser, ccUser, "INC监控轮值", "Hi " + nextUser
					+ ",<p/>&nbsp;&nbsp;下一个工作日INC监控轮值到你啦！请今天务必到AMS运维管理系统中进行打卡响应，申明你已知晓。地址：http://10.164.25.148:9082/ &nbsp;&nbsp;<p/><p/>AMS运维团队");

			// 说明已经发送邮件了；
			SmConfig smConfig = new SmConfig();
			smConfig.setCreateTime(now);
			smConfig.setCval1((count + 1) + "");
			smConfigMapper.setCount(smConfig);

			return "1";
		} catch (Exception e) {
			return "3";
		}
	}

	@Transactional(rollbackFor = Exception.class)
	public void resetDaka() {
		// 重置前先要判断下一个人是否已经响应
		String step = smDakarecordMapper.getCurrentStep();
		int count = Integer.parseInt(step); // 发邮件的次数。
		if (count != 3) {
			logger.info("下一人未响应，不重置打卡人");
			// System.out.println("下一人未响应，不重置打卡人");
			return;
		}
		smDakarecordMapper.resetDaka();
	}

	public List<SmGonggao> fenyeQueryGongGao() {
		return smGonggaoMapper.fenyeQueryGongGao();
	}

	public int addGongGao(SmGonggao smGonggao) {
		int rows = smGonggaoMapper.addGongGao(smGonggao);
		return rows;
	}

	public int delGongGao(String id) {
		int rows = smGonggaoMapper.deleteByPrimaryKey(Integer.parseInt(id));
		return rows;
	}

}
