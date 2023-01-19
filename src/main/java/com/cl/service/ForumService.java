package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.PostEntity;
import java.util.List;
import java.util.Map;
import com.cl.entity.vo.ForumVO;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.PostView;


/**
 * 交流论坛
 *
 */
public interface ForumService extends IService<PostEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ForumVO> selectListVO(Wrapper<PostEntity> wrapper);
   	
   	ForumVO selectVO(@Param("ew") Wrapper<PostEntity> wrapper);
   	
   	List<PostView> selectListView(Wrapper<PostEntity> wrapper);
   	
   	PostView selectView(@Param("ew") Wrapper<PostEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params, Wrapper<PostEntity> wrapper);
   	
}

