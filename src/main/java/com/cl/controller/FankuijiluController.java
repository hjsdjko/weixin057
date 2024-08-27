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

import com.cl.entity.FankuijiluEntity;
import com.cl.entity.view.FankuijiluView;

import com.cl.service.FankuijiluService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 反馈记录
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-12 16:08:27
 */
@RestController
@RequestMapping("/fankuijilu")
public class FankuijiluController {
    @Autowired
    private FankuijiluService fankuijiluService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,FankuijiluEntity fankuijilu,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiazhang")) {
			fankuijilu.setJiazhangzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("jiaoshi")) {
			fankuijilu.setJiaoshigonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<FankuijiluEntity> ew = new EntityWrapper<FankuijiluEntity>();

		PageUtils page = fankuijiluService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fankuijilu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,FankuijiluEntity fankuijilu, 
		HttpServletRequest request){
        EntityWrapper<FankuijiluEntity> ew = new EntityWrapper<FankuijiluEntity>();

		PageUtils page = fankuijiluService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fankuijilu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( FankuijiluEntity fankuijilu){
       	EntityWrapper<FankuijiluEntity> ew = new EntityWrapper<FankuijiluEntity>();
      	ew.allEq(MPUtil.allEQMapPre( fankuijilu, "fankuijilu")); 
        return R.ok().put("data", fankuijiluService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(FankuijiluEntity fankuijilu){
        EntityWrapper< FankuijiluEntity> ew = new EntityWrapper< FankuijiluEntity>();
 		ew.allEq(MPUtil.allEQMapPre( fankuijilu, "fankuijilu")); 
		FankuijiluView fankuijiluView =  fankuijiluService.selectView(ew);
		return R.ok("查询反馈记录成功").put("data", fankuijiluView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        FankuijiluEntity fankuijilu = fankuijiluService.selectById(id);
		fankuijilu = fankuijiluService.selectView(new EntityWrapper<FankuijiluEntity>().eq("id", id));
        return R.ok().put("data", fankuijilu);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        FankuijiluEntity fankuijilu = fankuijiluService.selectById(id);
		fankuijilu = fankuijiluService.selectView(new EntityWrapper<FankuijiluEntity>().eq("id", id));
        return R.ok().put("data", fankuijilu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody FankuijiluEntity fankuijilu, HttpServletRequest request){
    	fankuijilu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(fankuijilu);
        fankuijiluService.insert(fankuijilu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody FankuijiluEntity fankuijilu, HttpServletRequest request){
    	fankuijilu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(fankuijilu);
        fankuijiluService.insert(fankuijilu);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody FankuijiluEntity fankuijilu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(fankuijilu);
        fankuijiluService.updateById(fankuijilu);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        fankuijiluService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
