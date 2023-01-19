package com.cl.entity.view;

import com.baomidou.mybatisplus.annotations.TableName;
import com.cl.entity.ShuidianfeiEntity;
import com.cl.entity.exception.EIException;
import org.springframework.beans.BeanUtils;

import java.io.Serializable;


/**
 * 水电费
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("shuidianfei")
public class ShuidianfeiView extends ShuidianfeiEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    public ShuidianfeiView() {
    }

    public ShuidianfeiView(ShuidianfeiEntity shuidianfeiEntity) {
        try {
            BeanUtils.copyProperties(this, shuidianfeiEntity);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            throw new EIException(e.getMessage());
        }

    }
}
