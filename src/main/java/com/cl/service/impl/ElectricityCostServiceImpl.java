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
import com.cl.entity.ElectricityCostEntity;
import com.cl.service.ElectricityCostService;
import com.cl.entity.vo.ShuidianfeiVO;
import com.cl.entity.view.ElectricityCostView;

@Service("shuidianfeiService")
public class ElectricityCostServiceImpl extends ServiceImpl<ShuidianfeiDao, ElectricityCostEntity> implements ElectricityCostService {

    public PageUtils queryPage(Map<String, Object> params) {
        Page<ElectricityCostEntity> page = this.selectPage(
                new Query<ElectricityCostEntity>(params).getPage(),
                new EntityWrapper<ElectricityCostEntity>()
        );
        return new PageUtils(page);
    }

	public PageUtils queryPage(Map<String, Object> params, Wrapper<ElectricityCostEntity> wrapper) {
		  Page<ElectricityCostView> page =new Query<ElectricityCostView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

	public List<ShuidianfeiVO> selectListVO(Wrapper<ElectricityCostEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}

	public ShuidianfeiVO selectVO(Wrapper<ElectricityCostEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}

	public List<ElectricityCostView> selectListView(Wrapper<ElectricityCostEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	public ElectricityCostView selectView(Wrapper<ElectricityCostEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
