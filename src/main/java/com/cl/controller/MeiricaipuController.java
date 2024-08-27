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

import com.cl.entity.MeiricaipuEntity;
import com.cl.entity.view.MeiricaipuView;

import com.cl.service.MeiricaipuService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 每日菜谱
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-12 16:08:27
 */
@RestController
@RequestMapping("/meiricaipu")
public class MeiricaipuController {
    @Autowired
    private MeiricaipuService meiricaipuService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,MeiricaipuEntity meiricaipu,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date riqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date riqiend,
		HttpServletRequest request){
        EntityWrapper<MeiricaipuEntity> ew = new EntityWrapper<MeiricaipuEntity>();
                if(riqistart!=null) ew.ge("riqi", riqistart);
                if(riqiend!=null) ew.le("riqi", riqiend);

		PageUtils page = meiricaipuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, meiricaipu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,MeiricaipuEntity meiricaipu, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date riqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date riqiend,
		HttpServletRequest request){
        EntityWrapper<MeiricaipuEntity> ew = new EntityWrapper<MeiricaipuEntity>();
                if(riqistart!=null) ew.ge("riqi", riqistart);
                if(riqiend!=null) ew.le("riqi", riqiend);

		PageUtils page = meiricaipuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, meiricaipu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( MeiricaipuEntity meiricaipu){
       	EntityWrapper<MeiricaipuEntity> ew = new EntityWrapper<MeiricaipuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( meiricaipu, "meiricaipu")); 
        return R.ok().put("data", meiricaipuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(MeiricaipuEntity meiricaipu){
        EntityWrapper< MeiricaipuEntity> ew = new EntityWrapper< MeiricaipuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( meiricaipu, "meiricaipu")); 
		MeiricaipuView meiricaipuView =  meiricaipuService.selectView(ew);
		return R.ok("查询每日菜谱成功").put("data", meiricaipuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        MeiricaipuEntity meiricaipu = meiricaipuService.selectById(id);
		meiricaipu = meiricaipuService.selectView(new EntityWrapper<MeiricaipuEntity>().eq("id", id));
        return R.ok().put("data", meiricaipu);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        MeiricaipuEntity meiricaipu = meiricaipuService.selectById(id);
		meiricaipu = meiricaipuService.selectView(new EntityWrapper<MeiricaipuEntity>().eq("id", id));
        return R.ok().put("data", meiricaipu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody MeiricaipuEntity meiricaipu, HttpServletRequest request){
    	meiricaipu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(meiricaipu);
        meiricaipuService.insert(meiricaipu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody MeiricaipuEntity meiricaipu, HttpServletRequest request){
    	meiricaipu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(meiricaipu);
        meiricaipuService.insert(meiricaipu);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody MeiricaipuEntity meiricaipu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(meiricaipu);
        meiricaipuService.updateById(meiricaipu);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        meiricaipuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
