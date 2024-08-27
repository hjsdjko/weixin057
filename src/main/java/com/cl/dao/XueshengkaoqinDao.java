package com.cl.dao;

import com.cl.entity.XueshengkaoqinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.XueshengkaoqinView;


/**
 * 学生考勤
 * 
 * @author 
 * @email 
 * @date 2024-03-12 16:08:27
 */
public interface XueshengkaoqinDao extends BaseMapper<XueshengkaoqinEntity> {
	
	List<XueshengkaoqinView> selectListView(@Param("ew") Wrapper<XueshengkaoqinEntity> wrapper);

	List<XueshengkaoqinView> selectListView(Pagination page,@Param("ew") Wrapper<XueshengkaoqinEntity> wrapper);
	
	XueshengkaoqinView selectView(@Param("ew") Wrapper<XueshengkaoqinEntity> wrapper);
	

}
