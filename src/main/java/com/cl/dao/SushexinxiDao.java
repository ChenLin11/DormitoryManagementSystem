package com.cl.dao;

import com.cl.entity.DormInfoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.vo.SushexinxiVO;
import com.cl.entity.view.DormInfoView;


/**
 * 宿舍信息
 *
 */
public interface SushexinxiDao extends BaseMapper<DormInfoEntity> {
	
	List<SushexinxiVO> selectListVO(@Param("ew") Wrapper<DormInfoEntity> wrapper);
	
	SushexinxiVO selectVO(@Param("ew") Wrapper<DormInfoEntity> wrapper);
	
	List<DormInfoView> selectListView(@Param("ew") Wrapper<DormInfoEntity> wrapper);

	List<DormInfoView> selectListView(Pagination page, @Param("ew") Wrapper<DormInfoEntity> wrapper);
	
	DormInfoView selectView(@Param("ew") Wrapper<DormInfoEntity> wrapper);
	
}
