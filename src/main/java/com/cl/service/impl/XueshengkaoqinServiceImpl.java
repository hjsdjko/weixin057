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


import com.cl.dao.XueshengkaoqinDao;
import com.cl.entity.XueshengkaoqinEntity;
import com.cl.service.XueshengkaoqinService;
import com.cl.entity.view.XueshengkaoqinView;

@Service("xueshengkaoqinService")
public class XueshengkaoqinServiceImpl extends ServiceImpl<XueshengkaoqinDao, XueshengkaoqinEntity> implements XueshengkaoqinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueshengkaoqinEntity> page = this.selectPage(
                new Query<XueshengkaoqinEntity>(params).getPage(),
                new EntityWrapper<XueshengkaoqinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueshengkaoqinEntity> wrapper) {
		  Page<XueshengkaoqinView> page =new Query<XueshengkaoqinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<XueshengkaoqinView> selectListView(Wrapper<XueshengkaoqinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueshengkaoqinView selectView(Wrapper<XueshengkaoqinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
