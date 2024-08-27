package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.XueshengkaoqinEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.XueshengkaoqinView;


/**
 * 学生考勤
 *
 * @author 
 * @email 
 * @date 2024-03-12 16:08:27
 */
public interface XueshengkaoqinService extends IService<XueshengkaoqinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshengkaoqinView> selectListView(Wrapper<XueshengkaoqinEntity> wrapper);
   	
   	XueshengkaoqinView selectView(@Param("ew") Wrapper<XueshengkaoqinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshengkaoqinEntity> wrapper);
   	

}

