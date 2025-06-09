package com.dao;

import com.entity.ZhaopinjiaoshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhaopinjiaoshiVO;
import com.entity.view.ZhaopinjiaoshiView;


/**
 * 招聘教师
 * 
 * @author 
 * @email 
 * @date 2021-03-21 10:50:09
 */
public interface ZhaopinjiaoshiDao extends BaseMapper<ZhaopinjiaoshiEntity> {
	
	List<ZhaopinjiaoshiVO> selectListVO(@Param("ew") Wrapper<ZhaopinjiaoshiEntity> wrapper);
	
	ZhaopinjiaoshiVO selectVO(@Param("ew") Wrapper<ZhaopinjiaoshiEntity> wrapper);
	
	List<ZhaopinjiaoshiView> selectListView(@Param("ew") Wrapper<ZhaopinjiaoshiEntity> wrapper);

	List<ZhaopinjiaoshiView> selectListView(Pagination page,@Param("ew") Wrapper<ZhaopinjiaoshiEntity> wrapper);
	
	ZhaopinjiaoshiView selectView(@Param("ew") Wrapper<ZhaopinjiaoshiEntity> wrapper);
	
}
