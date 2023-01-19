package com.cl.dao;

import com.cl.entity.PostEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.vo.ForumVO;
import com.cl.entity.view.PostView;


/**
 * 交流论坛
 *
 */
public interface ForumDao extends BaseMapper<PostEntity> {
	
	List<ForumVO> selectListVO(@Param("ew") Wrapper<PostEntity> wrapper);
	
	ForumVO selectVO(@Param("ew") Wrapper<PostEntity> wrapper);
	
	List<PostView> selectListView(@Param("ew") Wrapper<PostEntity> wrapper);

	List<PostView> selectListView(Pagination page, @Param("ew") Wrapper<PostEntity> wrapper);
	
	PostView selectView(@Param("ew") Wrapper<PostEntity> wrapper);
	
}
