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
 * 学生
 * 数据库通用操作实体类（普通增删改查）
 */
@Data
@TableName("student")
public class Student<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.ID_WORKER_STR)
    private String id;
    /**
     * 学号
     */

    private String xuehao;

    /**
     * 密码
     */

    private String mima;

    /**
     * 姓名
     */

    private String name;

    /**
     * 性别
     */

    private String sex;

    /**
     * 年龄
     */

    private Integer age;

    /**
     * 学院
     */

    private String schoolName;

    /**
     * 专业
     */

    private String major;

    /**
     * 电话
     */

    private String phoneNumber;

    /**
     * 邮箱
     */

    private String email;

    /**
     * 身份证
     */

    private String identityCard;

    /**
     * 宿舍号
     */

    private String roomNumber;


    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat
    private Date createDate;

}
