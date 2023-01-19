package com.cl.entity.view;

import com.baomidou.mybatisplus.annotations.TableName;
import com.cl.entity.XueshengEntity;
import com.cl.entity.exception.EIException;
import org.springframework.beans.BeanUtils;

import java.io.Serializable;
 

/**
 * 学生
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("xuesheng")
public class XueshengView  extends XueshengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XueshengView(){
	}
 
 	public XueshengView(XueshengEntity xueshengEntity){
		try {
			BeanUtils.copyProperties(this, xueshengEntity);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new EIException(e.getMessage());
		}

	}
}
