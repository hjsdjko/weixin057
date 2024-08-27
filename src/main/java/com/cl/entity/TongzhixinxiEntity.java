package com.cl.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 通知信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-03-12 16:08:27
 */
@TableName("tongzhixinxi")
public class TongzhixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public TongzhixinxiEntity() {
		
	}
	
	public TongzhixinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 通知标题
	 */
					
	private String tongzhibiaoti;
	
	/**
	 * 通知类型
	 */
					
	private String tongzhileixing;
	
	/**
	 * 封面
	 */
					
	private String fengmian;
	
	/**
	 * 通知详情
	 */
					
	private String tongzhixiangqing;
	
	/**
	 * 发布时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date fabushijian;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：通知标题
	 */
	public void setTongzhibiaoti(String tongzhibiaoti) {
		this.tongzhibiaoti = tongzhibiaoti;
	}
	/**
	 * 获取：通知标题
	 */
	public String getTongzhibiaoti() {
		return tongzhibiaoti;
	}
	/**
	 * 设置：通知类型
	 */
	public void setTongzhileixing(String tongzhileixing) {
		this.tongzhileixing = tongzhileixing;
	}
	/**
	 * 获取：通知类型
	 */
	public String getTongzhileixing() {
		return tongzhileixing;
	}
	/**
	 * 设置：封面
	 */
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
	/**
	 * 设置：通知详情
	 */
	public void setTongzhixiangqing(String tongzhixiangqing) {
		this.tongzhixiangqing = tongzhixiangqing;
	}
	/**
	 * 获取：通知详情
	 */
	public String getTongzhixiangqing() {
		return tongzhixiangqing;
	}
	/**
	 * 设置：发布时间
	 */
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}

}
