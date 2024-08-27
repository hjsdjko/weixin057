package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.TongzhileixingEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.TongzhileixingView;


/**
 * 通知类型
 *
 * @author 
 * @email 
 * @date 2024-03-12 16:08:27
 */
public interface TongzhileixingService extends IService<TongzhileixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TongzhileixingView> selectListView(Wrapper<TongzhileixingEntity> wrapper);
   	
   	TongzhileixingView selectView(@Param("ew") Wrapper<TongzhileixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TongzhileixingEntity> wrapper);
   	

}

