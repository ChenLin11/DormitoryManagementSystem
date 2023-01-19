package com.cl.entity.view;

import com.baomidou.mybatisplus.annotations.TableName;
import com.cl.entity.SushebaoxiuEntity;
import com.cl.entity.exception.EIException;
import org.springframework.beans.BeanUtils;

import java.io.Serializable;


/**
 * 宿舍报修
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("sushebaoxiu")
public class SushebaoxiuView extends SushebaoxiuEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    public SushebaoxiuView() {
    }

    public SushebaoxiuView(SushebaoxiuEntity sushebaoxiuEntity) {
        try {
            BeanUtils.copyProperties(this, sushebaoxiuEntity);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            throw new EIException(e.getMessage());
        }

    }
}
