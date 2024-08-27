package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.FankuijiluEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.FankuijiluView;


/**
 * 反馈记录
 *
 * @author 
 * @email 
 * @date 2024-03-12 16:08:27
 */
public interface FankuijiluService extends IService<FankuijiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FankuijiluView> selectListView(Wrapper<FankuijiluEntity> wrapper);
   	
   	FankuijiluView selectView(@Param("ew") Wrapper<FankuijiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FankuijiluEntity> wrapper);
   	

}

