package com.xsh.dao;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author 徐思晗
 * @date   2018年10月3日
 * @email  xshlxx@126.com
 * @version 1.0
 */
@Mapper
public interface AccountDao {
	
	void outMoney(Map<String,Object> map);
	
	void inMoney(Map<String,Object> map);
}
