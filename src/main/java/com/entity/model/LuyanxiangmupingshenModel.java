package com.entity.model;

import com.entity.LuyanxiangmupingshenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 路演项目评审
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-03-30 22:03:49
 */
public class LuyanxiangmupingshenModel  implements Serializable {
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
