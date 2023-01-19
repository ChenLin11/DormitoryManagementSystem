package com.cl.dao;

import com.cl.entity.ShuidianfeiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.vo.ShuidianfeiVO;
import com.cl.entity.view.ShuidianfeiView;


/**
 * 水电费
 *
 */
public interface ShuidianfeiDao extends BaseMapper<ShuidianfeiEntity> {
	
	List<ShuidianfeiVO> selectListVO(@Param("ew") Wrapper<ShuidianfeiEntity> wrapper);
	
	ShuidianfeiVO selectVO(@Param("ew") Wrapper<ShuidianfeiEntity> wrapper);
	
	List<ShuidianfeiView> selectListView(@Param("ew") Wrapper<ShuidianfeiEntity> wrapper);

	List<ShuidianfeiView> selectListView(Pagination page, @Param("ew") Wrapper<ShuidianfeiEntity> wrapper);
	
	ShuidianfeiView selectView(@Param("ew") Wrapper<ShuidianfeiEntity> wrapper);
	
}
