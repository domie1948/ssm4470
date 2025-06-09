package com.dao;

import com.entity.YingpinzhiweiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YingpinzhiweiVO;
import com.entity.view.YingpinzhiweiView;


/**
 * 应聘职位
 * 
 * @author 
 * @email 
 * @date 2021-03-21 10:50:09
 */
public interface YingpinzhiweiDao extends BaseMapper<YingpinzhiweiEntity> {
	
	List<YingpinzhiweiVO> selectListVO(@Param("ew") Wrapper<YingpinzhiweiEntity> wrapper);
	
	YingpinzhiweiVO selectVO(@Param("ew") Wrapper<YingpinzhiweiEntity> wrapper);
	
	List<YingpinzhiweiView> selectListView(@Param("ew") Wrapper<YingpinzhiweiEntity> wrapper);

	List<YingpinzhiweiView> selectListView(Pagination page,@Param("ew") Wrapper<YingpinzhiweiEntity> wrapper);
	
	YingpinzhiweiView selectView(@Param("ew") Wrapper<YingpinzhiweiEntity> wrapper);
	
}
