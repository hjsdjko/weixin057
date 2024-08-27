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


import com.cl.dao.TongzhileixingDao;
import com.cl.entity.TongzhileixingEntity;
import com.cl.service.TongzhileixingService;
import com.cl.entity.view.TongzhileixingView;

@Service("tongzhileixingService")
public class TongzhileixingServiceImpl extends ServiceImpl<TongzhileixingDao, TongzhileixingEntity> implements TongzhileixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TongzhileixingEntity> page = this.selectPage(
                new Query<TongzhileixingEntity>(params).getPage(),
                new EntityWrapper<TongzhileixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TongzhileixingEntity> wrapper) {
		  Page<TongzhileixingView> page =new Query<TongzhileixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<TongzhileixingView> selectListView(Wrapper<TongzhileixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TongzhileixingView selectView(Wrapper<TongzhileixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
