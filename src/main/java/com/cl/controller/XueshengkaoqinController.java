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

import com.cl.entity.XueshengkaoqinEntity;
import com.cl.entity.view.XueshengkaoqinView;

import com.cl.service.XueshengkaoqinService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 学生考勤
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-12 16:08:27
 */
@RestController
@RequestMapping("/xueshengkaoqin")
public class XueshengkaoqinController {
    @Autowired
    private XueshengkaoqinService xueshengkaoqinService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XueshengkaoqinEntity xueshengkaoqin,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiazhang")) {
			xueshengkaoqin.setJiazhangzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<XueshengkaoqinEntity> ew = new EntityWrapper<XueshengkaoqinEntity>();

		PageUtils page = xueshengkaoqinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xueshengkaoqin), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XueshengkaoqinEntity xueshengkaoqin, 
		HttpServletRequest request){
        EntityWrapper<XueshengkaoqinEntity> ew = new EntityWrapper<XueshengkaoqinEntity>();

		PageUtils page = xueshengkaoqinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xueshengkaoqin), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XueshengkaoqinEntity xueshengkaoqin){
       	EntityWrapper<XueshengkaoqinEntity> ew = new EntityWrapper<XueshengkaoqinEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xueshengkaoqin, "xueshengkaoqin")); 
        return R.ok().put("data", xueshengkaoqinService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XueshengkaoqinEntity xueshengkaoqin){
        EntityWrapper< XueshengkaoqinEntity> ew = new EntityWrapper< XueshengkaoqinEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xueshengkaoqin, "xueshengkaoqin")); 
		XueshengkaoqinView xueshengkaoqinView =  xueshengkaoqinService.selectView(ew);
		return R.ok("查询学生考勤成功").put("data", xueshengkaoqinView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XueshengkaoqinEntity xueshengkaoqin = xueshengkaoqinService.selectById(id);
		xueshengkaoqin = xueshengkaoqinService.selectView(new EntityWrapper<XueshengkaoqinEntity>().eq("id", id));
        return R.ok().put("data", xueshengkaoqin);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XueshengkaoqinEntity xueshengkaoqin = xueshengkaoqinService.selectById(id);
		xueshengkaoqin = xueshengkaoqinService.selectView(new EntityWrapper<XueshengkaoqinEntity>().eq("id", id));
        return R.ok().put("data", xueshengkaoqin);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XueshengkaoqinEntity xueshengkaoqin, HttpServletRequest request){
    	xueshengkaoqin.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xueshengkaoqin);
        xueshengkaoqinService.insert(xueshengkaoqin);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XueshengkaoqinEntity xueshengkaoqin, HttpServletRequest request){
    	xueshengkaoqin.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xueshengkaoqin);
        xueshengkaoqinService.insert(xueshengkaoqin);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody XueshengkaoqinEntity xueshengkaoqin, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xueshengkaoqin);
        xueshengkaoqinService.updateById(xueshengkaoqin);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xueshengkaoqinService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
