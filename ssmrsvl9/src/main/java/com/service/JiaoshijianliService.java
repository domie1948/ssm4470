package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaoshijianliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaoshijianliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaoshijianliView;


/**
 * 教师简历
 *
 * @author 
 * @email 
 * @date 2021-03-21 10:50:09
 */
public interface JiaoshijianliService extends IService<JiaoshijianliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaoshijianliVO> selectListVO(Wrapper<JiaoshijianliEntity> wrapper);
   	
   	JiaoshijianliVO selectVO(@Param("ew") Wrapper<JiaoshijianliEntity> wrapper);
   	
   	List<JiaoshijianliView> selectListView(Wrapper<JiaoshijianliEntity> wrapper);
   	
   	JiaoshijianliView selectView(@Param("ew") Wrapper<JiaoshijianliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaoshijianliEntity> wrapper);
   	
}

