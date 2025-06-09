package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ZhaopinjiaoshiEntity;
import com.entity.view.ZhaopinjiaoshiView;

import com.service.ZhaopinjiaoshiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 招聘教师
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-21 10:50:09
 */
@RestController
@RequestMapping("/zhaopinjiaoshi")
public class ZhaopinjiaoshiController {
    @Autowired
    private ZhaopinjiaoshiService zhaopinjiaoshiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZhaopinjiaoshiEntity zhaopinjiaoshi, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			zhaopinjiaoshi.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZhaopinjiaoshiEntity> ew = new EntityWrapper<ZhaopinjiaoshiEntity>();
		PageUtils page = zhaopinjiaoshiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhaopinjiaoshi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZhaopinjiaoshiEntity zhaopinjiaoshi, HttpServletRequest request){
        EntityWrapper<ZhaopinjiaoshiEntity> ew = new EntityWrapper<ZhaopinjiaoshiEntity>();
		PageUtils page = zhaopinjiaoshiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhaopinjiaoshi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZhaopinjiaoshiEntity zhaopinjiaoshi){
       	EntityWrapper<ZhaopinjiaoshiEntity> ew = new EntityWrapper<ZhaopinjiaoshiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zhaopinjiaoshi, "zhaopinjiaoshi")); 
        return R.ok().put("data", zhaopinjiaoshiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZhaopinjiaoshiEntity zhaopinjiaoshi){
        EntityWrapper< ZhaopinjiaoshiEntity> ew = new EntityWrapper< ZhaopinjiaoshiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zhaopinjiaoshi, "zhaopinjiaoshi")); 
		ZhaopinjiaoshiView zhaopinjiaoshiView =  zhaopinjiaoshiService.selectView(ew);
		return R.ok("查询招聘教师成功").put("data", zhaopinjiaoshiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZhaopinjiaoshiEntity zhaopinjiaoshi = zhaopinjiaoshiService.selectById(id);
		zhaopinjiaoshi.setClicknum(zhaopinjiaoshi.getClicknum()+1);
		zhaopinjiaoshi.setClicktime(new Date());
		zhaopinjiaoshiService.updateById(zhaopinjiaoshi);
        return R.ok().put("data", zhaopinjiaoshi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZhaopinjiaoshiEntity zhaopinjiaoshi = zhaopinjiaoshiService.selectById(id);
		zhaopinjiaoshi.setClicknum(zhaopinjiaoshi.getClicknum()+1);
		zhaopinjiaoshi.setClicktime(new Date());
		zhaopinjiaoshiService.updateById(zhaopinjiaoshi);
        return R.ok().put("data", zhaopinjiaoshi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZhaopinjiaoshiEntity zhaopinjiaoshi, HttpServletRequest request){
    	zhaopinjiaoshi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhaopinjiaoshi);

        zhaopinjiaoshiService.insert(zhaopinjiaoshi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZhaopinjiaoshiEntity zhaopinjiaoshi, HttpServletRequest request){
    	zhaopinjiaoshi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhaopinjiaoshi);

        zhaopinjiaoshiService.insert(zhaopinjiaoshi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ZhaopinjiaoshiEntity zhaopinjiaoshi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zhaopinjiaoshi);
        zhaopinjiaoshiService.updateById(zhaopinjiaoshi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zhaopinjiaoshiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ZhaopinjiaoshiEntity> wrapper = new EntityWrapper<ZhaopinjiaoshiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("zhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = zhaopinjiaoshiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,ZhaopinjiaoshiEntity zhaopinjiaoshi, HttpServletRequest request,String pre){
        EntityWrapper<ZhaopinjiaoshiEntity> ew = new EntityWrapper<ZhaopinjiaoshiEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicknum");
        
        params.put("order", "desc");
		PageUtils page = zhaopinjiaoshiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhaopinjiaoshi), params), params));
        return R.ok().put("data", page);
    }


}
