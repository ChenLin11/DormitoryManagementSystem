package com.cl.dao;

import com.cl.entity.SushexinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.vo.SushexinxiVO;
import com.cl.entity.view.SushexinxiView;


/**
 * 宿舍信息
 *
 */
public interface SushexinxiDao extends BaseMapper<SushexinxiEntity> {
	
	List<SushexinxiVO> selectListVO(@Param("ew") Wrapper<SushexinxiEntity> wrapper);
	
	SushexinxiVO selectVO(@Param("ew") Wrapper<SushexinxiEntity> wrapper);
	
	List<SushexinxiView> selectListView(@Param("ew") Wrapper<SushexinxiEntity> wrapper);

	List<SushexinxiView> selectListView(Pagination page, @Param("ew") Wrapper<SushexinxiEntity> wrapper);
	
	SushexinxiView selectView(@Param("ew") Wrapper<SushexinxiEntity> wrapper);
	
}
