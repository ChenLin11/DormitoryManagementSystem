package com.cl.dao;

import com.cl.entity.FangkexinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.vo.FangkexinxiVO;
import com.cl.entity.view.FangkexinxiView;


/**
 * 访客信息
 *
 */
public interface FangkexinxiDao extends BaseMapper<FangkexinxiEntity> {
	
	List<FangkexinxiVO> selectListVO(@Param("ew") Wrapper<FangkexinxiEntity> wrapper);
	
	FangkexinxiVO selectVO(@Param("ew") Wrapper<FangkexinxiEntity> wrapper);
	
	List<FangkexinxiView> selectListView(@Param("ew") Wrapper<FangkexinxiEntity> wrapper);

	List<FangkexinxiView> selectListView(Pagination page, @Param("ew") Wrapper<FangkexinxiEntity> wrapper);
	
	FangkexinxiView selectView(@Param("ew") Wrapper<FangkexinxiEntity> wrapper);
	
}
