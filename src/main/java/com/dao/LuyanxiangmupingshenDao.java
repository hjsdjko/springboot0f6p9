package com.dao;

import com.entity.LuyanxiangmupingshenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LuyanxiangmupingshenVO;
import com.entity.view.LuyanxiangmupingshenView;


/**
 * 路演项目评审
 * 
 * @author 
 * @email 
 * @date 2023-03-30 22:03:49
 */
public interface LuyanxiangmupingshenDao extends BaseMapper<LuyanxiangmupingshenEntity> {
	
	List<LuyanxiangmupingshenVO> selectListVO(@Param("ew") Wrapper<LuyanxiangmupingshenEntity> wrapper);
	
	LuyanxiangmupingshenVO selectVO(@Param("ew") Wrapper<LuyanxiangmupingshenEntity> wrapper);
	
	List<LuyanxiangmupingshenView> selectListView(@Param("ew") Wrapper<LuyanxiangmupingshenEntity> wrapper);

	List<LuyanxiangmupingshenView> selectListView(Pagination page,@Param("ew") Wrapper<LuyanxiangmupingshenEntity> wrapper);
	
	LuyanxiangmupingshenView selectView(@Param("ew") Wrapper<LuyanxiangmupingshenEntity> wrapper);
	

}
