package com.entity.view;

import com.entity.YingpinzhiweiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 应聘职位
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-21 10:50:09
 */
@TableName("yingpinzhiwei")
public class YingpinzhiweiView  extends YingpinzhiweiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YingpinzhiweiView(){
	}
 
 	public YingpinzhiweiView(YingpinzhiweiEntity yingpinzhiweiEntity){
 	try {
			BeanUtils.copyProperties(this, yingpinzhiweiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
