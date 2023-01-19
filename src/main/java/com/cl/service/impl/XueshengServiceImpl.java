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
import com.cl.entity.Student;
import com.cl.service.XueshengService;
import com.cl.entity.vo.XueshengVO;
import com.cl.entity.view.XueshengView;

@Service("xueshengService")
public class XueshengServiceImpl extends ServiceImpl<XueshengDao, Student> implements XueshengService {
	

    public PageUtils queryPage(Map<String, Object> params) {
        Page<Student> page = this.selectPage(
                new Query<Student>(params).getPage(),
                new EntityWrapper<Student>()
        );
        return new PageUtils(page);
    }

	public PageUtils queryPage(Map<String, Object> params, Wrapper<Student> wrapper) {
		  Page<XueshengView> page =new Query<XueshengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

	public List<XueshengVO> selectListVO(Wrapper<Student> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}

	public XueshengVO selectVO(Wrapper<Student> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}

	public List<XueshengView> selectListView(Wrapper<Student> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	public XueshengView selectView(Wrapper<Student> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
