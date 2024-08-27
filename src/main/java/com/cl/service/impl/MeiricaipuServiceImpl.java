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


import com.cl.dao.MeiricaipuDao;
import com.cl.entity.MeiricaipuEntity;
import com.cl.service.MeiricaipuService;
import com.cl.entity.view.MeiricaipuView;

@Service("meiricaipuService")
public class MeiricaipuServiceImpl extends ServiceImpl<MeiricaipuDao, MeiricaipuEntity> implements MeiricaipuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MeiricaipuEntity> page = this.selectPage(
                new Query<MeiricaipuEntity>(params).getPage(),
                new EntityWrapper<MeiricaipuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MeiricaipuEntity> wrapper) {
		  Page<MeiricaipuView> page =new Query<MeiricaipuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<MeiricaipuView> selectListView(Wrapper<MeiricaipuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MeiricaipuView selectView(Wrapper<MeiricaipuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
