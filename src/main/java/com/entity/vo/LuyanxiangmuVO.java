package com.entity.vo;

import com.entity.LuyanxiangmuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 路演项目
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-03-30 22:03:49
 */
public class LuyanxiangmuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
