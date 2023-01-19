
package com.cl.service.impl;


import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cl.dao.UserDao;
import com.cl.entity.UserEntity;
import com.cl.service.UserService;
import com.cl.utils.PageUtils;
import com.cl.utils.Query;


/**
 * 系统用户
 */
@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserDao, UserEntity> implements UserService {

	public PageUtils queryPage(Map<String, Object> params) {
		Page<UserEntity> page = this.selectPage(
                new Query<UserEntity>(params).getPage(),
                new EntityWrapper<UserEntity>()
        );
        return new PageUtils(page);
	}

	public List<UserEntity> selectListView(Wrapper<UserEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	public PageUtils queryPage(Map<String, Object> params,
			Wrapper<UserEntity> wrapper) {
		 Page<UserEntity> page =new Query<UserEntity>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
	}
}
