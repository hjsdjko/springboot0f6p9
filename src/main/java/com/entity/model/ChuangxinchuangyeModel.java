package com.entity.model;

import com.entity.ChuangxinchuangyeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 创新创业
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-03-30 22:03:49
 */
public class ChuangxinchuangyeModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 项目类型
	 */
	
	private String xiangmuleixing;
		
	/**
	 * 项目等级
	 */
	
	private String xiangmudengji;
		
	/**
	 * 项目附件
	 */
	
	private String xiangmufujian;
		
	/**
	 * 申报时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shenbaoshijian;
		
	/**
	 * 申报说明
	 */
	
	private String shenbaoshuoming;
		
	/**
	 * 学号
	 */
	
	private String xuehao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
				
	
	/**
	 * 设置：项目类型
	 */
	 
	public void setXiangmuleixing(String xiangmuleixing) {
		this.xiangmuleixing = xiangmuleixing;
	}
	
	/**
	 * 获取：项目类型
	 */
	public String getXiangmuleixing() {
		return xiangmuleixing;
	}
				
	
	/**
	 * 设置：项目等级
	 */
	 
	public void setXiangmudengji(String xiangmudengji) {
		this.xiangmudengji = xiangmudengji;
	}
	
	/**
	 * 获取：项目等级
	 */
	public String getXiangmudengji() {
		return xiangmudengji;
	}
				
	
	/**
	 * 设置：项目附件
	 */
	 
	public void setXiangmufujian(String xiangmufujian) {
		this.xiangmufujian = xiangmufujian;
	}
	
	/**
	 * 获取：项目附件
	 */
	public String getXiangmufujian() {
		return xiangmufujian;
	}
				
	
	/**
	 * 设置：申报时间
	 */
	 
	public void setShenbaoshijian(Date shenbaoshijian) {
		this.shenbaoshijian = shenbaoshijian;
	}
	
	/**
	 * 获取：申报时间
	 */
	public Date getShenbaoshijian() {
		return shenbaoshijian;
	}
				
	
	/**
	 * 设置：申报说明
	 */
	 
	public void setShenbaoshuoming(String shenbaoshuoming) {
		this.shenbaoshuoming = shenbaoshuoming;
	}
	
	/**
	 * 获取：申报说明
	 */
	public String getShenbaoshuoming() {
		return shenbaoshuoming;
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
