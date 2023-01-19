package com.cl.dao;

import com.cl.entity.SushebaoxiuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.vo.SushebaoxiuVO;
import com.cl.entity.view.SushebaoxiuView;


/**
 * 宿舍报修
 *
 */
public interface SushebaoxiuDao extends BaseMapper<SushebaoxiuEntity> {
	
	List<SushebaoxiuVO> selectListVO(@Param("ew") Wrapper<SushebaoxiuEntity> wrapper);
	
	SushebaoxiuVO selectVO(@Param("ew") Wrapper<SushebaoxiuEntity> wrapper);
	
	List<SushebaoxiuView> selectListView(@Param("ew") Wrapper<SushebaoxiuEntity> wrapper);

	List<SushebaoxiuView> selectListView(Pagination page, @Param("ew") Wrapper<SushebaoxiuEntity> wrapper);
	
	SushebaoxiuView selectView(@Param("ew") Wrapper<SushebaoxiuEntity> wrapper);
	
}
