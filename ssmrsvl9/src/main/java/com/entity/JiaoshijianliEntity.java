package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 教师简历
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-21 10:50:09
 */
@TableName("jiaoshijianli")
public class JiaoshijianliEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiaoshijianliEntity() {
		
	}
	
	public JiaoshijianliEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 教师工号
	 */
					
	private String jiaoshigonghao;
	
	/**
	 * 教师姓名
	 */
					
	private String jiaoshixingming;
	
	/**
	 * 专业
	 */
					
	private String zhuanye;
	
	/**
	 * 学历
	 */
					
	private String xueli;
	
	/**
	 * 性别
	 */
					
	private String xingbie;
	
	/**
	 * 照片
	 */
					
	private String zhaopian;
	
	/**
	 * 出生日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date chushengriqi;
	
	/**
	 * 工作经历
	 */
					
	private String gongzuojingli;
	
	/**
	 * 个人特长
	 */
					
	private String gerentezhang;
	
	/**
	 * 期望薪资
	 */
					
	private Integer qiwangxinzi;
	
	/**
	 * 教育背景
	 */
					
	private String jiaoyubeijing;
	
	/**
	 * 获奖证书
	 */
					
	private String huojiangzhengshu;
	
	/**
	 * 毕业学校
	 */
					
	private String biyexuexiao;
	
	/**
	 * 详细内容
	 */
					
	private String xiangxineirong;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：教师工号
	 */
	public void setJiaoshigonghao(String jiaoshigonghao) {
		this.jiaoshigonghao = jiaoshigonghao;
	}
	/**
	 * 获取：教师工号
	 */
	public String getJiaoshigonghao() {
		return jiaoshigonghao;
	}
	/**
	 * 设置：教师姓名
	 */
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}
	/**
	 * 设置：专业
	 */
	public void setZhuanye(String zhuanye) {
		this.zhuanye = zhuanye;
	}
	/**
	 * 获取：专业
	 */
	public String getZhuanye() {
		return zhuanye;
	}
	/**
	 * 设置：学历
	 */
	public void setXueli(String xueli) {
		this.xueli = xueli;
	}
	/**
	 * 获取：学历
	 */
	public String getXueli() {
		return xueli;
	}
	/**
	 * 设置：性别
	 */
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
	/**
	 * 设置：照片
	 */
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
	}
	/**
	 * 设置：出生日期
	 */
	public void setChushengriqi(Date chushengriqi) {
		this.chushengriqi = chushengriqi;
	}
	/**
	 * 获取：出生日期
	 */
	public Date getChushengriqi() {
		return chushengriqi;
	}
	/**
	 * 设置：工作经历
	 */
	public void setGongzuojingli(String gongzuojingli) {
		this.gongzuojingli = gongzuojingli;
	}
	/**
	 * 获取：工作经历
	 */
	public String getGongzuojingli() {
		return gongzuojingli;
	}
	/**
	 * 设置：个人特长
	 */
	public void setGerentezhang(String gerentezhang) {
		this.gerentezhang = gerentezhang;
	}
	/**
	 * 获取：个人特长
	 */
	public String getGerentezhang() {
		return gerentezhang;
	}
	/**
	 * 设置：期望薪资
	 */
	public void setQiwangxinzi(Integer qiwangxinzi) {
		this.qiwangxinzi = qiwangxinzi;
	}
	/**
	 * 获取：期望薪资
	 */
	public Integer getQiwangxinzi() {
		return qiwangxinzi;
	}
	/**
	 * 设置：教育背景
	 */
	public void setJiaoyubeijing(String jiaoyubeijing) {
		this.jiaoyubeijing = jiaoyubeijing;
	}
	/**
	 * 获取：教育背景
	 */
	public String getJiaoyubeijing() {
		return jiaoyubeijing;
	}
	/**
	 * 设置：获奖证书
	 */
	public void setHuojiangzhengshu(String huojiangzhengshu) {
		this.huojiangzhengshu = huojiangzhengshu;
	}
	/**
	 * 获取：获奖证书
	 */
	public String getHuojiangzhengshu() {
		return huojiangzhengshu;
	}
	/**
	 * 设置：毕业学校
	 */
	public void setBiyexuexiao(String biyexuexiao) {
		this.biyexuexiao = biyexuexiao;
	}
	/**
	 * 获取：毕业学校
	 */
	public String getBiyexuexiao() {
		return biyexuexiao;
	}
	/**
	 * 设置：详细内容
	 */
	public void setXiangxineirong(String xiangxineirong) {
		this.xiangxineirong = xiangxineirong;
	}
	/**
	 * 获取：详细内容
	 */
	public String getXiangxineirong() {
		return xiangxineirong;
	}

}
