package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.ElectricityCostEntity;
import java.util.List;
import java.util.Map;
import com.cl.entity.vo.ShuidianfeiVO;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ElectricityCostView;


/**
 * 水电费
 *
 */
public interface ShuidianfeiService extends IService<ElectricityCostEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShuidianfeiVO> selectListVO(Wrapper<ElectricityCostEntity> wrapper);
   	
   	ShuidianfeiVO selectVO(@Param("ew") Wrapper<ElectricityCostEntity> wrapper);
   	
   	List<ElectricityCostView> selectListView(Wrapper<ElectricityCostEntity> wrapper);
   	
   	ElectricityCostView selectView(@Param("ew") Wrapper<ElectricityCostEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params, Wrapper<ElectricityCostEntity> wrapper);
   	
}

