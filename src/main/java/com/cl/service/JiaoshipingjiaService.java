package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.JiaoshipingjiaEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.JiaoshipingjiaView;


/**
 * 教师评价
 *
 * @author 
 * @email 
 * @date 2024-03-12 16:08:27
 */
public interface JiaoshipingjiaService extends IService<JiaoshipingjiaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaoshipingjiaView> selectListView(Wrapper<JiaoshipingjiaEntity> wrapper);
   	
   	JiaoshipingjiaView selectView(@Param("ew") Wrapper<JiaoshipingjiaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaoshipingjiaEntity> wrapper);
   	

}

