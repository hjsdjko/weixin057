package com.cl.dao;

import com.cl.entity.TongzhileixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.TongzhileixingView;


/**
 * 通知类型
 * 
 * @author 
 * @email 
 * @date 2024-03-12 16:08:27
 */
public interface TongzhileixingDao extends BaseMapper<TongzhileixingEntity> {
	
	List<TongzhileixingView> selectListView(@Param("ew") Wrapper<TongzhileixingEntity> wrapper);

	List<TongzhileixingView> selectListView(Pagination page,@Param("ew") Wrapper<TongzhileixingEntity> wrapper);
	
	TongzhileixingView selectView(@Param("ew") Wrapper<TongzhileixingEntity> wrapper);
	

}
