package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhaopinjiaoshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhaopinjiaoshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhaopinjiaoshiView;


/**
 * 招聘教师
 *
 * @author 
 * @email 
 * @date 2021-03-21 10:50:09
 */
public interface ZhaopinjiaoshiService extends IService<ZhaopinjiaoshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhaopinjiaoshiVO> selectListVO(Wrapper<ZhaopinjiaoshiEntity> wrapper);
   	
   	ZhaopinjiaoshiVO selectVO(@Param("ew") Wrapper<ZhaopinjiaoshiEntity> wrapper);
   	
   	List<ZhaopinjiaoshiView> selectListView(Wrapper<ZhaopinjiaoshiEntity> wrapper);
   	
   	ZhaopinjiaoshiView selectView(@Param("ew") Wrapper<ZhaopinjiaoshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhaopinjiaoshiEntity> wrapper);
   	
}

