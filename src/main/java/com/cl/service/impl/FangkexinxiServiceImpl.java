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


import com.cl.dao.FangkexinxiDao;
import com.cl.entity.FangkexinxiEntity;
import com.cl.service.FangkexinxiService;
import com.cl.entity.vo.FangkexinxiVO;
import com.cl.entity.view.FangkexinxiView;

@Service("fangkexinxiService")
public class FangkexinxiServiceImpl extends ServiceImpl<FangkexinxiDao, FangkexinxiEntity> implements FangkexinxiService {
	

    public PageUtils queryPage(Map<String, Object> params) {
        Page<FangkexinxiEntity> page = this.selectPage(
                new Query<FangkexinxiEntity>(params).getPage(),
                new EntityWrapper<FangkexinxiEntity>()
        );
        return new PageUtils(page);
    }

	public PageUtils queryPage(Map<String, Object> params, Wrapper<FangkexinxiEntity> wrapper) {
		  Page<FangkexinxiView> page =new Query<FangkexinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

	public List<FangkexinxiVO> selectListVO(Wrapper<FangkexinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}

	public FangkexinxiVO selectVO(Wrapper<FangkexinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}

	public List<FangkexinxiView> selectListView(Wrapper<FangkexinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	public FangkexinxiView selectView(Wrapper<FangkexinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
