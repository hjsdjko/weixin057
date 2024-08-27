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


import com.cl.dao.TongzhixinxiDao;
import com.cl.entity.TongzhixinxiEntity;
import com.cl.service.TongzhixinxiService;
import com.cl.entity.view.TongzhixinxiView;

@Service("tongzhixinxiService")
public class TongzhixinxiServiceImpl extends ServiceImpl<TongzhixinxiDao, TongzhixinxiEntity> implements TongzhixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TongzhixinxiEntity> page = this.selectPage(
                new Query<TongzhixinxiEntity>(params).getPage(),
                new EntityWrapper<TongzhixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TongzhixinxiEntity> wrapper) {
		  Page<TongzhixinxiView> page =new Query<TongzhixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<TongzhixinxiView> selectListView(Wrapper<TongzhixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TongzhixinxiView selectView(Wrapper<TongzhixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
