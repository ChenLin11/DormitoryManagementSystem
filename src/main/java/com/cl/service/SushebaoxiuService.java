package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.RepairEntity;
import java.util.List;
import java.util.Map;
import com.cl.entity.vo.SushebaoxiuVO;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.RepairView;


/**
 * 宿舍报修
 *
 */
public interface SushebaoxiuService extends IService<RepairEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SushebaoxiuVO> selectListVO(Wrapper<RepairEntity> wrapper);
   	
   	SushebaoxiuVO selectVO(@Param("ew") Wrapper<RepairEntity> wrapper);
   	
   	List<RepairView> selectListView(Wrapper<RepairEntity> wrapper);
   	
   	RepairView selectView(@Param("ew") Wrapper<RepairEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params, Wrapper<RepairEntity> wrapper);
   	
}

