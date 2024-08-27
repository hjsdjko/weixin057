package com.cl.dao;

import com.cl.entity.ZuoyexinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ZuoyexinxiView;


/**
 * 作业信息
 * 
 * @author 
 * @email 
 * @date 2024-03-12 16:08:27
 */
public interface ZuoyexinxiDao extends BaseMapper<ZuoyexinxiEntity> {
	
	List<ZuoyexinxiView> selectListView(@Param("ew") Wrapper<ZuoyexinxiEntity> wrapper);

	List<ZuoyexinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ZuoyexinxiEntity> wrapper);
	
	ZuoyexinxiView selectView(@Param("ew") Wrapper<ZuoyexinxiEntity> wrapper);
	

}
