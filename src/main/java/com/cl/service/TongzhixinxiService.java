package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.TongzhixinxiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.TongzhixinxiView;


/**
 * 通知信息
 *
 * @author 
 * @email 
 * @date 2024-03-12 16:08:27
 */
public interface TongzhixinxiService extends IService<TongzhixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TongzhixinxiView> selectListView(Wrapper<TongzhixinxiEntity> wrapper);
   	
   	TongzhixinxiView selectView(@Param("ew") Wrapper<TongzhixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TongzhixinxiEntity> wrapper);
   	

}
