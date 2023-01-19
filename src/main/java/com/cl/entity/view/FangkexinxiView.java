package com.cl.entity.view;

import com.baomidou.mybatisplus.annotations.TableName;
import com.cl.entity.FangkexinxiEntity;
import com.cl.entity.exception.EIException;
import org.springframework.beans.BeanUtils;

import java.io.Serializable;
 

/**
 * 访客信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("fangkexinxi")
public class FangkexinxiView  extends FangkexinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FangkexinxiView(){
	}
 
 	public FangkexinxiView(FangkexinxiEntity fangkexinxiEntity){
		try {
			BeanUtils.copyProperties(this, fangkexinxiEntity);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new EIException(e.getMessage());
		}
 		
	}
}
