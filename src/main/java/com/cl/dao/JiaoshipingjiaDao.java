package com.cl.dao;

import com.cl.entity.JiaoshipingjiaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.JiaoshipingjiaView;


/**
 * 教师评价
 * 
 * @author 
 * @email 
 * @date 2024-03-12 16:08:27
 */
public interface JiaoshipingjiaDao extends BaseMapper<JiaoshipingjiaEntity> {
	
	List<JiaoshipingjiaView> selectListView(@Param("ew") Wrapper<JiaoshipingjiaEntity> wrapper);

	List<JiaoshipingjiaView> selectListView(Pagination page,@Param("ew") Wrapper<JiaoshipingjiaEntity> wrapper);
	
	JiaoshipingjiaView selectView(@Param("ew") Wrapper<JiaoshipingjiaEntity> wrapper);
	

}
