package com.cl.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cl.utils.PageUtils;
import com.cl.utils.Query;


import com.cl.dao.JiaoshipingjiaDao;
import com.cl.entity.JiaoshipingjiaEntity;
import com.cl.service.JiaoshipingjiaService;
import com.cl.entity.view.JiaoshipingjiaView;

@Service("jiaoshipingjiaService")
public class JiaoshipingjiaServiceImpl extends ServiceImpl<JiaoshipingjiaDao, JiaoshipingjiaEntity> implements JiaoshipingjiaService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaoshipingjiaEntity> page = this.selectPage(
                new Query<JiaoshipingjiaEntity>(params).getPage(),
                new EntityWrapper<JiaoshipingjiaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaoshipingjiaEntity> wrapper) {
		  Page<JiaoshipingjiaView> page =new Query<JiaoshipingjiaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<JiaoshipingjiaView> selectListView(Wrapper<JiaoshipingjiaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaoshipingjiaView selectView(Wrapper<JiaoshipingjiaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
