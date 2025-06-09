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


import com.dao.JiaoshijianliDao;
import com.entity.JiaoshijianliEntity;
import com.service.JiaoshijianliService;
import com.entity.vo.JiaoshijianliVO;
import com.entity.view.JiaoshijianliView;

@Service("jiaoshijianliService")
public class JiaoshijianliServiceImpl extends ServiceImpl<JiaoshijianliDao, JiaoshijianliEntity> implements JiaoshijianliService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaoshijianliEntity> page = this.selectPage(
                new Query<JiaoshijianliEntity>(params).getPage(),
                new EntityWrapper<JiaoshijianliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaoshijianliEntity> wrapper) {
		  Page<JiaoshijianliView> page =new Query<JiaoshijianliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaoshijianliVO> selectListVO(Wrapper<JiaoshijianliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaoshijianliVO selectVO(Wrapper<JiaoshijianliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaoshijianliView> selectListView(Wrapper<JiaoshijianliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaoshijianliView selectView(Wrapper<JiaoshijianliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
