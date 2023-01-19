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


import com.cl.dao.SushexinxiDao;
import com.cl.entity.SushexinxiEntity;
import com.cl.service.SushexinxiService;
import com.cl.entity.vo.SushexinxiVO;
import com.cl.entity.view.SushexinxiView;

@Service("sushexinxiService")
public class SushexinxiServiceImpl extends ServiceImpl<SushexinxiDao, SushexinxiEntity> implements SushexinxiService {
	

    public PageUtils queryPage(Map<String, Object> params) {
        Page<SushexinxiEntity> page = this.selectPage(
                new Query<SushexinxiEntity>(params).getPage(),
                new EntityWrapper<SushexinxiEntity>()
        );
        return new PageUtils(page);
    }

	public PageUtils queryPage(Map<String, Object> params, Wrapper<SushexinxiEntity> wrapper) {
		  Page<SushexinxiView> page =new Query<SushexinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

	public List<SushexinxiVO> selectListVO(Wrapper<SushexinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}

	public SushexinxiVO selectVO(Wrapper<SushexinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}

	public List<SushexinxiView> selectListView(Wrapper<SushexinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	public SushexinxiView selectView(Wrapper<SushexinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
