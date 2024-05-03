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


import com.dao.LuyanxiangmuDao;
import com.entity.LuyanxiangmuEntity;
import com.service.LuyanxiangmuService;
import com.entity.vo.LuyanxiangmuVO;
import com.entity.view.LuyanxiangmuView;

@Service("luyanxiangmuService")
public class LuyanxiangmuServiceImpl extends ServiceImpl<LuyanxiangmuDao, LuyanxiangmuEntity> implements LuyanxiangmuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LuyanxiangmuEntity> page = this.selectPage(
                new Query<LuyanxiangmuEntity>(params).getPage(),
                new EntityWrapper<LuyanxiangmuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LuyanxiangmuEntity> wrapper) {
		  Page<LuyanxiangmuView> page =new Query<LuyanxiangmuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LuyanxiangmuVO> selectListVO(Wrapper<LuyanxiangmuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LuyanxiangmuVO selectVO(Wrapper<LuyanxiangmuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LuyanxiangmuView> selectListView(Wrapper<LuyanxiangmuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LuyanxiangmuView selectView(Wrapper<LuyanxiangmuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
