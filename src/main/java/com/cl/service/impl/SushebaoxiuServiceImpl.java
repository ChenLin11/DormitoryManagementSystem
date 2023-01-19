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


import com.cl.dao.SushebaoxiuDao;
import com.cl.entity.SushebaoxiuEntity;
import com.cl.service.SushebaoxiuService;
import com.cl.entity.vo.SushebaoxiuVO;
import com.cl.entity.view.SushebaoxiuView;

@Service("sushebaoxiuService")
public class SushebaoxiuServiceImpl extends ServiceImpl<SushebaoxiuDao, SushebaoxiuEntity> implements SushebaoxiuService {
	

    public PageUtils queryPage(Map<String, Object> params) {
        Page<SushebaoxiuEntity> page = this.selectPage(
                new Query<SushebaoxiuEntity>(params).getPage(),
                new EntityWrapper<SushebaoxiuEntity>()
        );
        return new PageUtils(page);
    }

	public PageUtils queryPage(Map<String, Object> params, Wrapper<SushebaoxiuEntity> wrapper) {
		  Page<SushebaoxiuView> page =new Query<SushebaoxiuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

	public List<SushebaoxiuVO> selectListVO(Wrapper<SushebaoxiuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}

	public SushebaoxiuVO selectVO(Wrapper<SushebaoxiuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}

	public List<SushebaoxiuView> selectListView(Wrapper<SushebaoxiuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	public SushebaoxiuView selectView(Wrapper<SushebaoxiuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
