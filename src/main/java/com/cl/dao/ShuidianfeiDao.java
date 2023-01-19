package com.cl.dao;

import com.cl.entity.ElectricityCostEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.vo.ShuidianfeiVO;
import com.cl.entity.view.ElectricityCostView;


/**
 * 水电费
 *
 */
public interface ShuidianfeiDao extends BaseMapper<ElectricityCostEntity> {
	
	List<ShuidianfeiVO> selectListVO(@Param("ew") Wrapper<ElectricityCostEntity> wrapper);
	
	ShuidianfeiVO selectVO(@Param("ew") Wrapper<ElectricityCostEntity> wrapper);
	
	List<ElectricityCostView> selectListView(@Param("ew") Wrapper<ElectricityCostEntity> wrapper);

	List<ElectricityCostView> selectListView(Pagination page, @Param("ew") Wrapper<ElectricityCostEntity> wrapper);
	
	ElectricityCostView selectView(@Param("ew") Wrapper<ElectricityCostEntity> wrapper);
	
}
