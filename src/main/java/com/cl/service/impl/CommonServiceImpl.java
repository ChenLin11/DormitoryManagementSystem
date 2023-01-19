
package com.cl.service.impl;


import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cl.entity.ChatEntity;
import com.cl.mapper.ChatMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cl.dao.CommonDao;
import com.cl.service.CommonService;


/**
 * 系统用户
 */
@Service("commonService")
public class CommonServiceImpl implements ServiceImpl<CommonMapper, ChatEntity> implements CommonService{

	@Autowired
	private CommonDao commonDao;


	public List<String> getOption(Map<String, Object> params) {
		return commonDao.getOption(params);
	}

	public Map<String, Object> getFollowByOption(Map<String, Object> params) {
		return commonDao.getFollowByOption(params);
	}

	public void sh(Map<String, Object> params) {
		commonDao.sh(params); 
	}

	public int remindCount(Map<String, Object> params) {
		return commonDao.remindCount(params);
	}

	public Map<String, Object> selectCal(Map<String, Object> params) {
		return commonDao.selectCal(params);
	}

	public List<Map<String, Object>> selectGroup(Map<String, Object> params) {
		return commonDao.selectGroup(params);
	}

	public List<Map<String, Object>> selectValue(Map<String, Object> params) {
		return commonDao.selectValue(params);
	}

}
