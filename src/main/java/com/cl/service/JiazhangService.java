package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.JiazhangEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.JiazhangView;


/**
 * 家长
 *
 * @author 
 * @email 
 * @date 2024-03-12 16:08:27
 */
public interface JiazhangService extends IService<JiazhangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiazhangView> selectListView(Wrapper<JiazhangEntity> wrapper);
   	
   	JiazhangView selectView(@Param("ew") Wrapper<JiazhangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiazhangEntity> wrapper);
   	

}

