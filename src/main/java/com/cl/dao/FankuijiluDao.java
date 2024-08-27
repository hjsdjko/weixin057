package com.cl.dao;

import com.cl.entity.FankuijiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.FankuijiluView;


/**
 * 反馈记录
 * 
 * @author 
 * @email 
 * @date 2024-03-12 16:08:27
 */
public interface FankuijiluDao extends BaseMapper<FankuijiluEntity> {
	
	List<FankuijiluView> selectListView(@Param("ew") Wrapper<FankuijiluEntity> wrapper);

	List<FankuijiluView> selectListView(Pagination page,@Param("ew") Wrapper<FankuijiluEntity> wrapper);
	
	FankuijiluView selectView(@Param("ew") Wrapper<FankuijiluEntity> wrapper);
	

}
