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
import com.cl.entity.RepairEntity;
import com.cl.service.SushebaoxiuService;
import com.cl.entity.vo.SushebaoxiuVO;
import com.cl.entity.view.RepairView;

@Service("sushebaoxiuService")
public class SushebaoxiuServiceImpl extends ServiceImpl<SushebaoxiuDao, RepairEntity> implements SushebaoxiuService {
	

    public PageUtils queryPage(Map<String, Object> params) {
        Page<RepairEntity> page = this.selectPage(
                new Query<RepairEntity>(params).getPage(),
                new EntityWrapper<RepairEntity>()
        );
        return new PageUtils(page);
    }

	public PageUtils queryPage(Map<String, Object> params, Wrapper<RepairEntity> wrapper) {
		  Page<RepairView> page =new Query<RepairView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

	public List<SushebaoxiuVO> selectListVO(Wrapper<RepairEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}

	public SushebaoxiuVO selectVO(Wrapper<RepairEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}

	public List<RepairView> selectListView(Wrapper<RepairEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	public RepairView selectView(Wrapper<RepairEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
