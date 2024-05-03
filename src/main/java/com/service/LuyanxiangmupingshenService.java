package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LuyanxiangmupingshenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LuyanxiangmupingshenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LuyanxiangmupingshenView;


/**
 * 路演项目评审
 *
 * @author 
 * @email 
 * @date 2023-03-30 22:03:49
 */
public interface LuyanxiangmupingshenService extends IService<LuyanxiangmupingshenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LuyanxiangmupingshenVO> selectListVO(Wrapper<LuyanxiangmupingshenEntity> wrapper);
   	
   	LuyanxiangmupingshenVO selectVO(@Param("ew") Wrapper<LuyanxiangmupingshenEntity> wrapper);
   	
   	List<LuyanxiangmupingshenView> selectListView(Wrapper<LuyanxiangmupingshenEntity> wrapper);
   	
   	LuyanxiangmupingshenView selectView(@Param("ew") Wrapper<LuyanxiangmupingshenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LuyanxiangmupingshenEntity> wrapper);
   	

}

