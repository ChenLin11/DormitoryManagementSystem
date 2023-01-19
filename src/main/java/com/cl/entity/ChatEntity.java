package com.cl.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.cl.entity.exception.EIException;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.beans.BeanUtils;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;


/**
 * 在线沟通
 * 数据库通用操作实体类（普通增删改查）
 */
@TableName("chat")
@Data
public class ChatEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.ID_WORKER_STR)
    private String id;
    /**
     * 用户id
     */

    private String userid;

    /**
     * 管理员id
     */

    private String adminid;

    /**
     * 提问
     */

    private String ask;

    /**
     * 回复
     */

    private String reply;

    /**
     * 是否回复
     */

    private Integer isReply;


    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat
    private Date createDate;

}
