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

import com.cl.entity.JiaoshipingjiaEntity;
import com.cl.entity.view.JiaoshipingjiaView;

import com.cl.service.JiaoshipingjiaService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 教师评价
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-12 16:08:27
 */
@RestController
@RequestMapping("/jiaoshipingjia")
public class JiaoshipingjiaController {
    @Autowired
    private JiaoshipingjiaService jiaoshipingjiaService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JiaoshipingjiaEntity jiaoshipingjia,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaoshi")) {
			jiaoshipingjia.setJiaoshigonghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("jiazhang")) {
			jiaoshipingjia.setJiazhangzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<JiaoshipingjiaEntity> ew = new EntityWrapper<JiaoshipingjiaEntity>();

		PageUtils page = jiaoshipingjiaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiaoshipingjia), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JiaoshipingjiaEntity jiaoshipingjia, 
		HttpServletRequest request){
        EntityWrapper<JiaoshipingjiaEntity> ew = new EntityWrapper<JiaoshipingjiaEntity>();

		PageUtils page = jiaoshipingjiaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiaoshipingjia), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JiaoshipingjiaEntity jiaoshipingjia){
       	EntityWrapper<JiaoshipingjiaEntity> ew = new EntityWrapper<JiaoshipingjiaEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jiaoshipingjia, "jiaoshipingjia")); 
        return R.ok().put("data", jiaoshipingjiaService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JiaoshipingjiaEntity jiaoshipingjia){
        EntityWrapper< JiaoshipingjiaEntity> ew = new EntityWrapper< JiaoshipingjiaEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jiaoshipingjia, "jiaoshipingjia")); 
		JiaoshipingjiaView jiaoshipingjiaView =  jiaoshipingjiaService.selectView(ew);
		return R.ok("查询教师评价成功").put("data", jiaoshipingjiaView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JiaoshipingjiaEntity jiaoshipingjia = jiaoshipingjiaService.selectById(id);
		jiaoshipingjia = jiaoshipingjiaService.selectView(new EntityWrapper<JiaoshipingjiaEntity>().eq("id", id));
        return R.ok().put("data", jiaoshipingjia);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JiaoshipingjiaEntity jiaoshipingjia = jiaoshipingjiaService.selectById(id);
		jiaoshipingjia = jiaoshipingjiaService.selectView(new EntityWrapper<JiaoshipingjiaEntity>().eq("id", id));
        return R.ok().put("data", jiaoshipingjia);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JiaoshipingjiaEntity jiaoshipingjia, HttpServletRequest request){
    	jiaoshipingjia.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiaoshipingjia);
        jiaoshipingjiaService.insert(jiaoshipingjia);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JiaoshipingjiaEntity jiaoshipingjia, HttpServletRequest request){
    	jiaoshipingjia.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiaoshipingjia);
        jiaoshipingjiaService.insert(jiaoshipingjia);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody JiaoshipingjiaEntity jiaoshipingjia, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jiaoshipingjia);
        jiaoshipingjiaService.updateById(jiaoshipingjia);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jiaoshipingjiaService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
