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
 * 宿舍信息
 * 数据库通用操作实体类（普通增删改查）
 */
@Data
@TableName("dorminfo")
public class DormInfoEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.ID_WORKER_STR)
    private String id;
    /**
     * 宿舍号
     */

    private String roomNumber;

    /**
     * 宿舍类型
     */

    private String roomType;

    /**
     * 位置
     */

    private String location;

    /**
     * 可住人数
     */

    private Integer capacity;

    /**
     * 已住人数
     */

    private Integer residentCount;

    /**
     * 备注
     */

    private String postScript;


    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat
    private Date createTime;

}
