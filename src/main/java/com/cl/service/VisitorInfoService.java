package com.cl.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.cl.entity.VisitorInfoEntity;
import com.cl.entity.vo.VisitorInfoVO;
import com.cl.utils.PageUtils;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * 访客信息
 */
public interface VisitorInfoService extends IService<VisitorInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<VisitorInfoVO> selectListVO(QueryWrapper<VisitorInfoEntity> wrapper);

    VisitorInfoVO selectVO(@Param("ew") QueryWrapper<VisitorInfoEntity> wrapper);

    List<VisitorInfoEntity> selectListView(QueryWrapper<VisitorInfoEntity> wrapper);

    VisitorInfoEntity selectView(@Param("ew") QueryWrapper<VisitorInfoEntity> wrapper);

    PageUtils queryPage(Map<String, Object> params, QueryWrapper<VisitorInfoEntity> wrapper);

}

