package com.cl.entity.view;

import com.cl.entity.ZuoyexinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 作业信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-12 16:08:27
 */
@TableName("zuoyexinxi")
public class ZuoyexinxiView  extends ZuoyexinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZuoyexinxiView(){
	}
 
 	public ZuoyexinxiView(ZuoyexinxiEntity zuoyexinxiEntity){
 	try {
			BeanUtils.copyProperties(this, zuoyexinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
