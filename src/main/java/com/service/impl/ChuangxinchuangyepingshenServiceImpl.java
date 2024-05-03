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


import com.dao.ChuangxinchuangyepingshenDao;
import com.entity.ChuangxinchuangyepingshenEntity;
import com.service.ChuangxinchuangyepingshenService;
import com.entity.vo.ChuangxinchuangyepingshenVO;
import com.entity.view.ChuangxinchuangyepingshenView;

@Service("chuangxinchuangyepingshenService")
public class ChuangxinchuangyepingshenServiceImpl extends ServiceImpl<ChuangxinchuangyepingshenDao, ChuangxinchuangyepingshenEntity> implements ChuangxinchuangyepingshenService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChuangxinchuangyepingshenEntity> page = this.selectPage(
                new Query<ChuangxinchuangyepingshenEntity>(params).getPage(),
                new EntityWrapper<ChuangxinchuangyepingshenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChuangxinchuangyepingshenEntity> wrapper) {
		  Page<ChuangxinchuangyepingshenView> page =new Query<ChuangxinchuangyepingshenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChuangxinchuangyepingshenVO> selectListVO(Wrapper<ChuangxinchuangyepingshenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChuangxinchuangyepingshenVO selectVO(Wrapper<ChuangxinchuangyepingshenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChuangxinchuangyepingshenView> selectListView(Wrapper<ChuangxinchuangyepingshenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChuangxinchuangyepingshenView selectView(Wrapper<ChuangxinchuangyepingshenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
