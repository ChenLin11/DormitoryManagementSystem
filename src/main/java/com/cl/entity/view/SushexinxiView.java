package com.cl.entity.view;

import com.baomidou.mybatisplus.annotations.TableName;
import com.cl.entity.SushexinxiEntity;
import com.cl.entity.exception.EIException;
import org.springframework.beans.BeanUtils;

import java.io.Serializable;


/**
 * 宿舍信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("sushexinxi")
public class SushexinxiView extends SushexinxiEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    public SushexinxiView() {
    }

    public SushexinxiView(SushexinxiEntity sushexinxiEntity) {
        try {
            BeanUtils.copyProperties(this, sushexinxiEntity);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            throw new EIException(e.getMessage());
        }

    }
}
