package com.entity.view;

import com.entity.JiaoshijianliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 教师简历
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-21 10:50:09
 */
@TableName("jiaoshijianli")
public class JiaoshijianliView  extends JiaoshijianliEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiaoshijianliView(){
	}
 
 	public JiaoshijianliView(JiaoshijianliEntity jiaoshijianliEntity){
 	try {
			BeanUtils.copyProperties(this, jiaoshijianliEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
