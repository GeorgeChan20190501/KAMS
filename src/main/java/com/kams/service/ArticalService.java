package com.kams.service;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kams.bean.SmComments;
import com.kams.bean.SmGonggao;
import com.kams.bean.SmUseraction;
import com.kams.common.utils.DateFormatUtils;
import com.kams.dao.SmCommentsMapper;
import com.kams.dao.SmGonggaoMapper;
import com.kams.dao.SmUseractionMapper;

@Service
@Transactional
public class ArticalService {

	private static Logger logger = LoggerFactory.getLogger(ArticalService.class);

	@Autowired
	private SmCommentsMapper smCommentsMapper;
	@Autowired
	private SmUseractionMapper smUseractionMapper;
	@Autowired
	private SmGonggaoMapper smGonggaoMapper;

	public int deployComm(SmComments smComments) {
		return smCommentsMapper.deployComm(smComments);
	}

	public List<SmComments> getComms(SmComments smComments) {
		return smCommentsMapper.getComms(smComments);
	}

	public int addView(SmUseraction smUseraction) {
		// 判读之前是否已经打开过，如果读者距离上次阅读时间超过6小时可重新刷查看量。
		SmUseraction smUseraction1 = smUseractionMapper.isRepeatView(smUseraction);
		if (smUseraction1 == null) {
			// 第一次看文章，创建记录。
			smUseractionMapper.newView(smUseraction);
		} else {
			String lastTime = smUseraction1.getUpdateTime();
			String now = DateFormatUtils.getSTDCNDate();
			String diffString = DateFormatUtils.dateDiff(lastTime, now);
			logger.info("距离上次查阅是：" + diffString + "分钟");
			int diff = Integer.parseInt(diffString);
			if (diff < 480) {
				logger.info("距离上次查阅时间不足6小时，不累加时间！");
				return -1;
			}
		}
		return smCommentsMapper.addView(smUseraction);
	}

	public int addFavo(Map<String, Object> map) {
		return smCommentsMapper.addFavo(map);
	}

	public SmUseraction getgetIsDZ(Map<String, Object> map) {
		return smUseractionMapper.getgetIsDZ(map);
	}

	public List<SmGonggao> getHotAatical() {
		return smGonggaoMapper.getHotAatical();
	}

	public List<SmGonggao> searchFunc(String key) {
		return smGonggaoMapper.searchFunc(key);
	}

	public List<SmGonggao> searchArtByType(String key) {
		return smGonggaoMapper.searchArtByType(key);
	}

	public int jiajing(String id) {
		return smGonggaoMapper.jiajing(Integer.parseInt(id));
	}

	public int delComm(String id) {
		return smCommentsMapper.delComm(Integer.parseInt(id));
	}

	public int updateA(SmGonggao smGonggao) {
		return smGonggaoMapper.updateA(smGonggao);
	}

}
