package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.MeiricaipuEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.MeiricaipuView;


/**
 * 每日菜谱
 *
 * @author 
 * @email 
 * @date 2024-03-12 16:08:27
 */
public interface MeiricaipuService extends IService<MeiricaipuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MeiricaipuView> selectListView(Wrapper<MeiricaipuEntity> wrapper);
   	
   	MeiricaipuView selectView(@Param("ew") Wrapper<MeiricaipuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MeiricaipuEntity> wrapper);
   	

}

