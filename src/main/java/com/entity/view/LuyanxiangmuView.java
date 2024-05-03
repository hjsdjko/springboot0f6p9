package com.entity.view;

import com.entity.LuyanxiangmuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 路演项目
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-30 22:03:49
 */
@TableName("luyanxiangmu")
public class LuyanxiangmuView  extends LuyanxiangmuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LuyanxiangmuView(){
	}
 
 	public LuyanxiangmuView(LuyanxiangmuEntity luyanxiangmuEntity){
 	try {
			BeanUtils.copyProperties(this, luyanxiangmuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
