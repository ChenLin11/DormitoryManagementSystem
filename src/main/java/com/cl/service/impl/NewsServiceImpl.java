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


import com.cl.dao.NewsDao;
import com.cl.entity.NewsEntity;
import com.cl.service.NewsService;
import com.cl.entity.vo.NewsVO;
import com.cl.entity.view.NewsView;

@Service("newsService")
public class NewsServiceImpl extends ServiceImpl<NewsDao, NewsEntity> implements NewsService {

    public PageUtils queryPage(Map<String, Object> params) {
        Page<NewsEntity> page = this.selectPage(
                new Query<NewsEntity>(params).getPage(),
                new EntityWrapper<NewsEntity>()
        );
        return new PageUtils(page);
    }

	public PageUtils queryPage(Map<String, Object> params, Wrapper<NewsEntity> wrapper) {
		  Page<NewsView> page =new Query<NewsView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

	public List<NewsVO> selectListVO(Wrapper<NewsEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}

	public NewsVO selectVO(Wrapper<NewsEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}

	public List<NewsView> selectListView(Wrapper<NewsEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	public NewsView selectView(Wrapper<NewsEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
