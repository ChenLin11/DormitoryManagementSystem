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
 * 用户
 */
@TableName("users")
@Data
public class UserEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ID_WORKER_STR)
    private String id;

    /**
     * 用户账号
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 用户类型
     */
    private String role;

    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat
    private Date createTime;



}
