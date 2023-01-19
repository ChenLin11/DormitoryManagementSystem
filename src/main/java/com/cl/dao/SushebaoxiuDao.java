package com.cl.dao;

import com.cl.entity.RepairEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.vo.SushebaoxiuVO;
import com.cl.entity.view.RepairView;


/**
 * 宿舍报修
 *
 */
public interface SushebaoxiuDao extends BaseMapper<RepairEntity> {
	
	List<SushebaoxiuVO> selectListVO(@Param("ew") Wrapper<RepairEntity> wrapper);
	
	SushebaoxiuVO selectVO(@Param("ew") Wrapper<RepairEntity> wrapper);
	
	List<RepairView> selectListView(@Param("ew") Wrapper<RepairEntity> wrapper);

	List<RepairView> selectListView(Pagination page, @Param("ew") Wrapper<RepairEntity> wrapper);
	
	RepairView selectView(@Param("ew") Wrapper<RepairEntity> wrapper);
	
}
