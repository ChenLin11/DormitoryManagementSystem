package com.cl.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cl.utils.PageUtils;
import com.cl.utils.Query;


import com.cl.dao.ShuidianfeiDao;
import com.cl.entity.ShuidianfeiEntity;
import com.cl.service.ShuidianfeiService;
import com.cl.entity.vo.ShuidianfeiVO;
import com.cl.entity.view.ShuidianfeiView;

@Service("shuidianfeiService")
public class ShuidianfeiServiceImpl extends ServiceImpl<ShuidianfeiDao, ShuidianfeiEntity> implements ShuidianfeiService {

    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShuidianfeiEntity> page = this.selectPage(
                new Query<ShuidianfeiEntity>(params).getPage(),
                new EntityWrapper<ShuidianfeiEntity>()
        );
        return new PageUtils(page);
    }

	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShuidianfeiEntity> wrapper) {
		  Page<ShuidianfeiView> page =new Query<ShuidianfeiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

	public List<ShuidianfeiVO> selectListVO(Wrapper<ShuidianfeiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}

	public ShuidianfeiVO selectVO(Wrapper<ShuidianfeiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}

	public List<ShuidianfeiView> selectListView(Wrapper<ShuidianfeiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	public ShuidianfeiView selectView(Wrapper<ShuidianfeiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
