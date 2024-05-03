package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChuangxinchuangyepingshenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChuangxinchuangyepingshenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChuangxinchuangyepingshenView;


/**
 * 创新创业评审
 *
 * @author 
 * @email 
 * @date 2023-03-30 22:03:49
 */
public interface ChuangxinchuangyepingshenService extends IService<ChuangxinchuangyepingshenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChuangxinchuangyepingshenVO> selectListVO(Wrapper<ChuangxinchuangyepingshenEntity> wrapper);
   	
   	ChuangxinchuangyepingshenVO selectVO(@Param("ew") Wrapper<ChuangxinchuangyepingshenEntity> wrapper);
   	
   	List<ChuangxinchuangyepingshenView> selectListView(Wrapper<ChuangxinchuangyepingshenEntity> wrapper);
   	
   	ChuangxinchuangyepingshenView selectView(@Param("ew") Wrapper<ChuangxinchuangyepingshenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChuangxinchuangyepingshenEntity> wrapper);
   	

}

