package com.cl.dao;

import com.cl.entity.TongzhixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.TongzhixinxiView;


/**
 * 通知信息
 * 
 * @author 
 * @email 
 * @date 2024-03-12 16:08:27
 */
public interface TongzhixinxiDao extends BaseMapper<TongzhixinxiEntity> {
	
	List<TongzhixinxiView> selectListView(@Param("ew") Wrapper<TongzhixinxiEntity> wrapper);

	List<TongzhixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<TongzhixinxiEntity> wrapper);
	
	TongzhixinxiView selectView(@Param("ew") Wrapper<TongzhixinxiEntity> wrapper);
	

}
