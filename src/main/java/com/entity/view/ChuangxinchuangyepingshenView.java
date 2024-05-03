package com.entity.view;

import com.entity.ChuangxinchuangyepingshenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 创新创业评审
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-30 22:03:49
 */
@TableName("chuangxinchuangyepingshen")
public class ChuangxinchuangyepingshenView  extends ChuangxinchuangyepingshenEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChuangxinchuangyepingshenView(){
	}
 
 	public ChuangxinchuangyepingshenView(ChuangxinchuangyepingshenEntity chuangxinchuangyepingshenEntity){
 	try {
			BeanUtils.copyProperties(this, chuangxinchuangyepingshenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
