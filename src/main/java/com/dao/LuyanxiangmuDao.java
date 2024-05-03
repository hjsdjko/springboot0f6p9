package com.dao;

import com.entity.LuyanxiangmuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LuyanxiangmuVO;
import com.entity.view.LuyanxiangmuView;


/**
 * 路演项目
 * 
 * @author 
 * @email 
 * @date 2023-03-30 22:03:49
 */
public interface LuyanxiangmuDao extends BaseMapper<LuyanxiangmuEntity> {
	
	List<LuyanxiangmuVO> selectListVO(@Param("ew") Wrapper<LuyanxiangmuEntity> wrapper);
	
	LuyanxiangmuVO selectVO(@Param("ew") Wrapper<LuyanxiangmuEntity> wrapper);
	
	List<LuyanxiangmuView> selectListView(@Param("ew") Wrapper<LuyanxiangmuEntity> wrapper);

	List<LuyanxiangmuView> selectListView(Pagination page,@Param("ew") Wrapper<LuyanxiangmuEntity> wrapper);
	
	LuyanxiangmuView selectView(@Param("ew") Wrapper<LuyanxiangmuEntity> wrapper);
	

}
