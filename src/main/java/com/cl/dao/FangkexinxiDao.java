package com.cl.dao;

import com.cl.entity.VisitorInfoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.vo.VisitorInfoVO;
import com.cl.entity.view.VisitorInfoView;


/**
 * 访客信息
 *
 */
public interface FangkexinxiDao extends BaseMapper<VisitorInfoEntity> {
	
	List<VisitorInfoVO> selectListVO(@Param("ew") Wrapper<VisitorInfoEntity> wrapper);
	
	VisitorInfoVO selectVO(@Param("ew") Wrapper<VisitorInfoEntity> wrapper);
	
	List<VisitorInfoView> selectListView(@Param("ew") Wrapper<VisitorInfoEntity> wrapper);

	List<VisitorInfoView> selectListView(Pagination page, @Param("ew") Wrapper<VisitorInfoEntity> wrapper);
	
	VisitorInfoView selectView(@Param("ew") Wrapper<VisitorInfoEntity> wrapper);
	
}
