package com.cl.entity.vo;


import lombok.Data;

import java.io.Serializable;
 

/**
 * 水电费
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 */
@Data
public class ShuidianfeiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 月份
	 */
	
	private String yuefen;
		
	/**
	 * 收费类型
	 */
	
	private String shoufeileixing;
		
	/**
	 * 金额
	 */
	
	private Integer jine;
				

}
