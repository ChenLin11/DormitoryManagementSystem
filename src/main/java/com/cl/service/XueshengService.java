package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.Student;
import java.util.List;
import java.util.Map;
import com.cl.entity.vo.XueshengVO;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.XueshengView;


/**
 * 学生
 *
 */
public interface XueshengService extends IService<Student> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshengVO> selectListVO(Wrapper<Student> wrapper);
   	
   	XueshengVO selectVO(@Param("ew") Wrapper<Student> wrapper);
   	
   	List<XueshengView> selectListView(Wrapper<Student> wrapper);
   	
   	XueshengView selectView(@Param("ew") Wrapper<Student> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params, Wrapper<Student> wrapper);
   	
}

