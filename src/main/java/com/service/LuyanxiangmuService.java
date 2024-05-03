package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LuyanxiangmuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LuyanxiangmuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LuyanxiangmuView;


/**
 * 路演项目
 *
 * @author 
 * @email 
 * @date 2023-03-30 22:03:49
 */
public interface LuyanxiangmuService extends IService<LuyanxiangmuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LuyanxiangmuVO> selectListVO(Wrapper<LuyanxiangmuEntity> wrapper);
   	
   	LuyanxiangmuVO selectVO(@Param("ew") Wrapper<LuyanxiangmuEntity> wrapper);
   	
   	List<LuyanxiangmuView> selectListView(Wrapper<LuyanxiangmuEntity> wrapper);
   	
   	LuyanxiangmuView selectView(@Param("ew") Wrapper<LuyanxiangmuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LuyanxiangmuEntity> wrapper);
   	

}

