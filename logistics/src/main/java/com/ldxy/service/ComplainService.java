package com.ldxy.service;

import java.util.List;

import com.ldxy.entity.Complain;
import com.ldxy.entity.PageData;

/**
 * 食堂投诉service
 * @author bozpower
 *
 */
public interface ComplainService {
	
	/**
	 * 查询所有的投诉信息
	 * @param pageData
	 * @return
	 */
	public List<Complain> selectCanteenList(PageData pageData);
	
	/**
	 * 根据投诉时间查询
	 * @param tsTime
	 * @return
	 */
	public List<Complain> selectComplainList(String tsTime);
	
	/**
	 * 新增投诉信息
	 * @param canteen
	 * @return
	 */
	public int insertComplain(Complain complain);
	
	/**
	 * 删除投诉信息
	 * @param id
	 * @return
	 */
	public int deleteComplain(int id);

}
