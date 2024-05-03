package com.dao;

import com.entity.ChuangxinchuangyepingshenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChuangxinchuangyepingshenVO;
import com.entity.view.ChuangxinchuangyepingshenView;


/**
 * 创新创业评审
 * 
 * @author 
 * @email 
 * @date 2023-03-30 22:03:49
 */
public interface ChuangxinchuangyepingshenDao extends BaseMapper<ChuangxinchuangyepingshenEntity> {
	
	List<ChuangxinchuangyepingshenVO> selectListVO(@Param("ew") Wrapper<ChuangxinchuangyepingshenEntity> wrapper);
	
	ChuangxinchuangyepingshenVO selectVO(@Param("ew") Wrapper<ChuangxinchuangyepingshenEntity> wrapper);
	
	List<ChuangxinchuangyepingshenView> selectListView(@Param("ew") Wrapper<ChuangxinchuangyepingshenEntity> wrapper);

	List<ChuangxinchuangyepingshenView> selectListView(Pagination page,@Param("ew") Wrapper<ChuangxinchuangyepingshenEntity> wrapper);
	
	ChuangxinchuangyepingshenView selectView(@Param("ew") Wrapper<ChuangxinchuangyepingshenEntity> wrapper);
	

}
