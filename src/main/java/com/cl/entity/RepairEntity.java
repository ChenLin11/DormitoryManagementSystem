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
 * 宿舍报修
 * 数据库通用操作实体类（普通增删改查）
 */
@TableName("sushebaoxiu")
@Data
public class RepairEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


    public RepairEntity() {

    }

    public RepairEntity(T t) {
        try {
            BeanUtils.copyProperties(this, t);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            throw new EIException(e.getMessage());
        }
    }

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.ID_WORKER_STR)
    private String id;
    /**
     * 学号
     */

    private String stuId;

    /**
     * 姓名
     */

    private String name;

    /**
     * 宿舍号
     */

    private String roomNumber;

    /**
     * 报修物品
     */

    private String repairThing;

    /**
     * 报修内容
     */

    private String repairContent;

    /**
     * 图片
     */

    private String image;

    /**
     * 报修时间
     */

    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd")
    @DateTimeFormat
    private Date repairTime;

    /**
     * 是否审核
     */

    private String examine;

    /**
     * 审核回复
     */

    private String reply;


    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat
    private Date createDate;

}
