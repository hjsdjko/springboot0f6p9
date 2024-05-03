package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.LuyanxiangmupingshenDao;
import com.entity.LuyanxiangmupingshenEntity;
import com.service.LuyanxiangmupingshenService;
import com.entity.vo.LuyanxiangmupingshenVO;
import com.entity.view.LuyanxiangmupingshenView;

@Service("luyanxiangmupingshenService")
public class LuyanxiangmupingshenServiceImpl extends ServiceImpl<LuyanxiangmupingshenDao, LuyanxiangmupingshenEntity> implements LuyanxiangmupingshenService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LuyanxiangmupingshenEntity> page = this.selectPage(
                new Query<LuyanxiangmupingshenEntity>(params).getPage(),
                new EntityWrapper<LuyanxiangmupingshenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LuyanxiangmupingshenEntity> wrapper) {
		  Page<LuyanxiangmupingshenView> page =new Query<LuyanxiangmupingshenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LuyanxiangmupingshenVO> selectListVO(Wrapper<LuyanxiangmupingshenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LuyanxiangmupingshenVO selectVO(Wrapper<LuyanxiangmupingshenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LuyanxiangmupingshenView> selectListView(Wrapper<LuyanxiangmupingshenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LuyanxiangmupingshenView selectView(Wrapper<LuyanxiangmupingshenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
