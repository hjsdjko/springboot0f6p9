package com.dao;

import com.entity.ZhuanjiaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhuanjiaVO;
import com.entity.view.ZhuanjiaView;


/**
 * 专家
 * 
 * @author 
 * @email 
 * @date 2023-03-30 22:03:49
 */
public interface ZhuanjiaDao extends BaseMapper<ZhuanjiaEntity> {
	
	List<ZhuanjiaVO> selectListVO(@Param("ew") Wrapper<ZhuanjiaEntity> wrapper);
	
	ZhuanjiaVO selectVO(@Param("ew") Wrapper<ZhuanjiaEntity> wrapper);
	
	List<ZhuanjiaView> selectListView(@Param("ew") Wrapper<ZhuanjiaEntity> wrapper);

	List<ZhuanjiaView> selectListView(Pagination page,@Param("ew") Wrapper<ZhuanjiaEntity> wrapper);
	
	ZhuanjiaView selectView(@Param("ew") Wrapper<ZhuanjiaEntity> wrapper);
	

}
