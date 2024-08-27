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


import com.cl.dao.FankuijiluDao;
import com.cl.entity.FankuijiluEntity;
import com.cl.service.FankuijiluService;
import com.cl.entity.view.FankuijiluView;

@Service("fankuijiluService")
public class FankuijiluServiceImpl extends ServiceImpl<FankuijiluDao, FankuijiluEntity> implements FankuijiluService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FankuijiluEntity> page = this.selectPage(
                new Query<FankuijiluEntity>(params).getPage(),
                new EntityWrapper<FankuijiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FankuijiluEntity> wrapper) {
		  Page<FankuijiluView> page =new Query<FankuijiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<FankuijiluView> selectListView(Wrapper<FankuijiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FankuijiluView selectView(Wrapper<FankuijiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
