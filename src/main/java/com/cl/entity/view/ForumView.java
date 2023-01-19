package com.cl.entity.view;

import com.baomidou.mybatisplus.annotations.TableName;
import com.cl.entity.ForumEntity;
import com.cl.entity.exception.EIException;
import org.springframework.beans.BeanUtils;

import java.io.Serializable;


/**
 * 交流论坛
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("forum")
public class ForumView extends ForumEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    public ForumView() {
    }

    public ForumView(ForumEntity forumEntity) {
        try {
            BeanUtils.copyProperties(this, forumEntity);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            throw new EIException(e.getMessage());
        }

    }
}
