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
import com.cl.entity.VisitorInfoEntity;
import com.cl.service.FangkexinxiService;
import com.cl.entity.vo.VisitorInfoVO;
import com.cl.entity.view.VisitorInfoView;

@Service("fangkexinxiService")
public class FangkexinxiServiceImpl extends ServiceImpl<FangkexinxiDao, VisitorInfoEntity> implements FangkexinxiService {
	

    public PageUtils queryPage(Map<String, Object> params) {
        Page<VisitorInfoEntity> page = this.selectPage(
                new Query<VisitorInfoEntity>(params).getPage(),
                new EntityWrapper<VisitorInfoEntity>()
        );
        return new PageUtils(page);
    }

	public PageUtils queryPage(Map<String, Object> params, Wrapper<VisitorInfoEntity> wrapper) {
		  Page<VisitorInfoView> page =new Query<VisitorInfoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

	public List<VisitorInfoVO> selectListVO(Wrapper<VisitorInfoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}

	public VisitorInfoVO selectVO(Wrapper<VisitorInfoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}

	public List<VisitorInfoView> selectListView(Wrapper<VisitorInfoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	public VisitorInfoView selectView(Wrapper<VisitorInfoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
