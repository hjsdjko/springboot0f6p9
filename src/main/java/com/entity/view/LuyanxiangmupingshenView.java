package com.entity.view;

import com.entity.LuyanxiangmupingshenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 路演项目评审
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-30 22:03:49
 */
@TableName("luyanxiangmupingshen")
public class LuyanxiangmupingshenView  extends LuyanxiangmupingshenEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LuyanxiangmupingshenView(){
	}
 
 	public LuyanxiangmupingshenView(LuyanxiangmupingshenEntity luyanxiangmupingshenEntity){
 	try {
			BeanUtils.copyProperties(this, luyanxiangmupingshenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
