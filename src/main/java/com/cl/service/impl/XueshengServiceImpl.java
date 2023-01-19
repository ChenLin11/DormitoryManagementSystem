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


import com.cl.dao.XueshengDao;
import com.cl.entity.XueshengEntity;
import com.cl.service.XueshengService;
import com.cl.entity.vo.XueshengVO;
import com.cl.entity.view.XueshengView;

@Service("xueshengService")
public class XueshengServiceImpl extends ServiceImpl<XueshengDao, XueshengEntity> implements XueshengService {
	

    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueshengEntity> page = this.selectPage(
                new Query<XueshengEntity>(params).getPage(),
                new EntityWrapper<XueshengEntity>()
        );
        return new PageUtils(page);
    }

	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueshengEntity> wrapper) {
		  Page<XueshengView> page =new Query<XueshengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

	public List<XueshengVO> selectListVO(Wrapper<XueshengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}

	public XueshengVO selectVO(Wrapper<XueshengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}

	public List<XueshengView> selectListView(Wrapper<XueshengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	public XueshengView selectView(Wrapper<XueshengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
