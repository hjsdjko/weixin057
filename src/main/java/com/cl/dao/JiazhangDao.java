package com.cl.dao;

import com.cl.entity.JiazhangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.JiazhangView;


/**
 * 家长
 * 
 * @author 
 * @email 
 * @date 2024-03-12 16:08:27
 */
public interface JiazhangDao extends BaseMapper<JiazhangEntity> {
	
	List<JiazhangView> selectListView(@Param("ew") Wrapper<JiazhangEntity> wrapper);

	List<JiazhangView> selectListView(Pagination page,@Param("ew") Wrapper<JiazhangEntity> wrapper);
	
	JiazhangView selectView(@Param("ew") Wrapper<JiazhangEntity> wrapper);
	

}
