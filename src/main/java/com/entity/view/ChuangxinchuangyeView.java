package com.entity.view;

import com.entity.ChuangxinchuangyeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 创新创业
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-30 22:03:49
 */
@TableName("chuangxinchuangye")
public class ChuangxinchuangyeView  extends ChuangxinchuangyeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChuangxinchuangyeView(){
	}
 
 	public ChuangxinchuangyeView(ChuangxinchuangyeEntity chuangxinchuangyeEntity){
 	try {
			BeanUtils.copyProperties(this, chuangxinchuangyeEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
