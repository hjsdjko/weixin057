package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.ZuoyexinxiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ZuoyexinxiView;


/**
 * 作业信息
 *
 * @author 
 * @email 
 * @date 2024-03-12 16:08:27
 */
public interface ZuoyexinxiService extends IService<ZuoyexinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZuoyexinxiView> selectListView(Wrapper<ZuoyexinxiEntity> wrapper);
   	
   	ZuoyexinxiView selectView(@Param("ew") Wrapper<ZuoyexinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZuoyexinxiEntity> wrapper);
   	

}

