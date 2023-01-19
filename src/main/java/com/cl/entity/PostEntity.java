package com.cl.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 交流论坛
 * 数据库通用操作实体类（普通增删改查）
 */
@Data
@TableName("post")
public class PostEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	
	/**
	 * 主键id
	 */
	@TableId(value = "id", type = IdType.ID_WORKER_STR)
	private String id;
	/**
	 * 帖子标题
	 */
					
	private String title;
	
	/**
	 * 帖子内容
	 */
					
	private String content;
	
	/**
	 * 父节点id
	 */
					
	private String parentid;
	
	/**
	 * 用户id
	 */
					
	private String userid;
	
	/**
	 * 用户名
	 */
					
	private String username;
	
	/**
	 * 状态
	 */
					
	private String isDone;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date createDate;

	@TableField(exist = false)
	private List<PostEntity> childs;

}
