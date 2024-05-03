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


import com.dao.ChuangxinchuangyeDao;
import com.entity.ChuangxinchuangyeEntity;
import com.service.ChuangxinchuangyeService;
import com.entity.vo.ChuangxinchuangyeVO;
import com.entity.view.ChuangxinchuangyeView;

@Service("chuangxinchuangyeService")
public class ChuangxinchuangyeServiceImpl extends ServiceImpl<ChuangxinchuangyeDao, ChuangxinchuangyeEntity> implements ChuangxinchuangyeService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChuangxinchuangyeEntity> page = this.selectPage(
                new Query<ChuangxinchuangyeEntity>(params).getPage(),
                new EntityWrapper<ChuangxinchuangyeEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChuangxinchuangyeEntity> wrapper) {
		  Page<ChuangxinchuangyeView> page =new Query<ChuangxinchuangyeView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChuangxinchuangyeVO> selectListVO(Wrapper<ChuangxinchuangyeEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChuangxinchuangyeVO selectVO(Wrapper<ChuangxinchuangyeEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChuangxinchuangyeView> selectListView(Wrapper<ChuangxinchuangyeEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChuangxinchuangyeView selectView(Wrapper<ChuangxinchuangyeEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
