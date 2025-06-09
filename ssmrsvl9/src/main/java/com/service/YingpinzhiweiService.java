package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YingpinzhiweiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YingpinzhiweiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YingpinzhiweiView;


/**
 * 应聘职位
 *
 * @author 
 * @email 
 * @date 2021-03-21 10:50:09
 */
public interface YingpinzhiweiService extends IService<YingpinzhiweiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YingpinzhiweiVO> selectListVO(Wrapper<YingpinzhiweiEntity> wrapper);
   	
   	YingpinzhiweiVO selectVO(@Param("ew") Wrapper<YingpinzhiweiEntity> wrapper);
   	
   	List<YingpinzhiweiView> selectListView(Wrapper<YingpinzhiweiEntity> wrapper);
   	
   	YingpinzhiweiView selectView(@Param("ew") Wrapper<YingpinzhiweiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YingpinzhiweiEntity> wrapper);
   	
}

