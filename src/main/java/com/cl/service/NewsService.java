package com.cl.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.NewsEntity;
import java.util.List;
import java.util.Map;
import com.cl.entity.vo.NewsVO;
import org.apache.ibatis.annotations.Param;


/**
 * 通知公告
 *
 */
public interface NewsService extends IService<NewsEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<NewsVO> selectListVO(QueryWrapper<NewsEntity> wrapper);
   	
   	NewsVO selectVO(@Param("ew") QueryWrapper<NewsEntity> wrapper);
   	
   	List<NewsEntity> selectListView(QueryWrapper<NewsEntity> wrapper);
   	
   	NewsEntity selectView(@Param("ew") QueryWrapper<NewsEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params, QueryWrapper<NewsEntity> wrapper);
   	
}

