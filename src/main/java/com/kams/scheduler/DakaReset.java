package com.kams.scheduler;

import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kams.service.AppConfigService;

@Component
public class DakaReset {

	@Autowired
	private AppConfigService appConfigService;

	static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	public void run() {
		System.out.println("重置打卡情况");
		appConfigService.resetDaka();
		System.out.println("重置完成！");
	}

	public static void main(String[] args) throws Exception {
		new DakaReset().run();
	}
}
