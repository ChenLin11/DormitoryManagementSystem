package com.cl.entity.vo;

import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
 

/**
 * 宿舍信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 */
public class SushexinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 宿舍类型
	 */
	
	private String susheleixing;
		
	/**
	 * 位置
	 */
	
	private String weizhi;
		
	/**
	 * 可住人数
	 */
	
	private Integer kezhurenshu;
		
	/**
	 * 已住人数
	 */
	
	private Integer yizhurenshu;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
	/**
	 * 设置：宿舍类型
	 */
	 
	public void setSusheleixing(String susheleixing) {
		this.susheleixing = susheleixing;
	}
	
	/**
	 * 获取：宿舍类型
	 */
	public String getSusheleixing() {
		return susheleixing;
	}
				
	
	/**
	 * 设置：位置
	 */
	 
	public void setWeizhi(String weizhi) {
		this.weizhi = weizhi;
	}
	
	/**
	 * 获取：位置
	 */
	public String getWeizhi() {
		return weizhi;
	}
				
	
	/**
	 * 设置：可住人数
	 */
	 
	public void setKezhurenshu(Integer kezhurenshu) {
		this.kezhurenshu = kezhurenshu;
	}
	
	/**
	 * 获取：可住人数
	 */
	public Integer getKezhurenshu() {
		return kezhurenshu;
	}
				
	
	/**
	 * 设置：已住人数
	 */
	 
	public void setYizhurenshu(Integer yizhurenshu) {
		this.yizhurenshu = yizhurenshu;
	}
	
	/**
	 * 获取：已住人数
	 */
	public Integer getYizhurenshu() {
		return yizhurenshu;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
			
}
