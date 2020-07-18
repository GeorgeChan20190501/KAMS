package com.kams.scheduler;

import java.text.SimpleDateFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kams.service.AppConfigService;

@Component
public class DakaReset {

	@Autowired
	private AppConfigService appConfigService;

	private static Logger logger = LoggerFactory.getLogger(DakaReset.class);

	static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	public void run() {
		logger.info("重置打卡情况");
		appConfigService.resetDaka();
		logger.info("重置完成！");
	}

	public static void main(String[] args) throws Exception {
		new DakaReset().run();
	}
}
