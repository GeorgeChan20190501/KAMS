package com.kams.service;

import java.util.List;

import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.kams.bean.SmApplist;
import com.kams.bean.SmConfig;
import com.kams.bean.SmResult;
import com.kams.dao.SmApplistMapper;
import com.kams.dao.SmConfigMapper;
import com.kams.dao.SmResultMapper;

@Service
public class ServiceMonitorService {
	@Autowired
	private JavaMailSender javaMailSender;
	@Autowired
	private SmConfigMapper smConfigMapper;
	@Autowired
	private SmApplistMapper smApplistMapper;
	@Autowired
	private SmResultMapper smResultMapper;
	@Value("${spring.mail.username}")
	private String from;

	@SuppressWarnings("static-access")
	public void sendEmail(String toUser, String ccUser, String subject, String content) {
		MimeMessage mimeMessage = javaMailSender.createMimeMessage();
		try {

			MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
			InternetAddress[] internetAddressTo = new InternetAddress().parse(toUser);
			InternetAddress[] internetAddressCC = new InternetAddress().parse(ccUser);
			helper.setFrom(from);
			helper.setTo(internetAddressTo);
			helper.setCc(internetAddressCC);
			helper.setSubject(subject);
			helper.setText(content, true);
			javaMailSender.send(mimeMessage);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<SmApplist> getAppList() {
		List<SmApplist> list = smApplistMapper.selectByExample(null);
		return list;
	}

	public void saveResult(SmResult smResult) {
		smResultMapper.saveResult(smResult);
	}

	public List<SmConfig> getEmailConfigInfo() {
		return smConfigMapper.getEmailConfigInfo();
	}

	public List<SmConfig> getScheduleConfigInfo() {
		List<SmConfig> list = smConfigMapper.getScheduleConfigInfo();
		return list;
	}

	public static void main(String[] args) {
		String ccUser = "george.chan@metlife.com,kevin.li@metlife.com,327052186@qq.com";
		String toUser = "chen.cao@metlife.com";
		String string = new ServiceMonitorService().getCcUser(toUser, ccUser);
		System.out.println(string);
	}

	public String getCcUser(String toUser, String ccUser) {
		int cL = ccUser.length();
		int tL = toUser.length();
		int pos = ccUser.indexOf(toUser);
		if (pos > -1) {
			int subL = pos + tL + 1; // 截取的起始位置
			if (subL >= cL) {
				ccUser = ccUser.substring(0, pos - 1);
			} else {
				ccUser = ccUser.substring(0, pos) + ccUser.substring(subL, cL);
			}
		}
		return ccUser;
	}

}
