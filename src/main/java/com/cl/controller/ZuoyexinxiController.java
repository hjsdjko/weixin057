package com.cl.controller;

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

import com.cl.utils.ValidatorUtils;
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
import com.cl.annotation.IgnoreAuth;

import com.cl.entity.ZuoyexinxiEntity;
import com.cl.entity.view.ZuoyexinxiView;

import com.cl.service.ZuoyexinxiService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 作业信息
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-12 16:08:27
 */
@RestController
@RequestMapping("/zuoyexinxi")
public class ZuoyexinxiController {
    @Autowired
    private ZuoyexinxiService zuoyexinxiService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZuoyexinxiEntity zuoyexinxi,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date riqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date riqiend,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaoshi")) {
			zuoyexinxi.setJiaoshigonghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("xuesheng")) {
			zuoyexinxi.setXuehao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZuoyexinxiEntity> ew = new EntityWrapper<ZuoyexinxiEntity>();
                if(riqistart!=null) ew.ge("riqi", riqistart);
                if(riqiend!=null) ew.le("riqi", riqiend);

		PageUtils page = zuoyexinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zuoyexinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZuoyexinxiEntity zuoyexinxi, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date riqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date riqiend,
		HttpServletRequest request){
        EntityWrapper<ZuoyexinxiEntity> ew = new EntityWrapper<ZuoyexinxiEntity>();
                if(riqistart!=null) ew.ge("riqi", riqistart);
                if(riqiend!=null) ew.le("riqi", riqiend);

		PageUtils page = zuoyexinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zuoyexinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZuoyexinxiEntity zuoyexinxi){
       	EntityWrapper<ZuoyexinxiEntity> ew = new EntityWrapper<ZuoyexinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zuoyexinxi, "zuoyexinxi")); 
        return R.ok().put("data", zuoyexinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZuoyexinxiEntity zuoyexinxi){
        EntityWrapper< ZuoyexinxiEntity> ew = new EntityWrapper< ZuoyexinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zuoyexinxi, "zuoyexinxi")); 
		ZuoyexinxiView zuoyexinxiView =  zuoyexinxiService.selectView(ew);
		return R.ok("查询作业信息成功").put("data", zuoyexinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZuoyexinxiEntity zuoyexinxi = zuoyexinxiService.selectById(id);
		zuoyexinxi = zuoyexinxiService.selectView(new EntityWrapper<ZuoyexinxiEntity>().eq("id", id));
        return R.ok().put("data", zuoyexinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZuoyexinxiEntity zuoyexinxi = zuoyexinxiService.selectById(id);
		zuoyexinxi = zuoyexinxiService.selectView(new EntityWrapper<ZuoyexinxiEntity>().eq("id", id));
        return R.ok().put("data", zuoyexinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZuoyexinxiEntity zuoyexinxi, HttpServletRequest request){
    	zuoyexinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zuoyexinxi);
        zuoyexinxiService.insert(zuoyexinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZuoyexinxiEntity zuoyexinxi, HttpServletRequest request){
    	zuoyexinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zuoyexinxi);
        zuoyexinxiService.insert(zuoyexinxi);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ZuoyexinxiEntity zuoyexinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zuoyexinxi);
        zuoyexinxiService.updateById(zuoyexinxi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zuoyexinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
