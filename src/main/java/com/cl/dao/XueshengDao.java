package com.cl.dao;

import com.cl.entity.Student;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.vo.XueshengVO;
import com.cl.entity.view.XueshengView;


/**
 * 学生
 *
 */
public interface XueshengDao extends BaseMapper<Student> {
	
	List<XueshengVO> selectListVO(@Param("ew") Wrapper<Student> wrapper);
	
	XueshengVO selectVO(@Param("ew") Wrapper<Student> wrapper);
	
	List<XueshengView> selectListView(@Param("ew") Wrapper<Student> wrapper);

	List<XueshengView> selectListView(Pagination page, @Param("ew") Wrapper<Student> wrapper);
	
	XueshengView selectView(@Param("ew") Wrapper<Student> wrapper);
	
}
