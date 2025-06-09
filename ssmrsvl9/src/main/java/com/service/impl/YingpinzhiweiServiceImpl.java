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


import com.dao.YingpinzhiweiDao;
import com.entity.YingpinzhiweiEntity;
import com.service.YingpinzhiweiService;
import com.entity.vo.YingpinzhiweiVO;
import com.entity.view.YingpinzhiweiView;

@Service("yingpinzhiweiService")
public class YingpinzhiweiServiceImpl extends ServiceImpl<YingpinzhiweiDao, YingpinzhiweiEntity> implements YingpinzhiweiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YingpinzhiweiEntity> page = this.selectPage(
                new Query<YingpinzhiweiEntity>(params).getPage(),
                new EntityWrapper<YingpinzhiweiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YingpinzhiweiEntity> wrapper) {
		  Page<YingpinzhiweiView> page =new Query<YingpinzhiweiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YingpinzhiweiVO> selectListVO(Wrapper<YingpinzhiweiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YingpinzhiweiVO selectVO(Wrapper<YingpinzhiweiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YingpinzhiweiView> selectListView(Wrapper<YingpinzhiweiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YingpinzhiweiView selectView(Wrapper<YingpinzhiweiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
