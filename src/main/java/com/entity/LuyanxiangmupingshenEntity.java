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
 * 路演项目评审
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-03-30 22:03:49
 */
@TableName("luyanxiangmupingshen")
public class LuyanxiangmupingshenEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public LuyanxiangmupingshenEntity() {
		
	}
	
	public LuyanxiangmupingshenEntity(T t) {
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
	 * 评审时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date pingshenshijian;
	
	/**
	 * 评审分数
	 */
					
	private Integer pingshenfenshu;
	
	/**
	 * 评审意见
	 */
					
	private String pingshenyijian;
	
	/**
	 * 学号
	 */
					
	private String xuehao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 专家账号
	 */
					
	private String zhuanjiazhanghao;
	
	/**
	 * 专家姓名
	 */
					
	private String zhuanjiaxingming;
	
	
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
	 * 设置：评审时间
	 */
	public void setPingshenshijian(Date pingshenshijian) {
		this.pingshenshijian = pingshenshijian;
	}
	/**
	 * 获取：评审时间
	 */
	public Date getPingshenshijian() {
		return pingshenshijian;
	}
	/**
	 * 设置：评审分数
	 */
	public void setPingshenfenshu(Integer pingshenfenshu) {
		this.pingshenfenshu = pingshenfenshu;
	}
	/**
	 * 获取：评审分数
	 */
	public Integer getPingshenfenshu() {
		return pingshenfenshu;
	}
	/**
	 * 设置：评审意见
	 */
	public void setPingshenyijian(String pingshenyijian) {
		this.pingshenyijian = pingshenyijian;
	}
	/**
	 * 获取：评审意见
	 */
	public String getPingshenyijian() {
		return pingshenyijian;
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
	/**
	 * 设置：专家账号
	 */
	public void setZhuanjiazhanghao(String zhuanjiazhanghao) {
		this.zhuanjiazhanghao = zhuanjiazhanghao;
	}
	/**
	 * 获取：专家账号
	 */
	public String getZhuanjiazhanghao() {
		return zhuanjiazhanghao;
	}
	/**
	 * 设置：专家姓名
	 */
	public void setZhuanjiaxingming(String zhuanjiaxingming) {
		this.zhuanjiaxingming = zhuanjiaxingming;
	}
	/**
	 * 获取：专家姓名
	 */
	public String getZhuanjiaxingming() {
		return zhuanjiaxingming;
	}

}
