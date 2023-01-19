package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.DormInfoEntity;
import java.util.List;
import java.util.Map;
import com.cl.entity.vo.SushexinxiVO;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DormInfoView;


/**
 * 宿舍信息
 *
 * @author 
 * @email 
 * @date 2021-01-30 19:50:51
 */
public interface DormInfoService extends IService<DormInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SushexinxiVO> selectListVO(Wrapper<DormInfoEntity> wrapper);
   	
   	SushexinxiVO selectVO(@Param("ew") Wrapper<DormInfoEntity> wrapper);
   	
   	List<DormInfoView> selectListView(Wrapper<DormInfoEntity> wrapper);
   	
   	DormInfoView selectView(@Param("ew") Wrapper<DormInfoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params, Wrapper<DormInfoEntity> wrapper);
   	
}

