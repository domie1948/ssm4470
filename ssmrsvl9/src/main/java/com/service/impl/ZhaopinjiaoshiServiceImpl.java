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


import com.dao.ZhaopinjiaoshiDao;
import com.entity.ZhaopinjiaoshiEntity;
import com.service.ZhaopinjiaoshiService;
import com.entity.vo.ZhaopinjiaoshiVO;
import com.entity.view.ZhaopinjiaoshiView;

@Service("zhaopinjiaoshiService")
public class ZhaopinjiaoshiServiceImpl extends ServiceImpl<ZhaopinjiaoshiDao, ZhaopinjiaoshiEntity> implements ZhaopinjiaoshiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhaopinjiaoshiEntity> page = this.selectPage(
                new Query<ZhaopinjiaoshiEntity>(params).getPage(),
                new EntityWrapper<ZhaopinjiaoshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhaopinjiaoshiEntity> wrapper) {
		  Page<ZhaopinjiaoshiView> page =new Query<ZhaopinjiaoshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhaopinjiaoshiVO> selectListVO(Wrapper<ZhaopinjiaoshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhaopinjiaoshiVO selectVO(Wrapper<ZhaopinjiaoshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhaopinjiaoshiView> selectListView(Wrapper<ZhaopinjiaoshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhaopinjiaoshiView selectView(Wrapper<ZhaopinjiaoshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
