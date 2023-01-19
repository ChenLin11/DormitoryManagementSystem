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


import com.cl.dao.ForumDao;
import com.cl.entity.PostEntity;
import com.cl.service.ForumService;
import com.cl.entity.vo.ForumVO;
import com.cl.entity.view.PostView;

@Service("forumService")
public class ForumServiceImpl extends ServiceImpl<ForumDao, PostEntity> implements ForumService {
	

    public PageUtils queryPage(Map<String, Object> params) {
        Page<PostEntity> page = this.selectPage(
                new Query<PostEntity>(params).getPage(),
                new EntityWrapper<PostEntity>()
        );
        return new PageUtils(page);
    }

	public PageUtils queryPage(Map<String, Object> params, Wrapper<PostEntity> wrapper) {
		  Page<PostView> page =new Query<PostView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

	public List<ForumVO> selectListVO(Wrapper<PostEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}

	public ForumVO selectVO(Wrapper<PostEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}

	public List<PostView> selectListView(Wrapper<PostEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	public PostView selectView(Wrapper<PostEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
