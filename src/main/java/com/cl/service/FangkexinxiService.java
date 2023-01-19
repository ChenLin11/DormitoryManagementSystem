package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.VisitorInfoEntity;
import java.util.List;
import java.util.Map;
import com.cl.entity.vo.VisitorInfoVO;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.VisitorInfoView;


/**
 * 访客信息
 *
 */
public interface FangkexinxiService extends IService<VisitorInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<VisitorInfoVO> selectListVO(Wrapper<VisitorInfoEntity> wrapper);
   	
   	VisitorInfoVO selectVO(@Param("ew") Wrapper<VisitorInfoEntity> wrapper);
   	
   	List<VisitorInfoView> selectListView(Wrapper<VisitorInfoEntity> wrapper);
   	
   	VisitorInfoView selectView(@Param("ew") Wrapper<VisitorInfoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params, Wrapper<VisitorInfoEntity> wrapper);
   	
}

