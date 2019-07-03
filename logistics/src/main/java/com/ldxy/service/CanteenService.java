package com.ldxy.service;

import java.util.List;

import com.ldxy.entity.Canteen;
import com.ldxy.entity.PageData;

/**
 * 食堂投诉service
 * @author bozpower
 *
 */
public interface CanteenService {
	
	/**
	 * 查询所有的投诉信息
	 * @param pageData
	 * @return
	 */
	public List<Canteen> selectCanteenList(PageData pageData);
	
	/**
	 * 根据投诉时间查询
	 * @param tsTime
	 * @return
	 */
	public List<Canteen> selectCanteenList(String tsTime);
	
	/**
	 * 新增投诉信息
	 * @param canteen
	 * @return
	 */
	public int insertCanteen(Canteen canteen);
	
	/**
	 * 删除投诉信息
	 * @param id
	 * @return
	 */
	public int deleteCanteen(int id);

}
