package com.dao;

import com.entity.ChuangxinchuangyeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChuangxinchuangyeVO;
import com.entity.view.ChuangxinchuangyeView;


/**
 * 创新创业
 * 
 * @author 
 * @email 
 * @date 2023-03-30 22:03:49
 */
public interface ChuangxinchuangyeDao extends BaseMapper<ChuangxinchuangyeEntity> {
	
	List<ChuangxinchuangyeVO> selectListVO(@Param("ew") Wrapper<ChuangxinchuangyeEntity> wrapper);
	
	ChuangxinchuangyeVO selectVO(@Param("ew") Wrapper<ChuangxinchuangyeEntity> wrapper);
	
	List<ChuangxinchuangyeView> selectListView(@Param("ew") Wrapper<ChuangxinchuangyeEntity> wrapper);

	List<ChuangxinchuangyeView> selectListView(Pagination page,@Param("ew") Wrapper<ChuangxinchuangyeEntity> wrapper);
	
	ChuangxinchuangyeView selectView(@Param("ew") Wrapper<ChuangxinchuangyeEntity> wrapper);
	

}
