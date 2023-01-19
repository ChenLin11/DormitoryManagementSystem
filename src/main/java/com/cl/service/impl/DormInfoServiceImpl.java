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
import com.cl.entity.DormInfoEntity;
import com.cl.service.DormInfoService;
import com.cl.entity.vo.SushexinxiVO;
import com.cl.entity.view.DormInfoView;

@Service("sushexinxiService")
public class DormInfoServiceImpl extends ServiceImpl<SushexinxiDao, DormInfoEntity> implements DormInfoService {
	

    public PageUtils queryPage(Map<String, Object> params) {
        Page<DormInfoEntity> page = this.selectPage(
                new Query<DormInfoEntity>(params).getPage(),
                new EntityWrapper<DormInfoEntity>()
        );
        return new PageUtils(page);
    }

	public PageUtils queryPage(Map<String, Object> params, Wrapper<DormInfoEntity> wrapper) {
		  Page<DormInfoView> page =new Query<DormInfoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

	public List<SushexinxiVO> selectListVO(Wrapper<DormInfoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}

	public SushexinxiVO selectVO(Wrapper<DormInfoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}

	public List<DormInfoView> selectListView(Wrapper<DormInfoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	public DormInfoView selectView(Wrapper<DormInfoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
