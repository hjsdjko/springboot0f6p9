package com.entity;

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
 * 路演项目
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-03-30 22:03:49
 */
@TableName("luyanxiangmu")
public class LuyanxiangmuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public LuyanxiangmuEntity() {
		
	}
	
	public LuyanxiangmuEntity(T t) {
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
	 * 路演名称
	 */
					
	private String luyanmingcheng;
	
	/**
	 * 路演地点
	 */
					
	private String luyandidian;
	
	/**
	 * 路演方式
	 */
					
	private String luyanfangshi;
	
	/**
	 * 路演视频
	 */
					
	private String luyanshipin;
	
	/**
	 * 路演简介
	 */
					
	private String luyanjianjie;
	
	/**
	 * 学号
	 */
					
	private String xuehao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	
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
	 * 设置：路演名称
	 */
	public void setLuyanmingcheng(String luyanmingcheng) {
		this.luyanmingcheng = luyanmingcheng;
	}
	/**
	 * 获取：路演名称
	 */
	public String getLuyanmingcheng() {
		return luyanmingcheng;
	}
	/**
	 * 设置：路演地点
	 */
	public void setLuyandidian(String luyandidian) {
		this.luyandidian = luyandidian;
	}
	/**
	 * 获取：路演地点
	 */
	public String getLuyandidian() {
		return luyandidian;
	}
	/**
	 * 设置：路演方式
	 */
	public void setLuyanfangshi(String luyanfangshi) {
		this.luyanfangshi = luyanfangshi;
	}
	/**
	 * 获取：路演方式
	 */
	public String getLuyanfangshi() {
		return luyanfangshi;
	}
	/**
	 * 设置：路演视频
	 */
	public void setLuyanshipin(String luyanshipin) {
		this.luyanshipin = luyanshipin;
	}
	/**
	 * 获取：路演视频
	 */
	public String getLuyanshipin() {
		return luyanshipin;
	}
	/**
	 * 设置：路演简介
	 */
	public void setLuyanjianjie(String luyanjianjie) {
		this.luyanjianjie = luyanjianjie;
	}
	/**
	 * 获取：路演简介
	 */
	public String getLuyanjianjie() {
		return luyanjianjie;
	}
	/**
	 * 设置：学号
	 */
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}

}
