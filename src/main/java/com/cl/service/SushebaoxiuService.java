package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.SushebaoxiuEntity;
import java.util.List;
import java.util.Map;
import com.cl.entity.vo.SushebaoxiuVO;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.SushebaoxiuView;


/**
 * 宿舍报修
 *
 */
public interface SushebaoxiuService extends IService<SushebaoxiuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SushebaoxiuVO> selectListVO(Wrapper<SushebaoxiuEntity> wrapper);
   	
   	SushebaoxiuVO selectVO(@Param("ew") Wrapper<SushebaoxiuEntity> wrapper);
   	
   	List<SushebaoxiuView> selectListView(Wrapper<SushebaoxiuEntity> wrapper);
   	
   	SushebaoxiuView selectView(@Param("ew") Wrapper<SushebaoxiuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params, Wrapper<SushebaoxiuEntity> wrapper);
   	
}

