
package com.cl.service.impl;


import java.util.Map;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cl.dao.ConfigDao;
import com.cl.entity.ConfigEntity;
import com.cl.entity.UserEntity;
import com.cl.service.ConfigService;
import com.cl.utils.PageUtils;
import com.cl.utils.Query;


/**
 * 系统用户
 */
@Service("configService")
public class ConfigServiceImpl extends ServiceImpl<ConfigDao, ConfigEntity> implements ConfigService {

	public PageUtils queryPage(Map<String, Object> params) {
		Page<ConfigEntity> page = this.selectPage(
                new Query<ConfigEntity>(params).getPage(),
                new EntityWrapper<ConfigEntity>()
        );
        return new PageUtils(page);
	}
}
