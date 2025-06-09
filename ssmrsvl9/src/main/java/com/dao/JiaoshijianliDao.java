package com.dao;

import com.entity.JiaoshijianliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaoshijianliVO;
import com.entity.view.JiaoshijianliView;


/**
 * 教师简历
 * 
 * @author 
 * @email 
 * @date 2021-03-21 10:50:09
 */
public interface JiaoshijianliDao extends BaseMapper<JiaoshijianliEntity> {
	
	List<JiaoshijianliVO> selectListVO(@Param("ew") Wrapper<JiaoshijianliEntity> wrapper);
	
	JiaoshijianliVO selectVO(@Param("ew") Wrapper<JiaoshijianliEntity> wrapper);
	
	List<JiaoshijianliView> selectListView(@Param("ew") Wrapper<JiaoshijianliEntity> wrapper);

	List<JiaoshijianliView> selectListView(Pagination page,@Param("ew") Wrapper<JiaoshijianliEntity> wrapper);
	
	JiaoshijianliView selectView(@Param("ew") Wrapper<JiaoshijianliEntity> wrapper);
	
}
