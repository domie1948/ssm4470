package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JiaoshishenqingDao;
import com.entity.JiaoshishenqingEntity;
import com.service.JiaoshishenqingService;
import com.entity.vo.JiaoshishenqingVO;
import com.entity.view.JiaoshishenqingView;

@Service("jiaoshishenqingService")
public class JiaoshishenqingServiceImpl extends ServiceImpl<JiaoshishenqingDao, JiaoshishenqingEntity> implements JiaoshishenqingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaoshishenqingEntity> page = this.selectPage(
                new Query<JiaoshishenqingEntity>(params).getPage(),
                new EntityWrapper<JiaoshishenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaoshishenqingEntity> wrapper) {
		  Page<JiaoshishenqingView> page =new Query<JiaoshishenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaoshishenqingVO> selectListVO(Wrapper<JiaoshishenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaoshishenqingVO selectVO(Wrapper<JiaoshishenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaoshishenqingView> selectListView(Wrapper<JiaoshishenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaoshishenqingView selectView(Wrapper<JiaoshishenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
