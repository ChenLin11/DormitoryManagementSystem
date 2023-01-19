package com.cl.entity.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 访客信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 */
@Data
public class VisitorInfoVO implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 电话
	 */
	
	private String phoneNumber;
		
	/**
	 * 宿舍号
	 */
	
	private String roomId;
		
	/**
	 * 到访原因
	 */
	
	private String visitReason;
		
	/**
	 * 来访时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date visitTime;
		
	/**
	 * 离开时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date leaveTime;
		
	/**
	 * 备注
	 */
	
	private String postScript;
			
}
