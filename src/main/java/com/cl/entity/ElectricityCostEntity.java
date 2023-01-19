package com.cl.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;


/**
 * 电费
 * 数据库通用操作实体类（普通增删改查）
 */
@Data
@TableName("electricitycost")
public class ElectricityCostEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.ID_WORKER_STR)
    private String id;
    /**
     * 宿舍号
     */

    private String roomId;

    /**
     * 月份
     */

    private String monthNumber;

    /**
     * 收费类型
     */

    private String chargeType;

    /**
     * 金额
     */

    private Float amount;


    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat
    private Date createDate;

}
