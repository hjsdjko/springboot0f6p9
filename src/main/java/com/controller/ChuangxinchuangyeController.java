package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ChuangxinchuangyeEntity;
import com.entity.view.ChuangxinchuangyeView;

import com.service.ChuangxinchuangyeService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 创新创业
 * 后端接口
 * @author 
 * @email 
 * @date 2023-03-30 22:03:49
 */
@RestController
@RequestMapping("/chuangxinchuangye")
public class ChuangxinchuangyeController {
    @Autowired
    private ChuangxinchuangyeService chuangxinchuangyeService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ChuangxinchuangyeEntity chuangxinchuangye,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			chuangxinchuangye.setXuehao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ChuangxinchuangyeEntity> ew = new EntityWrapper<ChuangxinchuangyeEntity>();

		PageUtils page = chuangxinchuangyeService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chuangxinchuangye), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ChuangxinchuangyeEntity chuangxinchuangye, 
		HttpServletRequest request){
        EntityWrapper<ChuangxinchuangyeEntity> ew = new EntityWrapper<ChuangxinchuangyeEntity>();

		PageUtils page = chuangxinchuangyeService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chuangxinchuangye), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ChuangxinchuangyeEntity chuangxinchuangye){
       	EntityWrapper<ChuangxinchuangyeEntity> ew = new EntityWrapper<ChuangxinchuangyeEntity>();
      	ew.allEq(MPUtil.allEQMapPre( chuangxinchuangye, "chuangxinchuangye")); 
        return R.ok().put("data", chuangxinchuangyeService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ChuangxinchuangyeEntity chuangxinchuangye){
        EntityWrapper< ChuangxinchuangyeEntity> ew = new EntityWrapper< ChuangxinchuangyeEntity>();
 		ew.allEq(MPUtil.allEQMapPre( chuangxinchuangye, "chuangxinchuangye")); 
		ChuangxinchuangyeView chuangxinchuangyeView =  chuangxinchuangyeService.selectView(ew);
		return R.ok("查询创新创业成功").put("data", chuangxinchuangyeView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ChuangxinchuangyeEntity chuangxinchuangye = chuangxinchuangyeService.selectById(id);
        return R.ok().put("data", chuangxinchuangye);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ChuangxinchuangyeEntity chuangxinchuangye = chuangxinchuangyeService.selectById(id);
        return R.ok().put("data", chuangxinchuangye);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ChuangxinchuangyeEntity chuangxinchuangye, HttpServletRequest request){
    	chuangxinchuangye.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(chuangxinchuangye);
        chuangxinchuangyeService.insert(chuangxinchuangye);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ChuangxinchuangyeEntity chuangxinchuangye, HttpServletRequest request){
    	chuangxinchuangye.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(chuangxinchuangye);
        chuangxinchuangyeService.insert(chuangxinchuangye);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ChuangxinchuangyeEntity chuangxinchuangye, HttpServletRequest request){
        //ValidatorUtils.validateEntity(chuangxinchuangye);
        chuangxinchuangyeService.updateById(chuangxinchuangye);//全部更新
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        chuangxinchuangyeService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ChuangxinchuangyeEntity> wrapper = new EntityWrapper<ChuangxinchuangyeEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			wrapper.eq("xuehao", (String)request.getSession().getAttribute("username"));
		}

		int count = chuangxinchuangyeService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	









}
