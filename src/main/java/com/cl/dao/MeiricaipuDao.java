package com.cl.dao;

import com.cl.entity.MeiricaipuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.MeiricaipuView;


/**
 * 每日菜谱
 * 
 * @author 
 * @email 
 * @date 2024-03-12 16:08:27
 */
public interface MeiricaipuDao extends BaseMapper<MeiricaipuEntity> {
	
	List<MeiricaipuView> selectListView(@Param("ew") Wrapper<MeiricaipuEntity> wrapper);

	List<MeiricaipuView> selectListView(Pagination page,@Param("ew") Wrapper<MeiricaipuEntity> wrapper);
	
	MeiricaipuView selectView(@Param("ew") Wrapper<MeiricaipuEntity> wrapper);
	

}
